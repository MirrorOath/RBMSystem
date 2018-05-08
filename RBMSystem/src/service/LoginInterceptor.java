package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import dao.tables.Employee;
import dao.tables.SystemUser;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub

    }

    private String getStr(HttpServletRequest request) {
        String strs[] = request.getRequestURI().toString().split("/");
        String str = "";
        for (int i = 2; i < strs.length; i++) {
            str = str + "/" + strs[i];
        }
        return "redirect:" + str;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) {

        Integer i = 1;
        if(i > 0)
            return true;
        System.out.println(getStr(request));
        if (request.getRequestURI().contains("getUser.action") 
                || request.getRequestURI().contains("conBase.action")
                || request.getRequestURI().contains("signUp.action")
                || request.getRequestURI().contains("signIn.action"))
            return true;
        HttpSession session = request.getSession(false);
        SystemUser admin = (SystemUser) session.getAttribute("admin");
        Employee userInfo = (Employee) session.getAttribute("userInfo");
        if (admin == null && userInfo == null)
            return false;

        if (userInfo != null) {
            if (request.getRequestURI().contains("beginTable.action")
                    || request.getRequestURI().contains("endTable.action"))
                return true;
            
            return false;
        }

        return true;
    }

}
