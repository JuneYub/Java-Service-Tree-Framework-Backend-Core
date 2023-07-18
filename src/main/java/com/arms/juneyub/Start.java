package com.arms.juneyub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Start {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Start() {
        logger.info("-------------------------------------------------- 테스트 -------------------");
        Tv tv = new Tv();
        tv.channel = 7;
        tv.channelDown();
        logger.info("현재 채널은 " + String.valueOf(tv.channel) +" 입니다.");

        logger.info("2단원 변수 문제1");
        Chappter2_Vairable chappter2_vairable = new Chappter2_Vairable();
        chappter2_vairable.homwork1();

        logger.info("3단원 연산자 문제1");
        Chappter3_Operator chappter3_operator = new Chappter3_Operator();
        chappter3_operator.homework1();
        logger.info("3단원 변수 문제2");
        chappter3_operator.homework2();
        logger.info("3단원 변수 문제3");
        chappter3_operator.homework3();
        logger.info("3단원 변수 문제4");
        chappter3_operator.homework4();


    }
}
