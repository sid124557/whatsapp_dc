package X;

import android.view.View;

/* renamed from: X.5eY  reason: invalid class name and case insensitive filesystem */
public class C109395eY implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109395eY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C109395eY(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v242, resolved type: com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v243, resolved type: com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0422, code lost:
        r2.A0G(r0.A0R(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x042a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0473, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0476, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x047d, code lost:
        r0.A1J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0480, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04a5, code lost:
        r0.A1M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04b8, code lost:
        r1.A1Q(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04bb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.BP1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014d, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x04d4;
                case 1: goto L_0x04cc;
                case 2: goto L_0x04c4;
                case 3: goto L_0x04bc;
                case 4: goto L_0x04b1;
                case 5: goto L_0x04a9;
                case 6: goto L_0x0277;
                case 7: goto L_0x0216;
                case 8: goto L_0x01f9;
                case 9: goto L_0x049f;
                case 10: goto L_0x0495;
                case 11: goto L_0x048b;
                case 12: goto L_0x0481;
                case 13: goto L_0x0477;
                case 14: goto L_0x046f;
                case 15: goto L_0x01ac;
                case 16: goto L_0x0465;
                case 17: goto L_0x045e;
                case 18: goto L_0x0454;
                case 19: goto L_0x044d;
                case 20: goto L_0x0446;
                case 21: goto L_0x043f;
                case 22: goto L_0x0181;
                case 23: goto L_0x042b;
                case 24: goto L_0x041c;
                case 25: goto L_0x0151;
                case 26: goto L_0x0415;
                case 27: goto L_0x03be;
                case 28: goto L_0x03b6;
                case 29: goto L_0x03ae;
                case 30: goto L_0x03ae;
                case 31: goto L_0x039f;
                case 32: goto L_0x0005;
                case 33: goto L_0x0147;
                case 34: goto L_0x0147;
                case 35: goto L_0x0147;
                case 36: goto L_0x0140;
                case 37: goto L_0x0140;
                case 38: goto L_0x0140;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x0139;
                case 42: goto L_0x0139;
                case 43: goto L_0x0389;
                case 44: goto L_0x0381;
                case 45: goto L_0x02cc;
                case 46: goto L_0x02c4;
                case 47: goto L_0x008b;
                case 48: goto L_0x0026;
                case 49: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            X.65l r0 = (X.C1227165l) r0
        L_0x0009:
            r0.BP1()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r2 = r12.A00
            com.whatsapp.voipcalling.ScreenSharePermissionDialogFragment r2 = (com.whatsapp.voipcalling.ScreenSharePermissionDialogFragment) r2
            X.66R r0 = r2.A00
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.calling.screenshare.ScreenShareViewModel r1 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r1
            X.58J r0 = X.AnonymousClass58J.BOTTOM_SHEET
            r1.A0M(r0)
            android.app.Dialog r0 = r2.A03
            if (r0 == 0) goto L_0x000c
            r0.dismiss()
            return
        L_0x0026:
            java.lang.Object r4 = r12.A00
            X.5ZT r4 = (X.AnonymousClass5ZT) r4
            X.5qb r6 = r4.A1D
            boolean r0 = r4.A0P
            r2 = r0 ^ 1
            android.view.View r0 = r4.A0Y
            android.widget.ImageButton r1 = r6.A0E
            r1.setActivated(r2)
            if (r2 == 0) goto L_0x0059
            int r0 = X.C86654Ky.A04(r0)
            int r5 = X.C86664Kz.A0D(r1, r0)
            X.3Wi r3 = r6.A0F
            android.content.Context r1 = r6.A05
            r0 = 2131895083(0x7f12232b, float:1.942499E38)
            java.lang.String r0 = r1.getString(r0)
            r2 = 0
            r1 = 49
            android.widget.Toast r0 = r3.A0C(r0)
            r0.setGravity(r1, r2, r5)
            r0.show()
        L_0x0059:
            boolean r0 = r4.A0P
            r0 = r0 ^ 1
            r4.A0P = r0
            X.1VX r1 = r4.A0v
            r0 = 2832(0xb10, float:3.968E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x000c
            boolean r0 = r4.A0P
            if (r0 == 0) goto L_0x000c
            boolean r0 = r4.A0U()
            if (r0 != 0) goto L_0x000c
            X.4uZ r1 = r4.A0E
            if (r1 == 0) goto L_0x000c
            r0 = 82
            X.2Kp r3 = new X.2Kp
            r3.<init>(r1, r0)
            X.03q r0 = r4.A0a
            X.0df r2 = r0.getSupportFragmentManager()
            X.3LQ r1 = r4.A0y
            r0 = 0
            com.whatsapp.ephemeral.ViewOnceNuxBottomSheet.A01(r2, r3, r1, r0)
            return
        L_0x008b:
            java.lang.Object r1 = r12.A00
            X.65o r1 = (X.C1227465o) r1
            X.69l r1 = (X.C1237069l) r1
            int r0 = r1.A01
            java.lang.Object r7 = r1.A00
            X.5ZT r7 = (X.AnonymousClass5ZT) r7
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r7.A0U()
        L_0x009d:
            if (r0 == 0) goto L_0x0100
            X.5T5 r6 = r7.A1G
            X.5Gz r0 = r6.A06
            X.5ZT r0 = r0.A00
            X.4uZ r3 = r0.A0E
            long r1 = r6.A00
            r4 = 1
            long r1 = r1 + r4
            r6.A00 = r1
            if (r3 == 0) goto L_0x00d0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r3 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x00d4
            X.33p r0 = r6.A04
            android.content.SharedPreferences$Editor r3 = X.C18270x1.A03(r0)
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r2 = "ptt_pause_tap_broadcast"
            long r0 = X.AnonymousClass0x2.A0B(r0, r2)
            long r0 = r0 + r4
            android.content.SharedPreferences$Editor r0 = r3.putLong(r2, r0)
        L_0x00cd:
            r0.apply()
        L_0x00d0:
            r7.A05()
            return
        L_0x00d4:
            boolean r1 = X.C627336j.A0K(r3)
            X.33p r0 = r6.A04
            android.content.SharedPreferences$Editor r5 = X.C18270x1.A03(r0)
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            if (r1 == 0) goto L_0x00f2
            java.lang.String r4 = "ptt_pause_tap_group"
        L_0x00e6:
            long r2 = X.AnonymousClass0x2.A0B(r0, r4)
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r0 = r5.putLong(r4, r2)
            goto L_0x00cd
        L_0x00f2:
            java.lang.String r4 = "ptt_pause_tap_individual"
            goto L_0x00e6
        L_0x00f5:
            X.5TQ r0 = r7.A0L
            if (r0 == 0) goto L_0x0100
            com.whatsapp.util.OpusRecorder r0 = r0.A06
            boolean r0 = r0.isRecording()
            goto L_0x009d
        L_0x0100:
            X.2qd r3 = r7.A11
            X.4FU r2 = r7.A0e
            X.03q r1 = r7.A0a
            X.4uZ r0 = r7.A0E
            boolean r0 = r3.A03(r1, r2, r0)
            if (r0 == 0) goto L_0x000c
            X.5mA r0 = r7.A0m
            r0.A04()
            X.5Td r0 = r7.A15
            r0.A01()
            X.5TQ r0 = r7.A0L
            if (r0 == 0) goto L_0x0120
            r7.A08()
            return
        L_0x0120:
            java.io.File r8 = r7.A0M
            java.io.File r9 = r7.A0N
            r0 = 1
            X.92V r10 = new X.92V
            r10.<init>(r7, r0)
            if (r8 == 0) goto L_0x000c
            X.4FS r0 = r7.A1A
            r11 = 18
            X.3ac r6 = new X.3ac
            r6.<init>(r7, r8, r9, r10, r11)
            r0.BkM(r6)
            return
        L_0x0139:
            java.lang.Object r0 = r12.A00
            X.563 r0 = (X.AnonymousClass563) r0
            X.65l r0 = r0.A0G
            goto L_0x014d
        L_0x0140:
            java.lang.Object r0 = r12.A00
            X.563 r0 = (X.AnonymousClass563) r0
            X.65l r0 = r0.A0F
            goto L_0x014d
        L_0x0147:
            java.lang.Object r0 = r12.A00
            X.563 r0 = (X.AnonymousClass563) r0
            X.65l r0 = r0.A0E
        L_0x014d:
            if (r0 == 0) goto L_0x000c
            goto L_0x0009
        L_0x0151:
            java.lang.Object r2 = r12.A00
            com.whatsapp.userban.ui.fragment.BanAppealFormFragment r2 = (com.whatsapp.userban.ui.fragment.BanAppealFormFragment) r2
            X.03q r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0166
            android.view.View r1 = r0.getCurrentFocus()
            if (r1 == 0) goto L_0x0166
            X.5Wv r0 = r2.A07
            r0.A02(r1)
        L_0x0166:
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r4 = r2.A06
            android.widget.EditText r0 = r2.A00
            java.lang.String r7 = X.C18290x4.A0m(r0)
            X.08M r3 = r4.A02
            java.lang.Number r0 = X.C86654Ky.A0i(r3)
            r2 = 1
            if (r0 == 0) goto L_0x04dc
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x000c
            r0 = 2
            if (r1 != r0) goto L_0x04dc
            return
        L_0x0181:
            java.lang.Object r0 = r12.A00
            X.53d r0 = (X.C987653d) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A05
            com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel r2 = r0.A0i
            if (r2 != 0) goto L_0x0192
            java.lang.String r0 = "crosspostingUpdatesViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0192:
            X.5Sb r0 = r2.A00
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = "crossPostingViewModelState"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x019d:
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x000c
            X.3Gm r0 = r2.A06
            r0.A00()
            r1 = 1
            r0 = 0
            r2.A0E(r0, r1)
            return
        L_0x01ac:
            java.lang.Object r2 = r12.A00
            X.53T r2 = (X.AnonymousClass53T) r2
            boolean r0 = r2.A00
            r1 = r0 ^ 1
            r2.A00 = r1
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r0 = r2.A02
            r6 = r1 ^ 1
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A0L
            com.whatsapp.updates.viewmodels.UpdatesViewModel r5 = r0.A0q
            if (r5 == 0) goto L_0x000c
            X.5Jz r3 = r5.A0i
            X.08M r0 = r5.A0S
            java.util.List r0 = X.C86644Kx.A0h(r0)
            if (r0 == 0) goto L_0x01f7
            int r2 = r0.size()
        L_0x01ce:
            X.33p r0 = r3.A01
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "recommended_newsletters_collapsed"
            X.C18270x1.A0l(r1, r0, r6)
            X.5YD r4 = r3.A03
            long r2 = (long) r2
            X.1X5 r1 = new X.1X5
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A00 = r0
            X.4FV r0 = r4.A03
            r0.BhD(r1)
            r0 = 0
            r5.A0M(r0)
            return
        L_0x01f7:
            r2 = 0
            goto L_0x01ce
        L_0x01f9:
            java.lang.Object r0 = r12.A00
            X.53Q r0 = (X.AnonymousClass53Q) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A01
            android.content.Context r3 = r0.A1D()
            if (r3 == 0) goto L_0x000c
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.updates.ui.statusmuting.MutedStatusesActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0216:
            java.lang.Object r5 = r12.A00
            X.53a r5 = (X.C987353a) r5
            int r1 = r5.A01()
            r0 = -1
            if (r1 == r0) goto L_0x000c
            X.534 r0 = r5.A00
            java.lang.String r3 = "dataItem"
            if (r0 != 0) goto L_0x022c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x022c:
            X.1RL r4 = r0.A02
            r2 = 1
            X.5UY r0 = r5.A08
            android.view.View r1 = r0.A04()
            X.C162457s7.A0D(r1)
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.WaImageView r1 = r5.A03
            r0 = 4
            r1.setVisibility(r0)
            X.534 r0 = r5.A00
            if (r0 != 0) goto L_0x024b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x024b:
            r0.A01 = r2
            com.whatsapp.updates.ui.UpdatesFragment r0 = r5.A07
            com.whatsapp.updates.viewmodels.UpdatesViewModel r3 = r0.A0q
            if (r3 == 0) goto L_0x000c
            r2 = 0
            X.21q r1 = r4.A07
            X.21q r0 = X.C372821q.GUEST
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            if (r0 == 0) goto L_0x026a
            java.util.List r1 = r3.A0n
            X.4uZ r0 = r4.A05()
            X.C162457s7.A0D(r0)
            r1.add(r2, r0)
        L_0x026a:
            X.5Nw r2 = r3.A0j
            X.59F r1 = X.AnonymousClass59F.UPDATES_TAB_SEARCH
            X.635 r0 = new X.635
            r0.<init>(r4, r3)
            r2.A00(r4, r1, r0)
            return
        L_0x0277:
            java.lang.Object r0 = r12.A00
            X.53a r0 = (X.C987353a) r0
            com.whatsapp.updates.ui.UpdatesFragment r2 = r0.A07
            X.534 r0 = r0.A00
            if (r0 != 0) goto L_0x0288
            java.lang.String r0 = "dataItem"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0288:
            X.1RL r5 = r0.A02
            com.whatsapp.updates.viewmodels.UpdatesViewModel r1 = r2.A0q
            if (r1 == 0) goto L_0x000c
            X.03q r4 = r2.A0Q()
            X.AnonymousClass0x9.A1L(r4)
            X.4ea r4 = (X.C89654ea) r4
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.66R r0 = r1.A0r
            java.lang.Object r3 = X.C18300x5.A0d(r0)
            com.whatsapp.updates.viewmodels.SearchUsecase r3 = (com.whatsapp.updates.viewmodels.SearchUsecase) r3
            X.4uY r0 = r5.A0I()
            r3.A00 = r0
            X.5YD r2 = r3.A09
            r0 = 4
            X.4sE r1 = new X.4sE
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.4FV r0 = r2.A03
            r0.BhD(r1)
            X.5Um r1 = r3.A0A
            r0 = 11
            r1.A03(r4, r5, r0)
            return
        L_0x02c4:
            java.lang.Object r0 = r12.A00
            X.65n r0 = (X.C1227365n) r0
            r0.BRE()
            return
        L_0x02cc:
            java.lang.Object r0 = r12.A00
            X.5Gy r0 = (X.C101965Gy) r0
            X.5ZT r2 = r0.A00
            X.5ZQ r0 = r2.A0K
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x02e1
            r2.A06()
        L_0x02dd:
            r2.A0B()
            return
        L_0x02e1:
            X.5T5 r5 = r2.A1G
            long r3 = r5.A01
            r0 = 1
            long r3 = r3 + r0
            r5.A01 = r3
            X.5Gz r0 = r5.A06
            X.5ZT r0 = r0.A00
            X.4uZ r1 = r0.A0E
            if (r1 == 0) goto L_0x031c
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x0306
            X.33p r0 = r5.A04
            android.content.SharedPreferences$Editor r4 = X.C18270x1.A03(r0)
            android.content.SharedPreferences r3 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "ptt_playback_broadcast"
        L_0x0302:
            X.C86604Kt.A14(r4, r3, r0)
            goto L_0x031c
        L_0x0306:
            boolean r1 = X.C627336j.A0K(r1)
            X.33p r0 = r5.A04
            android.content.SharedPreferences$Editor r4 = X.C18270x1.A03(r0)
            android.content.SharedPreferences r3 = X.AnonymousClass0x2.A0F(r0)
            if (r1 == 0) goto L_0x0319
            java.lang.String r0 = "ptt_playback_group"
            goto L_0x0302
        L_0x0319:
            java.lang.String r0 = "ptt_playback_individual"
            goto L_0x0302
        L_0x031c:
            X.5Td r1 = r2.A15     // Catch:{ IOException -> 0x0379 }
            r1.A01()     // Catch:{ IOException -> 0x0379 }
            r0 = 2131892619(0x7f12198b, float:1.9419991E38)
            r1.A02(r0)     // Catch:{ IOException -> 0x0379 }
            X.5ZQ r0 = r2.A0K     // Catch:{ IOException -> 0x0379 }
            int r1 = r0.A02()     // Catch:{ IOException -> 0x0379 }
            X.5ZQ r0 = r2.A0K     // Catch:{ IOException -> 0x0379 }
            int r0 = r0.A03()     // Catch:{ IOException -> 0x0379 }
            if (r1 != r0) goto L_0x033b
            X.5ZQ r1 = r2.A0K     // Catch:{ IOException -> 0x0379 }
            r0 = 0
            r1.A0A(r0)     // Catch:{ IOException -> 0x0379 }
        L_0x033b:
            X.5ZQ r0 = r2.A0K     // Catch:{ IOException -> 0x0379 }
            int r0 = r0.A02()     // Catch:{ IOException -> 0x0379 }
            if (r0 != 0) goto L_0x0373
            X.5ZQ r0 = r2.A0K     // Catch:{ IOException -> 0x0379 }
            r0.A08()     // Catch:{ IOException -> 0x0379 }
        L_0x0348:
            X.2hu r1 = r2.A13     // Catch:{ IOException -> 0x0379 }
            r0 = 4
            X.2Yv r0 = r1.A00(r0)     // Catch:{ IOException -> 0x0379 }
            r2.A0I = r0     // Catch:{ IOException -> 0x0379 }
            android.os.Handler r1 = r2.A0T     // Catch:{ IOException -> 0x0379 }
            java.lang.Runnable r0 = r2.A1P     // Catch:{ IOException -> 0x0379 }
            r1.post(r0)     // Catch:{ IOException -> 0x0379 }
            X.4xf r1 = r2.A1E     // Catch:{ IOException -> 0x0379 }
            java.lang.String r0 = "voicenote/voicenotepreviewplay"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ IOException -> 0x0379 }
            java.util.Iterator r1 = X.C61102zi.A03(r1)     // Catch:{ IOException -> 0x0379 }
        L_0x0363:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x0379 }
            if (r0 == 0) goto L_0x02dd
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x0379 }
            X.5UH r0 = (X.AnonymousClass5UH) r0     // Catch:{ IOException -> 0x0379 }
            r0.A00()     // Catch:{ IOException -> 0x0379 }
            goto L_0x0363
        L_0x0373:
            X.5ZQ r0 = r2.A0K     // Catch:{ IOException -> 0x0379 }
            r0.A07()     // Catch:{ IOException -> 0x0379 }
            goto L_0x0348
        L_0x0379:
            r1 = move-exception
            java.lang.String r0 = "voicenoterecordingui/showvoicenotepreview/ error playing voice note preview "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x02dd
        L_0x0381:
            java.lang.Object r0 = r12.A00
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = (com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity) r0
            r0.toggleCheckBox(r13)
            return
        L_0x0389:
            java.lang.Object r2 = r12.A00
            X.5qO r2 = (X.C116505qO) r2
            X.4P1 r0 = r2.A0C
            boolean r1 = r0.A06()
            X.4P1 r0 = r2.A0C
            if (r1 == 0) goto L_0x039b
            r0.A02()
            return
        L_0x039b:
            r0.A03()
            return
        L_0x039f:
            java.lang.Object r1 = r12.A00
            com.whatsapp.util.DocumentWarningDialogFragment r1 = (com.whatsapp.util.DocumentWarningDialogFragment) r1
            X.043 r0 = r1.A00
            if (r0 == 0) goto L_0x03aa
            r0.dismiss()
        L_0x03aa:
            r0 = 0
            r1.A00 = r0
            return
        L_0x03ae:
            java.lang.Object r0 = r12.A00
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            X.C86654Ky.A1C(r0)
            return
        L_0x03b6:
            java.lang.Object r0 = r12.A00
            X.4GQ r0 = (X.AnonymousClass4GQ) r0
            r0.invoke(r13)
            return
        L_0x03be:
            java.lang.Object r0 = r12.A00
            com.whatsapp.userban.ui.fragment.BanInfoFragment r0 = (com.whatsapp.userban.ui.fragment.BanInfoFragment) r0
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r3 = r0.A01
            X.2jE r0 = r3.A07
            int r2 = r0.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BanAppealViewModel/verifyIfPhoneNumberIsVerified reg_state: "
            X.C18260x0.A0y(r0, r1, r2)
            r0 = 10
            boolean r0 = X.AnonymousClass000.A1U(r2, r0)
            java.lang.Integer r2 = X.C18280x3.A0S()
            if (r0 == 0) goto L_0x03f7
            java.lang.String r1 = "IN_REVIEW"
            X.2na r0 = r3.A09
            java.lang.String r0 = r0.A00()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0412
            X.4UC r0 = r3.A0B
            java.lang.Integer r2 = X.C18290x4.A0a()
        L_0x03f3:
            r0.A0H(r2)
            return
        L_0x03f7:
            X.2na r0 = r3.A09
            X.33p r0 = r0.A04
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "support_ban_appeal_token"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            boolean r0 = X.C18320x8.A1U(r0)
            if (r0 != 0) goto L_0x0412
            X.08M r1 = r3.A01
            r0 = -2
            X.C06270Wx.A03(r1, r0)
            return
        L_0x0412:
            X.4UC r0 = r3.A0B
            goto L_0x03f3
        L_0x0415:
            java.lang.Object r0 = r12.A00
            com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment r0 = (com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment) r0
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r2 = r0.A01
            goto L_0x0422
        L_0x041c:
            java.lang.Object r0 = r12.A00
            com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment r0 = (com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment) r0
            com.whatsapp.userban.ui.viewmodel.BanAppealViewModel r2 = r0.A01
        L_0x0422:
            X.03q r1 = r0.A0R()
            r0 = 0
            r2.A0G(r1, r0)
            return
        L_0x042b:
            java.lang.Object r1 = r12.A00
            X.53V r1 = (X.AnonymousClass53V) r1
            boolean r0 = r1.A00
            r0 = r0 ^ 1
            r1.A00 = r0
            X.4GQ r1 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r0)
            return
        L_0x043f:
            java.lang.Object r0 = r12.A00
            X.53d r0 = (X.C987653d) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A05
            goto L_0x04a5
        L_0x0446:
            java.lang.Object r0 = r12.A00
            X.53f r0 = (X.C987853f) r0
            X.0Th r0 = r0.A04
            goto L_0x0473
        L_0x044d:
            java.lang.Object r0 = r12.A00
            X.53f r0 = (X.C987853f) r0
            X.0Th r0 = r0.A05
            goto L_0x0473
        L_0x0454:
            java.lang.Object r0 = r12.A00
            X.53f r0 = (X.C987853f) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A0A
            r0.A1K()
            return
        L_0x045e:
            java.lang.Object r0 = r12.A00
            X.53f r0 = (X.C987853f) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A0A
            goto L_0x047d
        L_0x0465:
            java.lang.Object r0 = r12.A00
            X.53f r0 = (X.C987853f) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A0A
            r0.A1L()
            return
        L_0x046f:
            java.lang.Object r0 = r12.A00
            X.0Th r0 = (X.C05430Th) r0
        L_0x0473:
            r0.A00()
            return
        L_0x0477:
            java.lang.Object r0 = r12.A00
            X.53I r0 = (X.AnonymousClass53I) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A06
        L_0x047d:
            r0.A1J()
            return
        L_0x0481:
            java.lang.Object r0 = r12.A00
            X.53I r0 = (X.AnonymousClass53I) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A06
            r0.A1I()
            return
        L_0x048b:
            java.lang.Object r0 = r12.A00
            X.53J r0 = (X.AnonymousClass53J) r0
            X.66a r0 = r0.A08
            r0.BWq()
            return
        L_0x0495:
            java.lang.Object r0 = r12.A00
            X.53J r0 = (X.AnonymousClass53J) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A07
            r0.A1N()
            return
        L_0x049f:
            java.lang.Object r0 = r12.A00
            X.53J r0 = (X.AnonymousClass53J) r0
            com.whatsapp.updates.ui.UpdatesFragment r0 = r0.A07
        L_0x04a5:
            r0.A1M()
            return
        L_0x04a9:
            java.lang.Object r0 = r12.A00
            X.53Z r0 = (X.AnonymousClass53Z) r0
            com.whatsapp.updates.ui.UpdatesFragment r1 = r0.A05
            r0 = 1
            goto L_0x04b8
        L_0x04b1:
            java.lang.Object r0 = r12.A00
            X.53Z r0 = (X.AnonymousClass53Z) r0
            com.whatsapp.updates.ui.UpdatesFragment r1 = r0.A05
            r0 = 6
        L_0x04b8:
            r1.A1Q(r0)
            return
        L_0x04bc:
            java.lang.Object r0 = r12.A00
            X.8pf r0 = (X.C183208pf) r0
            X.AnonymousClass52i.A00(r0)
            return
        L_0x04c4:
            java.lang.Object r0 = r12.A00
            X.8pf r0 = (X.C183208pf) r0
            X.AnonymousClass52i.A00(r0)
            return
        L_0x04cc:
            java.lang.Object r0 = r12.A00
            X.8pf r0 = (X.C183208pf) r0
            X.AnonymousClass52i.A00(r0)
            return
        L_0x04d4:
            java.lang.Object r0 = r12.A00
            X.8pf r0 = (X.C183208pf) r0
            X.AnonymousClass52i.A00(r0)
            return
        L_0x04dc:
            X.C06270Wx.A03(r3, r2)
            X.2na r5 = r4.A09
            X.4KV r6 = new X.4KV
            r6.<init>(r4, r2)
            X.33p r0 = r5.A04
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "support_ban_appeal_token"
            java.lang.String r8 = X.C18280x3.A0Z(r1, r0)
            if (r8 != 0) goto L_0x04fc
            java.lang.Integer r0 = X.C18290x4.A0a()
            r6.BSq(r0)
            return
        L_0x04fc:
            X.4FS r0 = r5.A06
            r9 = 9
            X.3aa r4 = new X.3aa
            r4.<init>(r5, r6, r7, r8, r9)
            r0.BkM(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109395eY.onClick(android.view.View):void");
    }
}
