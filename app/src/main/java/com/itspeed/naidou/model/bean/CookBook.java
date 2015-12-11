package com.itspeed.naidou.model.bean;

import java.util.ArrayList;

/**
 * Created by jafir on 15/9/14.
 */
public class CookBook {
    public CookBook() {
    }

    public CookBook(boolean isCollect, String title, String time, boolean isLike,int likes,int collects) {
        this.isCollect = isCollect;
        this.title = title;
        this.time = time;
        this.isLike = isLike;
        this.likedCount = likes;
        this.collectCount = collects;
    }


    //id
    private String  cid;
    //标题
    private String title;
    //时间
    private String time;
    //一级属性（父母、孩子）
    private String type1;
    //二级属性  父母--（备孕、孕初、孕中、孕晚、月子）
    //         孩子--（4-6月、7-8月、9-12月、1岁-2岁、3-6岁）
    private String type2;
    //点赞数
    private int likedCount;
    //是否收藏
    private boolean isCollect;
    //收藏数
    private int collectCount;
    //是否赞
    private boolean isLike;
    //食材
    private ArrayList<FoodMaterial> foods;
    //步骤
    private ArrayList<Step> steps;
    //步骤数
    private int stepCount;
    //分类
    private String cateName;
    //成品图
    private String productUrl;
    //用户
    private String fromWho;
    private String fromWhoId;
    private String fromWhoAvatar;

    //封面
    private String cover;
    //描述
    private String description;


    @Override
    public String toString() {
        return "CookBook{" +
                "cid='" + cid + '\'' +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", likedCount=" + likedCount +
                ", isCollect=" + isCollect +
                ", collectCount=" + collectCount +
                ", isLike=" + isLike +
                ", foods=" + foods +
                ", steps=" + steps +
                ", stepCount=" + stepCount +
                ", cateName='" + cateName + '\'' +
                ", productUrl='" + productUrl + '\'' +
                ", fromWho='" + fromWho + '\'' +
                ", fromWhoId='" + fromWhoId + '\'' +
                ", fromWhoAvatar='" + fromWhoAvatar + '\'' +
                ", cover='" + cover + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public int getLikedCount() {
        return likedCount;
    }

    public void setLikedCount(int likedCount) {
        this.likedCount = likedCount;
    }

    public boolean isCollect() {
        return isCollect;
    }

    public void setIsCollect(boolean isCollect) {
        this.isCollect = isCollect;
    }

    public int getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(int collectCount) {
        this.collectCount = collectCount;
    }

    public boolean isLike() {
        return isLike;
    }

    public void setIsLike(boolean isLike) {
        this.isLike = isLike;
    }

    public ArrayList<FoodMaterial> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<FoodMaterial> foods) {
        this.foods = foods;
    }

    public ArrayList<Step> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<Step> steps) {
        this.steps = steps;
    }

    public int getStepCount() {
        return stepCount;
    }

    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getFromWho() {
        return fromWho;
    }

    public void setFromWho(String fromWho) {
        this.fromWho = fromWho;
    }

    public String getFromWhoId() {
        return fromWhoId;
    }

    public void setFromWhoId(String fromWhoId) {
        this.fromWhoId = fromWhoId;
    }

    public String getFromWhoAvatar() {
        return fromWhoAvatar;
    }

    public void setFromWhoAvatar(String fromWhoAvatar) {
        this.fromWhoAvatar = fromWhoAvatar;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
