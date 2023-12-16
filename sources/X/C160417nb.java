package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7nb  reason: invalid class name and case insensitive filesystem */
public class C160417nb {
    public String A00;
    public List A01;
    public C158077jO A02;
    public C148377Id A03;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C160417nb
            r2 = 0
            if (r0 == 0) goto L_0x0024
            X.7nb r4 = (X.C160417nb) r4
            X.7jO r1 = r3.A02
            X.7jO r0 = r4.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = r3.A00
            java.lang.String r0 = r4.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.util.List r1 = r3.A01
            java.util.List r0 = r4.A01
            if (r1 != 0) goto L_0x0025
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r2 = 1
        L_0x0024:
            return r2
        L_0x0025:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160417nb.equals(java.lang.Object):boolean");
    }

    public C160417nb(String str, List list, C158077jO r5) {
        this.A02 = r5;
        this.A00 = str;
        this.A01 = list;
        C142426xB r1 = C142426xB.FXAccountItemEligibilityNoData;
        this.A03 = new C148377Id(r1, r1);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A02;
        A0M[1] = this.A00;
        return Arrays.deepHashCode(A0M);
    }

    public C160417nb(String str, List list, C158077jO r3, C148377Id r4) {
        this.A02 = r3;
        this.A00 = str;
        this.A01 = list;
        this.A03 = r4;
    }

    public C160417nb() {
        this.A02 = new C158077jO();
        this.A00 = "";
        this.A01 = Collections.emptyList();
        C142426xB r1 = C142426xB.FXAccountItemEligibilityNoData;
        this.A03 = new C148377Id(r1, r1);
    }
}
