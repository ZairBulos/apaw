package es.upm.miw.pd.builder.article;

import static org.junit.jupiter.api.Assertions.assertEquals;

import es.upm.miw.pd.builder.article.advanced_solution.Article;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ArticleTest {

    @Test
    void testMandatory() {
        Article article = Article.builder(1L)
                .reference("121620")
                .description("Nintendo Switch 2")
                .retailPrice(new BigDecimal(449))
                .build();

        assertEquals(1L, article.getId());
        assertEquals("121620", article.getReference());
        assertEquals("Nintendo Switch 2", article.getDescription());
        assertEquals(new BigDecimal(449), article.getRetailPrice());
    }

    @Test
    void testOptional() {
        Article article = Article.builder(2L)
                .reference("121620")
                .description("Nintendo Switch 2")
                .retailPrice(new BigDecimal(449))
                .phone(123456789L)
                .phone(987654321L)
                .stock(100)
                .tag("hardware")
                .wholesalePrice(new BigDecimal(449))
                .build();

        assertEquals(2, article.getPhones().size());
        assertEquals(123456789L, article.getPhones().get(0));
        assertEquals(987654321L, article.getPhones().get(1));
        assertEquals(100, article.getStock());
        assertEquals(1, article.getTags().size());
        assertEquals("hardware", article.getTags().get(0));
        assertEquals(new BigDecimal(449), article.getWholesalePrice());
    }
}
