package com.admiralxy.cinema.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StartupListener {

    private final DataSource dataSource;

    @Autowired
    public StartupListener(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @EventListener(ContextRefreshedEvent.class)
    public void contextRefreshedEvent() throws SQLException {
        Connection connection = dataSource.getConnection();
        DatabaseMetaData dbm = connection.getMetaData();
        ResultSet tables = dbm.getTables(null, null, "FILMS", null);

        if (!tables.next()) {
            DatabasePopulator databasePopulator;
            Resource schema = new ClassPathResource("sql/schema.sql");
            Resource data = new ClassPathResource("sql/data.sql");

            databasePopulator = new ResourceDatabasePopulator(schema);
            DatabasePopulatorUtils.execute(databasePopulator, dataSource);

            databasePopulator = new ResourceDatabasePopulator(data);
            DatabasePopulatorUtils.execute(databasePopulator, dataSource);
        }
    }
}
