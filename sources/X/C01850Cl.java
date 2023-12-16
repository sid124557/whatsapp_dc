package X;

/* renamed from: X.0Cl  reason: invalid class name and case insensitive filesystem */
public class C01850Cl extends AnonymousClass0OD {
    public float A00;
    public float A01;
    public final /* synthetic */ AnonymousClass0YF A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C01850Cl(AnonymousClass0YF r1, float f, float f2) {
        super(r1);
        this.A02 = r1;
        this.A00 = f;
        this.A01 = f2;
    }

    public void A00(String str) {
        AnonymousClass0YF r5 = this.A02;
        if (r5.A0p()) {
            AnonymousClass0TM r4 = r5.A02;
            if (r4.A05) {
                r5.A00.drawText(str, this.A00, this.A01, r4.A00);
            }
            AnonymousClass0TM r42 = r5.A02;
            if (r42.A06) {
                r5.A00.drawText(str, this.A00, this.A01, r42.A01);
            }
        }
        this.A00 += r5.A02.A00.measureText(str);
    }
}
