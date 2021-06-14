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
            System.out.println(rs.getString(1)+" "+rs.getString(2));
            
         }
    con.close();
}

}
