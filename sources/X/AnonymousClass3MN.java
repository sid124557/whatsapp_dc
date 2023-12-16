package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3MN  reason: invalid class name */
public abstract class AnonymousClass3MN implements AnonymousClass48A {
    public final C55682qk A00;
    public final AnonymousClass31C A01;

    public static AnonymousClass2Q4 A00(AnonymousClass36K r4) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        AnonymousClass36K A0m = r4.A0m("encryption_metadata");
        AnonymousClass36K A0m2 = A0m.A0m("encrypted_key");
        AnonymousClass36K A0m3 = A0m.A0m("nonce");
        AnonymousClass36K A0m4 = A0m.A0m("encrypted_data");
        AnonymousClass36K A0m5 = A0m.A0m("auth_tag");
        byte[] bArr4 = A0m2.A01;
        if (bArr4 != null && (bArr = A0m3.A01) != null && (bArr2 = A0m4.A01) != null && (bArr3 = A0m5.A01) != null) {
            return new AnonymousClass2Q4(bArr4, bArr2, bArr3, bArr);
        }
        throw AnonymousClass24Y.A01("encryption_metadata inner node data missing");
    }

    public void A01(AnonymousClass4EH r14, Object obj, int i) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        AnonymousClass36K A0F;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        AnonymousClass31C r6 = this.A01;
        String A03 = r6.A03();
        int i2 = i;
        if (this instanceof AnonymousClass1Uz) {
            C56052rL A002 = C387629c.A00(A03, i2, true);
            ((AnonymousClass1Uz) this).A02(A002, (AnonymousClass2MZ) obj);
            A0F = A002.A0F();
        } else if (this instanceof AnonymousClass1Uy) {
            AnonymousClass2Q4 r15 = (AnonymousClass2Q4) obj;
            C56052rL A012 = C56052rL.A01();
            C56052rL.A0B(A012, "smax_id", i2);
            C56052rL.A0D(A012, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03);
            C56052rL.A0D(A012, "xmlns", "fb:graphql");
            C56052rL.A0E(A012, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            C56052rL A04 = C56052rL.A04("auth_metadata");
            C56052rL.A0C(A04, "timestamp", C56612sH.A00(((AnonymousClass1Uy) this).A00));
            C56052rL.A0B(A04, "version", 1);
            C56052rL.A0D(A04, "use_case", "support");
            C56052rL.A07(A04, A012);
            C56052rL A042 = C56052rL.A04("encryption_metadata");
            C56052rL.A0B(A042, "version", 1);
            C56052rL.A0D(A042, "algorithm", "rsa2048");
            C56052rL A043 = C56052rL.A04("encrypted_key");
            byte[] bArr7 = null;
            if (r15 != null) {
                bArr4 = r15.A01;
            } else {
                bArr4 = null;
            }
            C56052rL.A09(A043, A042, bArr4);
            C56052rL A044 = C56052rL.A04("encrypted_data");
            if (r15 != null) {
                bArr5 = r15.A00;
            } else {
                bArr5 = null;
            }
            C56052rL.A09(A044, A042, bArr5);
            C56052rL A045 = C56052rL.A04("nonce");
            if (r15 != null) {
                bArr6 = r15.A02;
            } else {
                bArr6 = null;
            }
            C56052rL.A09(A045, A042, bArr6);
            C56052rL A046 = C56052rL.A04("auth_tag");
            if (r15 != null) {
                bArr7 = r15.A03;
            }
            C56052rL.A09(A046, A042, bArr7);
            C56052rL.A07(A042, A012);
            A0F = A012.A0F();
        } else if (this instanceof C23811Ux) {
            AnonymousClass2Q4 r152 = (AnonymousClass2Q4) obj;
            C56052rL A013 = C56052rL.A01();
            C56052rL.A0B(A013, "smax_id", i2);
            C56052rL.A0D(A013, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03);
            C56052rL.A0D(A013, "xmlns", "fb:graphql");
            C56052rL.A0E(A013, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            C56052rL A047 = C56052rL.A04("auth_metadata");
            C56052rL.A0C(A047, "timestamp", C56612sH.A00(((C23811Ux) this).A00));
            C56052rL.A0D(A047, "version", "1");
            C56052rL.A07(A047, A013);
            C56052rL A048 = C56052rL.A04("encryption_metadata");
            C56052rL.A0D(A048, "version", "1");
            C56052rL.A0D(A048, "algorithm", "rsa2048");
            C56052rL.A09(C56052rL.A04("encrypted_key"), A048, r152.A01);
            C56052rL.A09(C56052rL.A04("encrypted_data"), A048, r152.A00);
            C56052rL.A09(C56052rL.A04("nonce"), A048, r152.A02);
            C56052rL.A09(C56052rL.A04("auth_tag"), A048, r152.A03);
            C56052rL.A07(A048, A013);
            A0F = A013.A0F();
        } else {
            AnonymousClass2Q4 r153 = (AnonymousClass2Q4) obj;
            C56052rL A014 = C56052rL.A01();
            C56052rL.A0B(A014, "smax_id", i2);
            C56052rL.A0D(A014, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03);
            C56052rL.A0D(A014, "xmlns", "fb:graphql");
            C56052rL.A0E(A014, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            C56052rL A049 = C56052rL.A04("auth_metadata");
            C56052rL.A0C(A049, "timestamp", C56612sH.A00(((C23801Uw) this).A00));
            C56052rL.A0B(A049, "version", 1);
            C56052rL.A07(A049, A014);
            C56052rL A0410 = C56052rL.A04("encryption_metadata");
            C56052rL.A0B(A0410, "version", 1);
            C56052rL.A0D(A0410, "algorithm", "rsa2048");
            C56052rL A0411 = C56052rL.A04("encrypted_key");
            byte[] bArr8 = null;
            if (r153 != null) {
                bArr = r153.A01;
            } else {
                bArr = null;
            }
            C56052rL.A09(A0411, A0410, bArr);
            C56052rL A0412 = C56052rL.A04("encrypted_data");
            if (r153 != null) {
                bArr2 = r153.A00;
            } else {
                bArr2 = null;
            }
            C56052rL.A09(A0412, A0410, bArr2);
            C56052rL A0413 = C56052rL.A04("nonce");
            if (r153 != null) {
                bArr3 = r153.A02;
            } else {
                bArr3 = null;
            }
            C56052rL.A09(A0413, A0410, bArr3);
            C56052rL A0414 = C56052rL.A04("auth_tag");
            if (r153 != null) {
                bArr8 = r153.A03;
            }
            C56052rL.A09(A0414, A0410, bArr8);
            C56052rL.A07(A0410, A014);
            A0F = A014.A0F();
        }
        r6.A0K(new AnonymousClass4KT(r14, 4, this), A0F, A03, 264, 32000);
    }

    public AnonymousClass3MN(C55682qk r1, AnonymousClass31C r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
