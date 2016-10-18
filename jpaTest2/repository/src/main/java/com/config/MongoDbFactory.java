package com.config;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * Created by Talha on 10/18/2016.
 */

public class MongoDbFactory extends SimpleMongoDbFactory {

    private static String defaultDatabaseName = "";

    public MongoDbFactory(MongoClient mongoClient, String databaseName) {
        super(mongoClient, databaseName);
        this.defaultDatabaseName = databaseName;
    }

    public static void setDataBase(String name) {
        defaultDatabaseName = name;
    }

    @Override
    public DB getDb() {
        final String dbToUse = this.defaultDatabaseName;
        return super.getDb(dbToUse);
    }
}
