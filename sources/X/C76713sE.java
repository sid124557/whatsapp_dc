package X;

/* renamed from: X.3sE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C76713sE extends AnonymousClass8V2 implements AnonymousClass4GS {
    public static final C76713sE A00 = new C76713sE();

    public C76713sE() {
        super(3, AnonymousClass2J9.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        AnonymousClass2J9 r7 = (AnonymousClass2J9) obj;
        AnonymousClass466 r8 = (AnonymousClass466) obj2;
        long j = r7.A00;
        if (j <= 0) {
            r8.A02 = C59022wD.A00;
        } else {
            C70163a3 r4 = new C70163a3(r7, 13, r8);
            C162457s7.A0K(r8, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C85494Gl r1 = r8.A04;
            r8.A01 = C616231o.A02(r1).BGx(r4, r1, j);
        }
        return C59022wD.A00;
    }
}
