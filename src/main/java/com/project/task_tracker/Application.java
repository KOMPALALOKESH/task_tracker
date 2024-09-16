package com.project.task_tracker;

import com.project.task_tracker.cli.TaskManagerCLI;
import com.project.task_tracker.repository.TaskRepositoryImpl;
import com.project.task_tracker.service.TaskServiceImpl;

import java.io.IOException;
import java.nio.file.Path;

public class Application {

    private static final String PATH = "tasks.json";

    public static void main(String[] args) throws IOException {
        new TaskManagerCLI(new TaskServiceImpl(new TaskRepositoryImpl(Path.of(PATH)))).run();
    }
}