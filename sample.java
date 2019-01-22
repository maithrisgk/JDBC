import java.sql.*;
import java.io.*;
public class sample
{
public static void main(String args[])
{
String connectionurl="jdbc:odbc:stud";
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection(connectionurl);
Statement st=con.createStatement();
ResultSet rs;
DataInputStream din=new DataInputStream(System.in);
System.out.println("1.select");
System.out.println("2.insert");
System.out.println("3.delete");
System.out.println("4.update");
String line=din.readLine();
int choice=Integer.parseInt(line);
switch(choice)
{
case 1:
{
System.out.println("output will be.....");
rs=st.executeQuery("select * from stud");
while(rs.next())
{
String s=rs.getString("name");
int n=rs.getInt("id1");
System.out.println(s+" "+n);
}}
break;
case 2:
{
String s="insert into stud values (1,'swathi')";
System.out.println(s);
st.executeUpdate(s);
System.out.println("inserted");
rs=st.executeQuery("select * from stud");
}
break;
case 3:
{
int c = st.executeUpdate("delete from stud where name = 'swathi'");
System.out.println(c);
if(c==1)
  System.out.println("deleted");
}
break;
case 4:
{
st.executeUpdate("update stud set name= 'swathika' where id1= 1");
System.out.println("updated");
}}}
catch(SQLException e)
{
System.out.println(e);
}
catch(Exception e)
{
System.out.println(e);
}}}


