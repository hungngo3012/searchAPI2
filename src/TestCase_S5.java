
package com.company;

public class TestCase_S5 {
    public static void Unittest_S5() throws Exception{
        ResponseLogin resl = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = resl.data1[2];
        ;
        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        System.out.println("Unit test 5: User id is incorrect");
        ResponseSearch res = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        assert "1004".equals(res.code):res.message+ " with code " + res.code;
        System.out.println("incorrect user id");
    }
}