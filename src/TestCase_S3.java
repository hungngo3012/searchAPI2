
package com.company;

public class TestCase_S3 {
    public static void UnitTest_S3() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.data1.token;
        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        System.out.println("Unit test 3: Cant't find data you are looking for");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if (!(res.code.equals("9994"))) throw new AssertionError();
        if (!(res.message.equals("No Data or end of list data"))) throw new AssertionError();
        System.out.println("Can't find anything matched");
    }
}