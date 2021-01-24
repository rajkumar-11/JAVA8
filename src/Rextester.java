//'main' method must be in a class 'Rextester'.
//openjdk version '11.0.5'

import java.util.*;
import java.lang.*;


/*
fixed input: LinkedList : 1->3->5->7->9->2->4->6->8->10
output: 1->2->3->4->5->-6>-7->8->9->10

*/
class Rextester
{
    public static void main(String args[])
    {
        Node node1= new Node(1,null);
        Node node2= new Node(3,null);
        Node node3= new Node(5,null);
        Node node4= new Node(7,null);
        Node node5= new Node(9,null);
        Node node6= new Node(2,null);
        Node node7= new Node(4,null);
        Node node8= new Node(6,null);
        Node node9= new Node(8,null);
        Node node10= new Node(10,null);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        node8.next=node9;
        node9.next=node10;

        Node node=node1;
        while(node!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();

        node= node1;

        while(node.next.data>node.data)
        {
            node=node.next;
        }
        Node start= node1;


        node=node.next;

        //   System.out.println(node.data+" adf");
        while(node.next!=null)
        {
            Node nodeA=start;
            Node nodeB=node;
            node=node.next;
            start=start.next;

            nodeA.next=nodeB;
            nodeB.next=start;







        }

        node=node1;

        while(node.next!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }




    }
    static   class Node
    {
        int data;
        Node next;

        public Node(int data, Node next)
        {
            this.data=data;
            this.next=next;
        }

    }
}

