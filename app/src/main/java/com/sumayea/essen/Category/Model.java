package com.sumayea.essen.Category;

public class Model {

    private String title;
    private int img;



    public Model(String Title, int Image){

        title= Title;
        img= Image;
    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
