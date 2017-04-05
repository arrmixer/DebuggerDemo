package com.AE;

/**
 * Created by Angel on 4/1/17.
 */
public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c){
        sBuilder.append(c); // had this.sBuidler.append(c) caused a bug.. not updating the Parameter but the field..
        charsAdded++;
    }
}
