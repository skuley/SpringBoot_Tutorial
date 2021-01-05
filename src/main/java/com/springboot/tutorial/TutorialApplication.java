package com.springboot.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialApplication {

    /*
    * main() 함수가 SpringContext를 실행하며 TutorialApplication을 구동한다.
    * 첫번째 인자로는 주요 Spring component를 전달하고
    * 두번째 인자로 command-line 인자들을 전달한다
    * */

    public static void main(String[] args) {
        SpringApplication.run(TutorialApplication.class, args);
    }

}
