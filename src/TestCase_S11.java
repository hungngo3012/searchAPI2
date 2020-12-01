package com.company;

public class TestCase_S11 {
    public static void Unittest_S11() throws Exception {
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417", "308abcd910", "12rt");
        String token = res.data1.token;

        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        int i;
        System.out.println("Unit test 10: CEN error");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if (!(res.code.equals("1001"))) throw new AssertionError();
        if (!(res.message.equals("Can not connect to DB"))) throw new AssertionError();
        System.out.println("Can not connect to internet");
    }
}