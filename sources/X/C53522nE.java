package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.2nE  reason: invalid class name and case insensitive filesystem */
public final class C53522nE {
    public int A00;
    public AnonymousClass4DK A01;
    public final C194449Sx A02;
    public final AnonymousClass1j1 A03;
    public final AnonymousClass1j2 A04;
    public final C60482yd A05;

    public C53522nE(C194449Sx r2, AnonymousClass1j1 r3, AnonymousClass1j2 r4, C60482yd r5) {
        C18260x0.A0a(r5, r3, r4, 1);
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        if (r1.isEmpty() != false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.C53952nw r9, X.AnonymousClass4DK r10, java.util.Map r11, X.AnonymousClass3Z6 r12) {
        /*
            r8 = this;
            r3 = 0
            r7 = 1
            int r0 = r9.A00
            r8.A00 = r0
            r8.A01 = r10
            java.lang.String r5 = "app_id"
            java.lang.Object r0 = r11.get(r5)
            r2 = 0
            r1 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "No parameters or no app_id"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.2z6 r0 = X.C60752z6.A03
            r10.BSv(r0, r1)
            return r3
        L_0x001d:
            X.2yd r0 = r8.A05
            X.2or r3 = r0.A00()
            r0 = 5
            X.4Hl r1 = new X.4Hl
            r1.<init>(r8, r0)
            java.lang.Class<X.3Wu> r0 = X.C69383Wu.class
            r3.A00(r1, r0, r8)
            java.lang.String r4 = X.AnonymousClass0x2.A0d(r5, r11)
            int r3 = r8.A00
            java.lang.String r1 = "requestBloksScreen"
            X.1j2 r0 = r8.A04
            r0.A00(r3, r1)
            if (r4 == 0) goto L_0x0041
            r0.A03(r3, r5, r4)
        L_0x0041:
            java.lang.String r0 = "data"
            java.lang.Object r1 = r11.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00da
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x00da
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            X.21z r0 = X.C373721z.ADDITIONAL_PARAMS
            java.lang.String r0 = r0.key
            java.lang.Object r1 = r11.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0067
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0067
            r3.putAll(r1)
        L_0x0067:
            X.21z r0 = X.C373721z.RESUMABLE_DATA
            java.lang.String r4 = r0.key
            X.7Zw r6 = r9.A03
            if (r6 == 0) goto L_0x0085
            java.util.Stack r1 = r6.A08
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0085
            java.lang.Object r0 = r1.peek()
            X.7ZL r0 = (X.AnonymousClass7ZL) r0
            java.util.Map r1 = r0.A03
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0089
        L_0x0085:
            X.3d5 r1 = X.C72043d5.A00()
        L_0x0089:
            r3.put(r4, r1)
            X.21z r0 = X.C373721z.EXTENSIONS_CONTEXT
            java.lang.String r5 = r0.key
            java.util.LinkedHashMap r4 = X.C18320x8.A0r()
            X.21z r0 = X.C373721z.EXTENSIONS_IS_RESUMED
            java.lang.String r0 = r0.key
            if (r6 == 0) goto L_0x009c
            boolean r2 = r6.A01
        L_0x009c:
            X.AnonymousClass000.A1C(r0, r4, r2)
            X.21z r0 = X.C373721z.EXTENSIONS_IS_BACK_TRIGGERED
            java.lang.String r2 = r0.key
            java.lang.String r1 = "is_back_triggered"
            java.lang.Object r0 = r3.get(r1)
            if (r0 != 0) goto L_0x00ad
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x00ad:
            r4.put(r2, r0)
            r3.put(r5, r4)
            r3.remove(r1)
            X.9Sx r5 = r8.A02
            java.lang.Object r2 = r12.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r12.second
            java.lang.String r1 = (java.lang.String) r1
            X.20B r0 = X.AnonymousClass20B.DATA
            r5.A00(r0, r2, r1, r3)
            java.lang.Object r4 = r12.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r12.second
            java.lang.String r3 = (java.lang.String) r3
            X.20B r2 = X.AnonymousClass20B.CONTEXT
            java.lang.String r1 = "job_id"
            java.lang.String r0 = r9.A05
            java.util.Map r0 = X.C57692u3.A04(r1, r0)
            r5.A00(r2, r4, r3, r0)
        L_0x00da:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53522nE.A01(X.2nw, X.4DK, java.util.Map, X.3Z6):boolean");
    }

    public final void A00(Map map) {
        this.A05.A00().A02(C69383Wu.class, this);
        AnonymousClass4DK r4 = this.A01;
        if (r4 == null) {
            return;
        }
        if (map == null || !C162457s7.A0P(map.get(C373621y.SUCCESS_FLAG.key), "false")) {
            Log.w("Finishing Bloks resource with success");
            r4.BdH(map);
            return;
        }
        Log.w("Finishing Bloks resource with failure");
        r4.BSv(new C60752z6((Integer) null, "BloksScreenFinishWithError", "Finishing Bloks resource with failure"), map);
    }
}
