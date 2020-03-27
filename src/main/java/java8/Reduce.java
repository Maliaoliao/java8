package java8;

import org.junit.Test;

import java.util.*;

/**
 * 归约.
 *
 * @author: 1131375721 @qq.com mall
 * @date: 2020 -03-27 23:03
 */
public class Reduce {

    /**
     * 取出最小，最大值.
     */
    @Test
    public void test() {
        List<Integer> numbers = Arrays.asList(1, 2, 36, 78, 23, 787, 4, 5, 66);

        //最大值
        Optional<Integer> maxValue = numbers.stream().reduce(Integer::max);
        System.out.println(maxValue);
        //最小值
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println(min);
        //求和
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println(sum);

    }
}