package X;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

/* renamed from: X.0Tx  reason: invalid class name and case insensitive filesystem */
public final class C05540Tx {
    public static AnonymousClass0Z9 A02;
    public static String A03;
    public static Set A04 = AnonymousClass002.A0K();
    public static final Object A05 = AnonymousClass002.A0D();
    public static final Object A06 = AnonymousClass002.A0D();
    public final NotificationManager A00;
    public final Context A01;

    public void A00(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.A00.notify(str, i, notification);
            return;
        }
        Context context = this.A01;
        C07870cx r3 = new C07870cx(notification, context.getPackageName(), str, i);
        synchronized (A06) {
            AnonymousClass0Z9 r1 = A02;
            if (r1 == null) {
                r1 = new AnonymousClass0Z9(context.getApplicationContext());
                A02 = r1;
            }
            r1.A02.obtainMessage(0, r3).sendToTarget();
        }
        this.A00.cancel(str, i);
    }

    public boolean A01() {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnonymousClass0HV.A00(this.A00);
        }
        Context context = this.A01;
        Object systemService = context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class[] clsArr = new Class[3];
            Class cls2 = Integer.TYPE;
            clsArr[0] = cls2;
            clsArr[1] = cls2;
            Method A0r = AnonymousClass001.A0r(cls, String.class, "checkOpNoThrow", clsArr, 2);
            Object[] objArr = new Object[3];
            objArr[0] = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            AnonymousClass000.A1P(objArr, i, 1);
            objArr[2] = packageName;
            if (((Integer) A0r.invoke(systemService, objArr)).intValue() != 0) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public C05540Tx(Context context) {
        this.A01 = context;
        this.A00 = (NotificationManager) context.getSystemService("notification");
    }
}
