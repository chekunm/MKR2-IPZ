package com.itteam.simulator;

import java.util.ArrayList;
import java.util.List;

public class TaskMediator {
    private List<String> tasks = new ArrayList<>();
    private Project project;

    public TaskMediator(Project project) {
        this.project = project;
    }

    public void addTask(String task) {
        tasks.add(task);
        project.notifyObservers("New task added: " + task);
    }

    public void updateTaskStatus(int index, String status) {
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Invalid task index.");
            return;
        }
        String task = tasks.get(index) + " - " + status;
        tasks.set(index, task);
        project.notifyObservers("Task updated: " + task);
    }

    public void listTasks() {
        System.out.println("Current tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }
}