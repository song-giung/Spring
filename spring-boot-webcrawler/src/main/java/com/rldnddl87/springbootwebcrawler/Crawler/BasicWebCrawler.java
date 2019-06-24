package com.rldnddl87.springbootwebcrawler.Crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashSet;


@Service
public class BasicWebCrawler {

    private HashSet<String> links;

    public BasicWebCrawler() {
        links = new HashSet<String>();
    }

    public void getPageLinks(String URL) {
        if (!links.contains(URL)) {
            try {
              if (links.add(URL)) {
                  System.out.println("added : " + URL);
              }

              Document document = Jsoup.connect(URL).get();
              Elements linksOnPage = document.select("a[href]"); //긁어온 정보의 특정 DOM객체를 가져온다.

                for (Element page : linksOnPage) {
                    getPageLinks(page.attr("abs:href"));
                }

            } catch (IOException e) {
                System.out.println("Where : " + URL + "errmsg : " + e.getMessage());
            }
        }
    }
}
