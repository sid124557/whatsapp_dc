package X;

/* renamed from: X.2zl  reason: invalid class name and case insensitive filesystem */
public final class C61132zl {
    public final AnonymousClass1VX A00;
    public final AnonymousClass4FV A01;

    public final void A03(String str) {
        C162457s7.A0J(str, 0);
        if (this.A00.A0Y(C58422vE.A02, 4725)) {
            AnonymousClass1ZJ r0 = new AnonymousClass1ZJ();
            Integer A0h = AnonymousClass0x7.A0h();
            r0.A02 = A0h;
            r0.A04 = null;
            r0.A03 = str;
            AnonymousClass4FV r1 = this.A01;
            r1.BhD(r0);
            C24901Ze r02 = new C24901Ze();
            r02.A02 = A0h;
            r02.A04 = null;
            r02.A05 = str;
            r1.BhD(r02);
        }
    }

    public static final int A00(C54692p8 r2) {
        if (r2.A02.ordinal() == 0) {
            return 1;
        }
        throw C73153f1.A00();
    }

    public final void A01(C24901Ze r2, C53212mj r3) {
        r2.A01 = Integer.valueOf(A00(r3.A01));
        r2.A04 = r3.A03;
        r2.A03 = C18290x4.A0h(r3.A02.user);
    }

    public final void A02(C53212mj r3, int i) {
        AnonymousClass1ZJ.A00(new AnonymousClass1ZJ(), this, r3, 5, i);
    }

    public C61132zl(AnonymousClass1VX r1, AnonymousClass4FV r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
