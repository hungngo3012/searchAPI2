
package com.company;

public class TestCase_S2 {
    public static void UnitTest_S2() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.data1[2];
        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        System.out.println("Unit test 2: Token is incorrect");
        if(token.length() < 6){
            ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
            if (!(ress.code.equals("9998"))) throw new AssertionError();
            if (((!res.code.equals("1000")))) throw new AssertionError();
        }
    }
}
