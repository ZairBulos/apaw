package es.upm.miw.pd.builder.article.advanced_solution;

public class Provider {
    private String id;
    private String company;
    private String description;
    private String nif;
    private String address;
    private String phone;
    private String email;
    private String note;

    public Provider() {}

    public static ProviderBuilders.Id builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public static class Builder implements ProviderBuilders.Id, ProviderBuilders.Company, ProviderBuilders.Optionals {
        private final Provider provider;

        public Builder() {
            this.provider = new Provider();
        }

        @Override
        public ProviderBuilders.Company id(String id) {
            this.provider.id = id;
            return this;
        }

        @Override
        public ProviderBuilders.Optionals company(String company) {
            this.provider.company = company;
            return this;
        }

        @Override
        public ProviderBuilders.Optionals description(String description) {
            this.provider.description = description;
            return this;
        }

        @Override
        public ProviderBuilders.Optionals nif(String nif) {
            this.provider.nif = nif;
            return this;
        }

        @Override
        public ProviderBuilders.Optionals address(String address) {
            this.provider.address = address;
            return this;
        }

        @Override
        public ProviderBuilders.Optionals phone(String phone) {
            this.provider.phone = phone;
            return this;
        }

        @Override
        public ProviderBuilders.Optionals email(String email) {
            this.provider.email = email;
            return this;
        }

        @Override
        public ProviderBuilders.Optionals note(String note) {
            this.provider.note = note;
            return this;
        }

        @Override
        public Provider build() {
            return this.provider;
        }
    }
}
