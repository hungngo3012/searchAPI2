package com.company;

public class TestCase_S14 {
    public static void Unittest_S14() throws Exception {
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417", "308abcd910", "12rt");
        String token = res.data1.token;

        String keyword = "hb";
        String user_id = "348147";
        String index = "hud";
        int count= 2;
        System.out.println("Unit test 14: invalid index, count");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if (!(res.code.equals("1004"))) throw new AssertionError();
        if (!(res.message.equals("Parameter value is invalid"))) throw new AssertionError();
        System.out.println("index or count invalid");
    }
}