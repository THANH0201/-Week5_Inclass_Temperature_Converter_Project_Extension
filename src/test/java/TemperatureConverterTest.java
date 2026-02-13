import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
    TemperatureConverter temperatureConverter;

    @BeforeEach
    void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    @AfterEach
    void tearDown() {
        temperatureConverter = null;
    }

    @Test
    void fahrenheitToCelsius() {
        Assertions.assertEquals(0, temperatureConverter.fahrenheitToCelsius(32), 0.001);
    }

    @Test
    void celsiusToFahrenheit() {
        Assertions.assertEquals(32, temperatureConverter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    void isExtremeTemperature() {
        Assertions.assertTrue(temperatureConverter.isExtremeTemperature(-45));
        Assertions.assertTrue(temperatureConverter.isExtremeTemperature(55));
        Assertions.assertFalse(temperatureConverter.isExtremeTemperature(50));
    }

    @Test
    void kelvinToCelsius() {
        Assertions.assertEquals(126.85,temperatureConverter.kelvinToCelsius(400),0.001);
    }
}