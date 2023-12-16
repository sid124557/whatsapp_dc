package X;

/* renamed from: X.402  reason: invalid class name */
public final class AnonymousClass402 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass4CV $listener;
    public final /* synthetic */ AnonymousClass0PJ $phoneNumberPair;
    public final /* synthetic */ String $purpose;
    public final /* synthetic */ C51242jV $userEntityForNativeAuth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass402(AnonymousClass0PJ r2, AnonymousClass4CV r3, C51242jV r4, String str) {
        super(0);
        this.$listener = r3;
        this.$userEntityForNativeAuth = r4;
        this.$purpose = str;
        this.$phoneNumberPair = r2;
    }

    public static AnonymousClass2S0 A00(AnonymousClass402 r2) {
        return (AnonymousClass2S0) r2.$userEntityForNativeAuth.A01.A00(r2.$purpose);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        C41272Jp r0;
        C41272Jp r02;
        AnonymousClass4CV r2 = this.$listener;
        AnonymousClass2S0 A00 = A00(this);
        String str5 = null;
        if (A00 != null) {
            str = A00.A03;
        } else {
            str = null;
        }
        AnonymousClass2S0 A002 = A00(this);
        if (A002 != null) {
            str2 = A002.A02;
        } else {
            str2 = null;
        }
        AnonymousClass2S0 A003 = A00(this);
        if (A003 != null) {
            str3 = A003.A01;
        } else {
            str3 = null;
        }
        AnonymousClass0PJ r3 = this.$phoneNumberPair;
        AnonymousClass2S0 A004 = A00(this);
        if (A004 != null) {
            str4 = A004.A04;
        } else {
            str4 = null;
        }
        AnonymousClass2S0 A005 = A00(this);
        if (A005 == null || (r02 = A005.A00) == null) {
            num = null;
        } else {
            num = Integer.valueOf(r02.A00);
        }
        C51242jV r03 = this.$userEntityForNativeAuth;
        int i = r03.A00;
        AnonymousClass2S0 r04 = (AnonymousClass2S0) r03.A01.A00(this.$purpose);
        if (!(r04 == null || (r0 = r04.A00) == null)) {
            str5 = r0.A01;
        }
        r2.Bfm(r3, num, str, str2, str3, str4, str5, i);
        return C59022wD.A00;
    }
}
