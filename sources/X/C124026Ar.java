package X;

import java.util.List;

/* renamed from: X.6Ar  reason: invalid class name and case insensitive filesystem */
public class C124026Ar implements AnonymousClass65X {
    public Object A00;
    public final int A01;

    public C124026Ar(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C113425lP B07(List list) {
        List list2 = list;
        switch (this.A01) {
            case 0:
                C124026Ar r1 = this;
                C64773Ex r4 = (C64773Ex) ((C118075sx) r1.A00).A03.A6O.get();
                return new C113425lP((C56972sr) ((C118075sx) r1.A00).A03.AJW.get(), r4, (AnonymousClass5ZU) ((C118075sx) r1.A00).A03.AaA.get(), (AnonymousClass1VX) ((C118075sx) r1.A00).A03.A07.get(), (AnonymousClass2ML) ((C118075sx) r1.A00).A03.AIy.get(), list2);
            case 1:
                C124026Ar r12 = this;
                C64773Ex r42 = (C64773Ex) ((C118085sy) r12.A00).A01.A6O.get();
                return new C113425lP((C56972sr) ((C118085sy) r12.A00).A01.AJW.get(), r42, (AnonymousClass5ZU) ((C118085sy) r12.A00).A01.AaA.get(), (AnonymousClass1VX) ((C118085sy) r12.A00).A01.A07.get(), (AnonymousClass2ML) ((C118085sy) r12.A00).A01.AIy.get(), list2);
            default:
                return null;
        }
    }
}
