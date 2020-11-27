package com.company;

public class TestCase_S10 {
    public static void Unittest_S10() throws Exception {
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417", "308abcd910", "12rt");
        String token = res.data1[2];

        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        int i;
        System.out.println("Unit test 11: Cant connect to internet");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if (!(ress.code.equals("1011"))) throw new AssertionError();
        ress.data = null;
    }
}