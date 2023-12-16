package X;

/* renamed from: X.9Wo  reason: invalid class name and case insensitive filesystem */
public class C195209Wo implements C202439m1 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C195209Wo(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj4;
        this.A03 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BMJ(java.util.List r10) {
        /*
            r9 = this;
            int r0 = r9.A04
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x00c3;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r8 = r9.A00
            com.whatsapp.payments.ui.BrazilPayBloksActivity r8 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r8
            java.lang.Object r7 = r9.A01
            java.util.AbstractList r7 = (java.util.AbstractList) r7
            java.lang.Object r4 = r9.A02
            X.2m3 r4 = (X.C52792m3) r4
            java.lang.Object r5 = r9.A03
            java.util.Map r5 = (java.util.Map) r5
            int r6 = X.C1899593h.A02(r8, r7)
            X.9Vv r0 = r8.A07
            org.json.JSONArray r3 = r0.A02(r7)
            boolean r0 = X.C195089Vv.A01(r7)
            if (r0 == 0) goto L_0x0091
            r1 = 0
            r0 = -233(0xffffffffffffff17, float:NaN)
            X.AnonymousClass9Bw.A0c(r4, r1, r0)
        L_0x002b:
            return
        L_0x002c:
            java.lang.Object r2 = r9.A00
            X.9oX r2 = (X.C203929oX) r2
            java.lang.Object r0 = r9.A01
            X.99H r0 = (X.AnonymousClass99H) r0
            java.lang.Object r4 = r9.A02
            X.6hm r4 = (X.C133686hm) r4
            java.lang.Object r3 = r9.A03
            X.9mS r3 = (X.C202709mS) r3
            if (r0 == 0) goto L_0x0055
            X.7yt r0 = r0.A09
            boolean r0 = X.C161527pr.A02(r0)
            if (r0 != 0) goto L_0x0055
            java.lang.Object r0 = r2.A00
            X.9AF r0 = (X.AnonymousClass9AF) r0
            X.99l r1 = r0.A08
            java.lang.String r0 = "add_bank"
            X.7Tb r0 = r1.A01(r0)
            r1.A08(r0)
        L_0x0055:
            java.lang.Object r2 = r2.A00
            X.9AF r2 = (X.AnonymousClass9AF) r2
            X.9mK r1 = r2.A01
            if (r1 == 0) goto L_0x002b
            if (r4 == 0) goto L_0x002b
            r0 = 0
            r1.BZf(r4, r0)
            X.6hx r0 = r4.A08
            X.99H r0 = (X.AnonymousClass99H) r0
            if (r0 == 0) goto L_0x002b
            boolean r0 = X.AnonymousClass99H.A00(r0)
            if (r0 == 0) goto L_0x002b
            X.99l r1 = r2.A08
            java.lang.String r0 = "2fa"
            X.7Tb r0 = r1.A01(r0)
            r1.A08(r0)
            X.9pj r3 = (X.C204669pj) r3
            int r0 = r3.A01
            java.lang.Object r1 = r3.A00
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x008c
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r1 = (com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r1
            X.9Qp r0 = r1.A0O
        L_0x0088:
            r0.A00(r1)
            return
        L_0x008c:
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r1 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r1
            X.9Qp r0 = r1.A0R
            goto L_0x0088
        L_0x0091:
            if (r3 == 0) goto L_0x00bd
            int r2 = com.whatsapp.payments.ui.BrazilPayBloksActivity.A0d(r7)
            java.lang.String r1 = "default_selected_position"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r5.put(r1, r0)
            X.1VX r0 = r8.A0D
            boolean r0 = r0.A0X(r6)
            if (r0 == 0) goto L_0x00b4
            r0 = -1
            if (r2 == r0) goto L_0x00b4
            java.lang.Object r0 = r7.get(r2)
            X.9eV r0 = (X.C198179eV) r0
            com.whatsapp.payments.ui.BrazilPayBloksActivity.A0e(r0, r5)
        L_0x00b4:
            java.lang.String r1 = "verify_methods"
            java.lang.String r0 = r3.toString()
            r5.put(r1, r0)
        L_0x00bd:
            java.lang.String r0 = "on_success"
            r4.A01(r0, r5)
            return
        L_0x00c3:
            java.lang.Object r4 = r9.A00
            com.whatsapp.payments.ui.BrazilPayBloksActivity r4 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r4
            java.lang.Object r3 = r9.A01
            X.6hr r3 = (X.C133736hr) r3
            java.lang.Object r2 = r9.A02
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r9.A03
            X.2m3 r1 = (X.C52792m3) r1
            r0 = 0
            r4.A7H(r3, r0, r2)
            java.lang.String r0 = "on_success"
            r1.A01(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195209Wo.BMJ(java.util.List):void");
    }
}
