package X;

/* renamed from: X.3G4  reason: invalid class name */
public final class AnonymousClass3G4 implements C836749i {
    public final int A00;
    public final C25811b7 A01;
    public final C47532dP A02;
    public final AnonymousClass33Y A03;
    public final AnonymousClass1gS A04;
    public final AnonymousClass4FY A05;
    public final boolean A06;

    public void BF5(byte[] bArr) {
        AnonymousClass1gS r1 = this.A04;
        if (r1 != null) {
            r1.A02 = true;
        }
        byte[] bArr2 = bArr;
        if (bArr != null && bArr.length != 0) {
            C25811b7 r12 = this.A01;
            r12.A00 = Boolean.TRUE;
            r12.A0A = 12;
            AnonymousClass4FY r2 = this.A05;
            if (r2 instanceof AnonymousClass3ST) {
                AnonymousClass3ST r22 = (AnonymousClass3ST) r2;
                C30351mJ r3 = new C30351mJ(AnonymousClass3ST.A00(r22), bArr2, this.A00, r22.A16);
                r22.A02(r3);
                this.A02.A00(r3, r22);
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("DecryptionCallbackFuture: ignoring ");
            AnonymousClass000.A1A(r2, A0o);
            C18280x3.A14(A0o);
        } else if (this.A06) {
            this.A03.A07(this.A05);
        }
    }

    public AnonymousClass3G4(C25811b7 r1, C47532dP r2, AnonymousClass33Y r3, AnonymousClass1gS r4, AnonymousClass4FY r5, int i, boolean z) {
        this.A00 = i;
        this.A06 = z;
        this.A03 = r3;
        this.A01 = r1;
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
    }
}
