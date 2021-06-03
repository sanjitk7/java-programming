import java.io.*;
  
class CricketPlayerInfo implements java.io.Serializable
{
    public int age;
    public String name;
    public int total_runs;
    public int total_wickets;
  
    public CricketPlayerInfo(int age, String name,int total_runs,int total_wickets)
    {
        this.age = age;
        this.name = name;
        this.total_runs = total_runs;
        this.total_wickets = total_wickets;
    }
  
}
  
class serial_deserial
{
    public static void main(String[] args)
    {   


        CricketPlayerInfo vk = new CricketPlayerInfo(24, "Virat Kohli", 20000,24);
        String filename = "file.ser";
          
        // Serialization 
        try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            // Method for serialization of object
            out.writeObject(vk);
              
            out.close();
            file.close();
              
            System.out.println("Object has been serialized");
  
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
  
  
        CricketPlayerInfo object1 = null;
  
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            object1 = (CricketPlayerInfo)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            System.out.println("Age = " + object1.age);
            System.out.println("Name = " + object1.name);
            System.out.println("Total Runs = " + object1.total_runs);
            System.out.println("Total Wickets = " + object1.total_wickets);
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
  
    }
}