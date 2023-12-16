package X;

/* renamed from: X.68M  reason: invalid class name */
public class AnonymousClass68M extends AnonymousClass5ZM {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68M(C15910sA r2, C105195Ty r3) {
        super(r2, true);
        this.A01 = 7;
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
        r4.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = ((X.C614930z) r0.get()).A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x001a;
                case 1: goto L_0x004a;
                case 2: goto L_0x007f;
                case 3: goto L_0x0088;
                case 4: goto L_0x0021;
                case 5: goto L_0x00aa;
                case 6: goto L_0x002c;
                case 7: goto L_0x00c9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A00
            com.whatsapp.settings.Settings r0 = (com.whatsapp.settings.Settings) r0
            X.8qC r0 = r0.A0u
        L_0x000b:
            java.lang.Object r0 = r0.get()
            X.30z r0 = (X.C614930z) r0
            boolean r0 = r0.A08()
        L_0x0015:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L_0x0019:
            return r5
        L_0x001a:
            java.lang.Object r0 = r6.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            X.8qC r0 = r0.A1Q
            goto L_0x000b
        L_0x0021:
            java.lang.Object r0 = r6.A00
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r0
            X.3Ex r0 = r0.A0Y
            boolean r0 = r0.A0k()
            goto L_0x0015
        L_0x002c:
            r5 = 0
            java.lang.Object r3 = r6.A00     // Catch:{ OutOfMemoryError -> 0x00e9 }
            X.5Y7 r3 = (X.AnonymousClass5Y7) r3     // Catch:{ OutOfMemoryError -> 0x00e9 }
            android.graphics.Bitmap r2 = r3.A04     // Catch:{ OutOfMemoryError -> 0x00e9 }
            int r1 = r3.A0H     // Catch:{ OutOfMemoryError -> 0x00e9 }
            int r0 = r3.A0G     // Catch:{ OutOfMemoryError -> 0x00e9 }
            android.graphics.Bitmap r0 = android.media.ThumbnailUtils.extractThumbnail(r2, r1, r0)     // Catch:{ OutOfMemoryError -> 0x00e9 }
            if (r0 == 0) goto L_0x0019
            r3.A02 = r0
            X.4Wu r0 = r3.A08
            if (r0 == 0) goto L_0x0019
            boolean[] r1 = r0.A03
            r0 = 1
            java.util.Arrays.fill(r1, r0)
            return r5
        L_0x004a:
            java.lang.Object r3 = r6.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.8qC r0 = r3.A1R
            java.lang.Object r0 = r0.get()
            X.30k r0 = (X.C613630k) r0
            X.5SO r0 = r0.A02()
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x006a
            r2 = 1
            X.33p r0 = r3.A09
            r0.A1A(r1)
        L_0x006a:
            X.30z r0 = X.AnonymousClass4SG.A2e(r3)
            boolean r0 = r0.A08()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            android.util.Pair r5 = X.AnonymousClass0x9.A0C(r1, r0)
            return r5
        L_0x007f:
            java.lang.Object r0 = r6.A00
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r0 = (com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet) r0
            java.util.List r5 = r0.A1a()
            return r5
        L_0x0088:
            java.lang.Object r0 = r6.A00
            X.7DD r0 = (X.AnonymousClass7DD) r0
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r3 = r0.A00
            java.util.concurrent.locks.Lock r4 = r3.A0r
            r4.lock()
            java.util.LinkedHashMap r2 = r3.A0q     // Catch:{ all -> 0x00c4 }
            int r0 = r2.size()     // Catch:{ all -> 0x00c4 }
            if (r0 <= 0) goto L_0x009e
            r2.clear()     // Catch:{ all -> 0x00c4 }
        L_0x009e:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00c4 }
            r1.<init>(r2)     // Catch:{ all -> 0x00c4 }
            java.util.ArrayList r0 = r3.A0o     // Catch:{ all -> 0x00c4 }
            android.util.Pair r5 = X.AnonymousClass5ZM.A03(r1, r0)     // Catch:{ all -> 0x00c4 }
            goto L_0x00c0
        L_0x00aa:
            java.lang.Object r2 = r6.A00
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r2 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r2
            java.util.concurrent.locks.Lock r4 = r2.A0r
            r4.lock()
            java.util.LinkedHashMap r0 = r2.A0q     // Catch:{ all -> 0x00c4 }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00c4 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c4 }
            java.util.ArrayList r0 = r2.A0o     // Catch:{ all -> 0x00c4 }
            android.util.Pair r5 = X.AnonymousClass5ZM.A03(r1, r0)     // Catch:{ all -> 0x00c4 }
        L_0x00c0:
            r4.unlock()
            return r5
        L_0x00c4:
            r0 = move-exception
            r4.unlock()
            throw r0
        L_0x00c9:
            java.lang.Object r0 = r6.A00
            X.5Ty r0 = (X.C105195Ty) r0
            com.whatsapp.quickcontact.QuickContactActivity r2 = r0.A00
            X.2so r1 = r2.A0J
            X.3ZH r0 = r2.A0Z
            X.4uZ r0 = r0.A0H
            X.1fJ r0 = (X.C27991fJ) r0
            X.1fJ r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x00e6
            X.3Ex r0 = r2.A0M
            X.3ZH r5 = r0.A07(r1)
            if (r5 == 0) goto L_0x00e6
            return r5
        L_0x00e6:
            X.3ZH r5 = r2.A0Z
            return r5
        L_0x00e9:
            r1 = move-exception
            java.lang.String r0 = "FilterThumbnailAdapter/updateBaseThumbnail/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68M.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0148, code lost:
        if (r5 != 1) goto L_0x0118;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x001e;
                case 2: goto L_0x004c;
                case 3: goto L_0x01a7;
                case 4: goto L_0x00ed;
                case 5: goto L_0x01bb;
                case 6: goto L_0x0005;
                case 7: goto L_0x01d0;
                case 8: goto L_0x0193;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            boolean r0 = X.AnonymousClass001.A1Z(r8)
            if (r0 == 0) goto L_0x0005
            java.lang.String r0 = "HomeActivity/show badge for me tab"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r7.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            X.8qC r0 = r1.A1Q
            r0.get()
            X.5UY r1 = r1.A1L
            goto L_0x0205
        L_0x001e:
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r0 = r8.first
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "HomeActivity/show badge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r7.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            r0.A2H = r4
        L_0x0034:
            java.lang.Object r0 = r8.second
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r3 = r7.A00
            X.4ea r3 = (X.C89654ea) r3
            X.2qk r2 = r3.A03
            java.lang.String r1 = "asyncRefreshAccountSwitchingData/invalidate menu options"
            r0 = 0
            r2.A0A(r1, r4, r0)
            r3.invalidateOptionsMenu()
            return
        L_0x004c:
            java.util.List r8 = (java.util.List) r8
            r2 = 0
            X.C162457s7.A0J(r8, r2)
            java.lang.Object r4 = r7.A00
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r4 = (com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet) r4
            boolean r0 = r4.A0i
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "AccountSwitchingBottomSheet/onViewCreated/onPostExecute/isRemoving"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0060:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x007f
            X.3Wi r1 = r4.A1Y()
            r0 = 2131893926(0x7f121ea6, float:1.9422642E38)
            r1.A0H(r0, r2)
            X.2qk r3 = r4.A04
            if (r3 == 0) goto L_0x01da
            r2 = 0
            r1 = 1
            java.lang.String r0 = "AccountSwitchingBottomSheet/accounts is empty"
            r3.A0A(r0, r1, r2)
            r4.A1L()
            return
        L_0x007f:
            android.view.View r3 = r4.A01
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x01f4
            boolean r0 = X.C18310x6.A1X(r8)
            if (r0 == 0) goto L_0x00aa
            int r1 = r8.size()
            r0 = 2
            if (r1 >= r0) goto L_0x00aa
            r0 = 2131427438(0x7f0b006e, float:1.8476492E38)
            android.view.View r0 = X.C06560Yg.A02(r3, r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r4.A02 = r0
            if (r0 == 0) goto L_0x00aa
            android.view.View r1 = r0.inflate()
            if (r1 == 0) goto L_0x00aa
            r0 = 32
            X.C18280x3.A0p(r1, r4, r0)
        L_0x00aa:
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x01ef
            android.content.Context r2 = r4.A0G()
            r0 = 2131427447(0x7f0b0077, float:1.847651E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            com.whatsapp.BottomSheetListView r0 = (com.whatsapp.BottomSheetListView) r0
            r4.A03 = r0
            X.2qk r1 = r4.A04
            if (r1 == 0) goto L_0x01e8
            X.33j r0 = r4.A0E
            if (r0 == 0) goto L_0x01e1
            X.4OL r3 = new X.4OL
            r3.<init>(r2, r1, r0, r8)
            com.whatsapp.BottomSheetListView r0 = r4.A03
            if (r0 == 0) goto L_0x00d1
            r0.setAdapter(r3)
        L_0x00d1:
            com.whatsapp.BottomSheetListView r2 = r4.A03
            if (r2 == 0) goto L_0x00de
            r1 = 0
            X.69q r0 = new X.69q
            r0.<init>(r8, r1, r4)
            r2.setOnItemClickListener(r0)
        L_0x00de:
            X.4fK r1 = new X.4fK
            r1.<init>(r3, r4)
            r4.A0A = r1
            X.4xV r0 = r4.A0B
            if (r0 == 0) goto L_0x0005
            r0.A06(r1)
            return
        L_0x00ed:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.Object r4 = r7.A00
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r4 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r4
            X.4Ox r1 = r4.A0T
            java.lang.CharSequence r0 = r1.A01
            boolean r0 = X.C18320x8.A1U(r0)
            r3 = 5
            r2 = 1
            if (r0 == 0) goto L_0x014b
            java.util.ArrayList r0 = r4.A0C
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x014b
            r5 = 5
        L_0x0108:
            X.08M r6 = r4.A0J
            java.lang.Object r0 = r6.A07()
            if (r0 == 0) goto L_0x0148
            int r0 = X.C86604Kt.A05(r6)
            if (r0 != r5) goto L_0x0148
            if (r5 != r3) goto L_0x0005
        L_0x0118:
            java.util.ArrayList r1 = r4.A0C
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0142
            r1.clear()
            X.8FU r0 = r4.A01
            if (r0 == 0) goto L_0x012a
            r1.add(r0)
        L_0x012a:
            X.8FV r0 = r4.A02
            if (r0 == 0) goto L_0x0131
            r1.add(r0)
        L_0x0131:
            r4.A0I()
            r0 = 0
            r4.A03 = r0
        L_0x0137:
            X.107 r1 = r4.A0l
            java.util.ArrayList r0 = r4.A0C
            r1.A0H(r0)
        L_0x013e:
            X.C06270Wx.A03(r6, r5)
            return
        L_0x0142:
            java.lang.String r0 = "CallsHistoryFragmentV2ViewModel/clearCallLog no items registered"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0137
        L_0x0148:
            if (r5 == r2) goto L_0x013e
            goto L_0x0118
        L_0x014b:
            java.util.LinkedHashMap r0 = r4.A0q
            int r0 = r0.size()
            if (r0 > 0) goto L_0x016b
            java.util.ArrayList r0 = r4.A0o
            int r0 = r0.size()
            if (r0 > 0) goto L_0x016b
            java.lang.CharSequence r0 = r1.A01
            boolean r0 = X.C18320x8.A1U(r0)
            if (r0 == 0) goto L_0x016d
            java.util.ArrayList r0 = r4.A0C
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x016d
        L_0x016b:
            r5 = 1
            goto L_0x0108
        L_0x016d:
            X.5XL r0 = r4.A0L
            X.55L r0 = r0.A03
            if (r0 == 0) goto L_0x0175
            r5 = 0
            goto L_0x0108
        L_0x0175:
            X.1VX r1 = r4.A0f
            r0 = 5868(0x16ec, float:8.223E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0189
            X.2Xk r0 = r4.A0X
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0189
            r5 = 4
            goto L_0x0108
        L_0x0189:
            boolean r0 = r8.booleanValue()
            r5 = 2
            if (r0 != 0) goto L_0x0108
            r5 = 3
            goto L_0x0108
        L_0x0193:
            boolean r0 = X.AnonymousClass001.A1Z(r8)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r1 = r7.A00
            com.whatsapp.settings.Settings r1 = (com.whatsapp.settings.Settings) r1
            X.5UY r0 = r1.A0r
            if (r0 != 0) goto L_0x01f9
            java.lang.String r0 = "Settings/executeShouldShowBadgeTask/accountSwitcherBadge == null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x01a7:
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r0 = r7.A00
            X.7DD r0 = (X.AnonymousClass7DD) r0
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r2 = r0.A00
            java.lang.Object r1 = r8.first
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r8.second
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r2.A0L(r0, r1)
            return
        L_0x01bb:
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r2 = r7.A00
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r2 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel) r2
            java.lang.Object r1 = r8.first
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r8.second
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r2.A0M(r0, r1)
            r2.A0H()
            return
        L_0x01d0:
            X.3ZH r8 = (X.AnonymousClass3ZH) r8
            java.lang.Object r0 = r7.A00
            X.5Ty r0 = (X.C105195Ty) r0
            r0.A03(r8)
            return
        L_0x01da:
            java.lang.String r0 = "crashLogs"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01e1:
            java.lang.String r0 = "whatsAppLocale"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01e8:
            java.lang.String r0 = "crashLogs"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r2)
            throw r0
        L_0x01f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r2)
            throw r0
        L_0x01f9:
            java.lang.String r0 = "Settings/executeShouldShowBadgeTask/shouldShowBadge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8qC r0 = r1.A0u
            r0.get()
            X.5UY r1 = r1.A0r
        L_0x0205:
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r1.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68M.A0C(java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68M(C15910sA r2, AnonymousClass5Y7 r3) {
        super(r2, true);
        this.A01 = 6;
        this.A00 = r3;
    }

    public AnonymousClass68M(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
