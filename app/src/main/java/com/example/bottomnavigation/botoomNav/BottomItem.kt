package com.example.bottomnavigation.botoomNav

import com.example.myapplication.R


sealed  class BottomItem(val title: String, val iconId:Int,val route: String,val iconIdact:Int) {
    object screenShelf : BottomItem("Shelf", R.drawable.book_icon_0, "screen_Shelf",R.drawable.book_icon)
    object screenUser : BottomItem("User", R.drawable.profile_icon0, "screen_User",R.drawable.profile_icon)
    object screenSettings : BottomItem("Settings", R.drawable.setting_icon0, "screen_Settings",R.drawable.setting_icon)
}