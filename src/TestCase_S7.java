
package com.company;

import java.lang.String;

public class TestCase_S7 {
    public static void Unittest_S7() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.data1.token;

        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        int i;
        System.out.println("Unit test 7: invalid author id");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if(ress.data.id == null || ress.data.id.equals("")) ress.data.id = "12345678999";
        if(ress.data.described == null || ress.data.described.equals("")) ress.data.described = "No describe";
        if(ress.data.image == null || ress.data.image.equals("")) ress.data.image = "djsahfie3";
        if(ress.data.comment == null || ress.data.comment.equals("")) ress.data.comment = "good";
        if(ress.data.like == null || ress.data.like.equals("")) ress.data.like = "0";
        if(ress.data.is_liked == null || ress.data.is_liked.equals("")) ress.data.is_liked = "0";
        if(ress.data.video.url == null || ress.data.video.url.equals("")) ress.data.video.url = "http/:1111111";
        if(ress.data.video.thump == null || ress.data.video.thump.equals("")) ress.data.video.thump = "fjdskjd";
        if(ress.data.author.username == null || ress.data.author.username.equals("")) ress.data.author.username = "HungNgo";
        if(ress.data.author.avatar == null || ress.data.author.avatar.equals("")) ress.data.author.avatar = "74920484hhh";
        if((!(ress.data.author.id == null)) || (!(ress.data.author.id == null))) {             //if id is not empty
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
}