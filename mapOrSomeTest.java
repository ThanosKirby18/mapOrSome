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
    @Test
    void simpleDoubleLinkedV4(){ // commit
//comment
        doubleLinked tester1 = new doubleLinked();
        tester1.addNodeBack(13);
        tester1.addNodeFront(20);

        assertTrue(tester1.printList().equals("20 13 "));


    }
    @Test
    void simpleDoubleLinkedV5(){ // commit
//comment
        doubleLinked tester1 = new doubleLinked();
        tester1.addNodeBack(13);
        tester1.addNodeFront(20);
        tester1.removeFromHead();

        assertTrue(tester1.printList().equals("13 "));


    }
    @Test
    void simpleDoubleLinkedV6(){ // commit
//comment
        doubleLinked tester1 = new doubleLinked();

        tester1.checkFirstVal();

        assertTrue(tester1.checkFirstVal().equals("There Is no First Value."));


    }
    @Test
    void simpleDoubleLinkedV7(){ // commit
//comment
        doubleLinked tester1 = new doubleLinked();

        tester1.checkFirstVal();

        assertTrue(tester1.checkFirstVal().equals("There Is no First Value."));


    }
    @Test
    void simpleDoubleLinkedV8(){ // commit
//comment
        doubleLinked tester1 = new doubleLinked();

        assertTrue(tester1.printList().equals("There are no Values in this List to Print."));


    }
    @Test
    void simpleDoubleLinkedV9(){ // commit
//comment
        doubleLinked tester1 = new doubleLinked();

        assertTrue(tester1.printList().equals("There are no Values in this List to Print."));


    }

    }

