package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:config.properties")
public interface ServerConfig extends Config {

    @Key("url.otus")
    String urlOtus();

    @Key("buttonCourses")
    String buttonCourses();

    @Key("buttonInfra")
    String buttonInfra();

    @Key("buttonProgramming")
    String buttonProgramming();

    @Key("buttonIB")
    String buttonIB();

    @Key("buttonDS")
    String buttonDS();

    @Key("buttonManage")
    String buttonManage();

    @Key("buttonTest")
    String buttonTest();

    @Key("header")
    String header();
}