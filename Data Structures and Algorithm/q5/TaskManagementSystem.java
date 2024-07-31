public class TaskManagementSystem {
    private Node head;
    // Inner Node class
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public TaskManagementSystem() {
        this.head = null;
    }

    // Add task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Task added: " + task);
    }

    // Search for a task by ID
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and display all tasks
    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        Node current = head;
        System.out.println("Task List:");
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }

        // If the task to be deleted is the head
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }

        // Search for the task
        Node current = head;
        Node previous = null;
        while (current != null && current.task.getTaskId() != taskId) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task with ID " + taskId + " not found.");
            return;
        }

        // Bypass the node to delete it
        previous.next = current.next;
        System.out.println("Task with ID " + taskId + " deleted.");
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        // Adding tasks
        tms.addTask(new Task(1, "Task One", "Pending"));
        tms.addTask(new Task(2, "Task Two", "In Progress"));
        tms.addTask(new Task(3, "Task Three", "Completed"));

        // Display all tasks
        tms.traverseTasks();

        // Search for a task
        System.out.println("\nSearching for task with ID 2:");
        Task task = tms.searchTask(2);
        if (task != null) {
            System.out.println("Found task: " + task);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        System.out.println("\nDeleting task with ID 1:");
        tms.deleteTask(1);

        // Display all tasks after deletion
        System.out.println("\nTask List after deletion:");
        tms.traverseTasks();
    }
}
