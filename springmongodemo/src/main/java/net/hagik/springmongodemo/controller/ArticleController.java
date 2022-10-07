package net.hagik.springmongodemo.controller;

import net.hagik.springmongodemo.model.Article;
import net.hagik.springmongodemo.service.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/article")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping
    public ResponseEntity addArticle(@RequestBody Article article) {
        articleService.addArticle(article);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<List<Article>> updateArticle(@RequestBody Article article) {
        articleService.updateArticle(article);
        return ResponseEntity.ok(articleService.getAllArticles());
    }

    @GetMapping
    public ResponseEntity<List<Article>> getAllArticles() {
        return ResponseEntity.ok(articleService.getAllArticles());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Article> getArticleByName(@PathVariable String name) {
        return ResponseEntity.ok(articleService.getArticleByName(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteArticle(@PathVariable String id) {
        articleService.deleteArticle(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
