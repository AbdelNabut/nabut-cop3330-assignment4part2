/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListsAppControllerTest {

    @Test
    void deleteList() {
        // create new ToDoList
        // initialize list with a few lists
        // get the value of our ToDoList
        // call the deleteList function on one of the lists in our ToDoList
        // assert that the deleted list no longer exists in our ToDoList.
    }

    @Test
    void getLists() {
        // create new ToDoList
        // initialize ToDoList with a few list
        // call getAllLists function
        // assert that value returned from getAllTasks = all the lists.
    }

    @Test
    void renameList() {
        // create new ToDoList
        // initialize ToDoList with a list named x
        // call the renameList function on the list named x
        // assert that list name != x
    }

    @Test
    void createList() {
        // create new ToDoList
        // initialize ToDoList with a list named x
        // call the createList function
        // assert that number of lists in ToDoList = number of lists + 1
    }

    @Test
    void loadMultipleLists() {
        // create new ArrayList of type ToDoList
        // create multiple ToDoLists
        // initialize them with same values as those found in test file
        // add them to the ArrayList
        // call the loadMultipleLists function
        // assert that value of function = value of new ArrayList
    }

    @Test
    void loadList() {
        // create new ToDoList
        // initialize ToDoList with same values as those found in target file
        // call the loadList function on target file
        // assert that value of function = value of new ToDoList
    }

    @Test
    void saveList() {
        // create new ToDoList
        // initialize ToDoList with same values as those found in target file
        // call the saveList function on target file
        // assert that value of function = value of new ToDoList
    }

    @Test
    void saveAllLists() {
        // create new ArrayList of type ToDoList
        // create multiple ToDoLists
        // initialize them with same values as those found in test file
        // add them to the ArrayList
        // call the saveAllLists function
        // assert that value of function = value of new ArrayList
    }
}