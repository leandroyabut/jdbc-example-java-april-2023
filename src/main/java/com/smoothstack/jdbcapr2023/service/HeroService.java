package com.smoothstack.jdbcapr2023.service;

import com.smoothstack.jdbcapr2023.dao.HeroDAO;
import com.smoothstack.jdbcapr2023.dao.UniverseDAO;
import com.smoothstack.jdbcapr2023.model.Hero;
import com.smoothstack.jdbcapr2023.model.Universe;

public class HeroService {

    private final HeroDAO heroDAO;
    private final UniverseDAO universeDAO;

    public HeroService() {
        heroDAO = new HeroDAO();
        universeDAO = new UniverseDAO();
    }

    public Hero getHeroById(int id) {
        Hero hero = heroDAO.getById(id)
                .orElseThrow(() -> new RuntimeException("Hero does not exist."));
        Universe universe = universeDAO.getById(hero.getUniverseId())
                .orElseThrow(() -> new RuntimeException("Universe does not exist."));

        hero.setUniverse(universe);

        return hero;
    }

}
