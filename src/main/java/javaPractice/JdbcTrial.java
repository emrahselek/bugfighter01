package main.java.javaPractice;
import java.sql.*;
public class JdbcTrial {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        String url ="jdbc:oracle:thin:@localhost:1521/ORCLCDB.localdomain";
        String username= "hozkaya";
        String password = "12345";

        //register the driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //establish the connection
        Connection con = DriverManager.getConnection(url,username,password );

        //create the statement
        Statement st = con.createStatement();



//		 Print all records
        String allTeamMembers = "SELECT * FROM team01 ";

        ResultSet rs = st.executeQuery(allTeamMembers);


        while(rs.next()) {
            System.out.println(rs.getString("name")+"-"+rs.getInt("age")+
                    "-"+rs.getString("city")+"-"+rs.getString("living_country")+"-"+rs.getInt("salary"));
        }
    }
}
