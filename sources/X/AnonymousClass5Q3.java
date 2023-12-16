package X;

/* renamed from: X.5Q3  reason: invalid class name */
public final class AnonymousClass5Q3 {
    public AnonymousClass316 A00;
    public final C59052wG A01;
    public final AnonymousClass1VX A02;

    public final void A00(String str) {
        if (this.A02.A0X(2396)) {
            AnonymousClass316 r1 = this.A00;
            if (r1 != null) {
                r1.A0E(4);
            }
            C47122ck r3 = new C47122ck(185473396);
            AnonymousClass316 A012 = this.A01.A01(r3, "QrScanFlow");
            this.A00 = A012;
            r3.A05 = true;
            C162457s7.A0H(A012);
            A012.A0F(str, -1);
            A012.A0C("entry_point", false, str);
            A012.A0A("scan_qr_code");
        }
    }

    public final void A01(short s) {
        AnonymousClass316 r1;
        if (this.A02.A0X(2396) && (r1 = this.A00) != null) {
            r1.A09("scan_qr_code");
            r1.A0E(s);
            this.A00 = null;
        }
    }

    public AnonymousClass5Q3(C59052wG r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
    }
}
