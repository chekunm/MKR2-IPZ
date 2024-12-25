package com.itteam.simulator;

public class DeveloperFactory extends TeamMemberFactory {
    @Override
    public TeamMember createTeamMember(String name) {
        return new TeamMember(name + " (Developer)");
    }
}