package X;

import java.util.concurrent.ConcurrentMap;

/* renamed from: X.7iD  reason: invalid class name and case insensitive filesystem */
public final class C157387iD {
    public static final C157387iD A02 = new C157387iD();
    public final C155907fi A00 = new C155907fi();
    public final ConcurrentMap A01 = AnonymousClass0x9.A1D();

    public C186358vA A00(Class cls) {
        C140836ub r1;
        AnonymousClass733 r7;
        C158277ji r5;
        C151437Ut r9;
        AnonymousClass731 r4;
        C159367li r6;
        C151437Ut r2;
        AnonymousClass731 r12;
        Class cls2;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A01;
            C186358vA r42 = (C186358vA) concurrentMap.get(cls);
            if (r42 == null) {
                C155907fi r13 = this.A00;
                Class<C130786cX> cls3 = C130786cX.class;
                if (cls3.isAssignableFrom(cls) || (cls2 = C162507sF.A03) == null || cls2.isAssignableFrom(cls)) {
                    AnonymousClass7MO BLD = r13.A00.BLD(cls);
                    int i = BLD.A00;
                    if ((i & 2) == 2) {
                        if (cls3.isAssignableFrom(cls)) {
                            r2 = C162507sF.A02;
                            r12 = C1460078f.A01;
                        } else {
                            r2 = C162507sF.A00;
                            r12 = C1460078f.A00;
                            if (r12 == null) {
                                throw AnonymousClass001.A0e("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        r42 = new C170228Cj(r12, BLD.A01, r2);
                    } else {
                        boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                        if ((i & 1) == 1) {
                            r1 = C140836ub.PROTO2;
                        } else {
                            r1 = C140836ub.PROTO3;
                        }
                        boolean A1Y = AnonymousClass000.A1Y(r1, C140836ub.PROTO2);
                        if (isAssignableFrom) {
                            r7 = C1460278h.A01;
                            r5 = C158277ji.A01;
                            r9 = C162507sF.A02;
                            if (A1Y) {
                                r4 = C1460078f.A01;
                                r6 = C1460178g.A01;
                            } else {
                                r4 = null;
                                r6 = C1460178g.A01;
                            }
                        } else {
                            r7 = C1460278h.A00;
                            r5 = C158277ji.A00;
                            if (A1Y) {
                                r9 = C162507sF.A00;
                                r4 = C1460078f.A00;
                                if (r4 != null) {
                                    r6 = C1460178g.A00;
                                } else {
                                    throw AnonymousClass001.A0e("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                r9 = C162507sF.A01;
                                r4 = null;
                                r6 = C1460178g.A00;
                            }
                        }
                        r42 = C170238Ck.A0I(r4, r5, r6, r7, BLD, r9);
                    }
                    C186358vA r0 = (C186358vA) concurrentMap.putIfAbsent(cls, r42);
                    if (r0 != null) {
                        return r0;
                    }
                } else {
                    throw AnonymousClass001.A0c("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
            }
            return r42;
        }
        throw AnonymousClass001.A0g("messageType");
    }
}
