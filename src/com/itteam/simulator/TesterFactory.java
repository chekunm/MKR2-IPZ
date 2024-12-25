package com.itteam.simulator;

public class TesterFactory extends TeamMemberFactory {
    @Override
    public TeamMember createTeamMember(String name) {
        return new TeamMember(name + " (Tester)");
    }
}