package X;

/* renamed from: X.4Js  reason: invalid class name and case insensitive filesystem */
public class C86334Js implements AnonymousClass4EJ {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public void Bd3(C60272yH r8) {
        if (this.A04 == 0) {
            C69263Wi r4 = ((AnonymousClass2XP) this.A02).A00;
            if (r4 != null) {
                r4.BkS(new C117165rU(this.A00, 9, this.A01));
                return;
            }
            throw C18270x1.A0S("globalUI");
        } else if (r8 == null) {
            A00(false);
        } else {
            AnonymousClass2XP r3 = (AnonymousClass2XP) this.A03;
            C183538qC r0 = r3.A01;
            if (r0 != null) {
                ((AnonymousClass2X9) r0.get()).A00(new C86334Js(this, r3, this.A02, this.A00, 0));
                return;
            }
            throw C18270x1.A0S("accountLinkingCustomActionsHelperLazy");
        }
    }

    public C86334Js(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A02 = obj2;
        this.A00 = obj4;
        this.A01 = obj3;
        this.A03 = obj;
    }

    public final void A00(boolean z) {
        C69263Wi r4 = ((AnonymousClass2XP) this.A03).A00;
        if (r4 != null) {
            r4.BkS(new C117665sI(this.A00, this.A01, 3, z));
            return;
        }
        throw C18270x1.A0S("globalUI");
    }

    public void BQp() {
        if (this.A04 != 0) {
            A00(false);
        } else {
            ((C86334Js) this.A03).A00(false);
        }
    }

    public void BSB(Exception exc) {
        if (this.A04 != 0) {
            C162457s7.A0J(exc, 0);
            A00(exc instanceof C23791Uv);
            return;
        }
        ((C86334Js) this.A03).A00(false);
    }
}
