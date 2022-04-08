import java.sql.*;
import java.util.*;
class Prepared
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC95","IPC95");
			System.out.println("Connection Established");
			Scanner s=new Scanner(System.in);
			Statement st = con.createStatement();
			String sql="insert into std1 values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("enter your no ");
			int no=s.nextInt();
			ps.setInt(1,no);
			System.out.println("enter your name ");
			String s1=s.next();
			ps.setString(2,s1);
			System.out.println("enter your age ");
			int no1=s.nextInt();
			ps.setInt(3,no1);
			System.out.println("inserted...");
			int norows=ps.executeUpdate();



			
			
			
			/*String sql="select * from std1 where rno="+no;
			ResultSet rs=st.executeQuery(sql);
			boolean res=false;
			while(rs.next())
			{
				
				//if(no==rs.getInt(1))
				//{
					System.out.println("you r entered ");
					System.out.println("hello "+rs.getString(2));
					System.out.println("age is "+rs.getInt(3));
					res=true;	
				//	break;
				//}
			}
			if(res==false)
			{
				System.out.println("Invalid user ");
			}*/
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
