package GirlFriend1;

public class GirlFriend {
    String name;
    int age;
    String gender;

    public GirlFriend() {
        System.out.println("看看我执行了吗");
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setage(int age) {
        // if (a >= 18 && a <= 30)
        // age = a;
        // else
        // System.out.println("年龄不符");
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public void setname(String a) {
        name = a;
    }

    public String getname() {
        return name;
    }

    public void setgender(String a) {
        gender = a;
    }

    public String getgender() {
        return gender;
    }

    public void eat() {
        System.out.println("女朋友会吃饭");
    }

    public void sleep() {
        System.out.println("女朋友会睡觉");
    }
}
