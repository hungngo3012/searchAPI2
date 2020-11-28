
package com.company;

public class TestCase_S9 {
    public static void Unittest_S9() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.data1.token;

        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        int i;
        System.out.println("Unit test 8: image, video, describe error");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if(ress.data.image.equals("") || ress.data.image == null){
            ress.data.image = "djsahfie3";
        }
        if(ress.data.described.equals("") || ress.data.image == null){
            ress.data.described = "No describe";
        }
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
        System.out.println(ress.data.described);
    }
}