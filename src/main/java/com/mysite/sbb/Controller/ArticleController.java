package com.mysite.sbb.Controller;

import com.mysite.sbb.Domain.Article;
import com.mysite.sbb.Dao.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/usr/article/list")
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @RequestMapping("")
    @ResponseBody
    public List<Article> articles() {
        return articleRepository.findAll();
    }

    @RequestMapping("1")
    @ResponseBody
    public Article article() {
        Article article = new Article();
        return article;
    }
}
