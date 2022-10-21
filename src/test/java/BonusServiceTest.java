import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void shouldCalculateForRegisteredAndUnderLimit(long amount, long expected, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
//
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1_000_000_60;
//        boolean registered = true;
//        long expected = 500;
//
//        long actual = service.calculate(amount, registered);
//
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForNotRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1_000_000_60;
//        boolean registered = false;
//        long expected = 500;
//
//        long actual = service.calculate(amount, registered);
//
//
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForNotRegisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1_000_10;
//        boolean registered = false;
//        long expected = 10;
//
//        long actual = service.calculate(amount, registered);
//
//        assertEquals(expected, actual);
//    }

}