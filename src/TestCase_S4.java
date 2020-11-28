
package com.company;

public class TestCase_S4 {
    public static void Unittest_S4() throws Exception{
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = resp.data1.token;

        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        System.out.println("Unit test 4: The account was locked");
        ResponseSearch res = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if (!(res.code.equals("9995"))) throw new AssertionError();
        if (!(resp.code.equals("1000"))) throw new AssertionError();
        if (!(resp.message.equals("OK"))) throw new AssertionError();
    }
}
