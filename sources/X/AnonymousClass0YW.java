package X;

import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.0YW  reason: invalid class name */
public final class AnonymousClass0YW {
    public static final AnonymousClass0YW A00 = new AnonymousClass0YW();

    public static final C165857xk A01(C153427bI r2, C131266dJ r3, AnonymousClass84O r4, C835248t r5) {
        return new C165857xk(new C10140hS(r2, r3, r4, r5));
    }

    public static final C166217yK A09(AnonymousClass84O r3) {
        if (r3 == null) {
            return null;
        }
        return new C166217yK(C162407s0.A0A(r3.A0O(36), 16777215), C162407s0.A0A(r3.A0O(35), 16777215));
    }

    public static final C166217yK A0A(AnonymousClass84O r3) {
        if (r3 == null) {
            return null;
        }
        return new C166217yK(C162407s0.A0A(r3.A0O(36), -1728053248), C162407s0.A0A(r3.A0O(35), -1728053248));
    }

    public final C166287yR A0B(AnonymousClass84O r6) {
        if (r6 == null) {
            return null;
        }
        return new C166287yR(A00(r6, 36), A00(r6, 40), A00(r6, 38), A00(r6, 35));
    }

    public final C161887qm A0C(C153427bI r29, C131266dJ r30, AnonymousClass84O r31) {
        C142896xy r18;
        C142906xz r19;
        C142916y0 r15;
        AnonymousClass84O r0 = r31;
        if (r31 != null) {
            int A0D = r0.A0D();
            C153427bI r13 = r29;
            C131266dJ r2 = r30;
            if (A0D == 14059) {
                boolean A0W = r0.A0W(36, false);
                String A0P = r0.A0P(40, "FULL_SHEET");
                C162457s7.A0D(A0P);
                C995757d A07 = A07(A0P);
                String A0P2 = r0.A0P(46, "NEVER_ANIMATED");
                C162457s7.A0D(A0P2);
                C995657c A05 = A05(A0P2);
                C835248t A0L = r0.A0L(42);
                if (A0W) {
                    r18 = C142896xy.DISABLED;
                } else {
                    r18 = C142896xy.ENABLED;
                }
                if (A07 == C995757d.FULL_SHEET) {
                    r19 = C142906xz.FULL_SHEET;
                } else {
                    r19 = C142906xz.HALF_SHEET;
                }
                int ordinal = A05.ordinal();
                if (ordinal == 0) {
                    r15 = C142916y0.ANIMATED;
                } else if (ordinal == 1) {
                    r15 = C142916y0.DISABLED;
                } else if (ordinal != 3) {
                    r15 = C142916y0.STATIC;
                } else {
                    r15 = C142916y0.ANIMATED_WHILE_LOADING;
                }
                return new C161887qm((AnonymousClass0GI) null, r13, A01(r13, r2, r0, A0L), r15, (C166287yR) null, C142886xx.AUTO, r18, r19, (C166217yK) null, (C166217yK) null, (Integer) null, (String) null, 16542, false, false, false);
            }
            if (A0D == 16085) {
                String A0P3 = r0.A0P(36, "auto");
                C162457s7.A0D(A0P3);
                C142896xy A04 = A04(A0P3);
                String A0P4 = r0.A0P(38, "full_sheet");
                C162457s7.A0D(A0P4);
                C142906xz A06 = A06(A0P4);
                String A0P5 = r0.A0P(35, "static");
                C162457s7.A0D(A0P5);
                C142916y0 A02 = A02(A0P5);
                String A0P6 = r0.A0P(43, "auto");
                C162457s7.A0D(A0P6);
                C142886xx A03 = A03(A0P6);
                C166217yK A0A = A0A(r0.A0K(55));
                C166217yK A09 = A09(r0.A0K(57));
                C166287yR A0B = A0B(r0.A0K(58));
                C835248t A0L2 = r0.A0L(40);
                return new C161887qm((AnonymousClass0GI) null, r13, A01(r13, r2, r0, A0L2), A02, A0B, A03, A04, A06, A0A, A09, (Integer) null, (String) null, 16542, r0.A0W(48, false), false, false);
            } else if (A0D == 16542) {
                String A0P7 = r0.A0P(35, "full_sheet");
                C162457s7.A0D(A0P7);
                C142906xz A062 = A06(A0P7);
                String A0P8 = r0.A0P(38, "auto");
                C162457s7.A0D(A0P8);
                C142896xy A042 = A04(A0P8);
                String A0P9 = r0.A0P(40, "adjust_pan");
                C162457s7.A0D(A0P9);
                int hashCode = A0P9.hashCode();
                int i = 32;
                if (hashCode != -1009740956) {
                    if (hashCode == -205076707 && A0P9.equals("adjust_nothing")) {
                        i = 48;
                    }
                } else if (A0P9.equals("adjust_resize")) {
                    i = 16;
                }
                AnonymousClass0GI A002 = AnonymousClass0GI.A00(r0.A0P(41, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID));
                C166217yK A0A2 = A0A(r0.A0K(52));
                C166217yK A092 = A09(r0.A0K(54));
                return new C161887qm(A002, r13, (C165857xk) null, C142916y0.STATIC, A0B(r0.A0K(55)), C142886xx.AUTO, A042, A062, A0A2, A092, Integer.valueOf(i), (String) null, 16542, false, false, false);
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Error matching OpenCDSSCreenConfig from options styleId: ");
                C159737mN.A01("CdsOpenScreenConfig", AnonymousClass000.A0R(r0.A0I(), A0o));
            }
        }
        return A08();
    }

