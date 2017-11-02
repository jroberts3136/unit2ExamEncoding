package com.company;

/**
 * Created by jroberts3136 on 11/2/17.
 */
public class Code
{
    private String myCode;
    private String origCode;
    private String x;

    public Code(String code)
    {
        myCode = code;
        origCode = code;
        //possibly additional statements
    }

    public String getCode()
    {
        return myCode;
    }

        // precondition: p1 >= 0, p1 < p2
        // p2 <= myCode.length()
        // Replaces the characters in the code starting at
        // position p1 until position p2 - 1 inclusive with an X
    public void hide(int p1, int p2)
    {
        for (int i = p1; i < p2; i++){
            x += "X";
        }
        myCode = myCode.substring(0,p1) + x + myCode.substring(p2);
    }

        // precondition: p1 >= 0, p1 < p2
        // p2 <= myCode.length()
        // Restores to their original values the characters in
        // the code starting at position p1 until position
        // p2-1 inclusive
    public void recover(int p1, int p2)
    {
        myCode = myCode.substring(0,p1) + origCode.substring(p1, p2) + myCode.substring(p2);
    }
}