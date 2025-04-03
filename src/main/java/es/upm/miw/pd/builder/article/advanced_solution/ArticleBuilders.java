package es.upm.miw.pd.builder.article.advanced_solution;

import java.math.BigDecimal;

public interface ArticleBuilders {

    interface Reference {
        Description reference(String reference);
    }

    interface Description {
        RetailPrice description(String description);
    }

    interface RetailPrice {
        Optionals retailPrice(BigDecimal retailPrice);
    }

    interface Optionals {
        Optionals phone(Long phone);
        Optionals stock(int stock);
        Optionals tag(String tag);
        Optionals wholesalePrice(BigDecimal wholesalePrice);
        Optionals provider(Provider provider);
        Article build();
    }
}
