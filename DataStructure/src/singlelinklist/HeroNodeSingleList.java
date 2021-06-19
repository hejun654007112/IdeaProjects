package singlelinklist;
/*
    以带有头结点的单链表的形式存储Person人物信息

 */
public class HeroNodeSingleList {
    //创建头结点
    private HeroNode listHead;

    public HeroNode getHead(){
        if (listHead == null){
            listHead = new HeroNode(0,"","");
        }
        return listHead;
    }

    //遍历单链表
    public void showSingleList(HeroNode head){

        if ( head.getNext() == null){
            System.out.println("链表为空~~~");
            return;
        }
        HeroNode temp = head.getNext();
        while (true){
            if ( temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    //直接在链表的尾部添加元素
    //思路：需要定义一个辅助指针，让他指向链表的最后
    public void addByEnd(HeroNode head,HeroNode heroNode){
        //定义一个辅助指针temp，初始化指向head节点
        HeroNode temp = head;
        while (true){
            if (temp.getNext() == null){
                break;
            }
            //temp指针向后移动
            temp = temp.getNext();
        }
        temp.setNext(heroNode);
    }
    //按序号添加元素,定义辅助指针，指向要添加元素的前一个位置
    public void addByNum(HeroNode head,HeroNode heroNode){

        HeroNode temp = head;
        while (true){
            if (temp.getNext() == null){
                temp.setNext(heroNode);
                return;
            }
            if (heroNode.getNo() >= temp.getNo() && heroNode.getNo() < temp.getNext().getNo()){
                break;
            }
            //temp指针向后移动
            temp = temp.getNext();
        }
        heroNode.setNext(temp.getNext());
        temp.setNext(heroNode);


    }
}
