package java8;

import org.junit.Test;

import java.util.Optional;

/**
 * 集合操作.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-27 22:19
 **/
public class MusterHandle {


    @Test
    public void test(){
        //舍近求远
        User u = new User();
        u.setName("马里奥");
        Classes classes = new Classes();
        classes.setName(null);
        School school = new School();
        school.setName("清涧中学");
        school.setClasses(Optional.of(classes));
        Optional<School> s = Optional.of(school);
        Optional<User> user = Optional.of(u);
        user.map(User::getId);
        //school.getClass().getName();
        Optional<String> str = s.map(School::getLevel);

        String res = s.flatMap(School::getClasses).map(Classes::getName).orElse("null");
        //
        //s.flatMap(School::getList).flatMap(???????????);
        System.out.println(res);


    }
}
