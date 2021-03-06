package com.prototransl.proto.pack.adapter;

import com.prototransl.proto.pack.entity.Uint16;
import com.prototransl.proto.pack.entity.Uint32;
import com.prototransl.proto.pack.entity.Uint64;
import com.prototransl.proto.pack.entity.Uint8;

/**
 * Created by IntelliJ IDEA.
 * User: Alex_
 * Date: 2017/11/8
 * Time: 16:29
 */
public interface Unpack {

    String popString();

    Uint8 popUint8();

    Uint16 popUint16();

    Uint32 popUint32();

    Uint64 popUint64();

    boolean popBoolean();

    byte[] popBytes();

}
