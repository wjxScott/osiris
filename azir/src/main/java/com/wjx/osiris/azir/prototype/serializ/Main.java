package com.wjx.osiris.azir.prototype.serializ;

import com.wjx.qilin.result.Result;

/**
 * @author wangjinxin
 * @date 2021/3/16 12:01
 * @mail wjxScott@163.com
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Mail mail = Mail.builder()
                .title("first title")
                .receiver("first@163.com")
                .build();

        Message firstMessage = Message.builder()
                .subject("first subject")
                .content("first content")
                .build();

        mail.setMessage(firstMessage);

        Mail clonedMail = mail.cloneMail();

        Message secondMessage = clonedMail.getMessage();
        secondMessage.setSubject("modified subject");
        secondMessage.setContent("modified content");

        System.out.println(mail);
        System.out.println(Result.success(mail));
        System.out.println(clonedMail);
    }
}
