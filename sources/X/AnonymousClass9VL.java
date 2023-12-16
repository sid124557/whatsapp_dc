package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9VL  reason: invalid class name */
public class AnonymousClass9VL {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final String A04;
    public final AtomicInteger A05;
    public final /* synthetic */ AnonymousClass9YN A06;

    public AnonymousClass9VL(AnonymousClass9YN r3, String str) {
        this.A06 = r3;
        this.A04 = str;
        this.A05 = new AtomicInteger(1);
        this.A03 = -1;
        r3.A0B.add(str);
    }

    public void A00() {
        AnonymousClass9YN r2;
        String str;
        C192359Ji A002 = C192359Ji.A00(this);
        String str2 = "CACHE";
        if (A002 == C192359Ji.QUERY_SUCCESSFULLY_COMPLETED) {
            if (!this.A02 || this.A01) {
                r2 = this.A06;
                str = AnonymousClass000.A0X(this.A04, AnonymousClass000.A0l("ttrc_source_for_"));
                str2 = "NETWORK";
                r2.BKb(str, str2);
            }
        } else if (A002 != C192359Ji.CACHE_DONE_NETWORK_PENDING || this.A00) {
            if (A002 != C192359Ji.QUERY_NOT_NEEDED) {
                this.A06.A06(AnonymousClass000.A0P(A002, "Unexpected call to addSourceAnnotation in state ", AnonymousClass001.A0o()));
                return;
            }
            return;
        }
        r2 = this.A06;
        str = AnonymousClass000.A0X(this.A04, AnonymousClass000.A0l("ttrc_source_for_"));
        r2.BKb(str, str2);
    }

    public final boolean A01(C192359Ji r6) {
        int ordinal = r6.ordinal();
        AtomicInteger atomicInteger = this.A05;
        boolean compareAndSet = atomicInteger.compareAndSet(0, ordinal);
        if (ordinal == 2) {
            return compareAndSet;
        }
        if (compareAndSet || atomicInteger.compareAndSet(2, ordinal) || atomicInteger.compareAndSet(1, ordinal)) {
            return true;
        }
        return false;
    }

    public AnonymousClass9VL(AnonymousClass9YN r4, String str, long j) {
        this.A06 = r4;
        if (j < 0) {
            r4.A06(AnonymousClass000.A0V("Negative Cache Recency Threshold Entered For Query: ", str, AnonymousClass001.A0o()));
        }
        r4.A0A.add(str);
        r4.BKa(AnonymousClass000.A0V("recency_threshold_for_", str, AnonymousClass001.A0o()), j);
        this.A04 = str;
        this.A05 = new AtomicInteger(0);
        this.A03 = j;
    }
}
