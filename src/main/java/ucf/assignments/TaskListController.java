/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class TaskListController implements Initializable {

    //private ArrayList<Task> taskList = new ArrayList();

    @FXML private TableView<Task> table;
    @FXML private TableColumn<Task, String> descriptionColumn;
    @FXML private TableColumn<Task, Boolean> completedColumn;
    @FXML private TableColumn<Task, Date> dueDateColumn;
    @FXML private TableColumn<Task, Date> removeColumn;

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
        tasks.add(new Task());
        // create new Task object
        // initialize Task object
        // add Task object to ToDoList
        // return ToDoList
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        completedColumn.setCellValueFactory(new PropertyValueFactory<Task, Boolean>("completed"));
        completedColumn.setCellFactory( lambda -> new CheckBoxTableCell<>());
        completedColumn.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Task, Boolean>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Task, Boolean> event) {
                Task task = event.getRowValue();
                task.setCompleted(event.getNewValue());
                System.out.println("Completed: " + task.getCompleted());
            }
        });

        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        descriptionColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        descriptionColumn.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Task, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Task, String> event) {
                Task task = event.getRowValue();
                task.setDescription(event.getNewValue());
            }
        });

        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));

        //descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("remove"));
        /*removeColumn.setCellValueFactory(
                param -> new ReadOnlyObjectWrapper<>(param.getValue())
        );
        removeColumn.setCellFactory(param -> new TableCell() {
            private final Button deleteButton = new Button("Unfriend");

            //@Override
            protected void updateItem(Task task, boolean empty) {
                super.updateItem(task, empty);

                if (task == null) {
                    setGraphic(null);
                    return;
                }

                setGraphic(deleteButton);
                deleteButton.setOnAction(
                        event -> getTableView().getItems().remove(task)
                );
            }
        });*/

        //dueDateColumn.setCellFactory(DateCell);
        table.setItems(tasks);
        table.setEditable(true);
        //table.getColumns().setAll(descriptionColumn, completedColumn, dueDateColumn);
    }
}
