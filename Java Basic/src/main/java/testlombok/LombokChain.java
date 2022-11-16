package testlombok;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author: Jason
 * @Date: 2022/11/16 1:57 01 57
 */
@Data
@Accessors(chain = true)
public class LombokChain {

    private String name;
    private Integer age;

    public static void main(String[] args) {
        LombokChain lombokChain = new LombokChain();
        lombokChain.setAge(23).setName("Tom");
        System.out.println(lombokChain);
    }

}