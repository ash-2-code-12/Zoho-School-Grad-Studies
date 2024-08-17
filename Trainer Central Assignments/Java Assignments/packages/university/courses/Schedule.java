package packages.university.courses;

import java.util.Date;

public class Schedule {
    private Course course;
    private Date startTime;
    private Date endTime;

    public Schedule(Course course, Date startTime, Date endTime) {
        this.course = course;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and setters
    public Course getCourse() { return course; }
    public Date getStartTime() { return startTime; }
    public Date getEndTime() { return endTime; }
}
