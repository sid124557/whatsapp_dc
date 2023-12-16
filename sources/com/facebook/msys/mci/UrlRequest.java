package com.facebook.msys.mci;

import X.AnonymousClass001;
import com.facebook.simplejni.NativeHolder;
import java.util.HashMap;
import java.util.Map;

public class UrlRequest {
    public final NativeHolder mNativeHolder;

    private native String[] getHeaderKeys();

    private native String[] getHeaderValues();

    public native byte[] getHttpBody();

    public native String getHttpMethod();

    public native String getUrl();

    public UrlRequest(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public Map getHttpHeaders() {
        HashMap A0t = AnonymousClass001.A0t();
        String[] headerKeys = getHeaderKeys();
        String[] headerValues = getHeaderValues();
        if (!(headerKeys == null || headerValues == null)) {
            for (int i = 0; i < headerKeys.length; i++) {
                A0t.put(headerKeys[i], headerValues[i]);
            }
        }
        return A0t;
    }
}
