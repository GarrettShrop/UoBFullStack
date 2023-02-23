package dataModel;

import java.time.LocalDate;

public class ToDoItem {
    private String shortDescription;
    private String details;
    private LocalDate deadline;

    public ToDoItem(String shortDescription, String details, LocalDate deadline) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.deadline = deadline;
    }

    public String getDetails() {
        return details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    //to ensure that you get the short description and not the object reference this relates to the listView
    @Override
    public String toString() {
        return shortDescription;
    }
}

