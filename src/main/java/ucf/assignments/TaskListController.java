/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ucf.assignments;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.function.Predicate;

public class TaskListController implements Initializable {

    //private ArrayList<Task> taskList = new ArrayList();

    @FXML private TableView<Task> table;
    @FXML private TableColumn<Task, String> descriptionColumn;
    @FXML private TableColumn<Task, Boolean> completedColumn;
    @FXML private TableColumn<Task, Date> dueDateColumn;

    @FXML
    public void incompleteTasksButtonClicked(ActionEvent actionEvent) {
        showIncompleteTasks();
    }

    @FXML
    public void completedTasksButtonClicked(ActionEvent actionEvent) {
        showCompleteTasks();
    }

    @FXML
    public void allTasksButtonClicked(ActionEvent actionEvent) {
        showAllTasks();
    }

    @FXML
    public void newTaskButtonClicked(ActionEvent actionEvent) {
        createTask();
    }

    @FXML
    public void ascendingButtonClicked(ActionEvent actionEvent) {
        ascendSort();
    }

    @FXML
    public void descendingButtonClicked(ActionEvent actionEvent) {
        descendSort();
    }

    @FXML
    public void deleteButtonClicked(ActionEvent actionEvent) {
        Task task = table.getSelectionModel().getSelectedItem();
        table.getItems().removeAll(task);
        deleteTask(task);
    }

    @FXML
    public void clearListButtonClicked(ActionEvent actionEvent) {
        table.getItems().clear();
        clearList();
    }

    @FXML
    public void saveListButtonClicked(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select output destination");
        File file = fileChooser.showSaveDialog(new Stage());
        saveList(file);
    }

    @FXML
    public void loadListButtonClicked(ActionEvent actionEvent) {
        //loadList();
    }


    public static void showIncompleteTasks() {
        // loop through each task
        // check if task is not complete
        // output task to taskTable
    }

    public static void showCompleteTasks() {
        // loop through each task
        // check if task is complete
        // output task to taskTable
    }

    public static void showAllTasks() {
        // loop through each task
        // check if task is complete
        // output task to taskTable
    }

    public void createTask() {
        // create new Task object
        // initialize Task object
        // add Task object to ToDoList
        // return ToDoList
        Task task = new Task();
        task.completedProperty().addListener(new ChangeListener(){
            @Override public void changed(ObservableValue o, Object oldVal,
                                          Object newVal){
                System.out.println("Boolean Value: " + task.getCompleted());
            }
        });
        tasks.add(task);
    }

    private ObservableList<Task> deleteTask(Task task) {
        // remove task from list
        // return to-do list
        tasks.remove(task);
        return tasks;
    }

    public ObservableList<Task> clearList() {
        // loop through every item in the to-do list
        // remove item from list
        // return empty list
        for(Task task : tasks)
            tasks.remove(task);
        return tasks;
    }


    public ToDoList ascendSort() {
        // create a new comparator with variable date
        // sort the ToDoList in ascending order
        // return ToDoList
        return new ToDoList();
    }

    public ToDoList descendSort() {
        // create a new comparator with variable date
        // sort the ToDoList in descending order
        // return ToDoList
        return new ToDoList();
    }

    public File saveList(File file) {
        // opens file browser
        // outputs file to destination
        // returns file
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write("test");
            printWriter.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return file;
    }

    public File loadList(File file) {
        // opens file browser
        // reads selected file
        // returns file
        return file;
    }

    ObservableList<Task> tasks = FXCollections.observableArrayList();
    FilteredList<Task> filteredList = new FilteredList<>(tasks);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        completedColumn.setCellValueFactory(new PropertyValueFactory<Task, Boolean>("completed"));
        completedColumn.setCellFactory( lambda -> new CheckBoxTableCell<>());

        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        descriptionColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        descriptionColumn.setOnEditCommit(event -> {
            Task task = event.getRowValue();
            task.setDescription(event.getNewValue());
        });
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        table.setItems(filteredList);

        filteredList.setPredicate(
                t -> {
                    if(t.getCompleted().booleanValue())
                        return false; // or true
                    return true;
                }
        );
    }
}
