package testlombok;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;

/**
 * @Author: Jason
 * @Date: 2022/11/16 1:59 01 59
 */

@Data
@Accessors(chain = true)
@FieldNameConstants // ==> ??
public class LombokConstant implements Serializable {
    private String name;
    private Integer age;

    public static void main(String[] args) {
        System.out.println(Fields.name);
        System.out.println(Fields.age);
    }
}