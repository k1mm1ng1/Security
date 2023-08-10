package com.springggg.minn.dto;

import com.springggg.minn.domain.Article;
import lombok.Getter;

@Getter
public class ArticleListViewResponse {
    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article article){
        this.id = article.getId();
        this.title = article.getContent();
        this.content = article.getContent();
    }
}
