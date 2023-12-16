package X;

import java.io.File;

/* renamed from: X.3QH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3QH implements C182548ob {
    public final /* synthetic */ C158797kZ A00;
    public final /* synthetic */ AnonymousClass3QO A01;
    public final /* synthetic */ AnonymousClass7PV A02;
    public final /* synthetic */ C50112he A03;
    public final /* synthetic */ C47592dV A04;
    public final /* synthetic */ C633138t A05;

    public final void BVW(C106985aV r14) {
        C50112he r7 = this.A03;
        AnonymousClass3QO r5 = this.A01;
        C47592dV r8 = this.A04;
        AnonymousClass7PV r6 = this.A02;
        C158797kZ r4 = this.A00;
        C633138t r10 = this.A05;
        C135246kM r2 = r7.A04;
        File file = r8.A07;
        String str = r8.A0B;
        int i = r8.A00;
        C47042cc r3 = new C47042cc(r4, r5, r6, r7, r8, r14, r10);
        if (file == null) {
            C106095Xp r82 = r2.A00;
            C626936e.A06(str);
            C162457s7.A0D(str);
            C114715nU r72 = new C114715nU(r82, r5, r3, str, i);
            r2.A02(r72.A02, r72);
            return;
        }
        r3.A00(file, false);
    }

    public /* synthetic */ AnonymousClass3QH(C158797kZ r1, AnonymousClass3QO r2, AnonymousClass7PV r3, C50112he r4, C47592dV r5, C633138t r6) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
    }
}
