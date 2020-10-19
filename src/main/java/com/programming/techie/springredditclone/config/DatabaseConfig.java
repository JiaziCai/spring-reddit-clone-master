package com.programming.techie.springredditclone.config;

import com.zaxxer.hikari.HikariConfig;
        import com.zaxxer.hikari.HikariDataSource;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;

        import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Value("mysql://b7cca7629302a5:94016c36@us-cdbr-east-02.cleardb.com/heroku_50a9dc834f624cf?reconnect=true")
    private String dbUrl;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
    }
}