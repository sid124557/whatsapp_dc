package com.whatsapp.graphapi;

import X.AnonymousClass4FS;
import X.AnonymousClass5ZI;
import X.AnonymousClass8E7;
import X.C181668n8;
import X.C184408rk;
import X.C55682qk;
import X.C59722xN;

public abstract class GraphApiACSNetworkRequestKt extends AnonymousClass8E7 {
    public GraphApiACSNetworkRequestKt(C55682qk r9, C181668n8 r10, C59722xN r11, AnonymousClass5ZI r12, AnonymousClass4FS r13) {
        super(r9, r10, (C184408rk) null, r11, r12, r13, "WA_BizDirectorySearch");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[Catch:{ 3fX -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067 A[Catch:{ 3fX -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0M(X.C84814Du r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.AnonymousClass8UN
            if (r0 == 0) goto L_0x0023
            r6 = r9
            X.8UN r6 = (X.AnonymousClass8UN) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r7 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r3) goto L_0x0029
            java.lang.Object r6 = r6.L$0
            X.8E7 r6 = (X.AnonymousClass8E7) r6
            goto L_0x0045
        L_0x0023:
            X.8UN r6 = new X.8UN
            r6.<init>(r8, r9)
            goto L_0x0012
        L_0x0029:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x002e:
            X.C57682u2.A01(r7)
            com.whatsapp.graphapi.GraphApiACSNetworkRequestKt$executeHttpsConnectionRequest$result$1 r2 = new com.whatsapp.graphapi.GraphApiACSNetworkRequestKt$executeHttpsConnectionRequest$result$1     // Catch:{ 3fX -> 0x0083 }
            r2.<init>(r8, r4)     // Catch:{ 3fX -> 0x0083 }
            r6.L$0 = r8     // Catch:{ 3fX -> 0x0083 }
            r6.label = r3     // Catch:{ 3fX -> 0x0083 }
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r7 = X.C616331p.A00(r6, r2, r0)     // Catch:{ 3fX -> 0x0083 }
            if (r7 != r5) goto L_0x0043
            return r5
        L_0x0043:
            r6 = r8
            goto L_0x0048
        L_0x0045:
            X.C57682u2.A01(r7)     // Catch:{ 3fX -> 0x0083 }
        L_0x0048:
            X.7Mt r7 = (X.C149517Mt) r7     // Catch:{ 3fX -> 0x0083 }
            int r5 = r7.A00     // Catch:{ 3fX -> 0x0083 }
            r2 = 4
            if (r5 != 0) goto L_0x0067
            java.lang.Object r0 = r7.A03     // Catch:{ 3fX -> 0x0083 }
            if (r0 == 0) goto L_0x0059
            X.6jJ r2 = new X.6jJ     // Catch:{ 3fX -> 0x0083 }
            r2.<init>(r0)     // Catch:{ 3fX -> 0x0083 }
            return r2
        L_0x0059:
            X.2qk r1 = r6.A02     // Catch:{ 3fX -> 0x0083 }
            java.lang.String r0 = "GraphApiACSNetworkRequestKt/executeHttpsConnectionRequest: Null response content"
            r1.A0A(r0, r3, r4)     // Catch:{ 3fX -> 0x0083 }
            X.7T4 r1 = new X.7T4     // Catch:{ 3fX -> 0x0083 }
            r1.<init>(r4, r4, r2)     // Catch:{ 3fX -> 0x0083 }
            r0 = 5
            goto L_0x007d
        L_0x0067:
            X.7T4 r1 = r7.A01     // Catch:{ 3fX -> 0x0083 }
            if (r1 != 0) goto L_0x0072
            r0 = 10
            X.7T4 r1 = new X.7T4     // Catch:{ 3fX -> 0x0083 }
            r1.<init>(r4, r4, r0)     // Catch:{ 3fX -> 0x0083 }
        L_0x0072:
            X.7Nt r0 = r7.A02     // Catch:{ 3fX -> 0x0083 }
            if (r5 == r2) goto L_0x007b
            if (r0 == 0) goto L_0x007b
            r6.A0H(r0)     // Catch:{ 3fX -> 0x0083 }
        L_0x007b:
            int r0 = r7.A00     // Catch:{ 3fX -> 0x0083 }
        L_0x007d:
            X.6jK r2 = new X.6jK     // Catch:{ 3fX -> 0x0083 }
            r2.<init>(r1, r0)     // Catch:{ 3fX -> 0x0083 }
            return r2
        L_0x0083:
            r1 = move-exception
            java.lang.String r0 = "GraphApiACSNetworkRequestKt/executeHttpsConnectionRequest: timeout error"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 3
            X.7T4 r0 = new X.7T4
            r0.<init>(r4, r4, r1)
            X.6jK r2 = new X.6jK
            r2.<init>(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.graphapi.GraphApiACSNetworkRequestKt.A0M(X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0N(X.C84814Du r8, X.C85494Gl r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.AnonymousClass8UU
            if (r0 == 0) goto L_0x0074
            r5 = r8
            X.8UU r5 = (X.AnonymousClass8UU) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0074
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r3 = r5.result
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 == r1) goto L_0x0054
            if (r0 != r4) goto L_0x007a
            X.C57682u2.A01(r3)
        L_0x0023:
            return r3
        L_0x0024:
            X.C57682u2.A01(r3)
            X.5ZI r0 = r7.A06
            if (r0 == 0) goto L_0x002e
            r0.A07()
        L_0x002e:
            r5.L$0 = r7
            r5.L$1 = r9
            r5.label = r1
            X.4Du r0 = X.C57702u4.A01(r5)
            X.46G r3 = new X.46G
            r3.<init>(r0, r1)
            r3.A0A()
            X.8n8 r2 = r7.A03
            java.lang.String r1 = r7.A00
            X.8E6 r0 = new X.8E6
            r0.<init>(r3)
            r2.B3f(r0, r1)
            java.lang.Object r3 = r3.A06()
            if (r3 == r6) goto L_0x0073
            r2 = r7
            goto L_0x005f
        L_0x0054:
            java.lang.Object r9 = r5.L$1
            X.4Gl r9 = (X.C85494Gl) r9
            java.lang.Object r2 = r5.L$0
            com.whatsapp.graphapi.GraphApiACSNetworkRequestKt r2 = (com.whatsapp.graphapi.GraphApiACSNetworkRequestKt) r2
            X.C57682u2.A01(r3)
        L_0x005f:
            X.74Z r3 = (X.AnonymousClass74Z) r3
            r1 = 0
            com.whatsapp.graphapi.GraphApiACSNetworkRequestKt$executeAwait$2 r0 = new com.whatsapp.graphapi.GraphApiACSNetworkRequestKt$executeAwait$2
            r0.<init>(r3, r2, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r4
            java.lang.Object r3 = X.C616131n.A00(r5, r9, r0)
            if (r3 != r6) goto L_0x0023
        L_0x0073:
            return r6
        L_0x0074:
            X.8UU r5 = new X.8UU
            r5.<init>(r7, r8)
            goto L_0x0012
        L_0x007a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.graphapi.GraphApiACSNetworkRequestKt.A0N(X.4Du, X.4Gl):java.lang.Object");
    }
}
