package mongo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "mongo.repository")
@Configuration
class MongoConfiguration {

    @Value("${mongo.client}")
    private String client;

    public @Bean
    MongoClient mongoClient() {
        return MongoClients.create(client);
    }
}