package es.upm.miw.pd.builder.article.advanced_solution;

public interface ProviderBuilders {

    interface Id {
        Company id(String id);
    }

    interface Company {
        Optionals company(String company);
    }

    interface Optionals {
        Optionals description(String description);
        Optionals nif(String nif);
        Optionals address(String address);
        Optionals phone(String phone);
        Optionals email(String email);
        Optionals note(String note);
        Provider build();
    }
}
