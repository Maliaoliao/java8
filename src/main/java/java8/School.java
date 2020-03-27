package java8;

import java.util.List;
import java.util.Optional;

/**
 * description.
 *
 * @author: 1131375721@qq.com mall
 * @date: 2020-03-27 23:59
 **/
public class School {

    private String name;

    private String level;

    private Optional<Classes> classes;

    private Optional<List<String>> list;

    public Optional<List<String>> getList() {
        return list;
    }

    public void setList(Optional<List<String>> list) {
        this.list = list;
    }

    public Optional<Classes> getClasses() {
        return classes;
    }

    public void setClasses(Optional<Classes> classes) {
        this.classes = classes;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
