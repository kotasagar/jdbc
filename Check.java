import java.sql.*;
import java.util.*;
class Check
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC95","IPC95");
			System.out.println("Connection Established");
			Scanner s=new Scanner(System.in);			
			System.out.println("enter your no ");
			int no=s.nextInt();
			Statement st = con.createStatement();
			String sql="select * from std1";
			ResultSet rs=st.executeQuery(sql);
			boolean res=false;
			while(rs.next())
			{
				if(no==rs.getInt(1))
				{
					System.out.println("you r entered ");
					System.out.println("hello "+rs.getString(2));
					System.out.println("age is "+rs.getInt(3));
					res=true;	
					break;
				}
			}
			if(res==false)
			{
				System.out.println("Invalid user ");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
