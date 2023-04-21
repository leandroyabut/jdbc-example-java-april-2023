package com.smoothstack.jdbcapr2023.model;

public class Universe {

    private int universeId;
    private String universeName;

    public Universe(String universeName) {
        this.universeName = universeName;
    }

    public Universe(int universeId, String universeName) {
        this.universeId = universeId;
        this.universeName = universeName;
    }

    public int getUniverseId() {
        return universeId;
    }

    public void setUniverseId(int universeId) {
        this.universeId = universeId;
    }

    public String getUniverseName() {
        return universeName;
    }

    public void setUniverseName(String universeName) {
        this.universeName = universeName;
    }
}
