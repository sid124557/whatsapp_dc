package X;

/* renamed from: X.46w  reason: invalid class name and case insensitive filesystem */
public abstract class C832946w extends C72933eX {
    public final AnonymousClass4C8 A00;

    public Object A00(C84814Du r2, AnonymousClass4Gm r3) {
        return AnonymousClass218.A00(A02(r2, new C72813eK(r3)));
    }

    public Object A02(C84814Du r4, AnonymousClass4C9 r5) {
        if (this instanceof C832746u) {
            return AnonymousClass218.A00(AnonymousClass349.A00(r4, new C74883ny((C84814Du) null, r5, (C832746u) this)));
        }
        return AnonymousClass218.A00(this.A00.Az8(r4, r5));
    }

    /* JADX INFO: finally extract failed */
    public Object Az8(C84814Du r6, AnonymousClass4C9 r7) {
        Object Az8;
        C85494Gl A002;
        if (this.A00 == -3) {
            C85494Gl B5w = r6.B5w();
            C85494Gl r2 = this.A01;
            if (!AnonymousClass001.A1Z(r2.fold(Boolean.FALSE, C828145a.A00))) {
                A002 = B5w.plus(r2);
            } else {
                A002 = AnonymousClass348.A00(B5w, r2, false);
            }
            if (C162457s7.A0P(A002, B5w)) {
                Az8 = A02(r6, r7);
            } else {
                C72513dq r0 = AnonymousClass4GY.A00;
                if (C162457s7.A0P(A002.get(r0), B5w.get(r0))) {
                    C85494Gl B5w2 = r6.B5w();
                    if (!(r7 instanceof C72813eK) && !(r7 instanceof C72863eQ)) {
                        r7 = new C72833eN(B5w2, r7);
                    }
                    C74823mn r3 = new C74823mn((C84814Du) null, this);
                    Object fold = A002.fold(C18290x4.A0Z(), AnonymousClass34N.A00);
                    C162457s7.A0H(fold);
                    Object A003 = AnonymousClass34N.A00(fold, A002);
                    try {
                        C72453dk r1 = new C72453dk(r6, A002);
                        AnonymousClass360.A03(r3, 2);
                        Object invoke = r3.invoke(r7, r1);
                        AnonymousClass34N.A01(A003, A002);
                        Az8 = AnonymousClass218.A00(invoke);
                    } catch (Throwable th) {
                        AnonymousClass34N.A01(A003, A002);
                        throw th;
                    }
                }
            }
            return AnonymousClass218.A00(Az8);
        }
        Az8 = super.Az8(r6, r7);
        return AnonymousClass218.A00(Az8);
    }

    public C832946w(C85494Gl r1, C369720l r2, AnonymousClass4C8 r3, int i) {
        super(r1, r2, i);
        this.A00 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        A0o.append(" -> ");
        return AnonymousClass000.A0X(super.toString(), A0o);
    }
}
