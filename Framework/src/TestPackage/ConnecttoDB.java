package TestPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnecttoDB {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WeekendBatchTraining", "root", "root");
		Statement s = con.createStatement();
		ResultSet outputresult = s.executeQuery("select * from studentsinformation where FirstName='student4'");
		outputresult.next();
		System.out.println(outputresult.getString("idnum"));
		System.out.println(outputresult.getString("Email"));

	}

}
