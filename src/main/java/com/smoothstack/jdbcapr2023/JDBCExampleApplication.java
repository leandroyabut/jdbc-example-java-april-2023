package com.smoothstack.jdbcapr2023;

import com.smoothstack.jdbcapr2023.model.Hero;
import com.smoothstack.jdbcapr2023.service.HeroService;
import oracle.jdbc.driver.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JDBCExampleApplication {



    public static void main(String[] args) {

        HeroService heroService = new HeroService();

        System.out.println("Enter hero ID: ");

        Scanner scanner = new Scanner(System.in);

        int heroId = scanner.nextInt();

        Hero hero = heroService.getHeroById(heroId);

        System.out.println(hero);

    }

}
