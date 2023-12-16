package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.6Q8  reason: invalid class name */
public class AnonymousClass6Q8 extends C158267jh {
    public static final AnonymousClass6Q8 A00 = new AnonymousClass6Q8();
    public static final Object A01 = AnonymousClass002.A0D();

    public static final Dialog A00(Context context, DialogInterface.OnCancelListener onCancelListener, C162667sY r7, int i) {
        AlertDialog.Builder builder;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C161967qu.A01(context, i));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = context.getResources();
        int i2 = R.string.f11nameremoved;
        if (i != 1) {
            i2 = R.string.f11nameremoved;
            if (i != 2) {
                i2 = R.string.f11nameremoved;
                if (i != 3) {
                    i2 = 17039370;
                }
            }
        }
        String string = resources.getString(i2);
        if (string != null) {
            builder.setPositiveButton(string, r7);
        }
        String A02 = C161967qu.A02(context, i);
        if (A02 != null) {
            builder.setTitle(A02);
        }
        Object[] objArr = new Object[1];
        C18270x1.A1Q(objArr, i);
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", objArr), AnonymousClass6CA.A0N());
        return builder.create();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    public final void A07(PendingIntent pendingIntent, Context context, int i) {
        String A02;
        String format;
        int i2;
        Object[] objArr = new Object[2];
        ? A1Y = C18300x5.A1Y(objArr, i);
        objArr[1] = null;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", objArr), AnonymousClass6CA.A0N());
        if (i == 18) {
            new AnonymousClass6VV(context, this).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i == 6) {
                A02 = C161967qu.A03(context, "common_google_play_services_resolution_required_title");
            } else {
                A02 = C161967qu.A02(context, i);
            }
            if (A02 == null) {
                A02 = context.getResources().getString(R.string.f11nameremoved);
            }
            if (i == 6 || i == 19) {
                Object A002 = C161967qu.A00(context);
                Resources resources = context.getResources();
                String A03 = C161967qu.A03(context, "common_google_play_services_resolution_required_text");
                if (A03 == null) {
                    A03 = resources.getString(R.string.f11nameremoved);
                }
                Locale locale = resources.getConfiguration().locale;
                Object[] objArr2 = new Object[1];
                objArr2[A1Y] = A002;
                format = String.format(locale, A03, objArr2);
            } else {
                format = C161967qu.A01(context, i);
            }
            Resources resources2 = context.getResources();
            Object systemService = context.getSystemService("notification");
            C162177rO.A02(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            C05610Ue r2 = new C05610Ue(context, (String) null);
            r2.A0U = true;
            r2.A0E(true);
            r2.A0B(A02);
            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
            notificationCompat$BigTextStyle.A07(format);
            r2.A08(notificationCompat$BigTextStyle);
            PackageManager packageManager = context.getPackageManager();
            Boolean bool = C155557f6.A00;
            if (bool == null) {
                boolean z = false;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
                C155557f6.A00 = bool;
            }
            if (bool.booleanValue()) {
                r2.A07.icon = context.getApplicationInfo().icon;
                r2.A03 = 2;
                if (C155557f6.A00(context)) {
                    r2.A04(R.drawable.common_full_open_on_phone, resources2.getString(R.string.f11nameremoved), pendingIntent);
                } else {
                    r2.A09 = pendingIntent;
                }
            } else {
                r2.A07.icon = 17301642;
                r2.A0C(resources2.getString(R.string.f11nameremoved));
                r2.A05(System.currentTimeMillis());
                r2.A09 = pendingIntent;
                r2.A0A(format);
            }
            if (C154017cR.A00()) {
                synchronized (A01) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(R.string.f11nameremoved);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
                } else {
                    if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                    }
                    r2.A0K = "com.google.android.gms.availability";
                }
                notificationManager.createNotificationChannel(notificationChannel);
                r2.A0K = "com.google.android.gms.availability";
            }
            Notification A012 = r2.A01();
            if (i == 1 || i == 2 || i == 3) {
                C162117rH.A02.set(A1Y);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, A012);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public static AnonymousClass6Q8 A01() {
        return A00;
    }

    public static final void A02(Activity activity, Dialog dialog, DialogInterface.OnCancelListener onCancelListener, String str) {
        try {
            if (activity instanceof C003203q) {
                C08270df supportFragmentManager = ((C003203q) activity).getSupportFragmentManager();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                C162177rO.A03(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                supportErrorDialogFragment.A00 = dialog;
                supportErrorDialogFragment.A02 = onCancelListener;
                supportErrorDialogFragment.A1O(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        AnonymousClass6CN r1 = new AnonymousClass6CN();
        C162177rO.A03(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        r1.A00 = dialog;
        r1.A02 = onCancelListener;
        r1.show(fragmentManager, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (X.AnonymousClass6C9.A00(android.os.Build.VERSION.CODENAME) == 'T') goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C124416Ce A06(android.content.Context r6, X.C150327Qe r7) {
        /*
            r5 = this;
            java.lang.String r0 = "android.intent.action.PACKAGE_ADDED"
            android.content.IntentFilter r4 = new android.content.IntentFilter
            r4.<init>(r0)
            java.lang.String r0 = "package"
            r4.addDataScheme(r0)
            X.6Ce r3 = new X.6Ce
            r3.<init>(r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 >= r0) goto L_0x0034
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            char r1 = X.AnonymousClass6C9.A00(r0)
            r0 = 84
            if (r1 == r0) goto L_0x0034
            r6.registerReceiver(r3, r4)
        L_0x0024:
            r3.A00 = r6
            boolean r0 = X.C162117rH.A05(r6)
            if (r0 != 0) goto L_0x004a
            r7.A00()
            r3.A00()
            r0 = 0
            return r0
        L_0x0034:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 >= r0) goto L_0x0045
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            char r2 = X.AnonymousClass6C9.A00(r0)
            r1 = 84
            r0 = 0
            if (r2 != r1) goto L_0x0046
        L_0x0045:
            r0 = 2
        L_0x0046:
            r6.registerReceiver(r3, r4, r0)
            goto L_0x0024
        L_0x004a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Q8.A06(android.content.Context, X.7Qe):X.6Ce");
    }
}
