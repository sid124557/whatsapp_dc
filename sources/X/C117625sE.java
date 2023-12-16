package X;

import android.view.View;

/* renamed from: X.5sE  reason: invalid class name and case insensitive filesystem */
public class C117625sE implements Runnable {
    public Object A00;
    public final int A01;

    public static void A01(View view, Object obj) {
        view.setBackgroundResource(0);
        view.postDelayed(new C117625sE(obj, 49), 1);
    }

    public C117625sE(C55022pf r2) {
        this.A01 = 13;
        this.A00 = r2;
    }

    public static C117625sE A00(Object obj, int i) {
        return new C117625sE(obj, i);
    }

    public static void A02(C69263Wi r1, Object obj, int i) {
        r1.A0S(new C117625sE(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.whatsapp.conversationslist.LockedConversationsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: com.whatsapp.conversationslist.ConversationsFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: com.whatsapp.conversationslist.LockedConversationsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: com.whatsapp.conversationslist.LockedConversationsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: com.whatsapp.conversationslist.LockedConversationsActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x030b, code lost:
        A02(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x030e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0525, code lost:
        r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3;
        r2 = r3.A1p;
        r1 = r2.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x052b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        r2.A00 = null;
        r2.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0531, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0532, code lost:
        r1 = r3.A1y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0534, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        r1.A00 = null;
        r1.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0539, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x053a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        r15 = (X.C113245l7) r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r15.A41.A0X(6240) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r15.A0V == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        if (r15.A6N != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        r0 = r15.A40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        if (r0.getVisibility() == 8) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0092, code lost:
        r14 = r15.A1a.getPaddingBottom();
        r26 = r15.A1a.getLayoutParams().height;
        r13 = r15.A1a.getMeasuredHeight();
        r24 = r15.A0V.getHeight();
        r23 = r15.A0C.getRootView().getHeight();
        r12 = r15.A1a.getY() + ((float) r13);
        r22 = r15.A1a.getTranslationY();
        r11 = r15.A40.getY();
        r10 = r11 - r12;
        r25 = r15.A1a.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f9, code lost:
        if (((double) r10) <= ((((double) r14) * 1.05d) + 1.0d)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fb, code lost:
        r1 = X.AnonymousClass000.A0l("expressionsTrayY=");
        r1.append(r11);
        X.C18270x1.A19(", contentRootLayoutHeight=", ", contentRootLayoutMeasuredHeight=", r1, r26);
        r1.append(r13);
        r1.append(", contentRootLayoutTranslationY=");
        r1.append(r22);
        r1.append(", composerBottomPosition=");
        r1.append(r12);
        X.C18270x1.A19(",contentPaddingBottom=", ", deltaExpressionsTrayComposer=", r1, r14);
        r1.append(r10);
        X.C18270x1.A19(", screenHeight=", ", conversationCoordinatorLayoutHeight=", r1, r23);
        r1.append(r24);
        r1.append(", rootLayoutLocked=");
        r1.append(r25);
        r1.append(", isAutoRecovery=");
        ((X.C55862r2) r15.A5w.get()).A02(2, "expression_tray_ui_inconsistency_detected", X.C18300x5.A0m(r1, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014e, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r27 = this;
            r1 = r27
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0332;
                case 1: goto L_0x033c;
                case 2: goto L_0x0011;
                case 3: goto L_0x002c;
                case 4: goto L_0x004f;
                case 5: goto L_0x0056;
                case 6: goto L_0x006c;
                case 7: goto L_0x036e;
                case 8: goto L_0x0379;
                case 9: goto L_0x014f;
                case 10: goto L_0x0383;
                case 11: goto L_0x017d;
                case 12: goto L_0x03b1;
                case 13: goto L_0x03c5;
                case 14: goto L_0x018c;
                case 15: goto L_0x03cd;
                case 16: goto L_0x03d5;
                case 17: goto L_0x03dd;
                case 18: goto L_0x03ef;
                case 19: goto L_0x0198;
                case 20: goto L_0x03f7;
                case 21: goto L_0x0404;
                case 22: goto L_0x0433;
                case 23: goto L_0x01a9;
                case 24: goto L_0x043f;
                case 25: goto L_0x01d7;
                case 26: goto L_0x0497;
                case 27: goto L_0x04a5;
                case 28: goto L_0x0229;
                case 29: goto L_0x04ad;
                case 30: goto L_0x0253;
                case 31: goto L_0x04b0;
                case 32: goto L_0x04da;
                case 33: goto L_0x04ec;
                case 34: goto L_0x02c8;
                case 35: goto L_0x0511;
                case 36: goto L_0x051f;
                case 37: goto L_0x0541;
                case 38: goto L_0x0549;
                case 39: goto L_0x02e3;
                case 40: goto L_0x055f;
                case 41: goto L_0x057a;
                case 42: goto L_0x0591;
                case 43: goto L_0x05a4;
                case 44: goto L_0x04a5;
                case 45: goto L_0x05b2;
                case 46: goto L_0x05c0;
                case 47: goto L_0x05c8;
                case 48: goto L_0x02f1;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversationslist.ViewHolder r0 = (com.whatsapp.conversationslist.ViewHolder) r0
            android.view.View r0 = r0.A06
            X.C107235av.A02(r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r1.A00
            X.5a8 r0 = (X.C106765a8) r0
            java.lang.Object r2 = r0.A00
            X.5l7 r2 = (X.C113245l7) r2
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r2.A40
            if (r1 == 0) goto L_0x0010
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0t
            if (r0 == 0) goto L_0x0010
            int r0 = r0.A0O
            r1.A0C(r0)
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A40
            r2.A1f(r0)
            return
        L_0x002c:
            java.lang.Object r0 = r1.A00
            X.5G7 r0 = (X.AnonymousClass5G7) r0
            X.5l7 r1 = r0.A00
            X.5ZT r0 = r1.A5q
            if (r0 == 0) goto L_0x0010
            X.5qb r0 = r0.A1D
            android.view.ViewGroup r0 = r0.A0B
            boolean r0 = X.C86604Kt.A1Y(r0)
            if (r0 == 0) goto L_0x0010
            X.5ZT r2 = r1.A5q
            X.5TQ r0 = r2.A0L
            boolean r1 = X.AnonymousClass000.A1W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x05d1
            r2.A0S(r0, r0)
            return
        L_0x004f:
            java.lang.Object r0 = r1.A00
            X.67o r0 = (X.C1232167o) r0
            java.lang.Object r15 = r0.A00
            goto L_0x0072
        L_0x0056:
            java.lang.Object r0 = r1.A00
            X.6BG r0 = (X.AnonymousClass6BG) r0
            java.lang.Object r0 = r0.A00
            X.5l7 r0 = (X.C113245l7) r0
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r0.A40
            if (r1 == 0) goto L_0x0010
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.A0t
            if (r0 == 0) goto L_0x0010
            int r0 = r0.A0O
            r1.A0C(r0)
            return
        L_0x006c:
            java.lang.Object r0 = r1.A00
            X.6BP r0 = (X.AnonymousClass6BP) r0
            java.lang.Object r15 = r0.A00
        L_0x0072:
            X.5l7 r15 = (X.C113245l7) r15
            X.1VX r1 = r15.A41
            r0 = 6240(0x1860, float:8.744E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r15.A0V
            if (r0 == 0) goto L_0x0010
            boolean r0 = r15.A6N
            if (r0 != 0) goto L_0x0010
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r15.A40
            if (r0 == 0) goto L_0x0010
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0010
            com.whatsapp.KeyboardPopupLayout r0 = r15.A1a
            int r14 = r0.getPaddingBottom()
            com.whatsapp.KeyboardPopupLayout r0 = r15.A1a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.height
            r26 = r0
            com.whatsapp.KeyboardPopupLayout r0 = r15.A1a
            int r13 = r0.getMeasuredHeight()
            android.view.ViewGroup r0 = r15.A0V
            int r24 = r0.getHeight()
            android.view.View r0 = r15.A0C
            android.view.View r0 = r0.getRootView()
            int r23 = r0.getHeight()
            com.whatsapp.KeyboardPopupLayout r0 = r15.A1a
            float r12 = r0.getY()
            float r0 = (float) r13
            float r12 = r12 + r0
            com.whatsapp.KeyboardPopupLayout r0 = r15.A1a
            float r22 = r0.getTranslationY()
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r15.A40
            float r11 = r0.getY()
            float r10 = r11 - r12
            com.whatsapp.KeyboardPopupLayout r0 = r15.A1a
            boolean r0 = r0.A07
            r25 = r0
            java.lang.String r21 = ", contentRootLayoutHeight="
            java.lang.String r20 = ", contentRootLayoutMeasuredHeight="
            java.lang.String r19 = ", contentRootLayoutTranslationY="
            java.lang.String r18 = ", composerBottomPosition="
            java.lang.String r9 = ",contentPaddingBottom="
            java.lang.String r8 = ", deltaExpressionsTrayComposer="
            java.lang.String r7 = ", screenHeight="
            java.lang.String r6 = ", conversationCoordinatorLayoutHeight="
            java.lang.String r5 = ", rootLayoutLocked="
            double r3 = (double) r10
            double r0 = (double) r14
            r16 = 4607407598781385933(0x3ff0cccccccccccd, double:1.05)
            double r0 = r0 * r16
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r16
            java.lang.String r2 = ", isAutoRecovery="
            java.lang.String r17 = "expressionsTrayY="
            int r16 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r16 <= 0) goto L_0x0010
            X.8qC r0 = r15.A5w
            java.lang.Object r3 = r0.get()
            X.2r2 r3 = (X.C55862r2) r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r17)
            r1.append(r11)
            r11 = r21
            r4 = r20
            r0 = r26
            X.C18270x1.A19(r11, r4, r1, r0)
            r1.append(r13)
            r0 = r19
            r1.append(r0)
            r0 = r22
            r1.append(r0)
            r0 = r18
            r1.append(r0)
            r1.append(r12)
            X.C18270x1.A19(r9, r8, r1, r14)
            r1.append(r10)
            r0 = r23
            X.C18270x1.A19(r7, r6, r1, r0)
            r0 = r24
            r1.append(r0)
            r1.append(r5)
            r0 = r25
            r1.append(r0)
            r1.append(r2)
            r0 = 0
            java.lang.String r2 = X.C18300x5.A0m(r1, r0)
            java.lang.String r1 = "expression_tray_ui_inconsistency_detected"
            r0 = 2
            r3.A02(r0, r1, r2)
            return
        L_0x014f:
            java.lang.Object r4 = r1.A00
            X.4pr r4 = (X.C94084pr) r4
            X.4oJ r7 = r4.A04
            if (r7 == 0) goto L_0x0010
            android.widget.FrameLayout r0 = r4.A74()
            int r10 = r0.getHeight()
            boolean r0 = r4 instanceof com.whatsapp.conversation.selection.SingleSelectedMessageActivity
            if (r0 == 0) goto L_0x05ef
            r6 = r4
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r6 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r6
            X.4oJ r1 = r6.A04
            if (r1 == 0) goto L_0x05ef
            java.lang.Boolean r0 = r6.A0D
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)
            if (r0 == 0) goto L_0x05ef
            X.4pj r5 = r6.A05
            java.lang.String r3 = "reactionsTrayLayout"
            if (r5 != 0) goto L_0x05d5
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x017d:
            java.lang.Object r1 = r1.A00
            X.5S9 r1 = (X.AnonymousClass5S9) r1
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            r1.A01(r0)
            return
        L_0x018c:
            java.lang.Object r0 = r1.A00
            X.5JF r0 = (X.AnonymousClass5JF) r0
            android.animation.ValueAnimator r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            r0.reverse()
            return
        L_0x0198:
            java.lang.Object r2 = r1.A00
            X.3TZ r2 = (X.AnonymousClass3TZ) r2
            r0 = 1
            r2.A01 = r0
            X.4F2 r1 = r2.A00
            if (r1 == 0) goto L_0x0010
            X.1im r0 = r2.A04
            r0.A07(r1)
            return
        L_0x01a9:
            java.lang.Object r4 = r1.A00
            X.4pu r4 = (X.C94104pu) r4
            X.03q r0 = r4.A02
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0010
            java.util.ArrayList r0 = r4.A04
            if (r0 == 0) goto L_0x0010
            java.util.ArrayList r0 = r4.A03
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r4.A01
            if (r0 == 0) goto L_0x0010
            r0 = 0
            r4.A02(r0)
            X.03q r3 = r4.A02
            android.view.ViewGroup r2 = r4.A01
            java.util.ArrayList r1 = r4.A03
            java.util.ArrayList r0 = r4.A04
            int r0 = r0.size()
            r4.A04(r2, r3, r1, r0)
            return
        L_0x01d7:
            java.lang.Object r0 = r1.A00
            X.2zi r0 = (X.C61102zi) r0
            java.util.Iterator r4 = X.C61102zi.A03(r0)
        L_0x01df:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r3 = r4.next()
            X.3Gp r3 = (X.C65203Gp) r3
            X.2sr r2 = r3.A06
            boolean r1 = X.C86664Kz.A1W(r2)
            java.lang.String r0 = "sync-manager/onUnarchiveChatsSettingChanged/only primary can create this mutation"
            X.C626936e.A0F(r1, r0)
            java.lang.String r0 = "sync-manager/onUnarchiveChatsSettingChanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2j3 r1 = r3.A0c
            java.lang.String r0 = "setting_unarchiveChats"
            X.2sc r1 = r1.A00(r0)
            X.1Ov r1 = (X.C22601Ov) r1
            if (r1 == 0) goto L_0x021f
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r2)
            if (r0 == 0) goto L_0x021f
            boolean r0 = r3.A0Q()
            if (r0 == 0) goto L_0x021f
            java.util.List r0 = r1.A0D()
            java.util.Set r0 = r3.A0B(r0)
        L_0x021b:
            r3.A0O(r0)
            goto L_0x01df
        L_0x021f:
            java.lang.String r0 = "sync-manager/onUnarchiveChatsSettingChanged/emptySet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Set r0 = java.util.Collections.emptySet()
            goto L_0x021b
        L_0x0229:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            boolean r0 = r3.A16()
            if (r0 == 0) goto L_0x0010
            X.5FA r2 = r3.A0f
            r1 = 1
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = X.C110565gf.A00(r3, r2, r1)
            r3.A2i = r0
            X.0Wx r2 = r0.A04
            X.0sA r1 = r3.A0V()
            r0 = 231(0xe7, float:3.24E-43)
            X.AnonymousClass6C6.A02(r1, r2, r3, r0)
            X.08A r1 = r3.A0L
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r3.A2i
            r1.A00(r0)
            return
        L_0x0253:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            X.5k8 r4 = r1.A1e
            android.widget.ListView r0 = r1.A0E
            int r5 = r0.getFirstVisiblePosition()
            android.widget.ListView r6 = r1.A0E
            X.4Oj r1 = r1.A1V
            if (r6 == 0) goto L_0x02c6
            if (r1 == 0) goto L_0x02c6
            int r0 = r6.getHeaderViewsCount()
            int r3 = r1.getCount()
            int r1 = r6.getLastVisiblePosition()
            r2 = -1
            if (r3 != 0) goto L_0x02b1
            r7 = -1
        L_0x0277:
            int r6 = r5 + -1
            r3 = 1
            boolean r2 = X.C18280x3.A1U(r7, r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Last visible row ["
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "] should be >= First visible row ["
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "]"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C626936e.A0D(r2, r0)
            r4.A00 = r5
            r4.A01 = r7
            r4.A03 = r3
            java.lang.Runnable r0 = r4.A02
            if (r0 == 0) goto L_0x0010
            boolean r0 = r4.isValid()
            if (r0 == 0) goto L_0x0010
            java.lang.Runnable r0 = r4.A02
            r0.run()
            return
        L_0x02b1:
            int r0 = r0 + r3
            int r0 = r0 + -1
            if (r1 <= r0) goto L_0x02b9
            int r7 = r3 + -1
            goto L_0x0277
        L_0x02b9:
            int r1 = r6.getLastVisiblePosition()
            int r0 = r6.getHeaderViewsCount()
            int r7 = X.AnonymousClass001.A0C(r1, r0, r2)
            goto L_0x0277
        L_0x02c6:
            r7 = 0
            goto L_0x0277
        L_0x02c8:
            java.lang.Object r2 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            X.2oU r0 = r2.A1j
            android.content.Context r0 = r0.A00
            boolean r0 = X.AnonymousClass0YV.A0F(r0)
            if (r0 == 0) goto L_0x0010
            X.0hc r0 = r2.A0p
            boolean r0 = r0.A0n()
            if (r0 == 0) goto L_0x0010
            X.3Wi r1 = r2.A0i
            r0 = 33
            goto L_0x030b
        L_0x02e3:
            java.lang.Object r0 = r1.A00
            X.5g7 r0 = (X.C110365g7) r0
            com.whatsapp.conversationslist.ConversationsFragment r0 = r0.A0N
            X.4Oj r0 = r0.A1V
            if (r0 == 0) goto L_0x0010
            r0.notifyDataSetChanged()
            return
        L_0x02f1:
            java.lang.Object r2 = r1.A00
            com.whatsapp.conversationslist.LockedConversationsActivity r2 = (com.whatsapp.conversationslist.LockedConversationsActivity) r2
            X.5aW r0 = r2.A74()
            X.66R r0 = r0.A0I
            android.content.SharedPreferences r1 = X.C18310x6.A0F(r0)
            java.lang.String r0 = "userFailedAppSwitchAuth"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x030f
            X.3Wi r1 = r2.A05
            r0 = 46
        L_0x030b:
            A02(r1, r2, r0)
            return
        L_0x030f:
            X.5aW r0 = r2.A74()
            X.2ss r0 = r0.A03
            java.util.HashSet r0 = r0.A03
            boolean r0 = X.AnonymousClass0x7.A1S(r0)
            if (r0 == 0) goto L_0x0010
            X.5c5 r0 = r2.A02
            if (r0 == 0) goto L_0x0743
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0010
            X.5aW r0 = r2.A74()
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0010
            X.3Wi r1 = r2.A05
            r0 = 47
            goto L_0x030b
        L_0x0332:
            java.lang.Object r0 = r1.A00
            X.5ft r0 = (X.C110225ft) r0
            X.5l7 r0 = r0.A04
            r0.A1K()
            return
        L_0x033c:
            java.lang.Object r4 = r1.A00
            X.5a8 r4 = (X.C106765a8) r4
            java.lang.Object r1 = r4.A00
            X.5l7 r1 = (X.C113245l7) r1
            r1.A0e()
            boolean r0 = r1.A2W()
            if (r0 == 0) goto L_0x035a
            X.4TE r2 = r1.A4D
            if (r2 == 0) goto L_0x035a
            r1 = 5
            X.6C0 r0 = new X.6C0
            r0.<init>(r4, r1)
            r2.A00 = r0
            return
        L_0x035a:
            com.whatsapp.KeyboardPopupLayout r3 = r1.A1a
            r0 = 2
            X.5sE r2 = A00(r4, r0)
            float r1 = r1.A0R()
            r0 = 1133903872(0x43960000, float:300.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            return
        L_0x036e:
            java.lang.Object r1 = r1.A00
            X.5fP r1 = (X.C109925fP) r1
            r0 = 0
            r1.A02 = r0
            r1.A00()
            return
        L_0x0379:
            java.lang.Object r0 = r1.A00
            X.7Dm r0 = (X.C147277Dm) r0
            X.5l7 r1 = r0.A00
            r0 = 0
            r1.A6H = r0
            return
        L_0x0383:
            java.lang.Object r4 = r1.A00
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r4 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r4
            r2 = 0
            X.4pj r1 = r4.A05
            java.lang.String r0 = "reactionsTrayLayout"
            if (r1 != 0) goto L_0x0393
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0393:
            r1.setVisibility(r2)
            X.4pj r3 = r4.A05
            if (r3 != 0) goto L_0x039f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x039f:
            boolean r2 = r4.A79()
            X.66R r0 = r4.A0F
            int r1 = X.AnonymousClass0x2.A09(r0)
            int r0 = X.AnonymousClass0x2.A09(r0)
            r3.A02(r1, r0, r2)
            return
        L_0x03b1:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r0 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r0
            r1 = 0
            com.whatsapp.reactions.ReactionsTrayViewModel r0 = r0.A0C
            if (r0 != 0) goto L_0x03c1
            java.lang.String r0 = "reactionsTrayViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03c1:
            r0.A0E(r1)
            return
        L_0x03c5:
            java.lang.Object r0 = r1.A00
            X.2pf r0 = (X.C55022pf) r0
            r0.A03()
            return
        L_0x03cd:
            java.lang.Object r0 = r1.A00
            X.4VH r0 = (X.AnonymousClass4VH) r0
            r0.A0D()
            return
        L_0x03d5:
            java.lang.Object r0 = r1.A00
            X.4VQ r0 = (X.AnonymousClass4VQ) r0
            r0.A0L()
            return
        L_0x03dd:
            java.lang.Object r0 = r1.A00
            X.4VQ r0 = (X.AnonymousClass4VQ) r0
            X.08M r2 = r0.A0T
            X.2rt r1 = r0.A0r
            X.4uZ r0 = r0.A0x
            boolean r0 = r1.A06(r0)
            X.C06270Wx.A05(r2, r0)
            return
        L_0x03ef:
            java.lang.Object r0 = r1.A00
            X.4Uw r0 = (X.C87684Uw) r0
            r0.A0D()
            return
        L_0x03f7:
            java.lang.Object r0 = r1.A00
            X.5o4 r0 = (X.C115075o4) r0
            X.4UA r0 = r0.A00
            X.08M r1 = r0.A0H
            r0 = 0
            r1.A0H(r0)
            return
        L_0x0404:
            java.lang.Object r0 = r1.A00
            X.2ah r0 = (X.C45862ah) r0
            X.4UA r4 = r0.A03     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            X.3Ls r3 = r4.A01     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            X.1VX r2 = r4.A0V     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            java.util.LinkedHashSet r0 = r3.A0O     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            if (r0 != 0) goto L_0x0424
            java.util.LinkedHashSet r0 = r3.A0O     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            java.lang.Object[] r1 = r0.toArray()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            r0 = 0
            r0 = r1[r0]     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            r3.A0C(r2, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
        L_0x0424:
            X.3Ls r1 = r4.A01     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            X.59D r0 = X.AnonymousClass59D.SMALL_THUMBNAIL_LOADED     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            r4.A0G(r1, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x042c }
            return
        L_0x042c:
            r1 = move-exception
            java.lang.String r0 = "CTWAListener/onSuccess/failed to load thumb"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0433:
            java.lang.Object r0 = r1.A00
            X.4qR r0 = (X.C94234qR) r0
            android.widget.HorizontalScrollView r1 = r0.A01
            r0 = 66
            r1.fullScroll(r0)
            return
        L_0x043f:
            java.lang.Object r2 = r1.A00
            X.5JH r2 = (X.AnonymousClass5JH) r2
            X.2gi r1 = r2.A01
            X.1VX r0 = r2.A00
            X.7LO r5 = new X.7LO
            r5.<init>(r0, r1)
            X.5MW r0 = new X.5MW
            r0.<init>(r2)
            r5.A00 = r0
            com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsQueryImpl$Builder r3 = new com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsQueryImpl$Builder
            r3.<init>()
            com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput r2 = new com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput
            r2.<init>()
            java.lang.String r1 = "LANDING_SCREEN"
            java.lang.String r0 = "context"
            r2.A06(r0, r1)
            X.2ie r3 = r3.A00
            java.lang.String r0 = "input"
            r3.A00(r2, r0)
            java.lang.String r2 = "GetSuggestedContacts"
            java.lang.Class<com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl> r0 = com.whatsapp.infra.graphql.generated.suggestedcontacts.GetSuggestedContactsResponseImpl.class
            X.7J9 r1 = new X.7J9
            r1.<init>(r3, r0, r2)
            X.2gi r0 = r5.A02
            X.2fG r1 = r0.A01(r1)
            X.42d r0 = new X.42d
            r0.<init>(r1)
            X.1en r4 = new X.1en
            r4.<init>(r0)
            X.1VX r1 = r5.A01
            r0 = 5652(0x1614, float:7.92E-42)
            long r2 = X.C56952sp.A06(r1, r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            X.62Q r0 = new X.62Q
            r0.<init>(r5)
            r4.A07(r1, r0, r2)
            return
        L_0x0497:
            java.lang.Object r0 = r1.A00
            X.5ZN r0 = (X.AnonymousClass5ZN) r0
            com.whatsapp.conversationslist.ViewHolder r0 = r0.A08
            android.view.View r1 = r0.A07
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x04a5:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            r0 = 0
            r1.A2h = r0
            return
        L_0x04ad:
            java.lang.Object r3 = r1.A00
            goto L_0x0525
        L_0x04b0:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.3Lo r2 = r3.A1p
            java.lang.Object r1 = r2.A08
            monitor-enter(r1)
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x04d7 }
            r2.A01 = r0     // Catch:{ all -> 0x04d7 }
            monitor-exit(r1)     // Catch:{ all -> 0x04d7 }
            X.5NT r1 = r3.A1y
            monitor-enter(r1)
            r2 = 0
            r1.A00 = r0     // Catch:{ all -> 0x053b }
            r1.A01 = r0     // Catch:{ all -> 0x053b }
            monitor-exit(r1)
            java.lang.String r0 = "prewarming search contacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2s8 r1 = r3.A3R
            r1.A0C = r2
            X.3Lu r0 = r3.A1s
            r0.A0L(r1)
            return
        L_0x04d7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x04d7 }
            throw r0
        L_0x04da:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            java.lang.String r0 = "[Perf][Render] Completed rendering the conversation list"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 1
            r1.A3A = r0
            X.8s5 r0 = r1.A2b
            r1.A1g(r0)
            return
        L_0x04ec:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            int r1 = r3.A04
            r0 = 7
            if (r1 < r0) goto L_0x050d
            r0 = 0
            r3.A3E = r0
            X.03q r0 = r3.A0Q()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity"
            r2.setClassName(r1, r0)
            r3.A0m(r2)
            return
        L_0x050d:
            r0 = 1
            r3.A3E = r0
            return
        L_0x0511:
            java.lang.Object r0 = r1.A00
            X.5cQ r0 = (X.C108105cQ) r0
            com.whatsapp.conversationslist.ConversationsFragment r0 = r0.A00
            X.0QJ r1 = r0.A0q
            X.1IL r0 = r0.A1W
            r1.A01(r0)
            return
        L_0x051f:
            java.lang.Object r0 = r1.A00
            X.681 r0 = (X.AnonymousClass681) r0
            java.lang.Object r3 = r0.A00
        L_0x0525:
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.3Lo r2 = r3.A1p
            java.lang.Object r1 = r2.A08
            monitor-enter(r1)
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x053e }
            r2.A01 = r0     // Catch:{ all -> 0x053e }
            monitor-exit(r1)     // Catch:{ all -> 0x053e }
            X.5NT r1 = r3.A1y
            monitor-enter(r1)
            r1.A00 = r0     // Catch:{ all -> 0x053b }
            r1.A01 = r0     // Catch:{ all -> 0x053b }
            monitor-exit(r1)
            return
        L_0x053b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x053e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x053e }
            throw r0
        L_0x0541:
            java.lang.Object r0 = r1.A00
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            r0.A1S()
            return
        L_0x0549:
            java.lang.Object r0 = r1.A00
            X.69r r0 = (X.C1237669r) r0
            java.lang.Object r2 = r0.A00
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            X.3Wi r1 = r2.A0i
            r0 = 37
            A02(r1, r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A3V
            r0 = 0
            r1.set(r0)
            return
        L_0x055f:
            java.lang.Object r1 = r1.A00
            X.1IL r1 = (X.AnonymousClass1IL) r1
            java.lang.String r0 = "conversations-gdrive-observer/set-message/show-nothing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.conversationslist.ConversationsFragment r2 = r1.A04
            android.widget.ProgressBar r1 = r2.A0F
            r0 = 8
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r2.A0D
            r0 = 2131232098(0x7f080562, float:1.8080296E38)
            r1.setImageResource(r0)
            return
        L_0x057a:
            java.lang.Object r1 = r1.A00
            X.1IL r1 = (X.AnonymousClass1IL) r1
            java.lang.String r0 = "conversations-gdrive-observer/set-message/show-determinate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.conversationslist.ConversationsFragment r2 = r1.A04
            android.widget.ProgressBar r0 = r2.A0F
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r2.A0F
            r0.setIndeterminate(r1)
            return
        L_0x0591:
            java.lang.Object r0 = r1.A00
            X.1IL r0 = (X.AnonymousClass1IL) r0
            com.whatsapp.conversationslist.ConversationsFragment r2 = r0.A04
            android.widget.ProgressBar r1 = r2.A0F
            r0 = 0
            r1.setVisibility(r0)
            android.widget.ProgressBar r1 = r2.A0F
            r0 = 1
            r1.setIndeterminate(r0)
            return
        L_0x05a4:
            java.lang.Object r0 = r1.A00
            X.5ic r0 = (X.C111745ic) r0
            X.2iC r2 = r0.A0P
            X.4uZ r1 = r0.A00
            X.21R r0 = X.AnonymousClass21R.CHAT_LIST_SCREEN
            r2.A00(r1, r0)
            return
        L_0x05b2:
            java.lang.Object r0 = r1.A00
            X.5kZ r0 = (X.C112905kZ) r0
            X.3Wi r2 = r0.A01
            r1 = 2131893064(0x7f121b48, float:1.9420894E38)
            r0 = 1
            r2.A0H(r1, r0)
            return
        L_0x05c0:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x05c8:
            java.lang.Object r1 = r1.A00
            com.whatsapp.conversationslist.LockedConversationsActivity r1 = (com.whatsapp.conversationslist.LockedConversationsActivity) r1
            r0 = 0
            r1.A77(r0, r0)
            return
        L_0x05d1:
            r2.A0N(r0)
            return
        L_0x05d5:
            int r2 = r1.getWidth()
            boolean r1 = r6.A79()
            X.66R r0 = r6.A0F
            int r0 = X.AnonymousClass0x2.A09(r0)
            r5.A00(r2, r0, r1)
            X.4pj r0 = r6.A05
            if (r0 != 0) goto L_0x05f1
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x05ef:
            r1 = 0
            goto L_0x05f5
        L_0x05f1:
            int r1 = r0.getMeasuredHeight()
        L_0x05f5:
            X.66R r12 = r4.A0A
            int r0 = X.AnonymousClass0x2.A09(r12)
            int r9 = java.lang.Math.max(r1, r0)
            com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView r6 = r4.A75()
            X.4Uf r0 = r6.A01
            if (r0 != 0) goto L_0x060e
            java.lang.String r0 = "messageSelectionDropDownViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x060e:
            X.107 r0 = r0.A02
            java.lang.Object r2 = X.C86634Kw.A0v(r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            X.4Wq r0 = r6.A00
            java.lang.String r16 = "messageSelectionDropDownRecyclerViewAdapter"
            if (r0 != 0) goto L_0x0621
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r16)
            throw r0
        L_0x0621:
            r8 = 0
            X.0Ua r13 = r0.A04(r6, r8)
            X.4YF r13 = (X.AnonymousClass4YF) r13
            android.content.res.Resources r1 = X.C18290x4.A0G(r6)
            r0 = 2131167337(0x7f070869, float:1.7948945E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r5 = X.C86664Kz.A05(r0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r8)
            java.util.Iterator r15 = r2.iterator()
            r11 = 0
        L_0x0640:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x067a
            java.lang.Object r0 = r15.next()
            X.5Pc r0 = (X.C103965Pc) r0
            java.util.LinkedList r0 = r0.A00
            java.util.Iterator r14 = r0.iterator()
            r2 = 0
        L_0x0653:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0675
            java.lang.Object r1 = r14.next()
            X.66j r1 = (X.C1229266j) r1
            X.4Wq r0 = r6.A00
            if (r0 != 0) goto L_0x0668
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r16)
            throw r0
        L_0x0668:
            r0.A0K(r1, r13, r8)
            android.view.View r0 = r13.A0H
            r0.measure(r5, r3)
            int r2 = X.AnonymousClass4L0.A04(r0, r2)
            goto L_0x0653
        L_0x0675:
            int r11 = java.lang.Math.max(r11, r2)
            goto L_0x0640
        L_0x067a:
            int r0 = r6.getPaddingTop()
            int r11 = r11 + r0
            int r0 = r6.getPaddingBottom()
            int r11 = r11 + r0
            int r5 = r7.getHeight()
            int r1 = r10 - r9
            int r1 = r1 - r11
            int r0 = X.AnonymousClass0x2.A09(r12)
            r6 = 2
            int r0 = r0 * 2
            int r1 = r1 - r0
            r3 = 0
            if (r5 <= r1) goto L_0x06e1
            float r14 = (float) r1
            float r0 = (float) r5
            float r14 = r14 / r0
            boolean r2 = r4.A79()
            android.view.View r0 = r7.A0l
            float r1 = r0.getX()
            if (r2 == 0) goto L_0x06aa
            float r0 = X.AnonymousClass4L0.A00(r0)
            float r1 = r1 + r0
        L_0x06aa:
            r7.setPivotX(r1)
            r0 = 0
            r7.setPivotY(r0)
            float[] r1 = new float[r6]
            r13 = 1065353216(0x3f800000, float:1.0)
            r1[r8] = r13
            r3 = 1
            r1[r3] = r14
            java.lang.String r0 = "scaleX"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r7, r0, r1)
            float[] r1 = new float[r6]
            r1[r8] = r13
            r1[r3] = r14
            java.lang.String r0 = "scaleY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r1)
            android.animation.AnimatorSet r3 = X.C86664Kz.A0O()
            android.animation.Animator[] r0 = X.C86664Kz.A1b(r2, r0, r6, r8)
            r3.playTogether(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            android.view.animation.Interpolator r0 = X.C100865Co.A00
            r3.setInterpolator(r0)
        L_0x06e1:
            X.66R r2 = r4.A09
            int r1 = X.AnonymousClass0x2.A09(r2)
            int r10 = r10 - r5
            int r10 = r10 - r11
            int r0 = X.AnonymousClass0x2.A09(r12)
            int r0 = r0 * 2
            int r10 = r10 - r0
            int r0 = java.lang.Math.min(r1, r10)
            int r5 = java.lang.Math.max(r0, r9)
            int r0 = X.AnonymousClass0x2.A09(r2)
            if (r5 == r0) goto L_0x073d
            float[] r2 = new float[r6]
            X.7k9 r0 = X.C106895aL.A00(r7)
            int r0 = r0.A03
            int r0 = r0 - r5
            float r0 = (float) r0
            r2[r8] = r0
            r1 = 1
            r0 = 0
            r2[r1] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r7, r0, r2)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.view.animation.Interpolator r0 = X.C100865Co.A00
            r2.setInterpolator(r0)
            X.0xB r0 = new X.0xB
            r0.<init>(r7, r5)
            r2.addListener(r0)
            if (r3 == 0) goto L_0x073b
            android.animation.AnimatorSet r1 = X.C86664Kz.A0O()
            android.animation.Animator[] r0 = new android.animation.Animator[r6]
            X.C18280x3.A19(r2, r3, r0)
            r1.playTogether(r0)
            r3 = r1
        L_0x0735:
            r0 = 13
            X.AnonymousClass67L.A00(r3, r4, r0)
            return
        L_0x073b:
            r3 = r2
            goto L_0x0735
        L_0x073d:
            if (r3 != 0) goto L_0x0735
            r4.A76()
            return
        L_0x0743:
            java.lang.String r0 = "activityLifecycleCallbacks"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117625sE.run():void");
    }

    public C117625sE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
