package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 first_name last_name
 */


import java.util.ArrayList;
import java.util.Date;

public class ToDoList {
    private String name;
    private ArrayList<Task> tasks;

    public void addTask() {
        Task task = new Task();
        this.tasks.add(task);
    }
    public void addTask(String description, boolean completed, Date dueDate) {
        // create new Task
        // initialize Task with parameter variables
        // add Task to ArrayList of type Task
    }
    public void deleteTask(String description, boolean completed, Date dueDate) {
        // create new Task
        // initialize Task with parameter variables
        // add Task to ArrayList of type Task
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
