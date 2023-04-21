package com.smoothstack.jdbcapr2023.dao;

import com.smoothstack.jdbcapr2023.model.Hero;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class HeroDAO extends BaseDAO<Hero, Integer> {
    @Override
    public Optional<Hero> getById(Integer integer) {
        Hero hero = null;
        try (Connection connection = getConnectionManager().getConnection()) {

            String sql = "SELECT * FROM hero WHERE heroId = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, integer);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int heroId = rs.getInt("heroId");
                String heroName = rs.getString("heroName");
                int universeId = rs.getInt("universeId");

                hero = new Hero(heroId, heroName, universeId);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Optional.ofNullable(hero);
    }

    @Override
    public List<Hero> getAll() {
        return null;
    }

    @Override
    public Hero save(Hero hero) {
        return null;
    }
}
