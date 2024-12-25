package com.itteam.simulator;

public class ProjectManagerFactory extends TeamMemberFactory {
    @Override
    public TeamMember createTeamMember(String name) {
        return new TeamMember(name + " (Project Manager)");
    }
}