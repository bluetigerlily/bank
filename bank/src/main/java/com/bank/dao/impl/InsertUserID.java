package com.bank.dao.impl;

import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.sql.Wrapper;

import org.postgresql.Driver;

import com.bank.dao.Dao;
import com.bank.dao.bdutil.ConnectionFactory;
import com.bank.model.User;

import java.util.*;
import java.util.concurrent.Executor;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;

public class InsertUserID implements Dao
{

	
	public static void main(String[]args)
	{
	Connection connection = null;	
	
	String createuserid= null;
	
	ConnectionFactory obj_ConnectionFactory=new ConnectionFactory();
	System.out.println(obj_ConnectionFactory.get_connection());
	
	connection=obj_ConnectionFactory.get_connection();
		
	String newid;
	
	Scanner in= new Scanner (System.in);  //scanner of new ID of customer
	System.out.println("Enter the ID of the new User");  //printing to enter the ID of the customer
	newid = in.nextLine(); //setting the scanner input to the string named newid
	
	createuserid = "INSERT ID from 'Account Information' (LAST, '{'+newid+'}')";
	
	
	try
	{
		
		
		
		
		Statement statement = connection.createStatement();
		
		
		
		ResultSet rs = statement.executeQuery("SELECT * FROM table 'Account Information' from 'ID' ORDER BY ID DESC LIMIT 1+'{newid}'+");
		
	}	
			
	catch (SQLException ex)
	{
		ex.printStackTrace();
		 
	
	}
	System.out.println("Connection is good ");
	System.out.println("New ID has been inputted in the Account Information Table ");

	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUserNameAndPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User extractUserFromResultSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User InsertUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}
}

