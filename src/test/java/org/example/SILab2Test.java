package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SILab2Test {

    //test1
    @Test
    void everyBranchTest1() {
        List<User> allUsers = new ArrayList<>();
        User user = null;
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user, allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    //test2
    @Test
    void everyBranchTest2() {
        List<User> allUsers = new ArrayList<>();
        User user = new User(null, "K1@345", "KujtimSaliu");
        assertFalse(SILab2.function(user, allUsers));
    }

        //test3
    @Test
    void everyBranchTest3() {
        List<User> allUsers = new ArrayList<>();
        User user = new User ("Kujtim", "K12 33", "kujtim.saliu@students.finki.ukim.mk");
        User user1 = new User ("Kujtim22", "654321", "kujtim.saliu@students.finki.ukim.mk");
        User user2 = new User ("Johny", "7654321", "kujtim.saliu@students.finki.ukim.mk");
        User user3 = new User ("Johny22", "11223344", "jonhy01@gmail.com");
        allUsers.add(user1);
        allUsers.add(user2);
        allUsers.add(user3);
        assertFalse(SILab2.function(user, allUsers));
    }

        //test4
    @Test
    void everyBranchTest4() {
        List<User> allUsers = new ArrayList<>();
        User user = new User ("johny", "johny", "JonhyJohn");
        assertFalse (SILab2.function(user, allUsers));
    }

        //test5
    @Test
    void everyBranchTest5() {
        List<User> allUsers = new ArrayList<>();
        User user = new User (null, "kujtim", "kujtim.saliu@students.finki.ukim.mk");
        assertFalse (SILab2.function(user, allUsers));
    }

    @Test
    void multipleConditionsTest() {
        //TXX
        List<User> users = new ArrayList<>();
        User user1 = null;
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user1, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));


        //FTX
        User user2 = new User ("kujtim", null, null);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user2, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));


        //FFT
        User user3 = new User("kujtim", "215019", null);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user3, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));


        //FFF
        User user4 = new User("kujtim", "215019", "kujtim.saliu@students.finki.ukim.mk");
        assertFalse(SILab2.function(user4, users));
    }
}