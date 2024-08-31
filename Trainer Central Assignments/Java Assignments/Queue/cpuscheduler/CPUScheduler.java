package cpuscheduler;

import java.util.PriorityQueue;
import java.util.Queue;

public class CPUScheduler {

    public static void main(String[] args) {

        Queue<Task> taskQueue = new PriorityQueue<>();

        // Adding tasks to the queue
        taskQueue.add(new Task("Task1", 4, 0));
        taskQueue.add(new Task("Task2", 2, 1));
        taskQueue.add(new Task("Task3", 1, 2));
        taskQueue.add(new Task("Task4", 3, 3));

        int currTime = 0;

        // Debugging: Print the queue order before processing
        System.out.println("Initial Queue Order:");
        for (Task t : taskQueue) {
            System.out.println(t.getTaskName() + " (Processing Time: " + t.getProcessingTime() + ")");
        }
        System.out.println("----------------------------");

        while (!taskQueue.isEmpty()) {

            Task task = taskQueue.poll();  // Dequeue the task with the highest priority (shortest processing time)

            currTime = Math.max(currTime, task.getArrivalTime());

            int waitingTime = currTime - task.getArrivalTime();
            int turnaroundTime = waitingTime + task.getProcessingTime();  // Corrected calculation

            task.setWaitingTime(waitingTime);
            task.setTurnaroundTime(turnaroundTime);

            currTime += task.getProcessingTime();  // Advance the current time by the task's processing time

            // Print the task details
            System.out.println("Processing " + task.getTaskName() + "...");
            System.out.println("Waiting Time : " + task.getWaitingTime());
            System.out.println("Turnaround Time : " + task.getTurnaroundTime());
            System.out.println("----------------------------");

        }

    }
}
