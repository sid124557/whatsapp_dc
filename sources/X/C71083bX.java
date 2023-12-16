package X;

/* renamed from: X.3bX  reason: invalid class name and case insensitive filesystem */
public class C71083bX implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final int A09;

    public C71083bX(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, int i, boolean z, boolean z2) {
        this.A09 = i;
        this.A07 = z;
        this.A00 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A08 = z2;
        this.A02 = obj3;
        this.A05 = str2;
        this.A03 = obj4;
        this.A06 = str3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: X.3ME} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: X.3MF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.3ME} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: X.3ME} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r6 = r17
            int r0 = r6.A09
            if (r0 == 0) goto L_0x0093
            boolean r0 = r6.A07
            java.lang.Object r4 = r6.A00
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r12 = r6.A01
            X.3MF r12 = (X.AnonymousClass3MF) r12
            java.lang.Object r2 = r6.A02
            X.2Jg r2 = (X.C41182Jg) r2
            java.lang.String r8 = r6.A04
            boolean r3 = r6.A08
            java.lang.String r5 = r6.A05
            java.lang.Object r7 = r6.A03
            X.1dG r7 = (X.C27091dG) r7
            java.lang.String r10 = r6.A06
            java.lang.String r1 = "data_exchange"
            r9 = 0
            if (r0 == 0) goto L_0x0120
            X.03q r4 = (X.C003203q) r4
            X.0df r4 = r4.getSupportFragmentManager()
            java.lang.String r0 = "extensions_bottom_sheet_container"
            X.0eF r0 = r4.A0D(r0)
            if (r0 == 0) goto L_0x0050
            X.0df r4 = r0.A0T()
            java.lang.String r0 = "BK_FRAGMENT"
            X.0eF r0 = r4.A0D(r0)
            if (r0 == 0) goto L_0x0050
            X.0XL r4 = X.AnonymousClass0x9.A0H(r0)
            java.lang.Class<com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel> r0 = com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel.class
            X.0Ty r6 = r4.A01(r0)
            com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel r6 = (com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel) r6
            boolean r11 = r12.A0I
            r6.A0G(r7, r8, r9, r10, r11)
        L_0x0050:
            X.2XW r0 = r12.A03
            X.2m3 r2 = r0.A00(r2, r1)
            java.lang.String r1 = "failure"
            java.util.Map r0 = X.AnonymousClass31O.A01(r8)
            r2.A02(r1, r0)
            if (r3 == 0) goto L_0x0092
            android.app.Activity r0 = r12.A00
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0092
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0092
            java.lang.String r0 = "chat_id"
            java.lang.String r13 = r1.getString(r0)
            java.lang.String r0 = "message_id"
            java.lang.String r14 = r1.getString(r0)
            java.lang.String r0 = "action_name"
            java.lang.String r15 = r1.getString(r0)
            if (r14 == 0) goto L_0x0092
            if (r15 == 0) goto L_0x0092
            X.4FS r0 = r12.A0A
            r16 = 5
        L_0x008a:
            X.3ab r11 = new X.3ab
            r11.<init>(r12, r13, r14, r15, r16)
            r0.BkM(r11)
        L_0x0092:
            return
        L_0x0093:
            boolean r4 = r6.A07
            java.lang.Object r1 = r6.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r6.A01
            X.2ZN r2 = (X.AnonymousClass2ZN) r2
            java.lang.String r8 = r6.A04
            boolean r3 = r6.A08
            java.lang.Object r12 = r6.A02
            X.3ME r12 = (X.AnonymousClass3ME) r12
            java.lang.String r0 = r6.A05
            java.lang.Object r7 = r6.A03
            X.1dG r7 = (X.C27091dG) r7
            java.lang.String r10 = r6.A06
            if (r4 == 0) goto L_0x0113
            X.03q r1 = (X.C003203q) r1
            X.0df r1 = r1.getSupportFragmentManager()
            java.lang.String r0 = "extensions_bottom_sheet_container"
            X.0eF r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x00db
            X.0df r1 = r0.A0T()
            java.lang.String r0 = "BK_FRAGMENT"
            X.0eF r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x00db
            X.0XL r1 = X.AnonymousClass0x9.A0H(r0)
            java.lang.Class<com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel> r0 = com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel.class
            X.0Ty r6 = r1.A01(r0)
            com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel r6 = (com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel) r6
            boolean r11 = r12.A0F
            r9 = 0
            r6.A0G(r7, r8, r9, r10, r11)
        L_0x00db:
            if (r2 == 0) goto L_0x00e6
            java.lang.String r1 = "failure"
            java.util.Map r0 = X.AnonymousClass31O.A01(r8)
            r2.A00(r1, r0)
        L_0x00e6:
            if (r3 == 0) goto L_0x0092
            android.app.Activity r0 = r12.A00
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0092
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0092
            java.lang.String r0 = "chat_id"
            java.lang.String r13 = r1.getString(r0)
            java.lang.String r0 = "message_id"
            java.lang.String r14 = r1.getString(r0)
            java.lang.String r0 = "action_name"
            java.lang.String r15 = r1.getString(r0)
            if (r14 == 0) goto L_0x0092
            if (r15 == 0) goto L_0x0092
            X.4FS r0 = r12.A07
            r16 = 4
            goto L_0x008a
        L_0x0113:
            if (r2 == 0) goto L_0x0092
            java.lang.String r1 = "success"
            java.util.Map r0 = X.AnonymousClass31O.A01(r0)
            r2.A00(r1, r0)
            return
        L_0x0120:
            android.content.Intent r0 = r4.getIntent()
            if (r0 == 0) goto L_0x0176
            android.os.Bundle r3 = r0.getExtras()
            if (r3 == 0) goto L_0x0176
            java.lang.String r0 = "message_id"
            java.lang.String r14 = r3.getString(r0)
        L_0x0133:
            android.content.Intent r0 = r4.getIntent()
            if (r0 == 0) goto L_0x0146
            android.os.Bundle r3 = r0.getExtras()
            if (r3 == 0) goto L_0x0146
            java.lang.String r0 = "session_id"
            java.lang.String r9 = r3.getString(r0)
        L_0x0146:
            java.util.Map r13 = X.AnonymousClass31O.A01(r5)
            X.1VX r4 = r12.A09
            r3 = 3216(0xc90, float:4.507E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r3)
            if (r0 == 0) goto L_0x0169
            if (r5 == 0) goto L_0x0169
            if (r14 == 0) goto L_0x0169
            if (r9 == 0) goto L_0x0169
            X.4FS r0 = r12.A0A
            r16 = 10
            X.3aa r11 = new X.3aa
            r15 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            r0.BkM(r11)
        L_0x0169:
            X.2XW r0 = r12.A03
            X.2m3 r1 = r0.A00(r2, r1)
            java.lang.String r0 = "success"
            r1.A02(r0, r13)
            return
        L_0x0176:
            r14 = r9
            goto L_0x0133
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71083bX.run():void");
    }
}
