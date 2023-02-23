import dataModel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<ToDoItem> toDoItems;

    @FXML
    private ListView<ToDoItem> toDoListView;

    @FXML
    private TextArea itemDescriptionTextArea;

    @FXML
    private Label deadlineL;

    public void initialize() {
        ToDoItem item1 = new ToDoItem("Post birthday card", "Buy and write out birthday card",
                LocalDate.of(2023, Month.JULY, 17));
        ToDoItem item2 = new ToDoItem("Weekend away", "Book for the weekend away and get pets booked in",
                LocalDate.of(2023, Month.APRIL, 10));
        ToDoItem item3 = new ToDoItem("Plan birthday party", "Send out invites for the birthday and book venue",
                LocalDate.of(2023, Month.SEPTEMBER, 01));
        ToDoItem item4 = new ToDoItem("Get car serviced", "Book a service date for before we go away for the weekend",
                LocalDate.of(2023, Month.MARCH, 05));
        ToDoItem item5 = new ToDoItem("Assignments for FSD", "Plan for assignment deadlines in term 2",
                LocalDate.of(2023, Month.JANUARY, 30));
        toDoItems = new ArrayList<>();
        toDoItems.add(item1);
        toDoItems.add(item2);
        toDoItems.add(item3);
        toDoItems.add(item4);
        toDoItems.add(item5);

        toDoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observable, ToDoItem oldValue, ToDoItem newValue) {
                if(newValue != null){
                    ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
                    itemDescriptionTextArea.setText(item.getDetails());
                    deadlineL.setText(item.getDeadline().toString());
                }
            }
        });

        //populate the toDoListView
        toDoListView.getItems().setAll(toDoItems);
        //set it to select one item at a time
        toDoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        //to highlight and select the first item
        toDoListView.getSelectionModel().selectFirst();
    }
}
