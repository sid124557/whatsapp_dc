package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.33M  reason: invalid class name */
public class AnonymousClass33M {
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;
    public final boolean A04;

    public AnonymousClass33M(String str) {
        this(false);
        A0A(str);
    }

    public static AnonymousClass33M A00() {
        AnonymousClass33M r0 = new AnonymousClass33M(true);
        r0.A09();
        return r0;
    }

    public static AnonymousClass33M A01(String str) {
        return new AnonymousClass33M(str);
    }

    public static AnonymousClass33M A02(boolean z) {
        AnonymousClass33M r0 = new AnonymousClass33M(z);
        r0.A09();
        return r0;
    }

    public long A06() {
        StringBuilder A0o;
        String str;
        long uptimeMillis;
        long j = this.A00;
        long j2 = this.A01;
        long j3 = 0;
        if (j2 != 0) {
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            j3 = uptimeMillis - j2;
        }
        long j4 = j + j3;
        if (this.A03) {
            String str2 = this.A02;
            if (str2 != null) {
                A0o = AnonymousClass000.A0l(str2);
                str = "/timer/elapsed: ";
            } else {
                A0o = AnonymousClass001.A0o();
                str = "timer/elapsed: ";
            }
            C18260x0.A12(str, A0o, j4);
        }
        return j4;
    }

    public long A07() {
        long uptimeMillis;
        StringBuilder A0o;
        String str;
        long j = this.A01;
        if (j != 0) {
            long j2 = this.A00;
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            long j3 = j2 + (uptimeMillis - j);
            this.A00 = j3;
            if (this.A03) {
                String str2 = this.A02;
                if (str2 != null) {
                    A0o = AnonymousClass000.A0l(str2);
                    str = "/timer/stop: ";
                } else {
                    A0o = AnonymousClass001.A0o();
                    str = "timer/stop: ";
                }
                C18260x0.A12(str, A0o, j3);
            }
            this.A01 = 0;
        }
        return this.A00;
    }

    public long A08(String str) {
        long uptimeMillis;
        long j = this.A00;
        long j2 = this.A01;
        long j3 = 0;
        if (j2 != 0) {
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            j3 = uptimeMillis - j2;
        }
        long j4 = j + j3;
        if (this.A03) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("timer/mark/");
            A0o.append(str);
            String A0Z = AnonymousClass000.A0Z(": ", A0o, j4);
            String str2 = this.A02;
            if (str2 != null) {
                A0Z = AnonymousClass000.A0V("/", A0Z, AnonymousClass000.A0l(str2));
            }
            Log.i(A0Z);
        }
        return j4;
    }

    public void A09() {
        long uptimeMillis;
        String str;
        if (this.A01 == 0) {
            if (this.A03) {
                String str2 = this.A02;
                if (str2 != null) {
                    str = AnonymousClass000.A0X("/timer/start", AnonymousClass000.A0l(str2));
                } else {
                    str = "timer/start";
                }
                Log.d(str);
            }
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            this.A01 = uptimeMillis;
        }
    }

    public void A0A(String str) {
        this.A02 = str;
        this.A03 = true;
        A09();
    }

    public static void A03(AnonymousClass33M r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A07());
    }

    public static void A04(AnonymousClass33M r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A06());
        Log.d(sb.toString());
    }

    public static void A05(AnonymousClass33M r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A07());
        Log.i(sb.toString());
    }

    public AnonymousClass33M(boolean z) {
        this.A04 = z;
    }

    public AnonymousClass33M() {
        this(false);
    }
}
