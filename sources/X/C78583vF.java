package X;

/* renamed from: X.3vF  reason: invalid class name and case insensitive filesystem */
public final class C78583vF extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C43612Su this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78583vF(C43612Su r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C43612Su r1 = this.this$0;
        AnonymousClass2O9 r0 = r1.A02;
        C85424Ge r2 = r1.A04;
        AnonymousClass4C1 r02 = (AnonymousClass4C1) C18280x3.A0V(r2, r0.A02);
        if (r02 != null) {
            return r02.get();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Subsystem ");
        A0o.append(r2.BBo());
        throw new C26191bj(AnonymousClass000.A0X(" was not registered.", A0o));
    }
}
