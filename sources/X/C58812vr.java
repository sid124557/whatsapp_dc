package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.2vr  reason: invalid class name and case insensitive filesystem */
public class C58812vr {
    public final C55682qk A00;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass31C A03;
    public final AnonymousClass8JP A04;

    public C58812vr(C55682qk r1, C56612sH r2, AnonymousClass1VX r3, AnonymousClass31C r4, AnonymousClass8JP r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public static final AnonymousClass36K A00(String str) {
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A1W);
        AnonymousClass39V.A05("xmlns", "status", A1W);
        AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A1W);
        A1W[3] = AnonymousClass39V.A00();
        return AnonymousClass36K.A0G(AnonymousClass36K.A0H("privacy"), A1W);
    }
}
