package es.upm.miw.pd.builder.provider;

import static org.junit.jupiter.api.Assertions.assertEquals;

import es.upm.miw.pd.builder.article.advanced_solution.Provider;
import org.junit.jupiter.api.Test;

class ProviderTest {

    @Test
    void testMandatory() {
        Provider provider = Provider.builder()
                .id("1")
                .company("Nintendo")
                .build();

        assertEquals("1", provider.getId());
        assertEquals("Nintendo", provider.getCompany());
    }

    @Test
    void testOptional() {
        Provider provider = Provider.builder()
                .id("2")
                .company("Nintendo")
                .description("World leader in innovative video games and consoles")
                .nif("123456789")
                .address("Kyoto, Japan")
                .phone("+81-75-1234-5678")
                .email("contact@nintendo.com")
                .note("Leading provider of video game hardware and software")
                .build();

        assertEquals("World leader in innovative video games and consoles", provider.getDescription());
        assertEquals("123456789", provider.getNif());
        assertEquals("Kyoto, Japan", provider.getAddress());
        assertEquals("+81-75-1234-5678", provider.getPhone());
        assertEquals("contact@nintendo.com", provider.getEmail());
        assertEquals("Leading provider of video game hardware and software", provider.getNote());
    }
}
