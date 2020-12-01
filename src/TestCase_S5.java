
package com.company;

public class TestCase_S5 {
    public static void Unittest_S5() throws Exception{
        ResponseLogin resl = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = resl.data1.token;
        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        System.out.println("Unit test 5: User id is incorrect");
        ResponseSearch res = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if (!(res.code.equals("1004"))) throw new AssertionError();
        if (!(res.message.equals("Parameter value is invalid"))) throw new AssertionError();
        System.out.println("incorrect user id");
    }
}