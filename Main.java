import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Backlog class (Aggregate Root)
class Backlog {
    private String name;
    private String description;
    private List<BacklogItem> backlogItems;

    public Backlog(String name, String description) {
        UUID id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.backlogItems = new ArrayList<>();
    }

    public void addItem(BacklogItem item) {
        backlogItems.add(item);
    }

    public List<BacklogItem> getBacklogItems() {
        return backlogItems;
    }
}

// BacklogItem class
class BacklogItem {
    private String status;
    private String story;
    private int storyPoints;
    private String summary;
    private String type;

    private String productID;  // Use String instead of ProductID class
    private String releaseID;  // Use String instead of ReleaseID class
    private String sprintID;   // Use String instead of SprintID class

    private List<Task> tasks;

    public BacklogItem(String status, String story, int storyPoints, String summary, String type,
                       String productID, String releaseID, String sprintID) {  // Use String arguments
        this.status = status;
        this.story = story;
        this.storyPoints = storyPoints;
        this.summary = summary;
        this.type = type;
        this.productID = productID;
        this.releaseID = releaseID;
        this.sprintID = sprintID;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}

// Task class
class Task {
    private final String id;
    private String name;
    private String description;
    private int hoursRemaining;
    private String volunteer;
    private List<EstimationLogEntry> estimationLogEntries;

    public Task(String name, String description, int hoursRemaining, String volunteer) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.hoursRemaining = hoursRemaining;
        this.volunteer = volunteer;
        this.estimationLogEntries = new ArrayList<>();
    }

    public void addEstimationLogEntry(EstimationLogEntry entry) {
        estimationLogEntries.add(entry);
    }
}

// EstimationLogEntry class
class EstimationLogEntry {
    private String name;
    private String volunteer;
    private String description;
    private int hoursRemaining;
    

    public EstimationLogEntry(String name, String volunteer, String description, int hoursRemaining) {
        this.name = name;
        this.volunteer = volunteer;
        this.description = description;
        this.hoursRemaining = hoursRemaining;
    
    }

    public String getName() {
        return name;
    }

    public String getVolunteer() {
        return volunteer;
    }

    public String getDescription() {
        return description;
    }

    public int getHoursRemaining() {
        return hoursRemaining;
    }

    
}

// Main class (where program execution starts)
public class Main {
    public static void main(String[] args) {
        // Use Strings for ProductID, ReleaseID, and SprintID
        String productID = "product-01";
        String releaseID = "release-01";
        String sprintID = "sprint-01";

        Backlog backlog = new Backlog("Team A", "Backlog 1");

        BacklogItem item = new BacklogItem("Incomplete", "Home page design", 4, "develop home page", "design",
                productID, releaseID, sprintID);

        Task task = new Task("UI Desing","Finan", 2, "Setup UI");
        EstimationLogEntry estimation = new EstimationLogEntry("Design", "Sara", "Initial estimate", 2);

        task.addEstimationLogEntry(estimation);
        item.addTask(task);
        backlog.addItem(item);

        System.out.println("Backlog contains " + backlog.getBacklogItems().size() + " items.");
        System.out.println("First item has " + backlog.getBacklogItems().get(0).getTasks().size() + " task(s).");
    }
}
