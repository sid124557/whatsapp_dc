package X;

import android.os.Build;
import com.facebook.systrace.TraceDirect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.7q6  reason: invalid class name and case insensitive filesystem */
public final class C161617q6 {
    public static final String A00 = "TraceConfig";
    public static final C157417iG A01 = new C157417iG();
    public static volatile long A02;

    static {
        if (Build.VERSION.SDK_INT < 30) {
            A00(3);
            C162477s9.A07(A00, "Registering systrace sysprop listener");
            C172578Lw r4 = new C172578Lw(3);
            if (C159907mf.A04) {
                Method method = C159907mf.A00;
                Object[] A0L = AnonymousClass002.A0L();
                A0L[0] = r4;
                if (method != null) {
                    try {
                        method.invoke((Object) null, A0L);
                    } catch (IllegalAccessException unused) {
                        C159907mf.A04 = false;
                    } catch (InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    public static void A00(int i) {
        boolean A012;
        long j;
        boolean z;
        String str;
        long j2 = A02;
        if (Build.VERSION.SDK_INT >= 30) {
            A012 = C1443771i.A00();
        } else {
            A012 = A01();
        }
        long A002 = C159907mf.A00("debug.fbsystrace.tags");
        if (!A012 || A002 == 0) {
            j = 0;
        } else {
            j = A002 | 1;
        }
        boolean z2 = false;
        if ((A02 != 0 || j == 0) && (j != 0 || A02 == 0)) {
            z = false;
        } else {
            z = true;
        }
        A02 = j;
        String str2 = A00;
        Object[] objArr = new Object[4];
        if (i == 1) {
            str = "sysprop";
        } else if (i == 2) {
            str = "broadcast";
        } else if (i == 3) {
            str = "init check";
        } else if (i != 4) {
            str = "force enable";
        } else {
            str = "section polling";
        }
        objArr[0] = str;
        AnonymousClass6C7.A1V(objArr, 1, z);
        objArr[2] = Long.valueOf(j2);
        AnonymousClass0x2.A1V(objArr, A02);
        C162477s9.A07(str2, String.format("Systrace trace config update - source:%s, changed:%b, enabledTags:0x%x->0x%x", objArr));
        if (z) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeSetEnabledTags(j);
            }
            if (i == 1 || i == 2) {
                z2 = true;
            }
            int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            C157417iG r6 = A01;
            if (i2 <= 0) {
                synchronized (r6.A01) {
                    r6.A00 = false;
                    int i3 = 0;
                    while (true) {
                        List list = r6.A02;
                        if (i3 < list.size()) {
                            list.get(i3);
                            i3++;
                        }
                    }
                }
            } else if (!z2) {
                r6.A00();
            } else {
                synchronized (r6.A01) {
                    Thread thread = new Thread(new C70083Zv(r6, C157417iG.A03.lastModified(), 0), "fbsystrace notification thread");
                    thread.setPriority(10);
                    thread.start();
                }
            }
        }
    }

    public static boolean A01() {
        long j = C155507f1.A00;
        if (!C155507f1.A03) {
            return false;
        }
        Method method = C155507f1.A01;
        AnonymousClass71S.A00(method);
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1Q(A0L, 0, j);
        Boolean bool = (Boolean) C155507f1.A00(method, A0L);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
