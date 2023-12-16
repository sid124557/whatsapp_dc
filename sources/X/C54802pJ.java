package X;

import java.util.Locale;

/* renamed from: X.2pJ  reason: invalid class name and case insensitive filesystem */
public abstract class C54802pJ {
    public final int A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass316 A03;
    public final C186568vZ A04;

    public final void A00(int i, String str) {
        C162457s7.A0J(str, 1);
        this.A03.A05(i, str);
    }

    public final void A01(int i, String str) {
        C162457s7.A0J(str, 1);
        AnonymousClass316 r3 = this.A03;
        r3.A06(i, str, true);
        A02(i, "timestamp_ms", System.currentTimeMillis());
        C186568vZ r4 = r3.A0D;
        int i2 = r3.A0A.A07;
        r4.markerAnnotate(i2, i, "is_debug_build", false);
        String string = AnonymousClass0x2.A0F(this.A02).getString("pref_graphql_domain", "whatsapp.com");
        C162457s7.A0D(string);
        r4.markerAnnotate(i2, i, "is_graphql_prod", C18320x8.A0g(Locale.ROOT, string).equals("whatsapp.com"));
    }

    public final void A03(int i, String str, String str2) {
        C162457s7.A0J(str2, 2);
        AnonymousClass316 r0 = this.A03;
        r0.A0D.markerAnnotate(r0.A0A.A07, i, str, str2);
    }

    public final void A02(int i, String str, long j) {
        AnonymousClass316 r0 = this.A03;
        r0.A0D.markerAnnotate(r0.A0A.A07, i, str, j);
    }

    public C54802pJ(C56612sH r13, C54292oU r14, AnonymousClass33p r15, AnonymousClass4FV r16, C84084Ay r17, AnonymousClass8JP r18, C186568vZ r19, AnonymousClass4FS r20, String str, int i) {
        int i2 = i;
        this.A00 = i2;
        this.A01 = r13;
        this.A02 = r15;
        C186568vZ r8 = r19;
        this.A04 = r8;
        AnonymousClass316 r2 = new AnonymousClass316(r13, r14, r16, r17, r18, r8, r20, str, i2);
        r2.A0A.A05 = true;
        this.A03 = r2;
    }
}
