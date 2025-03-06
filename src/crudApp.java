import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class crudApp {
      private static Map<Integer, String> tasks = new HashMap<>();
      private static Scanner scanner = new Scanner(System.in);

      public static void main(String[] args) {
            while (true) {
                  System.out.println("\n CRUD Application");
                  System.out.println("\n1. Create tasks");
                  System.out.println("\n 2.View tasks");
                  System.out.println("\n 3.Update tasks");
                  System.out.println("\n 4.Delete tasks");
                  System.out.println("\n Exit");
                  System.out.println("Enter your choice");
                  int choice = scanner.nextInt();
                  scanner.nextLine();
                  switch (choice) {
                        case 1:
                              createTasks();
                              break;
                        case 2:
                              readTasks();
                              break;
                        case 3:
                              System.out.println("tasks updated");
                              break;
                        case 4:
                              System.out.println("tasks deleted");
                              break;
                        case 5:
                              System.out.println("Exiting application");
                              break;

                        default:
                              System.out.println("Invalid choice, please try again");
                  }

            }
      }

      public static void createTasks() {
            System.out.println("Enter tasks ID");
            int id = scanner.nextInt();
            scanner.nextLine();
            if (tasks.containsKey(id)) {
                  System.out.println("Task already exists.");
                  return;
            }
            System.out.print("Enter record value: ");
            String value = scanner.nextLine();
            tasks.put(id, value);
            System.out.println("Record added successfully!");

      }

      private static void readTasks() {
            if (tasks.isEmpty()) {
                  System.out.println("No tasks found.");
            } else {
                  tasks.forEach((key, value) -> System.out.println(key + ": " + value));
            }
      }

}
