package X;

/* renamed from: X.30d  reason: invalid class name and case insensitive filesystem */
public class C613030d {
    public boolean A00;
    public boolean A01;
    public byte[] A02;
    public int[] A03;
    public final C30471mV A04;
    public transient boolean A05;

    public synchronized void A01() {
        this.A03 = null;
        this.A02 = null;
        C30471mV.A00(this.A04).A0N = false;
        this.A01 = true;
        this.A00 = true;
    }

    public synchronized void A02(byte[] bArr, int[] iArr) {
        if (iArr != null) {
            this.A03 = iArr;
        }
        if (bArr != null && bArr.length > 0) {
            C30471mV r1 = this.A04;
            if (!AnonymousClass2z0.A0C(r1) && ((r1 instanceof C31971pB) || (r1 instanceof C31951p9) || this.A03 != null)) {
                C30471mV.A00(r1).A0N = true;
                this.A02 = bArr;
                this.A00 = true;
            }
        }
        C30471mV.A00(this.A04).A0N = false;
        bArr = null;
        this.A02 = bArr;
        this.A00 = true;
    }

    public synchronized void A03(byte[] bArr, int[] iArr) {
        A02(bArr, iArr);
        this.A01 = true;
    }

    public synchronized boolean A05() {
        return this.A00;
    }

    public synchronized byte[] A06() {
        return this.A02;
    }

    public synchronized int[] A07() {
        return this.A03;
    }

    public boolean A04() {
        return C30471mV.A00(this.A04).A0N;
    }

    public C613030d(C30471mV r1) {
        this.A04 = r1;
    }

    public static boolean A00(C633138t r2) {
        if (AnonymousClass36O.A07(r2) || r2 == C633138t.A0f || r2 == C633138t.A0C || r2 == C633138t.A0j || r2 == C633138t.A0H || r2 == C633138t.A0e || r2 == C633138t.A0Z || r2 == C633138t.A0F || r2 == C633138t.A0G || r2 == C633138t.A07 || r2 == C633138t.A0M || r2 == C633138t.A0N || r2 == C633138t.A08 || r2 == C633138t.A0R) {
            return true;
        }
        return false;
    }
}
