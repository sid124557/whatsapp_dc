package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.2fu  reason: invalid class name and case insensitive filesystem */
public final class C49052fu {
    public final C49712gy A00;
    public final C66493Lq A01;
    public final AnonymousClass2GZ A02;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (r2.A00.A0Y(X.C58422vE.A02, 6350) != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set A00(java.util.List r12, int r13, int r14) {
        /*
            r11 = this;
            java.lang.String r6 = " groups, round="
            if (r13 > 0) goto L_0x006a
            X.2GZ r2 = r11.A02
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L_0x004a
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x004a
        L_0x0010:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupInfoBatchProcessor/processGroupInfo/legacy - \n              |processing "
            X.AnonymousClass000.A1H(r0, r1, r12)
            java.lang.String r0 = X.AnonymousClass000.A0Y(r6, r1, r13)
            java.lang.String r0 = X.C830345w.A09(r0)
            java.lang.String r5 = "\n"
            java.lang.String r4 = ""
            r3 = 0
            java.lang.String r0 = X.C175738Zn.A0U(r0, r5, r4, r3)
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.ArrayList r2 = X.C73783g4.A0c(r12)
            java.util.Iterator r1 = r12.iterator()
        L_0x0035:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = r1.next()
            X.2zA r0 = (X.C60792zA) r0
            r11.A01(r0)
            X.1fJ r0 = r0.A01
            r2.add(r0)
            goto L_0x0035
        L_0x004a:
            java.util.Iterator r1 = r12.iterator()
        L_0x004e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r1.next()
            X.2zA r0 = (X.C60792zA) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x004e
            X.1VX r2 = r2.A00
            r1 = 6350(0x18ce, float:8.898E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0010
        L_0x006a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupInfoBatchProcessor/processGroupInfo/threshold pipeline - \n              |processing "
            X.AnonymousClass000.A1H(r0, r1, r12)
            java.lang.String r0 = X.AnonymousClass000.A0Y(r6, r1, r13)
            java.lang.String r0 = X.C830345w.A09(r0)
            java.lang.String r5 = "\n"
            java.lang.String r4 = ""
            r3 = 0
            java.lang.String r0 = X.C175738Zn.A0U(r0, r5, r4, r3)
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.LinkedHashSet r2 = X.AnonymousClass0x9.A17()
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r12.iterator()
        L_0x0093:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r7 = r8.next()
            X.2zA r7 = (X.C60792zA) r7
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x00a7
            r1.add(r7)
            goto L_0x0093
        L_0x00a7:
            r11.A01(r7)
            X.1fJ r0 = r7.A01
            r2.add(r0)
            goto L_0x0093
        L_0x00b0:
            java.util.Set r2 = X.C73723fy.A0P(r2)
            X.3Lq r0 = r11.A01
            r0.A0d(r2, r14)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupInfoBatchProcessor/processGroupInfo/legacy - \n              |completed syncing of "
            goto L_0x011f
        L_0x00c0:
            if (r13 != 0) goto L_0x0119
            boolean r0 = r1.isEmpty()
            r9 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0114
            java.util.ArrayList r8 = X.C73783g4.A0d(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x00d3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r7 = r10.next()
            X.2zA r7 = (X.C60792zA) r7
            X.1fJ r0 = r7.A01
            java.lang.String r1 = r0.getRawString()
            java.lang.Integer r0 = r7.A02
            int r0 = X.C18310x6.A06(r0)
            X.3Z6 r0 = X.AnonymousClass3Z6.A01(r1, r0)
            r8.add(r0)
            goto L_0x00d3
        L_0x00f3:
            java.util.ArrayList r7 = X.C73783g4.A0d(r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x00fb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0105
            X.C18270x1.A1L(r7, r1)
            goto L_0x00fb
        L_0x0105:
            java.util.Set r0 = X.C73723fy.A0P(r7)
            X.47V r1 = new X.47V
            r1.<init>(r8, r0, r9, r14)
            X.2gy r0 = r11.A00
            r0.A02(r1)
            goto L_0x0119
        L_0x0114:
            X.3Lq r0 = r11.A01
            r0.A0d(r2, r14)
        L_0x0119:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupInfoBatchProcessor/processGroupInfo/threshold pipeline - \n              |completed syncing of "
        L_0x011f:
            X.C18290x4.A1P(r0, r1, r2)
            java.lang.String r0 = X.AnonymousClass000.A0Y(r6, r1, r13)
            java.lang.String r0 = X.C830345w.A09(r0)
            java.lang.String r0 = X.C175738Zn.A0U(r0, r5, r4, r3)
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49052fu.A00(java.util.List, int, int):java.util.Set");
    }

    public final void A01(C60792zA r56) {
        C60792zA r10 = r56;
        C61062ze r9 = r10.A00;
        if (r9 != null) {
            C66493Lq r54 = this.A01;
            C27991fJ r53 = r10.A01;
            UserJid userJid = r9.A0C;
            long j = r9.A05;
            String str = r9.A0H;
            long j2 = r9.A07;
            long j3 = r9.A06;
            long j4 = r9.A04;
            Integer num = r10.A02;
            C60912zN r29 = r9.A0E;
            boolean z = r9.A0N;
            boolean z2 = r9.A0V;
            boolean z3 = r9.A0L;
            boolean z4 = r9.A0U;
            boolean z5 = r9.A0T;
            C48742fO r22 = r9.A0F;
            int i = r9.A01;
            AnonymousClass334 r18 = r9.A08;
            int i2 = r9.A02;
            C27991fJ r19 = r9.A09;
            Map map = r9.A0J;
            boolean z6 = r9.A0Q;
            boolean z7 = r9.A0R;
            int i3 = r9.A00;
            String str2 = r9.A0G;
            int i4 = r9.A03;
            C66493Lq r16 = r54;
            AnonymousClass334 r17 = r18;
            C27991fJ r182 = r53;
            UserJid userJid2 = userJid;
            C60912zN r21 = r29;
            Integer num2 = num;
            String str3 = str;
            String str4 = str2;
            int i5 = i3;
            int i6 = i4;
            r16.A0I(r17, r182, r19, userJid2, r21, r22, num2, str3, str4, map, i, i2, i5, i6, j, j2, j3, j4, z, z2, z3, z4, z5, z6, z7, r9.A0O, r9.A0S, r9.A0K, r9.A0P, r9.A0M);
            return;
        }
        throw AnonymousClass001.A0e("Expected group data info but got null");
    }

    public C49052fu(C49712gy r1, C66493Lq r2, AnonymousClass2GZ r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
