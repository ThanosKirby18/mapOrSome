import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class mapOrSomeTest {
    @Test
    void simpleArrayList(){

        doubleLinked tester1 = new doubleLinked();
        tester1.addNodeBack(10);

        assertTrue(tester1.printList().equals("10 "));


    }
    @Test
    void simpleDoubleLinked(){

        doubleLinked tester1 = new doubleLinked();
        tester1.addNodeBack(10);
        tester1.addNodeBack(20);
        tester1.addNodeBack(30);
        tester1.addNodeBack(40);

        assertTrue(tester1.printList().equals("10 20 30 40 "));


    }
    @Test
    void simpleDoubleLinkedV2(){

        doubleLinked tester1 = new doubleLinked();
        tester1.addNodeBack(10);
        tester1.addNodeBack(20);
        tester1.addNodeBack(30);
        tester1.addNodeBack(40);

        assertTrue(tester1.printList().equals("10 20 30 40 "));


    }
    @Test
    void simpleDoubleLinkedV3(){ // commit
//comment
        doubleLinked tester1 = new doubleLinked();
        tester1.addNodeBack(10);
        tester1.addNodeBack(20);
        tester1.removeFromTail();
        tester1.addNodeBack(30);
        tester1.addNodeBack(40);

        assertTrue(tester1.printList().equals("10 30 40 "));


    }
}
