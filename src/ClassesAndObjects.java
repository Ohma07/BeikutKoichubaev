import java.util.ArrayList;
import java.util.HashMap;

// 1) Course class
class Course {
    private String name;
    private String instructor;
    private int credits;

    public Course(String name, String instructor, int credits) {
        this.name = name;
        this.instructor = instructor;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course{name='" + name +
                "', instructor='" + instructor +
                "', credits=" + credits + "}";
    }
}


// 2) AssignmentTask class
class AssignmentTask {
    private String title;
    private Course course;
    private int estimatedHours;
    private int daysUntilDue;
    private boolean completed;

    public AssignmentTask(String title, Course course, int estimatedHours, int daysUntilDue) {
        this.title = title;
        this.course = course;
        this.estimatedHours = estimatedHours;
        this.daysUntilDue = daysUntilDue;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public Course getCourse() {
        return course;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public int getDaysUntilDue() {
        return daysUntilDue;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }

    public boolean isUrgent() {
        return daysUntilDue <= 2 && !completed;
    }

    @Override
    public String toString() {
        return "AssignmentTask{title='" + title +
                "', course='" + course.getName() +
                "', estHours=" + estimatedHours +
                ", dueIn=" + daysUntilDue +
                ", completed=" + completed + "}";
    }
}


// 3) StudySession class
class StudySession {
    private Course course;
    private int minutes;

    public StudySession(Course course, int minutes) {
        this.course = course;
        this.minutes = minutes;
    }

    public Course getCourse() {
        return course;
    }

    public int getMinutes() {
        return minutes;
    }

    public double hours() {
        return minutes / 60.0;
    }

    @Override
    public String toString() {
        return "StudySession{course='" + course.getName() +
                "', minutes=" + minutes + "}";
    }
}


// 4) Main driver program
public class ClassesAndObjects{

    public static void main(String[] args) {

        // Create courses
        Course oop = new Course("OOP", "Dr. Lee", 6);
        Course discrete = new Course("Discrete Math", "Dr. Smith", 5);
        Course english = new Course("English", "Prof. Brown", 3);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(oop);
        courses.add(discrete);
        courses.add(english);

        // Create assignments
        ArrayList<AssignmentTask> assignments = new ArrayList<>();

        assignments.add(new AssignmentTask("Lab 1", oop, 3, 1));
        assignments.add(new AssignmentTask("Project Proposal", oop, 6, 5));
        assignments.add(new AssignmentTask("Homework 3", discrete, 4, 2));
        assignments.add(new AssignmentTask("Essay Draft", english, 5, 7));
        assignments.add(new AssignmentTask("Quiz Prep", discrete, 2, 0));

        // Create study sessions
        ArrayList<StudySession> sessions = new ArrayList<>();

        sessions.add(new StudySession(oop, 90));
        sessions.add(new StudySession(oop, 60));
        sessions.add(new StudySession(discrete, 120));
        sessions.add(new StudySession(english, 45));
        sessions.add(new StudySession(discrete, 30));


        // Print all courses
        System.out.println("=== COURSES ===");
        for (Course c : courses) {
            System.out.println(c);
        }


        // Print assignments and highlight urgent
        System.out.println("\n=== ASSIGNMENTS ===");
        for (AssignmentTask task : assignments) {
            if (task.isUrgent()) {
                System.out.println("URGENT: " + task);
            } else {
                System.out.println(task);
            }
        }


        // Calculate total estimated hours remaining
        int totalRemaining = 0;
        for (AssignmentTask task : assignments) {
            if (!task.isCompleted()) {
                totalRemaining += task.getEstimatedHours();
            }
        }

        System.out.println("\nTotal remaining estimated hours: " + totalRemaining);


        // Calculate total study time per course
        System.out.println("\n=== STUDY TIME PER COURSE ===");

        HashMap<Course, Integer> studyMinutes = new HashMap<>();

        for (StudySession session : sessions) {
            Course c = session.getCourse();
            studyMinutes.put(c,
                    studyMinutes.getOrDefault(c, 0) + session.getMinutes());
        }

        for (Course c : studyMinutes.keySet()) {
            double hours = studyMinutes.get(c) / 60.0;
            System.out.println(c.getName() + ": " + hours + " hours");
        }


        // Mark one assignment as completed
        AssignmentTask completedTask = assignments.get(0);
        completedTask.markCompleted();

        System.out.println("\n=== UPDATED ASSIGNMENT ===");
        System.out.println(completedTask);


        // Recalculate remaining hours
        totalRemaining = 0;
        for (AssignmentTask task : assignments) {
            if (!task.isCompleted()) {
                totalRemaining += task.getEstimatedHours();
            }
        }

        System.out.println("New remaining estimated hours: " + totalRemaining);
    }
}
