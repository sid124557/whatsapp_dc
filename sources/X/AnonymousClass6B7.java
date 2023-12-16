package X;

/* renamed from: X.6B7  reason: invalid class name */
public class AnonymousClass6B7 implements C183278pm {
    public Object A00;
    public final int A01;

    public AnonymousClass6B7(C113245l7 r1, int i) {
        this.A01 = i;
        if (10 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00f3, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00fb, code lost:
        r8.A0B = 0;
        r8.A06 = 6.0f;
        X.C86614Ku.A15(r1.getResources(), r8, com.whatsapp.R.dimen.f6nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x010c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x012c, code lost:
        r8.A0B = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x012e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01db, code lost:
        r6.A1K(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01de, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BUX(android.view.View r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x01ac;
                case 1: goto L_0x0192;
                case 2: goto L_0x0174;
                case 3: goto L_0x013e;
                case 4: goto L_0x012f;
                case 5: goto L_0x010d;
                case 6: goto L_0x00f5;
                case 7: goto L_0x00bf;
                case 8: goto L_0x00b3;
                case 9: goto L_0x0093;
                case 10: goto L_0x0038;
                case 11: goto L_0x0075;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r7.A00
            X.5qb r1 = (X.C116635qb) r1
            r0 = 2131434765(0x7f0b1d0d, float:1.8491353E38)
            android.widget.ImageButton r0 = X.C86664Kz.A0t(r8, r0)
            r1.A01 = r0
            r0 = 2131434771(0x7f0b1d13, float:1.8491365E38)
            android.widget.TextView r0 = X.C18300x5.A0G(r8, r0)
            r1.A02 = r0
            r0 = 2131434769(0x7f0b1d11, float:1.8491361E38)
            android.view.View r0 = X.C06560Yg.A02(r8, r0)
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = (com.whatsapp.voicerecorder.VoiceNoteSeekBar) r0
            r1.A04 = r0
            r0 = 2131434766(0x7f0b1d0e, float:1.8491355E38)
            android.view.View r0 = X.C06560Yg.A02(r8, r0)
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = (com.whatsapp.conversation.waveforms.VoiceVisualizer) r0
            r1.A03 = r0
            android.widget.TextView r1 = r1.A02
            r0 = 2
            X.AnonymousClass0YY.A06(r1, r0)
        L_0x0037:
            return
        L_0x0038:
            java.lang.Object r2 = r7.A00
            X.5l7 r2 = (X.C113245l7) r2
            X.676 r1 = r2.A2z
            r0 = 2131430688(0x7f0b0d20, float:1.8483084E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.A0l = r0
            X.4VQ r0 = r2.A3B
            if (r0 == 0) goto L_0x0037
            X.08M r0 = r0.A0V
            java.lang.Object r0 = r0.A07()
            if (r0 == 0) goto L_0x0037
            X.4VQ r0 = r2.A3B
            X.08M r0 = r0.A0V
            java.lang.Object r0 = r0.A07()
            X.5Pd r0 = (X.C103975Pd) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0037
            android.widget.TextView r1 = r2.A0l
            X.4VQ r0 = r2.A3B
            X.08M r0 = r0.A0V
            java.lang.Object r0 = r0.A07()
            X.5Pd r0 = (X.C103975Pd) r0
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            return
        L_0x0075:
            java.lang.Object r2 = r7.A00
            X.5l7 r2 = (X.C113245l7) r2
            X.4eZ r1 = X.C113245l7.A09(r2)
            r0 = 2131434490(0x7f0b1bfa, float:1.8490795E38)
            android.widget.TextView r0 = X.C005205m.A01(r1, r0)
            r2.A0m = r0
            X.676 r1 = r2.A2z
            r0 = 2131889674(0x7f120e0a, float:1.9414018E38)
            java.lang.String r0 = r1.getString(r0)
            r8.setContentDescription(r0)
            return
        L_0x0093:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            com.whatsapp.CircularProgressBar r8 = (com.whatsapp.CircularProgressBar) r8
            r0 = 100
            r8.setMax(r0)
            android.content.Context r3 = r1.getContext()
            android.content.Context r2 = r1.getContext()
            r1 = 2130969720(0x7f040478, float:1.754813E38)
            r0 = 2131101150(0x7f0605de, float:1.7814702E38)
            int r0 = X.AnonymousClass5Yj.A03(r2, r3, r1, r0)
            r8.A0C = r0
            goto L_0x00f3
        L_0x00b3:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            com.whatsapp.CircularProgressBar r8 = (com.whatsapp.CircularProgressBar) r8
            r0 = 100
            r8.setMax(r0)
            goto L_0x00fb
        L_0x00bf:
            java.lang.Object r0 = r7.A00
            android.view.View r0 = (android.view.View) r0
            com.whatsapp.CircularProgressBar r8 = (com.whatsapp.CircularProgressBar) r8
            android.content.res.Resources r1 = X.C18290x4.A0G(r0)
            r0 = 2131166080(0x7f070380, float:1.7946395E38)
            float r4 = X.C86664Kz.A01(r1, r0)
            r0 = 2131166079(0x7f07037f, float:1.7946393E38)
            float r3 = X.C86664Kz.A01(r1, r0)
            r0 = 2131166078(0x7f07037e, float:1.7946391E38)
            float r2 = X.C86664Kz.A01(r1, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r0 = r4 / r0
            float r3 = r3 - r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3 / r2
            float r1 = r1 - r0
            r8.A05 = r1
            float r3 = r3 / r4
            r8.A06 = r3
            r0 = 100
            r8.setMax(r0)
        L_0x00f3:
            r0 = 0
            goto L_0x012c
        L_0x00f5:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            com.whatsapp.CircularProgressBar r8 = (com.whatsapp.CircularProgressBar) r8
        L_0x00fb:
            r0 = 0
            r8.A0B = r0
            r0 = 1086324736(0x40c00000, float:6.0)
            r8.A06 = r0
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131166101(0x7f070395, float:1.7946438E38)
            X.C86614Ku.A15(r1, r8, r0)
            return
        L_0x010d:
            java.lang.Object r1 = r7.A00
            android.content.Context r1 = (android.content.Context) r1
            com.whatsapp.CircularProgressBar r8 = (com.whatsapp.CircularProgressBar) r8
            r0 = 100
            r8.setMax(r0)
            r0 = 2130970107(0x7f0405fb, float:1.7548915E38)
            int r0 = X.AnonymousClass34K.A01(r1, r0)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            r8.A0C = r0
            r0 = 2131100080(0x7f0601b0, float:1.7812531E38)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
        L_0x012c:
            r8.A0B = r0
            return
        L_0x012f:
            java.lang.Object r2 = r7.A00
            r0 = 2131427528(0x7f0b00c8, float:1.8476675E38)
            android.view.View r1 = X.C06560Yg.A02(r8, r0)
            r0 = 28
            X.AnonymousClass54F.A00(r1, r2, r0)
            return
        L_0x013e:
            java.lang.Object r6 = r7.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r6 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r6
            r0 = 2131434906(0x7f0b1d9a, float:1.849164E38)
            android.widget.TextView r5 = X.C18300x5.A0G(r8, r0)
            X.03q r1 = r6.A0R()
            r0 = 2131895570(0x7f122512, float:1.9425977E38)
            java.lang.String r4 = r1.getString(r0)
            android.content.Context r3 = r6.A0G()
            X.1VX r1 = r6.A0Y
            r0 = 5370(0x14fa, float:7.525E-42)
            int r2 = r1.A0N(r0)
            r0 = 1
            r1 = 2131232460(0x7f0806cc, float:1.808103E38)
            if (r2 != r0) goto L_0x0169
            r1 = 2131233855(0x7f080c3f, float:1.808386E38)
        L_0x0169:
            r0 = 2131101268(0x7f060654, float:1.781494E38)
            android.graphics.drawable.Drawable r0 = X.C107335b8.A04(r3, r1, r0)
            X.C87044Mw.A05(r0, r5, r4)
            goto L_0x01db
        L_0x0174:
            r0 = 2131433330(0x7f0b1772, float:1.8488443E38)
            android.view.View r3 = X.C06560Yg.A02(r8, r0)
            android.content.res.Resources r1 = X.C18290x4.A0G(r3)
            r0 = 2131168095(0x7f070b5f, float:1.7950482E38)
            int r2 = r1.getDimensionPixelSize(r0)
            int r1 = r3.getPaddingLeft()
            int r0 = r3.getPaddingRight()
            r3.setPadding(r1, r2, r0, r2)
            return
        L_0x0192:
            java.lang.Object r2 = r7.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r2 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r2
            r0 = 2131428352(0x7f0b0400, float:1.8478346E38)
            android.view.View r1 = X.C06560Yg.A02(r8, r0)
            r0 = 2
            X.C18320x8.A13(r1, r2, r0)
            r0 = 2131429751(0x7f0b0977, float:1.8481184E38)
            android.view.View r0 = X.C06560Yg.A02(r8, r0)
            r2.A1K(r0)
            return
        L_0x01ac:
            java.lang.Object r6 = r7.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r6 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r6
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            android.content.Context r0 = r6.A1D()
            com.whatsapp.EmptyTellAFriendView r4 = new com.whatsapp.EmptyTellAFriendView
            r4.<init>(r0)
            r0 = 2131429051(0x7f0b06bb, float:1.8479764E38)
            android.view.View r3 = X.C06560Yg.A02(r4, r0)
            int r2 = r3.getPaddingLeft()
            r1 = 0
            int r0 = r3.getPaddingRight()
            r3.setPadding(r2, r1, r0, r1)
            r8.addView(r4)
            r1 = 37
            X.5eP r0 = new X.5eP
            r0.<init>(r6, r1)
            r4.setInviteButtonClickListener(r0)
        L_0x01db:
            r6.A1K(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6B7.BUX(android.view.View):void");
    }

    public AnonymousClass6B7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
