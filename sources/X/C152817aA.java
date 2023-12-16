package X;

import java.util.Set;

/* renamed from: X.7aA  reason: invalid class name and case insensitive filesystem */
public abstract class C152817aA {
    public C181338mb A00() {
        if (this instanceof C130086bM) {
            C130086bM r2 = (C130086bM) this;
            Class<C1447872y> cls = C1447872y.class;
            if (r2.A05.contains(cls)) {
                return r2.A00.A00();
            }
            throw AnonymousClass6C7.A0W("Attempting to request an undeclared dependency Provider<Set<%s>>.", AnonymousClass000.A1b(cls));
        }
        AnonymousClass8CV r0 = (AnonymousClass8CV) ((C130096bN) this).A03.get(C1447872y.class);
        if (r0 == null) {
            return C130096bN.A04;
        }
        return r0;
    }

    public C181338mb A01(Class cls) {
        if (this instanceof C130086bM) {
            C130086bM r1 = (C130086bM) this;
            if (r1.A02.contains(cls)) {
                return r1.A00.A01(cls);
            }
            throw AnonymousClass6C7.A0W("Attempting to request an undeclared dependency Provider<%s>.", AnonymousClass000.A1b(cls));
        }
        C162177rO.A03(cls, "Null interface requested.");
        return (C181338mb) ((C130096bN) this).A02.get(cls);
    }

    public Object A02(Class cls) {
        if (this instanceof C130086bM) {
            C130086bM r1 = (C130086bM) this;
            if (r1.A01.contains(cls)) {
                Object A02 = r1.A00.A02(cls);
                if (!cls.equals(C178968iO.class)) {
                    return A02;
                }
                return new AnonymousClass8CR((C178968iO) A02, r1.A03);
            }
            throw AnonymousClass6C7.A0W("Attempting to request an undeclared dependency %s.", AnonymousClass000.A1b(cls));
        }
        C181338mb A01 = A01(cls);
        if (A01 == null) {
            return null;
        }
        return A01.get();
    }

    public Set A03() {
        if (!(this instanceof C130086bM)) {
            return (Set) A00().get();
        }
        C130086bM r2 = (C130086bM) this;
        Class<C1447872y> cls = C1447872y.class;
        if (r2.A04.contains(cls)) {
            return r2.A00.A03();
        }
        throw AnonymousClass6C7.A0W("Attempting to request an undeclared dependency Set<%s>.", AnonymousClass000.A1b(cls));
    }
}
