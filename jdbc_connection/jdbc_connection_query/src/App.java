import java.sql.*;
public class App {
    public static void main(String[] args)throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanjit_tables","root","");
        PreparedStatement statement = con.prepareStatement("select * from yarn_java");
        ResultSet rs = statement.executeQuery();
        while (rs.next())
        {
            System.out.println("Sucess");
            // Use Column Name or Column Number in getXXXX Methods.
            System.out.println(rs.getString("id")+" "+rs.getString(2));
            System.out.println(rs.getString(1)+" "+rs.getString(2));
            
         }

        PreparedStatement statement2 = con.prepareStatement("insert into admins(email, pass, age, fullname) values ('sanjit@gmail.com','abc',21,'Sanjit Kumar') ");
        int no_of_updated_lines = statement2.executeUpdate();
        System.out.println("$$$ : "+ no_of_updated_lines);
    con.close();
}

}
