package X;

import java.util.List;

/* renamed from: X.2mH  reason: invalid class name and case insensitive filesystem */
public abstract class C52932mH {
    public boolean A00;
    public final C43812To A01;
    public final List A02 = AnonymousClass001.A0s();
    public final List A03 = AnonymousClass001.A0s();

    public static C26501cE A00(C52932mH r1) {
        C26501cE r12 = (C26501cE) r1.A01.A02.get();
        r12.A01 = C60362yR.A00;
        r12.A04();
        return r12;
    }

    public static C26441c8 A01(C26501cE r2, Class cls) {
        r2.A06 = new AnonymousClass8PJ(cls);
        C371020y r1 = C371020y.FULLY_INTEGRATED;
        C162457s7.A0J(r1, 0);
        r2.A00 = r1;
        C26441c8 A06 = r2.A06();
        A06.A04();
        return A06;
    }

    public static C26441c8 A02(C26501cE r2, Class cls) {
        r2.A06 = new AnonymousClass8PJ(cls);
        C371020y r1 = C371020y.IN_DEVELOPMENT;
        C162457s7.A0J(r1, 0);
        r2.A00 = r1;
        C26441c8 A06 = r2.A06();
        A06.A04();
        return A06;
    }

    public static AnonymousClass8PJ A03(C26441c8 r0, Object obj, C85424Ge r2) {
        r0.A06((AnonymousClass4C1) obj, r2);
        return new AnonymousClass8PJ(AnonymousClass4G4.class);
    }

    public static AnonymousClass8PJ A04(C26441c8 r2, Object obj, C85424Ge r4) {
        r2.A06(new AnonymousClass4KG(obj, 18), r4);
        return new AnonymousClass8PJ(AnonymousClass4G2.class);
    }

    public static AnonymousClass8PJ A05(C26441c8 r0, Object obj, C85424Ge r2) {
        r0.A06((AnonymousClass4C1) obj, r2);
        return new AnonymousClass8PJ(AnonymousClass4G3.class);
    }

    public static AnonymousClass8PJ A06(C26441c8 r0, Object obj, C85424Ge r2) {
        r0.A06((AnonymousClass4C1) obj, r2);
        return new AnonymousClass8PJ(C85364Fy.class);
    }

    public void A09() {
        C26441c8 A022;
        AnonymousClass8PJ A16;
        Object obj;
        AnonymousClass8PJ A1E;
        Object obj2;
        C26441c8 A012;
        AnonymousClass8PJ A162;
        Object obj3;
        if (this instanceof C26211bl) {
            C26211bl r4 = (C26211bl) this;
            C26501cE A002 = A00(r4);
            A08(A002, 94);
            C26441c8 A023 = A02(A002, C30381mM.class);
            A023.A06(r4.A00, A04(A023, C75863qr.A00, C18290x4.A16()));
            A07(r4, A002, A023, r4.A01, AnonymousClass0x9.A1E(C85364Fy.class));
        } else if (this instanceof C26251bp) {
            C26251bp r2 = (C26251bp) this;
            int i = r2.A06;
            C26501cE A003 = A00(r2);
            switch (i) {
                case 0:
                    A08(A003, 12);
                    A012 = A01(A003, C30351mJ.class);
                    A162 = C18290x4.A16();
                    obj3 = C75103pd.A00;
                    break;
                case 1:
                    A08(A003, 10);
                    A012 = A01(A003, C30691mr.class);
                    A162 = C18290x4.A16();
                    obj3 = C75223pp.A00;
                    break;
                case 2:
                    A08(A003, 83);
                    A012 = A01(A003, C30971nX.class);
                    A162 = C18290x4.A16();
                    obj3 = C75233pq.A00;
                    break;
                case 3:
                    A08(A003, 11);
                    A012 = A01(A003, C30931nS.class);
                    A162 = C18290x4.A16();
                    obj3 = C75713qc.A00;
                    break;
                case 4:
                    A08(A003, 31);
                    A012 = A01(A003, C30921nR.class);
                    A162 = C18290x4.A16();
                    obj3 = C75723qd.A00;
                    break;
                case 5:
                    A08(A003, 64);
                    A012 = A01(A003, C30961nV.class);
                    A162 = C18290x4.A16();
                    obj3 = C75753qg.A00;
                    break;
                case 6:
                    A08(A003, 15);
                    A012 = A01(A003, C30951nU.class);
                    A162 = C18290x4.A16();
                    obj3 = C75763qh.A00;
                    break;
                default:
                    A08(A003, 19);
                    A012 = A01(A003, C30911nQ.class);
                    A162 = C18290x4.A16();
                    obj3 = C75773qi.A00;
                    break;
            }
            A012.A06((AnonymousClass4C1) r2.A02, A03(A012, r2.A01, A05(A012, r2.A04, A06(A012, r2.A00, A04(A012, obj3, A162)))));
            A012.A06((AnonymousClass4C1) r2.A05, AnonymousClass0x9.A1E(AnonymousClass3N2.class));
            A07(r2, A003, A012, (AnonymousClass4C1) r2.A03, AnonymousClass0x9.A1E(AnonymousClass67E.class));
        } else if (this instanceof C26221bm) {
            C26221bm r5 = (C26221bm) this;
            int i2 = r5.A03;
            C26501cE A004 = A00(r5);
            switch (i2) {
                case 0:
                    A08(A004, 88);
                    A022 = A02(A004, C30251m9.class);
                    A16 = C18290x4.A16();
                    obj = C75053pY.A00;
                    break;
                case 1:
                    A08(A004, 91);
                    A022 = A02(A004, C30231m7.class);
                    A022.A06(new AnonymousClass4KG(C75073pa.A00, 18), C18290x4.A16());
                    A022.A06((AnonymousClass4C1) r5.A01, A05(A022, r5.A02, AnonymousClass0x9.A1E(C85364Fy.class)));
                    A1E = AnonymousClass0x9.A1E(AnonymousClass4G2.class);
                    obj2 = r5.A00;
                    break;
                default:
                    A08(A004, 89);
                    A022 = A02(A004, C30901nP.class);
                    A16 = C18290x4.A16();
                    obj = C75853qq.A00;
                    break;
            }
            A1E = A05(A022, r5.A02, A06(A022, r5.A00, A04(A022, obj, A16)));
            obj2 = r5.A01;
            A07(r5, A004, A022, (AnonymousClass4C1) obj2, A1E);
        }
    }

    public C52932mH(C43812To r2) {
        this.A01 = r2;
    }

    public static void A07(C52932mH r1, C26501cE r2, C26441c8 r3, AnonymousClass4C1 r4, C85424Ge r5) {
        r3.A06(r4, r5);
        r3.A03();
        r3.A00 = true;
        r2.A03();
        r2.A00 = true;
        synchronized (r1) {
            r1.A03.add(r2);
        }
    }

    public static void A08(C26501cE r1, int i) {
        r1.A05 = Integer.valueOf(i);
    }
}
