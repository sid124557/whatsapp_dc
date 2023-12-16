package X;

/* renamed from: X.465  reason: invalid class name */
public final class AnonymousClass465 extends AnonymousClass467 {
    public final C830846b[] A00;
    public final /* synthetic */ C58532vP A01;

    public AnonymousClass465(C58532vP r1, C830846b[] r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void A01() {
        C830846b[] r3 = this.A00;
        int length = r3.length;
        int i = 0;
        while (i < length) {
            AnonymousClass4C7 r0 = r3[i].A00;
            if (r0 != null) {
                r0.dispose();
                i++;
            } else {
                throw C18270x1.A0S("handle");
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A01();
        return C59022wD.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DisposeHandlersOnCancel[");
        A0o.append(this.A00);
        return AnonymousClass0x2.A0f(A0o);
    }
}
