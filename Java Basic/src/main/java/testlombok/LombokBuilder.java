package testlombok;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

/**
 * @Author: Jason
 * @Date: 2022/11/16 1:51 01 51
 */

@ToString
@Builder
public class LombokBuilder {
    private String name;
    private Integer age;

    @Singular("addHobby")
    private List<String> hobbyList;

    public static void main(String[] args) {
        LombokBuilderBuilder lombokBuilderBuilder = LombokBuilder.builder().age(23).name("Tom").addHobby("Soccer").addHobby("Coding");
        System.out.println(lombokBuilderBuilder);
        System.out.println();
    }

}