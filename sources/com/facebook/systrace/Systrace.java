package com.facebook.systrace;

import X.AnonymousClass6C7;
import X.AnonymousClass71S;
import X.AnonymousClass7VA;
import X.C154757dh;
import X.C155507f1;
import X.C159857ma;
import X.C161617q6;
import X.C173838Rw;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

public class Systrace {
    public static final ThreadLocal A00 = new C173838Rw();
    public static final AtomicInteger A01 = new AtomicInteger();
    public static final String[][] A02 = {new String[]{"com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onActivate", "com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onDeactivate"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerEnd"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsEnd"}};

    static {
        if (C155507f1.A03) {
            Method method = C155507f1.A02;
            AnonymousClass71S.A00(method);
            Object[] objArr = new Object[1];
            AnonymousClass6C7.A1V(objArr, 0, true);
            C155507f1.A00(method, objArr);
        }
        C161617q6.A00(5);
    }

    public static void A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            C154757dh.A00();
        }
        if ((32 & C161617q6.A02) == 0) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeEndSection();
        } else {
            C159857ma.A00("E");
        }
    }

    public static void A01(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            C154757dh.A00();
        }
        if ((32 & C161617q6.A02) == 0) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeBeginSection(str);
            return;
        }
        AnonymousClass7VA r3 = new AnonymousClass7VA('B');
        int myPid = Process.myPid();
        StringBuilder sb = r3.A00;
        sb.append('|');
        sb.append(myPid);
        r3.A00(str);
        C159857ma.A00(r3.toString());
    }

    public static void A02(String str, int i, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C154757dh.A00();
        }
        if ((64 & C161617q6.A02) == 0) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeTraceMetadata(str, str2, i);
            return;
        }
        AnonymousClass7VA r3 = new AnonymousClass7VA('M');
        int myPid = Process.myPid();
        StringBuilder sb = r3.A00;
        sb.append('|');
        sb.append(myPid);
        r3.A00(str);
        sb.append('|');
        sb.append(i);
        r3.A00(str2);
        C159857ma.A00(r3.toString());
    }
}
