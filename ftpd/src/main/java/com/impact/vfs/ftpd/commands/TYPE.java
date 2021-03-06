package com.impact.vfs.ftpd.commands;

import com.impact.vfs.ftpd.CurrentInfo;


public class TYPE {
    
    public TYPE(CurrentInfo curCon, String str) {
        
        String type = str.substring(4).trim();
        curCon.transferType = type.charAt(0);
        if (!(curCon.transferType == CurrentInfo.ATYPE) && !(curCon.transferType == CurrentInfo.ITYPE)) {
            curCon.respond("501 Syntax error in parameters or arguments.");
            return;
        }
        
        curCon.respond("200 type set.");
    }
}
