package X;

/* renamed from: X.3Lz  reason: invalid class name and case insensitive filesystem */
public final class C66583Lz implements C85034Er {
    public final /* synthetic */ C613530j A00;
    public final /* synthetic */ C54052o6 A01;
    public final /* synthetic */ C53832nk A02;
    public final /* synthetic */ AnonymousClass4DQ A03;

    public C66583Lz(C613530j r1, C54052o6 r2, C53832nk r3, AnonymousClass4DQ r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public void BLr() {
        C613530j r4 = this.A00;
        C23641Ub r3 = r4.A0O;
        String str = this.A01.A05;
        r3.A06(str.hashCode(), 105);
        r4.A06(this.A03, "Download aborted", str);
    }

    public /* bridge */ /* synthetic */ void BSD(Integer num) {
        C613530j r4 = this.A00;
        C23641Ub r3 = r4.A0O;
        String str = this.A01.A05;
        r3.A06(str.hashCode(), 3);
        r4.A06(this.A03, "Download failed", str);
    }

    public /* bridge */ /* synthetic */ void Be9(Integer num) {
        C613530j r4 = this.A00;
        C23641Ub r3 = r4.A0O;
        String str = this.A01.A05;
        r3.A06(str.hashCode(), 3);
        r4.A06(this.A03, "Download timed out", str);
    }

    public void onSuccess() {
        C613530j r3 = this.A00;
        C48622fC r2 = r3.A0K;
        C54052o6 r5 = this.A01;
        String str = r5.A05;
        r2.A00(str, str.hashCode()).A03(new C86214Jg(this.A02, r3, this.A03, r5, 3));
    }
}
