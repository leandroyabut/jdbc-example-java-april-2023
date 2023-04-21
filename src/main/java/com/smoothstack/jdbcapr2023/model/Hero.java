package com.smoothstack.jdbcapr2023.model;

public class Hero {
    private int heroId;
    private String heroName;
    private int universeId;
    private Universe universe;

    public Hero(int heroId, String heroName, int universeId) {
        this.heroId = heroId;
        this.heroName = heroName;
        this.universeId = universeId;
    }

    public Hero(int heroId, String heroName, Universe universe) {
        this.heroId = heroId;
        this.heroName = heroName;
        this.universe = universe;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Universe getUniverse() {
        return universe;
    }

    public void setUniverse(Universe universe) {
        this.universe = universe;
    }

    public int getUniverseId() {
        return universeId;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "heroId=" + heroId +
                ", heroName='" + heroName + '\'' +
                ", universe=" + universe +
                '}';
    }
}
