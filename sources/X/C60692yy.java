package X;

import android.content.SharedPreferences;

/* renamed from: X.2yy  reason: invalid class name and case insensitive filesystem */
public class C60692yy {
    public SharedPreferences A00;
    public final C56612sH A01;
    public final C60152y5 A02;

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A03("instrumentation");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public void A03(String str) {
        String A002 = A00(str, "auth/token");
        String A003 = A00(str, "auth/token_ts");
        String A004 = A00(str, "auth/encryption_key");
        String A005 = A00(str, "metadata/last_active_time");
        String A006 = A00(str, "metadata/delayed_notification_shown");
        String A007 = A00(str, "metadata/last_call_ranking_time");
        C18270x1.A0g(C18310x6.A0E(A01(), A002).remove(A003).remove(A004).remove(A005).remove(A006).remove(A007), A00(str, "metadata/last_message_ranking_time"));
    }

    public C60692yy(C56612sH r1, C60152y5 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public static String A00(String str, String str2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("/package/");
        A0o.append(str);
        return AnonymousClass000.A0V("/", str2, A0o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        r1 = r1.substring(9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A02() {
        /*
            r5 = this;
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            android.content.SharedPreferences r0 = r5.A01()
            java.util.Map r0 = r0.getAll()
            java.util.Iterator r2 = X.C18280x3.A0i(r0)
        L_0x0014:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            java.lang.String r0 = "/package/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 9
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r0 = "/"
            int r0 = r1.indexOf(r0)
            if (r0 < 0) goto L_0x0014
            java.lang.String r0 = X.AnonymousClass0x7.A0r(r1, r0)
            if (r0 == 0) goto L_0x0014
            r3.add(r0)
            goto L_0x0014
        L_0x003e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0042:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.String r2 = X.AnonymousClass001.A0m(r3)
            java.lang.String r0 = "auth/token"
            java.lang.String r1 = A00(r2, r0)
            android.content.SharedPreferences r0 = r5.A01()
            java.lang.String r0 = X.C18280x3.A0Z(r0, r1)
            if (r0 == 0) goto L_0x0042
            r4.add(r2)
            goto L_0x0042
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60692yy.A02():java.util.Set");
    }
}
