/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskListControllerTest {

    @Test
    void allListsButtonClicked() {
        // no test, button return to previous display.
    }

    @Test
    void showIncompleteTasks() {
        // create new TaskListController
        // initialize the list view to show all items
        // call the showIncompleteTasks function
        // assert that displayed lists = only the incomplete tasks
    }

    @Test
    void showCompletedTasks() {
        // create new TaskListController
        // initialize the list view to show all tasks
        // call the showCompletedTasks function
        // assert that displayed lists = only the complete tasks
    }

    @Test
    void showAllTasks() {
        // create new TaskListController
        // initialize the list view to show only the incomplete/complete tasks
        // call the showAllTasks function
        // assert that displayed lists = shows all the items.
    }

    @Test
    void createTask() {
        // create new Task object
        // initialize the Task object with x values
        // call the createTask function with same x values in parameter
        // assert that the function return = the new Task object.
    }

    @Test
    void ascendSort() {
        // create new ToDoList object
        // initialize the ToDoList with x number of tasks in ascending order
        // create a test ToDoList
        // initialize test ToDoList with same tasks in any order except ascending order
        // call the ascendSort function on the test ToDoList
        // assert that the function return = the new ToDoList object.
    }

    @Test
    void descendSort() {
        // create new ToDoList object
        // initialize the ToDoList with x number of tasks in descending order
        // create a test ToDoList
        // initialize test ToDoList with same tasks in any order except descending order
        // call the descendSort function on the test ToDoList
        // assert that the function return = the new ToDoList object.
    }

}