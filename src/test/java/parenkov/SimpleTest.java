package parenkov;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import parenkov.config.SimpleTestConfig;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    private final SimpleTestConfig config =
            ConfigFactory.create(SimpleTestConfig.class, System.getProperties());

    @Test
    public void testTitle() {
        Configuration.browser = config.getBrowser();
        open(config.getBaseUrl());
        assertEquals("Selenide · GitHub", title());
    }
}