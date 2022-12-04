import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;

public class HandlingDatevalues
{
	static Connection con = null;
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		con = JdbcUtil.getMysqlConnection();

		PreparedStatement pst = con.prepareStatement("INSERT INTO abcdbo.employees (name,gender,dob,doj,dom) values (?,?,?,?,?);");

		System.out.print("Enter name:");
		String name = sc.next();

		System.out.print("Enter gender (M/F): ");

		char g = sc.next().trim().toUpperCase().charAt(0);
		String gender = String.valueOf(g);

		System.out.print("Enter dob(dd-MM-yyyy) :");
		String dob = sc.next();
		java.sql.Date sDob = DateFormatter.formatDob(dob);

		System.out.print("Enter doj (MM-dd-yyyy):");
		String doj = sc.next();
		java.sql.Date sDoj = DateFormatter.formatDoj(doj);

		System.out.print("Enter dom (yyyy-MM-dd):");
		String dom = sc.next();

		java.sql.Date sDom = java.sql.Date.valueOf(dom);

		// Coverting DOB to DB format,  
		pst.setString(1,name);
		pst.setString(2,gender);
		pst.setDate(3,sDob);
		pst.setDate(4,sDoj);
		pst.setDate(5,sDom);

		int c = pst.executeUpdate();

		if (c == 0)
		{
			System.out.println("Row not inserted");
		}
		else
		{
			System.out.println("one row inserted");
		}
		
		System.out.println("```````````````````````````````````````````````````````````````````````");
		System.out.print("Do you want to display table details ?: (Y/N):: ");
		 String choice = sc.next().toLowerCase();

		 if (choice.equals("y"))
		 {
			JdbcUtil.displayTable();
		 }
		 else
		{
			System.out.println("Bye !!!!!");
		}

	}
}

interface DateFormatter
{
	// To format DOB
	public static java.sql.Date formatDob(String dob) throws ParseException
	{
		
		java.util.Date uDob = new SimpleDateFormat("dd-MM-yyyy").parse(dob);

		return getSqlDate(uDob);

	}
	
	// To format DOJ
	public static java.sql.Date formatDoj(String doj) throws ParseException
	{
		
		java.util.Date uDoj = new SimpleDateFormat("MM-dd-yyyy").parse(doj);

		return getSqlDate(uDoj);
	}

	
	// TO Convert util Date -- > to Sql Date
	public static java.sql.Date getSqlDate(java.util.Date uDate)
	{
		Long l = uDate.getTime();

		java.sql.Date sDate = new java.sql.Date(l);

		return sDate;
	}
}

interface JdbcUtil
{
	public static Connection getMysqlConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcdbo","root","Safvan@123");
		return con;
	}

	public static void displayTable() throws Exception
	{
		PreparedStatement pst = JdbcUtil.getMysqlConnection().prepareStatement("SELECT * FROM abcdbo.employees;");

		ResultSet rs = pst.executeQuery();

		SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yyyy");

		while(rs.next())
		{
			int eid = rs.getInt(1);
			String name = rs.getString(2);
			String gender = rs.getString(3);
			java.sql.Date dob = rs.getDate(4);
			java.sql.Date doj = rs.getDate(5);
			java.sql.Date dom = rs.getDate(6);

			String sdob = sdf.format(dob);
			String sdoj = sdf.format(doj);
			String sdom = sdf.format(dom);

			System.out.println("Employee Id :"+ eid);
			System.out.println("name :"+name+"     gender:"+gender);
			System.out.println("DOB is :"+sdob);
			System.out.println("DOJ is :"+sdoj);
			System.out.println("DOM is :"+sdom+"\n");
		}

	}
}