package com.bank.model;


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
import java.util.*;
import java.util.concurrent.Executor;

import org.postgresql.util.PGmoney;

import com.bank.dao.bdutil.ConnectionFactory;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;


//going to define User as my employee 
public class User
{
	
	public static  int ID;
	private static String name;
	private static String pass;
	private static double accountbalance;
	private static String pendingwithdrawl;
	private static  String pendingdeposit;
	
	
	
	//getters and setters for table values
	
	
	public User()
	{
		
	}
	
	public User(int ID, String name, String pass, double accountbalance, String pendingdeposit, String pendingwithdrawl)
	{
		super();
		this.ID = ID;
		this.name= name;
		this.accountbalance= accountbalance;
		this.pendingdeposit=pendingdeposit;
		this.pendingwithdrawl=pendingwithdrawl;
	}
		

	public static String getPendingwithdrawl() 
	{
		return pendingwithdrawl;
	}
	public void setPendingwithdrawl(String pendingwithdrawl) 
	{
		this.pendingwithdrawl = pendingwithdrawl;
	}
	public static String getPendingdeposit() 
	{
		return pendingdeposit;
	}
	public void setPendingdeposit(String pendingdeposit) 
	{
		
		this.pendingdeposit = pendingdeposit;
	}
	
	public void setAccountbalance(double accountbalance) 
	{
		this.accountbalance = accountbalance;
	}
	public static int getID() 
	{
		return ID;
	}
	public void setID( int ID) 
	{
		this.ID=ID;
	}
	public static String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public static String getPass()
	{
		return pass;
	}
	public void setPass(String pass)
	{
		this.pass=pass;
	}

	public static double getAccountbalance() 
	{
		
		return accountbalance;
	}

	public int getUserbyID(int ID) 
	{
		
		return ID;
	}

	



	
	}

	