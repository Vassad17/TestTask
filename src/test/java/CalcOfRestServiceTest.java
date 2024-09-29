import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.CalcOfRestService;


public class CalcOfRestServiceTest {

    @Test
    void shouldtestCalcOfRestService(
    ) {
        CalcOfRestService calcOfRestService = new CalcOfRestService();

        int income = 10_000;
        int expenses = 3000;
        int expected = 9;
        int actual = calcOfRestService.calculate(income, expenses);
    }
}
