package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.Collection;

public class ProjectSerializer {
    private final PrintWriter out;
    private TaskSerializer taskSerializer;

    public ProjectSerializer(PrintWriter out) {
        this.out = out;
        taskSerializer = new TaskSerializer(out);
    }

    public void serialize(String projectName, Collection<Task> tasks) {
        out.println(projectName);
        tasks.forEach(task -> task.serialize(taskSerializer));
        out.println();
    }
}
