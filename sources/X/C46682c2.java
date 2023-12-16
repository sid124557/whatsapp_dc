package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2c2  reason: invalid class name and case insensitive filesystem */
public final class C46682c2 {
    public final C55682qk A00;
    public final C64773Ex A01;
    public final C56892sj A02;
    public final C52372lN A03;
    public final AnonymousClass31C A04;
    public final AnonymousClass4FS A05;

    public final void A00(C27991fJ r15) {
        C162457s7.A0J(r15, 0);
        AnonymousClass3ZH A09 = this.A01.A09(r15);
        if (A09 != null && A09.A13) {
            C56892sj r1 = this.A02;
            if (r1.A0C(r15) && !r1.A0D(r15)) {
                AnonymousClass4KT r8 = new AnonymousClass4KT(this, 2, r15);
                AnonymousClass31C r7 = this.A04;
                String A032 = r7.A03();
                AnonymousClass39V[] r2 = new AnonymousClass39V[1];
                boolean A0F = AnonymousClass39V.A0F("requestor_fetch", "true", r2);
                AnonymousClass36K A0I = AnonymousClass36K.A0I("membership_approval_requests", r2);
                AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
                AnonymousClass39V.A0B("xmlns", "w:g2", A1W, A0F ? 1 : 0);
                AnonymousClass39V.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W, 1, 2);
                r7.A0K(r8, AnonymousClass36K.A0C(r15, A0I, A1W), A032, 355, 32000);
            }
        }
    }

    public C46682c2(C55682qk r2, C64773Ex r3, C56892sj r4, C52372lN r5, AnonymousClass31C r6, AnonymousClass4FS r7) {
        C18260x0.A0f(r2, r7, r6, r3, r5);
        C162457s7.A0J(r4, 6);
        this.A00 = r2;
        this.A05 = r7;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }
}
