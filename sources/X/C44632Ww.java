package X;

/* renamed from: X.2Ww  reason: invalid class name and case insensitive filesystem */
public class C44632Ww {
    public final C56982ss A00;

    public boolean A00(C624134x r6) {
        try {
            if (!(r6 instanceof C31891p1)) {
                return false;
            }
            C31891p1 r2 = (C31891p1) r6;
            AnonymousClass39T r0 = r2.A04;
            if (r0 != null && this.A00.A06(AnonymousClass32V.A00(C627336j.A02(r0.A02))) == 1) {
                return false;
            }
            int i = r2.A00;
            if (i == 4) {
                if (r2.A00 != 1) {
                    return false;
                }
            } else if (i == 12) {
                if (r2.A00 != 1) {
                    return false;
                }
            } else if (i == 127) {
                if (r2.A00 != 1) {
                    return false;
                }
            } else if (i == 90) {
                if (r2.A00 != 1) {
                    return false;
                }
            } else if (i == 106) {
                if (r2.A00 != 1) {
                    return false;
                }
            } else if (i == 124) {
                if (r2.A00 != 1) {
                    return false;
                }
            } else if (i == 144) {
                if (r2.A00 != 1) {
                    return false;
                }
            } else if (i == 143) {
                if (!"sub_group_suggestion_approved".equals(((C31471oL) r2).A01)) {
                    return false;
                }
            } else if (i == 149) {
                if (r2.A00 != 1) {
                    return false;
                }
                String A13 = r2.A13();
                if (A13 != null) {
                    if (A13.equals("invite") || A13.equals("linked_group_join")) {
                        return false;
                    }
                }
            } else if (!(i == 145 && this.A00.A06(AnonymousClass32V.A00(r2.A1J.A00)) == 3)) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GroupMessageUtils/importantmsg/null ");
            C18260x0.A15(C627636p.A0E(r6), A0o, e);
            throw e;
        }
    }

    public C44632Ww(C56982ss r1) {
        this.A00 = r1;
    }
}
