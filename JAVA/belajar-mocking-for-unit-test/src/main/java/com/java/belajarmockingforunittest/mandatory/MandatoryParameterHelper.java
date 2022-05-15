package com.java.belajarmockingforunittest.mandatory;

import lombok.Data;

import javax.servlet.http.HttpServletRequest;

public class MandatoryParameterHelper {

    public static MandatoryParameter getMandatoryParameter(HttpServletRequest request){
        MandatoryParameter parameter = new MandatoryParameter();
        parameter.setRequestId(request.getParameter("requestId"));
        parameter.setUsername(request.getParameter("username"));
        return parameter;
    }
}
