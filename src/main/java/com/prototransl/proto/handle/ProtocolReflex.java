package com.prototransl.proto.handle;

/**
 * Created by IntelliJ IDEA.
 * User: Alex_
 * Date: 2017/11/6
 * Time: 16:26
 */
public interface ProtocolReflex {

    void reflex(Integer mType, Object obj);

    void reflex(Integer mType , Object clazz , Object ... otherParam);
}
