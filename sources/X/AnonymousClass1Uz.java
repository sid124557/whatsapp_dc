package X;

/* renamed from: X.1Uz  reason: invalid class name */
public abstract class AnonymousClass1Uz extends AnonymousClass3MN {
    public final C56612sH A00;

    public void A02(C56052rL r5, AnonymousClass2MZ r6) {
        if (r6 != null) {
            C56052rL A04 = C56052rL.A04("encryption_metadata");
            C56052rL.A0D(A04, "version", "1");
            C56052rL.A0D(A04, "algorithm", "rsa2048");
            C56052rL A042 = C56052rL.A04("encrypted_key");
            AnonymousClass2Q4 r2 = r6.A00;
            C56052rL.A09(A042, A04, r2.A01);
            C56052rL.A09(C56052rL.A04("encrypted_data"), A04, r2.A00);
            C56052rL.A09(C56052rL.A04("nonce"), A04, r2.A02);
            C56052rL.A09(C56052rL.A04("auth_tag"), A04, r2.A03);
            C56052rL.A07(A04, r5);
            C56052rL.A05(this.A00, C56052rL.A04("timestamp"), r5);
            C166557yt r22 = r6.A01;
            if (r22 != null) {
                C56052rL.A08(C56052rL.A04("fbid"), r5, C18280x3.A0a(r22));
            }
        }
    }

    public AnonymousClass1Uz(C55682qk r1, C56612sH r2, AnonymousClass31C r3) {
        super(r1, r3);
        this.A00 = r2;
    }
}
