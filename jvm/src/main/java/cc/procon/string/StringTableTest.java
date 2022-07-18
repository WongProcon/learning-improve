package cc.procon.string;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>string</p>
 *
 * @author Procon
 * @version v1.0
 * @since 2022/7/15
 */


@Slf4j
public class StringTableTest {
    public static void main(String[] args) {
        String ab = new String("ab");
        ab.intern();
        String s2 = "ab";
        log.info(String.valueOf(ab==s2));
    }
}
