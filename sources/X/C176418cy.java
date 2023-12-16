package X;

/* renamed from: X.8cy  reason: invalid class name and case insensitive filesystem */
public class C176418cy extends AnonymousClass8Q0 {
    public C176958dq A00;

    public static C176418cy A0A(Object obj) {
        if (obj instanceof C176418cy) {
            return (C176418cy) obj;
        }
        if (obj != null) {
            return new C176418cy(C176958dq.A0C(obj));
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.8d6[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C176498d6[] A0N() {
        /*
            r5 = this;
            X.8dq r4 = r5.A00
            int r0 = r4.A0U()
            X.8d6[] r3 = new X.C176498d6[r0]
            r1 = 0
        L_0x0009:
            int r0 = r4.A0U()
            if (r1 == r0) goto L_0x0038
            X.8qL r2 = r4.A0W(r1)
            if (r2 == 0) goto L_0x0025
            boolean r0 = r2 instanceof X.C176498d6
            if (r0 != 0) goto L_0x0025
            boolean r0 = r2 instanceof X.C176958dq
            if (r0 == 0) goto L_0x002a
            X.8dq r2 = (X.C176958dq) r2
            X.8d6 r0 = new X.8d6
            r0.<init>((X.C176958dq) r2)
            r2 = r0
        L_0x0025:
            r3[r1] = r2
            int r1 = r1 + 1
            goto L_0x0009
        L_0x002a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid DistributionPoint: "
            X.C18260x0.A1T(r1, r0, r2)
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r1)
            throw r0
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176418cy.A0N():X.8d6[]");
    }

    public C176418cy(C176958dq r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuffer A0X = AnonymousClass6CA.A0X();
        String str = C162077rB.A00;
        A0X.append("CRLDistPoint:");
        A0X.append(str);
        C176498d6[] A0N = A0N();
        for (int i = 0; i != A0N.length; i++) {
            A0X.append("    ");
            A0X.append(A0N[i]);
            A0X.append(str);
        }
        return A0X.toString();
    }
}
