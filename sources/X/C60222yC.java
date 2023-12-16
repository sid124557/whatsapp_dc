package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2yC  reason: invalid class name and case insensitive filesystem */
public class C60222yC {
    public static final int A06;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final int A04;
    public final AnonymousClass7NA A05;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || !(obj instanceof C60222yC)) {
                return false;
            }
            C60222yC r9 = (C60222yC) obj;
            AnonymousClass7NA r6 = this.A05;
            int i = r6.A00;
            AnonymousClass7NA r5 = r9.A05;
            if (!(i == r5.A00 && r6.A03.equals(r5.A03) && r6.A02.equals(r5.A02) && this.A02 == r9.A02 && this.A03 == r9.A03 && this.A01 == r9.A01 && this.A00 == r9.A00 && r6.A01.equals(r5.A01))) {
                return false;
            }
        }
        return true;
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A06 = (int) timeUnit.toHours(7);
        timeUnit.toMillis(90);
    }

    public C60222yC(C61202zs r2, String str, String str2, int i, int i2, int i3, int i4, long j, long j2) {
        AnonymousClass7NA r0 = new AnonymousClass7NA(r2, str, str2, i);
        this.A02 = j;
        this.A03 = j2;
        this.A01 = i2;
        this.A00 = i3;
        this.A05 = r0;
        this.A04 = i4;
    }

    public final int hashCode() {
        return this.A05.A00;
    }
}
