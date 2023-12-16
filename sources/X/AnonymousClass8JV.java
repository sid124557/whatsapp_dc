package X;

/* renamed from: X.8JV  reason: invalid class name */
public class AnonymousClass8JV implements C185518to {
    public int A00 = 0;
    public boolean A01;
    public final long A02;
    public final AnonymousClass7US A03;
    public final AnonymousClass3UQ A04;

    public long B4c() {
        if (this.A01) {
            return this.A04.B4c();
        }
        return this.A02;
    }

    public int B6N() {
        return this.A00;
    }

    public AnonymousClass7US B6Y() {
        if (!this.A01) {
            return this.A03;
        }
        return this.A04.A02;
    }

    public void BSM(boolean z, int i) {
        if (this.A01) {
            this.A04.BSM(z, i);
        }
        if (!z || this.A00 > 1) {
            this.A01 = true;
        }
        this.A00++;
    }

    public AnonymousClass8JV(AnonymousClass3UQ r10, String str, long j) {
        this.A03 = new AnonymousClass7US(str, str, "", (String) null, (String) null, "fallback", 0, false);
        this.A04 = r10;
        this.A02 = j;
    }
}
