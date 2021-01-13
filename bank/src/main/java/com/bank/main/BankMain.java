package com.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bank.dao.Dao;
import com.bank.dao.impl.daoimplement;
import com.bank.model.User;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Wrapper;
import org.postgresql.Driver;
import org.postgresql.jdbc.PgResultSet;
import com.bank.*;


public class BankMain {
	
	
	//logging method
	
	private static Logger Log = Logger.getLogger(BankMain.class);
	
	
	//importing scanner method
	
	private static Scanner sc = new Scanner(System.in);
	
	
	//making a new instance of my daoimplementation layer of code
	private static Dao daoimplement =new daoimplement();
	
	//making an instance of the user class
	User user1 = new User();
	
	
	
	public static void main(String[]args) throws SQLException
	{
		Log.info("Welcome to Banking Interface Dao App V1.0");
		Log.info("===========================================");
		
		//setting base channel to 0 at start and starting a do while loop for switch cases

		int ch = 0;
		
		do {
			
		Log.info("Thank you for Choosing our Revature Banking App Below are your options:");
		Log.info("1)To Create a new User");
		Log.info("2) To Insert Account Information");
		Log.info("3) Update Pending Withdraws");
		Log.info("4) Update Pending Deposits");
		Log.info("5) Transfer Money to another Users Account");
		Log.info("6) Update User's Account Information");
		Log.info("7) Update Password");
		Log.info("8) Update Delete User");
		Log.info("9) Locate a User based on their ID number");
		Log.info("10) Locate a User based on their Name");
		Log.info("11) Locate a User based on their Password");
		Log.info("12) Return a list of all Users");
		Log.info("13) Extract Specific Information from User List");
		Log.info("14) Exit Dao Interface");
		System.out.println("Please enter an appropriate choice between 1-14");
		try
		{
			ch = Integer.parseInt(sc.nextLine());
		}
		catch (SQLException ex)
		{
		//making my switch cases hopefully i can finish them in time :'(
		}
		switch (ch)
		{
		case 1:
				//CreateUser()l
			 Log.info("This functionality temporarilily under construction");
			
			break;
	
		case 2:
			Log.info("This functionality temporarilily under construction");
			//User InsertAccountInformation(int ID);
			break;
		
		case 3:
			Log.info("This functionality temporarilily under construction");
			//User User updatePendingWithdrawls(String pendingwithdrawl);
			break;
			
		case 4:
			Log.info("This functionality temporarilily under construction");
			//User updatePendingDeposits(String pendingdeposit);
				break;
				
		case 5:
			Log.info("This functionality temporarilily under construction");
			//User transferMoney(double accountbalance);
			break;
			
		case 6:
			Log.info("This functionality temporarilily under construction");
			//User updateUserAccountInformation(int ID);
			break;
			
		case 7:
			Log.info("This functionality temporarilily under construction");
			//User updatePassword(String pass);
			break;
			
		case 8:
			Log.info("This functionality temporarilily under construction");
			//User deleteUser() throws SQLException;
			break;
		
			
		case 9:
			
	
			if (ch == 9)
			{
			//getUserbyID functionality 
		Log.info("Enter User ID to get Account Information...");
		try {
			int ID = Integer.parseInt(sc.nextLine());
			
			User user = Dao.getUserbyID(ID);
					if (user !=null)
					{
						Log.info("User found with id: "+ ID + "details of the user is: ");
						Log.info(user);

					}
					
					else Log.info("User not found with the entered ID please relaunch the application and try again");
					break;
		}
					catch (SQLException ex)
					{
						Log.info("You've encountered an Error please contact a System Admin");
					}
					
					break;
					}
			
			
			
			
			
		case 10:
			
			Log.info("This functionality temporarilily under construction");
			break;
			
		case 11:
			
			Log.info("This functionality temporarilily under construction");
			//User getUserByPassword();
			break;
			
		case 12:
			Log.info("This functionality temporarilily under construction");
			//List<User> getAllUsers(); 
			break;
			
		case 13:
			Log.info("This functionality temporarilily under construction");
			//List<User> extractUserFromResultSet();
			break;
			
		case 14:
			Log.info("Thank you for choosing Revature banking app have a wonderful day");
			//code to exit application and end do while loop
			break;
	}	
	while (ch != 14) 
	{
	}
			

	//method to create a new user account implemented through scanner inputs
	public static void CreateUser(Object ID) throws SQLException
	{
		User user = new User();
		Scanner sc = new Scanner(System.in);
		
		//going to log the new info using the log.info commands
		
		Log.info("Thank you for choosing to create a new user please fill in the info below");
		Log.info("Please enter an account ID that is unique to you if it is not unique you'll be asked to start over and choose again");
		user.setID.Integer.parseInt(sc.nextLine());
		Log.info("");
		Log.info("Please enter your First and last Name");
		user.setName(sc.nextLine());
		Log.info("");
		Log.info("Please enter a Pass for your account");
		user.setPass(sc.nextLine());
		Log.info("");
		Log.info("Please enter pending if you would like to deposit money into your account and an associate will contact you shortly");
		user.setPendingdeposit(sc.nextLine());
		Log.info("");
		Log.info("Please type in the world notpending so we can keep everything in our system straight");
		user.setPendingwithdrawl(sc.nextLine());
		Log.info("");
		Log.info("Thank you for creating your account and choosing Revature Bank Have a Wonderful Day.");
		
	}


	private static Object getrandomInteger(int i, int j) {
	i=100;
	j=9999;
		
		// gonna hide this bandaid here i ran out of time and ideas.. i know this is bad and not advised but
		//i ran out of time
		return null;
	}
	}
		
		
		
		
		

		
		
		
		

	
	
	
	