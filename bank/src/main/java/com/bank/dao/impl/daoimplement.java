package com.bank.dao.impl;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Wrapper;
import org.postgresql.Driver;
import org.postgresql.jdbc.PgResultSet;
import org.apache.log4j.Logger;
import java.util.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import com.bank.dao.Dao;
import com.bank.dao.bdutil.ConnectionFactory;
import com.bank.exception.BusinessException;
import com.bank.model.User;
import java.lang.*;





public class daoimplement implements Dao 
{
	Logger log = Logger.getLogger(daoimplement.class);

			//making new instance of the 
public User user = new User();
	
	public User getUserbyID(int ID) throws SQLException
	{
		User user = null;
		System.out.println("In DAO within getUserbyID() with id =");
		try (Connection connection = ConnectionFactory.get_connection())
		{
			String  sqt ="SELECT * From bankingschema.'Account Information' WHERE ID =? ";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sqt);
			preparedStatement.setInt(1, ID);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println("Query Executed");
			if (resultSet.next())
			{
				System.out.println("If in DAO");
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
		catch (SQLException ex)
			{
			System.out.println("exception in DAO");
			System.out.println(ex);
			throw new RuntimeException("Internal error occured contact SYSADMIN");
			}
		return user;
	}
	
	public List<User> extractUserFromResultSet() throws SQLException
	{
		
		//System.out.println("Here is your User that was extracted from the Resultset");
		
		return null;
		
		
	}

	public User CreateUser(String name) throws SQLException
	{
	int user = 0;
	try (Connection connection = ConnectionFactory.get_connection())
	{
		
		String sqb = "INSERT INTO bankingschema.'Account Information'\r\n"
	+"(ID, name, accountbalance, pendingdeposit, pendingwithdrawl, pass) \r\n"
				+"VALUES();";
		
		PreparedStatement preparedStatement =connection.prepareStatement(sqb);
		preparedStatement.setInt(1,User.getID());
		preparedStatement.setString(2,User.getName());
		preparedStatement.setDouble(3, User.getAccountbalance());
		preparedStatement.setString(4, User.getPendingdeposit());
		preparedStatement.setString(5, User.getPendingwithdrawl());
		preparedStatement.setString(6, User.getPass());
		
		user = preparedStatement.executeUpdate();
		
		System.out.println("New Account Information Created ");
		return null;
	} catch (SQLException e) 
	{
		System.out.println(e.getMessage());
		throw new SQLException("Internal Error Occured. Contact the System Admin");
	}

	}
	public User InsertAccountInformation(int ID)
	{
		User user = new User();
		String  sqt ="SELECT * From bankingschema.'Account Information' WHERE name =? ";
		String  sqz ="INSERT INTO ID * From bankingschema.'Account Information'";
		
		try (Connection connection = ConnectionFactory.get_connection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement(sqt);
			PreparedStatement preparedStatement1 = connection.prepareStatement(sqz);
			ResultSet rs = preparedStatement.executeQuery();
			ResultSet rr = preparedStatement.executeQuery();
			
			 System.out.println("Account Information has been inserted as request have a wonderful day");
			 
			
			
		} catch (SQLException ex) 
		{
			
			
		}
		return user;
		
		
		
	}

	@Override
	public User updatePendingWithdrawls(String pendingwithdrawl) 
	{
		
		System.out.println("You're now pending a Withdrawl from your account.  Please allow time for an Employee to approve the Transaction.");
		
		System.out.println("You're no longer pending a Withdrawl from your account.  This could mean it was either approved or denied please check your account balance and speak with an Employee for customer assistance");

		return null;
	}

	@Override
	public User updatePendingDeposits(String pendingdeposit) 
	
	{

System.out.println("You're now pending a Deposit towards your account.  Please allow time for an Employee to approve the Transaction.");
		
System.out.println("You're no longer pending a Deposit towards your account.  This could mean it was either approved or denied please check your account balance and speak with an Employee for customer assistance");
		
		return null;
	}

@Override
public User transferMoney(double accountbalance) 
{
	
	System.out.println("Money transfer has been completed");
		//return null;
	return user;
}

	@Override
	public User updateUserAccountInformation(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updatePassword(String pass) 
	{
		// TODO Auto-generated method stub
		return null;
	}



	public List<User> getUserByName(String name)
	{
		
		List<User> userList = new ArrayList<>();
		try (Connection connection = ConnectionFactory.get_connection())
		{
		//making the statement string	
		
			String sqp = "SELECT name, accountbalance, pendingdeposit, pendingwithdrawl FROM bankingschema.'Account Information' WHERE name != ?";
			PreparedStatement preparedStatement =connection.prepareStatement(sqp);
			preparedStatement.setString(1,name);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next())
	{
			User user = new User();
			user.setName(rs.getString("name"));
			user.setAccountbalance(rs.getDouble("accountbalance"));
			user.setPendingdeposit(rs.getString("pendingdeposit"));
			user.setPendingwithdrawl(rs.getString("Pendingwithdrawl"));
			userList.add(user);
	if (userList.size()==0) 
	{
		return null;
	}
	else 
	
		return userList;
	}
		}
	catch (SQLException ex) 
	{	
		System.out.println(ex.getMessage());
	}		return userList;
	
	
		}
	
	public User deleteUser(int ID) throws SQLException
	{
	String sqa = "DELETE ID FROM bankingschema.'Account Information' WHERE ID = ?";
	String sqo = "DELETE accountbalance FROM bankingschema.'Account Information' WHERE accountbalance = ?";
	String sqt = "DELETE name FROM bankingschema.'Account Information' WHERE name = ?";
	String sqv = "DELETE pendingwithdrawl FROM bankingschema.'Account Information' WHERE pendingdeposit = ?";
	String sqw = "DELETE pendingdeposit FROM bankingschema.'Account Information' WHERE pendingdeposit = ?";
	String sqy = "DELETE pass FROM bankingschema.'Account Information' WHERE pass = ?";
	
	
	
	
	
		try (Connection connection = ConnectionFactory.get_connection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement(sqa);
			PreparedStatement preparedStatement1 = connection.prepareStatement(sqo);
			PreparedStatement preparedStatement2 = connection.prepareStatement(sqt);
			PreparedStatement preparedStatement3 = connection.prepareStatement(sqv);
			PreparedStatement preparedStatement4= connection.prepareStatement(sqw);
			PreparedStatement preparedStatement5 = connection.prepareStatement(sqy);
			
			//running all these to delete every field of the entirity of the customers data
			int deleteID = preparedStatement.executeUpdate();
			int deleteAccountbalance = preparedStatement1.executeUpdate();
			int deleteName = preparedStatement2.executeUpdate();
			int deletePendingwithdrawl =preparedStatement3.executeUpdate();
			int deletePendingdeposit =preparedStatement4.executeUpdate();
			int deletePass = preparedStatement5.executeUpdate();
			
			System.out.println("The User profile has been deleted from our system have a wonderful day.");
			
		} catch (SQLException e) 
		{
			System.out.println(e.getMessage());
			throw new SQLException("Internal Error Occured. Contact the System Admin");
		}
		
		return null;
	}
	@Override
	public User getUserByPassword(String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers(String name) {
		// TODO Auto-generated method stub
		return null;
	}




}
