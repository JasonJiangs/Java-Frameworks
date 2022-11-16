package testlombok;

import lombok.val;
import lombok.var;

import java.util.ArrayList;

/**
 * @Author: Jason
 * @Date: 2022/11/16 1:55 01 55
 */
public class LombokObj {
    public static void main(String[] args) {
        val list = new ArrayList<String>();
        var name = "Hello word";
        var age = 23;
    }
}