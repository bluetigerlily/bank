package com.bank.dao.impl;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Wrapper;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.Driver;
import java.util.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;

import com.bank.dao.Dao;
import com.bank.dao.bdutil.ConnectionFactory;
import com.bank.model.User;

public class daoimplement implements Dao 
{

	
	public List<User> getUserbyID()
	{
		User user = null;
		System.out.println("In DAO within getUserbyID() with id ="+ ID);
		try (Connection connection = ConnectionFactory.get_connection())
		{
			String sql= "select ID,name,pass,accountbalance,pendingwithdrawl,pendingdeposit from our banking database where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, ID);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println("Query Executed");
			if (resultSet.next())
			{
				System.out.println("If in DAO");
				user = new User<?, ?, ?, ?, ?, ?>;
				user.setID(resultSet.getInt("ID"));
				user.setName(resultSet.getString("name"));
				user.setPass(resultSet.getString("Pass"));
				 user.setAccountbalance(resultSet.getDouble("accountbalance"));
				user.setPendingdeposit(resultSet.getString("pendingdeposit"));
				user.setPendingwithdrawl(resultSet.getString("pendingwithdrawl"));
				
			}
			else
			{
				System.out.println("else in dao");
				throw new RuntimeException("No player found with Id "+ID);
			}
			
			}
		catch (ClassNotFoundException | SQLException ex)
			{
			System.out.println("exception in DAO");
			System.out.println(ex);
			throw new RuntimeException("Internal error occured contact SYSADMIN");
			}
		return ID;
	}
	

	@Override
	public List<User> getAllUsers()
	{
		List<User>allUsersList =null;
		allUsersList =userSearchDAO.getAllUsers();
		return allUsersList;
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
	public User InsertAccountInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updatePendingWithdrawls() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updatePendingDeposits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User transferMoney() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserAccountInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updatePassword() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<User> getUserByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByPassword() 
	{
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User userSearchDao() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User deleteUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
