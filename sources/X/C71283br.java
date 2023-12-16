package X;

import com.whatsapp.settings.Settings;

/* renamed from: X.3br  reason: invalid class name and case insensitive filesystem */
public class C71283br implements Runnable {
    public Object A00;
    public final int A01;

    public C71283br(Settings settings, int i) {
        this.A01 = i;
        if (41 - i != 0) {
            this.A00 = settings;
        } else {
            this.A00 = settings;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0393, code lost:
        if (r1 == 0) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x051d, code lost:
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0520, code lost:
        r2.A0H(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0524, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        X.C06270Wx.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0164, code lost:
        r1.A0X(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0167, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01be, code lost:
        r1.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0556;
                case 1: goto L_0x0542;
                case 2: goto L_0x02d1;
                case 3: goto L_0x052d;
                case 4: goto L_0x0525;
                case 5: goto L_0x0517;
                case 6: goto L_0x0244;
                case 7: goto L_0x022b;
                case 8: goto L_0x0510;
                case 9: goto L_0x0506;
                case 10: goto L_0x021b;
                case 11: goto L_0x021b;
                case 12: goto L_0x020c;
                case 13: goto L_0x01f7;
                case 14: goto L_0x01f7;
                case 15: goto L_0x0007;
                case 16: goto L_0x0007;
                case 17: goto L_0x04fe;
                case 18: goto L_0x04f6;
                case 19: goto L_0x01c3;
                case 20: goto L_0x018a;
                case 21: goto L_0x0168;
                case 22: goto L_0x0153;
                case 23: goto L_0x0149;
                case 24: goto L_0x012a;
                case 25: goto L_0x010a;
                case 26: goto L_0x00e4;
                case 27: goto L_0x04e0;
                case 28: goto L_0x0099;
                case 29: goto L_0x04d8;
                case 30: goto L_0x04d0;
                case 31: goto L_0x04bf;
                case 32: goto L_0x04b7;
                case 33: goto L_0x006f;
                case 34: goto L_0x0028;
                case 35: goto L_0x0484;
                case 36: goto L_0x0470;
                case 37: goto L_0x0430;
                case 38: goto L_0x0424;
                case 39: goto L_0x0410;
                case 40: goto L_0x0400;
                case 41: goto L_0x03f5;
                case 42: goto L_0x03ea;
                case 43: goto L_0x03d3;
                case 44: goto L_0x039c;
                case 45: goto L_0x0370;
                case 46: goto L_0x001c;
                case 47: goto L_0x035c;
                case 48: goto L_0x0348;
                case 49: goto L_0x02ef;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.3T7 r0 = (X.AnonymousClass3T7) r0
            X.5Gi r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.08M r1 = r2.A01
            r0 = 2
            X.C06270Wx.A03(r1, r0)
            X.08M r1 = r2.A02
        L_0x0017:
            r0 = 0
        L_0x0018:
            X.C06270Wx.A03(r1, r0)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.WaPreferenceFragment r0 = (com.whatsapp.WaPreferenceFragment) r0
            X.4bZ r0 = r0.A00
            if (r0 == 0) goto L_0x001b
            r0.BjL()
            return
        L_0x0028:
            java.lang.Object r2 = r1.A00
            com.whatsapp.search.views.itemviews.MessageGifVideoPlayer r2 = (com.whatsapp.search.views.itemviews.MessageGifVideoPlayer) r2
            X.1pA r5 = r2.A05
            if (r5 == 0) goto L_0x001b
            X.7yd r3 = new X.7yd
            r3.<init>()
            X.33C r4 = r5.A01
            if (r4 == 0) goto L_0x005e
            java.io.File r0 = r4.A0F
            if (r0 == 0) goto L_0x0064
            boolean r1 = r0.exists()
            r0 = 1
            if (r1 != r0) goto L_0x0064
            java.io.File r0 = r4.A0F
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r0.getAbsolutePath()
        L_0x004c:
            r3.A03 = r0
        L_0x004e:
            java.lang.String r0 = r5.A04
            r3.A04 = r0
            int r0 = r4.A08
            r3.A02 = r0
            int r0 = r4.A06
            r3.A01 = r0
            int r0 = r4.A05
            r3.A00 = r0
        L_0x005e:
            r2.A04 = r3
            goto L_0x05c1
        L_0x0062:
            r0 = 0
            goto L_0x004c
        L_0x0064:
            java.lang.String r0 = r5.A1x()
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = r5.A1x()
            goto L_0x004c
        L_0x006f:
            java.lang.Object r3 = r1.A00
            X.4zW r3 = (X.C97924zW) r3
            com.whatsapp.search.views.itemviews.AudioPlayerView r2 = r3.A09
            java.lang.Object r0 = r2.getTag()
            if (r0 == 0) goto L_0x001b
            X.1mu r0 = r3.A09
            X.2z0 r1 = r0.A1J
            java.lang.Object r0 = r2.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            X.1mu r0 = r3.A09
            X.2xx r0 = r0.A00
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r0.A00()
            if (r0 == 0) goto L_0x001b
            r2.A03(r0)
            return
        L_0x0099:
            java.lang.Object r6 = r1.A00
            com.whatsapp.search.SearchViewModel r6 = (com.whatsapp.search.SearchViewModel) r6
            X.5tJ r7 = r6.A0K()
            java.lang.Runnable r0 = r6.A0G
            if (r1 != r0) goto L_0x001b
            long r1 = r6.A00
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c2
            long r2 = X.C18310x6.A0A(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SearchViewModel/firstResult: "
            X.C18260x0.A12(r0, r1, r2)
            X.2oJ r1 = r6.A17
            r0 = 5
            r1.A00(r0, r2)
            r6.A00 = r4
        L_0x00c2:
            X.08J r0 = r6.A02
            r0.A0G(r7)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A1M
            r2 = 1
            r1 = 0
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L_0x00d6
            X.4UC r0 = r6.A1D
            X.C06270Wx.A04(r0, r1)
        L_0x00d6:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A1L
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L_0x001b
            X.4UC r0 = r6.A1G
            X.AnonymousClass0x7.A18(r0)
            return
        L_0x00e4:
            java.lang.Object r0 = r1.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            X.03q r2 = r0.A0Q()
            X.8pL r2 = (X.C183008pL) r2
            com.whatsapp.search.SearchViewModel r1 = r0.A1c
            r0 = 2
            r1.A0X(r0)
            if (r2 == 0) goto L_0x001b
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x001b
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            android.view.ViewGroup r1 = r2.A0L
            r0 = 2131233559(0x7f080b17, float:1.8083259E38)
            r1.setBackgroundResource(r0)
            android.view.View r1 = r2.A0F
            goto L_0x01be
        L_0x010a:
            java.lang.Object r0 = r1.A00
            X.69r r0 = (X.C1237669r) r0
            java.lang.Object r1 = r0.A00
            com.whatsapp.search.SearchFragment r1 = (com.whatsapp.search.SearchFragment) r1
            X.4XH r0 = r1.A1b
            if (r0 == 0) goto L_0x0119
            r0.A05()
        L_0x0119:
            com.whatsapp.search.SearchViewModel r2 = r1.A1c
            X.5dZ r0 = r2.A0M()
            if (r0 == 0) goto L_0x001b
            r1 = 2
            int r0 = r0.A01
            if (r1 != r0) goto L_0x001b
            r2.A0P()
            return
        L_0x012a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchViewModel r1 = r0.A1c
            if (r1 == 0) goto L_0x001b
            r0 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            X.08M r1 = r1.A0f
            java.lang.Object r0 = r1.A07()
            boolean r0 = r2.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001b
            r1.A0G(r2)
            return
        L_0x0149:
            java.lang.Object r0 = r1.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchViewModel r1 = r0.A1c
            if (r1 == 0) goto L_0x001b
            r0 = 5
            goto L_0x0164
        L_0x0153:
            java.lang.Object r1 = r1.A00
            com.whatsapp.search.SearchFragment r1 = (com.whatsapp.search.SearchFragment) r1
            com.whatsapp.search.SearchViewModel r0 = r1.A1c
            if (r0 == 0) goto L_0x001b
            android.content.Context r0 = r1.A1D()
            if (r0 == 0) goto L_0x001b
            com.whatsapp.search.SearchViewModel r1 = r1.A1c
            r0 = 3
        L_0x0164:
            r1.A0X(r0)
            return
        L_0x0168:
            java.lang.Object r2 = r1.A00
            com.whatsapp.search.IteratingPlayer r2 = (com.whatsapp.search.IteratingPlayer) r2
            r2.A02()
            int r0 = r2.A00
            int r1 = r0 + 1
            int r0 = r2.A02
            if (r1 <= r0) goto L_0x0179
            int r1 = r2.A01
        L_0x0179:
            r2.A03(r1)
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x001b
            X.3Wi r3 = r2.A06
            java.lang.Runnable r2 = r2.A07
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.A0T(r2, r0)
            return
        L_0x018a:
            java.lang.Object r2 = r1.A00
            com.whatsapp.scroller.RecyclerFastScroller r2 = (com.whatsapp.scroller.RecyclerFastScroller) r2
            android.view.View r0 = r2.A03
            boolean r0 = r0.isPressed()
            if (r0 != 0) goto L_0x001b
            android.view.View r0 = r2.A03
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x001b
            r4 = 1
            r5 = 0
            boolean r0 = r2.A0C
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x01a8
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x01a8:
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r8 = r4
            r10 = r4
            r11 = r5
            r6 = r4
            r9 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            android.view.View r0 = r2.A03
            r0.startAnimation(r3)
            android.view.View r1 = r2.A03
        L_0x01be:
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x01c3:
            java.lang.Object r3 = r1.A00
            X.5pg r3 = (X.C116065pg) r3
            X.3dV r0 = r3.A00
            boolean r0 = X.C72303dV.A00(r0)
            if (r0 == 0) goto L_0x001b
            X.2qK r0 = r3.A01
            java.util.List r0 = r0.A04()
            java.util.Iterator r2 = r0.iterator()
        L_0x01d9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            X.2i6 r1 = (X.C50392i6) r1
            X.8qC r0 = r3.A03
            java.lang.Object r4 = r0.get()
            X.30F r4 = (X.AnonymousClass30F) r4
            long r5 = r1.A02
            long r7 = r1.A03
            boolean r9 = r1.A08
            r4.A01(r5, r7, r9)
            goto L_0x01d9
        L_0x01f7:
            java.lang.Object r0 = r1.A00
            X.3T6 r0 = (X.AnonymousClass3T6) r0
            X.5Gj r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.2qI r0 = r2.A05
            int r1 = r0.A00()
            r0 = 1
            if (r1 != r0) goto L_0x001b
            com.whatsapp.report.BusinessActivityReportViewModel.A00(r2)
            return
        L_0x020c:
            java.lang.Object r0 = r1.A00
            X.3T4 r0 = (X.AnonymousClass3T4) r0
            X.5Gk r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel.A00(r0)
            X.08M r1 = r0.A01
            goto L_0x0017
        L_0x021b:
            java.lang.Object r0 = r1.A00
            X.3T4 r0 = (X.AnonymousClass3T4) r0
            X.5Gk r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel.A00(r0)
            X.08M r1 = r0.A01
            r0 = 3
            goto L_0x0018
        L_0x022b:
            java.lang.Object r0 = r1.A00
            X.4Jb r0 = (X.C86164Jb) r0
            java.lang.Object r1 = r0.A00
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x001b
            X.20h r0 = X.C369320h.ACCOUNT
            r1.BiY(r0)
            X.20h r0 = X.C369320h.NEWSLETTER
            r1.BiY(r0)
            return
        L_0x0244:
            java.lang.Object r2 = r1.A00
            com.whatsapp.report.BusinessActivityReportViewModel r2 = (com.whatsapp.report.BusinessActivityReportViewModel) r2
            X.3Wi r0 = r2.A03
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x001b
            X.08M r1 = r2.A01
            r0 = 1
            X.C06270Wx.A03(r1, r0)
            X.3T7 r8 = r2.A0D
            X.1ip r0 = r8.A04
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x02cf
            X.31C r7 = r8.A06
            java.lang.String r10 = r7.A03()
            r11 = 267(0x10b, float:3.74E-43)
            r5 = 2
            X.39V[] r2 = new X.AnonymousClass39V[r5]
            java.lang.String r1 = "action"
            java.lang.String r0 = "request"
            boolean r6 = X.AnonymousClass39V.A0F(r1, r0, r2)
            X.33j r0 = r8.A05
            java.lang.String r1 = r0.A07()
            java.lang.String r0 = "lang"
            boolean r4 = X.AnonymousClass39V.A0G(r0, r1, r2)
            java.lang.String r0 = "p2b"
            X.36K r3 = X.AnonymousClass36K.A0I(r0, r2)
            r0 = 6
            X.39V[] r2 = new X.AnonymousClass39V[r0]
            X.AnonymousClass39V.A0E(r2, r6)
            X.2sr r0 = r8.A03
            java.lang.String r1 = X.C56972sr.A06(r0)
            java.lang.String r0 = "from"
            X.AnonymousClass39V.A0B(r0, r1, r2, r4)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:biz:p2b_report"
            X.AnonymousClass39V.A0B(r1, r0, r2, r5)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.AnonymousClass39V.A07(r1, r0, r2)
            java.lang.String r1 = "smax_id"
            java.lang.String r0 = "33"
            X.AnonymousClass39V.A08(r1, r0, r2)
            java.lang.String r0 = "id"
            X.39V r1 = new X.39V
            r1.<init>((java.lang.String) r0, (java.lang.String) r10)
            r0 = 5
            r2[r0] = r1
            X.36K r9 = X.AnonymousClass36K.A0G(r3, r2)
            r12 = 32000(0x7d00, double:1.581E-319)
            r7.A0E(r8, r9, r10, r11, r12)
            r2 = 1
        L_0x02c5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/sendRequestReport success:"
            X.C18260x0.A1E(r0, r1, r2)
            return
        L_0x02cf:
            r2 = 0
            goto L_0x02c5
        L_0x02d1:
            java.lang.Object r3 = r1.A00
            com.whatsapp.report.BusinessActivityReportViewModel r3 = (com.whatsapp.report.BusinessActivityReportViewModel) r3
            X.3Wi r0 = r3.A03
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x001b
            X.08M r1 = r3.A02
            r0 = 3
            X.C06270Wx.A03(r1, r0)
            X.4FS r2 = r3.A0E
            r1 = 0
            X.3br r0 = new X.3br
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.BkM(r0)
            return
        L_0x02ef:
            java.lang.Object r6 = r1.A00
            com.whatsapp.settings.SettingsDataUsageActivity r6 = (com.whatsapp.settings.SettingsDataUsageActivity) r6
            X.2s4 r0 = r6.A0K
            com.whatsapp.Statistics$Data r10 = r0.A00()
            r7 = 2131893600(0x7f121d60, float:1.9421981E38)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            X.33j r8 = r6.A00
            long r2 = r10.A0E
            long r0 = r10.A0G
            long r2 = r2 + r0
            long r0 = r10.A0M
            long r2 = r2 + r0
            long r0 = r10.A0D
            long r2 = r2 + r0
            long r0 = r10.A0J
            long r2 = r2 + r0
            java.lang.String r0 = X.AnonymousClass35V.A05(r8, r2)
            java.lang.String r0 = r8.A0H(r0)
            r9 = 0
            java.lang.String r7 = X.AnonymousClass002.A0F(r6, r0, r5, r9, r7)
            r8 = 2131893599(0x7f121d5f, float:1.942198E38)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            X.33j r4 = r6.A00
            long r2 = r10.A01
            long r0 = r10.A03
            long r2 = r2 + r0
            long r0 = r10.A0B
            long r2 = r2 + r0
            long r0 = r10.A00
            long r2 = r2 + r0
            long r0 = r10.A08
            long r2 = r2 + r0
            java.lang.String r0 = X.AnonymousClass35V.A05(r4, r2)
            X.C620733j.A03(r4, r0, r5, r9)
            java.lang.String r1 = r6.getString(r8, r5)
            X.33j r0 = r6.A00
            java.lang.String r1 = X.C107575bX.A05(r0, r7, r1)
            android.widget.TextView r0 = r6.A0A
            r0.setText(r1)
            return
        L_0x0348:
            java.lang.Object r1 = r1.A00
            com.whatsapp.settings.SettingsCompanionLogoutDialog r1 = (com.whatsapp.settings.SettingsCompanionLogoutDialog) r1
            java.lang.String r0 = "SettingsCompanionLogoutDialog/onCreateDialog click deregister"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.2dy r3 = r1.A03
            java.lang.String r2 = "user_initiated"
            r1 = 0
            r0 = 1
            r3.A01(r2, r0, r1)
            return
        L_0x035c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsChatViewModel r0 = (com.whatsapp.settings.SettingsChatViewModel) r0
            X.08M r2 = r0.A00
            X.35r r0 = r0.A01
            long r0 = r0.A0D()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0G(r0)
            return
        L_0x0370:
            java.lang.Object r1 = r1.A00
            com.whatsapp.settings.SettingsChatHistoryFragment r1 = (com.whatsapp.settings.SettingsChatHistoryFragment) r1
            X.4bZ r0 = r1.A00
            if (r0 == 0) goto L_0x037b
            r0.BjL()
        L_0x037b:
            java.lang.String r0 = "msgstore_archive_all_chats"
            androidx.preference.Preference r3 = r1.B3I(r0)
            X.314 r0 = r1.A05
            int r2 = r0.A03()
            X.314 r0 = r1.A05
            int r1 = r0.A02()
            if (r2 > 0) goto L_0x0395
            r0 = 2131894554(0x7f12211a, float:1.9423916E38)
            if (r1 != 0) goto L_0x0398
        L_0x0395:
            r0 = 2131895674(0x7f12257a, float:1.9426188E38)
        L_0x0398:
            r3.A0D(r0)
            return
        L_0x039c:
            java.lang.Object r1 = r1.A00
            X.3Dh r1 = (X.C64393Dh) r1
            X.2UN r0 = r1.A08()
            java.io.File r0 = r0.A01
            r1.A0Z(r0)
            X.2UN r0 = r1.A08()
            java.io.File r0 = r0.A00
            r1.A0Z(r0)
            X.2UN r0 = r1.A08()
            java.io.File r0 = r0.A0O
            r1.A0Z(r0)
            X.2UN r0 = r1.A08()
            java.io.File r0 = r0.A05
            r1.A0Z(r0)
            java.io.File r0 = r1.A0A()
            r1.A0Z(r0)
            java.io.File r0 = r1.A0G()
            r1.A0Z(r0)
            return
        L_0x03d3:
            java.lang.Object r0 = r1.A00
            X.67u r0 = (X.C1232767u) r0
            java.lang.Object r1 = r0.A00
            com.whatsapp.settings.Settings r1 = (com.whatsapp.settings.Settings) r1
            X.8qC r0 = r1.A0u
            r0.get()
            X.5UY r1 = r1.A0r
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r1.A06(r0)
            return
        L_0x03ea:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.Settings r0 = (com.whatsapp.settings.Settings) r0
            X.2pb r1 = r0.A0d
            r0 = 0
            r1.A03(r0)
            return
        L_0x03f5:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.Settings r0 = (com.whatsapp.settings.Settings) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A06
            r0 = 0
            r1.A0Z(r0)
            return
        L_0x0400:
            java.lang.Object r0 = r1.A00
            X.6Bf r0 = (X.C124166Bf) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.service.UnsentMessagesNetworkAvailableJob r0 = (com.whatsapp.service.UnsentMessagesNetworkAvailableJob) r0
            X.1io r1 = r0.A01
            X.4FW r0 = r0.A08
            r1.A07(r0)
            return
        L_0x0410:
            java.lang.Object r2 = r1.A00
            com.whatsapp.service.UnsentMessagesNetworkAvailableJob r2 = (com.whatsapp.service.UnsentMessagesNetworkAvailableJob) r2
            java.lang.String r0 = "UnsentMessagesNetworkAvailableJob timeout"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.1io r1 = r2.A01
            X.4FW r0 = r2.A08
            r1.A07(r0)
            r2.A00()
            return
        L_0x0424:
            java.lang.Object r0 = r1.A00
            com.whatsapp.service.UnsentMessagesNetworkAvailableJob r0 = (com.whatsapp.service.UnsentMessagesNetworkAvailableJob) r0
            X.1io r1 = r0.A01
            X.4FW r0 = r0.A08
            r1.A06(r0)
            return
        L_0x0430:
            java.lang.Object r4 = r1.A00
            com.whatsapp.service.UnsentMessagesNetworkAvailableJob r4 = (com.whatsapp.service.UnsentMessagesNetworkAvailableJob) r4
            X.3dV r0 = r4.A02
            boolean r0 = X.C72303dV.A00(r0)
            if (r0 == 0) goto L_0x0467
            X.2qY r0 = r4.A03
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0467
            android.os.Handler r3 = r4.A07
            r1 = 38
            X.3br r0 = new X.3br
            r0.<init>((java.lang.Object) r4, (int) r1)
            r3.post(r0)
            java.lang.String r0 = "Unsent messages found, scheduling timeout task"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Runnable r2 = r4.A0A
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.postDelayed(r2, r0)
            X.3Lt r0 = r4.A04
            r1 = 0
            r3 = 1
            r4 = r1
            r5 = r1
            r2 = r1
            r0.A09(r1, r2, r3, r4, r5)
            return
        L_0x0467:
            java.lang.String r0 = "UnsentMessagesNetworkAvailableJob/No unsent messages found, finishing job."
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r4.A00()
            return
        L_0x0470:
            java.lang.Object r1 = r1.A00
            com.whatsapp.service.RestoreChatConnectionWorker r1 = (com.whatsapp.service.RestoreChatConnectionWorker) r1
            java.lang.String r0 = "RestoreChatConnectionWorker timeout"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.0BT r1 = r1.A01
            X.0An r0 = new X.0An
            r0.<init>()
            r1.A09(r0)
            return
        L_0x0484:
            java.lang.Object r4 = r1.A00
            X.2p1 r4 = (X.C54622p1) r4
            monitor-enter(r4)
            java.util.Set r0 = r4.A02     // Catch:{ all -> 0x04b4 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x04b4 }
        L_0x048f:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x04b4 }
            if (r0 == 0) goto L_0x04b2
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x04b4 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x04b4 }
            java.util.Map r1 = r4.A01     // Catch:{ all -> 0x04b4 }
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x04b4 }
            X.1qQ r0 = (X.C32451qQ) r0     // Catch:{ all -> 0x04b4 }
            if (r0 == 0) goto L_0x048f
            boolean r0 = r0.A01()     // Catch:{ all -> 0x04b4 }
            if (r0 == 0) goto L_0x04ae
            r1.remove(r2)     // Catch:{ all -> 0x04b4 }
        L_0x04ae:
            r3.remove()     // Catch:{ all -> 0x04b4 }
            goto L_0x048f
        L_0x04b2:
            monitor-exit(r4)     // Catch:{ all -> 0x04b4 }
            return
        L_0x04b4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x04b4 }
            throw r0
        L_0x04b7:
            java.lang.Object r0 = r1.A00
            X.4zX r0 = (X.AnonymousClass4zX) r0
            X.AnonymousClass4zX.setUpViewBasedOnMessageState$lambda$3(r0)
            return
        L_0x04bf:
            java.lang.Object r3 = r1.A00
            com.whatsapp.search.views.TokenizedSearchInput r3 = (com.whatsapp.search.views.TokenizedSearchInput) r3
            com.whatsapp.text.FinalBackspaceAwareEntry r2 = r3.A0X
            r1 = 29
            X.3br r0 = new X.3br
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.post(r0)
            return
        L_0x04d0:
            java.lang.Object r0 = r1.A00
            com.whatsapp.search.views.TokenizedSearchInput r0 = (com.whatsapp.search.views.TokenizedSearchInput) r0
            r0.A0B()
            return
        L_0x04d8:
            java.lang.Object r0 = r1.A00
            com.whatsapp.search.views.TokenizedSearchInput r0 = (com.whatsapp.search.views.TokenizedSearchInput) r0
            com.whatsapp.search.views.TokenizedSearchInput.A06(r0)
            return
        L_0x04e0:
            java.lang.Object r2 = r1.A00
            X.5RD r2 = (X.AnonymousClass5RD) r2
            java.lang.String r0 = "MessageSearchManager/warm contacts"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.3Lu r1 = r2.A0G
            X.2s8 r0 = r2.A0K
            r1.A0L(r0)
            X.2s8 r0 = r2.A0L
            r1.A0L(r0)
            return
        L_0x04f6:
            java.lang.Object r0 = r1.A00
            X.1i8 r0 = (X.C29011i8) r0
            r0.A0D()
            return
        L_0x04fe:
            java.lang.Object r0 = r1.A00
            X.1i8 r0 = (X.C29011i8) r0
            r0.A0K()
            return
        L_0x0506:
            java.lang.Object r0 = r1.A00
            X.1tg r0 = (X.C33781tg) r0
            X.3Wi r2 = r0.A00
            r1 = 2131889538(0x7f120d82, float:1.9413742E38)
            goto L_0x0520
        L_0x0510:
            java.lang.Object r0 = r1.A00
            X.1tf r0 = (X.C33771tf) r0
            X.3Wi r2 = r0.A00
            goto L_0x051d
        L_0x0517:
            java.lang.Object r0 = r1.A00
            X.4ea r0 = (X.C89654ea) r0
            X.3Wi r2 = r0.A05
        L_0x051d:
            r1 = 2131889537(0x7f120d81, float:1.941374E38)
        L_0x0520:
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x0525:
            java.lang.Object r0 = r1.A00
            X.3Lm r0 = (X.C66453Lm) r0
            r0.A07()
            return
        L_0x052d:
            java.lang.Object r2 = r1.A00
            com.whatsapp.report.ReportActivity r2 = (com.whatsapp.report.ReportActivity) r2
            com.whatsapp.report.ShareReportConfirmationDialogFragment r1 = new com.whatsapp.report.ShareReportConfirmationDialogFragment
            r1.<init>()
            X.5on r0 = new X.5on
            r0.<init>(r2)
            r1.A00 = r0
            r0 = 0
            r2.Bon(r1, r0)
            return
        L_0x0542:
            java.lang.Object r4 = r1.A00
            com.whatsapp.report.BusinessActivityReportViewModel r4 = (com.whatsapp.report.BusinessActivityReportViewModel) r4
            X.2qI r3 = r4.A05
            java.lang.String r2 = X.C18280x3.A0Y()
            r1 = 1
            X.6AP r0 = new X.6AP
            r0.<init>(r4, r1)
            r3.A04(r0, r2)
            return
        L_0x0556:
            java.lang.Object r0 = r1.A00
            com.whatsapp.report.BusinessActivityReportViewModel r0 = (com.whatsapp.report.BusinessActivityReportViewModel) r0
            X.2qI r1 = r0.A05
            X.5Mh r2 = new X.5Mh
            r2.<init>(r0)
            monitor-enter(r1)
            java.lang.String r0 = "BusinessActivityReportManager/download-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05be }
            X.7xn r0 = r1.A00     // Catch:{ all -> 0x05be }
            if (r0 == 0) goto L_0x05a4
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x05be }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x05be }
            if (r0 != 0) goto L_0x05a4
            X.1fk r5 = r1.A04     // Catch:{ all -> 0x05be }
            X.38t r7 = X.C633138t.A09     // Catch:{ all -> 0x05be }
            X.7xn r0 = r1.A00     // Catch:{ all -> 0x05be }
            java.lang.String r10 = r0.A06     // Catch:{ all -> 0x05be }
            java.lang.String r11 = r0.A05     // Catch:{ all -> 0x05be }
            java.lang.String r12 = r0.A04     // Catch:{ all -> 0x05be }
            java.lang.String r13 = r0.A08     // Catch:{ all -> 0x05be }
            java.lang.String r14 = r0.A03     // Catch:{ all -> 0x05be }
            r8 = 0
            java.lang.String r0 = r0.A07     // Catch:{ all -> 0x05be }
            byte[] r16 = X.AnonymousClass0x7.A1X(r0)     // Catch:{ all -> 0x05be }
            X.7xn r0 = r1.A00     // Catch:{ all -> 0x05be }
            long r3 = r0.A02     // Catch:{ all -> 0x05be }
            r17 = 2
            r18 = 1
            r19 = 10
            r0 = 4
            X.4IX r6 = new X.4IX     // Catch:{ all -> 0x05be }
            r6.<init>(r1, r0, r2)     // Catch:{ all -> 0x05be }
            r20 = 0
            r15 = r8
            r9 = r8
            r21 = r3
            r5.A08(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x05be }
            goto L_0x05bc
        L_0x05a4:
            java.lang.String r0 = "BusinessActivityReportManager/download-report no valid report info"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05be }
            java.lang.String r0 = "BusinessActivityReportViewModel/download-report/on-error"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05be }
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r2.A00     // Catch:{ all -> 0x05be }
            com.whatsapp.report.BusinessActivityReportViewModel.A00(r0)     // Catch:{ all -> 0x05be }
            X.08M r2 = r0.A01     // Catch:{ all -> 0x05be }
            r0 = 5
            X.C06270Wx.A04(r2, r0)     // Catch:{ all -> 0x05be }
            r1.A02()     // Catch:{ all -> 0x05be }
        L_0x05bc:
            monitor-exit(r1)
            return
        L_0x05be:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x05c1:
            android.media.MediaPlayer r0 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            if (r0 != 0) goto L_0x05ed
            android.media.MediaPlayer r0 = new android.media.MediaPlayer     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            r0.<init>()     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            r2.A02 = r0     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
        L_0x05cc:
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            r0 = 1
            r1.setLooping(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            java.lang.String r0 = r3.A03     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            r1.setDataSource(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            android.media.MediaPlayer$OnPreparedListener r0 = r2.A01     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            r1.setOnPreparedListener(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            android.media.MediaPlayer$OnErrorListener r0 = r2.A00     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            r1.setOnErrorListener(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            android.media.MediaPlayer r0 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            r0.prepareAsync()     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            goto L_0x05f1
        L_0x05ed:
            r0.reset()     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x05f2 }
            goto L_0x05cc
        L_0x05f1:
            return
        L_0x05f2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageGifVideoPlayer/"
            r1.append(r0)
            java.lang.String r0 = "prepareMediaPlayer failed to prepare mediaplayer"
            X.C18260x0.A15(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71283br.run():void");
    }

    public C71283br(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
