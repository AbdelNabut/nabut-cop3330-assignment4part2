/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ucf.assignments;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Deserializer implements JsonDeserializer<Task>{
    @Override
    public Task deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String desc = "", dueDate = "";
        Boolean completed = null;
        if (jsonObject.get("description") != null) {
            desc = jsonObject.get("description").getAsString();
        }
        if (jsonObject.get("completed") != null) {
            completed = jsonObject.get("completed").getAsBoolean();
        }
        if (jsonObject.get("dueDate") != null) {
            dueDate = jsonObject.get("dueDate").getAsString();
        }
        return new Task(desc,
                completed,
                dueDate);
    }
}
