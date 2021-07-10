/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 first_name last_name
 */

package ucf.assignments;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.util.Date;

public class Task {
    String description;
    BooleanProperty completed = new SimpleBooleanProperty();
    Date dueDate;
    Button deleteButton;

    public Task() {
        // initialize task values
        this.description = "new task";
        this.completed = new SimpleBooleanProperty();
        this.dueDate = null;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public final Boolean getCompleted(){return completed.get();}

    public final void setCompleted(Boolean value){completed.set(value);}

    public BooleanProperty completedProperty() {return completed;}

}
