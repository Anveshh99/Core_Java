package TesterMain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static utils.taskUtils.populatedTaskList;
import static validation.validateRules.validateDate;
import static utils.binIOUtils.restoreTaskData;

import com.task.Status;
import com.task.Task;

public class TaskTester {
	
//	   You
//	 * can use suitable data structure to store data in memory. Following
//	 * functionalities are expected -
//	 * 
//	 *  
//	 * A) Add New Task B) Delete a task C) Update
//	 * task status D) Display all pending tasks E) Display all pending tasks for
//	 * today F) Display all tasks sorted by taskDate
	
	public static void main(String[] args)
	{
		
		try(Scanner sc=new Scanner(System.in))
		{
			
			Map<Integer, Task> taskMap=populatedTaskList();
			
			boolean exit=false;
			
			while(!exit)
			{
			System.out.println(" Enter the Choose\n "
					         + " 1. Add New Task\n"
					         + " 2. Delete a Task\n"
					         + " 3. Update task status\n"
					         + " 4. Display all pending tasks\n"
					         + " 5. Display all pending tasks for today\n"
					         + " 6. Display all tasks sorted by taskDate\n"
					         + " 7. Display"
					         + " 10. Exit");
			
			switch(sc.nextInt())
			{

			case 1:
				
				System.out.println(" Enter taskName, description of Task, taskDate");
				Task AdditionalTask= new Task(sc.next(), sc.next(), validateDate(sc.next()));
				taskMap.put(AdditionalTask.getTaskId(), AdditionalTask);
				System.out.println("Task is added");
				break;
				
            case 2:
				
				System.out.println(" Enter taskId to Delete");
				taskMap.remove(sc.nextInt());
				System.out.println("Task is Deleted");
				break;
				
           case 3:
				
        	   System.out.println(" Enter taskId and Status for Updation of status");
        	   
        	   try {
				taskMap.get(sc.nextInt()).setTaskStatus(Status.valueOf(sc.next().toUpperCase()));
        	   }
        	   catch(Exception e)
        	   {
        		 System.out.println(" enter correct option In_progress or Completed");
        		 System.out.println(e);
        	   }
				System.out.println("Task is Replaced");
				break;
				
				
           case 4:
				
				System.out.println("Pending Task");
				for(Task t: taskMap.values())
				{
					if(t.getTaskStatus().equals(Status.PENDING))
						System.out.println(t);
				}
				break;
				
           case 5:
				
				System.out.println("Today Task");
				for(Task t: taskMap.values())
				{
					if(t.getTaskStatus().equals(LocalDate.now()))
						System.out.println(t);
				}
				break;
				
           case 6:
				
				System.out.println("Sorted by taskDate");
				List<Task> list= new ArrayList<Task>(taskMap.values());
				Collections.sort(list, new Comparator<Task>() 
				{

					@Override
					public int compare(Task o1, Task o2) {
						
						return o1.getTaskDate().compareTo(o2.getTaskDate());
					}
					
				});	
				
				System.out.println(list);
				break;	
				
           case 7:
        	   
        	   for(Task H: taskMap.values())
        	   {
        		   System.out.println(H);
        	   }
        	   break;
        	   
           case 8:
        	   
        	   System.out.println("to Restore data enter file name");
        	   
        	   System.out.println(restoreTaskData(sc.next()));
        	   break;
        	   
           case 10:
        	   exit=true;
			
			}
			
			
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	

}
