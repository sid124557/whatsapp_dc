package X;

import java.util.List;

/* renamed from: X.9jq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201299jq implements Runnable {
    public final /* synthetic */ C133706ho A00;
    public final /* synthetic */ C1902194o A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.9FK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.9Fd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.9FK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.9FK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: X.9FK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: X.9FK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.9FK} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.94o r4 = r10.A01
            X.6ho r5 = r10.A00
            java.util.List r1 = r10.A02
            java.util.List r0 = r10.A03
            r4.A01 = r5
            r4.A05 = r1
            r4.A06 = r0
            X.08M r3 = r4.A00
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.6hx r5 = r5.A08
            X.6hv r5 = (X.C133776hv) r5
            if (r5 == 0) goto L_0x0065
            java.lang.String r0 = "PENDING"
            java.lang.String r1 = r5.A07
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0166
            java.lang.String r0 = "INITED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0166
            java.lang.String r0 = "EXTERNALLY_DISABLED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            X.9FZ r6 = new X.9FZ
            r6.<init>()
            r0 = 2131231830(0x7f080456, float:1.8079752E38)
            r6.A00 = r0
            r0 = 2131102098(0x7f060992, float:1.7816624E38)
            r6.A01 = r0
            X.2oU r0 = r4.A0D
            android.content.Context r1 = r0.A00
            r0 = 2131890707(0x7f121213, float:1.9416113E38)
            java.lang.String r0 = r1.getString(r0)
            r6.A04 = r0
            r0 = 2131890708(0x7f121214, float:1.9416115E38)
            java.lang.String r0 = r1.getString(r0)
            r6.A03 = r0
            r1 = 24
        L_0x005b:
            X.9pJ r0 = new X.9pJ
            r0.<init>((java.lang.Object) r5, (int) r1, (java.lang.Object) r4)
            r6.A02 = r0
            r2.add(r6)
        L_0x0065:
            java.util.List r0 = r4.A05
            if (r0 == 0) goto L_0x018f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x018f
            X.2oU r0 = r4.A0D
            android.content.Context r6 = r0.A00
            r0 = 2131891747(0x7f121623, float:1.9418223E38)
            java.lang.String r1 = r6.getString(r0)
            X.9FI r0 = new X.9FI
            r0.<init>(r1)
            r2.add(r0)
            java.util.List r0 = r4.A05
            java.util.Iterator r9 = r0.iterator()
        L_0x0088:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0194
            X.7yw r8 = X.C1899693i.A0C(r9)
            boolean r0 = r8 instanceof X.C133686hm
            if (r0 == 0) goto L_0x0145
            X.6hx r1 = r8.A08
            X.99G r1 = (X.AnonymousClass99G) r1
            X.9Fd r7 = new X.9Fd
            r7.<init>()
            if (r1 == 0) goto L_0x00f3
            byte[] r0 = r1.A09
            r7.A09 = r0
            X.7yt r0 = r1.A01
            r7.A03 = r0
            int r5 = r1.A00
            r1 = 1
            if (r5 == r1) goto L_0x0123
            r0 = 2
            if (r5 != r0) goto L_0x00f3
            X.6ho r0 = r4.A01
            X.6hx r5 = r0.A08
            X.6hv r5 = (X.C133776hv) r5
            int r0 = r5.A01
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r7.A08 = r1
            r7.A07 = r1
            if (r0 == 0) goto L_0x00f7
            r0 = 2131890709(0x7f121215, float:1.9416117E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A04 = r0
            r0 = 2131232825(0x7f080839, float:1.808177E38)
            r7.A00 = r0
            r0 = 2131102099(0x7f060993, float:1.7816626E38)
            r7.A01 = r0
            r0 = 2131890710(0x7f121216, float:1.941612E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A06 = r0
            r0 = 2131890712(0x7f121218, float:1.9416124E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A05 = r0
            r1 = 22
            X.9pJ r0 = new X.9pJ
            r0.<init>((java.lang.Object) r5, (int) r1, (java.lang.Object) r4)
        L_0x00f1:
            r7.A02 = r0
        L_0x00f3:
            r2.add(r7)
            goto L_0x0088
        L_0x00f7:
            r0 = 2131890706(0x7f121212, float:1.9416111E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A04 = r0
            r0 = 2131231830(0x7f080456, float:1.8079752E38)
            r7.A00 = r0
            r0 = 2131102098(0x7f060992, float:1.7816624E38)
            r7.A01 = r0
            r0 = 2131890707(0x7f121213, float:1.9416113E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A06 = r0
            r0 = 2131890708(0x7f121214, float:1.9416115E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A05 = r0
            r0 = 133(0x85, float:1.86E-43)
            X.9p3 r0 = X.C204249p3.A00(r4, r0)
            goto L_0x00f1
        L_0x0123:
            r7.A08 = r1
            r0 = 0
            r7.A07 = r0
            r0 = 2131890713(0x7f121219, float:1.9416126E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A04 = r0
            r0 = 2131232320(0x7f080640, float:1.8080746E38)
            r7.A00 = r0
            r0 = 2131102780(0x7f060c3c, float:1.7818008E38)
            r7.A01 = r0
            r0 = 2131890714(0x7f12121a, float:1.9416128E38)
            java.lang.String r0 = r6.getString(r0)
            r7.A06 = r0
            goto L_0x00f3
        L_0x0145:
            boolean r0 = r8 instanceof X.C133736hr
            if (r0 == 0) goto L_0x0088
            X.9FK r7 = new X.9FK
            r7.<init>()
            r5 = 2131891748(0x7f121624, float:1.9418225E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.7yt r0 = r8.A09
            java.lang.String r0 = X.C166557yt.A00(r0)
            java.lang.String r0 = X.C195169Wk.A05(r0)
            java.lang.String r0 = X.C86614Ku.A0s(r6, r0, r1, r5)
            r7.A00 = r0
            goto L_0x00f3
        L_0x0166:
            X.9FZ r6 = new X.9FZ
            r6.<init>()
            r0 = 2131232825(0x7f080839, float:1.808177E38)
            r6.A00 = r0
            r0 = 2131102099(0x7f060993, float:1.7816626E38)
            r6.A01 = r0
            X.2oU r0 = r4.A0D
            android.content.Context r1 = r0.A00
            r0 = 2131890711(0x7f121217, float:1.9416122E38)
            java.lang.String r0 = r1.getString(r0)
            r6.A04 = r0
            r0 = 2131890705(0x7f121211, float:1.941611E38)
            java.lang.String r0 = r1.getString(r0)
            r6.A03 = r0
            r1 = 23
            goto L_0x005b
        L_0x018f:
            java.lang.String r0 = "PAY: BrazilPaymentMerchantDetailsViewModel - paymentMethodList is empty!"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0194:
            java.util.List r0 = r4.A05
            if (r0 == 0) goto L_0x01a8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01a8
            r1 = 103(0x67, float:1.44E-43)
            X.9FD r0 = new X.9FD
            r0.<init>(r1)
            r2.add(r0)
        L_0x01a8:
            X.2oU r0 = r4.A0D
            android.content.Context r6 = r0.A00
            r0 = 2131891749(0x7f121625, float:1.9418227E38)
            java.lang.String r1 = r6.getString(r0)
            X.9FI r0 = new X.9FI
            r0.<init>(r1)
            r2.add(r0)
            X.9FY r5 = new X.9FY
            r5.<init>()
            r0 = 2131892129(0x7f1217a1, float:1.9418998E38)
            java.lang.String r0 = r6.getString(r0)
            r5.A02 = r0
            r0 = 2131892006(0x7f121726, float:1.9418748E38)
            java.lang.String r0 = r6.getString(r0)
            r5.A01 = r0
            r0 = 135(0x87, float:1.89E-43)
            X.9p3 r0 = X.C204249p3.A00(r4, r0)
            r5.A00 = r0
            java.util.List r1 = r5.A03
            java.util.List r0 = r4.A06
            r1.addAll(r0)
            r2.add(r5)
            r1 = 103(0x67, float:1.44E-43)
            X.9FD r0 = new X.9FD
            r0.<init>(r1)
            r2.add(r0)
            X.9FX r1 = new X.9FX
            r1.<init>()
            r0 = 2131232488(0x7f0806e8, float:1.8081087E38)
            r1.A00 = r0
            r0 = 2131887025(0x7f1203b1, float:1.9408645E38)
            r1.A02 = r0
            r0 = 136(0x88, float:1.9E-43)
            X.9p3 r0 = X.C204249p3.A00(r4, r0)
            r1.A03 = r0
            r2.add(r1)
            X.9FX r1 = new X.9FX
            r1.<init>()
            r0 = 2131232301(0x7f08062d, float:1.8080707E38)
            r1.A00 = r0
            r0 = 2131102780(0x7f060c3c, float:1.7818008E38)
            r1.A01 = r0
            r0 = 2131896310(0x7f1227f6, float:1.9427478E38)
            r1.A02 = r0
            r0 = 134(0x86, float:1.88E-43)
            X.9p3 r0 = X.C204249p3.A00(r4, r0)
            r1.A03 = r0
            r2.add(r1)
            r3.A0H(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201299jq.run():void");
    }

    public /* synthetic */ C201299jq(C133706ho r1, C1902194o r2, List list, List list2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = list;
        this.A03 = list2;
    }
}
