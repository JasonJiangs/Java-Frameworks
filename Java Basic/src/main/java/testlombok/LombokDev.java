package testlombok;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.Synchronized;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Author: Jason
 * @Date: 2022/11/16 1:53 01 53
 */
public class LombokDev {

    @SneakyThrows
    public void thread() {
        Thread.sleep(1000);
    }

    @Synchronized
    public void concurrency() {
    }

    @SneakyThrows
    public void copyFile(String in, String out) {
        @Cleanup FileInputStream fileInputStream = new FileInputStream(in);
        @Cleanup FileOutputStream fileOutputStream = new FileOutputStream(out);
    }

}