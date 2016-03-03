package com.mycompany.app;

/**
 * Created by deronlee on 3/3/16.
 */
public class PrintOnScreen {

    public boolean print (String message)
    {
        if (message == null || "".equals(message)){
            return false;
        }

        System.out.println(message);
        return true;

    }


}
