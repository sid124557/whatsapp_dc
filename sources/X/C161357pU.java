package X;

import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: X.7pU  reason: invalid class name and case insensitive filesystem */
public class C161357pU {
    public static final C161357pU A0E;
    public static final C161357pU A0F;
    public static final C161357pU A0G;
    public static final C161357pU[] A0H;
    public final int A00;
    public final int A01;
    public final C85204Fi A02;
    public final String A03;
    public final String A04;
    public final LinkedHashSet A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final int[] A09;
    public final int[] A0A;
    public final C151007Tb[] A0B;
    public final C151007Tb[] A0C;
    public final C151007Tb[] A0D;

    static {
        C85204Fi r14 = AnonymousClass1S3.A06;
        C161357pU r13 = new C161357pU(r14, "UNSET", "UNSET", new LinkedHashSet(Collections.singletonList(r14)), (int[]) null, (int[]) null, (C151007Tb[]) null, (C151007Tb[]) null, new C151007Tb[0], 0, 0, false, false, false);
        A0G = r13;
        C85204Fi r15 = AnonymousClass1S3.A05;
        LinkedHashSet linkedHashSet = new LinkedHashSet(Collections.singletonList(r15));
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        int[] iArr = {2};
        C161357pU r142 = new C161357pU(r15, "IN", "91", linkedHashSet2, iArr, new int[]{2}, new C151007Tb[]{new C151007Tb("tos_no_wallet", false, "1"), new C151007Tb("add_bank", false, "1"), new C151007Tb("2fa", false, "1")}, new C151007Tb[]{new C151007Tb("add_payment_service", false, "1")}, new C151007Tb[0], 3, 3, true, true, true);
        A0F = r142;
        C85204Fi r16 = AnonymousClass1S3.A04;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet(Collections.singletonList(r16));
        C151007Tb[] r4 = {new C151007Tb("tos_no_wallet", false, "1"), new C151007Tb("kyc", false, "1"), new C151007Tb("add_card", false, "1")};
        int[] iArr2 = {1, 4, 6};
        int[] iArr3 = {1, 4, 6};
        C151007Tb[] r22 = r4;
        LinkedHashSet linkedHashSet4 = linkedHashSet3;
        C161357pU r152 = new C161357pU(r16, "BR", "55", linkedHashSet4, iArr2, iArr3, r22, new C151007Tb[]{new C151007Tb("add_business", false, "1")}, new C151007Tb[]{new C151007Tb("custom_payment_method_tos", false, "1")}, 1, 1, true, true, false);
        A0E = r152;
        A0H = new C161357pU[]{r13, r142, r152};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C161357pU A00(java.lang.String r6) {
        /*
            if (r6 == 0) goto L_0x0029
            X.7pU[] r5 = A0H
            int r2 = r5.length
            r4 = 0
            r1 = 0
        L_0x0007:
            if (r1 >= r2) goto L_0x0016
            r3 = r5[r1]
            java.lang.String r0 = r3.A03
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x0028
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0016:
            X.7pU[] r2 = X.AnonymousClass798.A00
            int r1 = r2.length
        L_0x0019:
            if (r4 >= r1) goto L_0x0029
            r3 = r2[r4]
            java.lang.String r0 = r3.A03
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0019
        L_0x0028:
            return r3
        L_0x0029:
            X.7pU r0 = A0G
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161357pU.A00(java.lang.String):X.7pU");
    }

    public C151007Tb[] A02(String str) {
        if ("merchant_account_linking_context".equals(str)) {
            return this.A0C;
        }
        if ("custom_payment_method_linking".equals(str)) {
            return this.A0B;
        }
        return this.A0D;
    }

    public C161357pU(C85204Fi r1, String str, String str2, LinkedHashSet linkedHashSet, int[] iArr, int[] iArr2, C151007Tb[] r7, C151007Tb[] r8, C151007Tb[] r9, int i, int i2, boolean z, boolean z2, boolean z3) {
        C626936e.A05(str);
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A05 = linkedHashSet;
        this.A08 = z2;
        this.A09 = iArr;
        this.A0A = iArr2;
        this.A0D = r7;
        this.A0C = r8;
        this.A0B = r9;
        this.A07 = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C161357pU A01(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x002d
            X.7pU[] r5 = A0H
            int r2 = r5.length
            r4 = 0
            r1 = 0
        L_0x000b:
            if (r1 >= r2) goto L_0x001a
            r3 = r5[r1]
            java.lang.String r0 = r3.A04
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x002c
            int r1 = r1 + 1
            goto L_0x000b
        L_0x001a:
            X.7pU[] r2 = X.AnonymousClass798.A00
            int r1 = r2.length
        L_0x001d:
            if (r4 >= r1) goto L_0x002d
            r3 = r2[r4]
            java.lang.String r0 = r3.A04
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x002c
            int r4 = r4 + 1
            goto L_0x001d
        L_0x002c:
            return r3
        L_0x002d:
            X.7pU r0 = A0G
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161357pU.A01(java.lang.String):X.7pU");
    }
}
