package X;

/* renamed from: X.3ab  reason: invalid class name and case insensitive filesystem */
public class C70503ab implements Runnable {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;

    public C70503ab(Object obj, String str, String str2, String str3, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r6 == null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r6.A00 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        r4.A0Y(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r8 = r17
            int r0 = r8.A04
            switch(r0) {
                case 0: goto L_0x0198;
                case 1: goto L_0x016e;
                case 2: goto L_0x0122;
                case 3: goto L_0x00a7;
                case 4: goto L_0x005c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = r8.A01
            java.lang.String r2 = r8.A02
            java.lang.Object r1 = r8.A00
            X.3MF r1 = (X.AnonymousClass3MF) r1
            java.lang.String r3 = r8.A03
            X.4uZ r0 = X.C18310x6.A0S(r0)
            X.2z0 r0 = X.AnonymousClass2z0.A03(r0, r2)
            X.3Lv r4 = r1.A07
            X.34x r5 = X.C55832qz.A00(r4, r0)
            boolean r0 = r5 instanceof X.AnonymousClass4DV
            r6 = 0
            if (r0 == 0) goto L_0x005b
            r0 = r5
            X.4DV r0 = (X.AnonymousClass4DV) r0
            if (r0 == 0) goto L_0x005b
            X.39W r2 = r0.B5s()
            if (r2 == 0) goto L_0x005b
            int r1 = r2.A00
            r0 = 5
            r7 = 1
            if (r1 != r0) goto L_0x005b
            X.39P r0 = r2.A03
            if (r0 == 0) goto L_0x005b
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0058
            java.util.Iterator r1 = r0.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r2 = r1.next()
            boolean r0 = X.AnonymousClass395.A00(r2, r3)
            if (r0 == 0) goto L_0x0041
        L_0x0051:
            r6 = r2
        L_0x0052:
            X.395 r6 = (X.AnonymousClass395) r6
            if (r6 == 0) goto L_0x0058
            r6.A00 = r7
        L_0x0058:
            r4.A0Y(r5)
        L_0x005b:
            return
        L_0x005c:
            java.lang.String r0 = r8.A01
            java.lang.String r2 = r8.A02
            java.lang.Object r1 = r8.A00
            X.3ME r1 = (X.AnonymousClass3ME) r1
            java.lang.String r3 = r8.A03
            X.4uZ r0 = X.C18310x6.A0S(r0)
            X.2z0 r0 = X.AnonymousClass2z0.A03(r0, r2)
            X.3Lv r4 = r1.A05
            X.34x r5 = X.C55832qz.A00(r4, r0)
            boolean r0 = r5 instanceof X.AnonymousClass4DV
            r6 = 0
            if (r0 == 0) goto L_0x005b
            r0 = r5
            X.4DV r0 = (X.AnonymousClass4DV) r0
            if (r0 == 0) goto L_0x005b
            X.39W r2 = r0.B5s()
            if (r2 == 0) goto L_0x005b
            int r1 = r2.A00
            r0 = 5
            r7 = 1
            if (r1 != r0) goto L_0x005b
            X.39P r0 = r2.A03
            if (r0 == 0) goto L_0x005b
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0058
            java.util.Iterator r1 = r0.iterator()
        L_0x0096:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r2 = r1.next()
            boolean r0 = X.AnonymousClass395.A00(r2, r3)
            if (r0 == 0) goto L_0x0096
            goto L_0x0051
        L_0x00a7:
            java.lang.Object r5 = r8.A00
            X.2Sb r5 = (X.C43422Sb) r5
            java.lang.String r6 = r8.A01
            java.lang.String r7 = r8.A02
            java.lang.String r3 = r8.A03
            X.C162457s7.A0H(r7)
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1G()
            java.lang.String r0 = "cta"
            r4.put(r0, r3)     // Catch:{ JSONException -> 0x00be }
            goto L_0x00c8
        L_0x00be:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExtensionsLogger/WaBkCommerceInterpreterCallbackImpl/updateNativeFlowMessageWithSelectedState/"
            X.C18260x0.A17(r0, r1, r2)
        L_0x00c8:
            X.2Ze r8 = r5.A03
            java.lang.String r11 = r4.toString()
            r1 = 0
            r9 = 0
            r15 = 1
            r13 = 2
            r14 = 4
            r12 = r9
            r10 = r9
            r16 = r15
            r8.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            X.4uZ r0 = X.C18310x6.A0S(r7)
            X.2z0 r0 = X.AnonymousClass2z0.A05(r0, r6, r1)
            X.3Lv r4 = r5.A02
            X.34x r5 = X.C55832qz.A00(r4, r0)
            boolean r0 = r5 instanceof X.AnonymousClass4DV
            r6 = 0
            if (r0 == 0) goto L_0x005b
            r0 = r5
            X.4DV r0 = (X.AnonymousClass4DV) r0
            if (r0 == 0) goto L_0x005b
            X.39W r2 = r0.B5s()
            if (r2 == 0) goto L_0x005b
            int r1 = r2.A00
            r0 = 5
            if (r1 != r0) goto L_0x005b
            X.39P r0 = r2.A03
            if (r0 == 0) goto L_0x005b
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0058
            java.util.Iterator r2 = r0.iterator()
        L_0x0109:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011a
            java.lang.Object r1 = r2.next()
            boolean r0 = X.AnonymousClass395.A00(r1, r3)
            if (r0 == 0) goto L_0x0109
            r6 = r1
        L_0x011a:
            X.395 r6 = (X.AnonymousClass395) r6
            if (r6 == 0) goto L_0x0058
            r6.A00 = r15
            goto L_0x0058
        L_0x0122:
            java.lang.String r0 = r8.A01
            java.lang.String r2 = r8.A02
            java.lang.Object r1 = r8.A00
            X.2x9 r1 = (X.C59582x9) r1
            java.lang.String r3 = r8.A03
            X.4uZ r0 = X.C18310x6.A0S(r0)
            X.2z0 r0 = X.AnonymousClass2z0.A03(r0, r2)
            X.3Lv r4 = r1.A02
            X.34x r5 = X.C55832qz.A00(r4, r0)
            boolean r0 = r5 instanceof X.AnonymousClass4DV
            r6 = 0
            if (r0 == 0) goto L_0x005b
            r0 = r5
            X.4DV r0 = (X.AnonymousClass4DV) r0
            if (r0 == 0) goto L_0x005b
            X.39W r2 = r0.B5s()
            if (r2 == 0) goto L_0x005b
            int r1 = r2.A00
            r0 = 5
            r7 = 1
            if (r1 != r0) goto L_0x005b
            X.39P r0 = r2.A03
            if (r0 == 0) goto L_0x005b
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0058
            java.util.Iterator r1 = r0.iterator()
        L_0x015c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r2 = r1.next()
            boolean r0 = X.AnonymousClass395.A00(r2, r3)
            if (r0 == 0) goto L_0x015c
            goto L_0x0051
        L_0x016e:
            java.lang.Object r6 = r8.A00
            X.2nj r6 = (X.C53822nj) r6
            java.lang.String r5 = r8.A01
            java.lang.String r4 = r8.A02
            java.lang.String r3 = r8.A03
            X.1bM r2 = new X.1bM
            r2.<init>()
            r6.A00(r2)
            long r0 = r6.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            java.lang.String r0 = r6.A02
            r2.A0K = r0
            r2.A09 = r5
            r2.A0A = r4
            r2.A08 = r3
            X.4FV r0 = r6.A05
            r0.BhA(r2)
            return
        L_0x0198:
            java.lang.Object r0 = r8.A00
            X.6Nw r0 = (X.C126436Nw) r0
            java.lang.String r3 = r8.A01
            java.lang.String r2 = r8.A02
            java.lang.String r1 = r8.A03
            X.85L r0 = r0.A00
            r0.Bfh(r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70503ab.run():void");
    }
}
