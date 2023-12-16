package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.List;

/* renamed from: X.2zr  reason: invalid class name and case insensitive filesystem */
public final class C61192zr {
    public final AnonymousClass5XC A00;
    public final C620633i A01;
    public final C54292oU A02;
    public final AnonymousClass33T A03;

    public final void A01() {
        NotificationManager A0A = this.A01.A0A();
        C626936e.A06(A0A);
        NotificationChannel notificationChannel = new NotificationChannel("inactive_accounts", C54292oU.A00(this.A02).getString(R.string.f11nameremoved), 4);
        notificationChannel.setLockscreenVisibility(0);
        notificationChannel.setShowBadge(true);
        A0A.createNotificationChannel(notificationChannel);
    }

    public final void A02() {
        NotificationManager A0A = this.A01.A0A();
        C626936e.A06(A0A);
        C162457s7.A0H(A0A);
        if (A00(A0A)) {
            A0A.deleteNotificationChannel("inactive_accounts");
        }
    }

    public final void A04(String str) {
        C162457s7.A0J(str, 1);
        try {
            this.A03.A06(64, str, "clear inactive account notifications");
        } catch (RuntimeException e) {
            Log.e("InactiveAccountNotification/clearNotifications/cancelfailed", e);
        }
    }

    public C61192zr(AnonymousClass5XC r1, C620633i r2, C54292oU r3, AnonymousClass33T r4) {
        C18260x0.A0c(r3, r2, r4, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
    }

    public static final boolean A00(NotificationManager notificationManager) {
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        C162457s7.A0D(notificationChannels);
        if (!(notificationChannels instanceof Collection) || !notificationChannels.isEmpty()) {
            for (NotificationChannel id : notificationChannels) {
                if (C162457s7.A0P(id.getId(), "inactive_accounts")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A03(Intent intent, C05480Tm r7, String str, String str2, String str3, int i, boolean z, boolean z2) {
        String str4;
        boolean A1V = C18320x8.A1V(str3);
        if (!z && Build.VERSION.SDK_INT >= 26) {
            NotificationManager A0A = this.A01.A0A();
            C626936e.A06(A0A);
            C162457s7.A0H(A0A);
            if (!A00(A0A)) {
                A01();
            }
        }
        Context context = this.A02.A00;
        if (z) {
            str4 = "critical_app_alerts@1";
        } else {
            str4 = "inactive_accounts";
        }
        C05610Ue r3 = new C05610Ue(context, str4);
        C18320x8.A0y(context, r3);
        r3.A02(3);
        r3.A0X = !z2;
        C18320x8.A17(r3, str2, str3, A1V);
        r3.A07.icon = R.drawable.notifybar;
        C18270x1.A0r(r3, str3);
        r3.A09 = C624735e.A04(context, intent, 0);
        r3.A03 = A1V ? 1 : 0;
        r3.A0C(str3);
        if (r7 != null) {
            r3.A0O.add(r7);
        }
        this.A03.A0A(str, 64, r3.A01());
        this.A00.A00(i, 15);
    }
}
