package X;

/* renamed from: X.9jp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201289jp implements Runnable {
    public final /* synthetic */ C624034w A00;
    public final /* synthetic */ AnonymousClass99L A01;
    public final /* synthetic */ C203499no A02;
    public final /* synthetic */ C191669Fv A03;

    public final void run() {
        C191669Fv r3 = this.A03;
        C624034w r2 = this.A00;
        AnonymousClass99L r1 = this.A01;
        C203499no r0 = this.A02;
        AnonymousClass9A9 r7 = r3.A0B;
        String str = r2.A0K;
        String str2 = r1.A0J;
        AnonymousClass9R7 r6 = new AnonymousClass9R7(r0, r3);
        AnonymousClass9U5 r10 = r7.A03;
        String A032 = r10.A07.A03();
        C35371wl r32 = new C35371wl(A032, 15);
        C56052rL A012 = C56052rL.A01();
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-raise-complaint");
        if (C626836d.A0M(str, 1, 100, false)) {
            C56052rL.A0D(A0U, "transaction-id", str);
        }
        if (C626836d.A0M(str2, 1, 100, false)) {
            C56052rL.A0D(A0U, "device-id", str2);
        }
        AnonymousClass36K A033 = C41032Ir.A03(A0U, A012, r32);
        C203499no B7b = AnonymousClass9U4.A07(r7.A04).B7b();
        r10.A0F(new C203909oV(r7.A01.A00, r7.A02, r7.A00, r6, r7, B7b, 2), A033, A032, 0);
    }

    public /* synthetic */ C201289jp(C624034w r1, AnonymousClass99L r2, C203499no r3, C191669Fv r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
