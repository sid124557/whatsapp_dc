package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2sH  reason: invalid class name and case insensitive filesystem */
public class C56612sH {
    public final C380625j A00;
    public final C54412og A01;
    public volatile long A02;
    public volatile long A03;
    public volatile long A04;

    public static long A05(C56612sH r6, AnonymousClass36K r7) {
        return r7.A0e("expiration", (r6.A0H() + 2592000000L) / 1000) * 1000;
    }

    public static long A06(C66543Lv r1) {
        return r1.A0K.A0H();
    }

    public static long A07(C66493Lq r1) {
        return r1.A0M.A0H();
    }

    public static long A08(C621233o r1) {
        return r1.A0D.A0H();
    }

    public long A0D() {
        if (this.A04 != 0) {
            return this.A04 + SystemClock.elapsedRealtime();
        }
        return System.currentTimeMillis() - this.A03;
    }

    public long A0F() {
        if (this.A02 != 0) {
            long elapsedRealtime = this.A02 + SystemClock.elapsedRealtime();
            if (elapsedRealtime != 0) {
                return elapsedRealtime;
            }
        }
        return System.currentTimeMillis();
    }

    public C56612sH(C380625j r10, C54412og r11) {
        this.A00 = r10;
        this.A01 = r11;
        SharedPreferences sharedPreferences = r11.A01;
        this.A03 = sharedPreferences.getLong("client_server_time_diff", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("last_ntp_client_time", 0);
        if (sharedPreferences.contains("client_ntp_time_diff") && j > 0 && Math.abs(currentTimeMillis - j) < 86400000) {
            A0J(sharedPreferences.getLong("client_ntp_time_diff", 0));
        }
    }

    public static long A00(C56612sH r3) {
        return r3.A0H() / 1000;
    }

    public static long A01(C56612sH r3) {
        return r3.A0H() - 86400000;
    }

    public static long A02(C56612sH r3) {
        return r3.A0H() / ((long) 1000);
    }

    public static long A03(C56612sH r1, long j) {
        return r1.A0H() - j;
    }

    public static long A04(C56612sH r3, C624134x r4) {
        return r3.A0H() - r4.A0K;
    }

    public static Long A09(C56612sH r1) {
        return Long.valueOf(r1.A0H());
    }

    public static void A0A(C56612sH r0, String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(r0.A0H() - j);
        Log.d(sb.toString());
    }

    public long A0B() {
        return A0H();
    }

    public long A0C() {
        return System.currentTimeMillis();
    }

    public long A0E() {
        return SystemClock.elapsedRealtime();
    }

    public long A0G() {
        return SystemClock.uptimeMillis();
    }

    public final long A0H() {
        long j;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A02 != 0) {
            j = this.A02;
        } else if (this.A04 == 0) {
            return System.currentTimeMillis() - this.A03;
        } else {
            j = this.A04;
        }
        return j + elapsedRealtime;
    }

    public long A0I(long j) {
        return (j + System.currentTimeMillis()) - A0H();
    }

    public final void A0J(long j) {
        System.currentTimeMillis();
        A0H();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis + j;
        this.A02 = j2 - SystemClock.elapsedRealtime();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("app/time ntp update processed; diffClientNtp:");
        A0o.append(j);
        A0o.append(" device time: ");
        A0o.append(currentTimeMillis);
        C18260x0.A12(" ntp time: ", A0o, j2);
        System.currentTimeMillis();
        A0H();
    }

    public void A0K(long j, long j2) {
        System.currentTimeMillis();
        A0H();
        if (j > 0) {
            this.A04 = j - SystemClock.elapsedRealtime();
            this.A03 = j2 - j;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("app/time server update processed; diffClientWaServer:");
            A0o.append(this.A03);
            A0o.append(" device time: ");
            A0o.append(j2);
            C18260x0.A12(" server time: ", A0o, j);
            C54412og r0 = this.A01;
            C18270x1.A0i(C54412og.A00(r0), "client_server_time_diff", this.A03);
        }
        System.currentTimeMillis();
        A0H();
    }
}
