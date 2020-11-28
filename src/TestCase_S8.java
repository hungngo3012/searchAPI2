
package com.company;

public class TestCase_S8 {
    public static void Unittest_S8() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.data1.token;

        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        System.out.println("Unit test 8: image, video, describe error");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if(!(((ress.data.image.equals(null) && ress.data.described.equals(null))) || ress.data.described.equals(null))) {
            System.out.println(ress.data.id);
            System.out.println(ress.data.image);
            System.out.println(ress.data.video.url);
            System.out.println(ress.data.video.thump);
            System.out.println(ress.data.like);
            System.out.println(ress.data.comment);
            System.out.println(ress.data.is_liked);
            System.out.println(ress.data.author.id);
            System.out.println(ress.data.author.username);
            System.out.println(ress.data.author.avatar);
            }
        }
    }

