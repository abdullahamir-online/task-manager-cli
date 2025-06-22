import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to Task Manager CLI");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    showTasks();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    System.out.println("Exiting Task Manager CLI. Goodbye!");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void deleteTask() {
        System.out.println("Task deleted.");
    }

    public static void addTask() {
        System.out.println("Task added.");
    }

    public static void showTasks() {
        System.out.println("Showing tasks...");
    }

}



    


 
