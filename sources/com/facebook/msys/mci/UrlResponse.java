package com.facebook.msys.mci;

import X.C626936e;
import android.util.Pair;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public class UrlResponse {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(UrlRequest urlRequest, int i, String[] strArr, String[] strArr2);

    public UrlResponse(UrlRequest urlRequest, int i, Map map) {
        C626936e.A06(urlRequest);
        C626936e.A06(map);
        Pair httpHeaderMapToKeysAndValues = NetworkUtils.httpHeaderMapToKeysAndValues(map);
        this.mNativeHolder = initNativeHolder(urlRequest, i, (String[]) httpHeaderMapToKeysAndValues.first, (String[]) httpHeaderMapToKeysAndValues.second);
    }
}
