package com.sumayea.essen.Category.Japanese;

public class Model {

    private String Title;
    private String SubTitle;
    private int Img;

    public Model(){}

    public Model(String title, String subTitle, int img) {
        this.Title = title;
        this.SubTitle = subTitle;
        this.Img = img;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSubTitle() {
        return SubTitle;
    }

    public void setSubTitle(String subTitle) {
        SubTitle = subTitle;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }
}
