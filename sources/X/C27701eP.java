package X;

/* renamed from: X.1eP  reason: invalid class name and case insensitive filesystem */
public final class C27701eP extends AnonymousClass3PA {
    public final C622534h A00;

    public void AyB(C52952mJ r2, AnonymousClass1A3 r3, C624134x r4) {
        C162457s7.A0J(r4, 0);
        C18260x0.A0Q(r3, r2);
        super.AyB(r2, r3, r4);
        A02(r3, r4);
    }

    public final void A02(AnonymousClass1A3 r6, C624134x r7) {
        C30801n8 r72 = (C30801n8) r7;
        int i = r72.A00;
        AnonymousClass1ES A0O = C18280x3.A0O(r6);
        A0O.bitField0_ |= 65536;
        A0O.duration_ = i;
        C54942pX r4 = r72.A02;
        if (r4 != null) {
            long j = (r4.A05 - r72.A0K) / ((long) 1000);
            AnonymousClass172 r1 = (AnonymousClass172) C21921Dr.DEFAULT_INSTANCE.A0G();
            C622534h.A00(r1, r4, Integer.valueOf((int) j));
            AnonymousClass1ES A0X = C18310x6.A0X(r6);
            C21921Dr r0 = (C21921Dr) r1.A06();
            r0.getClass();
            A0X.finalLiveLocation_ = r0;
            A0X.bitField0_ |= 262144;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27701eP(C66383Le r1, C622534h r2) {
        super(r1);
        C18260x0.A0Q(r2, r1);
        this.A00 = r2;
    }
}
