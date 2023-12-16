package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5hX  reason: invalid class name and case insensitive filesystem */
public class C111095hX implements C184988ss {
    public AnonymousClass1VX A00;
    public final C69263Wi A01;
    public final C56612sH A02;

    public void A0C(Context context, Intent intent, String str) {
        boolean z = true;
        C626936e.A0E(AnonymousClass000.A1W(context), "Context must not be null");
        C626936e.A0E(AnonymousClass000.A1W(intent), "Intent cannot be null to launch the activity");
        if (str == null) {
            z = false;
        }
        C626936e.A0E(z, "Origin cannot be null");
        AnonymousClass5VI.A00(intent, str);
        A0A(context, intent);
    }

    public static Activity A00(Context context) {
        return A03(context, C009707r.class);
    }

    public static C89654ea A05(Context context) {
        return (C89654ea) A03(context, C89654ea.class);
    }

    public static void A06(Context context) {
        Intent A09 = AnonymousClass0x9.A09("android.intent.action.MAIN");
        A09.addCategory("android.intent.category.HOME");
        A09.setFlags(268435456);
        context.startActivity(A09);
    }

    public static void A07(View view, WindowManager windowManager) {
        int i;
        int identifier;
        if (view != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point A07 = AnonymousClass4L0.A07();
            defaultDisplay.getSize(A07);
            Resources A0G = C18290x4.A0G(view);
            if (!Build.MANUFACTURER.equalsIgnoreCase("Essential Products") || !Build.MODEL.equalsIgnoreCase("PH-1") || A0G.getConfiguration().orientation != 2 || (identifier = A0G.getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
                i = 0;
            } else {
                i = A0G.getDimensionPixelSize(identifier);
            }
            view.getLayoutParams().width = A07.x - i;
        }
    }

    public static void A08(Window window) {
        if (Build.VERSION.SDK_INT >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    public void A0A(Context context, Intent intent) {
        C69263Wi r1 = this.A01;
        if (!A09(context, intent)) {
            C86654Ky.A1J(r1);
        }
    }

    public void BkW(Context context, Uri uri, C624134x r7) {
        if (uri == null) {
            Log.e("activity-utils/start-activity/uri-is-null");
            return;
        }
        if (this.A00.A0X(2428)) {
            Intent A0D = C18310x6.A0D(uri);
            A0D.putExtra("com.android.browser.application_id", context.getPackageName());
            A0D.putExtra("create_new_tab", true);
            String host = uri.getHost();
            if (host != null && host.startsWith("www.")) {
                host = host.replace("www.", "");
            }
            String A0o = C18310x6.A0o(host, AnonymousClass5CW.A00);
            if (A0o != null) {
                try {
                    context.getPackageManager().getPackageInfo(A0o, 0);
                    A0D.setPackage(A0o);
                    if (A09(context, A0D)) {
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        Intent A0D2 = C18310x6.A0D(uri);
        A0D2.putExtra("com.android.browser.application_id", context.getPackageName());
        A0D2.putExtra("create_new_tab", true);
        C626936e.A06(A0D2);
        if (!A09(context, A0D2)) {
            Intent intent = new Intent(A0D2);
            intent.addCategory("android.intent.category.BROWSABLE");
            if (!A09(context, intent)) {
                this.A01.A0H(R.string.f11nameremoved, 0);
            }
        }
    }

    public C111095hX(C69263Wi r1, C56612sH r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public static Activity A01(Context context) {
        Activity A022 = A02(context);
        C162457s7.A0K(A022, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        return A022;
    }

    public static Activity A02(Context context) {
        Activity A002 = C621633u.A00(context);
        if (A002 != null) {
            return A002;
        }
        throw AnonymousClass001.A0e("The Context is not an Activity.");
    }

    public static Activity A03(Context context, Class cls) {
        Activity A022 = A02(context);
        if (cls.isAssignableFrom(A022.getClass())) {
            return A022;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("The Context is not assignable from class ");
        throw AnonymousClass000.A0I(cls.getSimpleName(), A0o);
    }

    public static Activity A04(View view) {
        return A02(view.getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if ((r6.getFlags() & 268435456) != 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A09(android.content.Context r5, android.content.Intent r6) {
        /*
            android.app.Activity r0 = X.C621633u.A00(r5)
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0012
            int r2 = r6.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r0
            r1 = 0
            if (r2 == 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            java.lang.String r0 = "Need to use activity context or FLAG_ACTIVITY_NEW_TASK flag"
            X.C626936e.A0E(r1, r0)
            r5.startActivity(r6)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x001c }
            goto L_0x0023
        L_0x001c:
            r1 = move-exception
            java.lang.String r0 = "app/try-start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111095hX.A09(android.content.Context, android.content.Intent):boolean");
    }

    public void A0B(Context context, Intent intent) {
        A0C(context, intent, C18310x6.A0n(context));
    }

    public boolean A0D(Activity activity, Intent intent, int i) {
        try {
            activity.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException | SecurityException e) {
            Log.e("app/start-activity-for-result ", e);
            this.A01.A0H(R.string.f11nameremoved, 0);
            return false;
        }
    }

    public void BkY(Context context, Uri uri, C624134x r3, int i, int i2) {
    }

    public void BkX(Context context, Uri uri, C624134x r3, int i) {
    }
}
