package X;

import android.view.View;
import com.whatsapp.waffle.wfac.ui.WfacBanInfoFragment;

/* renamed from: X.39r  reason: invalid class name and case insensitive filesystem */
public class C635539r implements View.OnClickListener {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public C635539r(WfacBanInfoFragment wfacBanInfoFragment, int i, int i2, int i3) {
        this.A03 = i3;
        if (1 - i3 != 0) {
            this.A02 = wfacBanInfoFragment;
            this.A00 = i;
        } else {
            this.A02 = wfacBanInfoFragment;
            this.A00 = 1;
        }
        this.A01 = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.whatsapp.waffle.wfac.ui.WfacUnbanDecisionFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            int r0 = r7.A03
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0078;
                case 2: goto L_0x003f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r7.A02
            com.whatsapp.waffle.wfac.ui.WfacUnbanDecisionFragment r4 = (com.whatsapp.waffle.wfac.ui.WfacUnbanDecisionFragment) r4
            int r3 = r7.A00
            int r2 = r7.A01
            com.whatsapp.waffle.wfac.ui.WfacBanViewModel r1 = r4.A01
            if (r1 != 0) goto L_0x002d
            java.lang.String r0 = "viewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0019:
            java.lang.Object r4 = r7.A02
            com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment r4 = (com.whatsapp.waffle.wfac.ui.WfacBanDecisionFragment) r4
            int r3 = r7.A00
            int r2 = r7.A01
            com.whatsapp.waffle.wfac.ui.WfacBanViewModel r1 = r4.A00
            if (r1 != 0) goto L_0x002d
            java.lang.String r0 = "viewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x002d:
            X.03q r0 = r4.A0R()
            r1.A0E(r0)
            X.2XC r1 = r4.A1I()
            java.lang.String r0 = "reg_new_number_started"
            r1.A01(r0, r3, r2)
            return
        L_0x003f:
            java.lang.Object r6 = r7.A02
            com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment r6 = (com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment) r6
            int r5 = r7.A00
            int r4 = r7.A01
            r0 = 3
            X.C162457s7.A0J(r8, r0)
            android.content.Context r3 = X.C18290x4.A0F(r8)
            boolean r0 = X.C57672u1.A00(r3)
            r2 = 0
            X.5hX r1 = r6.A00
            if (r1 == 0) goto L_0x0071
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "fb://feed/"
        L_0x005c:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.BkW(r3, r0, r2)
            X.2XC r1 = r6.A1I()
            java.lang.String r0 = "redirect_to_source_app"
            r1.A01(r0, r5, r4)
            return
        L_0x006e:
            java.lang.String r0 = "https://m.facebook.com"
            goto L_0x005c
        L_0x0071:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0078:
            java.lang.Object r5 = r7.A02
            com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment r5 = (com.whatsapp.waffle.wfac.ui.WfacBanBaseFragment) r5
            int r4 = r7.A01
            r3 = 1
            r0 = 3
            X.C162457s7.A0J(r8, r0)
            android.content.Context r2 = X.C18290x4.A0F(r8)
            X.5hX r1 = r5.A00
            if (r1 == 0) goto L_0x009b
            java.lang.String r0 = "https://instagram.com"
            X.C18310x6.A0y(r2, r1, r0)
            X.2XC r1 = r5.A1I()
            java.lang.String r0 = "redirect_to_source_app"
            r1.A01(r0, r3, r4)
            return
        L_0x009b:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C635539r.onClick(android.view.View):void");
    }

    public C635539r(Object obj, int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = i2;
    }
}
