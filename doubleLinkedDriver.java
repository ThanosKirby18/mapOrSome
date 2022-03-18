public class doubleLinkedDriver {
        public static void main(String[] args) {

            doubleLinked newList = new doubleLinked();
            newList.addNodeBack(10);
            newList.addNodeBack(20);
            newList.addNodeBack(30);
            newList.addNodeBack(40);
            newList.removeFromHead();
            newList.removeFromTail();
            newList.addNodeFront(0);
            newList.printList();
        }

}
