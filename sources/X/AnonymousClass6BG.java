package X;

import android.view.ViewTreeObserver;

/* renamed from: X.6BG  reason: invalid class name */
public class AnonymousClass6BG implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public AnonymousClass6BG(C113245l7 r1, int i) {
        this.A01 = i;
        if (18 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass6BG(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r1.removeOnGlobalLayoutListener(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03d7, code lost:
        if (r5.A7F() == false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0400, code lost:
        r0 = r0.getViewTreeObserver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0404, code lost:
        r0.removeOnGlobalLayoutListener(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0407, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x044d, code lost:
        if (r3.A0k.isShowing() != false) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x044f, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0451, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0454, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x05f1, code lost:
        if ((!r3.A02.canScrollVertically(1)) != false) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x025b, code lost:
        r4.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x009c;
                case 1: goto L_0x00b4;
                case 2: goto L_0x00e0;
                case 3: goto L_0x010b;
                case 4: goto L_0x0533;
                case 5: goto L_0x053b;
                case 6: goto L_0x0552;
                case 7: goto L_0x002f;
                case 8: goto L_0x019e;
                case 9: goto L_0x055a;
                case 10: goto L_0x059f;
                case 11: goto L_0x05da;
                case 12: goto L_0x05fd;
                case 13: goto L_0x01c6;
                case 14: goto L_0x0605;
                case 15: goto L_0x0087;
                case 16: goto L_0x063a;
                case 17: goto L_0x0650;
                case 18: goto L_0x01ef;
                case 19: goto L_0x0213;
                case 20: goto L_0x0226;
                case 21: goto L_0x023f;
                case 22: goto L_0x066d;
                case 23: goto L_0x025f;
                case 24: goto L_0x0289;
                case 25: goto L_0x02dc;
                case 26: goto L_0x0308;
                case 27: goto L_0x0681;
                case 28: goto L_0x002e;
                case 29: goto L_0x0333;
                case 30: goto L_0x0355;
                case 31: goto L_0x03c1;
                case 32: goto L_0x0408;
                case 33: goto L_0x0455;
                case 34: goto L_0x04a6;
                case 35: goto L_0x04ef;
                case 36: goto L_0x06ad;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r15.A00
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r2 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r2
            X.8jc r1 = r2.A0B
            if (r1 == 0) goto L_0x0015
            int r0 = r2.getPreviewWavesSegmentsCount()
            X.5pp r1 = (X.C116155pp) r1
            r1.A00 = r0
        L_0x0015:
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r2.A08
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r2.A08
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x002e
            boolean r0 = r1.isAlive()
            if (r0 == 0) goto L_0x002e
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.A0K
        L_0x002b:
            r1.removeOnGlobalLayoutListener(r0)
        L_0x002e:
            return
        L_0x002f:
            java.lang.Object r3 = r15.A00
            X.4kC r3 = (X.C91504kC) r3
            r3.A07()
            android.widget.ListView r0 = r3.A0I
            X.C86624Kv.A16(r0, r15)
            int r1 = r3.getWidth()
            int r0 = r3.getHeight()
            if (r1 <= r0) goto L_0x005e
            boolean r0 = r3.A0Y
            if (r0 != 0) goto L_0x005e
            android.app.Activity r0 = X.C111095hX.A04(r3)
            X.03q r0 = (X.C003203q) r0
            r0.A5V()
            android.widget.ListView r2 = r3.A0I
            r1 = 3
            X.5ab r0 = new X.5ab
            r0.<init>(r3, r1)
            r2.setOnScrollListener(r0)
            return
        L_0x005e:
            int r0 = r3.getMeasuredWidth()
            int r2 = r3.A04(r0)
            int r0 = r3.getMeasuredWidth()
            int r0 = r3.A03(r0)
            int r2 = r2 - r0
            r3.A08 = r2
            android.widget.ListView r1 = r3.A0I
            r0 = 0
            r1.setSelectionFromTop(r0, r2)
            int r0 = r3.A08
            r3.setScrollPos(r0)
            android.widget.ListView r4 = r3.A0I
            r0 = 16
            X.3cI r1 = new X.3cI
            r1.<init>((X.C91504kC) r3, (int) r0)
            goto L_0x025b
        L_0x0087:
            java.lang.Object r1 = r15.A00
            X.4mS r1 = (X.C92314mS) r1
            r1.A06()
            java.lang.String r0 = "ConversationPickerView/updateViewSize"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1.A05()
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            goto L_0x0404
        L_0x009c:
            java.lang.Object r1 = r15.A00
            com.whatsapp.ConversationFragment r1 = (com.whatsapp.ConversationFragment) r1
            X.4np r0 = r1.A02
            X.C86604Kt.A1G(r0, r15)
            X.4np r2 = r1.A02
            r1 = 1
            X.4eZ r0 = r2.getWaBaseActivity()
            if (r0 == 0) goto L_0x002e
            X.5l7 r0 = r2.A03
            r0.A2G(r1)
            return
        L_0x00b4:
            java.lang.Object r3 = r15.A00
            X.5ZF r3 = (X.AnonymousClass5ZF) r3
            androidx.viewpager.widget.ViewPager r0 = r3.A0K
            int r2 = r0.getWidth()
            android.content.res.Resources r1 = X.C18290x4.A0G(r0)
            r0 = 2131166390(0x7f0704b6, float:1.7947024E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 / r0
            int r0 = r3.A01
            if (r0 == r2) goto L_0x002e
            r3.A01 = r2
            X.4OW[] r3 = r3.A0T
            int r2 = r3.length
            r1 = 0
        L_0x00d4:
            if (r1 >= r2) goto L_0x002e
            r0 = r3[r1]
            if (r0 == 0) goto L_0x00dd
            r0.notifyDataSetChanged()
        L_0x00dd:
            int r1 = r1 + 1
            goto L_0x00d4
        L_0x00e0:
            java.lang.Object r4 = r15.A00
            X.4bn r4 = (X.C89154bn) r4
            X.67C r3 = r4.A08
            if (r3 == 0) goto L_0x002e
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x00f9
            r2 = 1
        L_0x00ed:
            X.5kB r3 = (X.C112715kB) r3
            r3.A03 = r2
            X.8u3 r0 = r3.A00
            if (r0 == 0) goto L_0x002e
            r0.setShouldHideCallDuration(r2)
            return
        L_0x00f9:
            android.view.View r1 = r4.A06
            r2 = 0
            if (r1 == 0) goto L_0x00ed
            int r0 = r4.A00
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x00ed
            boolean r2 = X.C86654Ky.A1U(r0)
            goto L_0x00ed
        L_0x010b:
            java.lang.Object r6 = r15.A00
            X.5id r6 = (X.C111755id) r6
            X.4kC r3 = r6.A0o
            X.C86624Kv.A16(r3, r15)
            X.5dt r0 = r6.A0L
            int r5 = r3.getMeasuredWidth()
            if (r0 == 0) goto L_0x0181
            X.7yC r4 = r0.A04
            if (r4 == 0) goto L_0x0181
            X.5ia r0 = r6.A0O
            if (r0 == 0) goto L_0x013b
            X.7yC r0 = r0.A03
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r4.A00
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 != 0) goto L_0x002e
            X.5Kw r0 = r6.A19
            X.5ia r1 = r6.A0O
            X.1LX r0 = r0.A00
            if (r0 == 0) goto L_0x013b
            r0.A01(r1)
        L_0x013b:
            X.5Fp r2 = new X.5Fp
            r2.<init>(r6)
            int r0 = r3.A04(r5)
            X.5ia r1 = new X.5ia
            r1.<init>(r2, r4, r5, r0)
            r6.A0O = r1
            X.5Kw r2 = r6.A19
            X.1LX r3 = r2.A00
            if (r3 != 0) goto L_0x017c
            X.2oU r0 = r2.A04
            android.content.Context r0 = r0.A00
            java.io.File r3 = r0.getCacheDir()
            java.lang.String r0 = "cover_photos"
            java.io.File r12 = X.AnonymousClass002.A0A(r3, r0)
            X.5iZ r6 = new X.5iZ
            r6.<init>()
            X.2sH r7 = r2.A03
            X.1VX r8 = r2.A05
            X.3Wi r4 = r2.A01
            X.2s4 r5 = r2.A02
            X.4FV r9 = r2.A06
            X.1i8 r11 = r2.A08
            X.2pd r10 = r2.A07
            r14 = 1
            java.lang.String r13 = "cover-photo-loader"
            X.1LX r3 = new X.1LX
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2.A00 = r3
        L_0x017c:
            r0 = 1
            r3.A02(r1, r0)
            return
        L_0x0181:
            r1 = 0
            boolean r0 = r3 instanceof com.whatsapp.chatinfo.view.custom.BusinessChatInfoLayout
            if (r0 == 0) goto L_0x002e
            r0 = 2131432437(0x7f0b13f5, float:1.8486631E38)
            android.widget.ImageView r0 = X.AnonymousClass0x9.A0E(r3, r0)
            r0.setImageDrawable(r1)
            r3.A09()
            android.widget.ListView r0 = r3.A0I
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 7
            A00(r1, r3, r0)
            return
        L_0x019e:
            java.lang.Object r3 = r15.A00
            X.4kC r3 = (X.C91504kC) r3
            android.widget.ListView r0 = r3.A0I
            X.C86624Kv.A16(r0, r15)
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x002e
            int r0 = r3.getMeasuredWidth()
            int r2 = r3.A04(r0)
            int r0 = r3.getMeasuredWidth()
            int r0 = r3.A03(r0)
            int r2 = r2 - r0
            android.widget.ListView r1 = r3.A0I
            r0 = 0
            r1.setSelectionFromTop(r0, r2)
            r3.setScrollPos(r2)
            return
        L_0x01c6:
            int[] r3 = X.C86664Kz.A1Z()
            java.lang.Object r2 = r15.A00
            X.4Rp r2 = (X.AnonymousClass4Rp) r2
            android.view.View r4 = r2.A05
            r4.getLocationOnScreen(r3)
            boolean r0 = r2.isShowing()
            if (r0 != 0) goto L_0x01dd
            r2.A04()
            return
        L_0x01dd:
            int r1 = r2.A01
            r0 = 0
            r0 = r3[r0]
            if (r1 == r0) goto L_0x002e
            r2.A04()
            r0 = 38
            X.3Zj r1 = new X.3Zj
            r1.<init>(r15, r0)
            goto L_0x025b
        L_0x01ef:
            java.lang.Object r2 = r15.A00
            X.5l7 r2 = (X.C113245l7) r2
            android.graphics.Rect r1 = X.AnonymousClass001.A0N()
            android.view.ViewGroup r0 = r2.A0U
            r0.getWindowVisibleDisplayFrame(r1)
            int r1 = r1.height()
            int r0 = r2.A04
            int r1 = r1 + r0
            int r0 = r2.A02
            if (r1 == r0) goto L_0x002e
            android.widget.FrameLayout$LayoutParams r0 = r2.A0b
            r0.height = r1
            android.view.View r0 = r2.A0K
            r0.requestLayout()
            r2.A02 = r1
            return
        L_0x0213:
            java.lang.Object r1 = r15.A00
            X.5l7 r1 = (X.C113245l7) r1
            android.view.View r0 = r1.A0E
            X.C86604Kt.A1G(r0, r15)
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r4 = r1.A40
            if (r4 == 0) goto L_0x002e
            r0 = 5
            X.5sE r1 = X.C117625sE.A00(r15, r0)
            goto L_0x025b
        L_0x0226:
            java.lang.Object r3 = r15.A00
            X.5RH r3 = (X.AnonymousClass5RH) r3
            X.5Rl r2 = r3.A0R
            if (r2 == 0) goto L_0x002e
            X.4ZC r0 = r3.A09
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = "ice_breaker_recycler_view_render_complete"
            r2.A00(r1)
            r0 = 2
            r2.A02(r1, r0)
            X.4ZC r0 = r3.A09
            goto L_0x0400
        L_0x023f:
            java.lang.Object r2 = r15.A00
            X.5YE r2 = (X.AnonymousClass5YE) r2
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L_0x0250
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0250
            r0.removeOnGlobalLayoutListener(r15)
        L_0x0250:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r4 = r2.A0F
            if (r4 == 0) goto L_0x002e
            r0 = 12
            X.3Zl r1 = new X.3Zl
            r1.<init>(r2, r0)
        L_0x025b:
            r4.post(r1)
            return
        L_0x025f:
            java.lang.Object r2 = r15.A00
            com.whatsapp.home.ui.StarredMessagesPlaceholderActivity r2 = (com.whatsapp.home.ui.StarredMessagesPlaceholderActivity) r2
            android.graphics.Rect r1 = X.AnonymousClass001.A0N()
            android.view.ViewGroup r0 = r2.A04
            if (r0 == 0) goto L_0x026e
            r0.getWindowVisibleDisplayFrame(r1)
        L_0x026e:
            int r1 = r1.height()
            int r0 = r2.A01
            int r1 = r1 + r0
            int r0 = r2.A00
            if (r1 == r0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r0 = r2.A03
            if (r0 == 0) goto L_0x027f
            r0.height = r1
        L_0x027f:
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x0286
            r0.requestLayout()
        L_0x0286:
            r2.A00 = r1
            return
        L_0x0289:
            java.lang.Object r4 = r15.A00
            X.5Kv r4 = (X.C102935Kv) r4
            android.view.View r0 = r4.A01
            boolean r1 = X.C105895Wv.A00(r0)
            r3 = 0
            r2 = 8
            X.4c7 r0 = r4.A05
            boolean r0 = r0.isShowing()
            if (r1 == 0) goto L_0x02bd
            if (r0 != 0) goto L_0x002e
            android.view.View r1 = r4.A00
            int r0 = r1.getVisibility()
            if (r0 != r2) goto L_0x002e
            r5 = 1
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = 0
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r9 = r5
            r11 = r5
            r12 = r8
            r7 = r5
            r10 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.C86644Kx.A13(r1, r4)
            r1.setVisibility(r3)
            return
        L_0x02bd:
            if (r0 != 0) goto L_0x002e
            android.view.View r1 = r4.A00
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x002e
            r4 = 1
            r5 = 0
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r8 = r4
            r10 = r4
            r11 = r5
            r6 = r4
            r9 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.C86644Kx.A13(r1, r3)
            r1.setVisibility(r2)
            return
        L_0x02dc:
            java.lang.Object r5 = r15.A00
            X.4LE r5 = (X.AnonymousClass4LE) r5
            X.4vO r0 = r5.A01
            X.C86624Kv.A16(r0, r15)
            int[] r4 = X.C86664Kz.A1Z()
            X.4vO r0 = r5.A01
            r0.getLocationOnScreen(r4)
            int r1 = r5.A00
            if (r1 == 0) goto L_0x002e
            r3 = 1
            r0 = r4[r3]
            int r1 = r1 - r0
            if (r1 < 0) goto L_0x002e
            X.4vO r0 = r5.A01
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass001.A0T(r0)
            int r1 = r5.A00
            r0 = r4[r3]
            int r1 = r1 - r0
            r0 = 0
            r2.setMargins(r0, r1, r0, r0)
            return
        L_0x0308:
            java.lang.Object r3 = r15.A00
            com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r3 = (com.whatsapp.migration.android.view.GoogleMigrateImporterActivity) r3
            com.whatsapp.WaImageView r1 = r3.A01
            if (r1 == 0) goto L_0x002e
            com.whatsapp.WaTextView r0 = r3.A02
            if (r0 == 0) goto L_0x002e
            X.C86604Kt.A1G(r1, r15)
            com.whatsapp.WaTextView r0 = r3.A03
            X.C86604Kt.A1G(r0, r15)
            com.whatsapp.WaImageView r0 = r3.A01
            int r2 = r0.getHeight()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168902(0x7f070e86, float:1.7952119E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r2 >= r0) goto L_0x002e
            com.whatsapp.WaImageView r2 = r3.A01
            goto L_0x044f
        L_0x0333:
            java.lang.Object r3 = r15.A00
            com.whatsapp.registration.EULA r3 = (com.whatsapp.registration.EULA) r3
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x002e
            X.C86624Kv.A16(r0, r15)
            android.view.View r0 = r3.A01
            int r2 = r0.getHeight()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167998(0x7f070afe, float:1.7950285E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r2 >= r0) goto L_0x002e
            android.view.View r2 = r3.A01
            goto L_0x044f
        L_0x0355:
            java.lang.Object r2 = r15.A00
            com.whatsapp.registration.EULA r2 = (com.whatsapp.registration.EULA) r2
            androidx.core.widget.NestedScrollView r0 = r2.A03
            X.C86604Kt.A1G(r0, r15)
            androidx.core.widget.NestedScrollView r0 = r2.A03
            int r1 = r0.getMeasuredHeight()
            androidx.core.widget.NestedScrollView r0 = r2.A03
            r3 = 0
            android.view.View r0 = r0.getChildAt(r3)
            int r0 = X.C86664Kz.A0D(r0, r1)
            r1 = 1
            if (r0 >= 0) goto L_0x0373
            r3 = 1
        L_0x0373:
            int r0 = X.C86604Kt.A02(r2)
            if (r0 != r1) goto L_0x039b
            r0 = 2131429893(0x7f0b0a05, float:1.8481472E38)
            android.view.View r1 = r2.findViewById(r0)
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            if (r1 == 0) goto L_0x002e
            if (r3 == 0) goto L_0x0392
            r0 = 1090519040(0x41000000, float:8.0)
            r1.setCardElevation(r0)
            r0 = 2131100302(0x7f06028e, float:1.7812982E38)
        L_0x038e:
            X.C86604Kt.A0z(r2, r1, r0)
            return
        L_0x0392:
            r0 = 0
            r1.setCardElevation(r0)
            int r0 = X.AnonymousClass5Yj.A01(r2)
            goto L_0x038e
        L_0x039b:
            int r1 = X.C86604Kt.A02(r2)
            r0 = 2
            if (r1 != r0) goto L_0x002e
            r0 = 2131429051(0x7f0b06bb, float:1.8479764E38)
            android.view.View r2 = r2.findViewById(r0)
            if (r2 == 0) goto L_0x002e
            if (r3 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r0 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x002e
            android.widget.FrameLayout$LayoutParams r1 = X.C86664Kz.A0r(r2)
            r0 = 48
            r1.gravity = r0
            r2.setLayoutParams(r1)
            return
        L_0x03c1:
            java.lang.Object r5 = r15.A00
            com.whatsapp.status.playback.MessageReplyActivity r5 = (com.whatsapp.status.playback.MessageReplyActivity) r5
            android.content.res.Configuration r4 = X.AnonymousClass001.A0M(r5)
            android.widget.FrameLayout r3 = r5.A08
            boolean r0 = r5.A7G(r4)
            r2 = 0
            if (r0 != 0) goto L_0x03d9
            boolean r1 = r5.A7F()
            r0 = 0
            if (r1 != 0) goto L_0x03db
        L_0x03d9:
            r0 = 8
        L_0x03db:
            r3.setVisibility(r0)
            boolean r0 = r5.A7G(r4)
            if (r0 != 0) goto L_0x002e
            int r1 = r4.orientation
            r0 = 2
            if (r1 != r0) goto L_0x03f8
            boolean r0 = X.AnonymousClass4SG.A43(r5)
            if (r0 == 0) goto L_0x03f8
            android.view.View r0 = r5.A05
            boolean r0 = X.C105895Wv.A00(r0)
            if (r0 != 0) goto L_0x03f8
            r2 = 1
        L_0x03f8:
            boolean r0 = r5.A7H(r2)
            if (r0 == 0) goto L_0x002e
            android.view.ViewGroup r0 = r5.A07
        L_0x0400:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
        L_0x0404:
            r0.removeOnGlobalLayoutListener(r15)
            return
        L_0x0408:
            java.lang.Object r3 = r15.A00
            com.whatsapp.status.playback.StatusReplyActivity r3 = (com.whatsapp.status.playback.StatusReplyActivity) r3
            r3.A7I()
            android.view.View r0 = r3.A05
            java.lang.Runnable r4 = r3.A07
            r0.removeCallbacks(r4)
            android.view.View r2 = r3.A05
            android.content.res.Resources r1 = r3.getResources()
            r0 = 17694722(0x10e0002, float:2.6081287E-38)
            int r0 = r1.getInteger(r0)
            long r0 = (long) r0
            r2.postDelayed(r4, r0)
            android.content.res.Configuration r1 = X.AnonymousClass001.A0M(r3)
            boolean r0 = X.AnonymousClass4SG.A43(r3)
            if (r0 == 0) goto L_0x002e
            int r1 = r1.orientation
            r0 = 2
            if (r1 != r0) goto L_0x002e
            android.widget.FrameLayout r2 = r3.A08
            android.view.View r0 = r3.A05
            boolean r0 = X.C105895Wv.A00(r0)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r3.A7F()
            if (r0 == 0) goto L_0x044f
            X.4qq r0 = r3.A0k
            boolean r1 = r0.isShowing()
            r0 = 0
            if (r1 == 0) goto L_0x0451
        L_0x044f:
            r0 = 8
        L_0x0451:
            r2.setVisibility(r0)
            return
        L_0x0455:
            java.lang.Object r7 = r15.A00
            X.5f6 r7 = (X.C109735f6) r7
            java.lang.Object r8 = r7.A04
            android.view.View r8 = (android.view.View) r8
            java.lang.Object r6 = r7.A00
            int[] r6 = (int[]) r6
            r8.getLocationOnScreen(r6)
            java.lang.Object r5 = r7.A01
            int[] r5 = (int[]) r5
            r4 = 0
            r0 = r5[r4]
            r3 = r6[r4]
            r2 = 1
            if (r0 != r3) goto L_0x0476
            r1 = r5[r2]
            r0 = r6[r2]
            if (r1 == r0) goto L_0x002e
        L_0x0476:
            r5[r4] = r3
            r0 = r6[r2]
            r5[r2] = r0
            java.lang.Object r1 = r7.A05
            X.0Th r1 = (X.C05430Th) r1
            X.0QK r0 = r1.A05
            r0.A01()
            r1.A00()
            java.lang.Object r0 = r7.A06
            if (r0 != 0) goto L_0x049c
            android.view.ViewTreeObserver r1 = r8.getViewTreeObserver()
            X.C626936e.A06(r1)
            r7.A06 = r1
            java.lang.Object r0 = r7.A02
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r0
            r1.addOnGlobalLayoutListener(r0)
        L_0x049c:
            java.lang.Object r0 = r7.A03
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = (com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r0
            r0.A06 = r2
            r0.A1I()
            return
        L_0x04a6:
            java.lang.Object r5 = r15.A00
            com.whatsapp.status.playback.widget.VoiceStatusContentView r5 = (com.whatsapp.status.playback.widget.VoiceStatusContentView) r5
            X.8jY r4 = r5.A07
            if (r4 == 0) goto L_0x04d7
            int r3 = r5.getPreviewWavesSegmentsCount()
            X.5pQ r4 = (X.C115905pQ) r4
            X.08M r0 = r4.A03
            X.C06270Wx.A03(r0, r3)
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x04d7
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r3)
            r1 = 0
        L_0x04c2:
            if (r1 >= r3) goto L_0x04cf
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x04c2
        L_0x04cf:
            X.8pT r0 = r4.A08
            r0.setVoiceVisualizerSegments(r2)
            r0 = 1
            r4.A00 = r0
        L_0x04d7:
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r5.A03
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r5.A03
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x002e
            boolean r0 = r1.isAlive()
            if (r0 == 0) goto L_0x002e
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r5.A0H
            goto L_0x002b
        L_0x04ef:
            java.lang.Object r4 = r15.A00
            com.whatsapp.stickers.store.StickerStoreTabFragment r4 = (com.whatsapp.stickers.store.StickerStoreTabFragment) r4
            androidx.recyclerview.widget.LinearLayoutManager r0 = r4.A03
            int r1 = r0.A1H()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A04
            X.0Ua r1 = r0.A0F(r1)
            boolean r0 = r1 instanceof X.C88454Yu
            if (r0 == 0) goto L_0x002e
            X.4Yu r1 = (X.C88454Yu) r1
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0F
            int r3 = r0.getWidth()
            android.content.res.Resources r1 = X.C18290x4.A0G(r0)
            r0 = 2131168378(0x7f070c7a, float:1.7951056E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = X.C08310eF.A09(r4)
            r0 = 2131168379(0x7f070c7b, float:1.7951058E38)
            int r0 = X.C86654Ky.A02(r1, r0, r2)
            int r3 = r3 / r0
            r0 = 5
            int r1 = java.lang.Math.min(r3, r0)
            int r0 = r4.A00
            if (r0 == r1) goto L_0x002e
            r4.A00 = r1
            X.4Wi r0 = r4.A0E
            r0.A05()
            return
        L_0x0533:
            java.lang.Object r0 = r15.A00
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            r0.A76()
            return
        L_0x053b:
            java.lang.Object r2 = r15.A00
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet r2 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet) r2
            android.view.View r0 = r2.A03
            X.C86624Kv.A16(r0, r15)
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x054e
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A07
            r0 = 4
            r1.A0S(r0)
        L_0x054e:
            r0 = 0
            r2.A09 = r0
            return
        L_0x0552:
            java.lang.Object r0 = r15.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            r0.A7K()
            return
        L_0x055a:
            java.lang.Object r3 = r15.A00
            com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView r3 = (com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView) r3
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            X.C86624Kv.A16(r0, r15)
            r0 = 0
            r3.A0B = r0
            int r0 = r3.getWidth()
            r3.A02 = r0
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            int r1 = r0.getLeft()
            r3.A05 = r1
            int r0 = r3.A0E
            int r1 = r1 - r0
            r3.A03 = r1
            int r1 = r3.A06
            int r0 = r3.A01
            r3.A01(r1, r0)
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            int r2 = r0.getWidth()
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r0 = r3.A09
            int r0 = r0.getHeight()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r2, r0)
            r0 = 17
            r1.gravity = r0
            android.widget.ImageView r0 = r3.A07
            r0.setLayoutParams(r1)
            r0 = 0
            r3.setAnimationValue(r0)
            return
        L_0x059f:
            java.lang.Object r3 = r15.A00
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            com.whatsapp.TextEmojiLabel r0 = r3.A0N
            X.C86604Kt.A1G(r0, r15)
            X.0R8 r2 = r3.getSupportActionBar()
            com.google.android.material.appbar.AppBarLayout r1 = r3.A0H
            X.33j r11 = r3.A00
            android.widget.ImageView r6 = r3.A0A
            com.whatsapp.TextEmojiLabel r9 = r3.A0N
            com.whatsapp.TextEmojiLabel r10 = r3.A0M
            android.widget.TextView r7 = r3.A0D
            android.widget.TextView r8 = r3.A0C
            X.C86634Kw.A15(r3, r2)
            r0 = 1
            r2.A0O(r0)
            android.view.View r5 = r2.A03()
            X.C626936e.A04(r5)
            X.6h8 r4 = new X.6h8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.A02(r4)
            r3.A0O = r4
            X.08M r1 = r4.A09
            r0 = 105(0x69, float:1.47E-43)
            X.AnonymousClass6C6.A01(r3, r1, r0)
            return
        L_0x05da:
            java.lang.Object r3 = r15.A00
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r3 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r3
            android.widget.ScrollView r0 = r3.A02
            boolean r0 = X.C57652tz.A01(r0)
            r2 = 0
            if (r0 == 0) goto L_0x05f3
            android.widget.ScrollView r1 = r3.A02
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            r0 = r0 ^ 1
            r1 = 1
            if (r0 == 0) goto L_0x05f4
        L_0x05f3:
            r1 = 0
        L_0x05f4:
            android.view.View r0 = r3.A01
            if (r1 != 0) goto L_0x05f9
            r2 = 4
        L_0x05f9:
            r0.setVisibility(r2)
            return
        L_0x05fd:
            java.lang.Object r0 = r15.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r0 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r0
            r0.A1W()
            return
        L_0x0605:
            java.lang.Object r0 = r15.A00
            X.4Rp r0 = (X.AnonymousClass4Rp) r0
            com.whatsapp.components.CircularRevealView r4 = r0.A0B
            X.C86604Kt.A1G(r4, r15)
            r0.A05()
            r0 = 0
            r4.setVisibility(r0)
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = r4.A00
            int r2 = r4.A01
            r1 = 0
            float r0 = (float) r0
            android.animation.Animator r2 = android.view.ViewAnimationUtils.createCircularReveal(r4, r3, r2, r1, r0)
            int r0 = r4.A02
            long r0 = (long) r0
            r2.setDuration(r0)
            android.animation.Animator$AnimatorListener r0 = r4.A03
            r2.addListener(r0)
            r2.start()
            return
        L_0x063a:
            java.lang.Object r1 = r15.A00
            X.67q r1 = (X.C1232367q) r1
            java.lang.Object r0 = r1.A00
            android.view.View r0 = (android.view.View) r0
            X.C86624Kv.A16(r0, r15)
            java.lang.Object r1 = r1.A01
            X.4M5 r1 = (X.AnonymousClass4M5) r1
            r0 = -1
            r1.A00 = r0
            r1.invalidateSelf()
            return
        L_0x0650:
            java.lang.Object r1 = r15.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r1
            android.widget.ListView r0 = r1.A02
            X.C86624Kv.A16(r0, r15)
            android.widget.ListView r2 = r1.A02
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165186(0x7f070002, float:1.7944582E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r1 = r0 * 3
            r0 = 1
            r2.setSelectionFromTop(r0, r1)
            return
        L_0x066d:
            java.lang.Object r1 = r15.A00
            com.whatsapp.group.GroupProfileEmojiEditor r1 = (com.whatsapp.group.GroupProfileEmojiEditor) r1
            com.whatsapp.KeyboardPopupLayout r0 = r1.A07
            X.C86604Kt.A1G(r0, r15)
            X.5mT r0 = r1.A0F
            X.4qq r0 = r0.A05
            X.C626936e.A06(r0)
            r0.A09()
            return
        L_0x0681:
            java.lang.Object r2 = r15.A00
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r2 = (com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r2
            androidx.core.widget.NestedScrollView r0 = r2.A08
            X.C86604Kt.A1G(r0, r15)
            android.view.View r0 = r2.A02
            float r1 = r0.getY()
            androidx.core.widget.NestedScrollView r0 = r2.A08
            float r0 = X.C86664Kz.A02(r0)
            float r1 = r1 - r0
            androidx.core.widget.NestedScrollView r0 = r2.A08
            int r0 = r0.getScrollY()
            float r0 = (float) r0
            float r1 = r1 - r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)
            r1 = r0 ^ 1
            r0 = 0
            r2.A1c(r1, r0)
            return
        L_0x06ad:
            java.lang.Object r3 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r3 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r3
            android.view.ViewGroup r0 = r3.A09
            X.C86604Kt.A1G(r0, r15)
            android.view.ViewGroup r1 = r3.A09
            float r0 = X.C86664Kz.A02(r1)
            r1.setTranslationY(r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r0 = 0
            X.AnonymousClass4SG.A3w(r3, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BG.onGlobalLayout():void");
    }

    public AnonymousClass6BG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
