package X;

/* renamed from: X.68r  reason: invalid class name and case insensitive filesystem */
public class C1235068r implements C183348pt {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1235068r(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r9 != 3) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r8 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BYM(boolean r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x0051;
                case 1: goto L_0x008d;
                case 2: goto L_0x00e2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r7.A00
            X.563 r3 = (X.AnonymousClass563) r3
            java.lang.Object r1 = r7.A01
            X.5YG r1 = (X.AnonymousClass5YG) r1
            boolean r0 = r1.A0a()
            r2 = 0
            if (r0 == 0) goto L_0x0017
            r0 = 1
            if (r8 != 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.setKeepScreenOn(r0)
            boolean r0 = r1.A0a()
            if (r0 == 0) goto L_0x003c
            android.view.ViewGroup r1 = r3.A0e
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x003c
            r0 = 8
            r1.setVisibility(r0)
            android.view.ViewGroup r0 = r3.A0d
            r0.setVisibility(r2)
            boolean r0 = r3.A0N
            if (r0 == 0) goto L_0x003c
            android.widget.ImageButton r0 = r3.A0p
            r0.setVisibility(r2)
        L_0x003c:
            boolean r0 = r3.A0R
            if (r0 == 0) goto L_0x0048
            r0 = 2
            if (r9 != r0) goto L_0x0048
            r3.A0R = r2
            r3.A08()
        L_0x0048:
            android.widget.SeekBar r0 = r3.A0u
            r0.setVisibility(r2)
            r3.A0E()
        L_0x0050:
            return
        L_0x0051:
            java.lang.Object r5 = r7.A00
            X.4nz r5 = (X.C93154nz) r5
            java.lang.Object r1 = r7.A01
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r6 = 0
            if (r8 == 0) goto L_0x0060
            r0 = 3
            r4 = 1
            if (r9 == r0) goto L_0x0061
        L_0x0060:
            r4 = 0
        L_0x0061:
            boolean r3 = r1.get()
            r1.set(r4)
            r2 = 4
            if (r9 != r2) goto L_0x0076
            X.34x r0 = r5.A0S
            X.2z0 r1 = r0.A1J
            X.5XQ r0 = r5.A0C
            if (r0 == 0) goto L_0x0076
            r0.A02(r1)
        L_0x0076:
            if (r4 == r3) goto L_0x0050
            android.view.View r0 = r5.A03
            if (r4 == 0) goto L_0x019c
            r0.setVisibility(r2)
            android.view.ViewGroup r1 = r5.A05
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r5.A02 = r0
            return
        L_0x008d:
            java.lang.Object r4 = r7.A00
            X.566 r4 = (X.AnonymousClass566) r4
            java.lang.Object r1 = r7.A01
            X.5Xh r0 = r4.A00
            X.7ND r0 = r0.A05
            boolean r0 = X.C162457s7.A0P(r0, r1)
            if (r0 == 0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/ConversationRowInlineVideoPlayer/onPlayerStateChanged playWhenReady="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; playbackState="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " state="
            r1.append(r0)
            X.5Xh r0 = r4.A00
            X.C18260x0.A0m(r0, r1)
            X.5Xh r2 = r4.A00
            X.5Rg r1 = r2.A03
            boolean r0 = r2.A07
            X.AnonymousClass566.A00(r4, r1, r2, r9, r0)
            X.5Xh r2 = r4.A00
            X.58U r1 = r2.A04
            X.58U r0 = X.AnonymousClass58U.CREATING_PLAYER
            if (r1 != r0) goto L_0x0050
            r0 = 3
            if (r9 != r0) goto L_0x0050
            X.58U r0 = X.AnonymousClass58U.AWAITING_COMPLETION
            X.5Xh r0 = X.C106015Xh.A00(r0, r2)
            r4.A0h(r0)
            X.3Wi r3 = r4.A04
            java.lang.Runnable r2 = r4.A06
            r0 = 150(0x96, double:7.4E-322)
            r3.A0T(r2, r0)
            return
        L_0x00e2:
            java.lang.Object r4 = r7.A00
            X.5TR r4 = (X.AnonymousClass5TR) r4
            java.lang.Object r3 = r7.A01
            X.34x r3 = (X.C624134x) r3
            X.7ND r2 = r4.A00
            if (r2 == 0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/video/autoplay/playbackState="
            r1.append(r0)
            X.5YG r0 = r2.A03
            int r0 = r0.A07()
            r1.append(r0)
            java.lang.String r0 = " playWhenReady="
            r1.append(r0)
            X.7ND r0 = r4.A00
            X.5YG r0 = r0.A03
            boolean r0 = r0.A0d()
            r1.append(r0)
            java.lang.String r0 = " key: "
            X.2z0 r0 = X.C624134x.A08(r3, r0, r1)
            java.lang.String r3 = r0.A01
            r1.append(r3)
            java.lang.String r2 = " videoPlayerId="
            r1.append(r2)
            X.7ND r0 = r4.A00
            int r0 = r0.hashCode()
            X.C18260x0.A1F(r1, r0)
            r0 = 3
            if (r9 != r0) goto L_0x0180
            if (r8 == 0) goto L_0x01a0
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "conversation/row/video/autoplay/hidethumbnail/"
            X.AnonymousClass001.A1K(r0, r3, r2, r1)
            X.7ND r0 = r4.A00
            int r0 = r0.hashCode()
            X.C18260x0.A1F(r1, r0)
            android.widget.FrameLayout r5 = r4.A06
            int r0 = r5.getVisibility()
            if (r0 == 0) goto L_0x0174
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r6 = r4.A0B
            r3 = 0
            r5.setAlpha(r3)
            r0 = 0
            r5.setVisibility(r0)
            android.view.ViewPropertyAnimator r0 = X.C86624Kv.A0B(r5)
            r1 = 150(0x96, double:7.4E-322)
            r0.setDuration(r1)
            android.view.ViewPropertyAnimator r0 = r6.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            android.view.ViewPropertyAnimator r2 = r0.setDuration(r1)
            r1 = 0
            X.8zH r0 = new X.8zH
            r0.<init>(r6, r1, r4)
            r2.setListener(r0)
        L_0x0174:
            android.view.View r1 = r4.A04
            r0 = 4
            X.AnonymousClass5TR.A00(r1, r4, r0)
            r0 = 8
            r5.sendAccessibilityEvent(r0)
            return
        L_0x0180:
            r0 = 4
            if (r9 != r0) goto L_0x018f
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r0 = r4.A0B
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r4.A04
            X.AnonymousClass5TR.A00(r0, r4, r1)
            return
        L_0x018f:
            r0 = 1
            if (r9 != r0) goto L_0x0050
            r4.A03 = r0
            X.7ND r0 = r4.A00
            X.5YG r0 = r0.A03
            r0.A0C()
            return
        L_0x019c:
            r0.setVisibility(r6)
            return
        L_0x01a0:
            r0 = 46
            X.5rM r3 = X.C117085rM.A00(r4, r0)
            r4.A01 = r3
            X.3Wi r2 = r4.A09
            r0 = 150(0x96, double:7.4E-322)
            r2.A0T(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1235068r.BYM(boolean, int):void");
    }
}
