package X;

/* renamed from: X.2pM  reason: invalid class name and case insensitive filesystem */
public class C54832pM {
    public long A00;
    public long A01;
    public long A02;
    public final long A03;
    public final long A04;

    public synchronized long A00() {
        return this.A02;
    }

    public synchronized long A01() {
        long j;
        this.A02++;
        long j2 = this.A00;
        j = this.A04;
        if (j2 <= j) {
            long j3 = this.A01 + j2;
            this.A01 = j3;
            long j4 = j3 - j2;
            this.A00 = j4;
            j = j3 - j4;
        }
        return j;
    }

    public synchronized void A02() {
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = this.A03;
    }

    public synchronized void A03(long j) {
        C626936e.A0C(AnonymousClass001.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        if (j < this.A02) {
            A02();
        }
        while (this.A02 < j) {
            A01();
        }
    }

    public C54832pM(long j, long j2) {
        boolean z = true;
        C626936e.A0C(AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        C626936e.A0C(j2 <= 0 ? false : z);
        this.A04 = j2;
        this.A03 = j;
        A02();
    }
}
