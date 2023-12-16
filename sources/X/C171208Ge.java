package X;

import android.graphics.Bitmap;

/* renamed from: X.8Ge  reason: invalid class name and case insensitive filesystem */
public final class C171208Ge implements C84584Cx {
    public final /* synthetic */ C186058ug A00;
    public final /* synthetic */ AnonymousClass4YX A01;

    public C171208Ge(C186058ug r1, AnonymousClass4YX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BDW() {
        String A02 = AnonymousClass31W.A02(this.A00);
        C162457s7.A0D(A02);
        return A02;
    }

    public Bitmap BJk() {
        AnonymousClass4YX r2 = this.A01;
        if (!C162457s7.A0P(r2.A03.getTag(), this)) {
            return null;
        }
        Bitmap Bqg = this.A00.Bqg(r2.A00);
        if (Bqg == null) {
            return C1457877h.A00;
        }
        return Bqg;
    }
}
