package net.hagik.springmongodemo.service;

import net.hagik.springmongodemo.model.Article;
import net.hagik.springmongodemo.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public void addArticle(Article article) {
        articleRepository.insert(article);
    }

    public void updateArticle(Article article) {
        Article savedArticle = articleRepository.findById(article.getId())
                .orElseThrow(() -> new RuntimeException(String.format("Cannot find article by ID %s", article.getId())));

        savedArticle.setTitle(article.getTitle());
        savedArticle.setCategory(article.getCategory());
        savedArticle.setContent(article.getContent());

        articleRepository.save(article);
    }

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Article getArticleByName(String name) {
        return articleRepository.findByName(name).orElseThrow(
                () -> new RuntimeException(String.format("Cannot find article by name %s", name))
        );
    }

    public void deleteArticle(String id) {
        articleRepository.deleteById(id);
    }
}
