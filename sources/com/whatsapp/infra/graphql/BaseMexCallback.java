package com.whatsapp.infra.graphql;

import X.AnonymousClass7T5;
import X.C153197aq;
import X.C158587kE;
import X.C160327nS;
import X.C162457s7;
import X.C188028yC;
import X.C27871eo;
import org.json.JSONArray;

public abstract class BaseMexCallback implements C188028yC {
    public C158587kE A00;
    public AnonymousClass7T5 A01;
    public Long A02;

    public abstract void A00(C153197aq r1);

    public void A03(Throwable th) {
        C160327nS r0 = new C160327nS(th, (JSONArray) null);
        A02(r0, false);
        A04(r0);
    }

    public abstract boolean A04(C160327nS r1);

    public final void BSt(Throwable th) {
        C162457s7.A0J(th, 0);
        A03(th);
    }

    public final void Ba9(C27871eo r2) {
        C162457s7.A0J(r2, 0);
        A01(r2);
    }

    public void A01(C27871eo r4) {
        C160327nS r2 = null;
        if (r4.A03) {
            r2 = new C160327nS((Throwable) null, r4.A01);
        }
        boolean z = r4.A02;
        A02(r2, z);
        if ((r2 == null || A04(r2)) && z) {
            A00(r4.A00);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C160327nS r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            X.7T5 r8 = r0.A01
            if (r8 == 0) goto L_0x007f
            X.7kE r7 = r0.A00
            java.lang.Long r2 = r0.A02
            X.2sH r0 = r8.A00
            long r0 = r0.A0H()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r18)
            X.6iH r5 = new X.6iH
            r5.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.A01 = r0
            r5.A04 = r2
            r5.A03 = r1
            r4 = 0
            if (r2 == 0) goto L_0x00c5
            long r2 = r2.longValue()
            if (r1 == 0) goto L_0x00c5
            long r0 = r1.longValue()
            java.lang.Long r0 = X.C18310x6.A0f(r0, r2)
        L_0x0036:
            r5.A02 = r0
            r2 = r17
            if (r17 == 0) goto L_0x00c3
            java.util.List r13 = r2.A00
            boolean r1 = r13.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x0053
            java.lang.String r9 = ","
            X.8ZC r14 = X.AnonymousClass8ZC.A00
            java.lang.String r10 = ""
            r15 = -1
            java.lang.String r12 = "..."
            r11 = r10
            java.lang.String r0 = X.C73723fy.A07(r9, r10, r11, r12, r13, r14, r15)
        L_0x0053:
            r5.A05 = r0
            if (r17 == 0) goto L_0x00c1
            java.util.List r1 = r2.A00
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = ""
        L_0x0061:
            r5.A06 = r0
            if (r7 == 0) goto L_0x0080
            java.lang.String r0 = r7.A04
        L_0x0067:
            r5.A07 = r0
            if (r7 == 0) goto L_0x006d
            java.lang.String r4 = r7.A05
        L_0x006d:
            r5.A08 = r4
            r5.A00 = r6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mexmigrationperftracker/sendevent sending WAM event: "
            X.C18260x0.A1P(r1, r0, r5)
            X.4FV r0 = r8.A02
            r0.BhD(r5)
        L_0x007f:
            return
        L_0x0080:
            r0 = r4
            goto L_0x0067
        L_0x0082:
            org.json.JSONArray r10 = X.AnonymousClass0x9.A1F()
            java.util.Iterator r9 = r1.iterator()
        L_0x008a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r3 = r9.next()
            X.8t1 r3 = (X.C185078t1) r3
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            int r1 = r3.B5a()
            java.lang.String r0 = "code"
            r2.put(r0, r1)
            java.lang.String r1 = "detail"
            java.lang.String r0 = r3.B6z()
            r2.put(r1, r0)
            java.lang.String r1 = "category"
            java.lang.String r0 = r3.B5K()
            r2.put(r1, r0)
            r10.put(r2)
            goto L_0x008a
        L_0x00b9:
            java.lang.String r0 = r10.toString()
            X.C162457s7.A0H(r0)
            goto L_0x0061
        L_0x00c1:
            r0 = r4
            goto L_0x0061
        L_0x00c3:
            r0 = r4
            goto L_0x0053
        L_0x00c5:
            r0 = r4
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.infra.graphql.BaseMexCallback.A02(X.7nS, boolean):void");
    }
}
