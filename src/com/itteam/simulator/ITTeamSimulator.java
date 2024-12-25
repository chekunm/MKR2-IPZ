package com.itteam.simulator;

public class ITTeamSimulator {
    public static void main(String[] args) {
        Project project = new Project();
        TaskMediator taskMediator = new TaskMediator(project);

        TeamMemberFactory developerFactory = new DeveloperFactory();
        TeamMemberFactory testerFactory = new TesterFactory();
        TeamMemberFactory pmFactory = new ProjectManagerFactory();

        TeamMember dev1 = developerFactory.createTeamMember("Alice");
        TeamMember tester1 = testerFactory.createTeamMember("Bob");
        TeamMember pm = pmFactory.createTeamMember("Carol");

        project.addObserver(dev1);
        project.addObserver(tester1);
        project.addObserver(pm);

        taskMediator.addTask("Implement login feature");
        taskMediator.addTask("Write test cases for login");

        taskMediator.listTasks();

        taskMediator.updateTaskStatus(0, "In Progress");
        taskMediator.updateTaskStatus(1, "Completed");

        taskMediator.listTasks();
    }
}