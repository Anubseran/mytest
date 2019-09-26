package cn.itcast.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao dao = (UserDao) applicationContext.getBean("dao");
    }
}
