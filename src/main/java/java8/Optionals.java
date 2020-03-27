package java8;

import org.junit.Test;

import java.util.Optional;

/**
 * Optional对象.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-27 23:32
 **/
public class Optionals {


    @Test
    public void test(){
        /*User u = null;
        //Optional.of(u) 当对象为空的时候即可触发空指针异常
        Optional<User> user = Optional.of(u);
        u.getName();*/

        /*User u = new User();
        //Optional.of(u) 当对象为空的时候即可触发空指针异常
        Optional<User> user = Optional.of(u);
        System.out.println(u.getName());*/

        /*User u = null;
        //Optional.ofNullable(u) 创建的对象可以为
        Optional<User> user = Optional.ofNullable(u);
        System.out.println(u.getName());*/


        //Optional.empty(u) 创建的对象Optional
        Optional<User> user = Optional.empty();
        System.out.println(user.get().getName());

    }
}
