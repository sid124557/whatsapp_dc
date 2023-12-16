package X;

/* renamed from: X.2cH  reason: invalid class name and case insensitive filesystem */
public final class C46832cH {
    public final C56612sH A00;
    public final AnonymousClass4FS A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;

    public final void A00(AnonymousClass2EU r20, C54662p5 r21, String str, String str2, int i) {
        AnonymousClass31C r12 = (AnonymousClass31C) this.A03.get();
        String A032 = r12.A03();
        Boolean valueOf = Boolean.valueOf(String.valueOf(AnonymousClass0x9.A0c(this.A04).A02()));
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        AnonymousClass3TA r4 = new AnonymousClass3TA(r20, r21, this, valueOf, str3, str4, i2);
        C162457s7.A0H(valueOf);
        boolean booleanValue = valueOf.booleanValue();
        C56052rL A002 = C387629c.A00(A032, 72, true);
        C56052rL.A08(C56052rL.A04("bloks_app_id"), A002, str3);
        C56052rL.A08(C56052rL.A04("app_version"), A002, "2.23.26.14");
        C56052rL.A08(C56052rL.A04("bloks_versioning_id"), A002, "6c404196454966428d798beeeffa89a9ea5cf915e4ff8a7448ab0b8135b0a3f9");
        C56052rL.A08(C56052rL.A04("is_paused"), A002, String.valueOf(booleanValue));
        C56052rL.A05(this.A00, C56052rL.A04("timestamp"), A002);
        if (!(str2 == null || str4.length() == 0)) {
            C56052rL.A08(C56052rL.A04("entry_point"), A002, str4);
        }
        if (-1 != i2) {
            C56052rL.A08(C56052rL.A04("target_acct_type"), A002, String.valueOf(i2));
        }
        r12.A0K(r4, A002.A0F(), A032, 264, 32000);
    }

    public C46832cH(C56612sH r2, AnonymousClass4FS r3, C183538qC r4, C183538qC r5, C183538qC r6, C183538qC r7) {
        C18260x0.A0f(r2, r3, r4, r5, r6);
        C162457s7.A0J(r7, 6);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r7;
    }
}
