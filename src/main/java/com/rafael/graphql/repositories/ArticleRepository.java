package com.rafael.graphql.repositories;

import com.rafael.graphql.documents.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {
}
