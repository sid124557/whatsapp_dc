package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: X.0Y8  reason: invalid class name */
public class AnonymousClass0Y8 {
    public static int A04(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0RQ.A00(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static int A05(Context context, String str) {
        if (str == null) {
            throw AnonymousClass001.A0g("permission must be non-null");
        } else if (AnonymousClass0WZ.A01() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } else {
            if (new C05540Tx(context).A01()) {
                return 0;
            }
            return -1;
        }
    }

    public static Context A06(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnonymousClass0RR.A00(context);
        }
        return null;
    }

    public static Object A08(Context context, Class cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass0RQ.A01(context, cls);
        }
        String str = (String) AnonymousClass0JV.A00.get(cls);
        if (str != null) {
            return context.getSystemService(str);
        }
        return null;
    }

    public static Executor A09(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C02640Ha.A00(context);
        }
        return new C13660nX(new Handler(context.getMainLooper()));
    }

    public static void A0A(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass0HZ.A00(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static boolean A0B(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnonymousClass0RR.A01(context);
        }
        return false;
    }

    public static ColorStateList A07(Context context, int i) {
        return C06400Xn.A01(context.getTheme(), context.getResources(), i);
    }
}
