package X;

import android.graphics.Bitmap;

/* renamed from: X.5mj  reason: invalid class name and case insensitive filesystem */
public final class C114245mj implements C84584Cx {
    public final /* synthetic */ C186058ug A00;
    public final /* synthetic */ C95294tG A01;
    public final /* synthetic */ AnonymousClass6IG A02;
    public final /* synthetic */ AnonymousClass4XI A03;

    public C114245mj(C186058ug r1, C95294tG r2, AnonymousClass6IG r3, AnonymousClass4XI r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public String BDW() {
        String A022 = AnonymousClass31W.A02(this.A00);
        C162457s7.A0D(A022);
        return A022;
    }

    public Bitmap BJk() {
        if (this.A01.getTag() != this) {
            return null;
        }
        AnonymousClass6IG r2 = this.A02;
        int i = r2.A06;
        if (i == -1) {
            i = r2.A05;
        }
        if (i == -1) {
            return null;
        }
        Bitmap Bqg = this.A00.Bqg(this.A03.A02.A04);
        if (Bqg == null) {
            return C1457877h.A00;
        }
        return Bqg;
    }
}
