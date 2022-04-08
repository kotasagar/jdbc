import java.sql.*;
class Ex4
{
	public static void main(String args[])
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC95","IPC95");
		System.out.println("Established");
		Statement set=con.createStatement();
		String sql="UPDATE Customers SET NAME = 'sravan',
WHERE  ROLNO= 1;";
		set.executeUpdate(sql);
		System.out.println("inserted records ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	

