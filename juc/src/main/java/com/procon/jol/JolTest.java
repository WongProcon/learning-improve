package com.procon.jol;

import lombok.extern.slf4j.Slf4j;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

/**
 * <p>java 对象布局测试</p>
 *
 * @author Procon
 * @version v1.0
 * @since 2022/7/11
 */

@Slf4j
public class JolTest {
    public static void main(String[] args) {
        Object o = new Object();
        log.info("当前虚拟机对象布局详情:\n{}", VM.current().details());
        //输出结果
        // OFF  SZ   TYPE DESCRIPTION               VALUE
        //  0   8        (object header: mark)     0x0000000000000001 (non-biasable; age: 0)  MarkWord  0-7
        //  8   4        (object header: class)    0xf80001e5                                 类型指针  8 -11
        // 12   4        (object alignment gap)                                               对齐填充 12-15
        //Instance size: 16 bytes
        log.info("对象布局详情:\n{},", ClassLayout.parseInstance(o).toPrintable());
    }
}
