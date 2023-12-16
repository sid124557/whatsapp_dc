package X;

/* renamed from: X.93C  reason: invalid class name */
public class AnonymousClass93C implements C15530rW {
    public Object A00;
    public final int A01;

    public AnonymousClass93C(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        r3.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        r1.A0H(java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cb, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BM2(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0053;
                case 1: goto L_0x0077;
                case 2: goto L_0x008c;
                case 3: goto L_0x00a8;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00c6;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r4.A00
            com.whatsapp.payments.ui.BrazilPixKeySettingActivity r3 = (com.whatsapp.payments.ui.BrazilPixKeySettingActivity) r3
            X.0Zg r5 = (X.C06800Zg) r5
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            int r1 = r5.A00
            r0 = -1
            java.lang.String r2 = "brazilPixKeySettingViewModel"
            if (r1 == r0) goto L_0x0028
            if (r1 != 0) goto L_0x00bf
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r0 = r3.A03
            if (r0 != 0) goto L_0x0021
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0021:
            X.08M r1 = r0.A01
            r0 = 0
            X.C06270Wx.A04(r1, r0)
            return
        L_0x0028:
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r1 = r3.A03
            if (r1 != 0) goto L_0x0031
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0031:
            java.lang.String r0 = r3.A05
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "credentialId"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x003c:
            X.632 r3 = new X.632
            r3.<init>(r1, r0)
            X.5xw r2 = new X.5xw
            r2.<init>(r1)
            X.7WM r0 = r1.A04
            X.9Tg r1 = r0.A02
            X.7SP r0 = new X.7SP
            r0.<init>(r2, r3)
            r1.A03(r0)
            return
        L_0x0053:
            java.lang.Object r2 = r4.A00
            X.4i8 r2 = (X.C90724i8) r2
            java.util.Map r5 = (java.util.Map) r5
            r1 = 1
            X.C162457s7.A0J(r5, r1)
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bf
            r2.A0A = r1
            X.4U8 r0 = r2.A74()
            X.4UC r1 = r0.A0b
            r0 = 0
            goto L_0x00b8
        L_0x0077:
            java.lang.Object r2 = r4.A00
            com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment r2 = (com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment) r2
            X.0Zg r5 = (X.C06800Zg) r5
            int r1 = r5.A00
            r0 = -1
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r3 = r2.A04
            if (r1 == r0) goto L_0x00a4
            r2 = 6
            X.5iE r1 = r3.A01
            r0 = 1
            r1.A02(r2, r0)
            return
        L_0x008c:
            java.lang.Object r1 = r4.A00
            com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment r1 = (com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment) r1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bf
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r3 = r1.A04
        L_0x00a4:
            r3.A0D()
            return
        L_0x00a8:
            java.lang.Object r2 = r4.A00
            com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment r2 = (com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment) r2
            X.0Zg r5 = (X.C06800Zg) r5
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x00bf
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r0 = r2.A04
            X.4UC r1 = r0.A07
            r0 = 2
        L_0x00b8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0H(r0)
        L_0x00bf:
            return
        L_0x00c0:
            java.lang.Object r1 = r4.A00
            X.5jZ r1 = (X.C112335jZ) r1
            r0 = 0
            goto L_0x00cb
        L_0x00c6:
            java.lang.Object r1 = r4.A00
            X.5jZ r1 = (X.C112335jZ) r1
            r0 = 1
        L_0x00cb:
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass93C.BM2(java.lang.Object):void");
    }
}
