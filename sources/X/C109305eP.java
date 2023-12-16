package X;

import android.view.View;

/* renamed from: X.5eP  reason: invalid class name and case insensitive filesystem */
public class C109305eP implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109305eP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.5dz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.5dx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: X.5dz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: X.5dz} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0388, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x038b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        r1.A0H((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05c9, code lost:
        r1.A02 = r0;
        r2.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0618, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x061b, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x062c;
                case 1: goto L_0x0624;
                case 2: goto L_0x061c;
                case 3: goto L_0x0612;
                case 4: goto L_0x0608;
                case 5: goto L_0x05fe;
                case 6: goto L_0x05cf;
                case 7: goto L_0x05be;
                case 8: goto L_0x05b1;
                case 9: goto L_0x05a4;
                case 10: goto L_0x059d;
                case 11: goto L_0x0587;
                case 12: goto L_0x0571;
                case 13: goto L_0x0551;
                case 14: goto L_0x04f9;
                case 15: goto L_0x04c1;
                case 16: goto L_0x04aa;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x04a2;
                case 20: goto L_0x049a;
                case 21: goto L_0x048e;
                case 22: goto L_0x047a;
                case 23: goto L_0x046e;
                case 24: goto L_0x0276;
                case 25: goto L_0x0466;
                case 26: goto L_0x0436;
                case 27: goto L_0x0405;
                case 28: goto L_0x03c6;
                case 29: goto L_0x03b8;
                case 30: goto L_0x03b0;
                case 31: goto L_0x03a8;
                case 32: goto L_0x03a0;
                case 33: goto L_0x0396;
                case 34: goto L_0x038c;
                case 35: goto L_0x0377;
                case 36: goto L_0x0365;
                case 37: goto L_0x0353;
                case 38: goto L_0x0257;
                case 39: goto L_0x033f;
                case 40: goto L_0x02fe;
                case 41: goto L_0x02ec;
                case 42: goto L_0x00da;
                case 43: goto L_0x02e2;
                case 44: goto L_0x02cd;
                case 45: goto L_0x02b8;
                case 46: goto L_0x00b2;
                case 47: goto L_0x005b;
                case 48: goto L_0x004a;
                case 49: goto L_0x003d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A00
            X.6li r0 = (X.C136016li) r0
            X.8id r6 = r0.A01
            java.lang.String r5 = r0.A02
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r6 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r6
            int r0 = r6.A04
            if (r0 == 0) goto L_0x02b4
            X.5ZO r0 = r6.A0E()
            boolean r0 = X.C157167hq.A00(r0)
            if (r0 == 0) goto L_0x02b4
            X.5jW r4 = r6.A0W
            X.5LW r3 = r4.A0B
            java.util.List r2 = r3.A0J
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0038
            r1 = 0
            X.6lv r0 = new X.6lv
            r0.<init>(r1)
            r2.add(r0)
            r0 = 2
            r3.A03 = r0
            r4.A06()
        L_0x0038:
            r0 = 1
            r6.A0X(r5, r0)
        L_0x003c:
            return
        L_0x003d:
            java.lang.Object r0 = r9.A00
            X.7En r0 = (X.C147497En) r0
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r0.A00
            com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel r0 = r0.A0M
            if (r0 == 0) goto L_0x003c
            X.4UC r1 = r0.A08
            goto L_0x0056
        L_0x004a:
            java.lang.Object r0 = r9.A00
            X.7En r0 = (X.C147497En) r0
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r0.A00
            com.whatsapp.calling.callscreen.viewmodel.CallScreenViewModel r0 = r0.A0M
            if (r0 == 0) goto L_0x003c
            X.4UC r1 = r0.A07
        L_0x0056:
            r0 = 0
            r1.A0H(r0)
            return
        L_0x005b:
            java.lang.Object r0 = r9.A00
            X.6J6 r0 = (X.AnonymousClass6J6) r0
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r6 = r0.A00
            if (r6 == 0) goto L_0x003c
            android.content.Context r5 = r10.getContext()
            X.5Ml r0 = r6.A00
            if (r0 == 0) goto L_0x003c
            if (r5 == 0) goto L_0x003c
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            com.whatsapp.voipcalling.CallInfo r7 = r0.A7D()
            if (r7 == 0) goto L_0x0634
            X.1VX r3 = r6.A0D
            com.whatsapp.voipcalling.CallState r2 = r7.callState
            boolean r1 = r7.isGroupCall
            java.lang.String r0 = "options.enable_add_participant_while_calling_receiver"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A00(r0)
            boolean r0 = X.C627436k.A0M(r3, r2, r0, r1)
            if (r0 != 0) goto L_0x0634
            X.3Ex r1 = r6.A08
            com.whatsapp.jid.UserJid r0 = r7.getPeerJid()
            X.3ZH r4 = X.C64773Ex.A00(r1, r0)
            X.0zH r3 = X.AnonymousClass5V0.A00(r5)
            boolean r0 = r7.isGroupCall
            r2 = 2131895315(0x7f122413, float:1.942546E38)
            if (r0 == 0) goto L_0x009f
            r2 = 2131895314(0x7f122412, float:1.9425458E38)
        L_0x009f:
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.5ZU r0 = r6.A0B
            X.C18290x4.A1K(r0, r4, r1)
            X.C86624Kv.A0i(r5, r3, r1, r2)
            X.C19340zH.A06(r3)
            X.C18280x3.A0q(r3)
            return
        L_0x00b2:
            java.lang.Object r0 = r9.A00
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet r0 = (com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet) r0
            X.66R r0 = r0.A09
            java.lang.Object r7 = r0.getValue()
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r7 = (com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel) r7
            android.content.Context r6 = X.C18290x4.A0F(r10)
            X.3ZF r5 = r7.A00
            if (r5 == 0) goto L_0x003c
            r0 = 1
            r7.A02 = r0
            X.4C6 r4 = X.AnonymousClass0IV.A00(r7)
            X.3gB r3 = r7.A0J
            r2 = 0
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1 r1 = new com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1
            r1.<init>(r6, r7, r5, r2)
            r0 = 2
            X.C616131n.A02(r3, r1, r4, r2, r0)
            return
        L_0x00da:
            java.lang.Object r0 = r9.A00
            com.whatsapp.calling.callrating.CallRatingBottomSheet r0 = (com.whatsapp.calling.callrating.CallRatingBottomSheet) r0
            X.66R r0 = r0.A04
            com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel r4 = X.C86664Kz.A14(r0)
            com.whatsapp.fieldstats.events.WamCall r6 = r4.A04
            if (r6 == 0) goto L_0x003c
            X.107 r0 = r4.A0C
            java.lang.Object r0 = X.C86634Kw.A0v(r0)
            int r5 = X.AnonymousClass001.A0K(r0)
            r0 = -1
            if (r5 != r0) goto L_0x0243
            r2 = 0
        L_0x00f7:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.userRating = r0
            if (r0 == 0) goto L_0x023e
            long r7 = r0.longValue()
            r1 = 4
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x023e
            java.util.HashSet r0 = r4.A0E
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x023e
            java.util.ArrayList r5 = r4.A0D
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x022f
            X.58w r3 = X.C999658w.AUDIO
            r0 = 7
            X.7Y9[] r7 = new X.AnonymousClass7Y9[r0]
            X.58l r2 = X.C998558l.PROBLEM_AUDIO_NOT_CLEAR
            r0 = 2131886494(0x7f12019e, float:1.9407568E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 0
            r7[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_AUDIO_ROBOTIC_OR_DISTORTED
            r0 = 2131886500(0x7f1201a4, float:1.940758E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 1
            r7[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_AUDIO_ECHO
            r0 = 2131886485(0x7f120195, float:1.940755E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 2
            r7[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_AUDIO_TOO_SLOW
            r0 = 2131886502(0x7f1201a6, float:1.9407585E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 3
            r7[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_AUDIO_OTHERS_COULD_NOT_HEAR_ME
            r0 = 2131887213(0x7f12046d, float:1.9409027E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 4
            r7[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_AUDIO_I_COULD_NOT_HEAR_OTHERS
            r0 = 2131887211(0x7f12046b, float:1.9409023E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 5
            r7[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_AUDIO_BACKGROUND_OR_CRACKLING_NOISES
            r1 = 2131886484(0x7f120194, float:1.9407548E38)
            X.7Y9 r0 = new X.7Y9
            r0.<init>(r2, r1)
            r2 = 6
            r7[r2] = r0
            java.util.List r1 = X.AnonymousClass8UF.A0p(r7)
            java.util.Collections.shuffle(r1)
            X.5Rc r0 = new X.5Rc
            r0.<init>(r3, r1)
            r5.add(r0)
            java.lang.Boolean r0 = r6.videoEnabled
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)
            if (r0 == 0) goto L_0x01f4
            X.58w r3 = X.C999658w.VIDEO
            X.7Y9[] r6 = new X.AnonymousClass7Y9[r2]
            X.58l r2 = X.C998558l.PROBLEM_VIDEO_FROZE
            r0 = 2131895025(0x7f1222f1, float:1.9424871E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 0
            r6[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_VIDEO_BLURRY
            r0 = 2131895015(0x7f1222e7, float:1.9424851E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 1
            r6[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_VIDEO_OTHERS_COULD_NOT_SEE_ME
            r0 = 2131887395(0x7f120523, float:1.9409396E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 2
            r6[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_VIDEO_I_COULD_NOT_SEE_OTHERS
            r0 = 2131887393(0x7f120521, float:1.9409392E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 3
            r6[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_VIDEO_AND_AUDIO_NOT_MATCHING
            r0 = 2131895014(0x7f1222e6, float:1.942485E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 4
            r6[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_VIDEO_DISTORTED
            r0 = 2131895023(0x7f1222ef, float:1.9424867E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 5
            r6[r0] = r1
            java.util.List r1 = X.AnonymousClass8UF.A0p(r6)
            java.util.Collections.shuffle(r1)
            X.5Rc r0 = new X.5Rc
            r0.<init>(r3, r1)
            r5.add(r0)
            java.util.Collections.shuffle(r5)
        L_0x01f4:
            X.58w r3 = X.C999658w.OTHER
            r0 = 3
            X.7Y9[] r6 = new X.AnonymousClass7Y9[r0]
            X.58l r2 = X.C998558l.PROBLEM_OTHER_CALL_KEPT_DISCONNECTING
            r0 = 2131887244(0x7f12048c, float:1.940909E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 0
            r6[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_OTHER_CALL_SUDDENLY_ENDED
            r0 = 2131887391(0x7f12051f, float:1.9409388E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 1
            r6[r0] = r1
            X.58l r2 = X.C998558l.PROBLEM_OTHER_COULD_NOT_ANSWER_CALL
            r0 = 2131887237(0x7f120485, float:1.9409075E38)
            X.7Y9 r1 = new X.7Y9
            r1.<init>(r2, r0)
            r0 = 2
            r6[r0] = r1
            java.util.List r1 = X.AnonymousClass8UF.A0p(r6)
            java.util.Collections.shuffle(r1)
            X.5Rc r0 = new X.5Rc
            r0.<init>(r3, r1)
            r5.add(r0)
        L_0x022f:
            X.08M r1 = r4.A08
            X.6fw r0 = X.C132776fw.A00
            r1.A0H(r0)
            X.08M r1 = r4.A0A
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x023a:
            r1.A0H(r0)
            return
        L_0x023e:
            X.08M r1 = r4.A08
            X.6fu r0 = X.C132756fu.A00
            goto L_0x023a
        L_0x0243:
            int[] r3 = X.AnonymousClass5CY.A00
            int r2 = r3.length
            r1 = 0
        L_0x0247:
            if (r1 >= r2) goto L_0x0250
            r0 = r3[r1]
            if (r5 == r0) goto L_0x0251
            int r1 = r1 + 1
            goto L_0x0247
        L_0x0250:
            r1 = -1
        L_0x0251:
            long r2 = (long) r1
            r0 = 1
            long r2 = r2 + r0
            goto L_0x00f7
        L_0x0257:
            java.lang.Object r0 = r9.A00
            X.6Im r0 = (X.C125556Im) r0
            X.7D4 r0 = r0.A01
            if (r0 == 0) goto L_0x003c
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r3 = r0.A00
            android.content.Context r0 = r3.A0G()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.schedulecall.upcomingcalls.view.UpcomingScheduledCallsActivity"
            r2.setClassName(r1, r0)
            r3.A0m(r2)
            return
        L_0x0276:
            java.lang.Object r5 = r9.A00
            com.whatsapp.businessupsell.BusinessProfileEducation r5 = (com.whatsapp.businessupsell.BusinessProfileEducation) r5
            X.2X5 r1 = r5.A04
            java.lang.String r0 = "smb_cs_profile"
            android.content.Intent r0 = r1.A00(r0)
            r5.startActivity(r0)
            r0 = 2
            r5.A74(r0)
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r1 = "key_extra_verified_level"
            r0 = -1
            int r0 = r2.getIntExtra(r1, r0)
            r4 = 3
            boolean r0 = X.AnonymousClass000.A1U(r0, r4)
            if (r0 == 0) goto L_0x003c
            X.7SX r3 = r5.A02
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "key_extra_business_jid"
            java.lang.String r2 = r1.getStringExtra(r0)
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.Integer r1 = X.C18280x3.A0S()
            r0 = 6
            r3.A00(r1, r2, r4, r0)
            return
        L_0x02b4:
            r6.A0V(r5)
            return
        L_0x02b8:
            java.lang.Object r0 = r9.A00
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet r0 = (com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet) r0
            X.66R r0 = r0.A0A
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r2 = (com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel) r2
            android.content.Context r1 = X.C18290x4.A0F(r10)
            r0 = 1
            r2.A0D(r1, r0)
            return
        L_0x02cd:
            java.lang.Object r0 = r9.A00
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet r0 = (com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet) r0
            r2 = 0
            X.66R r0 = r0.A0A
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r1 = (com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel) r1
            android.content.Context r0 = X.C18290x4.A0F(r10)
            r1.A0D(r0, r2)
            return
        L_0x02e2:
            java.lang.Object r0 = r9.A00
            X.6Ie r0 = (X.C125476Ie) r0
            androidx.appcompat.widget.AppCompatCheckBox r0 = r0.A00
            r0.performClick()
            return
        L_0x02ec:
            java.lang.Object r0 = r9.A00
            com.whatsapp.calling.callrating.CallRatingBottomSheet r0 = (com.whatsapp.calling.callrating.CallRatingBottomSheet) r0
            X.66R r0 = r0.A04
            com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel r0 = X.C86664Kz.A14(r0)
            X.08M r1 = r0.A08
            X.6fu r0 = X.C132756fu.A00
            r1.A0H(r0)
            return
        L_0x02fe:
            java.lang.Object r5 = r9.A00
            com.whatsapp.calling.callrating.CallRatingActivity r5 = (com.whatsapp.calling.callrating.CallRatingActivity) r5
            android.widget.CompoundButton r10 = (android.widget.CompoundButton) r10
            java.lang.Object r4 = r10.getTag()
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x0325
            boolean r3 = r10.isChecked()
            r2 = 1
            java.lang.Integer r0 = r5.A0G
            int r1 = r0.intValue()
            int r0 = r4.intValue()
            int r2 = r2 << r0
            if (r3 == 0) goto L_0x033c
            r1 = r1 | r2
        L_0x031f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A0G = r0
        L_0x0325:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "callratingactivity/problems "
            r1.append(r0)
            java.lang.Integer r0 = r5.A0G
            int r0 = r0.intValue()
            java.lang.String r0 = java.lang.Integer.toBinaryString(r0)
            X.C18260x0.A1L(r1, r0)
            return
        L_0x033c:
            int r0 = ~r2
            r1 = r1 & r0
            goto L_0x031f
        L_0x033f:
            java.lang.Object r1 = r9.A00
            X.07r r1 = (X.C009707r) r1
            java.lang.Object r0 = r10.getTag()
            int r0 = X.AnonymousClass001.A0K(r0)
            android.view.View r0 = r1.findViewById(r0)
            r0.performClick()
            return
        L_0x0353:
            java.lang.Object r0 = r9.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r0 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r0
            X.2fa r2 = r0.A0C
            X.03q r1 = r0.A0R()
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r2.A01(r1, r0)
            return
        L_0x0365:
            java.lang.Object r3 = r9.A00
            X.4jE r3 = (X.C91254jE) r3
            X.5jj r2 = r3.A00
            if (r2 == 0) goto L_0x0374
            X.5MQ r1 = r3.A01
            r0 = 1
            r1.A00(r2, r3, r0)
            return
        L_0x0374:
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/videoCallButtonClicked call item is null"
            goto L_0x0388
        L_0x0377:
            java.lang.Object r3 = r9.A00
            X.4jE r3 = (X.C91254jE) r3
            r2 = 0
            X.5jj r1 = r3.A00
            if (r1 == 0) goto L_0x0386
            X.5MQ r0 = r3.A01
            r0.A00(r1, r3, r2)
            return
        L_0x0386:
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/voiceCallButtonClicked call item is null"
        L_0x0388:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x038c:
            java.lang.Object r0 = r9.A00
            com.whatsapp.contact.picker.SelectedContactsList r0 = (com.whatsapp.contact.picker.SelectedContactsList) r0
            X.66i r0 = r0.A08
            r0.Bb9()
            return
        L_0x0396:
            java.lang.Object r0 = r9.A00
            com.whatsapp.contact.picker.SelectedContactsList r0 = (com.whatsapp.contact.picker.SelectedContactsList) r0
            X.66i r0 = r0.A08
            r0.Bb8()
            return
        L_0x03a0:
            java.lang.Object r0 = r9.A00
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet r0 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet) r0
            r0.A7l()
            return
        L_0x03a8:
            java.lang.Object r0 = r9.A00
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r0 = (com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner) r0
            r0.A01()
            return
        L_0x03b0:
            java.lang.Object r0 = r9.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x03b8:
            java.lang.Object r0 = r9.A00
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r0.A09
            android.content.Context r0 = r10.getContext()
            r1.A0N(r0)
            return
        L_0x03c6:
            java.lang.Object r3 = r9.A00
            com.whatsapp.calling.callgrid.view.CallGrid r3 = (com.whatsapp.calling.callgrid.view.CallGrid) r3
            X.3XG r2 = r3.A0B
            boolean r0 = r3.A0S
            r1 = 16
            if (r0 == 0) goto L_0x03d4
            r1 = 35
        L_0x03d4:
            r0 = 5
            r2.A00(r0, r1)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = r3.A09
            X.4xk r1 = r2.A0R
            r1.A0A()
            r0 = 1
            r2.A0C = r0
            X.5XK r0 = r1.A08()
            r2.A0S(r0)
            android.os.Handler r1 = r2.A02
            if (r1 != 0) goto L_0x03f3
            android.os.Handler r1 = X.AnonymousClass000.A0A()
            r2.A02 = r1
        L_0x03f3:
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            android.os.Handler r3 = r2.A02
            r0 = 8
            X.5sL r2 = X.C117695sL.A00(r2, r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x0405:
            java.lang.Object r4 = r9.A00
            com.whatsapp.calling.avatar.view.FLMConsentBottomSheet r4 = (com.whatsapp.calling.avatar.view.FLMConsentBottomSheet) r4
            com.whatsapp.WaButtonWithLoader r1 = r4.A03
            if (r1 == 0) goto L_0x0413
            r0 = 1
            r1.A06 = r0
            r1.A00()
        L_0x0413:
            com.whatsapp.WaButtonWithLoader r0 = r4.A02
            r1 = 0
            if (r0 == 0) goto L_0x041b
            r0.setEnabled(r1)
        L_0x041b:
            com.whatsapp.WaButtonWithLoader r0 = r4.A03
            if (r0 == 0) goto L_0x0422
            r0.setEnabled(r1)
        L_0x0422:
            X.8tb r3 = r4.A1Y()
            r0 = 2
            X.73v r2 = new X.73v
            r2.<init>(r4, r0)
            r1 = 3
            X.73v r0 = new X.73v
            r0.<init>(r4, r1)
            r3.BSg(r2, r0)
            return
        L_0x0436:
            java.lang.Object r4 = r9.A00
            com.whatsapp.calling.avatar.view.FLMConsentBottomSheet r4 = (com.whatsapp.calling.avatar.view.FLMConsentBottomSheet) r4
            com.whatsapp.WaButtonWithLoader r1 = r4.A02
            if (r1 == 0) goto L_0x0444
            r0 = 1
            r1.A06 = r0
            r1.A00()
        L_0x0444:
            com.whatsapp.WaButtonWithLoader r0 = r4.A02
            r1 = 0
            if (r0 == 0) goto L_0x044c
            r0.setEnabled(r1)
        L_0x044c:
            com.whatsapp.WaButtonWithLoader r0 = r4.A03
            if (r0 == 0) goto L_0x0453
            r0.setEnabled(r1)
        L_0x0453:
            X.8tb r3 = r4.A1Y()
            X.73v r2 = new X.73v
            r2.<init>(r4, r1)
            r1 = 1
            X.73v r0 = new X.73v
            r0.<init>(r4, r1)
            r3.BSf(r2, r0)
            return
        L_0x0466:
            java.lang.Object r0 = r9.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x046e:
            java.lang.Object r1 = r9.A00
            com.whatsapp.businessupsell.BusinessProfileEducation r1 = (com.whatsapp.businessupsell.BusinessProfileEducation) r1
            r1.onBackPressed()
            r0 = 3
            r1.A74(r0)
            return
        L_0x047a:
            java.lang.Object r2 = r9.A00
            com.whatsapp.businessupsell.BusinessAppEducation r2 = (com.whatsapp.businessupsell.BusinessAppEducation) r2
            X.2X5 r1 = r2.A01
            java.lang.String r0 = "smb_cs_chats_banner"
            android.content.Intent r0 = r1.A00(r0)
            r2.startActivity(r0)
            r0 = 2
            r2.A74(r0)
            return
        L_0x048e:
            java.lang.Object r1 = r9.A00
            com.whatsapp.businessupsell.BusinessAppEducation r1 = (com.whatsapp.businessupsell.BusinessAppEducation) r1
            r1.onBackPressed()
            r0 = 3
            r1.A74(r0)
            return
        L_0x049a:
            java.lang.Object r0 = r9.A00
            X.4zJ r0 = (X.C97824zJ) r0
            X.4GP r0 = r0.A00
            goto L_0x0618
        L_0x04a2:
            java.lang.Object r0 = r9.A00
            X.4zM r0 = (X.C97854zM) r0
            X.4GP r0 = r0.A01
            goto L_0x0618
        L_0x04aa:
            java.lang.Object r0 = r9.A00
            X.6ls r0 = (X.C136116ls) r0
            X.7Cy r0 = r0.A00
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r2 = r0.A00
            r0 = 0
            r2.A05 = r0
            X.5Ur r1 = r2.A0Y
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            r1.A01 = r0
            r2.A0N()
            return
        L_0x04c1:
            java.lang.Object r0 = r9.A00
            X.6lw r0 = (X.C136156lw) r0
            X.8rW r6 = r0.A00
            X.69J r6 = (X.AnonymousClass69J) r6
            int r0 = r6.A03
            java.lang.Object r5 = r6.A00
            X.5Xb r5 = (X.C105955Xb) r5
            X.5iG r4 = r5.A04
            r3 = 1
            if (r0 == 0) goto L_0x04e8
            r2 = 36
            r1 = 5
            X.5Tn r0 = r5.A06
            java.lang.Integer r0 = r0.A03()
            X.C111545iG.A00(r4, r0, r3, r2, r1)
            java.lang.Object r0 = r6.A01
            X.5dx r0 = (X.C109025dx) r0
        L_0x04e4:
            r5.A03(r0)
            return
        L_0x04e8:
            r2 = 47
            r1 = 5
            X.5Tn r0 = r5.A06
            java.lang.Integer r0 = r0.A03()
            X.C111545iG.A00(r4, r0, r3, r2, r1)
            java.lang.Object r0 = r6.A01
            X.5dz r0 = (X.C109045dz) r0
            goto L_0x04e4
        L_0x04f9:
            java.lang.Object r0 = r9.A00
            X.6lw r0 = (X.C136156lw) r0
            X.8rW r5 = r0.A00
            X.69J r5 = (X.AnonymousClass69J) r5
            int r0 = r5.A03
            if (r0 == 0) goto L_0x0528
            java.lang.Object r3 = r5.A00
            X.5Xb r3 = (X.C105955Xb) r3
            boolean r2 = r5.A02
            r1 = 36
            if (r2 == 0) goto L_0x0511
            r1 = 32
        L_0x0511:
            r0 = 2
            java.lang.Object r5 = r5.A01
            X.5dx r5 = (X.C109025dx) r5
            X.C105955Xb.A00(r5, r3, r1, r0, r2)
            long r0 = java.lang.System.currentTimeMillis()
            r5.A00 = r0
            r3.A02(r5)
            X.08M r0 = r3.A02
        L_0x0524:
            r0.A0H(r5)
            return
        L_0x0528:
            java.lang.Object r4 = r5.A00
            X.5Xb r4 = (X.C105955Xb) r4
            boolean r3 = r5.A02
            r2 = 47
            if (r3 == 0) goto L_0x0534
            r2 = 32
        L_0x0534:
            java.lang.Object r5 = r5.A01
            X.5dz r5 = (X.C109045dz) r5
            java.lang.String r0 = r5.A01
            r1 = 2
            boolean r0 = X.C142686xb.A00(r0)
            if (r0 == 0) goto L_0x0542
            r1 = 3
        L_0x0542:
            X.C105955Xb.A00(r5, r4, r2, r1, r3)
            long r0 = java.lang.System.currentTimeMillis()
            r5.A00 = r0
            r4.A02(r5)
            X.08M r0 = r4.A01
            goto L_0x0524
        L_0x0551:
            java.lang.Object r0 = r9.A00
            X.6lp r0 = (X.C136086lp) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel r1 = r0.A00
            X.5iG r2 = r1.A07
            r6 = 0
            r7 = 7
            r8 = 1
            X.5Tn r0 = r1.A09
            java.lang.Integer r3 = r0.A03()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r5 = 0
            r2.A09(r3, r4, r5, r6, r7, r8)
            X.4UC r1 = r1.A0G
            r0 = 6
            X.C06270Wx.A03(r1, r0)
            return
        L_0x0571:
            java.lang.Object r0 = r9.A00
            X.6ld r0 = (X.C135966ld) r0
            X.5jX r3 = r0.A00
            java.lang.Class<X.5jX> r2 = X.C112315jX.class
            monitor-enter(r2)
            X.7Ph r1 = r3.A09     // Catch:{ all -> 0x0584 }
            r0 = 3
            r1.A02 = r0     // Catch:{ all -> 0x0584 }
            r3.A06()     // Catch:{ all -> 0x0584 }
            monitor-exit(r2)     // Catch:{ all -> 0x0584 }
            return
        L_0x0584:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0584 }
            throw r0
        L_0x0587:
            java.lang.Object r0 = r9.A00
            X.6ld r0 = (X.C135966ld) r0
            X.5jX r3 = r0.A00
            java.lang.Class<X.5jX> r2 = X.C112315jX.class
            monitor-enter(r2)
            X.7Ph r1 = r3.A09     // Catch:{ all -> 0x059a }
            r0 = 3
            r1.A02 = r0     // Catch:{ all -> 0x059a }
            r3.A06()     // Catch:{ all -> 0x059a }
            monitor-exit(r2)     // Catch:{ all -> 0x059a }
            return
        L_0x059a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x059a }
            throw r0
        L_0x059d:
            java.lang.Object r0 = r9.A00
            X.6ln r0 = (X.C136066ln) r0
            X.4GP r0 = r0.A00
            goto L_0x0618
        L_0x05a4:
            java.lang.Object r0 = r9.A00
            X.6lm r0 = (X.C136056lm) r0
            X.7Cw r0 = r0.A00
            X.5jX r2 = r0.A00
            X.7Ph r1 = r2.A09
            r0 = 9
            goto L_0x05c9
        L_0x05b1:
            java.lang.Object r0 = r9.A00
            X.6lm r0 = (X.C136056lm) r0
            X.7Cw r0 = r0.A00
            X.5jX r2 = r0.A00
            X.7Ph r1 = r2.A09
            r0 = 8
            goto L_0x05c9
        L_0x05be:
            java.lang.Object r0 = r9.A00
            X.6lu r0 = (X.C136136lu) r0
            X.7Cx r0 = r0.A01
            X.5jX r2 = r0.A00
            X.7Ph r1 = r2.A09
            r0 = 7
        L_0x05c9:
            r1.A02 = r0
            r2.A06()
            return
        L_0x05cf:
            java.lang.Object r1 = r9.A00
            X.7Yi r1 = (X.C152297Yi) r1
            X.7Cz r0 = r1.A00
            X.4lC r4 = r1.A01
            X.4U2 r3 = r0.A00
            X.4lC r0 = r3.A09
            r2 = 0
            if (r0 == 0) goto L_0x05fb
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r4.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x05fb
            r3.A09 = r2
        L_0x05ea:
            r3.A0F()
            r3.A0I()
            r0 = 1
            r3.A0T(r0)
            r3.A0S(r0)
            r3.A0J()
            return
        L_0x05fb:
            r3.A09 = r4
            goto L_0x05ea
        L_0x05fe:
            java.lang.Object r0 = r9.A00
            X.6lr r0 = (X.C136106lr) r0
            X.8rV r0 = r0.A00
            r0.BWm()
            return
        L_0x0608:
            java.lang.Object r0 = r9.A00
            X.6lr r0 = (X.C136106lr) r0
            X.8rV r0 = r0.A00
            r0.BMN()
            return
        L_0x0612:
            java.lang.Object r0 = r9.A00
            X.6lt r0 = (X.C136126lt) r0
            X.4GP r0 = r0.A02
        L_0x0618:
            r0.invoke()
            return
        L_0x061c:
            java.lang.Object r0 = r9.A00
            X.8uO r0 = (X.C185878uO) r0
            r0.Bab()
            return
        L_0x0624:
            java.lang.Object r0 = r9.A00
            X.8uO r0 = (X.C185878uO) r0
            r0.Bac()
            return
        L_0x062c:
            java.lang.Object r0 = r9.A00
            X.8uO r0 = (X.C185878uO) r0
            r0.BVr()
            return
        L_0x0634:
            X.5Ml r0 = r6.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = r0.A00
            r0 = 0
            r1.A7w(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109305eP.onClick(android.view.View):void");
    }
}
