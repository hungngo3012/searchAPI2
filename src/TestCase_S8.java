
package com.company;

public class TestCase_S8 {
    public static void Unittest_S8() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.data1[2];

        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        int i;
        System.out.println("Unit test 8: image, video, describe error");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if(!((ress.data[1].equals("") && ress.data[7].equals("")) || (ress.data[1].equals(null) || ress.data[7].equals("")))) {
            for (i = 0; i <= 7; i++) {
                System.out.println(ress.data[i]);
            }
        }
    }
}
