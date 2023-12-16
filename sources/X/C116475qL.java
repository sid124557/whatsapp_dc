package X;

/* renamed from: X.5qL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116475qL implements C84134Bd {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ C93834pQ A01;
    public final /* synthetic */ C95814uZ A02;
    public final /* synthetic */ C624134x A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass4GP A05;

    public final void AwB(Object obj) {
        C89644eZ r3 = this.A00;
        C93834pQ r5 = this.A01;
        C95814uZ r4 = this.A02;
        String str = this.A04;
        C624134x r7 = this.A03;
        AnonymousClass4GP r6 = this.A05;
        Boolean bool = (Boolean) obj;
        C162457s7.A0J(str, 3);
        C162457s7.A0J(bool, 6);
        if (!r3.BHW()) {
            AnonymousClass5XI r2 = new AnonymousClass5XI(r5.A02, r4, str, bool.booleanValue());
            r2.A00 = 0;
            r2.A08 = false;
            r2.A01 = r7.A0o();
            r2.A05 = false;
            r2.A07 = false;
            r2.A02 = r7.A1J;
            r2.A03 = new C1233468b(r6, 1);
            if (r4 instanceof C95804uY) {
                AnonymousClass31A A002 = C56982ss.A00(r5.A00, r4);
                C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
                r2.A01((AnonymousClass1RL) A002);
            }
            r3.Boo(r2.A00());
        }
    }

    public /* synthetic */ C116475qL(C89644eZ r1, C93834pQ r2, C95814uZ r3, C624134x r4, String str, AnonymousClass4GP r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = r4;
        this.A05 = r6;
    }
}
