package net.hagik.springmongodemo.repository;

import net.hagik.springmongodemo.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ArticleRepository extends MongoRepository<Article, String> {
    @Query("{'name': ?0}")
    Optional<Article> findByName(String name);
}
