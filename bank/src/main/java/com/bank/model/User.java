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
	

	public User(int iD, String name, String pass, double accountbalance, String pendingdeposit,
			String pendingwithdrawl) {
	}

	public void main(String[]args)
	{	
	
	Statement statement =null;
	
	try
	{
	ConnectionFactory obj_ConnectionFactory=new ConnectionFactory();
	System.out.println(obj_ConnectionFactory.get_connection());
	
	Connection connection=obj_ConnectionFactory.get_connection();}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	}	
	
	private static Integer ID;
	private static String name;
	private static String pass;
	static double accountbalance;
	private static String pendingwithdrawl;
	private static String pendingdeposit;
	 
	
	//getters and setters for table values
	
	public User (String name, String pass, double accountbalance, String pendingwithdrawl, String pendingdeposit)
	{
		this.name=name;
		this.pass=pass;
		this.accountbalance=accountbalance;
		this.pendingwithdrawl=pendingwithdrawl;
		this.pendingdeposit=pendingdeposit;
	}
	public User (Integer ID, String name, String pass, double accountbalance, String pendingwithdrawl, String pendingdeposit)
	{
		this.name =name;
		this.pass= pass;
		this.accountbalance=accountbalance;
		this.pendingwithdrawl=pendingwithdrawl;
		this.pendingdeposit = pendingdeposit;
		this.ID=ID;
	}
	public User (String name, String pass, String pendingwithdrawl, String pendingdeposit, Integer ID, Integer accountbalance)
	{
		this.name=name;
		this.pendingwithdrawl=pendingwithdrawl;
		this.pass = pass;
		this.pendingdeposit=pendingdeposit;
		this.ID=ID;
	}

	public String getPendingwithdrawl() 
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
	public static double getAccountbalance() 
	{
		return accountbalance;
	}
	public void setAccountbalance(double accountbalance) 
	{
		this.accountbalance = accountbalance;
	}
	public static Integer getID() 
	{
		return ID;
	}
	public void setID(int ID) 
	{
		this.ID = ID;
	}
	public static String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getPass()
	{
		return pass;
	}
	public void setPass(String pass)
	{
		this.pass=pass;
	}
	
	
	}

	