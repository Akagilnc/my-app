package com.mycompany.app;

/**
 * Created by deronlee on 3/3/16.
 */
public class PrintOnScreen {

    public String print (String message)
    {
        if (message == null || "".equals(message)){
            return Constant.PARAMETER_ERROR;
        }

        try {
            System.out.println(message);
        }
        catch (Exception ex)
        {
            return Constant.FAILED;
        }


        return Constant.SUCCESS;

    }


}
