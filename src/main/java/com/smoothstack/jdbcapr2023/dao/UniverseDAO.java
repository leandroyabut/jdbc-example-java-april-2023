package com.smoothstack.jdbcapr2023.dao;

import com.smoothstack.jdbcapr2023.model.Hero;
import com.smoothstack.jdbcapr2023.model.Universe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class UniverseDAO extends BaseDAO<Universe, Integer> {
    @Override
    public Optional<Universe> getById(Integer integer) {
        Universe universe = null;
        try (Connection connection = getConnectionManager().getConnection()) {

            String sql = "SELECT * FROM universe WHERE universeId = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, integer);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int universeId = rs.getInt("universeId");
                String universeName = rs.getString("universeName");

                universe = new Universe(universeId, universeName);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Optional.ofNullable(universe);
    }

    @Override
    public List<Universe> getAll() {
        return null;
    }

    @Override
    public Universe save(Universe universe) {
        return null;
    }
}
