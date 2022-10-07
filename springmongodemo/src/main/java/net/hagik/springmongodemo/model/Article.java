package net.hagik.springmongodemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("article")
public class Article {
    @Id
    private String id;
    @Field(name = "name")
    @Indexed(unique = true)
    private String title;
    @Field(name = "category")
    private Category category;
    @Field(name = "value")
    private String content;

    public Article(String id, String title, Category category, String content) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
