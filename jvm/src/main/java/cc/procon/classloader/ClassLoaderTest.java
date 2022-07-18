package cc.procon.classloader;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>classLoaderTest</p>
 *
 * @author Procon
 * @version v1.0
 * @since 2022/6/29
 */
@Slf4j
public class ClassLoaderTest  {
    public static void main(String[] args) throws InterruptedException {
        ClassLoader appClassloader = ClassLoader.getSystemClassLoader();
        //jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b
        log.info("系统类加载器内存地址:{}",appClassloader);
        //jdk.internal.loader.ClassLoaders$PlatformClassLoader@5679c6c6
        ClassLoader extClassLoader = appClassloader.getParent();
        log.info("扩展类加载器内存地址:{}",extClassLoader);
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        //null
        log.info("引导类加载器内存地址:{}",bootstrapClassLoader);
        Thread.sleep(100000);
    }
}
