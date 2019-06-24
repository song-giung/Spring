package com.rldnddl87.springbootwebcrawler.Controller;

import com.rldnddl87.springbootwebcrawler.Crawler.BasicWebCrawler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrawlerController {

    private BasicWebCrawler basicWebCrawler;
    public CrawlerController(BasicWebCrawler basicWebCrawler) {
        this.basicWebCrawler = basicWebCrawler;
    }

    @RequestMapping("/crawl")
    public String startCrawl() {
        basicWebCrawler.getPageLinks("https://www.mkyong.com");
        return "crawling";
    }
}
