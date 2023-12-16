package X;

import java.io.File;
import java.util.UUID;

/* renamed from: X.2cc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C47042cc {
    public final /* synthetic */ C158797kZ A00;
    public final /* synthetic */ AnonymousClass3QO A01;
    public final /* synthetic */ AnonymousClass7PV A02;
    public final /* synthetic */ C50112he A03;
    public final /* synthetic */ C47592dV A04;
    public final /* synthetic */ C106985aV A05;
    public final /* synthetic */ C633138t A06;

    public final void A00(File file, boolean z) {
        C50112he r1 = this.A03;
        AnonymousClass7PV r2 = this.A02;
        AnonymousClass3QO r6 = this.A01;
        C158797kZ r5 = this.A00;
        C47592dV r0 = this.A04;
        C106985aV r10 = this.A05;
        C633138t r3 = this.A06;
        File file2 = file;
        if (z && file != null) {
            r2.A02.A05(new C149567My(file2, file2.getName(), C107085af.A04(file2), file2.length()));
        }
        AnonymousClass4JY r13 = new AnonymousClass4JY(r6, r2, r1, r0, 0);
        AnonymousClass7E3 r7 = r2.A05;
        C182578oe r9 = r2.A07;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1B(UUID.randomUUID(), A0o);
        r1.A05.A01(new C135456kh(r5, r6, r7, r13, r9, r10, r1.A01(file2, AnonymousClass000.A0X(".mp4", A0o)), file2, r0.A02, r0.A03, r0.A0F), r3);
    }

    public /* synthetic */ C47042cc(C158797kZ r1, AnonymousClass3QO r2, AnonymousClass7PV r3, C50112he r4, C47592dV r5, C106985aV r6, C633138t r7) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
    }
}
