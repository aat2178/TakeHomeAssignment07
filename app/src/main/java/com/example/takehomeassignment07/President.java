package com.example.takehomeassignment07;

public class President {
   private String name;
   private String info;
   private int photo;

   public President(String presName, String presInfo, int presPhoto){
       this.name = presName;
       this.info = presInfo;
       this.photo = presPhoto;
   }

   public String getName(){
       return name;
   }

    public String getInfo(){
        return info;
    }

    public int getPhotoId(){
        return photo;
    }
}
