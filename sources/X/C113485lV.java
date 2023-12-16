package X;

import com.whatsapp.util.Log;

/* renamed from: X.5lV  reason: invalid class name and case insensitive filesystem */
public final class C113485lV implements AnonymousClass65A {
    public final C56722sS A00;
    public final C55382qG A01;
    public final C44692Xc A02;
    public final C59702xL A03;
    public final AnonymousClass31C A04;
    public final AnonymousClass4FS A05;

    public void BUN() {
        C52802m4 r2 = this.A00.A01;
        if (r2.A01() && r2.A03.A0X(5459) && !r2.A00()) {
            if (this.A04.A0I()) {
                this.A05.BkM(new C117125rQ(this, 14));
            } else {
                Log.d("bonsaiwaitlisthourlycron/not connected, ignore");
            }
        }
    }

    public C113485lV(C56722sS r2, C55382qG r3, C44692Xc r4, C59702xL r5, AnonymousClass31C r6, AnonymousClass4FS r7) {
        C18260x0.A0f(r7, r2, r6, r3, r5);
        C162457s7.A0J(r4, 6);
        this.A05 = r7;
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }
}
