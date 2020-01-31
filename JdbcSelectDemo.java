import java.sql.connection;
public class JdbcSelectDemo
{
public static void main(String [] args)
{
String dbURL="jdbc:mysql://localhost:3306/test";
String username="root";
String password="root";
try(Connection conn=DriveManager.getconnection(dbURL,username,password))
{
String sql="Select*FROM JDBC_TEST";
statement statement=conn.createStatement();
ResultSet result=statement.executeQuery(sql);
int count=0;
while(result.next())
{
Integer id=result.getInt(1);
String name=result.getString(2);
String street=result.getString(3);
String city=result.getString(4);
String zip=result.getString(5);
String output="User #%s: %s - %s - %s - %s - %s - %s";
system.out.println(String.format(output, ++count,id,name,street,city,state,zip));
}
}catch (SQLException ex){
ex.printStackTrace();
}
}