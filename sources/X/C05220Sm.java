package X;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: X.0Sm  reason: invalid class name and case insensitive filesystem */
public final class C05220Sm {
    public static Method A00;
    public static Method A01;
    public static Method A02;
    public static Method A03;

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            Class<Trace> cls2 = Trace.class;
            try {
                cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls3 = Long.TYPE;
                A02 = AnonymousClass001.A0r(cls2, cls3, "isTagEnabled", new Class[1], 0);
                Class[] clsArr = new Class[3];
                clsArr[0] = cls3;
                clsArr[1] = cls;
                Class cls4 = Integer.TYPE;
                A00 = AnonymousClass001.A0r(cls2, cls4, "asyncTraceBegin", clsArr, 2);
                Class[] clsArr2 = new Class[3];
                clsArr2[0] = cls3;
                clsArr2[1] = cls;
                A01 = AnonymousClass001.A0r(cls2, cls4, "asyncTraceEnd", clsArr2, 2);
                Class[] clsArr3 = new Class[3];
                clsArr3[0] = cls3;
                clsArr3[1] = cls;
                A03 = AnonymousClass001.A0r(cls2, cls4, "traceCounter", clsArr3, 2);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }
}
