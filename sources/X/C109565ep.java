package X;

import android.view.View;

/* renamed from: X.5ep  reason: invalid class name and case insensitive filesystem */
public class C109565ep implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0370, code lost:
        r5 = (X.C985251f) r5;
        r1 = r5.A03;
        r11 = r5.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03b5, code lost:
        if (r0 != false) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03de, code lost:
        if (r0 == false) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03fc, code lost:
        if (r0 == false) goto L_0x03fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (X.C86664Kz.A1X(r3.A0N, r2) == false) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            r10 = r15
            int r0 = r15.A04
            switch(r0) {
                case 0: goto L_0x0108;
                case 1: goto L_0x016c;
                case 2: goto L_0x0183;
                case 3: goto L_0x01a9;
                case 4: goto L_0x01c1;
                case 5: goto L_0x01d6;
                case 6: goto L_0x01ff;
                case 7: goto L_0x023c;
                case 8: goto L_0x0020;
                case 9: goto L_0x0265;
                case 10: goto L_0x02a1;
                case 11: goto L_0x003e;
                case 12: goto L_0x00d7;
                case 13: goto L_0x02bb;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r8 = r15.A00
            X.66w r8 = (X.C1230466w) r8
            boolean r0 = r8.B1E()
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x001d
            java.lang.Object r9 = r15.A01
        L_0x0014:
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r12 = 0
            r13 = 1
            r14 = r13
            r8.Avx(r9, r10, r11, r12, r13, r14)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r9 = r15.A02
            goto L_0x0014
        L_0x0020:
            java.lang.Object r5 = r15.A00
            X.5XH r5 = (X.AnonymousClass5XH) r5
            java.lang.Object r4 = r15.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r3 = r15.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r15.A03
            X.2sA r1 = r5.A06
            r0 = 0
            r1.A06(r4, r3, r0)
            if (r2 == 0) goto L_0x001c
            X.4FS r1 = r5.A0B
            r0 = 42
            X.C70333aK.A00(r1, r5, r4, r2, r0)
            return
        L_0x003e:
            java.lang.Object r7 = r15.A00
            com.whatsapp.spamreport.ReportSpamDialogFragment r7 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r7
            java.lang.Object r4 = r15.A01
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            java.lang.Object r5 = r15.A02
            X.3ZH r5 = (X.AnonymousClass3ZH) r5
            java.lang.Object r6 = r15.A03
            X.34x r6 = (X.C624134x) r6
            r3 = 1
            X.C162457s7.A0J(r4, r3)
            java.lang.ref.WeakReference r0 = r7.A0H
            if (r0 == 0) goto L_0x0302
            android.view.View r1 = X.C86664Kz.A0j(r0)
            if (r1 == 0) goto L_0x0302
            r0 = 2131428020(0x7f0b02b4, float:1.8477673E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r9 = r0.isChecked()
            r2 = 1
            r7.A0K = r3
            X.66R r0 = r7.A0M
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "status_post_report"
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x008e
            X.1Wj r1 = new X.1Wj
            r1.<init>()
            if (r9 == 0) goto L_0x00d2
            java.lang.Integer r0 = X.C18290x4.A0a()
        L_0x0085:
            r1.A00 = r0
            X.4FV r0 = r7.A0C
            if (r0 == 0) goto L_0x02fb
            r0.BhD(r1)
        L_0x008e:
            X.30W r1 = r7.A06
            if (r1 == 0) goto L_0x02f4
            android.content.Context r0 = r7.A1D()
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x001c
            r7.A1b(r3)
            if (r9 == 0) goto L_0x00b1
            boolean r0 = r4.A0R()
            if (r0 == 0) goto L_0x00b1
            X.1VX r1 = r7.A02
            r0 = 3369(0xd29, float:4.721E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x00d0
        L_0x00b1:
            X.66R r0 = r7.A0P
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r7.A1c(r4)
            if (r0 == 0) goto L_0x00d0
        L_0x00bf:
            r7.A0J = r2
            X.0ni r1 = X.AnonymousClass0IT.A00(r7)
            r8 = 0
            com.whatsapp.spamreport.ReportSpamDialogFragment$reportAsSpam$1 r3 = new com.whatsapp.spamreport.ReportSpamDialogFragment$reportAsSpam$1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0 = 3
            X.C616131n.A02(r8, r3, r1, r8, r0)
            return
        L_0x00d0:
            r2 = 0
            goto L_0x00bf
        L_0x00d2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x0085
        L_0x00d7:
            java.lang.Object r9 = r15.A00
            X.51x r9 = (X.AnonymousClass51x) r9
            java.lang.Object r1 = r15.A01
            java.util.concurrent.atomic.AtomicLong r1 = (java.util.concurrent.atomic.AtomicLong) r1
            java.lang.Object r8 = r15.A02
            X.5LV r8 = (X.AnonymousClass5LV) r8
            java.lang.Object r10 = r15.A03
            android.graphics.PointF r10 = (android.graphics.PointF) r10
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r9.A00
            int r0 = r0.A0O
            r7 = 4
            if (r0 != r7) goto L_0x001c
            r9.A08()
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x001c
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.get()
            long r3 = r3 - r0
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0307
            r9.A0C()
            return
        L_0x0108:
            java.lang.Object r6 = r15.A00
            X.5UB r6 = (X.AnonymousClass5UB) r6
            java.lang.Object r7 = r15.A01
            X.1mu r7 = (X.C30721mu) r7
            java.lang.Object r5 = r15.A02
            X.5Kq r5 = (X.C102885Kq) r5
            java.lang.Object r4 = r15.A03
            X.4ea r4 = (X.C89654ea) r4
            boolean r0 = r7.A21()
            if (r0 != 0) goto L_0x0126
            com.whatsapp.audiopicker.AudioPickerActivity r0 = r6.A0C
            X.5Tg r0 = r0.A0L
            r0.A01(r4)
            return
        L_0x0126:
            com.whatsapp.audiopicker.AudioPickerActivity r8 = r6.A0C
            X.5mA r0 = r8.A0H
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0137
            X.5mA r1 = r8.A0H
            X.8qC r0 = r8.A0N
            X.C107465bM.A0A(r1, r0)
        L_0x0137:
            X.5mA r0 = r8.A0H
            X.5pj r3 = r0.A00()
            if (r3 == 0) goto L_0x0156
            X.2z0 r2 = r7.A1J
            X.1mu r0 = r3.A0N
            boolean r0 = X.C86664Kz.A1X(r0, r2)
            if (r0 != 0) goto L_0x014e
            r1 = 1
            r0 = 0
            r3.A0H(r1, r0)
        L_0x014e:
            X.1mu r0 = r3.A0N
            boolean r0 = X.C86664Kz.A1X(r0, r2)
            if (r0 != 0) goto L_0x0167
        L_0x0156:
            X.5RC r1 = r8.A0G
            r0 = 0
            X.5pj r3 = r1.A01(r4, r0, r0)
            r3.A0N = r7
            X.5mA r0 = r8.A0H
            r0.A08(r3)
            r6.A03(r4, r5)
        L_0x0167:
            r0 = 0
            r3.A0E(r0)
            return
        L_0x016c:
            java.lang.Object r3 = r15.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r15.A02
            X.5hX r2 = (X.C111095hX) r2
            java.lang.Object r1 = r15.A03
            X.4GP r1 = (X.AnonymousClass4GP) r1
            android.content.Intent r0 = X.C57012sv.A00(r3)
            r2.A0A(r3, r0)
            r1.invoke()
            return
        L_0x0183:
            java.lang.Object r0 = r15.A00
            X.5Xl r0 = (X.C106055Xl) r0
            java.lang.Object r1 = r15.A01
            X.32K r1 = (X.AnonymousClass32K) r1
            java.lang.Object r4 = r15.A02
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Object r3 = r15.A03
            X.34x r3 = (X.C624134x) r3
            android.content.Context r0 = r0.A04
            android.app.Activity r2 = X.C111095hX.A02(r0)
            X.4ea r2 = (X.C89654ea) r2
            java.lang.String r1 = r1.A03
            X.2z0 r0 = r3.A1J
            java.lang.String r0 = r0.A01
            com.whatsapp.SuspiciousLinkWarningDialogFragment r0 = X.C379624s.A00(r1, r0, r4)
            r2.Boo(r0)
            return
        L_0x01a9:
            java.lang.Object r3 = r15.A00
            X.2w3 r3 = (X.C58932w3) r3
            java.lang.Object r2 = r15.A02
            com.whatsapp.TextEmojiLabel r2 = (com.whatsapp.TextEmojiLabel) r2
            java.lang.Object r1 = r15.A03
            X.8in r1 = (X.C179218in) r1
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x01bc
            X.C106365Yr.A01(r2, r1, r3)
        L_0x01bc:
            r0 = 0
            r2.setOnClickListener(r0)
            return
        L_0x01c1:
            java.lang.Object r3 = r15.A01
            X.677 r3 = (X.AnonymousClass677) r3
            java.lang.Object r2 = r15.A02
            X.1mW r2 = (X.C30481mW) r2
            java.lang.Object r1 = r15.A03
            X.5UY r1 = (X.AnonymousClass5UY) r1
            java.lang.String r0 = "BaseLinkCarouselItemView/showSelectionView/clickListener"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.C93414oW.A00(r3, r2, r1)
            return
        L_0x01d6:
            java.lang.Object r0 = r15.A00
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r5 = r15.A01
            X.571 r5 = (X.AnonymousClass571) r5
            java.lang.Object r4 = r15.A02
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            java.lang.Object r3 = r15.A03
            X.1fJ r2 = X.AnonymousClass34R.A01(r0)
            if (r2 == 0) goto L_0x01f3
            X.4FS r1 = r5.getWaWorkers()
            r0 = 24
            X.C70333aK.A00(r1, r5, r3, r2, r0)
        L_0x01f3:
            X.67D r1 = r5.getCommunityNavigator()
            android.content.Context r0 = r5.getContext()
            r1.Bg5(r0, r5, r4)
            return
        L_0x01ff:
            java.lang.Object r0 = r15.A00
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r5 = r15.A01
            X.574 r5 = (X.AnonymousClass574) r5
            java.lang.Object r4 = r15.A02
            X.34x r4 = (X.C624134x) r4
            java.lang.Object r3 = r15.A03
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            X.1fJ r2 = X.AnonymousClass34R.A01(r0)
            if (r2 == 0) goto L_0x021e
            X.4FS r1 = r5.getWaWorkers()
            r0 = 25
            X.C70333aK.A00(r1, r5, r4, r2, r0)
        L_0x021e:
            X.2sr r1 = r5.getMeManager()
            X.4uZ r0 = r4.A0n()
            boolean r2 = r1.A0a(r0)
            X.67D r1 = r5.getCommunityNavigator()
            android.content.Context r0 = r5.getContext()
            if (r2 == 0) goto L_0x0238
            r1.Bg7(r0, r5, r3)
            return
        L_0x0238:
            r1.Bg5(r0, r5, r3)
            return
        L_0x023c:
            java.lang.Object r0 = r15.A00
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r5 = r15.A01
            X.572 r5 = (X.AnonymousClass572) r5
            java.lang.Object r4 = r15.A02
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            java.lang.Object r3 = r15.A03
            X.1fJ r2 = X.AnonymousClass34R.A01(r0)
            if (r2 == 0) goto L_0x0259
            X.4FS r1 = r5.getWaWorkers()
            r0 = 26
            X.C70333aK.A00(r1, r5, r3, r2, r0)
        L_0x0259:
            X.67D r1 = r5.getCommunityNavigator()
            android.content.Context r0 = r5.getContext()
            r1.Bg7(r0, r5, r4)
            return
        L_0x0265:
            java.lang.Object r5 = r15.A00
            com.whatsapp.mediaview.MediaViewFragment r5 = (com.whatsapp.mediaview.MediaViewFragment) r5
            java.lang.Object r4 = r15.A01
            X.1mV r4 = (X.C30471mV) r4
            java.lang.Object r1 = r15.A02
            X.561 r1 = (X.AnonymousClass561) r1
            java.lang.Object r3 = r15.A03
            X.5YG r3 = (X.AnonymousClass5YG) r3
            boolean r0 = r4.A22()
            if (r0 == 0) goto L_0x028f
            r2 = 0
            r1.setPlayControlVisibility(r2)
            r3.A0G()
            X.33m r1 = r5.A0Q
            X.4ea r0 = X.C86664Kz.A0y(r5)
            r1.A07(r0, r4, r2)
            r3.A0F()
            return
        L_0x028f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cannot retry download on message with null url, key="
            X.C624134x.A0S(r4, r0, r1)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x02a1:
            java.lang.Object r0 = r15.A00
            X.4Z2 r0 = (X.AnonymousClass4Z2) r0
            java.lang.Object r4 = r15.A01
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            java.lang.Object r3 = r15.A02
            X.7HU r3 = (X.AnonymousClass7HU) r3
            java.lang.Object r2 = r15.A03
            X.7Hz r2 = (X.C148337Hz) r2
            X.4XF r0 = r0.A07
            X.65O r1 = r0.A0L
            int r0 = r2.A00
            r1.BWP(r3, r4, r0)
            return
        L_0x02bb:
            java.lang.Object r0 = r15.A03
            org.npci.upi.security.pinactivitycomponent.w r0 = (org.npci.upi.security.pinactivitycomponent.w) r0
            java.util.ArrayList r1 = r0.A06
            int r0 = r0.A03
            java.lang.Object r0 = r1.get(r0)
            X.66w r0 = (X.C1230466w) r0
            r0.Axb()
            java.lang.Object r8 = r15.A00
            X.66w r8 = (X.C1230466w) r8
            java.lang.String r11 = "MASTERO CARD"
            boolean r0 = r8.getTextEntered()
            if (r0 != 0) goto L_0x02ef
            boolean r0 = r8.B1E()
        L_0x02dc:
            if (r0 == 0) goto L_0x02ec
            java.lang.Object r9 = r15.A01
        L_0x02e0:
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r12 = 0
            r13 = 1
            r14 = r13
            r8.Avx(r9, r10, r11, r12, r13, r14)
            r8.setTextEntered(r12)
            return
        L_0x02ec:
            java.lang.Object r9 = r15.A02
            goto L_0x02e0
        L_0x02ef:
            boolean r0 = r8.getToggleCheckBox()
            goto L_0x02dc
        L_0x02f4:
            java.lang.String r0 = "spamReportManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02fb:
            java.lang.String r0 = "wamRuntime"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0302:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        L_0x0307:
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r8.A0F
            boolean r0 = r0.A05
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L_0x033b
            float r1 = r10.y
            android.view.View r0 = r8.A01
            int r0 = r0.getTop()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x033b
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r8.A0F
            boolean r0 = r0.A0M()
            if (r0 != 0) goto L_0x0433
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r8.A0F
            r0.setExpanded(r6)
            r9.A0B()
        L_0x032c:
            android.view.View r1 = r8.A02
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r8.A0F
            int r0 = r0.getVisibility()
            r1.setVisibility(r0)
        L_0x0337:
            r9.A0F()
            return
        L_0x033b:
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r8.A0F
            boolean r0 = r0.A0M()
            if (r0 != 0) goto L_0x0433
            X.5Ut r5 = r9.A08()
            float r3 = r10.x
            float r2 = r10.y
            boolean r0 = r5 instanceof X.C985551i
            if (r0 == 0) goto L_0x036c
            X.51i r5 = (X.C985551i) r5
            X.1VX r1 = r5.A0D
            com.whatsapp.mediaview.PhotoView r11 = r5.A0G
            X.1pC r0 = r5.A0I
            com.whatsapp.InteractiveAnnotation r4 = X.C105445Uy.A00(r11, r1, r0, r3, r2)
            if (r4 == 0) goto L_0x03e0
            android.content.Context r12 = r11.getContext()
            boolean r0 = r4.skipConfirmation
            if (r0 == 0) goto L_0x03b8
            X.C162457s7.A0H(r12)
            r5.A0I(r12, r4)
            goto L_0x0337
        L_0x036c:
            boolean r0 = r5 instanceof X.C985251f
            if (r0 == 0) goto L_0x03e0
            X.51f r5 = (X.C985251f) r5
            X.1VX r1 = r5.A03
            com.whatsapp.mediaview.PhotoView r11 = r5.A06
            X.1n2 r0 = r5.A08
            com.whatsapp.InteractiveAnnotation r4 = X.C105445Uy.A00(r11, r1, r0, r3, r2)
            if (r4 == 0) goto L_0x03e0
            android.content.Context r3 = r11.getContext()
            boolean r0 = r4.skipConfirmation
            if (r0 == 0) goto L_0x0390
            X.C162457s7.A0H(r3)
            r5.A0B(r3, r4)
        L_0x038c:
            r5.A05()
            goto L_0x0337
        L_0x0390:
            X.C162457s7.A0H(r3)
            android.view.View r2 = r11.getRootView()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.C162457s7.A0K(r2, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1 = 8
            X.5el r0 = new X.5el
            r0.<init>(r5, r4, r3, r1)
            X.5NW r1 = new X.5NW
            r1.<init>(r3, r0, r2)
            X.6AG r0 = new X.6AG
            r0.<init>(r5, r6)
            boolean r0 = r1.A00(r0, r4, r11)
            r5.A00 = r1
            if (r0 == 0) goto L_0x03e0
            goto L_0x038c
        L_0x03b8:
            X.C162457s7.A0H(r12)
            android.view.View r3 = r11.getRootView()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.C162457s7.A0K(r3, r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1 = 9
            X.5el r0 = new X.5el
            r0.<init>(r5, r4, r12, r1)
            X.5NW r2 = new X.5NW
            r2.<init>(r12, r0, r3)
            r1 = 2
            X.6AG r0 = new X.6AG
            r0.<init>(r5, r1)
            boolean r0 = r2.A00(r0, r4, r11)
            r5.A01 = r2
            if (r0 != 0) goto L_0x0337
        L_0x03e0:
            float r1 = r10.x
            android.view.View r0 = r8.A07
            int r0 = r0.getWidth()
            int r0 = r0 / 6
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x042f
            r4 = 9
            r7 = 5
        L_0x03f2:
            X.5SJ r0 = r9.A0T
            if (r6 == 0) goto L_0x0403
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = r0.A02
            boolean r0 = r0.A1a(r4, r7)
        L_0x03fc:
            if (r0 != 0) goto L_0x0337
        L_0x03fe:
            r9.A0C()
            goto L_0x0337
        L_0x0403:
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = r0.A02
            java.util.List r0 = r3.A0o
            r2 = 0
            if (r0 == 0) goto L_0x03fe
            int r1 = r3.A00
            if (r1 <= 0) goto L_0x041c
            r0 = 1
            int r1 = r1 - r0
            r3.A1W(r1)
            X.5Uh r0 = r3.A1Q()
            r3.A1Z(r0, r4, r7)
            goto L_0x0337
        L_0x041c:
            X.03q r1 = r3.A0Q()
            X.65e r1 = (X.C1226465e) r1
            if (r1 == 0) goto L_0x03fe
            com.whatsapp.jid.UserJid r0 = r3.A0R
            java.lang.String r0 = X.C18300x5.A0i(r0)
            boolean r0 = r1.BUq(r0, r4, r7, r2)
            goto L_0x03fc
        L_0x042f:
            r6 = 0
            r4 = 8
            goto L_0x03f2
        L_0x0433:
            com.whatsapp.ui.media.MediaCaptionTextView r0 = r8.A0F
            r0.setExpanded(r2)
            r9.A0C()
            goto L_0x032c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109565ep.onClick(android.view.View):void");
    }

    public C109565ep(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }
}
