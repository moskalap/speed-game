package pl.edu.agh.ki.speedgame.model.requests;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CreateGameInput {
    public String groupId;
    public int taskNumber = 10;
    public List<TaskConfig> tasksConfig = new ArrayList<>();

    public CreateGameInput(List<TaskConfig> tasks) {
        this.tasksConfig = tasks;
    }
}