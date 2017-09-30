package com.eccjt.baseconfig;

import com.jfinal.config.*;
import com.jfinal.template.Engine;

public class Config extends JFinalConfig{

    public void configConstant(Constants me){
        me.setDevMode(true);
    }
    public void configRoute(Routes me){

    }

    public void configEngine(Engine me){}
    public void configPlugin(Plugins me){}
    public void configInterceptor(Interceptors me){}
    public void configHandler(Handlers me){}
}
