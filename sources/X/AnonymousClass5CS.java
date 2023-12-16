package X;

import android.view.View;

/* renamed from: X.5CS  reason: invalid class name */
public class AnonymousClass5CS implements View.OnTouchListener {
    public Object A00;
    public final int A01;

    public AnonymousClass5CS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnTouchListener(new AnonymousClass5CS(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r6.A0G.A00 == 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r6.A0f.A0C(r1) != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r15, android.view.MotionEvent r16) {
        /*
            r14 = this;
            int r0 = r14.A01
            r5 = r16
            switch(r0) {
                case 0: goto L_0x010e;
                case 1: goto L_0x017a;
                case 2: goto L_0x018b;
                case 3: goto L_0x0020;
                case 4: goto L_0x0061;
                case 5: goto L_0x00b6;
                case 6: goto L_0x020f;
                case 7: goto L_0x0353;
                case 8: goto L_0x035e;
                case 9: goto L_0x00d1;
                case 10: goto L_0x03e6;
                case 11: goto L_0x00f2;
                case 12: goto L_0x00e2;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r1 = r5.getAction()
            r2 = 0
        L_0x000c:
            r0 = 1
            if (r1 != r0) goto L_0x041d
            java.lang.Object r1 = r14.A00
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            android.view.View r0 = r1.A04
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x041d
            org.npci.upi.security.pinactivitycomponent.GetCredential.A0L(r1, r2)
        L_0x001e:
            r0 = 1
            return r0
        L_0x0020:
            java.lang.Object r6 = r14.A00
            com.whatsapp.community.CommunityHomeActivity r6 = (com.whatsapp.community.CommunityHomeActivity) r6
            X.4Qc r15 = (X.AnonymousClass4Qc) r15
            X.5T2 r0 = r15.A09
            if (r0 == 0) goto L_0x005f
            int r2 = r0.A00
        L_0x002c:
            int r1 = r5.getAction()
            r0 = 1
            if (r1 != 0) goto L_0x003d
            if (r2 != r0) goto L_0x003d
            androidx.viewpager2.widget.ViewPager2 r0 = r6.A0G
            int r1 = r0.A00
            r0 = 1
            r2 = 1
            if (r1 != r0) goto L_0x003e
        L_0x003d:
            r2 = 0
        L_0x003e:
            X.1fJ r1 = r6.A0o
            if (r1 == 0) goto L_0x004b
            X.2sj r0 = r6.A0f
            boolean r1 = r0.A0C(r1)
            r0 = 1
            if (r1 == 0) goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r2 == 0) goto L_0x041d
            if (r0 == 0) goto L_0x041d
            X.3Ej r4 = r6.A0W
            X.5qG r3 = new X.5qG
            r3.<init>(r6)
            X.1fJ r2 = r6.A0o
            r1 = 3
            r0 = 0
            r4.BgF(r2, r3, r0, r1)
            goto L_0x001e
        L_0x005f:
            r2 = -1
            goto L_0x002c
        L_0x0061:
            java.lang.Object r3 = r14.A00
            X.4c7 r3 = (X.C89224c7) r3
            int r1 = r5.getActionMasked()
            r0 = 2
            if (r1 == r0) goto L_0x0367
            int r0 = r5.getActionMasked()
            r6 = 1
            if (r0 == r6) goto L_0x0367
            float r0 = r5.getX()
            float r1 = r5.getY()
            int[] r2 = X.C86664Kz.A1Z()
            r15.getLocationOnScreen(r2)
            int r4 = (int) r0
            r0 = 0
            r0 = r2[r0]
            int r4 = r4 + r0
            int r1 = (int) r1
            r0 = r2[r6]
            int r1 = r1 + r0
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r4, r1)
            com.whatsapp.WaEditText r1 = r3.A0K
            if (r1 == 0) goto L_0x00ab
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L_0x00ab
            boolean r0 = X.AnonymousClass4Rn.A01(r2, r1)
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r1.A08(r2)
            if (r0 == 0) goto L_0x00ab
            r3.A06(r1)
            goto L_0x001e
        L_0x00ab:
            float r1 = r5.getY()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0367
            goto L_0x001e
        L_0x00b6:
            java.lang.Object r1 = r14.A00
            X.5Kk r1 = (X.C102825Kk) r1
            r0 = 1
            X.C162457s7.A0J(r15, r0)
            r15.performClick()
            r0 = 0
            r1.A00 = r0
            android.widget.PopupWindow r1 = r1.A03
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x001e
            r1.dismiss()
            goto L_0x001e
        L_0x00d1:
            java.lang.Object r2 = r14.A00
            com.whatsapp.quickcontact.QuickContactActivity r2 = (com.whatsapp.quickcontact.QuickContactActivity) r2
            com.whatsapp.util.FloatingChildLayout r0 = r2.A0t
            int r1 = r0.A03
            r0 = 2
            if (r1 != r0) goto L_0x001e
            r0 = 1
            r2.A76(r0)
            goto L_0x001e
        L_0x00e2:
            int r1 = r15.getId()
            r0 = 2131434408(0x7f0b1ba8, float:1.849063E38)
            r2 = 0
            if (r1 != r0) goto L_0x041d
            int r1 = r5.getAction()
            goto L_0x000c
        L_0x00f2:
            java.lang.Object r0 = r14.A00
            X.563 r0 = (X.AnonymousClass563) r0
            com.whatsapp.text.ReadMoreTextView r2 = r0.A0z
            boolean r0 = r2.A05
            r1 = 0
            if (r0 == 0) goto L_0x041d
            int r0 = r5.getAction()
            if (r0 != 0) goto L_0x041d
            boolean r0 = r2.A0M()
            if (r0 == 0) goto L_0x041d
            r2.setExpanded(r1)
            goto L_0x001e
        L_0x010e:
            java.lang.Object r7 = r14.A00
            com.whatsapp.biz.catalog.view.activity.ProductListActivity r7 = (com.whatsapp.biz.catalog.view.activity.ProductListActivity) r7
            int r1 = r5.getAction()
            r0 = 1
            r6 = 0
            if (r1 == r0) goto L_0x0141
            r0 = 2
            if (r1 != r0) goto L_0x041d
            androidx.recyclerview.widget.RecyclerView r1 = r7.A03
            r0 = -1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 != 0) goto L_0x041d
            boolean r0 = r7.A0U
            if (r0 == 0) goto L_0x041d
            X.4XL r2 = r7.A0H
            boolean r0 = r2.A0K()
            if (r0 != 0) goto L_0x041d
            java.util.List r1 = r2.A0B
            X.8EW r0 = new X.8EW
            r0.<init>()
            r1.add(r6, r0)
            r2.A07(r6)
            goto L_0x041d
        L_0x0141:
            boolean r0 = r7.A0U
            if (r0 == 0) goto L_0x041d
            X.4XL r0 = r7.A0H
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x041d
            X.4XL r1 = r7.A0H
            boolean r0 = r1.A0K()
            if (r0 == 0) goto L_0x015d
            java.util.List r0 = r1.A0B
            r0.remove(r6)
            r1.A08(r6)
        L_0x015d:
            boolean r0 = X.AnonymousClass4SG.A40(r7)
            if (r0 == 0) goto L_0x041d
            X.4Tu r5 = r7.A0I
            X.2fh r4 = r5.A07
            com.whatsapp.jid.UserJid r3 = r5.A09
            java.util.Set r2 = X.AnonymousClass74S.A00()
            r1 = 1
            X.6Bz r0 = new X.6Bz
            r0.<init>(r5, r1)
            r4.A01(r3, r2, r0)
            r7.A0U = r6
            goto L_0x041d
        L_0x017a:
            java.lang.Object r2 = r14.A00
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r1 = r5.getX()
            float r0 = r5.getY()
            r2.set(r1, r0)
            goto L_0x041d
        L_0x018b:
            java.lang.Object r4 = r14.A00
            X.5ZS r4 = (X.AnonymousClass5ZS) r4
            int r3 = r5.getActionMasked()
            X.678 r0 = r4.A0C
            boolean r0 = r0.BIf()
            r6 = 0
            if (r0 == 0) goto L_0x020b
            r1 = 1
            if (r3 != r1) goto L_0x01b7
            boolean r0 = r4.A0Q()
            if (r0 == 0) goto L_0x041d
            X.5Qv r0 = r4.A0i
            int r1 = r0.A00
            r0 = 2
            if (r1 == r0) goto L_0x041d
            X.5TA r0 = r4.A0I
            boolean r0 = r0.A02()
            r4.A0P(r0)
            goto L_0x041d
        L_0x01b7:
            r2 = 2
            if (r3 != r2) goto L_0x01fa
            int r0 = r5.getPointerCount()
            if (r0 != r1) goto L_0x01fa
            X.5Qv r0 = r4.A0i
            int r0 = r0.A00
            if (r0 == r2) goto L_0x041d
            r4.A0W = r6
            float r1 = r5.getY()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x041d
            X.678 r0 = r4.A0C
            int r3 = r0.getMaxZoom()
            if (r3 <= 0) goto L_0x041d
            android.view.View r0 = r4.A08
            int r0 = r0.getHeight()
            int r0 = r0 / r2
            float r2 = (float) r0
            float r0 = r5.getY()
            float r0 = -r0
            float r1 = java.lang.Math.min(r2, r0)
            float r1 = r1 / r2
            float r0 = (float) r3
            float r0 = r0 * r1
            int r1 = (int) r0
            if (r1 <= 0) goto L_0x01f1
            r6 = 1
        L_0x01f1:
            r4.A0W = r6
            X.678 r0 = r4.A0C
            r0.Bnu(r1)
            goto L_0x041d
        L_0x01fa:
            int r0 = r5.getPointerCount()
            if (r0 <= r1) goto L_0x041d
            boolean r0 = r4.A0W
            if (r0 != 0) goto L_0x041d
            android.view.View r0 = r4.A08
            r0.onTouchEvent(r5)
            goto L_0x041d
        L_0x020b:
            r4.A0W = r6
            goto L_0x041d
        L_0x020f:
            java.lang.Object r0 = r14.A00
            X.4Ww r0 = (X.C87984Ww) r0
            X.8ok r3 = r0.A0D
            X.5nZ r3 = (X.C114765nZ) r3
            int r1 = r5.getAction()
            r6 = 0
            if (r1 == 0) goto L_0x0345
            r2 = 1
            if (r1 == r2) goto L_0x033a
            r0 = 2
            if (r1 == r0) goto L_0x0229
            r0 = 3
            if (r1 == r0) goto L_0x033a
            goto L_0x041d
        L_0x0229:
            X.5LQ r11 = r3.A09
            android.view.View r0 = r11.A06
            if (r0 != 0) goto L_0x041d
            androidx.recyclerview.widget.RecyclerView r0 = r3.A06
            X.0Xs r1 = r0.getLayoutManager()
            if (r1 == 0) goto L_0x041d
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            float r4 = r3.A01
            float r0 = r5.getY()
            float r4 = r4 - r0
            float r8 = r3.A00
            float r0 = r5.getX()
            float r8 = r8 - r0
            r7 = 0
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x032d
            int r1 = r1.A1I()
            X.4Ww r0 = r3.A02
            int r0 = r0.A0G()
            int r0 = r0 - r2
            if (r1 >= r0) goto L_0x025d
        L_0x0259:
            float r7 = java.lang.Math.abs(r8)
        L_0x025d:
            android.content.Context r0 = r3.A05
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165436(0x7f0700fc, float:1.794509E38)
            float r1 = r1.getDimension(r0)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0335
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x041d
            X.4sy r15 = (X.C95274sy) r15
            com.whatsapp.gallerypicker.PhotoViewPager r8 = r3.A08
            float r7 = r5.getX()
            float r5 = r5.getY()
            r11.A06 = r15
            X.5YF r0 = r15.A05
            android.net.Uri r0 = r0.A0G
            r11.A04 = r0
            android.widget.ImageView r4 = r11.A09
            android.graphics.drawable.Drawable r0 = r15.getDrawable()
            r4.setImageDrawable(r0)
            int r0 = r15.getWidth()
            r4.setMaxWidth(r0)
            int r0 = r15.getHeight()
            r4.setMaxHeight(r0)
            int r1 = r15.getWidth()
            int r0 = r15.getHeight()
            X.C86624Kv.A10(r4, r1, r0)
            r11.A00 = r7
            r11.A01 = r5
            android.view.View r0 = r11.A06
            r0.invalidate()
            android.os.Handler r5 = r11.A0C
            java.lang.Runnable r4 = r11.A0D
            r5.removeCallbacks(r4)
            r0 = 100
            r5.postDelayed(r4, r0)
            android.view.View r10 = r11.A05
            r10.setBackgroundColor(r6)
            android.widget.TextView r9 = r11.A0A
            r9.setTextColor(r6)
            android.graphics.drawable.Drawable r0 = r11.A03
            r0.setAlpha(r6)
            android.view.ViewGroup r12 = r11.A08
            r12.setVisibility(r6)
            android.view.ViewGroup r7 = r11.A07
            int[] r5 = r11.A0E
            r7.getLocationOnScreen(r5)
            r13 = r5[r6]
            r4 = r5[r2]
            android.view.View r0 = r11.A06
            r0.getLocationOnScreen(r5)
            r1 = r5[r6]
            int r1 = r1 - r13
            r0 = r5[r2]
            int r0 = r0 - r4
            r7.setPadding(r1, r0, r6, r6)
            int r0 = r12.getHeight()
            int r0 = X.C86664Kz.A0D(r8, r0)
            r10.setPadding(r6, r6, r6, r0)
            r9.getLocationOnScreen(r5)
            X.6I4 r0 = r15.A07
            if (r0 == 0) goto L_0x041d
            X.8j9 r4 = r3.A04
            if (r4 == 0) goto L_0x041d
            int r3 = r0.A01()
            com.whatsapp.mediacomposer.MediaComposerActivity r4 = (com.whatsapp.mediacomposer.MediaComposerActivity) r4
            r4.A1d = r2
            X.5Us r0 = r4.A0t
            X.08M r0 = r0.A02
            int r0 = X.C86604Kt.A05(r0)
            if (r0 == r3) goto L_0x041d
            X.5Us r2 = r4.A0t
            X.08M r1 = r2.A02
            int r0 = X.C86604Kt.A05(r1)
            if (r0 == r3) goto L_0x0322
            X.C06270Wx.A03(r1, r3)
            r2.A04(r6)
        L_0x0322:
            X.5nY r0 = r4.A0w
            X.5nZ r0 = r0.A08
            X.4Ww r0 = r0.A02
            r0.A05()
            goto L_0x041d
        L_0x032d:
            int r0 = r1.A1G()
            if (r0 <= 0) goto L_0x025d
            goto L_0x0259
        L_0x0335:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.A00 = r0
            goto L_0x034f
        L_0x033a:
            X.5LQ r0 = r3.A09
            android.os.Handler r1 = r0.A0C
            java.lang.Runnable r0 = r0.A0D
            r1.removeCallbacks(r0)
            goto L_0x041d
        L_0x0345:
            float r0 = r5.getX()
            r3.A00 = r0
            float r0 = r5.getY()
        L_0x034f:
            r3.A01 = r0
            goto L_0x041d
        L_0x0353:
            r5.getX()
            r5.getY()
            r15.performClick()
            goto L_0x041d
        L_0x035e:
            java.lang.Object r0 = r14.A00
            com.whatsapp.notification.PopupNotification r0 = (com.whatsapp.notification.PopupNotification) r0
            boolean r0 = r0.A6t()
            return r0
        L_0x0367:
            X.5ZF r1 = r3.A07
            X.4Rm r0 = r1.A04
            if (r0 == 0) goto L_0x041d
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x041d
            X.4Rm r4 = r1.A04
            float r0 = r5.getX()
            int r11 = (int) r0
            float r0 = r5.getY()
            int r10 = (int) r0
            android.view.View r9 = r4.getContentView()
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int[] r8 = r4.A01
            r15.getLocationOnScreen(r8)
            r7 = 0
            r0 = r8[r7]
            int r11 = r11 + r0
            r6 = 1
            r0 = r8[r6]
            int r10 = r10 + r0
            int r12 = r9.getChildCount()
            android.view.View r3 = r4.A00
            r0 = 0
            r4.A00 = r0
            r2 = 0
        L_0x039c:
            if (r2 >= r12) goto L_0x03e4
            android.view.View r1 = r9.getChildAt(r2)
            r1.getLocationOnScreen(r8)
            r13 = r8[r7]
            if (r11 <= r13) goto L_0x03e1
            int r0 = r1.getWidth()
            int r13 = r13 + r0
            if (r11 >= r13) goto L_0x03e1
            r0 = r8[r6]
            if (r10 <= r0) goto L_0x03e1
            int r0 = X.C86664Kz.A0C(r1, r0)
            if (r10 >= r0) goto L_0x03e1
            r1.setPressed(r6)
            r4.A00 = r1
        L_0x03bf:
            if (r3 == 0) goto L_0x03c8
            android.view.View r0 = r4.A00
            if (r3 == r0) goto L_0x03c8
            r3.setPressed(r7)
        L_0x03c8:
            int r0 = r5.getAction()
            if (r0 != r6) goto L_0x041d
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x041d
            int[][] r0 = r4.A04
            r1 = r0[r2]
            X.4A4 r0 = r4.A03
            if (r0 == 0) goto L_0x03dd
            r0.Bbj(r1)
        L_0x03dd:
            r4.dismiss()
            goto L_0x041d
        L_0x03e1:
            int r2 = r2 + 1
            goto L_0x039c
        L_0x03e4:
            r2 = 0
            goto L_0x03bf
        L_0x03e6:
            java.lang.Object r3 = r14.A00
            com.whatsapp.status.playback.StatusPlaybackActivity r3 = (com.whatsapp.status.playback.StatusPlaybackActivity) r3
            int r0 = r5.getAction()
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r2 == r1) goto L_0x03f6
            r0 = 3
            if (r2 != r0) goto L_0x041d
        L_0x03f6:
            int r0 = r5.getPointerCount()
            if (r0 != r1) goto L_0x041d
            androidx.viewpager.widget.ViewPager r0 = r3.A07
            int r0 = r0.getCurrentItem()
            com.whatsapp.status.playback.fragment.StatusPlaybackFragment r2 = r3.A74(r0)
            if (r2 == 0) goto L_0x041d
            boolean r0 = r2 instanceof com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment
            if (r0 == 0) goto L_0x0423
            r1 = r2
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r1
            boolean r0 = r1 instanceof com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment
            if (r0 == 0) goto L_0x041f
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x041d
            boolean r0 = r1.A0q
            if (r0 == 0) goto L_0x0423
        L_0x041d:
            r0 = 0
            return r0
        L_0x041f:
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x041d
        L_0x0423:
            r2.A1I()
            goto L_0x041d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5CS.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
