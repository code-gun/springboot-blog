import org.junit.jupiter.api.*;

public class JUnitCycleTest {

    @BeforeAll  // 전체 테스트를 실행하기 전에 1회 실행하므로 메서드는 static으로 선언
    // ex) 데이터베이스를 연결해야 하거나 테스트 환경을 초기화할 때 사용
    static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @BeforeEach // 테스트 케이스를 시작하기 전마다 실행
    // ex) 테스트 메서드에서 사용하는 객체를 초기화하거나 테스트에 필요한 값을 미리 넣을 때 사용
    public void beforeEach(){
        System.out.println("@BeforEach");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

    @AfterAll   // 전체 테스트를 마치고 종료하기 전에 1회 실행하므로 메서드는 static으로 선언
    // ex) 데이터베이스 연결을 종료할 때나 공통적으로 사용하는 자원을 해제할 때 사용
    static void afterAll(){
        System.out.println("@AfterAll");
    }

    @AfterEach  // 테스트 케이스를 종료하기 전마다 실행
    // ex) 테스트 이후에 특정 데이터를 삭제해야 하는 경우 사용
    public void afterEach(){
        System.out.println("@AfterEach");
    }

}
