package X;

import android.view.View;

/* renamed from: X.5eb  reason: invalid class name and case insensitive filesystem */
public class C109425eb implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109425eb(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a7, code lost:
        if (r4.A0d.A05() == false) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0334, code lost:
        if (r3.A0V.A05() == false) goto L_0x0336;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00e9;
                case 2: goto L_0x000f;
                case 3: goto L_0x00f1;
                case 4: goto L_0x0104;
                case 5: goto L_0x0115;
                case 6: goto L_0x011d;
                case 7: goto L_0x0149;
                case 8: goto L_0x0149;
                case 9: goto L_0x0125;
                case 10: goto L_0x012d;
                case 11: goto L_0x0149;
                case 12: goto L_0x0149;
                case 13: goto L_0x0048;
                case 14: goto L_0x0151;
                case 15: goto L_0x0159;
                case 16: goto L_0x0191;
                case 17: goto L_0x03b9;
                case 18: goto L_0x03b9;
                case 19: goto L_0x01a1;
                case 20: goto L_0x01ae;
                case 21: goto L_0x01b8;
                case 22: goto L_0x01ee;
                case 23: goto L_0x0200;
                case 24: goto L_0x0218;
                case 25: goto L_0x0220;
                case 26: goto L_0x0265;
                case 27: goto L_0x0276;
                case 28: goto L_0x02b4;
                case 29: goto L_0x02cc;
                case 30: goto L_0x030b;
                case 31: goto L_0x0343;
                case 32: goto L_0x034b;
                case 33: goto L_0x008a;
                case 34: goto L_0x0387;
                case 35: goto L_0x03b9;
                case 36: goto L_0x03c1;
                case 37: goto L_0x00c5;
                case 38: goto L_0x03c9;
                case 39: goto L_0x03d7;
                case 40: goto L_0x03b9;
                case 41: goto L_0x03b9;
                case 42: goto L_0x03e4;
                case 43: goto L_0x03f3;
                case 44: goto L_0x0408;
                case 45: goto L_0x0425;
                case 46: goto L_0x0005;
                case 47: goto L_0x0005;
                case 48: goto L_0x042f;
                case 49: goto L_0x0437;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            X.6J2 r0 = (X.AnonymousClass6J2) r0
            X.8u1 r0 = r0.A00
            r0.BOb()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r6 = r11.A00
            com.whatsapp.biz.product.view.fragment.ProductBottomSheet r6 = (com.whatsapp.biz.product.view.fragment.ProductBottomSheet) r6
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r0 = r6.A09
            if (r0 != 0) goto L_0x001c
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x001c:
            com.whatsapp.jid.UserJid r5 = r0.A04
            if (r5 == 0) goto L_0x000e
            X.5dw r0 = r0.A02
            if (r0 == 0) goto L_0x0046
            java.lang.String r4 = r0.A0F
        L_0x0026:
            r3 = 1
            com.whatsapp.biz.cart.view.fragment.CartFragment r2 = new com.whatsapp.biz.cart.view.fragment.CartFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "extra_business_id"
            r1.putParcelable(r0, r5)
            java.lang.String r0 = "extra_entry_point"
            r1.putInt(r0, r3)
            java.lang.String r0 = "extra_product_id"
            r1.putString(r0, r4)
            r2.A0u(r1)
            X.C57052sz.A01(r2, r6)
            return
        L_0x0046:
            r4 = 0
            goto L_0x0026
        L_0x0048:
            java.lang.Object r1 = r11.A00
            X.12d r1 = (X.C196812d) r1
            X.66R r0 = r1.A04
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel r5 = (com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel) r5
            X.47w r4 = r1.A00
            if (r4 == 0) goto L_0x043f
            boolean r0 = r4 instanceof X.C85264Fo
            if (r0 == 0) goto L_0x000e
            X.4Fo r4 = (X.C85264Fo) r4
            X.2o1 r3 = r4.B4o()
            X.4FV r2 = r5.A05
            X.1ZN r1 = new X.1ZN
            r1.<init>()
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            java.lang.String r0 = r3.A08
            r1.A04 = r0
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            r2.BhD(r1)
            X.08M r1 = r5.A02
            X.3ZH r0 = r4.BEQ()
            X.AnonymousClass5YS.A00(r1, r0)
            return
        L_0x008a:
            java.lang.Object r1 = r11.A00
            X.4i8 r1 = (X.C90724i8) r1
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r1 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r1
            X.5hC r0 = r1.A03
            if (r0 == 0) goto L_0x000e
            X.4U8 r6 = r1.A74()
            X.5a3 r0 = r0.A0S
            X.7ZW r0 = r0.A06()
            X.5du r0 = r0.A04
            X.5ds r5 = r0.A00()
            X.08M r1 = r6.A02
            r0 = 2
            X.C06270Wx.A03(r1, r0)
            X.5iG r4 = r6.A0K
            r3 = 11
            r2 = 68
            r1 = 1
            X.5Tn r0 = r6.A0N
            java.lang.Integer r0 = r0.A03()
            X.C111545iG.A00(r4, r0, r3, r2, r1)
            X.8ZN r1 = new X.8ZN
            r1.<init>(r6)
            X.4FS r0 = r6.A0c
            X.C70323aJ.A00(r0, r6, r5, r1, r3)
            return
        L_0x00c5:
            java.lang.Object r0 = r11.A00
            com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r0 = (com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment) r0
            r0.A1K()
            X.4CX r0 = r0.A02
            if (r0 == 0) goto L_0x000e
            r0.BNl()
            return
        L_0x00d4:
            java.lang.Object r3 = r11.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.report.ReportActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x00e9:
            java.lang.Object r0 = r11.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1L()
            return
        L_0x00f1:
            java.lang.Object r0 = r11.A00
            com.whatsapp.biz.product.view.fragment.ProductBottomSheet r0 = (com.whatsapp.biz.product.view.fragment.ProductBottomSheet) r0
            com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel r2 = r0.A09
            if (r2 != 0) goto L_0x00fe
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x00fe:
            r0 = 1
            r2.A0E(r0)
            return
        L_0x0104:
            java.lang.Object r1 = r11.A00
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment r1 = (com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment) r1
            r0 = 2131427957(0x7f0b0275, float:1.8477545E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment.A00(r0, r1)
            return
        L_0x0115:
            java.lang.Object r0 = r11.A00
            com.whatsapp.bizintegrity.utils.BizIntegrityFragment r0 = (com.whatsapp.bizintegrity.utils.BizIntegrityFragment) r0
            r0.A1Z()
            return
        L_0x011d:
            java.lang.Object r0 = r11.A00
            com.whatsapp.bizintegrity.utils.BizIntegrityFragment r0 = (com.whatsapp.bizintegrity.utils.BizIntegrityFragment) r0
            r0.A1Y()
            return
        L_0x0125:
            java.lang.Object r0 = r11.A00
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            X.C86654Ky.A1C(r0)
            return
        L_0x012d:
            java.lang.Object r2 = r11.A00
            com.whatsapp.bonsai.BonsaiSystemMessageBottomSheet r2 = (com.whatsapp.bonsai.BonsaiSystemMessageBottomSheet) r2
            X.66R r0 = r2.A01
            r0.getValue()
            X.03q r1 = r2.A0Q()
            if (r1 == 0) goto L_0x0145
            java.lang.String r0 = "https://www.facebook.com/privacy/guide/genai?entry_point=whatsapp_genai"
            android.content.Intent r0 = X.C18300x5.A08(r0)
            r1.startActivity(r0)
        L_0x0145:
            r2.A1L()
            return
        L_0x0149:
            java.lang.Object r0 = r11.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            r0.invoke()
            return
        L_0x0151:
            java.lang.Object r0 = r11.A00
            com.whatsapp.bonsai.waitlist.BonsaiWaitlistBottomSheet r0 = (com.whatsapp.bonsai.waitlist.BonsaiWaitlistBottomSheet) r0
            r0.A1Y()
            return
        L_0x0159:
            java.lang.Object r3 = r11.A00
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r3 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r3
            X.2s5 r2 = r3.A0P
            java.lang.String r1 = "wfs"
            java.lang.String r0 = "wrong_number"
            r2.A03(r1, r0)
            java.util.Map r1 = r3.A03
            if (r1 == 0) goto L_0x018a
            r0 = 551495536(0x20df2770, float:3.7803767E-19)
            java.lang.Object r1 = X.AnonymousClass001.A0i(r1, r0)
            if (r1 == 0) goto L_0x0185
            X.5hc r1 = (X.C111145hc) r1
            java.lang.String r0 = "NOT_YOU"
            r1.A05(r0)
            r1.A01()
            android.content.Intent r0 = X.C627736r.A05(r3)
            r3.startActivity(r0)
            return
        L_0x0185:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()
            throw r0
        L_0x018a:
            java.lang.String r0 = "xFamilyUserFlowLoggers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0191:
            java.lang.Object r1 = r11.A00
            com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity r1 = (com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity) r1
            com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment r0 = r1.A03
            if (r0 == 0) goto L_0x019d
            r0.A1J()
            return
        L_0x019d:
            r1.onBackPressed()
            return
        L_0x01a1:
            java.lang.Object r0 = r11.A00
            X.4wJ r0 = (X.C96404wJ) r0
            X.4GQ r0 = r0.A03
            X.C162457s7.A0H(r12)
            r0.invoke(r12)
            return
        L_0x01ae:
            java.lang.Object r1 = r11.A00
            X.6le r1 = (X.C135976le) r1
            X.8nb r0 = r1.A01
            r0.Baa(r1)
            return
        L_0x01b8:
            java.lang.Object r0 = r11.A00
            X.6lk r0 = (X.C136036lk) r0
            X.7Cu r0 = r0.A00
            X.4U1 r4 = r0.A00
            r3 = 0
            r4.A00 = r3
            X.08J r2 = r4.A05
            java.lang.Object r0 = r2.A07()
            if (r0 == 0) goto L_0x01e7
            java.util.Collection r0 = X.C86664Kz.A1P(r2)
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01e7
            java.lang.Object r0 = r1.get(r3)
            boolean r0 = r0 instanceof X.C136036lk
            if (r0 == 0) goto L_0x01e7
            r1.remove(r3)
            r2.A0G(r1)
        L_0x01e7:
            X.4UC r1 = r4.A0I
            r0 = 2
            X.C06270Wx.A04(r1, r0)
            return
        L_0x01ee:
            java.lang.Object r4 = r11.A00
            X.4hu r4 = (X.C90604hu) r4
            X.5Lp r3 = r4.A0O
            com.whatsapp.jid.UserJid r2 = r4.A0N
            r1 = 2
            r0 = 0
            androidx.fragment.app.DialogFragment r0 = r3.A00(r2, r0, r1)
            r4.Boo(r0)
            return
        L_0x0200:
            java.lang.Object r2 = r11.A00
            X.7Vp r2 = (X.C151647Vp) r2
            boolean r0 = r2 instanceof X.C132506fS
            if (r0 == 0) goto L_0x0212
            X.8rK r1 = r2.A00
            X.6fS r2 = (X.C132506fS) r2
            X.7Yh r0 = r2.A00
            r1.BUo(r0)
            return
        L_0x0212:
            X.8rK r0 = r2.A00
            r0.Baf()
            return
        L_0x0218:
            java.lang.Object r0 = r11.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x0220:
            java.lang.Object r2 = r11.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r2 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity) r2
            java.util.TimerTask r0 = r2.A0C
            if (r0 == 0) goto L_0x022b
            r0.cancel()
        L_0x022b:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r4 = r2.A06
            if (r4 == 0) goto L_0x0259
            android.os.Bundle r3 = r4.A06
            if (r3 == 0) goto L_0x0263
            java.lang.String r1 = "ARG_PREVIOUS_SCREEN"
            r0 = -1
            int r0 = r3.getInt(r1, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x023e:
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r1 = r4.A09
            int r0 = r1.A04
            r9 = 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r9)
            X.5iG r3 = r1.A0N
            r7 = 1
            r8 = 31
            if (r0 == 0) goto L_0x0251
            r7 = 2
            r8 = 30
        L_0x0251:
            java.lang.Integer r4 = X.C105085Tn.A00(r1)
            r6 = 0
            r3.A09(r4, r5, r6, r7, r8, r9)
        L_0x0259:
            X.4zS r1 = r2.A05
            r0 = 1
            r1.A01(r0)
            r2.onBackPressed()
            return
        L_0x0263:
            r5 = 0
            goto L_0x023e
        L_0x0265:
            java.lang.Object r0 = r11.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.4U2 r0 = r0.A0N
            if (r0 != 0) goto L_0x0272
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x0272:
            r0.A0G()
            return
        L_0x0276:
            java.lang.Object r0 = r11.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.4U2 r4 = r0.A0N
            if (r4 != 0) goto L_0x0283
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x0283:
            X.5iE r3 = r4.A0V
            r2 = 1
            X.4sp r1 = new X.4sp
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A0A = r0
            r3.A04(r1)
            r4.A0L = r2
            X.5Tn r0 = r4.A0Z
            boolean r0 = r0.A04()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x02a9
            X.5ZR r0 = r4.A0d
            boolean r0 = r0.A05()
            r2 = 0
            if (r0 != 0) goto L_0x02aa
        L_0x02a9:
            r2 = 1
        L_0x02aa:
            X.4UC r1 = r4.A0i
            r0 = 7
            if (r2 == 0) goto L_0x02b0
            r0 = 2
        L_0x02b0:
            X.C06270Wx.A03(r1, r0)
            return
        L_0x02b4:
            java.lang.Object r0 = r11.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.4U2 r1 = r0.A0N
            if (r1 != 0) goto L_0x02c1
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x02c1:
            X.4Zb r0 = r1.A07
            r1.A0M(r0)
            X.4Za r0 = r1.A08
            r1.A0O(r0)
            return
        L_0x02cc:
            java.lang.Object r0 = r11.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.4U2 r3 = r0.A0N
            if (r3 != 0) goto L_0x02d9
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x02d9:
            X.4Zb r0 = r3.A07
            r3.A0M(r0)
            X.4Za r0 = r3.A08
            r3.A0O(r0)
            X.5iE r2 = r3.A0V
            r0 = 79
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.4sp r0 = new X.4sp
            r0.<init>()
            r0.A0E = r1
            r2.A04(r0)
            X.08M r1 = r3.A0P
            r0 = 0
            X.C06270Wx.A03(r1, r0)
            r3.A0M = r0
            java.lang.String r0 = "map_view"
            r3.A0C = r0
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r3.A0B = r0
            r3.A0J()
            return
        L_0x030b:
            java.lang.Object r0 = r11.A00
            X.4i8 r0 = (X.C90724i8) r0
            X.4U8 r3 = r0.A74()
            X.5iG r4 = r3.A0K
            r8 = 11
            r9 = 69
            r10 = 1
            X.5Tn r0 = r3.A0N
            java.lang.Integer r5 = r0.A03()
            r6 = 0
            r7 = r6
            r4.A09(r5, r6, r7, r8, r9, r10)
            boolean r0 = r0.A04()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0336
            X.5ZR r0 = r3.A0V
            boolean r0 = r0.A05()
            r2 = 0
            if (r0 != 0) goto L_0x0337
        L_0x0336:
            r2 = 1
        L_0x0337:
            X.4UC r1 = r3.A0b
            r0 = 7
            if (r2 == 0) goto L_0x033d
            r0 = 2
        L_0x033d:
            X.C06270Wx.A03(r1, r0)
            r3.A0D = r10
            return
        L_0x0343:
            java.lang.Object r0 = r11.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r0
            r0.onBackPressed()
            return
        L_0x034b:
            java.lang.Object r3 = r11.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r3 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r3
            X.5cT r0 = r3.A0B
            boolean r0 = r0.A0D
            if (r0 != 0) goto L_0x0383
            X.33p r0 = r3.A09
            java.lang.String[] r1 = X.C622534h.A09
            boolean r0 = com.whatsapp.RequestPermissionActivity.A0t(r0, r1)
            if (r0 == 0) goto L_0x0383
            boolean r0 = com.whatsapp.RequestPermissionActivity.A0p(r3, r1)
            if (r0 != 0) goto L_0x0383
            X.5cT r2 = r3.A0B
            r1 = 0
            X.90N r0 = new X.90N
            r0.<init>(r3, r1)
            r2.A02(r0)
            X.5cT r0 = r3.A0B
            r2 = 1
            r0.A0E = r2
            X.4w0 r0 = r0.A0J
            X.5NA r0 = r0.A04
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass5NA.A00(r0)
            java.lang.String r0 = "DIRECTORY_LOCATION_INFO_SHOWN"
            X.C18270x1.A0l(r1, r0, r2)
            return
        L_0x0383:
            r3.A79()
            return
        L_0x0387:
            java.lang.Object r3 = r11.A00
            com.whatsapp.businessdirectory.view.custom.ClearLocationDialogFragment r3 = (com.whatsapp.businessdirectory.view.custom.ClearLocationDialogFragment) r3
            X.7Vq r2 = r3.A00
            monitor-enter(r2)
            X.4w0 r1 = r2.A00     // Catch:{ all -> 0x03b6 }
            r1.A00()     // Catch:{ all -> 0x03b6 }
            r0 = 0
            r1.A02(r0)     // Catch:{ all -> 0x03b6 }
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x03b4 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x03b4 }
        L_0x039d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x03b4 }
            if (r0 == 0) goto L_0x03af
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x03b4 }
            X.5ja r0 = (X.C112345ja) r0     // Catch:{ all -> 0x03b4 }
            X.8u0 r0 = r0.A07     // Catch:{ all -> 0x03b4 }
            r0.Brw()     // Catch:{ all -> 0x03b4 }
            goto L_0x039d
        L_0x03af:
            monitor-exit(r2)
            r3.A1K()
            return
        L_0x03b4:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x03b6 }
        L_0x03b6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x03b9:
            java.lang.Object r0 = r11.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x03c1:
            java.lang.Object r0 = r11.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x03c9:
            java.lang.Object r2 = r11.A00
            X.5jW r2 = (X.C112305jW) r2
            X.5LW r1 = r2.A0B
            r0 = 11
            r1.A03 = r0
            r2.A06()
            return
        L_0x03d7:
            java.lang.Object r2 = r11.A00
            X.5jX r2 = (X.C112315jX) r2
            X.7Ph r1 = r2.A09
            r0 = 5
            r1.A02 = r0
            r2.A06()
            return
        L_0x03e4:
            java.lang.Object r1 = r11.A00
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog r1 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog) r1
            X.66d r0 = r1.A02
            if (r0 == 0) goto L_0x03ef
            r0.BVq()
        L_0x03ef:
            r0 = 1
            r1.A03 = r0
            return
        L_0x03f3:
            java.lang.Object r2 = r11.A00
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r2 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r2
            com.google.android.material.chip.Chip r1 = r2.A01
            r0 = 8
            r1.setVisibility(r0)
            X.4U5 r0 = r2.A0D
            X.5jO r0 = r0.A0Q
            X.4UB r0 = r0.A00
            r0.A0K()
            return
        L_0x0408:
            java.lang.Object r0 = r11.A00
            X.4wF r0 = (X.C96364wF) r0
            X.7HA r6 = r0.A00
            X.5Xb r5 = r6.A01
            X.5iG r4 = r5.A04
            r3 = 1
            r2 = 34
            r1 = 5
            X.5Tn r0 = r5.A06
            java.lang.Integer r0 = r0.A03()
            X.C111545iG.A00(r4, r0, r3, r2, r1)
            X.5dy r0 = r6.A00
            r5.A03(r0)
            return
        L_0x0425:
            java.lang.Object r0 = r11.A00
            X.6J2 r0 = (X.AnonymousClass6J2) r0
            X.8u1 r0 = r0.A00
            r0.BOy()
            return
        L_0x042f:
            java.lang.Object r0 = r11.A00
            X.8uO r0 = (X.C185878uO) r0
            r0.Bb2()
            return
        L_0x0437:
            java.lang.Object r0 = r11.A00
            X.8uO r0 = (X.C185878uO) r0
            r0.BP0()
            return
        L_0x043f:
            java.lang.String r0 = "bot"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109425eb.onClick(android.view.View):void");
    }
}
