package X;

/* renamed from: X.2xD  reason: invalid class name and case insensitive filesystem */
public class C59622xD {
    public final long A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public static C59622xD A00(C50092hc r6, long j) {
        long j2 = j;
        if (r6 != null) {
            return new C59622xD(j2, r6.A03, r6.A05, r6.A06, r6.A04);
        }
        return new C59622xD(j2, false, false, false, false);
    }

    public C59622xD(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = z2;
        this.A04 = z3;
        this.A01 = z;
        this.A03 = z4;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Connectivity{connected=");
        A0o.append(this.A01);
        A0o.append(", roaming=");
        A0o.append(this.A02);
        A0o.append(", typeWifi=");
        A0o.append(this.A04);
        A0o.append(", typeMobile=");
        A0o.append(this.A03);
        A0o.append(", ntpEventTimeMillis=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }
}
