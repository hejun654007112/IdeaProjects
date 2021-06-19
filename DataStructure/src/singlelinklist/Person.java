package singlelinklist;

public class Person {
    //人物的编号
    private int no;
    //人物的名字
    private  String name;
    //人物的性格
    private  String disposition;

    public Person(int no, String name, String disposition) {
        this.no = no;
        this.name = name;
        this.disposition = disposition;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    @Override
    public String toString() {
        return "Person{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", disposition='" + disposition + '\'' +
                '}';
    }
}
