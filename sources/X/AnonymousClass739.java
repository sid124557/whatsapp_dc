package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.739  reason: invalid class name */
public class AnonymousClass739 {
    public static Object A00(C185628tz r13) {
        Object obj;
        AnonymousClass84O r4;
        String valueOf;
        C142156wj Bgg = r13.Bgg();
        C142156wj r5 = C142156wj.START_OBJECT;
        if (Bgg == r5) {
            C131156d8 r42 = null;
            while (true) {
                C142156wj BLY = r13.BLY();
                C142156wj r7 = C142156wj.END_OBJECT;
                if (BLY != r7) {
                    String Bgf = r13.Bgf();
                    int A00 = AnonymousClass73G.A00(Bgf);
                    boolean A1U = C18280x3.A1U(A00, 32);
                    r13.BLY();
                    if (!A1U || 13347 != A00) {
                        C131156d8 r43 = new C131156d8((List) null, A00, 10);
                        if (!A1U) {
                            C159737mN.A01("BloksModelParser", String.format(AnonymousClass000.A0V("Unexpectedly attempting to parse\"\n              + \" an unminified payload: ", Bgf, AnonymousClass001.A0o()), AnonymousClass4L0.A0U()));
                        } else if (r13.Bgg() != r5) {
                            r13.BpQ();
                            r4 = null;
                        } else {
                            while (r13.BLY() != r7) {
                                int A002 = AnonymousClass73G.A00(r13.Bgf());
                                r13.BLY();
                                switch (r13.Bgg().ordinal()) {
                                    case 0:
                                        ArrayList A0s = AnonymousClass001.A0s();
                                        while (r13.BLY() != C142156wj.END_ARRAY) {
                                            if (r13.Bgg() == r5) {
                                                Object A003 = A00(r13);
                                                if (A003 != null) {
                                                    A0s.add(A003);
                                                }
                                            } else {
                                                A0s.add(C154147cg.A00(r13));
                                            }
                                        }
                                        r43.A0T(A002, A0s);
                                        break;
                                    case 2:
                                        obj = A00(r13);
                                        break;
                                    case 5:
                                        obj = r13.Bgh().BqG();
                                        break;
                                    case 6:
                                        obj = AnonymousClass73O.A00(r13.Bgh());
                                        break;
                                    case 7:
                                        obj = r13.Bgh().BLl();
                                        break;
                                    case 8:
                                        obj = Boolean.valueOf(r13.Bgh().Ay6());
                                        break;
                                }
                                r43.A0T(A002, obj);
                                r13.BpQ();
                            }
                            for (int i : AnonymousClass77J.A00) {
                                Object A05 = AnonymousClass84O.A05(r43, i);
                                if (A05 instanceof String) {
                                    r43.A0T(i, new C156077fz((String) A05, (String) AnonymousClass84O.A05(r43, 128), r43.A02, r43.A03, i));
                                }
                            }
                        }
                        r43.A0Y();
                        r4 = r43;
                    } else {
                        AnonymousClass7MQ r2 = new AnonymousClass7MQ();
                        if (r13.Bgg() != r5) {
                            r13.BpQ();
                            r2 = null;
                        } else {
                            while (r13.BLY() != r7) {
                                int A004 = AnonymousClass73G.A00(r13.Bgf());
                                r13.BLY();
                                if (35 == A004) {
                                    r2.A00 = (AnonymousClass84O) A00(r13);
                                } else if (33 == A004) {
                                    C185848uL Bgh = r13.Bgh();
                                    C142156wj Bgg2 = r13.Bgg();
                                    int ordinal = Bgg2.ordinal();
                                    if (ordinal == 7) {
                                        valueOf = String.valueOf(Bgh.BKP());
                                    } else if (ordinal == 5) {
                                        valueOf = Bgh.BqG();
                                    } else {
                                        throw new AnonymousClass6u2(AnonymousClass000.A0P(Bgg2, "Bloks id only supports long and String types but got: ", AnonymousClass001.A0o()));
                                    }
                                    r2.A03 = valueOf;
                                } else if (38 == A004) {
                                    r2.A02 = AnonymousClass73O.A00(r13.Bgh());
                                } else if (43 == A004) {
                                    r2.A01 = AnonymousClass73O.A00(r13.Bgh());
                                }
                                r13.BpQ();
                            }
                        }
                        AnonymousClass84O r0 = r2.A00;
                        if (r0 != null) {
                            AnonymousClass84O r44 = new AnonymousClass84O(r0, r2);
                            r2.A00 = null;
                            r4 = r44;
                        } else {
                            throw new AnonymousClass6u2("Shadow component should never be a leaf node");
                        }
                    }
                    r13.BpQ();
                    r42 = r4;
                } else {
                    if (r42 == null) {
                        C159737mN.A02("BloksParser", AnonymousClass002.A0C("unknown bloks data type"));
                    }
                    return r42;
                }
            }
        } else {
            r13.BpQ();
            throw AnonymousClass002.A0C("Token parsing error.");
        }
    }
}
