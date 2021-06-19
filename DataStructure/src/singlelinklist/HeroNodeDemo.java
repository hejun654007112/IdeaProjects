package singlelinklist;

public class HeroNodeDemo {
    public static void main(String[] args) {

        //创建单链表
        HeroNodeSingleList singleList = new HeroNodeSingleList();
        //定义头结点
        HeroNode head = singleList.getHead();

        HeroNode heroNode1 = new HeroNode(1,"林冲","豹子头");
        HeroNode heroNode2 = new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode heroNode3 = new HeroNode(4,"吴用","智多星");
        HeroNode heroNode4 = new HeroNode(5,"鲁智深","花和尚");
        singleList.addByEnd(head,heroNode1);
        singleList.addByEnd(head,heroNode2);
        singleList.addByEnd(head,heroNode3);
        singleList.addByEnd(head,heroNode4);
        singleList.showSingleList(head);
        System.out.println("------------------------------------");
        HeroNode heroNode5 = new HeroNode(6,"秦明","霹雳火");
        singleList.addByNum(head,heroNode5);
        singleList.showSingleList(head);
    }
}
