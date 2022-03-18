public class doubleLinked {

    private class Node {
        private int data;
        Node prev;
        Node next;
        //instance variables
        public int getData()
        {
            return data;
        }
        public Node(int data)
        {

            this.data = data;
        }

    }// closed private node
    Node head, tail = null;

    public void addNodeFront(int item)
    {
        Node newNode = new Node(item);
        if (head == null)
        {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else
        {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            head.prev = null;
        }

    }
    public void addNodeBack(int item)
    {
        Node newNode = new Node(item);
        if (head == null)
        {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }

    }
    public void removeFromHead()
    {
        Node curNode = head.next;
        if (head != null) {
            curNode.prev = null;
            head = curNode;
        }
        else
        {
            System.out.println("we cant do that");
        }

    }//end inner class Node
    public void removeFromTail() {
        Node curNode2 = tail.prev;
        if (head != null) {
            curNode2.next = null;
            tail = curNode2;
        } else {
            System.out.println("we cant do that");
        }
    }
    public String checkFirstVal() {
        Node thisCurrentVal = head;

        if (head == null) {
            return "There Is no First Value.";
        } else {
            return thisCurrentVal.data + "";

        }
    }


    public String printList() {
        Node currentVal = head;
        int number = 1;
        String list = "";
        if (head == null) {
            System.out.println("There are no Values in this List to Print.");
            return "There are no Values in this List to Print.";
        } else {
            System.out.println("This list contains");
            while (currentVal != null) {
                list += currentVal.data + " ";
                //System.out.println(currentVal.data + " is value #" + number);

                number++;
                currentVal = currentVal.next;
            }
            System.out.println(list);

        }
        System.out.println(list);
        return list;

    }

}

