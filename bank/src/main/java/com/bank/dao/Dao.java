package com.bank.dao;

import java.sql.Connection;
import java.util.List;

import com.bank.model.User;




public interface Dao

{

	private static final Dao userSearchDAO = null;
	User userSearchDao();
	User InsertUser();
	User InsertAccountInformation();
	User updatePendingWithdrawls();
	User updatePendingDeposits();
	User transferMoney();
	User updateUserAccountInformation();
	User updatePassword();
	User deleteUser();
	List<User> getUserbyID();
	List<User> getUserByName();
	List<User> getUserByPassword();
	List<User> getAllUsers(); 
	List<User> extractUserFromResultSet();
}
