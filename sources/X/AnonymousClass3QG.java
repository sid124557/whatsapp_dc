package X;

import java.io.File;
import java.util.UUID;

/* renamed from: X.3QG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3QG implements C182548ob {
    public final /* synthetic */ C158797kZ A00;
    public final /* synthetic */ AnonymousClass3QO A01;
    public final /* synthetic */ AnonymousClass7PV A02;
    public final /* synthetic */ C50112he A03;
    public final /* synthetic */ C47592dV A04;

    public final void BVW(C106985aV r31) {
        C50112he r8 = this.A03;
        AnonymousClass3QO r14 = this.A01;
        C158797kZ r13 = this.A00;
        C47592dV r4 = this.A04;
        AnonymousClass7PV r0 = this.A02;
        AnonymousClass4JY r5 = new AnonymousClass4JY(r14, r0, r8, r4, 1);
        AnonymousClass7E3 r15 = r0.A05;
        C182578oe r11 = r0.A07;
        File file = r4.A07;
        StringBuilder A0u = C18290x4.A0u(file);
        AnonymousClass000.A1B(UUID.randomUUID(), A0u);
        File A012 = r8.A01(file, AnonymousClass000.A0X(".mp4", A0u));
        long j = r4.A02;
        long j2 = r4.A03;
        boolean z = r4.A0J;
        long j3 = j2;
        boolean z2 = z;
        long j4 = j;
        File file2 = file;
        C182578oe r17 = r11;
        r8.A05.A01(new C135476kj(r13, r14, r15, r5, r17, r31, file2, A012, j4, j3, z2, r4.A0E, r4.A0D, r4.A0I, r4.A0F), C633138t.A0g);
    }

    public /* synthetic */ AnonymousClass3QG(C158797kZ r1, AnonymousClass3QO r2, AnonymousClass7PV r3, C50112he r4, C47592dV r5) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
    }
}
