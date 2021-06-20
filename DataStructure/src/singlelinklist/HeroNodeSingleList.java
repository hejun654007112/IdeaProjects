package singlelinklist;

/*
    以带有头结点的单链表的形式存储Person人物信息

 */
public class HeroNodeSingleList {
    //创建头结点
    private HeroNode listHead;

    public HeroNodeSingleList() {
        listHead = new HeroNode(0, "", "");
    }


    //遍历单链表
    public void showSingleList() {

        if (listHead.getNext() == null) {
            System.out.println("链表为空~~~");
            return;
        }
        HeroNode temp = listHead.getNext();
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    //直接在链表的尾部添加元素
    //思路：需要定义一个辅助指针，让他指向链表的最后
    public void addByEnd(HeroNode heroNode) {
        //定义一个辅助指针temp，初始化指向head节点
        HeroNode temp = listHead;
        while (true) {
            if (temp.getNext() == null) {
                break;
            }
            //temp指针向后移动
            temp = temp.getNext();
        }
        temp.setNext(heroNode);
    }

    //按序号添加元素,定义辅助指针，指向要添加元素的前一个位置
    public void addByNum(HeroNode heroNode) {
        //定义一个辅助指针temp，初始化指向head节点
        HeroNode temp = listHead;
        while (true) {
            if (temp.getNext() == null) {
                temp.setNext(heroNode);
                return;
            }
            if (heroNode.getNo() >= temp.getNo() && heroNode.getNo() < temp.getNext().getNo()) {
                break;
            }
            //temp指针向后移动
            temp = temp.getNext();
        }
        heroNode.setNext(temp.getNext());
        temp.setNext(heroNode);
    }

    //按序号修改英雄信息
    public void updateByNum(HeroNode heroNode) {
        //定义一个辅助指针temp，初始化指向head节点
        HeroNode temp = listHead.getNext();
        while (true){
            if (temp.getNo() == heroNode.getNo()){
                break;
            }
            temp = temp.getNext();
        }
        temp.setName(heroNode.getName());
        temp.setNickName(heroNode.getNickName());
    }
    //通过序号删除英雄元素
    //辅助指针temp,指向要删除元素的前一个位置
    public void deleteByNum(int num){
        //定义一个辅助指针temp，初始化指向head节点
        HeroNode temp = listHead;
        while (true){
            if (temp.getNext().getNo() == num){
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());
    }
}