    public static final int A00(AnonymousClass84O r5, int i) {
        String str;
        StringBuilder A0o;
        String A0O = r5.A0O(i);
        try {
            return (int) C162407s0.A03(A0O, 4.0f);
        } catch (AnonymousClass6u2 unused) {
            if (i != 35) {
                if (i == 36) {
                    str = "left";
                } else if (i == 38) {
                    str = "right";
                } else if (i != 40) {
                    A0o = AnonymousClass001.A0o();
                    A0o.append("Invalid BottomSheetMargin prop constant: ");
                    A0o.append(i);
                } else {
                    str = "top";
                }
                A0o = AnonymousClass001.A0o();
                A0o.append("Invalid format for bottom-sheet-margin prop ");
                A0o.append(str);
                A0o.append(" : ");
                A0o.append(A0O);
            } else {
                str = "bottom";
                A0o = AnonymousClass001.A0o();
                A0o.append("Invalid format for bottom-sheet-margin prop ");
                A0o.append(str);
                A0o.append(" : ");
                A0o.append(A0O);
            }
            C159737mN.A01("BloksCdsOpenScreenConfig", A0o.toString());
            return 0;
        }
    }

    public static final C142916y0 A02(String str) {
        C142916y0 A002 = C142916y0.A00(str);
        C162457s7.A0D(A002);
        return A002;
    }

    public static final C142886xx A03(String str) {
        C142886xx A002 = C142886xx.A00(str);
        C162457s7.A0D(A002);
        return A002;
    }

    public static final C142896xy A04(String str) {
        C142896xy A002 = C142896xy.A00(str);
        C162457s7.A0D(A002);
        return A002;
    }

    public static final C995657c A05(String str) {
        try {
            return C995657c.valueOf(str);
        } catch (IllegalArgumentException e) {
            C159737mN.A02("CdsOpenScreenConfig", e);
            return C995657c.NEVER_ANIMATED;
        }
    }

    public static final C142906xz A06(String str) {
        C142906xz A002 = C142906xz.A00(str);
        C162457s7.A0D(A002);
        return A002;
    }

    public static final C995757d A07(String str) {
        try {
            return C995757d.valueOf(str);
        } catch (IllegalArgumentException e) {
            C159737mN.A02("CdsOpenScreenConfig", e);
            return C995757d.FULL_SHEET;
        }
    }

    public static final C161887qm A08() {
        return C161887qm.A00();
    }
}
