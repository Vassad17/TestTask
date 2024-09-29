import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.CalcOfRestService;


public class CalcOfRestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/count.csv")
    void shouldtestCalcOfRestService(int income, int expense, int expected, int balance){
        CalcOfRestService calcOfRestService = new CalcOfRestService();
        //int expected = 3;
        int actual = calcOfRestService.calculate( income , expected, balance);
    }
}
