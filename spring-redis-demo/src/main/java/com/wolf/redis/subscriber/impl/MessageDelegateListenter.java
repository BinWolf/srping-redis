package com.wolf.redis.subscriber.impl;

import com.wolf.redis.subscriber.IMessageDelegateListenter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by zhenai on 2016/11/25.
 */
@Component("listener")
public class MessageDelegateListenter implements IMessageDelegateListenter {

    @Override
    public void handleMessage(Serializable message) {
        //什么都不做,只输出
        if(message == null){
            System.out.println("null");
        } else if(message.getClass().isArray()){
            System.out.println(Arrays.toString((Object[]) message));
        } else if(message instanceof List<?>) {
            System.out.println(message);
        } else if(message instanceof Map<? , ?>) {
            System.out.println(message);
        } else {
            System.out.println(ToStringBuilder.reflectionToString(message));
            System.out.println(message);
        }
    }
}
