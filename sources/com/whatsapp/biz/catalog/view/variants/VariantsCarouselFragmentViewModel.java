package com.whatsapp.biz.catalog.view.variants;

import X.AnonymousClass08M;
import X.AnonymousClass1VX;
import X.AnonymousClass4GQ;
import X.AnonymousClass4UC;
import X.C05110Rz;
import X.C05550Ty;
import X.C06270Wx;
import X.C109015dw;
import X.C155797fW;
import X.C162457s7;

public final class VariantsCarouselFragmentViewModel extends C05550Ty {
    public C109015dw A00;
    public AnonymousClass4GQ A01;
    public boolean A02;
    public boolean A03;
    public final C06270Wx A04;
    public final AnonymousClass08M A05;
    public final C155797fW A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass4UC A08 = new AnonymousClass4UC();

    public VariantsCarouselFragmentViewModel(C155797fW r2, AnonymousClass1VX r3) {
        C162457s7.A0J(r3, 2);
        this.A06 = r2;
        this.A07 = r3;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A05 = A012;
        this.A04 = C05110Rz.A01(A012);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0 > r6) goto L_0x0025;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081 A[LOOP:0: B:20:0x0044->B:36:0x0081, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x008e A[EDGE_INSN: B:57:0x008e->B:42:0x008e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C152477Za A0D(X.C108755dV r17, java.util.List r18, int r19) {
        /*
            r16 = this;
            r5 = 0
            r7 = r17
            if (r17 == 0) goto L_0x008a
            java.util.List r0 = r7.A03
        L_0x0007:
            r14 = 0
            r10 = 1
            r6 = r19
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0034
        L_0x0013:
            r0 = r16
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0034
            if (r17 == 0) goto L_0x0032
            java.util.List r0 = r7.A02
            if (r0 == 0) goto L_0x0032
            int r0 = r0.size()
        L_0x0023:
            if (r0 <= r6) goto L_0x0034
        L_0x0025:
            r9 = -1
            r6 = 0
            X.7y9 r7 = X.C1448473e.A00()
            X.7Za r5 = new X.7Za
            r8 = r6
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x0032:
            r0 = 2
            goto L_0x0023
        L_0x0034:
            r0 = r18
            java.lang.Object r12 = X.C73723fy.A06(r0, r6)
            X.7y9 r12 = (X.C166107y9) r12
            if (r12 == 0) goto L_0x0088
            java.util.List r3 = r12.A01
            java.util.Iterator r9 = r3.iterator()
        L_0x0044:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r9.next()
            X.7xh r0 = (X.C165827xh) r0
            java.lang.String r8 = r0.A00()
            if (r17 == 0) goto L_0x0086
            java.util.List r0 = r7.A02
            if (r0 == 0) goto L_0x0086
            java.util.Iterator r4 = r0.iterator()
        L_0x005e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.7xw r0 = (X.C165977xw) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r12.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x005e
        L_0x0075:
            X.7xw r2 = (X.C165977xw) r2
            if (r2 == 0) goto L_0x0086
            java.lang.String r0 = r2.A01
        L_0x007b:
            boolean r0 = X.C162457s7.A0P(r8, r0)
            if (r0 != 0) goto L_0x008e
            int r14 = r14 + 1
            goto L_0x0044
        L_0x0084:
            r2 = r5
            goto L_0x0075
        L_0x0086:
            r0 = r5
            goto L_0x007b
        L_0x0088:
            r10 = 0
            goto L_0x0025
        L_0x008a:
            r0 = r5
            goto L_0x0007
        L_0x008d:
            r14 = -1
        L_0x008e:
            if (r17 == 0) goto L_0x0098
            java.util.List r0 = r7.A03
            if (r0 == 0) goto L_0x0098
            java.lang.Object r5 = X.C73723fy.A06(r0, r6)
        L_0x0098:
            boolean r0 = r5 instanceof X.C132216et
            if (r0 != 0) goto L_0x009d
            r10 = 2
        L_0x009d:
            int r0 = r3.size()
            if (r14 >= r0) goto L_0x00c2
            if (r14 < 0) goto L_0x00c2
            java.lang.String r1 = r12.A00
            java.lang.Object r0 = r3.get(r14)
            X.7xh r0 = (X.C165827xh) r0
            java.lang.String r0 = r0.A00()
            X.7xw r11 = new X.7xw
            r11.<init>(r1, r0)
        L_0x00b6:
            r15 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            X.7Za r5 = new X.7Za
            r10 = r5
            r10.<init>(r11, r12, r13, r14, r15)
            return r5
        L_0x00c2:
            r11 = 0
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragmentViewModel.A0D(X.5dV, java.util.List, int):X.7Za");
    }
}
