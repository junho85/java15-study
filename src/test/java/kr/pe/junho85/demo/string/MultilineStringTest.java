package kr.pe.junho85.demo.string;

import org.junit.jupiter.api.Test;

public class MultilineStringTest {
    // Text Blocks
    @Test
    void test() {
        // @see https://www.infoq.com/articles/java-text-blocks/
        var hello = """
                hello world
                nice to meet you
                """;
        System.out.println(hello);
    }
}
