package singlelinklist;

public class HeroNodeDemo {
    public static void main(String[] args) {

        //创建单链表
        HeroNodeSingleList singleList = new HeroNodeSingleList();


        HeroNode heroNode1 = new HeroNode(1,"林冲","豹子头");
        HeroNode heroNode2 = new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode heroNode3 = new HeroNode(4,"吴用","智多星");
        HeroNode heroNode4 = new HeroNode(5,"鲁智深","花和尚");
        singleList.addByEnd(heroNode1);
        singleList.addByEnd(heroNode2);
        singleList.addByEnd(heroNode3);
        singleList.addByEnd(heroNode4);
        singleList.showSingleList();
        System.out.println("------------------------------------");
        HeroNode heroNode5 = new HeroNode(6,"秦明","霹雳火");
        singleList.addByNum(heroNode5);
        singleList.showSingleList();
        System.out.println("------------------------------------");
        HeroNode heroNode6 = new HeroNode(5,"jun","修仙者");
        singleList.updateByNum(heroNode6);
        singleList.showSingleList();
        System.out.println("------------------------------------");
        singleList.deleteByNum(4);
        singleList.showSingleList();
    }
}
