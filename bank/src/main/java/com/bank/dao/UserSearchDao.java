package com.bank.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Wrapper;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.postgresql.Driver;
import java.util.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;


public interface UserSearchDao 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to UserSearch App V1.0");
		System.out.println("================================");
		int ch = 0;
		UserSearchDao userSearchDao = new UserSearchDaoImp1();
		System.out.println("1)By Id");
		System.out.println("2)By User Name");
		System.out.println("3) Show all Users");
		System.out.println("Please enter an appropriate choice between 1-3");
		try
		{
			ch = Integer.parseInt(sc.nextLine());
		}
		catch (NumberFormatException e)
		{
			switch(ch) {
			case 1:
				System.out.
			}
		}
	}
}
