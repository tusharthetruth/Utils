package `in`.textutils

import android.text.TextUtils

class TextUtils {
    companion object{
        fun isEmpty(param:String):Boolean{
            if(TextUtils.isEmpty(param)||param.equals("null")){
                return true
            }
            return false
        }
    }
}