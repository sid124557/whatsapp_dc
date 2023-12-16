package X;

import java.util.concurrent.ConcurrentMap;

/* renamed from: X.7iA  reason: invalid class name and case insensitive filesystem */
public final class C157357iA {
    public static final C157357iA A02 = new C157357iA();
    public final C178508he A00 = new AnonymousClass8AJ();
    public final ConcurrentMap A01 = AnonymousClass0x9.A1D();

    public final C185828uJ A00(Class cls) {
        AnonymousClass72R r8;
        C157867j1 r5;
        AnonymousClass72T r9;
        AnonymousClass72Q r4;
        C154027cS r6;
        AnonymousClass72T r2;
        AnonymousClass72Q r1;
        Class cls2;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A01;
            C185828uJ r42 = (C185828uJ) concurrentMap.get(cls);
            if (r42 == null) {
                AnonymousClass8AJ r12 = (AnonymousClass8AJ) this.A00;
                Class<AnonymousClass6V4> cls3 = AnonymousClass6V4.class;
                if (cls3.isAssignableFrom(cls) || (cls2 = C159897me.A03) == null || cls2.isAssignableFrom(cls)) {
                    C178488hc BtY = r12.A00.BtY(cls);
                    AnonymousClass8AB r52 = (AnonymousClass8AB) BtY;
                    int i = r52.A00;
                    if ((i & 2) == 2) {
                        if (cls3.isAssignableFrom(cls)) {
                            r2 = C159897me.A02;
                            r1 = AnonymousClass78Q.A00;
                        } else {
                            r2 = C159897me.A00;
                            r1 = AnonymousClass78Q.A01;
                            if (r1 == null) {
                                throw AnonymousClass001.A0e("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        r42 = new AnonymousClass8AH(r1, r52.A01, r2);
                    } else {
                        boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                        boolean A1U = AnonymousClass000.A1U(i & 1, 1);
                        if (isAssignableFrom) {
                            r8 = AnonymousClass78S.A01;
                            r5 = C157867j1.A01;
                            r9 = C159897me.A02;
                            if (A1U) {
                                r4 = AnonymousClass78Q.A00;
                                r6 = AnonymousClass78R.A01;
                            } else {
                                r4 = null;
                                r6 = AnonymousClass78R.A01;
                            }
                        } else {
                            r8 = AnonymousClass78S.A00;
                            r5 = C157867j1.A00;
                            if (A1U) {
                                r9 = C159897me.A00;
                                r4 = AnonymousClass78Q.A01;
                                if (r4 != null) {
                                    r6 = AnonymousClass78R.A00;
                                } else {
                                    throw AnonymousClass001.A0e("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                r9 = C159897me.A01;
                                r4 = null;
                                r6 = AnonymousClass78R.A00;
                            }
                        }
                        r42 = AnonymousClass8AI.A08(r4, r5, r6, BtY, r8, r9);
                    }
                    C185828uJ r0 = (C185828uJ) concurrentMap.putIfAbsent(cls, r42);
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
