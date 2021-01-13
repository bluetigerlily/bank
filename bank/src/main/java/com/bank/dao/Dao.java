package com.bank.dao;

import java.sql.Connection;
import com.bank.exception.BusinessException;
import java.sql.SQLException;
import java.util.List;



import com.bank.model.User;




public interface Dao

{

	public User CreateUser(String name) throws SQLException;
	User InsertAccountInformation(int ID) throws SQLException;
	User updatePendingWithdrawls(String pendingwithdrawl);
	User updatePendingDeposits(String pendingdeposit);
	User transferMoney(double accountbalance);
	User updateUserAccountInformation(int ID);
	User updatePassword(String pass);
	User deleteUser(int ID) throws SQLException;
	static User getUserbyID(int ID) throws SQLException{
		return null;
	}
	List<User> getUserByName(String name);
	User getUserByPassword(String pass);
	List<User> getAllUsers(String name); 
	List<User> extractUserFromResultSet() throws SQLException;
}
