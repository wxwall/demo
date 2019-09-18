package com.ctrip.demo.demo.guava;

import com.google.common.base.MoreObjects;

/**
 * @Author xiaowei.wu
 * @Date 2019/1/23 13:35
 */
public class MoreObjectsTest {

        public static void main(String[] args) {
            Student st = new Student("小明",2);
            String s = MoreObjects.toStringHelper(st)
                    .add("name", st.getName())
                    .add("age", st.getAge())
                    .toString();
            System.out.println(s);
        }

    static class Student{

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
