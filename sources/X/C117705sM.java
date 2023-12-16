package X;

import com.whatsapp.R;

/* renamed from: X.5sM  reason: invalid class name and case insensitive filesystem */
public class C117705sM implements Runnable {
    public int A00;
    public Object A01;
    public final int A02;

    public C117705sM(C993355i r2, int i, int i2) {
        this.A02 = i2;
        if (42 - i2 != 0) {
            this.A01 = r2;
            this.A00 = R.string.f11nameremoved;
            return;
        }
        this.A01 = r2;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:364:0x079b, code lost:
        if (r5.callState == com.whatsapp.voipcalling.CallState.CALLING) goto L_0x079e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r2 = r18
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x070e;
                case 1: goto L_0x06d1;
                case 2: goto L_0x06c7;
                case 3: goto L_0x06bb;
                case 4: goto L_0x06b1;
                case 5: goto L_0x025a;
                case 6: goto L_0x0233;
                case 7: goto L_0x06a6;
                case 8: goto L_0x0692;
                case 9: goto L_0x05e1;
                case 10: goto L_0x05b8;
                case 11: goto L_0x0560;
                case 12: goto L_0x01d8;
                case 13: goto L_0x0199;
                case 14: goto L_0x0556;
                case 15: goto L_0x054a;
                case 16: goto L_0x0516;
                case 17: goto L_0x0103;
                case 18: goto L_0x04ab;
                case 19: goto L_0x00f6;
                case 20: goto L_0x04a1;
                case 21: goto L_0x00e4;
                case 22: goto L_0x0497;
                case 23: goto L_0x00b5;
                case 24: goto L_0x0078;
                case 25: goto L_0x0489;
                case 26: goto L_0x047c;
                case 27: goto L_0x0470;
                case 28: goto L_0x0007;
                case 29: goto L_0x0007;
                case 30: goto L_0x0007;
                case 31: goto L_0x045a;
                case 32: goto L_0x0065;
                case 33: goto L_0x0446;
                case 34: goto L_0x0418;
                case 35: goto L_0x0023;
                case 36: goto L_0x03a8;
                case 37: goto L_0x0391;
                case 38: goto L_0x0011;
                case 39: goto L_0x0376;
                case 40: goto L_0x0309;
                case 41: goto L_0x02f6;
                case 42: goto L_0x02e9;
                case 43: goto L_0x02db;
                case 44: goto L_0x02d1;
                case 45: goto L_0x02c5;
                case 46: goto L_0x0283;
                case 47: goto L_0x0279;
                case 48: goto L_0x026d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r2.A01
            X.4A0 r1 = (X.AnonymousClass4A0) r1
            int r0 = r2.A00
            r1.onError(r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r2.A01
            X.5n8 r0 = (X.C114495n8) r0
            int r2 = r2.A00
            X.667 r1 = r0.A01
            if (r1 == 0) goto L_0x0010
            X.2nU r0 = r0.A06
            com.whatsapp.jid.UserJid r0 = r0.A03
            r1.BSp(r0, r2)
            return
        L_0x0023:
            java.lang.Object r0 = r2.A01
            X.4u8 r0 = (X.C95674u8) r0
            int r1 = r2.A00
            X.5TS r7 = r0.A00
            r0 = 400(0x190, float:5.6E-43)
            r6 = 3088(0xc10, float:4.327E-42)
            r5 = 0
            if (r1 == r0) goto L_0x0718
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0718
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0718
            r0 = 406(0x196, float:5.69E-43)
            if (r1 != r0) goto L_0x0010
            X.3Mh r1 = r7.A04
            X.1Ek r0 = X.C66663Mh.A1v
            int r4 = r1.A03(r0)
            X.3Wi r3 = r7.A03
            X.33j r2 = r7.A08
            X.1VX r0 = r7.A0B
            boolean r1 = r0.A0X(r6)
            r0 = 2131755341(0x7f10014d, float:1.9141559E38)
            if (r1 == 0) goto L_0x0058
            r0 = 2131755146(0x7f10008a, float:1.9141163E38)
        L_0x0058:
            java.lang.String r0 = X.C86604Kt.A0p(r2, r4, r0)
            r3.A0P(r0, r5)
            X.33S r0 = r7.A0F
            r0.A05(r5)
            return
        L_0x0065:
            java.lang.Object r3 = r2.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r3 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r3
            int r1 = r2.A00
            X.8v5 r0 = r3.A0L
            if (r0 == 0) goto L_0x0010
            X.8ug r0 = r0.Bhe(r1)
            if (r0 == 0) goto L_0x0010
            monitor-enter(r3)
            goto L_0x072c
        L_0x0078:
            java.lang.Object r0 = r2.A01
            X.4Wq r0 = (X.C87924Wq) r0
            int r5 = r2.A00
            X.4Uf r4 = r0.A02
            X.08M r3 = r4.A01
            java.lang.Object r1 = r3.A07()
            X.5Pc r1 = (X.C103965Pc) r1
            if (r1 == 0) goto L_0x0010
            java.util.LinkedList r2 = r1.A00
            int r0 = X.C86664Kz.A0M(r2)
            if (r5 > r0) goto L_0x0010
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x00b3
            int r0 = X.C86664Kz.A0M(r2)
        L_0x009c:
            if (r5 != r0) goto L_0x073f
            int r0 = r4.A00
            int r2 = r0 + 1
            X.107 r1 = r4.A02
            int r0 = X.C86614Ku.A06(r1)
            int r2 = r2 % r0
            r4.A00 = r2
            java.lang.Object r0 = X.C86634Kw.A0w(r1, r2)
            r3.A0H(r0)
            return
        L_0x00b3:
            r0 = -1
            goto L_0x009c
        L_0x00b5:
            java.lang.Object r3 = r2.A01
            X.32x r3 = (X.C619532x) r3
            int r1 = r2.A00
            X.2ng r2 = r3.A00
            if (r2 == 0) goto L_0x0010
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0010
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = "onSearchTermChanged"
            X.1Zg r1 = r3.A01(r0)
            if (r1 == 0) goto L_0x0010
            java.lang.Integer r0 = X.C18290x4.A0d()
            r1.A02 = r0
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.4FV r0 = r3.A01
            r0.BhD(r1)
            r0 = 1
            r2.A01 = r0
            return
        L_0x00e4:
            java.lang.Object r3 = r2.A01
            X.3TC r3 = (X.AnonymousClass3TC) r3
            int r2 = r2.A00
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0010
            X.2Vm r1 = r3.A07
            X.2S3 r0 = r3.A00
            r1.A00(r0, r2)
            return
        L_0x00f6:
            java.lang.Object r4 = r2.A01
            X.4X4 r4 = (X.AnonymousClass4X4) r4
            int r1 = r2.A00
            X.8v5 r3 = r4.A00
            if (r3 == 0) goto L_0x0010
            monitor-enter(r3)
            goto L_0x0749
        L_0x0103:
            java.lang.Object r6 = r2.A01
            X.5b3 r6 = (X.C107285b3) r6
            int r7 = r2.A00
            com.whatsapp.voipcalling.CallInfo r5 = X.C627436k.A02()
            if (r5 == 0) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/service/signal_thread/end_call/"
            r1.append(r0)
            int r0 = r6.A3M
            X.C18260x0.A1G(r1, r0)
            r2 = 1
            if (r7 != r2) goto L_0x0773
            java.lang.Integer r0 = r6.A0j
            if (r0 == 0) goto L_0x077a
            long r8 = r0.longValue()
            r3 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x077a
            boolean r0 = r5.isCaller
            if (r0 == 0) goto L_0x077a
            com.whatsapp.voipcalling.CallState r1 = r5.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x077a
            long r3 = r5.callDuration
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x077a
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.A08
            long r8 = r8 - r0
            r3 = 8000(0x1f40, double:3.9525E-320)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x077a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.A0n = r0
            android.content.Context r7 = r6.A1W
            r5 = 2131895249(0x7f1223d1, float:1.9425326E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r3 = 0
            com.whatsapp.jid.UserJid r1 = com.whatsapp.voipcalling.Voip.getPeerJid()
            if (r1 != 0) goto L_0x018c
            java.lang.String r0 = "voip/getPeerDisplayNameShort/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x0165:
            java.lang.String r3 = X.AnonymousClass002.A0F(r7, r0, r4, r3, r5)
            X.1iO r0 = r6.A1a
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            r9 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            r12 = r9
            r11 = r9
            android.content.Intent r1 = X.C627736r.A0o(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "com.whatsapp.intent.action.SHOW_END_CALL_CONFIRMATION"
            r1.setAction(r0)
            java.lang.String r0 = "confirmationString"
            r1.putExtra(r0, r3)
            r7.startActivity(r1)
            return
        L_0x018c:
            X.3Ex r0 = r6.A2O
            X.3ZH r1 = r0.A0A(r1)
            X.5ZU r0 = r6.A2Q
            java.lang.String r0 = X.C18300x5.A0h(r0, r1)
            goto L_0x0165
        L_0x0199:
            java.lang.Object r5 = r2.A01
            X.5pi r5 = (X.C116085pi) r5
            int r6 = r2.A00
            int r2 = r5.A00
            if (r2 == r6) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/audio_route/changeAudioRoute: change audioRoute "
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.A05(r2)
            r1.append(r0)
            java.lang.String r0 = " -> "
            r1.append(r0)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.A05(r6)
            X.C18260x0.A1L(r1, r0)
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r3 = 3
            r2 = 1
            if (r6 == 0) goto L_0x07a8
            if (r6 == r2) goto L_0x07a4
            r0 = 2
            if (r6 == r0) goto L_0x07a8
            if (r6 == r3) goto L_0x07a0
            r0 = 4
            if (r6 == r0) goto L_0x07a8
            java.lang.String r1 = "UNKNOWN AudioRoute"
            r0 = 0
            X.C626936e.A0D(r0, r1)
            return
        L_0x01d8:
            int r3 = r2.A00
            java.lang.Object r0 = r2.A01
            X.2hw r0 = (X.C50292hw) r0
            r1 = 1
            X.C162457s7.A0J(r0, r1)
            if (r3 != r1) goto L_0x0010
            X.33g r5 = r0.A01
            X.56I r0 = r5.A0A
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            X.1RI r0 = r0.A00
            X.4GK r4 = r0.get()
            java.lang.String r3 = "SELECT jid FROM wa_biz_profiles WHERE automated_type = ?"
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x07c8 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x07c8 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x07c8 }
            java.lang.String r0 = "GET_BUSINESS_JIDS_BY_AUTOMATED_TYPE"
            android.database.Cursor r2 = X.AnonymousClass361.A0A(r4, r3, r0, r2)     // Catch:{ all -> 0x07c8 }
        L_0x0203:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x07bc }
            if (r0 == 0) goto L_0x0219
            java.lang.String r0 = "jid"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x07bc }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)     // Catch:{ all -> 0x07bc }
            if (r0 == 0) goto L_0x0203
            r6.add(r0)     // Catch:{ all -> 0x07bc }
            goto L_0x0203
        L_0x0219:
            r2.close()     // Catch:{ all -> 0x07c8 }
            r4.close()
            java.util.Iterator r2 = r6.iterator()
        L_0x0223:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0010
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.3Lv r0 = r5.A0D
            r0.A0M(r1)
            goto L_0x0223
        L_0x0233:
            java.lang.Object r9 = r2.A01
            X.5LC r9 = (X.AnonymousClass5LC) r9
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x0010
            X.8qV r0 = r9.A05
            long r1 = r0.now()
            X.2bs r0 = r9.A06
            java.util.List r11 = r9.A0A
            r0.A00(r11)
            X.5U3 r10 = r9.A08
            r10.A04(r11, r1)
            java.util.List r8 = r9.A0B
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0901
            X.7Br r7 = r9.A07
            monitor-enter(r7)
            goto L_0x07d2
        L_0x025a:
            java.lang.Object r3 = r2.A01
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            int r2 = r2.A00
            java.lang.ref.WeakReference r0 = r3.A0E
            android.view.View r1 = X.C86664Kz.A0j(r0)
            if (r1 == 0) goto L_0x0010
            r0 = 0
            r3.A0M(r1, r2, r0)
            return
        L_0x026d:
            java.lang.Object r1 = r2.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r0 = r2.A00
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            r1.setAnimation((int) r0)
            return
        L_0x0279:
            java.lang.Object r1 = r2.A01
            X.0R6 r1 = (X.AnonymousClass0R6) r1
            int r0 = r2.A00
            r1.A06(r0)
            return
        L_0x0283:
            java.lang.Object r5 = r2.A01
            X.2po r5 = (X.C55112po) r5
            int r6 = r2.A00
            X.1bP r4 = r5.A00(r6)
            X.2rI r0 = r5.A04
            X.8qC r3 = r0.A02
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r3)
            java.lang.String r2 = "/export/isDonor"
            r1 = 0
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto L_0x02a2
            r0 = 13
            if (r6 != r0) goto L_0x02b0
        L_0x02a2:
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r3)
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 != 0) goto L_0x02c1
            r0 = 15
            if (r6 == r0) goto L_0x02c1
        L_0x02b0:
            monitor-enter(r5)
            X.33M r2 = r5.A07     // Catch:{ all -> 0x02bd }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x02bd }
            r2.A00 = r0     // Catch:{ all -> 0x02bd }
            r2.A09()     // Catch:{ all -> 0x02bd }
            goto L_0x02c0
        L_0x02bd:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x02c0:
            monitor-exit(r5)
        L_0x02c1:
            r5.A03(r4)
            return
        L_0x02c5:
            java.lang.Object r0 = r2.A01
            com.whatsapp.migration.android.integration.service.GoogleMigrateService r0 = (com.whatsapp.migration.android.integration.service.GoogleMigrateService) r0
            int r1 = r2.A00
            X.35p r0 = r0.A02
            r0.A0E(r1)
            return
        L_0x02d1:
            java.lang.Object r1 = r2.A01
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            int r0 = r2.A00
            r1.A1h(r0)
            return
        L_0x02db:
            java.lang.Object r0 = r2.A01
            X.55i r0 = (X.C993355i) r0
            r2 = 2131893800(0x7f121e28, float:1.9422387E38)
            r1 = 0
            X.3Wi r0 = r0.A05
            r0.A0H(r2, r1)
            return
        L_0x02e9:
            java.lang.Object r0 = r2.A01
            X.55i r0 = (X.C993355i) r0
            int r2 = r2.A00
            r1 = 0
            X.3Wi r0 = r0.A05
            r0.A0F(r2, r1)
            return
        L_0x02f6:
            java.lang.Object r0 = r2.A01
            X.4Z9 r0 = (X.AnonymousClass4Z9) r0
            int r4 = r2.A00
            X.4Wu r3 = r0.A05
            boolean[] r2 = r3.A02
            int r1 = r4 + -1
            r0 = 0
            r2[r1] = r0
            r3.A06(r4)
            return
        L_0x0309:
            java.lang.Object r8 = r2.A01
            X.4Z9 r8 = (X.AnonymousClass4Z9) r8
            int r9 = r2.A00
            X.4Wu r4 = r8.A05
            X.5Y7 r1 = r4.A09
            int r0 = r1.A01
            androidx.recyclerview.widget.RecyclerView r7 = r1.A0P
            X.0Ua r1 = r7.A0F(r0)
            X.4Z9 r1 = (X.AnonymousClass4Z9) r1
            r2 = 100
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            if (r1 == 0) goto L_0x0372
            com.whatsapp.components.SelectionCheckView r0 = r1.A04
            r0.A04()
            android.view.View r0 = r1.A00
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = X.C86634Kw.A0P(r0, r6)
            X.C86634Kw.A1E(r0, r2)
        L_0x0336:
            java.util.List r0 = X.C106315Ym.A00
            int r1 = r0.size()
            if (r9 <= 0) goto L_0x0368
            int r0 = r1 / 2
            if (r9 >= r0) goto L_0x0368
            int r9 = r9 + -1
        L_0x0344:
            r7.A0a(r9)
            com.whatsapp.components.SelectionCheckView r0 = r8.A04
            r0.setScaleX(r6)
            r0.setScaleY(r6)
            r0.A03()
            android.view.View r0 = r8.A00
            android.view.ViewPropertyAnimator r1 = r0.animate()
            float r0 = r4.A05
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r0)
            float r0 = r4.A04
            android.view.ViewPropertyAnimator r0 = r1.scaleY(r0)
            X.C86634Kw.A1E(r0, r2)
            return
        L_0x0368:
            int r0 = r1 / 2
            if (r9 <= r0) goto L_0x0344
            int r1 = r1 - r5
            if (r9 >= r1) goto L_0x0344
            int r9 = r9 + 1
            goto L_0x0344
        L_0x0372:
            r4.A06(r0)
            goto L_0x0336
        L_0x0376:
            java.lang.Object r1 = r2.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r1 = (com.whatsapp.mediacomposer.MediaComposerActivity) r1
            int r5 = r2.A00
            X.5Tg r0 = r1.A1J
            r4 = 0
            X.3Wi r3 = r0.A00
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131755396(0x7f100184, float:1.914167E38)
            r1 = 1
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r2, r5, r4, r0)
            r3.A0P(r0, r1)
            return
        L_0x0391:
            java.lang.Object r0 = r2.A01
            X.3Sk r0 = (X.C68243Sk) r0
            int r3 = r2.A00
            X.2OG r2 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onError, errorCode="
            X.C18260x0.A0x(r0, r1, r3)
            X.4ER r0 = r2.A00
            r0.BOq(r3)
            return
        L_0x03a8:
            java.lang.Object r4 = r2.A01
            X.2zZ r4 = (X.C61022zZ) r4
            int r1 = r2.A00
            X.4ea r0 = r4.A00
            r0.BjL()
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x03f0
            r0 = 401(0x191, float:5.62E-43)
            r5 = 0
            if (r1 == r0) goto L_0x03e2
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x03dc
            r0 = 530(0x212, float:7.43E-43)
            if (r1 == r0) goto L_0x03f9
            X.4ea r5 = r4.A00
            r7 = 2131894605(0x7f12214d, float:1.942402E38)
            r8 = 2131894604(0x7f12214c, float:1.9424017E38)
            r9 = 2131889796(0x7f120e84, float:1.9414266E38)
            r10 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 1
            X.90o r6 = new X.90o
            r6.<init>(r4, r0)
            r5.A6Y(r6, r7, r8, r9, r10)
            return
        L_0x03dc:
            X.4ea r2 = r4.A00
            r0 = 2131894603(0x7f12214b, float:1.9424015E38)
            goto L_0x03f5
        L_0x03e2:
            r3 = 2131887942(0x7f120746, float:1.9410505E38)
            X.4ea r2 = r4.A00
            r1 = 2131887938(0x7f120742, float:1.9410497E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r2.Box(r0, r1, r3)
            goto L_0x0412
        L_0x03f0:
            X.4ea r2 = r4.A00
            r0 = 2131894602(0x7f12214a, float:1.9424013E38)
        L_0x03f5:
            r2.Bot(r0)
            goto L_0x0412
        L_0x03f9:
            java.lang.String r3 = r4.A0A
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            X.4ea r2 = r4.A00
            r0 = 2131887967(0x7f12075f, float:1.9410556E38)
            if (r1 != 0) goto L_0x03f5
            r1 = 2131887966(0x7f12075e, float:1.9410554E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            r0[r5] = r3
            r2.Box(r0, r5, r1)
        L_0x0412:
            java.lang.Runnable r0 = r4.A09
            r0.run()
            return
        L_0x0418:
            java.lang.Object r5 = r2.A01
            com.whatsapp.group.GroupChatInfoActivity r5 = (com.whatsapp.group.GroupChatInfoActivity) r5
            int r2 = r2.A00
            X.1fJ r0 = r5.A1i
            if (r0 != 0) goto L_0x042e
            X.2so r1 = r5.A0m
            X.1fJ r0 = r5.A7G()
            X.1fJ r0 = r1.A01(r0)
            r5.A1i = r0
        L_0x042e:
            X.3Wi r1 = r5.A05
            X.0GC r4 = X.AnonymousClass0GC.RESUMED
            r0 = 33
            X.5sM r3 = new X.5sM
            r3.<init>((java.lang.Object) r5, (int) r2, (int) r0)
            android.os.Handler r2 = r1.A02
            r1 = 15
            X.8Mj r0 = new X.8Mj
            r0.<init>(r5, r4, r3, r1)
            r2.post(r0)
            return
        L_0x0446:
            java.lang.Object r0 = r2.A01
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            int r5 = r2.A00
            com.whatsapp.group.view.custom.GroupDetailsCard r1 = r0.A1c
            boolean r6 = r0.A2C
            X.3ZH r2 = r0.A19
            com.whatsapp.group.GroupCallButtonController r3 = r0.A1L
            X.1fJ r4 = r0.A1i
            r1.A06(r2, r3, r4, r5, r6)
            return
        L_0x045a:
            java.lang.Object r1 = r2.A01
            X.3Mn r1 = (X.C66723Mn) r1
            int r4 = r2.A00
            X.8qC r0 = r1.A07
            java.lang.Object r3 = r0.get()
            X.4Ct r3 = (X.C84544Ct) r3
            X.2rX r2 = r1.A02
            r1 = 0
            r0 = 1
            r3.BlG(r2, r4, r1, r0)
            return
        L_0x0470:
            java.lang.Object r0 = r2.A01
            X.3TZ r0 = (X.AnonymousClass3TZ) r0
            int r1 = r2.A00
            X.2ah r0 = r0.A05
            r0.A00(r1)
            return
        L_0x047c:
            java.lang.Object r0 = r2.A01
            X.5Tj r0 = (X.C105045Tj) r0
            int r2 = r2.A00
            X.5WX r1 = r0.A03
            r0 = 0
            r1.A00(r2, r0)
            return
        L_0x0489:
            java.lang.Object r0 = r2.A01
            X.69r r0 = (X.C1237669r) r0
            int r1 = r2.A00
            java.lang.Object r0 = r0.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            r0.A1b(r1)
            return
        L_0x0497:
            java.lang.Object r1 = r2.A01
            com.whatsapp.companionmode.registration.CompanionBootstrapActivity r1 = (com.whatsapp.companionmode.registration.CompanionBootstrapActivity) r1
            int r0 = r2.A00
            r1.A74(r0)
            return
        L_0x04a1:
            java.lang.Object r1 = r2.A01
            android.view.View r1 = (android.view.View) r1
            int r0 = r2.A00
            r1.setVisibility(r0)
            return
        L_0x04ab:
            java.lang.Object r3 = r2.A01
            X.68l r3 = (X.C1234468l) r3
            int r5 = r2.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cameraui/error "
            X.C18260x0.A0z(r0, r1, r5)
            java.lang.Object r4 = r3.A00
            X.5ZS r4 = (X.AnonymousClass5ZS) r4
            X.5TW r2 = r4.A0e
            boolean r0 = r2.A04()
            if (r0 == 0) goto L_0x04d5
            X.3Wi r2 = r4.A0b
            r1 = 2131889072(0x7f120bb0, float:1.9412797E38)
            r0 = 1
            r2.A0H(r1, r0)
        L_0x04cf:
            X.8sw r0 = r4.A11
            r0.BOE()
            return
        L_0x04d5:
            r0 = 2
            if (r5 == r0) goto L_0x04cf
            X.5O5 r0 = r4.A0h
            X.5ZR r1 = r0.A01
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = r1.A02(r0)
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r3 = 1
            if (r0 != 0) goto L_0x04f7
            java.lang.String r0 = "cameraui/no-camera-permission"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3Wi r2 = r4.A0b
            r1 = 2131887454(0x7f12055e, float:1.9409516E38)
        L_0x04f3:
            r2.A0H(r1, r3)
            goto L_0x04cf
        L_0x04f7:
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0503
            X.3Wi r2 = r4.A0b
            r1 = 2131889131(0x7f120beb, float:1.9412917E38)
            goto L_0x04f3
        L_0x0503:
            r0 = 3
            X.3Wi r2 = r4.A0b
            if (r5 != r0) goto L_0x050c
            r1 = 2131892560(0x7f121950, float:1.9419872E38)
            goto L_0x04f3
        L_0x050c:
            r0 = 4
            r1 = 2131887453(0x7f12055d, float:1.9409514E38)
            if (r5 != r0) goto L_0x04f3
            r1 = 2131895021(0x7f1222ed, float:1.9424863E38)
            goto L_0x04f3
        L_0x0516:
            java.lang.Object r4 = r2.A01
            X.5Uk r4 = (X.C105315Uk) r4
            int r3 = r2.A00
            r2 = 5
            if (r3 != r2) goto L_0x0526
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A0I
            boolean r0 = r0.A0d
            if (r0 != 0) goto L_0x0526
            return
        L_0x0526:
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x053b
            r4.A02 = r3
            X.7XV r1 = r4.A0H
            android.view.View r0 = r4.A0D
            r1.A03(r0, r3)
            boolean r0 = X.AnonymousClass001.A1X(r3, r2)
            r4.A07(r0)
            return
        L_0x053b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallControlBottomSheetBehaviorController setBottomSheetState "
            X.C18260x0.A0y(r0, r1, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A0I
            r0.A0S(r3)
            return
        L_0x054a:
            java.lang.Object r0 = r2.A01
            X.4j9 r0 = (X.C91234j9) r0
            int r1 = r2.A00
            com.whatsapp.WaImageView r0 = r0.A0M
            X.AnonymousClass5AH.A00(r0, r1)
            return
        L_0x0556:
            java.lang.Object r1 = r2.A01
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            int r0 = r2.A00
            r1.A1R(r0)
            return
        L_0x0560:
            java.lang.Object r4 = r2.A01
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r4 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r4
            int r3 = r2.A00
            X.3Wi r0 = r4.A04
            r0.A0D()
            r2 = 405(0x195, float:5.68E-43)
            r0 = 2131894527(0x7f1220ff, float:1.9423861E38)
            if (r3 != r2) goto L_0x0575
            r0 = 2131894498(0x7f1220e2, float:1.9423802E38)
        L_0x0575:
            X.0zH r1 = X.C18320x8.A0H(r4)
            r1.A0T(r0)
            if (r3 != r2) goto L_0x0584
            r0 = 2131894499(0x7f1220e3, float:1.9423804E38)
            r1.A0U(r0)
        L_0x0584:
            X.043 r3 = r1.create()
            r1 = 2131893203(0x7f121bd3, float:1.9421176E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r4)
            java.lang.String r2 = r0.getString(r1)
            r0 = 12
            X.90b r1 = new X.90b
            r1.<init>(r4, r0)
            r0 = -1
            r3.A03(r0, r2, r1)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r4)
            java.lang.String r2 = r0.getString(r1)
            r0 = 22
            X.4Hr r1 = new X.4Hr
            r1.<init>(r4, r0)
            r0 = -2
            r3.A03(r0, r2, r1)
            r3.show()
            return
        L_0x05b8:
            java.lang.Object r3 = r2.A01
            X.3P4 r3 = (X.AnonymousClass3P4) r3
            int r1 = r2.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x05d2
            switch(r1) {
                case 403: goto L_0x05c6;
                case 404: goto L_0x05cc;
                case 405: goto L_0x05d8;
                default: goto L_0x05c5;
            }
        L_0x05c5:
            return
        L_0x05c6:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r3.A00
            r0 = 2131894136(0x7f121f78, float:1.9423068E38)
            goto L_0x05dd
        L_0x05cc:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r3.A00
            r0 = 2131894137(0x7f121f79, float:1.942307E38)
            goto L_0x05dd
        L_0x05d2:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r3.A00
            r0 = 2131894135(0x7f121f77, float:1.9423066E38)
            goto L_0x05dd
        L_0x05d8:
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r1 = r3.A00
            r0 = 2131894138(0x7f121f7a, float:1.9423072E38)
        L_0x05dd:
            r1.A75(r0)
            return
        L_0x05e1:
            java.lang.Object r5 = r2.A01
            X.5K3 r5 = (X.AnonymousClass5K3) r5
            int r6 = r2.A00
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            X.3Ex r0 = r5.A01
            r0.A0h(r1)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r1.iterator()
        L_0x05f8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0619
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            boolean r0 = r1.A0U()
            if (r0 != 0) goto L_0x05f8
            X.4uZ r1 = r1.A0H
            boolean r0 = r1 instanceof X.C95804uY
            if (r0 != 0) goto L_0x05f8
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x05f8
            r7.add(r2)
            goto L_0x05f8
        L_0x0619:
            int r4 = r7.size()
            java.util.List r0 = X.C73723fy.A0J(r7, r6)
            r3 = 10
            java.util.ArrayList r2 = X.C73783g4.A0d(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x062b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0639
            X.4uZ r0 = X.C86604Kt.A0b(r1)
            r2.add(r0)
            goto L_0x062b
        L_0x0639:
            java.util.List r0 = X.C73723fy.A0I(r2, r3)
            java.util.Iterator r8 = r0.iterator()
        L_0x0641:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0684
            java.lang.Object r0 = r8.next()
            java.util.List r0 = (java.util.List) r0
            X.3S3 r7 = r5.A04
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x0657:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0679
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x0657
            boolean r0 = r1 instanceof X.AnonymousClass1fW
            if (r0 != 0) goto L_0x0657
            boolean r0 = r1 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x0657
            boolean r0 = r1 instanceof X.C28001fK
            if (r0 != 0) goto L_0x0657
            boolean r0 = r1 instanceof X.C95804uY
            if (r0 != 0) goto L_0x0657
            r3.add(r1)
            goto L_0x0657
        L_0x0679:
            X.4FS r1 = r7.A04
            X.1sr r0 = new X.1sr
            r0.<init>(r7, r3)
            X.C86614Ku.A1R(r0, r1)
            goto L_0x0641
        L_0x0684:
            X.3Wi r3 = r5.A00
            r0 = 0
            X.3aE r2 = new X.3aE
            r2.<init>(r5, r4, r6, r0)
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.A0T(r2, r0)
            return
        L_0x0692:
            java.lang.Object r0 = r2.A01
            X.4ZU r0 = (X.AnonymousClass4ZU) r0
            int r1 = r2.A00
            com.whatsapp.HomeActivity r0 = r0.A00
            X.8qC r0 = r0.A1Z
            java.lang.Object r0 = r0.get()
            X.2so r0 = (X.C56942so) r0
            r0.A06(r1)
            return
        L_0x06a6:
            java.lang.Object r3 = r2.A01
            X.3Wi r3 = (X.C69263Wi) r3
            int r1 = r2.A00
            r0 = 1
            r3.A0F(r1, r0)
            return
        L_0x06b1:
            java.lang.Object r1 = r2.A01
            X.4PF r1 = (X.AnonymousClass4PF) r1
            int r0 = r2.A00
            r1.A05(r0)
            return
        L_0x06bb:
            java.lang.Object r0 = r2.A01
            com.google.android.material.datepicker.MaterialCalendar r0 = (com.google.android.material.datepicker.MaterialCalendar) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A05
            int r0 = r2.A00
            r1.A0a(r0)
            return
        L_0x06c7:
            java.lang.Object r1 = r2.A01
            X.89A r1 = (X.AnonymousClass89A) r1
            int r0 = r2.A00
            r1.A05(r0)
            return
        L_0x06d1:
            java.lang.Object r0 = r2.A01
            X.7su r0 = (X.C162877su) r0
            int r3 = r2.A00
            X.7ZX r2 = r0.A01
            r1 = -3
            r0 = -2
            if (r3 == r1) goto L_0x0709
            if (r3 == r0) goto L_0x0703
            r0 = -1
            if (r3 == r0) goto L_0x06fc
            r0 = 1
            if (r3 == r0) goto L_0x06f5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown focus change type: "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r3)
            java.lang.String r0 = "AudioFocusManager"
            android.util.Log.w(r0, r1)
            return
        L_0x06f5:
            r2.A02(r0)
            r2.A01(r0)
            return
        L_0x06fc:
            r2.A01(r0)
            r2.A00()
            return
        L_0x0703:
            r0 = 0
            r2.A01(r0)
            r0 = 2
            goto L_0x070a
        L_0x0709:
            r0 = 3
        L_0x070a:
            r2.A02(r0)
            return
        L_0x070e:
            java.lang.Object r1 = r2.A01
            X.82V r1 = (X.AnonymousClass82V) r1
            int r0 = r2.A00
            X.AnonymousClass82V.A00(r1, r0)
            return
        L_0x0718:
            X.3Wi r2 = r7.A03
            X.1VX r0 = r7.A0B
            boolean r1 = r0.A0X(r6)
            r0 = 2131889882(0x7f120eda, float:1.941444E38)
            if (r1 == 0) goto L_0x0728
            r0 = 2131889874(0x7f120ed2, float:1.9414424E38)
        L_0x0728:
            r2.A0H(r0, r5)
            return
        L_0x072c:
            X.3Wi r2 = r3.A1J()     // Catch:{ all -> 0x073c }
            r1 = 31
            X.3Zl r0 = new X.3Zl     // Catch:{ all -> 0x073c }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x073c }
            r2.A0S(r0)     // Catch:{ all -> 0x073c }
            monitor-exit(r3)
            return
        L_0x073c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x073f:
            X.4UC r1 = r4.A03
            java.lang.Object r0 = r2.get(r5)
            r1.A0H(r0)
            return
        L_0x0749:
            X.8v5 r0 = r4.A00     // Catch:{ Exception -> 0x075d }
            X.8ug r0 = r0.Bhe(r1)     // Catch:{ Exception -> 0x075d }
            if (r0 == 0) goto L_0x076e
            X.3Wi r2 = r4.A02     // Catch:{ Exception -> 0x075d }
            r1 = 2
            X.3cI r0 = new X.3cI     // Catch:{ Exception -> 0x075d }
            r0.<init>((java.lang.Object) r4, (int) r1)     // Catch:{ Exception -> 0x075d }
            r2.A0S(r0)     // Catch:{ Exception -> 0x075d }
            goto L_0x076e
        L_0x075d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = "RecentMediaAdapter/refreshMediaElement/e"
            r1.append(r0)     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r2.getLocalizedMessage()     // Catch:{ all -> 0x0770 }
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x0770 }
        L_0x076e:
            monitor-exit(r3)     // Catch:{ all -> 0x0770 }
            return
        L_0x0770:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0770 }
            throw r0
        L_0x0773:
            r0 = 2
            if (r7 != r0) goto L_0x0793
            java.lang.Integer r0 = r6.A0n
            r6.A0k = r0
        L_0x077a:
            int r1 = r5.callLinkState
            if (r1 == r2) goto L_0x079e
            r0 = 2
            if (r1 == r0) goto L_0x079e
            r0 = 3
            if (r1 == r0) goto L_0x079e
            r0 = 32
            if (r7 != r0) goto L_0x078e
            com.whatsapp.voipcalling.CallState r1 = r5.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x079e
        L_0x078e:
            r0 = 1
        L_0x078f:
            com.whatsapp.voipcalling.Voip.endCall(r0)
            return
        L_0x0793:
            r0 = 25
            if (r7 != r0) goto L_0x077a
            com.whatsapp.voipcalling.CallState r1 = r5.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x079e
            goto L_0x077a
        L_0x079e:
            r0 = 0
            goto L_0x078f
        L_0x07a0:
            r5.A0B(r4, r2)
            return
        L_0x07a4:
            r5.A0C(r4, r2)
            return
        L_0x07a8:
            int r1 = r5.A00
            r0 = 0
            if (r1 != r2) goto L_0x07b1
            r5.A0C(r4, r0)
            return
        L_0x07b1:
            if (r1 != r3) goto L_0x07b7
            r5.A0B(r4, r0)
            return
        L_0x07b7:
            r0 = 0
            r5.A09(r4, r0)
            return
        L_0x07bc:
            r1 = move-exception
            if (r2 == 0) goto L_0x07c7
            r2.close()     // Catch:{ all -> 0x07c3 }
            goto L_0x07c7
        L_0x07c3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07c8 }
        L_0x07c7:
            throw r1     // Catch:{ all -> 0x07c8 }
        L_0x07c8:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x07cd }
            throw r1
        L_0x07cd:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x07d2:
            java.util.Map r6 = r7.A00     // Catch:{ all -> 0x08fe }
            java.util.Iterator r1 = X.C18280x3.A0i(r6)     // Catch:{ all -> 0x08fe }
        L_0x07d8:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x08fe }
            if (r0 == 0) goto L_0x07e8
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x08fe }
            X.7jE r0 = (X.C157977jE) r0     // Catch:{ all -> 0x08fe }
            r8.add(r0)     // Catch:{ all -> 0x08fe }
            goto L_0x07d8
        L_0x07e8:
            monitor-exit(r7)
            java.util.Iterator r17 = r8.iterator()
        L_0x07ed:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x08e6
            java.lang.Object r5 = r17.next()
            X.7jE r5 = (X.C157977jE) r5
            monitor-enter(r7)
            java.lang.Object r4 = r6.get(r5)     // Catch:{ all -> 0x08fe }
            X.5Z2 r4 = (X.AnonymousClass5Z2) r4     // Catch:{ all -> 0x08fe }
            if (r4 != 0) goto L_0x0804
            X.5Z2 r4 = X.AnonymousClass5Z2.A03     // Catch:{ all -> 0x08fe }
        L_0x0804:
            monitor-exit(r7)
            java.util.Iterator r16 = r11.iterator()
        L_0x0809:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x07ed
            java.lang.Object r1 = r16.next()
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            android.graphics.Rect r3 = r9.A03
            android.graphics.Rect r14 = r9.A02
            r0 = 2
            X.C162457s7.A0J(r1, r0)
            java.lang.ref.WeakReference r0 = r5.A00
            android.view.View r13 = X.C86664Kz.A0j(r0)
            if (r13 == 0) goto L_0x0809
            boolean r0 = r13.isShown()
            if (r0 != 0) goto L_0x0832
            r3.setEmpty()
            r14.setEmpty()
            goto L_0x0809
        L_0x0832:
            android.graphics.Point r15 = X.C155017e9.A00
            boolean r0 = r13.getGlobalVisibleRect(r3, r15)
            if (r0 == 0) goto L_0x08de
            boolean r0 = r3.intersect(r1)
            if (r0 == 0) goto L_0x08de
            int r12 = r15.x
            int r2 = r15.y
            int r1 = r13.getWidth()
            int r1 = r1 + r12
            int r0 = r15.y
            int r0 = X.C86664Kz.A0C(r13, r0)
            r14.set(r12, r2, r1, r0)
            X.5Z2 r13 = X.AnonymousClass5Z2.A03
            if (r4 == r13) goto L_0x0809
            java.util.Map r2 = r10.A04
            java.lang.String r15 = r4.A01
            java.lang.Object r12 = r2.get(r15)
            X.7MR r12 = (X.AnonymousClass7MR) r12
            X.5Vs r1 = r10.A02
            java.util.Set r0 = r1.A01
            boolean r0 = r0.add(r4)
            if (r0 == 0) goto L_0x087d
            java.util.Map r0 = r1.A00
            r0.remove(r15)
            if (r12 != 0) goto L_0x08d9
            long r0 = r10.A00
            X.7MR r12 = new X.7MR
            r12.<init>()
            r12.A00 = r0
            r2.put(r15, r12)
        L_0x087d:
            android.graphics.Rect r0 = r12.A02
            r0.set(r14)
            java.util.List r1 = r12.A03
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r3)
            r1.add(r0)
            X.5Z2 r12 = r4.A00
            if (r12 == r13) goto L_0x0809
            X.5Vs r1 = r10.A01
            java.util.Set r0 = r1.A01
            boolean r0 = r0.add(r12)
            if (r0 == 0) goto L_0x08d7
            java.util.Map r1 = r1.A00
            java.lang.String r0 = r12.A01
            r1.remove(r0)
            r0 = 1
        L_0x08a2:
            java.lang.String r13 = r12.A01
            java.lang.Object r12 = r2.get(r13)
            X.7MR r12 = (X.AnonymousClass7MR) r12
            if (r0 == 0) goto L_0x08b7
            if (r12 == 0) goto L_0x08c3
            java.util.List r0 = r12.A03
            r0.clear()
            X.6vb r0 = X.C141456vb.UPDATE
            r12.A01 = r0
        L_0x08b7:
            java.util.List r1 = r12.A03
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r3)
            r1.add(r0)
            goto L_0x0809
        L_0x08c3:
            long r0 = r10.A00
            X.7MR r12 = new X.7MR
            r12.<init>()
            r12.A00 = r0
            android.graphics.Rect r1 = r12.A02
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.set(r0, r0, r0, r0)
            r2.put(r13, r12)
            goto L_0x08b7
        L_0x08d7:
            r0 = 0
            goto L_0x08a2
        L_0x08d9:
            X.6vb r0 = X.C141456vb.UPDATE
            r12.A01 = r0
            goto L_0x087d
        L_0x08de:
            r14.setEmpty()
            r3.setEmpty()
            goto L_0x0809
        L_0x08e6:
            r10.A00()
            X.7RU r0 = r9.A00
            if (r0 == 0) goto L_0x08f0
            r0.A00()
        L_0x08f0:
            r8.clear()
            android.os.Handler r3 = r9.A04
            java.lang.Runnable r2 = r9.A09
            r0 = 100
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            return
        L_0x08fe:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0901:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117705sM.run():void");
    }

    public C117705sM(AnonymousClass5LC r2) {
        this.A02 = 6;
        this.A01 = r2;
        this.A00 = 100;
    }

    public C117705sM(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A00 = i;
        this.A01 = obj;
    }
}
