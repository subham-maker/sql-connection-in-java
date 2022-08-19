import java.util.*;
import java.sql.*;
public class data
{
    public static void main(String[] args)throws Exception {
        Scanner i=new Scanner(System.in);
        
        try{
     Class.forName("com.mysql.jdbc.Driver");
     System.out.println("#######################");
     System.out.println("DATA IS LOADED...");
     System.out.println("#######################");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");



String name=i.next();
String email=i.next();
String password=i.next();
String number=i.next();

Statement sc=con.createStatement();
String s="INSERT INTO `root`(`NAME`, `Email`, `Password`, `Number`) VALUES ('manmohan','man123@gmail.com','25432dsdwdc','9885744665')";
PreparedStatement st=con.prepareStatement(s);
System.out.println("data inserted in root DB------>>>>>>>>>>>--->>>>>->>>>>>>>");
st.execute();



ResultSet rs= sc.executeQuery("Select *from root");

   while(rs.next())
   {
    name=rs.getString("NAME");
    System.out.println("NAME:"+name);
    email=rs.getString("Email");
    System.out.println("EMAIL:"+email);
  password=rs.getString("Password");
    System.out.println("Password:"+password);
     number=rs.getString("Number");
    System.out.println("NUMBER:"+number);




    
System.out.println("------------------------------");


   }
   con.close();
}

        catch(Exception e){
            System.out.println(e);
        }
    } 

    
}