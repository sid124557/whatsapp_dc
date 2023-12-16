package X;

/* renamed from: X.8Dg  reason: invalid class name and case insensitive filesystem */
public class C170458Dg implements C181478mp {
    public boolean B2l(C159187lJ r5, C159187lJ r6, AnonymousClass7MS r7) {
        boolean z;
        boolean z2;
        C131466dd r2;
        C131446db r0;
        String str;
        boolean z3 = r5 instanceof C131466dd;
        if (z3) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = r6 instanceof C131466dd;
        if (z4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 ^ z)) {
            return false;
        }
        if (z) {
            if (z3) {
                r2 = (C131466dd) r5;
                if ((r6 instanceof C131446db) || (r6 instanceof C131486df)) {
                    r0 = r6.A05();
                    str = r0.A01;
                } else {
                    if (r6 instanceof C131426dZ) {
                        str = ((C131426dZ) r6).toString();
                    }
                    str = "";
                }
            } else {
                throw C131316dO.A00("Expected regexp node");
            }
        } else if (z4) {
            r2 = (C131466dd) r6;
            if ((r5 instanceof C131446db) || (r5 instanceof C131486df)) {
                r0 = r5.A05();
                str = r0.A01;
            } else {
                if (r5 instanceof C131426dZ) {
                    str = ((C131426dZ) r5).toString();
                }
                str = "";
            }
        } else {
            throw C131316dO.A00("Expected regexp node");
        }
        return C18280x3.A1X(str, r2.A02);
    }
}
