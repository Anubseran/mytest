package cn.itcast.Dao;

public class UserDaoImpl {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init(){
        System.out.println("对象被加载了");
    }
    public void save(){
        System.out.println(name);
    }
    public void destroy(){
        System.out.println("对象被销毁了");
    }
}
