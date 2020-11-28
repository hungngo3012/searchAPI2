package com.company;

public class TestCase_S6 {
    public static void Unittest_S6() throws Exception{
        ResponseLogin resl = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = resl.data1.token;

        String keyword = "";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        System.out.println("Unit test 6: Not have keyword");
        if(keyword.equals("") || keyword == null) System.out.println("Not have keyword");
        else{
            ResponseSearch res = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
            assert "1004".equals(res.code):res.message+ " with code " + res.code;
        }
    }
}