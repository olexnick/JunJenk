package Suite.All;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import pages.ReturnState;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@TestMethodOrder(Alphanumeric.class)
public class Page1Test {
    private ReturnState returnState = new ReturnState();

    String roleTest = "artist";

    @Test

    public void maiE() {
        String[] res = demo("artist");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[1]);
            System.out.println("-------------------------------------------");
        }
    }


    public static String[] demo(String role) {
        String[] xs;
        switch (role) {
            case "artist":
                return xs = new String[]{"ArtistRim@gmail.com", "Qwerty1!"};
            case "fan":
                return xs = new String[]{"DanielFan@gmail.com", "Qwerty1!"};
            case "loginFanPremium":
                return xs = new String[]{"fanpremiumEva@gmail.com", "Qwerty1!"};
        }
        return null;
    }



    @Test
    @DisplayName(value = "Pageeee")
    public void apageTest() {
        System.out.println("страница 13 ");
    }

    @Test
    @DisplayName(value = "Pageeee")
    public void bpageTest() {
        System.out.println("страница 1 ");
        assertEquals("", "");
    }

    @Test
    public void AssertText() {
        System.out.println(returnState.returnText());
    }


    @ParameterizedTest
    @MethodSource("argsProviderFactory")
    void loginArtist(String argument) {
        assertNotNull(argument);
        System.out.println("argument " + argument);
    }

    static Stream<String> argsProviderFactory() {
        return Stream.of("alex", "brian");
    }


    public static Object[][] sumTestData() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        // 0 - это сам метод getStackTrace();
        // 1 - это вызываемый метод (calledMethod);
        // 2 - это вызывающий (родительский) метод (callerMethod).
        StackTraceElement stackTraceElement = stackTrace[2];
        System.out.println("2121" + stackTraceElement.getMethodName()); // callerMethod
        class Dummy {
        }
        ;
        String methodName = Dummy.class
                .getEnclosingMethod()
                .getName();

        System.out.println("Current Method is " + methodName);

        return new Object[][]{
                {"1", "2", "4"},
                {"10", "1", "11"},
                {"1000000", "-1000000", "0"}
        };
    }


    public Object[][] Login(String role) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[2];
        System.out.println("metod name " + stackTraceElement.getMethodName()); // callerMethod
        switch (stackTraceElement.getMethodName()) {
            case "artist":
                return new Object[][]{{"ArtistRim@gmail.com", "Qwerty1!"}};
            case "fan":
                return new Object[][]{{"DanielFan@gmail.com", "Qwerty1!"}};
            case "loginFanPremium":
                return new Object[][]{{"fanpremiumEva@gmail.com", "Qwerty1!"}};
        }
        return null;
    }

    @Test
    public void artist() {
        final Object[][] artists = Login("artist");
//        System.out.println("iiejwijeiwj " + dpMethod());
    }

    @Test
    public void artistNew() {
        System.out.println("owpowopwowpow");

//        mapTheThings("artistNew");
        HashMap<String, String> map = (HashMap<String, String>) mapTheThings("artistNew");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }


    @Test
    public void maine() {
        System.out.println("232-133333333991");
        System.out.println(
                "Is number 92 greater than ten " +
                        "by absolute value? " +
                        isGreaterThanTenAbs("art"));

    }

    public static boolean isGreaterThanTenAbs(String n) {
        System.out.println("232-1991");
        if (n == "10") {
            System.out.println("243333");
            return true;

        }
        if (n != "-10") {
            System.out.println("323232");
            return true;
        }
        return false;

//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("Серега", "e");
//        map.put("Николай", "eeee");
//        return false;
    }

    public Map<String, String> mapTheThings(String keyWordE) {
        String keyWord = "eeeeess";
        String certainValue = "eeeesssd";
        Map<String, String> theThings = new HashMap<>();
        //do things to get the Map built
        theThings.put(keyWord, certainValue); //or something similar
        return theThings;
    }
//    @Test
//    public  void TAssertList(String args[]) {
//        getDataOnMainPageOnTheVoting();
//        List listInClassA = Suite.All.Page1Test.getDataOnMainPageOnTheVoting();
//        System.out.println("The List is " + listInClassA);
//    }
////    @Test
//    public  ArrayList<String> getDataOnMainPageOnTheVoting() {
//        System.out.println("---------------------------------");
//        ArrayList<String> dataMainHall = new ArrayList<String>();
//        dataMainHall.add("223");
//        dataMainHall.add("221");
//        dataMainHall.add("222");
//        dataMainHall.add("224");
//        System.out.println("test");
//        return dataMainHall;
//    }



}
