package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.3bT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71043bT implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C50312hy A01;
    public final /* synthetic */ Jid A02;
    public final /* synthetic */ C624134x A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.2nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.2nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.2nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.2nk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            java.lang.String r0 = r15.A05
            com.whatsapp.jid.Jid r1 = r15.A02
            X.2hy r5 = r15.A01
            java.lang.String r4 = r15.A06
            X.34x r8 = r15.A03
            int r14 = r15.A00
            java.lang.Integer r9 = r15.A04
            java.lang.String r11 = r15.A07
            java.lang.String r12 = r15.A08
            org.json.JSONObject r13 = X.AnonymousClass0x9.A1H(r0)
            X.32Y r2 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = X.C18290x4.A0n(r1)
            com.whatsapp.jid.UserJid r7 = r2.A0E(r0)
            java.lang.String r0 = "flow_id"
            java.lang.String r3 = r13.optString(r0)
            X.2O2 r0 = r5.A01
            java.util.HashMap r0 = r0.A01
            java.lang.Object r6 = r0.get(r4)
            X.2iZ r6 = (X.C50662iZ) r6
            if (r7 == 0) goto L_0x0082
            int r0 = X.AnonymousClass0x7.A06(r3)
            if (r0 <= 0) goto L_0x0082
            X.2rW r0 = r5.A04
            r2 = 0
            X.2Kt r0 = r0.A00(r7, r2)
            if (r0 == 0) goto L_0x0078
            java.util.List r0 = r0.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x0047:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.2nk r0 = (X.C53832nk) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.C162457s7.A0P(r0, r3)
            if (r0 == 0) goto L_0x0047
            r2 = r1
        L_0x005d:
            X.2nk r2 = (X.C53832nk) r2
            if (r2 == 0) goto L_0x0078
            java.lang.String[] r0 = r2.A07
            if (r0 == 0) goto L_0x006f
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r0)
            java.lang.String r0 = "categories"
            r13.put(r0, r1)
        L_0x006f:
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x0078
            java.lang.String r0 = "extension_status"
            r13.put(r0, r1)
        L_0x0078:
            X.2YC r0 = r5.A02
            java.lang.Integer r10 = r0.A00(r7)
            r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0082:
            r7 = 0
            r2 = r5
            r3 = r6
            r4 = r1
            r5 = r8
            r6 = r9
            r8 = r11
            r9 = r12
            r10 = r13
            r11 = r14
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71043bT.run():void");
    }

    public /* synthetic */ C71043bT(C50312hy r1, Jid jid, C624134x r3, Integer num, String str, String str2, String str3, String str4, int i) {
        this.A05 = str;
        this.A02 = jid;
        this.A01 = r1;
        this.A06 = str2;
        this.A03 = r3;
        this.A00 = i;
        this.A04 = num;
        this.A07 = str3;
        this.A08 = str4;
    }
}
