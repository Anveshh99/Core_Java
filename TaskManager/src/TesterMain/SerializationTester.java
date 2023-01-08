package TesterMain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import static validation.validateRules.validateDate;
import static utils.binIOUtils.saveTaskData;
import static utils.binIOUtils.restoreTaskData;
import static utils.taskUtils.populatedTaskList;


import com.task.Task;

import exception.TaskHandlingException;

public class SerializationTester {

	public static void main(String[] args) throws FileNotFoundException, IOException, TaskHandlingException{

		try(Scanner sc= new Scanner(System.in))
		{
			System.out.println("Enter the File name");
			String file= sc.next();
	
			Task task1 = null;
			try {
			task1= new Task("sdfg", "sdfghj", validateDate("2022-11-21"));
			}
			catch(Exception e){
				System.out.println("Invalid date");
			}
			
			saveTaskData(task1, file);
			
			Map<Integer, Task> tMap=populatedTaskList();
			
			saveTaskData(tMap, file);
			
			
		}
		

	}



}
