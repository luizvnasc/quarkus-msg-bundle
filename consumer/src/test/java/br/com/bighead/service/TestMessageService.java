package br.com.bighead.service;

import br.com.bighead.MessageService;
import br.com.bighead.messages.MessageProvider;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.inject.Inject;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class TestMessageService {

    @Inject
    MessageService service;

    private static Stream<Arguments> testCasesTestMessage() {

        return Stream.of(
                Arguments.of("John", MessageProvider.getMessages().hello("John")),
                Arguments.of("Bob", MessageProvider.getMessages().hello("Bob")),
                Arguments.of(null, MessageProvider.getMessages().hello(null))
        );
    }


    @DisplayName("Test Message service")
    @ParameterizedTest(name = "{index}: name={0}, result={1}, .")
    @MethodSource("testCasesTestMessage")
    public void TestMessage(String name, String msg) {
        var result = service.hello(name);
        assertEquals(msg,result);
    }

}
