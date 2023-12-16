package X;

/* renamed from: X.6s3  reason: invalid class name and case insensitive filesystem */
public final class C139436s3 extends C41022Iq implements C183468q5 {
    public final C34851vv A00;
    public final byte[] A01;

    public void Aw3(C149877Og r5) {
        Object[] objArr = r5.A04;
        int i = r5.A00;
        C34851vv r2 = this.A00;
        objArr[i] = r2.A00;
        r5.A03[i] = r2.A03;
        byte[][] bArr = r5.A05;
        bArr[i] = this.A01;
        r5.A02[i] = 0;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("keytransparencyprotocolhelper/sendmultiserializedlookupiq Proof for ");
        A0o.append(((String[]) r5.A01.A03)[i]);
        A0o.append(" returned serialized proof size: ");
        C18260x0.A1F(A0o, bArr[i].length);
    }

    public C139436s3(AnonymousClass36K r3) {
        AnonymousClass36K.A0N(r3, "single_serialized_proof");
        this.A01 = (byte[]) AnonymousClass6C7.A0b(r3, byte[].class, new String[]{"serialized_proof", "#elementValue"});
        this.A00 = (C34851vv) AnonymousClass6C8.A0b(r3, C1896292a.A00(266), "root_hash");
        this.A00 = r3;
    }
}
