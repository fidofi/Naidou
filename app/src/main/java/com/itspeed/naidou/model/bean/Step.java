package com.itspeed.naidou.model.bean;

import com.itspeed.naidou.model.bean.JsonBean.Pic;

/**
 * Created by jafir on 15/9/14.
 */
public class Step {



    //描述
    private String description;


    private Pic pic;


    @Override
    public String toString() {
        return "Step{" +
                "description='" + description + '\'' +
                ", pic=" + pic +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pic getPic() {
        return pic;
    }

    public void setPic(Pic pic) {
        this.pic = pic;
    }
}


