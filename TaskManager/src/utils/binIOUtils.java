package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.task.Task;

public class binIOUtils {
	
		
	public static void saveTaskData(Task b,String f1) throws FileNotFoundException, IOException
	{
		File filename= new File(f1);
		ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(filename));
		{
			out.writeObject(b);
		}
	}
	
	public static void saveTaskData(Map taskMap,String f2) throws FileNotFoundException, IOException
	{
		File filename= new File(f2);
		ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(filename));
		{
			out.writeObject(taskMap);
		}
	}
	
	public static HashMap<Integer,Task> restoreTaskData(String filename) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File f1= new File(filename);
		if(f1.isFile() && f1.canRead() && f1.exists())
		{
			try(ObjectInputStream in= new ObjectInputStream(new FileInputStream(filename)))
			{
				return (HashMap<Integer, Task>)in.readObject();
			}
		}
		return null;
		
	}
		
	
}
