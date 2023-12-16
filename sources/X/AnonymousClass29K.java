package X;

/* renamed from: X.29K  reason: invalid class name */
public final class AnonymousClass29K {
    public static final int A01(AnonymousClass36Y r4, C624134x r5, C50222hp r6, C45042Yl r7) {
        AnonymousClass4DW A00;
        AnonymousClass315 A01;
        C624134x A0w;
        C162457s7.A0J(r5, 0);
        int i = 1;
        C18260x0.A0Z(r4, r6, r7, 1);
        if (r5 instanceof C30571mf) {
            return 34;
        }
        if (r5 instanceof C30451mT) {
            return 37;
        }
        if (r5 instanceof C30591mh) {
            return 38;
        }
        if (r5 instanceof C30561me) {
            return 54;
        }
        if (r5 instanceof C30551md) {
            if (((C30551md) r5).A01 == 1) {
                return 40;
            }
            return 41;
        } else if (r5 instanceof AnonymousClass1nW) {
            return 51;
        } else {
            if ((r5 instanceof C30971nX) || (r5 instanceof C30581mg)) {
                return 52;
            }
            if (r5 instanceof C30461mU) {
                return 58;
            }
            if (r5 instanceof C30601mi) {
                return 59;
            }
            if (C627636p.A0k(r5)) {
                return 30;
            }
            if (C624134x.A0c(r5)) {
                return 27;
            }
            if (!(r5 instanceof C30481mW) || (A0w = r5.A0w()) == null || A0w.A1I != 54) {
                if (!(r5 instanceof AnonymousClass4DV) || (A01 = r6.A01((AnonymousClass4DV) r5)) == null) {
                    if ((r5 instanceof C31901p2) && (A00 = r7.A00((C31901p2) r5)) != null) {
                        return A00.B9E();
                    }
                    i = C624134x.A05(r5);
                    String A13 = r5.A13();
                    if (i == 9 && r5.A1l() && A13 != null) {
                        C106685Zz r1 = r4.A07;
                        if (r4.A0J(r1.A03(A13))) {
                            return 22;
                        }
                        if (r4.A0K(r1.A03(A13))) {
                            return 23;
                        }
                    }
                } else if (A01 instanceof AnonymousClass1pO) {
                    return 33;
                } else {
                    if (A01 instanceof AnonymousClass1pL) {
                        return 25;
                    }
                    if (A01 instanceof AnonymousClass1pP) {
                        if (!AnonymousClass39W.A00(A01.A02, "galaxy_message")) {
                            return 35;
                        }
                        return 1;
                    } else if (A01 instanceof C32011pN) {
                        return 55;
                    } else {
                        return 1;
                    }
                }
            }
            return i;
        }
    }

    public static int A00(AnonymousClass36E r3, C624134x r4) {
        return A01(r3.A0D, r4, r3.A0Q, r3.A0R);
    }
}
