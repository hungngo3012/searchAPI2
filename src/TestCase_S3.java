
package com.company;

public class TestCase_S3 {
    public static void UnitTest_S3() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.data1[2];
        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        System.out.println("Unit test 3: Cant't find data you are looking for");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        assert "9994".equals(ress.code):ress.message+ " with code " + ress.code;
        System.out.println("Can't find anything matched");
    }
}