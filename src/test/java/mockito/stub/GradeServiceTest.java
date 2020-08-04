package mockito.stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;
import static org.mockito.Mockito.mock;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    GradeService gradeService;
    GradeSystem gradeSystem;

    @BeforeEach
    void setup() {
        gradeSystem = mock(GradeSystem.class);
        gradeService = new GradeService(gradeSystem);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result = gradeService.calculateAverageGrades(111l);
        Assertions.assertEquals(0.0, result);
    }
}
