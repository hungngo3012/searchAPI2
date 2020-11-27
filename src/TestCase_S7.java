
package com.company;

import java.lang.String;

public class TestCase_S7 {
    public static void Unittest_S7() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.data1[2];

        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        int i;
        System.out.println("Unit test 7: invalid author id");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if(!(ress.data[6].indexOf("username") <= 4)) {             //if id is not empty
            for (i = 0; i <= 7; i++) {
                System.out.println(ress.data[i]);
            }
        }
    }
}