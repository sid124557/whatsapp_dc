package X;

/* renamed from: X.3eN  reason: invalid class name and case insensitive filesystem */
public final class C72833eN implements AnonymousClass4C9 {
    public final Object A00;
    public final C85494Gl A01;
    public final AnonymousClass4GR A02;

    /* JADX INFO: finally extract failed */
    public Object B2K(Object obj, C84814Du r7) {
        C85494Gl r4 = this.A01;
        Object obj2 = this.A00;
        AnonymousClass4GR r3 = this.A02;
        Object A002 = AnonymousClass34N.A00(obj2, r4);
        try {
            C72453dk r1 = new C72453dk(r7, r4);
            AnonymousClass360.A03(r3, 2);
            Object invoke = r3.invoke(obj, r1);
            AnonymousClass34N.A01(A002, r4);
            return AnonymousClass218.A00(invoke);
        } catch (Throwable th) {
            AnonymousClass34N.A01(A002, r4);
            throw th;
        }
    }

    public C72833eN(C85494Gl r3, AnonymousClass4C9 r4) {
        this.A01 = r3;
        Object fold = r3.fold(C18290x4.A0Z(), AnonymousClass34N.A00);
        C162457s7.A0H(fold);
        this.A00 = fold;
        this.A02 = new C74843mp((C84814Du) null, r4);
    }
}
