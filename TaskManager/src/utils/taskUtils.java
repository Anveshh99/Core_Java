package utils;

import java.util.HashMap;
import java.util.Map;
import static validation.validateRules.validateDate;

import com.task.Task;

import exception.TaskHandlingException;

public class taskUtils {
	
	public static Map<Integer,Task> populatedTaskList() throws TaskHandlingException
	{
		
		Map<Integer,Task> list= new HashMap<Integer, Task>();
	
		
        Task task1=new Task("anvesh", "Sleeping", validateDate("2022-11-25"));
		list.put(task1.getTaskId(), task1);
		
		Task task2=new Task("rutvik", "washing Cloth", validateDate("2022-11-23"));
		list.put(task2.getTaskId(), task2);
		
		Task task3=new Task("tejas", "Gyming", validateDate("2022-11-15"));
		list.put(task3.getTaskId(), task3);
		
		Task task4=new Task("aman", "Cleaning", validateDate("2022-11-19"));
		list.put(task4.getTaskId(), task4);
		
		Task task5=new Task("piyush", "Talking", validateDate("2022-11-21"));
		list.put(task5.getTaskId(), task5);
		
		return list;
		
	}

}
