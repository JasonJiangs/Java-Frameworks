package testlombok;


import lombok.*;

/**
 * @Author: Jason
 * @Date: 2022/11/16 1:49 01 49
 */

@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)  // no args constructor --> PRIVATE leads to singleton pattern
public class LombokTest {
    private String name;
    private Integer age;

    private static LombokTest instacne = new LombokTest();

    public static LombokTest getInstance() {
        return instacne;
    }

    public void printInstance() {
        System.out.println(instacne.toString());
    }

}

class LombokRun {
    public static void main(String[] args) {
        LombokTest instance = LombokTest.getInstance();
        instance.setAge(12);
        instance.setName("Tom");
        instance.printInstance();

        LombokTest instance1 = LombokTest.getInstance();
        System.out.println(instance1 == instance);
    }
}