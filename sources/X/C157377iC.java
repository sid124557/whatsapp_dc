package X;

import java.util.concurrent.ConcurrentMap;

/* renamed from: X.7iC  reason: invalid class name and case insensitive filesystem */
public final class C157377iC {
    public static final C157377iC A02 = new C157377iC();
    public final C178658ht A00 = new C169878Az();
    public final ConcurrentMap A01 = AnonymousClass0x9.A1D();

    public final C186268v1 A00(Class cls) {
        C178628hq r8;
        C157887j3 r5;
        C1445772c r9;
        C1445572a r4;
        C181048m3 r6;
        C1445772c r2;
        C1445572a r1;
        Class cls2;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A01;
            C186268v1 r42 = (C186268v1) concurrentMap.get(cls);
            if (r42 == null) {
                C169878Az r12 = (C169878Az) this.A00;
                Class<C128766Xj> cls3 = C128766Xj.class;
                if (cls3.isAssignableFrom(cls) || (cls2 = C162497sE.A03) == null || cls2.isAssignableFrom(cls)) {
                    C178618hp Btb = r12.A00.Btb(cls);
                    C169788Aq r52 = (C169788Aq) Btb;
                    int i = r52.A00;
                    if ((i & 2) == 2) {
                        if (cls3.isAssignableFrom(cls)) {
                            r2 = C162497sE.A02;
                            r1 = AnonymousClass78Z.A00;
                        } else {
                            r2 = C162497sE.A00;
                            r1 = AnonymousClass78Z.A01;
                            if (r1 == null) {
                                throw AnonymousClass001.A0e("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        r42 = new C169858Ax(r1, r52.A01, r2);
                    } else {
                        boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                        boolean A1U = AnonymousClass000.A1U(i & 1, 1);
                        if (isAssignableFrom) {
                            r8 = C1459878c.A01;
                            r5 = C157887j3.A01;
                            r9 = C162497sE.A02;
                            if (A1U) {
                                r4 = AnonymousClass78Z.A00;
                                r6 = C1459778b.A01;
                            } else {
                                r4 = null;
                                r6 = C1459778b.A01;
                            }
                        } else {
                            r8 = C1459878c.A00;
                            r5 = C157887j3.A00;
                            if (A1U) {
                                r9 = C162497sE.A00;
                                r4 = AnonymousClass78Z.A01;
                                if (r4 != null) {
                                    r6 = C1459778b.A00;
                                } else {
                                    throw AnonymousClass001.A0e("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                r9 = C162497sE.A01;
                                r4 = null;
                                r6 = C1459778b.A00;
                            }
                        }
                        r42 = C169868Ay.A0D(r4, r5, r6, Btb, r8, r9);
                    }
                    C186268v1 r0 = (C186268v1) concurrentMap.putIfAbsent(cls, r42);
                    if (r0 != null) {
                        return r0;
                    }
                } else {
                    throw AnonymousClass001.A0c("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
            return r42;
        }
        throw AnonymousClass001.A0g("messageType");
    }
}
