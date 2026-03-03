import java.util.ArrayList;
import java.util.List;

//SUPERCLASS
abstract class PlanItem {
    protected String title;
    protected int daysUntil;           // Days until activity happens
    protected double estimatedHours;   // Estimated time required
    protected boolean completed;

    public PlanItem(String title, int daysUntil, double estimatedHours) {
        this.title = title;
        this.daysUntil = daysUntil;
        this.estimatedHours = estimatedHours;
        this.completed = false;
    }


    public void markCompleted() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public double getEstimatedHours() {
        return completed ? 0 : estimatedHours;
    }

    public String getTitle() {
        return title;
    }


    public abstract int calculateUrgency();
    public abstract String getCategory();

    // Common display method (can be overridden)
    public String getDetails() {
        return getCategory() + ": " + title +
                " | Days Left: " + daysUntil +
                " | Hours Needed: " + estimatedHours +
                " | Completed: " + completed +
                " | Urgency: " + calculateUrgency();
    }
}

//SUBCLASS 1
class Assignment extends PlanItem {

    public Assignment(String title, int daysUntil, double estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return (int)(estimatedHours * 2 + (10 - daysUntil));
    }

    @Override
    public String getCategory() {
        return "Assignment";
    }
}

//SUBCLASS 2
class ExamPreparation extends PlanItem {

    public ExamPreparation(String title, int daysUntil, double estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return (int)(estimatedHours * 3 + (15 - daysUntil));
    }

    @Override
    public String getCategory() {
        return "Exam Prep";
    }
}

//SUBCLASS 3
class ClubEvent extends PlanItem {

    public ClubEvent(String title, int daysUntil, double estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return (int)(5 - daysUntil); // Less academic pressure
    }

    @Override
    public String getCategory() {
        return "Club Event";
    }

    @Override
    public String getDetails() {
        return "🎉 " + super.getDetails();
    }
}

//MAIN PROGRAM
public class polymorphysm{

    public static void main(String[] args) {

        List<PlanItem> planner = new ArrayList<>();

        // Create mixed items
        planner.add(new Assignment("Math Homework", 3, 4));
        planner.add(new ExamPreparation("Physics Midterm", 5, 10));
        planner.add(new ClubEvent("Robotics Club Meeting", 2, 2));
        planner.add(new Assignment("English Essay", 7, 5));

        // Mark one as completed
        planner.get(0).markCompleted();

        // Print all items (Polymorphysm in action)
        System.out.println("---- All Plan Items ----");
        for (PlanItem item : planner) {
            System.out.println(item.getDetails());
        }

        // Calculate total remaining time
        double totalHours = 0;
        for (PlanItem item : planner) {
            totalHours += item.getEstimatedHours();
        }

        System.out.println("\nTotal Remaining Study Hours: " + totalHours);

        // Find most urgent item
        PlanItem mostUrgent = null;
        int highestUrgency = -1;

        for (PlanItem item : planner) {
            if (!item.isCompleted() && item.calculateUrgency() > highestUrgency) {
                highestUrgency = item.calculateUrgency();
                mostUrgent = item;
            }
        }

        if (mostUrgent != null) {
            System.out.println("Most Urgent Item: " + mostUrgent.getTitle() +
                    " (Urgency Score: " + highestUrgency + ")");
        }
    }
}
