package X;

/* renamed from: X.6s2  reason: invalid class name and case insensitive filesystem */
public final class C139426s2 extends C41022Iq implements C183468q5 {
    public final C138786qz A00;

    public void Aw3(C149877Og r5) {
        byte[][] bArr = r5.A04;
        int i = r5.A00;
        bArr[i] = null;
        r5.A05[i] = null;
        int intValue = this.A00.A00().intValue();
        r5.A02[i] = intValue;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("keytransparencyprotocolhelper/sendmultiserializedlookupiq Proof for ");
        A0o.append(((String[]) r5.A01.A03)[i]);
        C18260x0.A0w(" returned error code: ", A0o, intValue);
    }

    public C139426s2(AnonymousClass36K r4) {
        AnonymousClass36K.A0N(r4, "single_serialized_proof");
        AnonymousClass4B7[] r2 = new AnonymousClass4B7[6];
        r2[0] = C1896292a.A00(260);
        C1896292a.A0P(r2, 261);
        C1896292a.A0Q(r2, 262);
        C1896292a.A0R(r2, 263);
        C1896292a.A0S(r2, 264);
        C1896292a.A0T(r2, 265);
        this.A00 = (C138786qz) C626836d.A07(r4, "IQErrorInternalServerError|IQErrorNotAuthorized|IQErrorItemNotFound|IQErrorBadRequest|IQErrorRateOverlimit|IQErrorSequencingPending", AnonymousClass0x2.A0i(r2), AnonymousClass6CA.A0i());
        this.A00 = r4;
    }
}
