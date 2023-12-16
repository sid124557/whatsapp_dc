package X;

import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import java.util.Locale;

/* renamed from: X.2sa  reason: invalid class name and case insensitive filesystem */
public class C56802sa {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public long A03;
    public long A04;
    public long A05;
    public AnonymousClass2P1 A06;
    public AnonymousClass2P1 A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final C620633i A0L;
    public final C56612sH A0M;
    public final AnonymousClass5ZR A0N;
    public final AnonymousClass1R1 A0O;

    public long A01() {
        long j = this.A04;
        if (j == -1) {
            return j;
        }
        if (j > this.A0M.A0H()) {
            return this.A04;
        }
        return 0;
    }

    public C56802sa A02() {
        String str = this.A0E;
        if ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str) || "channel_notification".equals(str)) {
            return this;
        }
        if (GroupJid.Companion.A03(str) != null) {
            return this.A0O.A0H();
        }
        C95804uY A012 = C95804uY.A03.A01(this.A0E);
        AnonymousClass1R1 r0 = this.A0O;
        if (A012 == null) {
            return r0.A0I();
        }
        C56802sa A0J2 = r0.A0J();
        if (A0J2.A0C == null) {
            A0J2.A0C = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A0J2.A0D)) {
            A0J2.A0D = "1";
        }
        if (TextUtils.isEmpty(A0J2.A0B)) {
            A0J2.A0B = Integer.toString(0);
        }
        if (!TextUtils.isEmpty(A0J2.A0A)) {
            return A0J2;
        }
        A0J2.A0A = "FFFFFF";
        return A0J2;
    }

    public String A03() {
        String str;
        if ((this.A0K && (str = this.A08) != null) || (str = A02().A08) != null) {
            if (C627536m.A0K(Uri.parse(str), this.A0L, this.A0N, false)) {
                return str;
            }
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI.toString();
    }

    public String A04() {
        if (!this.A0K || TextUtils.isEmpty(this.A09)) {
            return A02().A09;
        }
        return this.A09;
    }

    public String A05() {
        if (!this.A0K || TextUtils.isEmpty(this.A0A)) {
            return A02().A0A;
        }
        return this.A0A;
    }

    public String A06() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Integer.toString(0);
        }
        if (!this.A0K || TextUtils.isEmpty(this.A0B)) {
            return A02().A0B;
        }
        return this.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (X.C627536m.A0K(android.net.Uri.parse(r4), r5.A0L, r5.A0N, false) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A07() {
        /*
            r5 = this;
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x0008
            java.lang.String r4 = r5.A0C
            if (r4 != 0) goto L_0x0010
        L_0x0008:
            X.2sa r0 = r5.A02()
            java.lang.String r4 = r0.A0C
            if (r4 == 0) goto L_0x0026
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 >= r0) goto L_0x0025
            X.33i r3 = r5.A0L
            X.5ZR r2 = r5.A0N
            android.net.Uri r1 = android.net.Uri.parse(r4)
            r0 = 0
            boolean r0 = X.C627536m.A0K(r1, r3, r2, r0)
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56802sa.A07():java.lang.String");
    }

    public String A08() {
        if (!this.A0K || TextUtils.isEmpty(this.A0D)) {
            return A02().A0D;
        }
        return this.A0D;
    }

    public boolean A09() {
        if (this.A0I || !AnonymousClass000.A1S((A00() > 0 ? 1 : (A00() == 0 ? 0 : -1)))) {
            return true;
        }
        return false;
    }

    public boolean A0A() {
        if (!this.A0K) {
            return A02().A0F;
        }
        return this.A0F;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[19];
        objArr[0] = C627336j.A08(this.A0E);
        AnonymousClass001.A1Q(objArr, this.A03);
        AnonymousClass0x2.A1U(objArr, this.A04);
        objArr[3] = Boolean.valueOf(this.A0I);
        objArr[4] = Boolean.valueOf(this.A0K);
        objArr[5] = this.A0C;
        objArr[6] = this.A0D;
        objArr[7] = this.A0B;
        objArr[8] = this.A0A;
        objArr[9] = this.A08;
        objArr[10] = this.A09;
        objArr[11] = Boolean.valueOf(this.A0J);
        objArr[12] = Boolean.valueOf(this.A0H);
        objArr[13] = Long.valueOf(this.A05);
        objArr[14] = Boolean.valueOf(this.A0F);
        objArr[15] = Integer.valueOf(this.A01);
        objArr[16] = Boolean.valueOf(this.A0G);
        objArr[17] = Integer.valueOf(this.A00);
        objArr[18] = Integer.valueOf(this.A02);
        return String.format(locale, "jid: %s deleted:%d muteEndTime:%d showNotificationWhenMuted:%b useCustomNotification:%b messageTone:%s messageVibrate:%s messagePopup:%s messageLight:%s callTone:%s callVibrate:%s statusMuted:%b pinned:%b pinned_time:%d lowPriorityNotifications:%b mediaVisibility:%d muteReactions:%b autoMutedStatus: %d pushRecordingButtonMode: %d", objArr);
    }

    public C56802sa(C620633i r2, C56612sH r3, AnonymousClass5ZR r4, AnonymousClass1R1 r5) {
        this.A0M = r3;
        this.A0L = r2;
        this.A0O = r5;
        this.A0N = r4;
    }

    public long A00() {
        return A01();
    }
}
