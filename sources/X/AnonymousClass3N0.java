package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3N0  reason: invalid class name */
public class AnonymousClass3N0 implements C84554Cu {
    public final C56972sr A00;
    public final C620333f A01;

    public synchronized boolean A01(C624134x r6, byte b) {
        boolean z;
        z = false;
        if (A00(r6, b)) {
            List<C30331mH> A0B = this.A01.A0B(r6, b);
            if (!A0B.isEmpty()) {
                boolean z2 = true;
                if (b == 56) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (C30331mH r1 : A0B) {
                        if (r1 instanceof C30571mf) {
                            A0s.add((C30571mf) r1);
                            z = true;
                        }
                    }
                    r6.A1t(new C111495iB(this.A00, A0s));
                } else if ((r6 instanceof C30451mT) && b == 67) {
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    for (C30331mH r12 : A0B) {
                        if (r12 instanceof C30591mh) {
                            A0s2.add(r12);
                            z = true;
                        }
                    }
                    ((C30451mT) r6).A1v(A0s2);
                } else if (b == 68) {
                    if (A0B.size() > 1) {
                        z2 = false;
                    }
                    C626936e.A0D(z2, "Multiple KeepInChat messages linked to a parent message");
                    for (C30331mH r13 : A0B) {
                        if (r13 instanceof C30551md) {
                            C30551md r14 = (C30551md) r13;
                            r6.A1S = r14;
                            if (r14 != null) {
                                r6.A07 = r14.A01;
                            }
                            z = true;
                        }
                    }
                } else if (b == 79) {
                    if (A0B.size() > 1) {
                        z2 = false;
                    }
                    C626936e.A0D(z2, "Multiple PinInChat add-on message linked to a parent message");
                    for (C30331mH r15 : A0B) {
                        if (r15 instanceof C30561me) {
                            r6.A1T = (C30561me) r15;
                            z = true;
                        }
                    }
                } else if (b == 86) {
                    if (A0B.size() > 1) {
                        z2 = false;
                    }
                    C626936e.A0D(z2, "Multiple ScheduledCallEdit add-on message linked to a parent message");
                    for (C30331mH r16 : A0B) {
                        if ((r16 instanceof C30581mg) && (r6 instanceof AnonymousClass1nW)) {
                            ((AnonymousClass1nW) r6).A00 = r16;
                            z = true;
                        }
                    }
                } else if (b == 93 && (r6 instanceof C30461mU)) {
                    ArrayList<C30601mi> A0s3 = AnonymousClass001.A0s();
                    for (C30331mH r17 : A0B) {
                        if (r17 instanceof C30601mi) {
                            A0s3.add((C30601mi) r17);
                            z = true;
                        }
                    }
                    C30461mU r62 = (C30461mU) r6;
                    C56972sr r2 = this.A00;
                    C162457s7.A0J(r2, 1);
                    for (C30601mi A1w : A0s3) {
                        r62.A1w(r2, A1w);
                    }
                }
            }
        }
        return z;
    }

    public static boolean A00(C624134x r4, byte b) {
        Object A1v;
        if (!AnonymousClass000.A1S(r4.A08)) {
            return false;
        }
        if (b == 56) {
            if (!AnonymousClass000.A1U(r4.A08 & 1, 1)) {
                return false;
            }
            A1v = r4.A0L;
        } else if (b == 67) {
            if (!(r4 instanceof C30451mT)) {
                return false;
            }
            C30451mT r2 = (C30451mT) r4;
            if (!AnonymousClass000.A1U(r4.A08 & 2, 2)) {
                return false;
            }
            A1v = r2.A04;
        } else if (b == 68) {
            if (!AnonymousClass000.A1U(r4.A08 & 4, 4)) {
                return false;
            }
            A1v = r4.A1S;
        } else if (b == 79) {
            if (!AnonymousClass000.A1U(r4.A08 & 8, 8)) {
                return false;
            }
            A1v = r4.A1T;
        } else if (b == 86) {
            if (!(r4 instanceof AnonymousClass1nW)) {
                return false;
            }
            AnonymousClass1nW r22 = (AnonymousClass1nW) r4;
            if (!AnonymousClass000.A1U(r4.A08 & 16, 16)) {
                return false;
            }
            A1v = r22.A00;
        } else if (b != 93 || !(r4 instanceof C30461mU)) {
            return false;
        } else {
            C30461mU r42 = (C30461mU) r4;
            if (!AnonymousClass000.A1U(r42.A08 & 32, 32)) {
                return false;
            }
            A1v = r42.A1v();
        }
        if (A1v == null) {
            return true;
        }
        return false;
    }

    public boolean BLR(C51692kE r4, C624134x r5) {
        if (!r4.A00.contains(C370920x.SKIP_ADDONS) && !r4.A01) {
            Iterator A11 = C18290x4.A11(new C73323fJ());
            while (A11.hasNext()) {
                if (A00(r5, C18300x5.A00(A11))) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass3N0(C56972sr r1, C620333f r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BJr(C51692kE r3, C624134x r4) {
        if (BLR(r3, r4)) {
            Iterator A11 = C18290x4.A11(new C73323fJ());
            while (A11.hasNext()) {
                A01(r4, C18300x5.A00(A11));
            }
        }
    }
}
