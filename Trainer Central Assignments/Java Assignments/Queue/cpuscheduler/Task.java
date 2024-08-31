package cpuscheduler;

public class Task implements Comparable<Task>{
    private String taskName;
    private int processingTime;
    private int arrivalTime;
    private int waitingTime;
    private int turnaroundTime;

    public Task(String taskName, int processingTime, int arrivalTime) {
        this.taskName = taskName;
        this.processingTime = processingTime;
        this.arrivalTime = arrivalTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }

    @Override
    public int compareTo(Task other) {
        // First compare by processing time, then by arrival time
        int compareProcessingTime = Integer.compare(this.processingTime, other.processingTime);
        if (compareProcessingTime != 0) {
            return compareProcessingTime;
        } else {
            return Integer.compare(this.arrivalTime, other.arrivalTime);
        }
    }
}
