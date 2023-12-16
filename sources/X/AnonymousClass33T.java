package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.util.Base64;
import com.whatsapp.R;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.33T  reason: invalid class name */
public class AnonymousClass33T {
    public final C05540Tx A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass2Q5 A03;

    public void A04(int i, Notification notification) {
        boolean z = true;
        if (i == 1) {
            z = false;
        }
        A08(notification, (String) null, i, z);
    }

    public void A05(int i, String str) {
        A06(i, (String) null, str);
    }

    public void A0A(String str, int i, Notification notification) {
        A08(notification, str, i, true);
    }

    public static String A00(C95814uZ r1) {
        if (r1 == null) {
            return null;
        }
        try {
            return Base64.encodeToString(AnonymousClass0x7.A0t().digest(r1.getRawString().getBytes()), 0);
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public static void A01(PendingIntent pendingIntent, C05610Ue r1) {
        r1.A09 = pendingIntent;
        A02(r1, R.drawable.notifybar);
    }

    public static void A02(C05610Ue r0, int i) {
        r0.A07.icon = i;
    }

    public void A09(C95814uZ r3, String str) {
        int i = 1;
        if (r3 instanceof C95804uY) {
            i = 59;
        }
        A06(i, A00(r3), str);
    }

    public AnonymousClass33T(C56612sH r3, C54292oU r4, AnonymousClass33p r5, AnonymousClass2Q5 r6) {
        this.A01 = r3;
        this.A02 = r5;
        this.A03 = r6;
        this.A00 = new C05540Tx(r4.A00);
    }

    public static void A03(C05610Ue r0, AnonymousClass33T r1, int i) {
        r1.A04(i, r0.A01());
    }

    public void A06(int i, String str, String str2) {
        C615631i.A02();
        try {
            this.A00.A00.cancel(str, i);
            if (i == 1) {
                A06(59, str, str2);
            }
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "wanotificationmanager/cancelfailed/", e);
                return;
            }
            throw e;
        }
    }

    public void A07(Notification notification, C95814uZ r6) {
        String A002 = A00(r6);
        if (r6 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("wanotificationmanager/notify/");
            A0o.append(r6);
            C18260x0.A0q("/", A002, A0o);
        }
        int i = 1;
        if (r6 instanceof C95804uY) {
            i = 59;
        }
        A08(notification, A002, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (android.text.TextUtils.isEmpty(r8.getChannelId()) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(android.app.Notification r8, java.lang.String r9, int r10, boolean r11) {
        /*
            r7 = this;
            java.lang.String r2 = "wanotificationmanager/notifyfailed/"
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0014
            java.lang.String r0 = r8.getChannelId()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            X.C626936e.A0C(r0)
            X.0Tx r0 = r7.A00     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            r0.A00(r9, r10, r8)     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            X.33p r3 = r7.A02     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            X.2sH r0 = r7.A01     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            long r0 = r0.A0H()     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            android.content.SharedPreferences$Editor r4 = X.C18270x1.A03(r3)     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            java.lang.String r3 = "last_notif_posted_timestamp"
            X.C18270x1.A0i(r4, r3, r0)     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            if (r11 == 0) goto L_0x00e3
            X.2Q5 r3 = r7.A03     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            r0 = 4
            r5 = 6
            if (r10 != r0) goto L_0x0048
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
        L_0x003a:
            X.3dI r4 = r3.A03     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            r1 = 45
            X.3bx r0 = new X.3bx     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            r0.<init>(r3, r1, r5)     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            r4.execute(r0)     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            goto L_0x00d2
        L_0x0048:
            r0 = 23
            r4 = 21
            if (r10 == r0) goto L_0x00cc
            r1 = 27
            if (r10 == r1) goto L_0x00cc
            r0 = 51
            if (r10 == r0) goto L_0x00cc
            r0 = 5
            if (r10 == r0) goto L_0x00c4
            r0 = 46
            if (r10 == r0) goto L_0x00c4
            r0 = 9
            if (r10 == r0) goto L_0x00c1
            r0 = 40
            if (r10 == r0) goto L_0x00c1
            r0 = 43
            if (r10 == r0) goto L_0x00c1
            r0 = 44
            if (r10 == r0) goto L_0x00c1
            r6 = 15
            if (r10 == r6) goto L_0x00c1
            if (r10 == r4) goto L_0x00c1
            r0 = 24
            if (r10 == r0) goto L_0x00c1
            r4 = 28
            if (r10 == r4) goto L_0x00bb
            r0 = 29
            if (r10 == r0) goto L_0x00bb
            r0 = 30
            if (r10 == r0) goto L_0x00bb
            r0 = 37
            if (r10 == r0) goto L_0x00bb
            r0 = 38
            if (r10 == r0) goto L_0x00bb
            r0 = 47
            if (r10 == r0) goto L_0x00bb
            r0 = 26
            if (r10 == r0) goto L_0x00bb
            r0 = 17
            if (r10 == r0) goto L_0x00bb
            r0 = 22
            if (r10 == r0) goto L_0x00bb
            r0 = 16
            r6 = 20
            if (r10 == r0) goto L_0x00c6
            r0 = 31
            if (r10 != r0) goto L_0x00a8
            r6 = 25
            goto L_0x00c6
        L_0x00a8:
            r6 = 19
            if (r10 == r5) goto L_0x00c6
            r0 = 55
            if (r10 == r0) goto L_0x00cc
            r0 = 62
            if (r10 != r0) goto L_0x00b9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            goto L_0x003a
        L_0x00b9:
            r5 = 0
            goto L_0x003a
        L_0x00bb:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            goto L_0x003a
        L_0x00c1:
            r6 = 12
            goto L_0x00c6
        L_0x00c4:
            r6 = 13
        L_0x00c6:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            goto L_0x003a
        L_0x00cc:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ SecurityException -> 0x00e5, RuntimeException -> 0x00d3 }
            goto L_0x003a
        L_0x00d2:
            return
        L_0x00d3:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00e4
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1Q(r0, r2, r1)
        L_0x00e3:
            return
        L_0x00e4:
            throw r1
        L_0x00e5:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1Q(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33T.A08(android.app.Notification, java.lang.String, int, boolean):void");
    }
}
