/*
 * Automatically generated by jrpcgen 0.95.1 on 12/18/01 7:23 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
package com.sleepycat.db.rpcserver;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class __db_put_msg implements XdrAble {
    public int dbpcl_id;
    public int txnpcl_id;
    public int keydlen;
    public int keydoff;
    public int keyulen;
    public int keyflags;
    public byte [] keydata;
    public int datadlen;
    public int datadoff;
    public int dataulen;
    public int dataflags;
    public byte [] datadata;
    public int flags;

    public __db_put_msg() {
    }

    public __db_put_msg(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(dbpcl_id);
        xdr.xdrEncodeInt(txnpcl_id);
        xdr.xdrEncodeInt(keydlen);
        xdr.xdrEncodeInt(keydoff);
        xdr.xdrEncodeInt(keyulen);
        xdr.xdrEncodeInt(keyflags);
        xdr.xdrEncodeDynamicOpaque(keydata);
        xdr.xdrEncodeInt(datadlen);
        xdr.xdrEncodeInt(datadoff);
        xdr.xdrEncodeInt(dataulen);
        xdr.xdrEncodeInt(dataflags);
        xdr.xdrEncodeDynamicOpaque(datadata);
        xdr.xdrEncodeInt(flags);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        dbpcl_id = xdr.xdrDecodeInt();
        txnpcl_id = xdr.xdrDecodeInt();
        keydlen = xdr.xdrDecodeInt();
        keydoff = xdr.xdrDecodeInt();
        keyulen = xdr.xdrDecodeInt();
        keyflags = xdr.xdrDecodeInt();
        keydata = xdr.xdrDecodeDynamicOpaque();
        datadlen = xdr.xdrDecodeInt();
        datadoff = xdr.xdrDecodeInt();
        dataulen = xdr.xdrDecodeInt();
        dataflags = xdr.xdrDecodeInt();
        datadata = xdr.xdrDecodeDynamicOpaque();
        flags = xdr.xdrDecodeInt();
    }

}
// End of __db_put_msg.java
