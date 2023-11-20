package umc.study.base.handler;

import umc.study.base.Code;

public class TempHandler extends GeneralException {
    public TempHandler(Code errorCode){
        super(errorCode);
    }
}