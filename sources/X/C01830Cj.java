package X;

import android.graphics.Path;

/* renamed from: X.0Cj  reason: invalid class name and case insensitive filesystem */
public class C01830Cj extends C01850Cl {
    public Path A00;
    public final /* synthetic */ AnonymousClass0YF A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C01830Cj(Path path, AnonymousClass0YF r3, float f) {
        super(r3, f, 0.0f);
        this.A01 = r3;
        this.A00 = path;
    }

    public void A00(String str) {
        AnonymousClass0YF r2 = this.A01;
        String str2 = str;
        if (r2.A0p()) {
            AnonymousClass0TM r1 = r2.A02;
            if (r1.A05) {
                r2.A00.drawTextOnPath(str2, this.A00, this.A00, this.A01, r1.A00);
            }
            AnonymousClass0TM r12 = r2.A02;
            if (r12.A06) {
                r2.A00.drawTextOnPath(str2, this.A00, this.A00, this.A01, r12.A01);
            }
        }
        this.A00 += r2.A02.A00.measureText(str);
    }
}
