import java.sql.*;
class Ex1
{
	public static void main(String args[])
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC95","IPC95");
		System.out.println("Established");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	

