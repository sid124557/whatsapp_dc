package com.whatsapp.productinfra.reportingtoken;

import X.AnonymousClass1VO;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.reportingtoken.ReportingTokenABPropObserver$cleanupReportingTokenData$2", f = "ReportingTokenABPropObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportingTokenABPropObserver$cleanupReportingTokenData$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass1VO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportingTokenABPropObserver$cleanupReportingTokenData$2(AnonymousClass1VO r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            if (r0 != 0) goto L_0x0041
            X.C57682u2.A01(r6)
            X.1VO r0 = r5.this$0
            X.2f6 r0 = r0.A01
            java.lang.String r4 = "ReportingTokenStore/deleteAllData"
            X.3dV r1 = r0.A00
            boolean r0 = X.C72303dV.A00(r1)
            if (r0 == 0) goto L_0x003e
            X.4Fq r3 = r1.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x003a }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0033 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "reporting_token"
            r0 = 0
            int r2 = r2.A07(r1, r0, r4, r0)     // Catch:{ all -> 0x0033 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "ReportingTokenStore/deleteAllData/"
            X.C18260x0.A0y(r0, r1, r2)     // Catch:{ all -> 0x0033 }
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x003a }
            goto L_0x003e
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x003a }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x003a }
        L_0x003a:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
        L_0x003e:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0041:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.reportingtoken.ReportingTokenABPropObserver$cleanupReportingTokenData$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ReportingTokenABPropObserver$cleanupReportingTokenData$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ReportingTokenABPropObserver$cleanupReportingTokenData$2(this.this$0, (C84814Du) obj2));
    }
}
