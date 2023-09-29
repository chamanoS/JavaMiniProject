//package javaProject;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import Helper.DBHandler;
//
//public class Main {
//	static private DBHandler dbHandler;
//	static private Connection connection;
//	static private PreparedStatement preparedStatement;
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		dbHandler = new DBHandler();
//		connection = dbHandler.getDbConnection();
//		System.out.println("Connected With the database successfully");
//		
//		WriteToDB();
////		readFromDB();
//		
//	}
//	
//	public static void WriteToDB() throws SQLException {
//		String insert = "INSERT INTO users(firstName,username,email,password)"
//				+ "VALUES(?,?,?,?)";
//		preparedStatement = (PreparedStatement) connection.prepareStatement(insert);
//		
//		preparedStatement.setString(1, "Cham");
//		preparedStatement.setString(2, "Evritim");
//		preparedStatement.setString(3, "cham@yahoo");
//		preparedStatement.setString(4, "Shepatim");
//		
//		preparedStatement.executeUpdate();
//        System.out.println("data inserted successfully");
//	}
//	
////	public static void readFromDB()throws SQLException{
////		String query = "SELECT * From users";
////		preparedStatement = (PreparedStatement) connection.prepareStatement(query);
////		
////		ResultSet resultSet = preparedStatement.executeQuery();
////		
////		while(resultSet.next()) {
////			System.out.print("Names:" + resultSet.getString("firstName") + " ");
////		}
////	}
//
//}
