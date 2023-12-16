package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2aL  reason: invalid class name and case insensitive filesystem */
public final class C45642aL {
    public final C56612sH A00;
    public final AnonymousClass4FS A01;
    public final C183538qC A02;

    public final void A00(C49352gO r16, C54662p5 r17, String str, String str2, String str3, int i) {
        AnonymousClass31C r8 = (AnonymousClass31C) this.A02.get();
        String A03 = r8.A03();
        C56052rL A002 = C387629c.A00(A03, 65, false);
        C56052rL A04 = C56052rL.A04("disclosure");
        int i2 = i;
        C56052rL.A0B(A04, PublicKeyCredentialControllerUtility.JSON_KEY_ID, i2);
        String str4 = str;
        C56052rL.A0D(A04, "version", str4);
        String str5 = str2;
        C56052rL.A0D(A04, "lg", str5);
        String str6 = str3;
        C56052rL.A0D(A04, "lc", str6);
        C56052rL.A07(A04, A002);
        C56052rL.A05(this.A00, C56052rL.A04("timestamp"), A002);
        r8.A0K(new AnonymousClass3T8(r16, r17, this, str4, str5, str6, i2), A002.A0F(), A03, 264, 32000);
    }

    public C45642aL(C56612sH r1, AnonymousClass4FS r2, C183538qC r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
