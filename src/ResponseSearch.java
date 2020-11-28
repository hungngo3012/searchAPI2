package com.company;

public class ResponseSearch {
    String code;
    String message;
    Data data;
}

class Data{
    String id;
    String image;
    Video video;
    String like;
    String comment;
    String is_liked;
    Author author;
    String described;
}

class Video{
    String url;
    String thump;
}

class Author{
    String id;
    String username;
    String avatar;
}