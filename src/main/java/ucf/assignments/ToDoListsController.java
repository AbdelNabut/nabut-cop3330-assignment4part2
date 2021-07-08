/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.File;
import java.util.ArrayList;

public class ToDoListsController {
    private ArrayList<ToDoList> toDoLists;

    @FXML
    private Label listName;

    @FXML
    public void viewButtonClicked(ActionEvent actionEvent) {
        TaskListController.showAllTasks();
    }

    @FXML
    public void renameButtonClicked(ActionEvent actionEvent) {
        renameList();
    }

    @FXML
    public void deleteButtonClicked(ActionEvent actionEvent) {
        deleteList();
    }

    @FXML
    public void saveListButtonClicked(ActionEvent actionEvent) {
        saveList();
    }

    @FXML
    public void saveAllListsButtonClicked(ActionEvent actionEvent) {
        saveAllLists();
    }

    @FXML
    public void newListButtonClicked(ActionEvent actionEvent) {
        createList();
    }

    @FXML
    public void loadListButtonPressed(ActionEvent actionEvent) {
        loadList();
    }

    @FXML
    public void loadMultipleListsButtonPressed(ActionEvent actionEvent) {
        loadMultipleLists();

    }

    private ArrayList<ToDoList> loadMultipleLists() {
        // initialize new ArrayList of type ToDoList
        // select a directory containing all lists
        // loop through every to-do list in directory
        // initialize new ArrayList of type Task for each to-do list
        // loop through each task in to-do list
        // add each task to Task ArrayList.
        return new ArrayList<ToDoList>();
    }

    private ToDoList loadList() {
        // initialize new ToDoList
        // select ToDoList from file browser
        // loop through every task in To Do List
        // create new Task object
        // initialize Task object with values read from file
        // add Task object to ToDoList
        // after loop, return ToDoList Object
        return new ToDoList();
    }

    public ToDoList renameList() {
        // get listName ID
        // set text of listName to new name
        // return ToDoList Object
        return new ToDoList();
    }
    public ArrayList<ToDoList> deleteList() {
        // remove ToDoList from ArrayList
        // return new ArrayList
        return new ArrayList<ToDoList>();
    }

    private File saveList() {
        // parse tasks in list into gson
        // write gson to new file
        // return File object
        return new File("");
    }

    private void saveAllLists() {
        // loop through each to-do list
        // parse tasks in list into gson
        // write gson to file
    }

    public void createList() {
        // create new ToDoList
        // add new ToDoList to toDoLists
        // return toDoLists
    }
}
