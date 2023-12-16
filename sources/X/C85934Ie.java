package X;

/* renamed from: X.4Ie  reason: invalid class name and case insensitive filesystem */
public class C85934Ie implements AnonymousClass4EI {
    public Object A00;
    public Object A01;
    public final int A02;

    public C85934Ie(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public void BQp() {
        switch (this.A02) {
            case 0:
                ((C84964Ek) this.A00).BQp();
                return;
            case 1:
                ((AnonymousClass4EN) this.A00).BQq(AnonymousClass002.A0C("network error while creating user"));
                return;
            case 2:
                ((AnonymousClass4EN) this.A00).BQq(AnonymousClass002.A0C("network error while refreshing token"));
                return;
            default:
                ((AnonymousClass4EJ) this.A00).BSB((Exception) this.A01);
                return;
        }
    }

    public void BSB(Exception exc) {
        AnonymousClass4EN r1;
        switch (this.A02) {
            case 0:
                C162457s7.A0J(exc, 0);
                ((C84964Ek) this.A00).BSC(exc, (Integer) null);
                return;
            case 1:
                C162457s7.A0J(exc, 0);
                r1 = (AnonymousClass4EN) this.A00;
                if (((C67313Ou) this.A01).A03 != null) {
                    exc = new AnonymousClass245(exc);
                    break;
                }
                break;
            case 2:
                C162457s7.A0J(exc, 0);
                r1 = (AnonymousClass4EN) this.A00;
                if (((C67313Ou) this.A01).A03 != null) {
                    exc = new AnonymousClass245(exc);
                    break;
                }
                break;
            default:
                C162457s7.A0J(exc, 0);
                ((AnonymousClass4EJ) this.A00).BSB(exc);
                return;
        }
        r1.BSB(exc);
    }

    public void Bd3(C60272yH r6) {
        switch (this.A02) {
            case 0:
                ((C70363aN) this.A01).run();
                return;
            case 1:
                C67313Ou r4 = (C67313Ou) this.A01;
                if (r6 != null) {
                    r4.A04.B00(C18280x3.A0b(r6.A02)).Bh4(new C86434Kc(r6, r4, this.A00, 0));
                    return;
                }
                throw C18290x4.A0Y();
            case 2:
                C67313Ou r42 = (C67313Ou) this.A01;
                AnonymousClass4AN r1 = r42.A04;
                if (r6 != null) {
                    r1.B00(C18280x3.A0b(r6.A02)).Bh4(new C86444Kd(r42, 1, this.A00));
                    return;
                }
                throw C18290x4.A0Y();
            default:
                ((AnonymousClass4EJ) this.A00).BSB((Exception) this.A01);
                return;
        }
    }
}
