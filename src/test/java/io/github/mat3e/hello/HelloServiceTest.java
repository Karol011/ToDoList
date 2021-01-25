package io.github.mat3e.hello;

import io.github.mat3e.lang.Lang;
import io.github.mat3e.lang.LangRepository;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest {

    public static final String WELCOME = "Hello";


    @Test
    public void test_prepareGreeting_nullName_returnsGreetingWithFallbackName() {

        //given
        var mockRepository = alwaysReturningHelloRepository();
        var SUT = new HelloService(mockRepository);

        //when
        var result = SUT.prepareGreeting(null, -1);

        //then
        assertEquals(WELCOME + " " + HelloService.FALLBACK_NAME, result);
    }


    @Test
    public void test_prepareGreeting_name_returnsGreetingWithName() {

        //given
        var SUT = new HelloService();
        String name = "someRandomName";

        //when
        var result = SUT.prepareGreeting(name, -1);

        //then
        assertEquals(WELCOME + " " + name, result);
    }

 /*   @Test
    public void test_prepareGreeting_nonExistingLang_returnsGreetingWithFallbackLang() {
        //given
        final String welcomeMsg = "hey";
        var mockRepository = new LangRepository() {
            @Override
            public Optional<Lang> findById(final Integer id) {
                return Optional.of(new Lang(null, welcomeMsg, "666"));
            }
        };
        var SUT = new HelloService(mockRepository);
        var name = "randomName";

        //when
        var result = SUT.prepareGreeting(name, null);

        //then
        assertEquals(welcomeMsg + " " + name, result);

    }*/

    private LangRepository alwaysReturningHelloRepository() {
        return new LangRepository() {
            @Override
            public Optional<Lang> findById(final Integer id) {
                return Optional.of(new Lang(null, WELCOME, null));
            }
        };
    }
}
