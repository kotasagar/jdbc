import java.sql.*;
class Ex2
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
		String sql="create table std(name varchar(20),rolno int)";
		set.executeUpdate(sql);
		System.out.println("table created ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	

