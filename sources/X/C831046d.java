package X;

/* renamed from: X.46d  reason: invalid class name and case insensitive filesystem */
public abstract class C831046d extends C72753eE implements C84814Du, C85474Gj, AnonymousClass4C6 {
    public final C85494Gl A00;

    public final void A0W(Object obj) {
        if (obj instanceof AnonymousClass333) {
            AnonymousClass333 r3 = (AnonymousClass333) obj;
            A11(r3.A00, r3.A00());
            return;
        }
        A0z(obj);
    }

    public final void A0a(Throwable th) {
        C1453575e.A00(this.A00, th);
    }

    public void A0z(Object obj) {
    }

    public C831046d(C85494Gl r2, boolean z) {
        super(z);
        A0g(C18310x6.A0v(r2));
        this.A00 = r2.plus(this);
    }

    public String A0K() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o);
        return AnonymousClass000.A0X(" was cancelled", A0o);
    }

    public String A0L() {
        return super.A0L();
    }

    public final void A10(Object obj, AnonymousClass4GR r6, AnonymousClass20D r7) {
        C85494Gl B5w;
        Object A002;
        int ordinal = r7.ordinal();
        if (ordinal == 0) {
            try {
                C58082ug.A00(C59022wD.A00, C57702u4.A01(C57702u4.A00(obj, this, r6)));
            } catch (Throwable th) {
                AnonymousClass3Z0.A02(th, this);
                throw th;
            }
        } else if (ordinal == 2) {
            C57702u4.A01(C57702u4.A00(obj, this, r6)).BkD(C59022wD.A00);
        } else if (ordinal == 3) {
            try {
                B5w = B5w();
                A002 = AnonymousClass34N.A00((Object) null, B5w);
                AnonymousClass360.A03(r6, 2);
                Object invoke = r6.invoke(obj, this);
                AnonymousClass34N.A01(A002, B5w);
                if (invoke != AnonymousClass218.COROUTINE_SUSPENDED) {
                    BkD(invoke);
                }
            } catch (Throwable th2) {
                BkD(AnonymousClass3Z0.A01(th2));
            }
        } else if (ordinal != 1) {
            throw C73153f1.A00();
        }
    }

    public final C85494Gl B5w() {
        return this.A00;
    }

    public C85494Gl B61() {
        return this.A00;
    }

    public final void BkD(Object obj) {
        Throwable A002 = AnonymousClass3Z9.A00(obj);
        if (A002 != null) {
            obj = new AnonymousClass333(A002);
        }
        Object A0D = A0D(obj);
        if (A0D != AnonymousClass36I.A04) {
            A0y(A0D);
        }
    }

    public void A0y(Object obj) {
        A0V(obj);
    }

    public void A11(Throwable th, boolean z) {
    }
}
