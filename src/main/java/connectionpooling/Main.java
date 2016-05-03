package connectionpooling;

import java.util.*;   
import java.sql.*;   
  
public class Main   
{   
    public static void main (String[] args)   
    {       
        try    
        {   
            Class.forName("org.postgresql.Driver").newInstance();                            
        }   
        catch (Exception E)    
        {   
            System.err.println("Exception while loading driver");   
            E.printStackTrace();   
        }   
           
        try   
        {           
            ConnectionPool cp = new ConnectionPool("jdbc:postgresql://localhost:5432/fbtest",
                    "postgres", "");   
           
            Connection []connArr = new Connection[7];   
           
            for(int i=0; i<connArr.length;i++)   
            {   
                connArr[i] = cp.checkout();   
                System.out.println("Checking out..." + connArr[i]);   
                System.out.println("Available Connections ... " + cp.availableCount());   
            }                   
  
            for(int i=0; i<connArr.length;i++)   
            {   
                cp.checkin(connArr[i]);   
                System.out.println("Checked in..." + connArr[i]);   
                System.out.println("Available Connections ... " + cp.availableCount());   
            }   
        }   
        catch(SQLException sqle)   
        {   
            sqle.printStackTrace();   
        }   
        catch(Exception e)   
        {   
            e.printStackTrace();   
        }           
    }   
}  
