package X;

/* renamed from: X.0gq  reason: invalid class name and case insensitive filesystem */
public class C09840gq implements C184778sV {
    public int A00;
    public long A01;
    public final /* synthetic */ AnonymousClass0Xd A02;

    public C09840gq(AnonymousClass0Xd r1, int i) {
        this.A02 = r1;
        this.A00 = i;
    }

    public void Bbr(C186458vL r12, C172488Li r13) {
        long j = r13.A05;
        long j2 = (long) this.A00;
        if (j < j2) {
            long j3 = this.A01;
            long j4 = r13.A04;
            if (j + j4 > j2) {
                j4 = j2 - j;
            }
            this.A01 = j3 + j4;
        }
    }

    public void Bbs(C186458vL r6, C172488Li r7) {
        C16820u1 r3;
        String A002;
        if (!(r7.A05 != 0 || (r3 = this.A02.A0B) == null || (A002 = AnonymousClass0JJ.A00(r7.A07)) == null)) {
            r3.B2o(C142536xM.PREFETCH_CACHE_EVICT, new AnonymousClass6L7(A002));
        }
        AnonymousClass0Xd r1 = this.A02;
        if (r1.A08() != null) {
            r1.A08().BjD(this, r7.A07);
        }
    }

    public void Bbt(C140846uc r1, C186458vL r2, C172488Li r3, C172488Li r4) {
    }
}
