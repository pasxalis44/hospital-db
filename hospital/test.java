package project;
import java.util.ArrayList;
import java.util.Scanner;

import java.sql.*;


public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner met = new Scanner(System.in);
		
		String uName = "root";
		String pass = "password";
		int id=0;
		getdoctors(uName,pass);
		getcusttomers(uName,pass);
		getmedicine(uName,pass);
		 getdates(uName,pass);
		 selectdateDOC(uName,pass);
		 selectmedDOC(id);
		 getper(uName,pass);
		 selecthospital(uName,pass);
	}

		
	
	public static Connection getConnection(String uName, String pass) throws Exception{//logs in databas
		  try{
		   String driver = "com.mysql.jdbc.Driver";
		   String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";//localhost:3306/Peoples?autoReconnect=true&useSSL=false
		   String username = "root";
		   String password = "password";
		   Class.forName(driver);
		   
		   Connection conn = DriverManager.getConnection(url,username,password);
		   return conn;
		  } catch(Exception e){System.out.println(e);}
		  
		  
		  return null;
		 }
	
	  public static ArrayList<String> getcusttomers(String uName, String pass) throws Exception{//gets customer's info
	        try{
	         
	        String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";//localhost:3306/Peoples?autoReconnect=true&useSSL=false
	        String username = "root";
			String password = "password";
	        	
	        	
	            Connection con = getConnection(username,password);
	            PreparedStatement statement = con.prepareStatement("SELECT * FROM customers ORDER BY idcustomers ASC LIMIT 99");
	           
	            ResultSet result = statement.executeQuery();
	           
	            ArrayList<String> array = new ArrayList<String>();
	            while(result.next()){
	                System.out.print("customer's name :");
	                System.out.println(result.getString("customersName"));
	                System.out.print("customer's Phone ");
	                System.out.println(result.getString("customersPhone"));
	               
	                array.add(result.getString("idcustomers"));
	            }
	            System.out.println("end");
	            return array;
	           
	        }catch(Exception e){System.out.println(e);}
	        return null;
	       
	    }
	  
	  public static void insert() throws Exception{//insert
			
			Scanner met = new Scanner(System.in);
			System.out.println("Enter name:");
			String Name = met.nextLine();
			System.out.println("Enter phone:");
			String phone = met.nextLine();
			String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";//localhost:3306/Peoples?autoReconnect=true&useSSL=false
	        String username = "root";
			String password = "password";
	        	
	        	
	            Connection con = getConnection(username,password);
			
			//INSERT INTO `project`.`customers` (`idcustomers`, `customersPhone`, `customersName`) VALUES ('4', '123123', 'asd');
						PreparedStatement posted = con.prepareStatement("INSERT INTO `project`.`customers` (customersPhone ,customersName) VALUES ('"+phone+"','"+Name+"')");
						
						posted.executeUpdate();
			
				System.out.println("Insert  Completed");
				
			
	  }
	  public static ArrayList<String> getdoctors(String uName, String pass) throws Exception{//gets doctorr's info
	        try{
	         
	        String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";//localhost:3306/Peoples?autoReconnect=true&useSSL=false
	        String username = "root";
			   String password = "password";
	        	
	            Connection con = getConnection(username,password);
	            PreparedStatement statement = con.prepareStatement("SELECT * FROM doc ORDER BY idDoc ASC LIMIT 99");
	           
	            ResultSet result = statement.executeQuery();
	           
	            ArrayList<String> array = new ArrayList<String>();
	            while(result.next()){
	                System.out.print("doctor's name : ");
	                System.out.println(result.getString("DocName"));
	                System.out.print(" doctor's title :");
	                System.out.println(result.getString("DocTitle"));
	                System.out.print("doctor's phonenumber :");
	                System.out.println(result.getString("DocPhone"));
	                System.out.print(" ");
	                
	                array.add(result.getString("idDoc"));
	            }
	            System.out.println("end");
	            return array;
	           
	        }catch(Exception e){System.out.println(e);}
	        return null;
	       
	    }
	  public static ArrayList<String> getmedicine(String uName, String pass) throws Exception{//gets med's info
	        try{
	         
	        String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";//localhost:3306/Peoples?autoReconnect=true&useSSL=false
	        String username = "root";
			   String password = "password";
	        	
	        	
	            Connection con = getConnection(username,password);
	            PreparedStatement statement = con.prepareStatement("SELECT * FROM medicine ORDER BY idmedicine ASC LIMIT 99");
	           
	            ResultSet result = statement.executeQuery();
	           
	            ArrayList<String> array = new ArrayList<String>();
	            while(result.next()){
	                System.out.print("medicine's name : ");
	                System.out.println(result.getString("name"));
	                System.out.print("medicine's price : ");
	                System.out.println(result.getString("price"));
	                System.out.print(" ");
	          
	                
	                array.add(result.getString("idmedicine"));
	            }
	            System.out.println("end");
	            return array;
	           
	        }catch(Exception e){System.out.println(e);}
	        return null;
	       
	    }
	  public static ArrayList<String> getdates(String uName, String pass) throws Exception{//gets customer's info
	        try{
	         
	        String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";//localhost:3306/Peoples?autoReconnect=true&useSSL=false
	        String username = "root";
			   String password = "password";
	        	
	        	
	            Connection con = getConnection(username,password);
	            PreparedStatement statement = con.prepareStatement("SELECT * FROM dates ORDER BY idDates ASC LIMIT 99");
	           
	            ResultSet result = statement.executeQuery();
	           
	            ArrayList<String> array = new ArrayList<String>();
	            while(result.next()){
	            	
	            	System.out.print("doctors' id : ");
	                System.out.println( result.getString("idDoc"));
	            	System.out.print("costumers' id : ");
	                System.out.println(result.getString("idcustomers"));
	            	System.out.print("date:");
	                System.out.println(result.getString("date"));
	                
	                
	                array.add(result.getString("idDates"));
	            }
	            System.out.println("end");
	            return array;
	           
	        }catch(Exception e){System.out.println(e);}
	        return null;
	  }

	  public static ArrayList<String> selectdateDOC(String uName, String pass) throws Exception{//allow you to select an id code for a date
	        try{
	         
	        String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";//localhost:3306/Peoples?autoReconnect=true&useSSL=false
	        String username = "root";
			   String password = "password";
	        	
	        	
	  Connection con = getConnection(username,password);
	  Scanner met = new Scanner(System.in);
		System.out.println("Enter desired id:");
		int num= met.nextInt();	
		
	  PreparedStatement statement = con.prepareStatement("SELECT * FROM project.dates WHERE dates.idDoc=?");
	  statement.setInt(1,num);
	  ResultSet result = statement.executeQuery();
	  ArrayList<String> array = new ArrayList<String>();
	  while(result.next()){
		  System.out.print("doctors' id : ");
          System.out.println( result.getString("idDoc"));
      	System.out.print("costumers' id : ");
          System.out.println(result.getString("idcustomers"));
      	System.out.print("date:");
          System.out.println(result.getString("date"));
	  array.add(result.getString("idDates"));
	  }
	  System.out.println("Completed");
	  return array;
	 
	  } catch (Exception e) {System.out.println(e);}
	        return null;
			
			
		
		
	       }
	  
	  
	  public static ArrayList<String> selectmedDOC(int id) throws Exception{//allow you to select an id code for a medicine
	        try{
	         
	        String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";//localhost:3306/Peoples?autoReconnect=true&useSSL=false
	        String username = "root";
			   String password = "password";
	        	
	        	
	  Connection con = getConnection(username,password);
		int idmed = id;
		
	  PreparedStatement statement = con.prepareStatement("SELECT * FROM project.cmedicine WHERE cmedicine.idCust=?");
	  statement.setInt(1,idmed);
	  ResultSet result = statement.executeQuery();
	  ArrayList<String> array = new ArrayList<String>();
	  while(result.next()){
		  System.out.print("customer's id : ");
        System.out.println( result.getString("idCust"));
    	System.out.print("medicine's id : ");
        System.out.println(result.getString("idMed"));
	  array.add(result.getString("idcmedicine"));
	  }
	  System.out.println("Completed");
	  return array;
	 
	  } catch (Exception e) {System.out.println(e);}
	        return null;
			
			
		
		
	       }
	  public static void getper(String uName, String pass) throws Exception{//insert
			
			Scanner met = new Scanner(System.in);
			System.out.println("Enter customer's id");
			int idcust= met.nextInt();	
			System.out.println("Enter medicine's id:");
			int idmed= met.nextInt();	
			
			try {
				Connection con = getConnection(uName,pass);//INSERT INTO `project`.`customers` (`idcustomers`, `customersPhone`, `customersName`) VALUES ('4', '123123', 'asd');
						PreparedStatement posted = con.prepareStatement("INSERT INTO `project`.`cmedicine` ( `idCust`, `idMed`) VALUES ('"+idcust+"', '"+idmed+"');");
						
						posted.executeUpdate();
			} catch (Exception e) {System.out.println(e);}
			finally {
				System.out.println("Insert  Completed");
				
			}
	  }	
	  public static ArrayList<String> selecthospital(String uName, String pass) throws Exception{//allow you to select an id code for a medicine
	        try{
	         
	        String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";//localhost:3306/Peoples?autoReconnect=true&useSSL=false
	        String username = "root";
			   String password = "password";
	        	
	        	
	  Connection con = getConnection(username,password);
	  Scanner met = new Scanner(System.in);
		System.out.println("Enter desired day:");
		String day= met.nextLine();	
		
	  PreparedStatement statement = con.prepareStatement("SELECT * FROM project.onduty WHERE onduty.day=?");
	  statement.setString(1,day);
	  ResultSet result = statement.executeQuery();
	  ArrayList<String> array = new ArrayList<String>();
	  while(result.next()){
		  System.out.print("Day: ");
      System.out.println( result.getString("day"));
  	System.out.print("Hospital:");
      System.out.println(result.getString("hospital"));
	  array.add(result.getString("idonduty"));
	  }
	  System.out.println("Completed");
	  return array;
	 
	  } catch (Exception e) {System.out.println(e);}
	        return null;
	     }  
	  
	  
	  
	 
}
