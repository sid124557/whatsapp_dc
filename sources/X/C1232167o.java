package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.67o  reason: invalid class name and case insensitive filesystem */
public class C1232167o extends AnonymousClass7XV {
    public Object A00;
    public final int A01;

    public C1232167o(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(BottomSheetBehavior bottomSheetBehavior, Object obj, int i) {
        bottomSheetBehavior.A0a(new C1232167o(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r4.A0O == 4) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r9, float r10) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 2: goto L_0x01cd;
                case 3: goto L_0x00fb;
                case 4: goto L_0x00e7;
                case 5: goto L_0x0005;
                case 6: goto L_0x00cf;
                case 7: goto L_0x00b9;
                case 8: goto L_0x0193;
                case 9: goto L_0x017d;
                case 10: goto L_0x001d;
                case 11: goto L_0x0006;
                case 12: goto L_0x0130;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0005
            java.lang.Object r1 = r8.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0005
            r1.A78()
            r1.A76()
            return
        L_0x001d:
            java.lang.Object r3 = r8.A00
            X.5Y7 r3 = (X.AnonymousClass5Y7) r3
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r3.A07
            if (r4 == 0) goto L_0x002b
            int r2 = r4.A0O
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            r2 = 1
            if (r0 == 0) goto L_0x008c
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x008c
            r8.A03(r9, r2)
            r0 = 0
            r3.A0D = r0
        L_0x0039:
            X.5eH r0 = r3.A0U
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A01
            X.8uh r0 = X.C86664Kz.A1E(r0)
            if (r0 == 0) goto L_0x0046
            r0.BTU(r10)
        L_0x0046:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0P
            X.0Xs r7 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r7 = (androidx.recyclerview.widget.LinearLayoutManager) r7
            if (r7 == 0) goto L_0x009e
            r6 = 1051931443(0x3eb33333, float:0.35)
            float r6 = r6 * r10
            r0 = 1059481190(0x3f266666, float:0.65)
            float r6 = r6 + r0
            r5 = 1055286886(0x3ee66666, float:0.45)
            float r5 = r5 * r10
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            float r5 = r5 + r0
            int r4 = r7.A1H()
            int r2 = r7.A1J()
        L_0x0068:
            if (r4 > r2) goto L_0x009e
            android.view.View r1 = r7.A0P(r4)
            if (r1 == 0) goto L_0x0089
            r1.setScaleX(r6)
            r1.setScaleY(r6)
            int r0 = r3.A01
            if (r4 != r0) goto L_0x0089
            r0 = 2131433485(0x7f0b180d, float:1.8488757E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x0089
            r0.setScaleX(r5)
            r0.setScaleY(r5)
        L_0x0089:
            int r4 = r4 + 1
            goto L_0x0068
        L_0x008c:
            if (r4 == 0) goto L_0x0039
            int r1 = r4.A0O
            r0 = 3
            if (r1 != r0) goto L_0x0039
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0039
            r8.A03(r9, r2)
            r0 = 0
            r3.A0E = r0
            goto L_0x0039
        L_0x009e:
            float r0 = r3.A00
            float r10 = r10 * r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r10
            android.view.View r0 = r3.A0L
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            X.5nf r0 = r3.A0V
            if (r0 == 0) goto L_0x0005
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0M
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            return
        L_0x00b9:
            java.lang.Object r2 = r8.A00
            com.whatsapp.group.GroupProfileEmojiEditor r2 = (com.whatsapp.group.GroupProfileEmojiEditor) r2
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x0005
            float r1 = X.C86664Kz.A02(r0)
            float r0 = r9.getY()
            float r1 = r1 - r0
            int r0 = (int) r1
            r2.A75(r0)
            return
        L_0x00cf:
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            java.lang.Object r2 = r8.A00
            X.5YE r2 = (X.AnonymousClass5YE) r2
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r2.A0F
            if (r1 == 0) goto L_0x0005
            r0 = 1
            r1.A0C(r0)
            boolean r0 = r2.A0I
            if (r0 != 0) goto L_0x0005
            r2.A0B(r9)
            return
        L_0x00e7:
            java.lang.Object r2 = r8.A00
            X.5l7 r2 = (X.C113245l7) r2
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r2.A40
            if (r1 == 0) goto L_0x0005
            r0 = 1
            r1.A0C(r0)
            boolean r0 = r2.A6N
            if (r0 != 0) goto L_0x0005
            r2.A1f(r9)
            return
        L_0x00fb:
            java.lang.Object r3 = r8.A00
            X.5Uk r3 = (X.C105315Uk) r3
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = r3.A0M
            r2.A1X(r10)
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r2.A0U
            if (r0 == 0) goto L_0x010b
            r0.setSlideOffset(r10)
        L_0x010b:
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0005
            int r0 = r3.A01
            if (r0 <= 0) goto L_0x0125
            int r1 = r9.getTop()
            int r0 = r3.A01
            int r1 = r1 - r0
        L_0x011b:
            r2.A1a(r1, r10)
            int r0 = r9.getTop()
            r3.A01 = r0
            return
        L_0x0125:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0I
            int r0 = r0.A0L()
            int r0 = -r0
            float r0 = (float) r0
            float r0 = r0 * r10
            int r1 = (int) r0
            goto L_0x011b
        L_0x0130:
            java.lang.Object r4 = r8.A00
            X.51x r4 = (X.AnonymousClass51x) r4
            X.5LV r7 = r4.A09()
            android.view.View r0 = r7.A06
            r5 = 0
            r0.setVisibility(r5)
            android.view.View r0 = r7.A06
            r0.setAlpha(r10)
            android.view.ViewGroup r6 = r7.A0A
            double r2 = (double) r10
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r1 = java.lang.Math.pow(r2, r0)
            float r0 = (float) r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            r6.setAlpha(r1)
            X.5UY r0 = r7.A0G
            android.view.View r0 = r0.A04()
            r0.setAlpha(r1)
            boolean r0 = r4.A0N()
            if (r0 == 0) goto L_0x0170
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            boolean r0 = r4.A08
            if (r1 == 0) goto L_0x0174
            if (r0 == 0) goto L_0x0170
            r4.A08 = r5
            r4.A0L(r5)
        L_0x0170:
            r4.A0F()
            return
        L_0x0174:
            if (r0 != 0) goto L_0x0170
            r0 = 1
            r4.A08 = r0
            r4.A0L(r0)
            goto L_0x0170
        L_0x017d:
            float r3 = X.C86664Kz.A02(r9)
            float r3 = r3 * r10
            java.lang.Object r2 = r8.A00
            X.5i6 r2 = (X.C111445i6) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0Z
            int r0 = r0.A0L()
            float r1 = (float) r0
            float r1 = r1 + r3
            r0 = 0
            X.C111445i6.A03(r2, r1, r0)
            return
        L_0x0193:
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01b9
            int r3 = r9.getHeight()
            java.lang.Object r2 = r8.A00
            X.5i6 r2 = (X.C111445i6) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0Y
            int r1 = r0.A0L()
            int r3 = r3 - r1
            float r0 = (float) r3
            float r0 = r0 * r10
            float r1 = (float) r1
        L_0x01aa:
            float r1 = r1 + r0
            r0 = 0
            r2.A0M(r1, r0)
        L_0x01af:
            java.lang.Object r0 = r8.A00
            X.5i6 r0 = (X.C111445i6) r0
            com.whatsapp.location.DragBottomSheetIndicator r0 = r0.A0g
            r0.setOffset(r10)
            return
        L_0x01b9:
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 != 0) goto L_0x01af
            java.lang.Object r2 = r8.A00
            X.5i6 r2 = (X.C111445i6) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0Y
            int r0 = r0.A0L()
            float r1 = (float) r0
            float r0 = r1 * r10
            goto L_0x01aa
        L_0x01cd:
            java.lang.Object r2 = r8.A00
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet r2 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet) r2
            float r1 = r2.A01
            int r0 = r9.getTop()
            float r0 = (float) r0
            float r1 = r1 - r0
            float r0 = r2.A00
            float r1 = r1 / r0
            r0 = 1123942400(0x42fe0000, float:127.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r1 = r0 << 24
            android.graphics.drawable.ColorDrawable r0 = r2.A02
            r0.setColor(r1)
            android.view.Window r0 = r2.getWindow()
            r0.setStatusBarColor(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1232167o.A02(android.view.View, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0195, code lost:
        if (r3 == 2) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r0.getVisibility() != 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x03be, code lost:
        X.C86624Kv.A0f((android.app.Activity) r5.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x03c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0413, code lost:
        if (r3 != 5) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x045d, code lost:
        if (r12.A0I.A0O != 4) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x04fd, code lost:
        r2.A0A(r1, false, r0);
        r8.A0O.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cb, code lost:
        r0.A0C(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ce, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x019d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r19, int r20) {
        /*
            r18 = this;
            r5 = r18
            int r0 = r5.A01
            r7 = r19
            r3 = r20
            switch(r0) {
                case 1: goto L_0x03c6;
                case 2: goto L_0x03bb;
                case 3: goto L_0x03fb;
                case 4: goto L_0x0019;
                case 5: goto L_0x000b;
                case 6: goto L_0x00b3;
                case 7: goto L_0x0168;
                case 8: goto L_0x0175;
                case 9: goto L_0x01e4;
                case 10: goto L_0x0235;
                case 11: goto L_0x0388;
                case 12: goto L_0x0513;
                case 13: goto L_0x039f;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 4
            if (r3 == r0) goto L_0x0011
            r0 = 5
            if (r3 != r0) goto L_0x0018
        L_0x0011:
            java.lang.Object r0 = r5.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
        L_0x0018:
            return
        L_0x0019:
            r0 = 5
            r9 = 4
            r4 = 1
            r6 = 0
            if (r3 != r0) goto L_0x006e
            java.lang.Object r8 = r5.A00
            X.5l7 r8 = (X.C113245l7) r8
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r8.A40
            if (r0 == 0) goto L_0x0031
            r0.A0A()
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r8.A40
            r0 = 8
            r1.setVisibility(r0)
        L_0x0031:
            X.C113245l7.A0I(r7, r8)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r8.A0t
            if (r0 == 0) goto L_0x003d
            r8.A6N = r4
            r0.A0S(r9)
        L_0x003d:
            X.676 r0 = r8.A2z
            com.whatsapp.reactions.ReactionsTrayViewModel r2 = r0.getReactionsTrayViewModel()
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r8.A3v
            if (r0 == 0) goto L_0x004e
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            X.676 r0 = r8.A2z
            boolean r0 = r0.BIc()
            if (r0 == 0) goto L_0x0063
            if (r2 == 0) goto L_0x0063
            if (r1 != 0) goto L_0x0063
            X.676 r0 = r8.A2z
            r0.B3M()
            r2.A0D(r6)
        L_0x0063:
            java.lang.Object r0 = r5.A00
            X.5l7 r0 = (X.C113245l7) r0
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r0.A40
            if (r0 == 0) goto L_0x0018
            if (r3 == r4) goto L_0x0018
            goto L_0x00cb
        L_0x006e:
            if (r3 != r9) goto L_0x00a4
            java.lang.Object r2 = r5.A00
            X.5l7 r2 = (X.C113245l7) r2
            boolean r0 = r2.A6N
            if (r0 == 0) goto L_0x007a
            r2.A6N = r6
        L_0x007a:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r2.A40
            if (r1 == 0) goto L_0x0085
            X.5sE r0 = X.C117625sE.A00(r5, r9)
            r1.post(r0)
        L_0x0085:
            boolean r0 = r2.A6i
            if (r0 == 0) goto L_0x008f
            r2.A6i = r6
            r2.A1H()
            return
        L_0x008f:
            boolean r0 = r2.A6h
            if (r0 == 0) goto L_0x0099
            r2.A6h = r6
            X.C113245l7.A0L(r2)
            return
        L_0x0099:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A40
            if (r0 == 0) goto L_0x00a0
            r0.A08()
        L_0x00a0:
            r2.A0c()
            goto L_0x0063
        L_0x00a4:
            r0 = 3
            if (r3 != r0) goto L_0x0063
            java.lang.Object r1 = r5.A00
            X.5l7 r1 = (X.C113245l7) r1
            boolean r0 = r1.A6N
            if (r0 != 0) goto L_0x0018
            r1.A0c()
            goto L_0x0063
        L_0x00b3:
            r2 = 0
            X.C162457s7.A0J(r7, r2)
            r9 = 1
            r6 = 3
            if (r3 == r6) goto L_0x014d
            r4 = 4
            if (r3 == r4) goto L_0x012f
            r0 = 5
            if (r3 == r0) goto L_0x00cf
            if (r3 == r9) goto L_0x0018
        L_0x00c3:
            java.lang.Object r0 = r5.A00
            X.5YE r0 = (X.AnonymousClass5YE) r0
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r0.A0F
            if (r0 == 0) goto L_0x0018
        L_0x00cb:
            r0.A0C(r3)
            return
        L_0x00cf:
            java.lang.Object r8 = r5.A00
            X.5YE r8 = (X.AnonymousClass5YE) r8
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r8.A0F
            if (r0 == 0) goto L_0x00da
            r0.A0A()
        L_0x00da:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r8.A0F
            X.C18270x1.A0p(r0)
            X.8rh r0 = r8.A0E
            if (r0 == 0) goto L_0x00e6
            r0.BUJ()
        L_0x00e6:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131888879(0x7f120aef, float:1.9412406E38)
            java.lang.String r2 = r1.getString(r0)
            r1 = 2131231686(0x7f0803c6, float:1.807946E38)
            android.widget.ImageButton r0 = r8.A05
            if (r0 == 0) goto L_0x00fb
            r0.setImageResource(r1)
        L_0x00fb:
            android.widget.ImageButton r0 = r8.A05
            if (r0 == 0) goto L_0x0102
            r0.setContentDescription(r2)
        L_0x0102:
            com.whatsapp.KeyboardPopupLayout r0 = r8.A09
            if (r0 == 0) goto L_0x010f
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x010f
            r0 = -1
            r1.height = r0
        L_0x010f:
            com.whatsapp.KeyboardPopupLayout r0 = r8.A09
            if (r0 == 0) goto L_0x0116
            r0.requestLayout()
        L_0x0116:
            r8.A0I = r9
            boolean r0 = r8 instanceof X.C94344qz
            if (r0 == 0) goto L_0x0127
            r1 = 1
        L_0x011d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r8.A07
            if (r1 != 0) goto L_0x0129
            if (r0 == 0) goto L_0x00c3
            r0.A0S(r4)
            goto L_0x00c3
        L_0x0127:
            r1 = 0
            goto L_0x011d
        L_0x0129:
            if (r0 == 0) goto L_0x00c3
            r0.A0S(r6)
            goto L_0x00c3
        L_0x012f:
            java.lang.Object r1 = r5.A00
            X.5YE r1 = (X.AnonymousClass5YE) r1
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x0139
            r1.A0I = r2
        L_0x0139:
            boolean r0 = r1.A0K
            if (r0 == 0) goto L_0x0143
            r1.A0K = r2
            r1.A07()
            return
        L_0x0143:
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x0156
            r1.A0J = r2
            X.AnonymousClass5YE.A00(r1)
            return
        L_0x014d:
            java.lang.Object r1 = r5.A00
            X.5YE r1 = (X.AnonymousClass5YE) r1
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x015d
            return
        L_0x0156:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r1.A0F
            if (r0 == 0) goto L_0x015d
            r0.A08()
        L_0x015d:
            com.whatsapp.KeyboardPopupLayout r0 = r1.A09
            if (r0 == 0) goto L_0x00c3
            r0.A07 = r2
            r0.requestLayout()
            goto L_0x00c3
        L_0x0168:
            r0 = 5
            if (r3 != r0) goto L_0x0018
            java.lang.Object r0 = r5.A00
            com.whatsapp.group.GroupProfileEmojiEditor r0 = (com.whatsapp.group.GroupProfileEmojiEditor) r0
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r0.A0C
            r0.A0A()
            return
        L_0x0175:
            r10 = 5
            r6 = 4
            r4 = 0
            r2 = 1
            r9 = 3
            if (r3 != r9) goto L_0x01c3
            java.lang.Object r8 = r5.A00
            X.5i6 r8 = (X.C111445i6) r8
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r8.A0Z
            int r0 = r0.A0O
            if (r0 != r9) goto L_0x01a7
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r8.A0Y
        L_0x0188:
            r7.A0S(r10)
        L_0x018b:
            java.lang.Object r7 = r5.A00
            X.5i6 r7 = (X.C111445i6) r7
            com.whatsapp.location.DragBottomSheetIndicator r5 = r7.A0g
            r1 = 2
            if (r3 == r2) goto L_0x0197
            r0 = 0
            if (r3 != r1) goto L_0x0198
        L_0x0197:
            r0 = 1
        L_0x0198:
            r5.setUpdating(r0)
            if (r3 == r1) goto L_0x01a1
            if (r3 == r2) goto L_0x01a1
            if (r3 != r6) goto L_0x0018
        L_0x01a1:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0W
            r0.A0Z(r4)
            return
        L_0x01a7:
            int r1 = r7.getHeight()
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r8.A0Y
            int r0 = r0.A0L()
            int r1 = r1 - r0
            float r1 = (float) r1
            float r0 = (float) r0
            float r0 = r0 + r1
            r8.A0M(r0, r2)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r8.A0Y
            r0.A0d(r4)
            com.whatsapp.location.DragBottomSheetIndicator r0 = r8.A0g
            r0.setExpanded(r2)
            goto L_0x018b
        L_0x01c3:
            if (r3 != r6) goto L_0x018b
            java.lang.Object r1 = r5.A00
            X.5i6 r1 = (X.C111445i6) r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.A0Z
            int r0 = r0.A0O
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = r1.A0Y
            if (r0 == r9) goto L_0x0188
            r7.A0d(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.A0Y
            int r0 = r0.A0L()
            float r0 = (float) r0
            r1.A0M(r0, r2)
            com.whatsapp.location.DragBottomSheetIndicator r0 = r1.A0g
            r0.setExpanded(r4)
            goto L_0x018b
        L_0x01e4:
            r9 = 0
            r8 = 0
            r4 = 1
            r6 = 5
            if (r3 != r6) goto L_0x020a
            java.lang.Object r2 = r5.A00
            X.5i6 r2 = (X.C111445i6) r2
            androidx.recyclerview.widget.RecyclerView r1 = r2.A0X
            r0 = -1
            X.C86654Ky.A14(r1, r0, r8)
            X.C111445i6.A03(r2, r9, r4)
            r2.A0H()
        L_0x01fa:
            java.lang.Object r1 = r5.A00
            X.5i6 r1 = (X.C111445i6) r1
            java.util.List r0 = r1.A1R
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0018
            r1.A0H()
            return
        L_0x020a:
            r0 = 3
            if (r3 != r0) goto L_0x01fa
            java.lang.Object r2 = r5.A00
            X.5i6 r2 = (X.C111445i6) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A0Y
            int r0 = r1.A0O
            if (r0 == r6) goto L_0x0231
            r1.A0d(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0Y
            r0.A0S(r6)
        L_0x021f:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0Z
            int r0 = r0.A0L()
            int r0 = X.C86664Kz.A0C(r7, r0)
            float r0 = (float) r0
            X.C111445i6.A03(r2, r0, r4)
            r2.A0L()
            goto L_0x01fa
        L_0x0231:
            r2.A0M(r9, r8)
            goto L_0x021f
        L_0x0235:
            r2 = 1
            r4 = 0
            r6 = 4
            if (r3 != r6) goto L_0x02a9
            java.lang.Object r3 = r5.A00
            X.5Y7 r3 = (X.AnonymousClass5Y7) r3
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A07
            int r1 = r0.A0L()
            int r0 = r7.getTop()
            int r1 = r1 + r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r3.A0M
            int r0 = r0.getHeight()
            if (r1 != r0) goto L_0x028d
            X.5eH r9 = r3.A0U
            com.whatsapp.mediacomposer.MediaComposerFragment r8 = r9.A01
            X.8uh r7 = X.C86664Kz.A1E(r8)
            if (r7 == 0) goto L_0x0275
            com.whatsapp.mediacomposer.MediaComposerActivity r7 = (com.whatsapp.mediacomposer.MediaComposerActivity) r7
            r0 = 0
            r7.BTU(r0)
            X.5nY r0 = r7.A0w
            r0.A03(r2)
            boolean r0 = r7.A1Y
            if (r0 != 0) goto L_0x02a6
            X.5nY r1 = r7.A0w
            X.5Us r0 = r7.A0t
            boolean r0 = r0.A06()
            r1.A04(r0)
        L_0x0275:
            X.5nf r0 = r8.A0E
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0M
            r0.setEnabled(r2)
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = r9.A00
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r0.A06
            X.5eK r0 = r0.A04
            r0.A0L = r2
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0P
            r0.setVisibility(r6)
            r3.A0D = r2
            r3.A0F = r4
        L_0x028d:
            java.lang.Object r2 = r5.A00
            X.5Y7 r2 = (X.AnonymousClass5Y7) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A07
            if (r0 == 0) goto L_0x029c
            int r1 = r0.A0O
            if (r1 == r6) goto L_0x029c
            r0 = 3
            if (r1 != r0) goto L_0x0018
        L_0x029c:
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x037c
            r2.A01()
            r2.A0C = r4
            return
        L_0x02a6:
            r7.A1Y = r4
            goto L_0x0275
        L_0x02a9:
            r0 = 3
            if (r3 != r0) goto L_0x0342
            java.lang.Object r8 = r5.A00
            X.5Y7 r8 = (X.AnonymousClass5Y7) r8
            X.4Wu r0 = r8.A08
            if (r0 == 0) goto L_0x02b7
            r0.A0K(r2)
        L_0x02b7:
            int r1 = r7.getTop()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r8.A0M
            int r0 = r0.getTop()
            if (r1 != r0) goto L_0x033f
            X.5eH r3 = r8.A0U
            com.whatsapp.mediacomposer.MediaComposerFragment r7 = r3.A01
            X.8uh r2 = X.C86664Kz.A1E(r7)
            if (r2 == 0) goto L_0x02f0
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.BTU(r0)
            X.5nY r1 = r2.A0w
            X.5Us r0 = r2.A0t
            boolean r2 = r0.A06()
            r1.A03(r4)
            com.whatsapp.mediacomposer.bottombar.BottomBarView r0 = r1.A03
            r0.setVisibility(r6)
            X.5nZ r0 = r1.A08
            r1 = 8
            if (r2 == 0) goto L_0x02eb
            r1 = 4
        L_0x02eb:
            androidx.recyclerview.widget.RecyclerView r0 = r0.A06
            r0.setVisibility(r1)
        L_0x02f0:
            X.5nf r0 = r7.A0E
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0M
            r0.setEnabled(r4)
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = r3.A00
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r0.A06
            X.5eK r2 = r0.A04
            r2.A0L = r4
            android.graphics.Matrix r1 = r2.A06
            android.graphics.Matrix r0 = r2.A07
            r1.set(r0)
            float r0 = r2.A04
            r2.A00 = r0
            X.5PQ r0 = r2.A0G
            r0.A00(r1)
            X.33p r3 = r8.A0R
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r2 = "filter_dismissal_amount"
            int r1 = r0.getInt(r2, r4)
            r0 = 5
            if (r1 > r0) goto L_0x0323
            int r0 = r1 + 1
            X.C18260x0.A0L(r3, r2, r0)
        L_0x0323:
            r8.A0E = r4
        L_0x0325:
            androidx.recyclerview.widget.RecyclerView r0 = r8.A0P
            r0.setVisibility(r4)
            X.0Xs r1 = r0.getLayoutManager()
            if (r1 == 0) goto L_0x028d
            int r0 = r8.A01
            android.view.View r1 = r1.A0P(r0)
            if (r1 == 0) goto L_0x028d
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            goto L_0x028d
        L_0x033f:
            r8.A0E = r2
            goto L_0x0325
        L_0x0342:
            if (r3 != r2) goto L_0x028d
            java.lang.Object r3 = r5.A00
            X.5Y7 r3 = (X.AnonymousClass5Y7) r3
            androidx.recyclerview.widget.RecyclerView r2 = r3.A0P
            r2.getVisibility()
            X.5eH r0 = r3.A0U
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A01
            X.8uh r0 = X.C86664Kz.A1E(r0)
            if (r0 == 0) goto L_0x0367
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.5nY r1 = r0.A0w
            X.5Us r0 = r0.A0t
            boolean r0 = r0.A06()
            r1.A03(r4)
            r1.A04(r0)
        L_0x0367:
            r3.A0F = r4
            X.4Wu r0 = r3.A08
            if (r0 != 0) goto L_0x0377
            android.os.Handler r1 = r3.A0I
            java.lang.Runnable r0 = r3.A0X
            r1.removeCallbacks(r0)
            r0.run()
        L_0x0377:
            r2.setVisibility(r4)
            goto L_0x028d
        L_0x037c:
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0018
            boolean r0 = r2.A0B
            r2.A06(r0)
            r2.A0A = r4
            return
        L_0x0388:
            r0 = 4
            if (r3 != r0) goto L_0x0018
            java.lang.Object r1 = r5.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r1.A75()
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0018
            r1.A78()
            r1.A76()
            return
        L_0x039f:
            r0 = 5
            if (r3 == r0) goto L_0x03be
            r0 = 4
            if (r3 == r0) goto L_0x03be
            r0 = 3
            if (r3 != r0) goto L_0x0018
            java.lang.Object r1 = r5.A00
            com.whatsapp.stickers.store.StickerStoreActivity r1 = (com.whatsapp.stickers.store.StickerStoreActivity) r1
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r0 = r1.A06
            if (r0 == 0) goto L_0x03b3
            r0.A1J()
        L_0x03b3:
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r0 = r1.A07
            if (r0 == 0) goto L_0x0018
            r0.A1J()
            return
        L_0x03bb:
            r0 = 5
            if (r3 != r0) goto L_0x0018
        L_0x03be:
            java.lang.Object r0 = r5.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.C86624Kv.A0f(r0)
            return
        L_0x03c6:
            r0 = 5
            if (r3 != r0) goto L_0x03f3
            java.lang.Object r0 = r5.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            X.4U2 r4 = r0.A0N
            if (r4 != 0) goto L_0x03d6
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x03d6:
            X.4Zb r2 = r4.A07
            r3 = 0
            if (r2 == 0) goto L_0x03e5
            X.7yS r1 = r2.A04
            r0 = 0
            r1.A01 = r0
            r2.A0C()
            r4.A07 = r3
        L_0x03e5:
            X.4Za r2 = r4.A08
            if (r2 == 0) goto L_0x03f3
            X.7yS r1 = r2.A0D
            r0 = 0
            r1.A01 = r0
            r2.A02()
            r4.A08 = r3
        L_0x03f3:
            java.lang.Object r0 = r5.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            r0.A75()
            return
        L_0x03fb:
            java.lang.Object r12 = r5.A00
            X.5Uk r12 = (X.C105315Uk) r12
            boolean r0 = r12.A0C
            r5 = 4
            if (r0 == 0) goto L_0x040c
            if (r3 == r5) goto L_0x040c
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r12.A0I
            r0.A0S(r5)
            return
        L_0x040c:
            r4 = 5
            r15 = 0
            r6 = 3
            if (r3 == r6) goto L_0x04a0
            if (r3 == r5) goto L_0x0415
            if (r3 != r4) goto L_0x047a
        L_0x0415:
            boolean r0 = r12.A06
            if (r0 != 0) goto L_0x049d
            if (r3 == r6) goto L_0x049d
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r3 != r5) goto L_0x0420
            r6 = 0
        L_0x0420:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = r12.A0M
            int r1 = r7.getTop()
            int r0 = r12.A01
            int r1 = r1 - r0
            r2.A1a(r1, r6)
            int r0 = r7.getTop()
            r12.A01 = r0
        L_0x0432:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r12.A0M
            r0.A1X(r6)
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r0.A0U
            if (r0 == 0) goto L_0x043e
            r0.setSlideOffset(r6)
        L_0x043e:
            r12.A01()
            r12.A02()
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x047a
            android.view.View r2 = r12.A0D
            float r1 = r2.getTranslationY()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x047a
            boolean r0 = r12.A0B
            if (r0 != 0) goto L_0x045f
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r12.A0I
            int r0 = r0.A0O
            r14 = 500(0x1f4, float:7.0E-43)
            if (r0 == r5) goto L_0x0460
        L_0x045f:
            r14 = 0
        L_0x0460:
            float r0 = r2.getTranslationY()
            int r7 = (int) r0
            r6 = 1056964608(0x3f000000, float:0.5)
            r2 = 1068289229(0x3faccccd, float:1.35)
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.PathInterpolator r13 = X.C05030Rp.A00(r6, r2, r1, r0)
            r17 = r15
            r16 = r7
            r12.A05(r13, r14, r15, r16, r17)
        L_0x047a:
            if (r3 != r5) goto L_0x0489
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r12.A0M
            com.whatsapp.calling.views.VoipCallFooter r0 = r0.A0V
            if (r0 == 0) goto L_0x0489
            android.widget.ImageButton r0 = r0.A06
            if (r0 == 0) goto L_0x0489
            r0.setSelected(r15)
        L_0x0489:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r12.A0M
            if (r3 == r4) goto L_0x048e
            r15 = 1
        L_0x048e:
            X.5Ml r0 = r1.A0g
            if (r0 == 0) goto L_0x0495
            r0.A00(r15)
        L_0x0495:
            float r0 = X.C86634Kw.A00(r15)
            r1.A1Y(r0)
            return
        L_0x049d:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0432
        L_0x04a0:
            r12.A06 = r15
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r8 = r12.A0M
            androidx.recyclerview.widget.RecyclerView r11 = r8.A0G
            if (r11 == 0) goto L_0x0505
            X.4WF r0 = r8.A0O
            if (r0 == 0) goto L_0x0505
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r9 = r8.A0R
            java.util.Set r0 = r9.A0H
            java.util.HashSet r10 = X.AnonymousClass0x9.A15(r0)
            r1 = 0
        L_0x04b5:
            int r0 = r11.getChildCount()
            if (r1 >= r0) goto L_0x04dc
            android.view.View r2 = r11.getChildAt(r1)
            if (r2 == 0) goto L_0x04d9
            java.lang.Object r0 = r2.getTag()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x04d9
            java.lang.Object r2 = r2.getTag()
            X.C626936e.A06(r2)
            boolean r0 = r10.contains(r2)
            if (r0 == 0) goto L_0x04eb
            r10.remove(r2)
        L_0x04d9:
            int r1 = r1 + 1
            goto L_0x04b5
        L_0x04dc:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0505
            X.2qk r2 = r9.A02
            java.lang.String r1 = "VoipCallControlBottomSheet/hasDuplicateParticipant/missing participants"
            java.lang.String r0 = r10.toString()
            goto L_0x04fd
        L_0x04eb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoipCallControlBottomSheet/hasDuplicateParticipant/duplicate participant = "
            java.lang.String r0 = X.C18300x5.A0k(r2, r0, r1)
            X.C18260x0.A1M(r1, r0)
            X.2qk r2 = r9.A02
            java.lang.String r1 = "VoipCallControlBottomSheet/hasDuplicateParticipant/duplicate participant"
            r0 = 0
        L_0x04fd:
            r2.A0A(r1, r15, r0)
            X.4WF r0 = r8.A0O
            r0.A05()
        L_0x0505:
            com.whatsapp.calling.views.VoipCallFooter r0 = r8.A0V
            if (r0 == 0) goto L_0x0415
            android.widget.ImageButton r1 = r0.A06
            if (r1 == 0) goto L_0x0415
            r0 = 1
            r1.setSelected(r0)
            goto L_0x0415
        L_0x0513:
            java.lang.Object r0 = r5.A00
            X.51x r0 = (X.AnonymousClass51x) r0
            r0.A0H(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1232167o.A03(android.view.View, int):void");
    }
}
