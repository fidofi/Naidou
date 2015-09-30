package com.itspeed.naidou.app.util;

import android.content.Context;
import android.content.Intent;

import com.itspeed.naidou.app.activity.SettingActivity;
import com.itspeed.naidou.app.activity.SimpleBackActivity;
import com.itspeed.naidou.app.domain.SimpleBackPage;

/**
 * Created by jafir on 15/9/27.
 */
public class UIHelper {


    /**
     * 显示设置
     * @param context
     */
    public static void  showSetting(Context context){
        Intent intent = new Intent(context,SettingActivity.class);
        context.startActivity(intent);
    }
    /**
     * 显示我的菜谱
     * @param context
     */
    public static void  showMyCookbook(Context context){
        SimpleBackActivity.postShowWith(context, SimpleBackPage.MY_COOKBOOK);
    }
    /**
     * 显示我的收藏
     * @param context
     */
    public static void showMyCollect(Context context) {
        SimpleBackActivity.postShowWith(context, SimpleBackPage.MY_COLLECT);
    }
    /**
     * 显示我的关注
     * @param context
     */
    public static void showFollow(Context context) {
        SimpleBackActivity.postShowWith(context, SimpleBackPage.FOLLOW);
    }

    /**
     * 显示编辑信息
     * @param context
     */
    public static void showEditInfo(Context context) {
        SimpleBackActivity.postShowWith(context, SimpleBackPage.EDITINFO);

    }
    /**
     * 显示意见反馈
     * @param context
     */
    public static void showFeedBack(Context context) {
        SimpleBackActivity.postShowWith(context, SimpleBackPage.FEED_BACK);

    }
    /**
     * 显示修改密码
     * @param context
     */
    public static void showModifyPwd(Context context) {
        SimpleBackActivity.postShowWith(context, SimpleBackPage.MODIFY_PWD);

    }
    /**
     * 显示关于我们
     * @param context
     */
    public static void showAbout(Context context) {
        SimpleBackActivity.postShowWith(context, SimpleBackPage.ABOUT);

    }
}
