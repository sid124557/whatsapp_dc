package X;

import android.os.SystemClock;
import java.net.URL;

/* renamed from: X.2sf  reason: invalid class name and case insensitive filesystem */
public class C56852sf {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = -1;
    public long A09 = -1;
    public long A0A = -1;
    public long A0B;
    public long A0C;
    public long A0D = -1;
    public long A0E = -1;
    public long A0F = -1;
    public long A0G;
    public long A0H = -1;
    public long A0I;
    public C625435m A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Exception A0M;
    public Float A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public Long A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public URL A0c;
    public boolean A0d;
    public boolean A0e;
    public final long A0f = SystemClock.elapsedRealtime();
    public final C633138t A0g;

    public final synchronized long A05() {
        return this.A05;
    }

    public final synchronized long A06() {
        return this.A0I;
    }

    public final synchronized void A0A(long j, long j2) {
        this.A0I = j;
        this.A05 += j2;
    }

    public final long A01() {
        long j = this.A0A;
        if (j != -1) {
            long j2 = this.A06;
            if (j2 != -1) {
                return j2;
            }
            if (this.A07 == -1) {
                return AnonymousClass0x7.A0E(j);
            }
        }
        return 0;
    }

    public final long A02() {
        long j = this.A0A;
        if (j != -1) {
            long j2 = this.A0F;
            if (j2 != -1) {
                return j2;
            }
            if (this.A07 == -1) {
                return AnonymousClass0x7.A0E(j);
            }
        }
        return 0;
    }

    public final long A03() {
        long j = this.A0A;
        if (j != -1) {
            long j2 = this.A0H;
            if (j2 != -1) {
                return j2;
            }
            if (this.A07 == -1) {
                return AnonymousClass0x7.A0E(j);
            }
        }
        return 0;
    }

    public final long A04() {
        long j = this.A0A;
        if (j == -1) {
            return 0;
        }
        long j2 = this.A07;
        if (j2 == -1) {
            j2 = SystemClock.elapsedRealtime();
        }
        return j2 - j;
    }

    public final void A07() {
        long j = this.A0A;
        if (j != -1) {
            this.A06 = AnonymousClass0x7.A0E(j);
            this.A03 = 1;
        }
    }

    public final void A08() {
        long j = this.A0D;
        if (j != -1) {
            this.A0S = C18310x6.A0f(SystemClock.elapsedRealtime(), j);
        }
    }

    public final void A09() {
        long j = this.A0A;
        if (j != -1) {
            this.A0F = AnonymousClass0x7.A0E(j);
        }
    }

    public final void A0B(Exception exc) {
        Class<?> cls;
        if (exc instanceof C1000359d) {
            Throwable cause = exc.getCause();
            if (cause == null) {
                cause = exc;
            }
            cls = cause.getClass();
        } else {
            if (exc != null) {
                cls = exc.getClass();
            }
            this.A0M = exc;
        }
        this.A0Y = cls.getName();
        this.A0M = exc;
    }

    public C56852sf(C633138t r3, int i) {
        boolean A1W = C18290x4.A1W(r3);
        this.A0g = r3;
        this.A00 = i;
        this.A02 = A1W ? 1 : 0;
    }

    public static void A00(C56852sf r1, Exception exc, URL url) {
        r1.A0B(exc);
        r1.A0b = C614230q.A00(url);
    }

    public final boolean A0C() {
        return AnonymousClass000.A1S((A01() > -1 ? 1 : (A01() == -1 ? 0 : -1)));
    }

    public String toString() {
        Long A0f2;
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("MMS type: ");
        A0o2.append(this.A0g);
        A0o2.append(' ');
        AnonymousClass000.A1B(A0o2, A0o);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("retry count: ");
        A0o3.append(this.A0G);
        A0o3.append(' ');
        AnonymousClass000.A1B(A0o3, A0o);
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append("network stack: ");
        A0o4.append(this.A02);
        A0o4.append(' ');
        AnonymousClass000.A1B(A0o4, A0o);
        StringBuilder A0o5 = AnonymousClass001.A0o();
        A0o5.append("connection type: ");
        A0o5.append(this.A0P);
        A0o5.append(' ');
        AnonymousClass000.A1B(A0o5, A0o);
        StringBuilder A0o6 = AnonymousClass001.A0o();
        A0o6.append("connection class: ");
        A0o6.append(this.A0X);
        A0o6.append(' ');
        AnonymousClass000.A1B(A0o6, A0o);
        StringBuilder A0o7 = AnonymousClass001.A0o();
        A0o7.append("url: ");
        A0o7.append(this.A0c);
        AnonymousClass000.A1B(A0o7, A0o);
        StringBuilder A0o8 = AnonymousClass001.A0o();
        A0o8.append("download time: ");
        A0o8.append(A04());
        AnonymousClass000.A1B(A0o8, A0o);
        StringBuilder A0o9 = AnonymousClass001.A0o();
        A0o9.append("queue time: ");
        long j = this.A0A;
        if (j == -1) {
            A0f2 = null;
        } else {
            A0f2 = C18310x6.A0f(j, this.A0f);
        }
        A0o9.append(A0f2);
        AnonymousClass000.A1B(A0o9, A0o);
        StringBuilder A0o10 = AnonymousClass001.A0o();
        A0o10.append("connection time: ");
        A0o10.append(A01());
        AnonymousClass000.A1B(A0o10, A0o);
        StringBuilder A0o11 = AnonymousClass001.A0o();
        A0o11.append("route selection delay: ");
        A0o11.append(this.A0V);
        AnonymousClass000.A1B(A0o11, A0o);
        StringBuilder A0o12 = AnonymousClass001.A0o();
        A0o12.append("network time: ");
        A0o12.append(A02());
        AnonymousClass000.A1B(A0o12, A0o);
        StringBuilder A0o13 = AnonymousClass001.A0o();
        A0o13.append("connection reused: ");
        A0o13.append(this.A0K);
        AnonymousClass000.A1B(A0o13, A0o);
        StringBuilder A0o14 = AnonymousClass001.A0o();
        A0o14.append("response code: ");
        A0o14.append(this.A0U);
        AnonymousClass000.A1B(A0o14, A0o);
        StringBuilder A0o15 = AnonymousClass001.A0o();
        A0o15.append("total bytes transferred: ");
        A0o15.append(this.A0I);
        AnonymousClass000.A1B(A0o15, A0o);
        StringBuilder A0o16 = AnonymousClass001.A0o();
        A0o16.append("media ip: ");
        C18270x1.A1C(this.A0b, A0o16, A0o);
        StringBuilder A0o17 = AnonymousClass001.A0o();
        A0o17.append("exception: ");
        C18270x1.A1C(this.A0Y, A0o17, A0o);
        StringBuilder A0o18 = AnonymousClass001.A0o();
        A0o18.append("download stage: ");
        A0o18.append(this.A03);
        AnonymousClass000.A1B(A0o18, A0o);
        StringBuilder A0o19 = AnonymousClass001.A0o();
        A0o19.append("download resume point: ");
        long j2 = this.A09;
        if (j2 == -1) {
            j2 = 0;
        }
        A0o19.append(j2);
        AnonymousClass000.A1B(A0o19, A0o);
        return C18290x4.A0o(A0o);
    }
}
