import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import ru.netology.services.CalcOfRestService;


public class CalcOfRestServiceTest {

    @ParameterizedTest
    void shouldtestCalcOfRestService(
    ) {
        CalcOfRestService calcOfRestService = new CalcOfRestService();
        int expected = 9;
        int actual = calcOfRestService.calculate(10000, 3000);
    }
}
