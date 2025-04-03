package es.upm.miw.pd.builder.article.advanced_solution;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Article {
    private final long id;
    private final List<Long> phones = new ArrayList<>();
    private String reference;
    private String description;
    private BigDecimal retailPrice;
    private int stock;
    private List<String> tags;
    private BigDecimal wholesalePrice;
    private Provider provider;

    public Article(long id) {
        this.id = id;
    }

    public static ArticleBuilders.Reference builder(long id) {
        return new Builder(id);
    }

    public long getId() {
        return id;
    }

    public List<Long> getPhones() {
        return phones;
    }

    public void addPhone(long phone) {
        phones.add(phone);
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public static class Builder implements ArticleBuilders.Reference, ArticleBuilders.Description, ArticleBuilders.RetailPrice, ArticleBuilders.Optionals {
        private final Article article;

        public Builder(long id) {
            this.article = new Article(id);
        }

        @Override
        public ArticleBuilders.Description reference(String reference) {
            this.article.reference = reference;
            return this;
        }

        @Override
        public ArticleBuilders.RetailPrice description(String description) {
            this.article.description = description;
            return this;
        }

        @Override
        public ArticleBuilders.Optionals retailPrice(BigDecimal retailPrice) {
            this.article.retailPrice = retailPrice;
            return this;
        }

        @Override
        public ArticleBuilders.Optionals phone(Long phone) {
            this.article.phones.add(phone);
            return this;
        }

        @Override
        public ArticleBuilders.Optionals stock(int stock) {
            this.article.stock = stock;
            return this;
        }

        @Override
        public ArticleBuilders.Optionals tag(String tag) {
            if (this.article.tags == null) {
                this.article.tags = new ArrayList<>();
            }

            this.article.tags.add(tag);
            return this;
        }

        @Override
        public ArticleBuilders.Optionals wholesalePrice(BigDecimal wholesalePrice) {
            this.article.wholesalePrice = wholesalePrice;
            return this;
        }

        @Override
        public ArticleBuilders.Optionals provider(Provider provider) {
            this.article.provider = provider;
            return this;
        }

        @Override
        public Article build() {
            return this.article;
        }
    }
}
