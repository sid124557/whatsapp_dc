package com.facebook.msys.mci;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass15K;
import X.C18280x3;
import X.C18290x4;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;

public class NetworkUtils {
    public static native String getMqttSandboxDomain();

    public static native String getSandboxDomain();

    public static native synchronized void setMqttSandboxDomain(String str);

    public static native synchronized void setSandboxDomain(String str);

    public static Map flattenHeaders(Map map) {
        Object key;
        Object obj;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (A0w.getKey() != null) {
                List list = (List) A0w.getValue();
                if (list.size() == 1) {
                    key = A0w.getKey();
                    obj = C18290x4.A0k((List) A0w.getValue());
                } else if (list.size() > 1) {
                    StringBuilder sb = new StringBuilder(list.size() * 16);
                    for (int i = 1; i < list.size(); i++) {
                        sb.append(',');
                        sb.append(AnonymousClass001.A0n(list, i));
                    }
                    key = A0w.getKey();
                    obj = sb.toString();
                }
                A0t.put(key, obj);
            }
        }
        return A0t;
    }

    public static Pair httpHeaderMapToKeysAndValues(Map map) {
        Object[] objArr = new String[map.size()];
        Object[] objArr2 = new String[map.size()];
        Iterator A0q = AnonymousClass000.A0q(map);
        int i = 0;
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            objArr[i] = A0w.getKey();
            objArr2[i] = A0w.getValue();
            i++;
        }
        return AnonymousClass0x9.A0C(objArr, objArr2);
    }

    public static void markDataTaskCompleted(DataTask dataTask, NetworkSession networkSession, UrlResponse urlResponse, String str, byte[] bArr, File file, IOException iOException) {
        StringBuilder A0o = AnonymousClass001.A0o();
        if (bArr == null) {
            A0o.append(str);
            A0o.append("markDataTaskCompletedInExecution, id=%s");
            A0o.append(dataTask.mTaskIdentifier);
        } else {
            A0o.append(str);
            A0o.append("markDataTaskCompletedInExecution, id=%s, bytes=%d");
            A0o.append(dataTask.mTaskIdentifier);
            A0o.append(bArr.length);
        }
        C18280x3.A14(A0o);
        Execution.executeAsync(new AnonymousClass15K(dataTask, networkSession, urlResponse, str, bArr, file, iOException), 3);
    }

    public static UrlResponse newErrorURLResponse(UrlRequest urlRequest) {
        return new UrlResponse(urlRequest, 0, AnonymousClass001.A0t());
    }

    public static Map flattenHeaders(Header[] headerArr) {
        HashMap A0t = AnonymousClass001.A0t();
        for (Header header : headerArr) {
            A0t.put(header.getName(), header.getValue());
        }
        return A0t;
    }
}
