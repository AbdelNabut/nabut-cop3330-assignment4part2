/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TaskListController {


    @FXML
    public void allListsButtonClicked(ActionEvent actionEvent) {
        showToDoLists();
    }

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

    public static void showToDoLists() {
        // set scene to ToDoList scene
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

}
