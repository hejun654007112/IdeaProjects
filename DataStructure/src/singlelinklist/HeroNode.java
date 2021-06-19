package singlelinklist;

public class HeroNode {
    //人物的编号
    private int no;
    //人物的名字
    private  String name;
    //人物的昵称
    private  String nickName;
    //下一个节点
    private HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }


}
