package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0WB  reason: invalid class name */
public class AnonymousClass0WB {
    public static final AnonymousClass0WB A02 = new AnonymousClass0WB("COMPOSITION");
    public C16790ty A00;
    public final List A01;

    public int A00(String str, int i) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (!AnonymousClass001.A0n(list, i).equals("**")) {
                return 1;
            }
            if (i == AnonymousClass002.A04(list, 1) || !AnonymousClass001.A0n(list, i + 1).equals(str)) {
                return 0;
            }
            return 2;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r0 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(java.lang.String r8, int r9) {
        /*
            r7 = this;
            java.util.List r3 = r7.A01
            int r0 = r3.size()
            r6 = 0
            if (r9 >= r0) goto L_0x004a
            int r0 = r3.size()
            r5 = 1
            int r0 = r0 - r5
            boolean r4 = X.AnonymousClass000.A1U(r9, r0)
            java.lang.String r1 = X.AnonymousClass001.A0n(r3, r9)
            java.lang.String r2 = "**"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x004b
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "*"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r1 = 1
        L_0x002f:
            if (r4 != 0) goto L_0x0047
            int r0 = r3.size()
            int r0 = r0 + -2
            if (r9 != r0) goto L_0x004a
            int r0 = X.AnonymousClass002.A03(r3)
            java.lang.String r0 = X.AnonymousClass001.A0n(r3, r0)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x004a
        L_0x0047:
            if (r1 == 0) goto L_0x004a
        L_0x0049:
            r6 = 1
        L_0x004a:
            return r6
        L_0x004b:
            if (r4 != 0) goto L_0x0085
            int r1 = r9 + 1
            java.lang.String r0 = X.AnonymousClass001.A0n(r3, r1)
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0076
            int r0 = r3.size()
            int r0 = r0 + -2
            if (r9 == r0) goto L_0x0049
            int r0 = r3.size()
            int r0 = r0 + -3
            if (r9 != r0) goto L_0x004a
            int r0 = X.AnonymousClass002.A03(r3)
            java.lang.String r0 = X.AnonymousClass001.A0n(r3, r0)
            boolean r1 = r0.equals(r2)
            goto L_0x0047
        L_0x0076:
            int r0 = X.AnonymousClass002.A04(r3, r5)
            if (r1 < r0) goto L_0x004a
            java.lang.String r0 = X.AnonymousClass001.A0n(r3, r1)
            boolean r0 = r0.equals(r8)
            return r0
        L_0x0085:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WB.A01(java.lang.String, int):boolean");
    }

    public boolean A02(String str, int i) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (i >= list.size() || (!AnonymousClass001.A0n(list, i).equals(str) && !AnonymousClass001.A0n(list, i).equals("**") && !AnonymousClass001.A0n(list, i).equals("*"))) {
                return false;
            }
        }
        return true;
    }

    public boolean A03(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.A01;
        if (i < AnonymousClass002.A04(list, 1) || AnonymousClass001.A0n(list, i).equals("**")) {
            return true;
        }
        return false;
    }

    public AnonymousClass0WB(AnonymousClass0WB r2) {
        this.A01 = AnonymousClass002.A0J(r2.A01);
        this.A00 = r2.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("KeyPath{keys=");
        A0o.append(this.A01);
        A0o.append(",resolved=");
        A0o.append(AnonymousClass000.A1W(this.A00));
        return AnonymousClass000.A0d(A0o);
    }

    public AnonymousClass0WB(String... strArr) {
        this.A01 = Arrays.asList(strArr);
    }
}
