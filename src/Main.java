import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static String index = "";
    public static String selection = "";
    public static ArrayList<Task> taskList = new ArrayList<>();

    public static void main(String[] args) {
        String userInput = "";
        while (!userInput.equals("0")){
            printOptions();
            userInput = input.nextLine();
            if (userInput.equals("0")){
                break;
            } else if (userInput.equals("1")) {
                addTask(taskList);
            } else if (userInput.equals("2")) {
                removeTask(taskList);
            } else if (userInput.equals("3")) {
                updateTask(taskList);
            } else if (userInput.equals("4")) {
                System.out.println(taskList);
            } else if (userInput.equals("5")) {
                listByPrio();
            } else {
                System.out.println("something went wrong. please try again.");
            }
        }
    }
    static void printOptions(){
        System.out.println("(1) add task\n(2) remove task\n(3) update task\n(4) list all tasks\n(5) list all tasks by priority\n(0) Exit");
    }
    static void addTask(ArrayList a){
        System.out.println("type a task to add");
        String taskName = input.nextLine();
        System.out.println("type a description");
        String desc = input.nextLine();
        System.out.println("input a priority");
        int priority = checkPriority(input.nextInt());
        input.nextLine();
        Task john = new Task(taskName, desc, priority);
        taskList.add(john);
    }
    static void removeTask(ArrayList a){
        System.out.println("type an index to remove");
        selection = input.nextLine();
        a.remove(Integer.parseInt(selection));
    }
    static void updateTask(ArrayList a){
        System.out.println("type an index to update");
        index = input.nextLine();
        System.out.println("type the new name");
        String newName = input.nextLine();
        System.out.println("type the new description");
        String newDesc = input.nextLine();
        System.out.println("type the new priority");
        int newPrio = checkPriority(input.nextInt());
        input.nextLine();
        Task john = new Task(newName, newDesc, newPrio);
        a.set(Integer.parseInt(index), john);
    }
    static int checkPriority(int a){
        if(a>5){
            a = 5;
        } else if (a<0) {
            a = 0;
        }
        return a;
    }
    static void listByPrio(){
        System.out.println("input a priority of task to list");
        int userPrio = checkPriority(input.nextInt());
        input.nextLine();
        for(Task i: taskList){
            if (i.getPriority() == userPrio){
                System.out.println("(prio: " + userPrio + ")" + i);
            }
        }

    }
}