package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1vf  reason: invalid class name and case insensitive filesystem */
public final class C34751vf extends AnonymousClass1Uz {
    public final C56612sH A00;

    public /* bridge */ /* synthetic */ void A02(C56052rL r7, AnonymousClass2MZ r8) {
        String str;
        String str2;
        String str3;
        C34731vd r82 = (C34731vd) r8;
        super.A02(r7, r82);
        if (r82 != null) {
            byte[] bArr = r82.A04;
            if (bArr != null) {
                C56052rL.A09(C56052rL.A04("id_sign"), r7, bArr);
            }
            int i = r82.A00;
            if (i != -1 && (str = r82.A03) != null && (str2 = r82.A02) != null && (str3 = r82.A01) != null) {
                C56052rL A04 = C56052rL.A04("disclosure");
                C56052rL.A0B(A04, PublicKeyCredentialControllerUtility.JSON_KEY_ID, i);
                C56052rL.A0D(A04, "version", str);
                C56052rL.A0D(A04, "lg", str2);
                C56052rL.A0D(A04, "lc", str3);
                C56052rL.A0C(A04, "acceptance_timestamp", C56612sH.A02(this.A00));
                C56052rL.A07(A04, r7);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34751vf(C55682qk r1, C56612sH r2, AnonymousClass31C r3) {
        super(r1, r2, r3);
        C18260x0.A0V(r2, r1, r3);
        this.A00 = r2;
    }
}
