package X;

import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;

/* renamed from: X.5MQ  reason: invalid class name */
public class AnonymousClass5MQ {
    public final /* synthetic */ CallsHistoryFragmentV2 A00;

    public AnonymousClass5MQ(CallsHistoryFragmentV2 callsHistoryFragmentV2) {
        this.A00 = callsHistoryFragmentV2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011c, code lost:
        if (X.C627436k.A0L(r2.A0Y, X.C86664Kz.A0H(r2.A0V, r9)) != false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0123, code lost:
        if (r7.BL0(r8, r9, r10, r11, true, r13, false) == false) goto L_0x00ee;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C112435jj r22, X.C91254jE r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r2 = r0.A00
            X.0R2 r0 = r2.A03
            if (r0 == 0) goto L_0x000e
            r0 = r23
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A01(r0, r2)
            return
        L_0x000e:
            X.03q r15 = r2.A0Q()
            if (r15 != 0) goto L_0x001a
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onCallButtonClicked activity null"
        L_0x0016:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x001a:
            r4 = r22
            X.5rE r8 = r4.A01
            java.util.ArrayList r7 = r8.A04
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
            r14 = 0
            java.lang.Object r6 = r0.get(r14)
            X.3ZF r6 = (X.AnonymousClass3ZF) r6
            X.3ZH r5 = r4.A03
            boolean r0 = r7.isEmpty()
            r3 = r24
            if (r0 != 0) goto L_0x0061
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r7, r14)
            X.2l8 r1 = r0.A0I
            if (r1 == 0) goto L_0x0061
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r1.A02
            java.lang.String r0 = X.C107305b5.A05(r0, r3)
            android.net.Uri r6 = android.net.Uri.parse(r0)
            X.66r r5 = r2.A0H
            X.4ea r15 = (X.C89654ea) r15
            X.2i5 r0 = r2.A0D
            r0.A00()
            X.3Wi r1 = r2.A0A
            r0 = 12
            X.AnonymousClass36T.A05(r6, r15, r1, r5, r0)
        L_0x005b:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r2.A0G
            r0.A0K(r4, r3)
            return
        L_0x0061:
            boolean r0 = r8.A04()
            if (r0 == 0) goto L_0x0092
            if (r5 != 0) goto L_0x0092
            X.33i r0 = r2.A0R
            android.view.inputmethod.InputMethodManager r1 = r0.A0Q()
            android.view.View r0 = r15.getCurrentFocus()
            if (r1 == 0) goto L_0x007e
            if (r0 == 0) goto L_0x007e
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r14)
        L_0x007e:
            X.1VX r5 = r2.A0Y
            X.2sr r1 = r2.A0B
            X.3Ex r0 = r2.A0M
            r20 = 21
            r18 = r5
            r19 = r6
            r16 = r1
            r17 = r0
            X.C107305b5.A06(r15, r16, r17, r18, r19, r20)
            goto L_0x005b
        L_0x0092:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r2.A0G
            X.4Ox r0 = r0.A0T
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = X.C18320x8.A1U(r0)
            r12 = 1
            if (r0 == 0) goto L_0x00b1
            r11 = 35
        L_0x00a1:
            boolean r0 = r8.A04()
            if (r0 != 0) goto L_0x00d6
            X.3ZH r1 = r8.A02()
            X.66r r0 = r2.A0H
            r0.Bpk(r15, r1, r11, r3)
            goto L_0x005b
        L_0x00b1:
            int r1 = r8.A00()
            r0 = 2
            if (r1 == 0) goto L_0x00d4
            if (r1 == r12) goto L_0x00d1
            if (r1 == r0) goto L_0x00cf
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onCallButtonClicked call origin null. Call type: "
            r1.append(r0)
            int r0 = r8.A00()
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            goto L_0x0016
        L_0x00cf:
            r11 = 1
            goto L_0x00a1
        L_0x00d1:
            r11 = 9
            goto L_0x00a1
        L_0x00d4:
            r11 = 2
            goto L_0x00a1
        L_0x00d6:
            if (r5 == 0) goto L_0x005b
            boolean r0 = r15 instanceof X.C89654ea
            if (r0 == 0) goto L_0x005b
            com.whatsapp.jid.GroupJid r9 = r6.A05
            if (r24 == 0) goto L_0x00f9
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00f9
            X.3ZF r0 = X.AnonymousClass4L0.A0P(r7, r14)
            com.whatsapp.jid.GroupJid r0 = r0.A05
            if (r0 == 0) goto L_0x00f9
        L_0x00ee:
            X.4ea r15 = (X.C89654ea) r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            com.whatsapp.calling.fragment.CallConfirmationFragment.A03(r15, r5, r0, r3)
            goto L_0x005b
        L_0x00f9:
            int r0 = r6.A0H
            if (r0 == r12) goto L_0x00ee
            X.66r r7 = r2.A0H
            X.2sj r6 = r2.A0V
            X.2sr r1 = r2.A0B
            X.3Ex r0 = r2.A0M
            java.util.List r10 = X.AnonymousClass36T.A03(r1, r0, r6, r5)
            android.content.Context r8 = r2.A1D()
            if (r9 == 0) goto L_0x011e
            X.1VX r1 = r2.A0Y
            X.2sj r0 = r2.A0V
            int r0 = X.C86664Kz.A0H(r0, r9)
            boolean r0 = X.C627436k.A0L(r1, r0)
            r13 = 1
            if (r0 == 0) goto L_0x011f
        L_0x011e:
            r13 = 0
        L_0x011f:
            boolean r0 = r7.BL0(r8, r9, r10, r11, r12, r13, r14)
            if (r0 != 0) goto L_0x005b
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5MQ.A00(X.5jj, X.4jE, boolean):void");
    }
}
