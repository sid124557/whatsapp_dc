package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onTabsUpdated$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$onTabsUpdated$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $from;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$onTabsUpdated$1(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, C84814Du r3, int i) {
        super(r3, 2);
        this.this$0 = expressionsKeyboardViewModel;
        this.$from = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        return X.C59022wD.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = r2.A03.isEmpty();
        r2 = r8.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r1 = "expression_keyboard_tab_update_failed_expression_tabs_is_empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        r2.A04.A0H(new X.AnonymousClass1Tc(r2.A01, r2.A02, r2.A03, r6, r2.A0A.A01()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        r0 = X.C162457s7.A0P(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (r0 != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r8.this$0.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        r0 = r8.this$0;
        r6 = r0.A03.indexOf(r0.A02);
        r2 = r8.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r6 >= 0) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r1 = "expression_keyboard_tab_update_failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        r2.A0G(r1, X.AnonymousClass0x9.A0k(r6));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x0093
            if (r0 != r6) goto L_0x00c3
            java.lang.Object r5 = r8.L$0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r5 = (com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel) r5
            X.C57682u2.A01(r9)
        L_0x0010:
            java.util.List r9 = (java.util.List) r9
            r5.A03 = r9
            int r0 = r8.$from
            switch(r0) {
                case 1: goto L_0x0081;
                case 2: goto L_0x006a;
                case 3: goto L_0x006a;
                case 4: goto L_0x0057;
                case 5: goto L_0x0057;
                case 6: goto L_0x0081;
                default: goto L_0x0019;
            }
        L_0x0019:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            java.util.List r1 = r0.A03
            X.2Kr r0 = r0.A02
            int r6 = r1.indexOf(r0)
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r2 = r8.this$0
            if (r6 >= 0) goto L_0x0033
            java.lang.String r1 = "expression_keyboard_tab_update_failed"
        L_0x0029:
            java.lang.Integer r0 = X.AnonymousClass0x9.A0k(r6)
            r2.A0G(r1, r0)
        L_0x0030:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0033:
            java.util.List r0 = r2.A03
            boolean r0 = r0.isEmpty()
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r2 = r8.this$0
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = "expression_keyboard_tab_update_failed_expression_tabs_is_empty"
            goto L_0x0029
        L_0x0040:
            X.08M r1 = r2.A04
            X.2Kr r4 = r2.A02
            android.graphics.Bitmap r3 = r2.A01
            java.util.List r5 = r2.A03
            X.2gs r0 = r2.A0A
            boolean r7 = r0.A01()
            X.1Tc r2 = new X.1Tc
            r2.<init>(r3, r4, r5, r6, r7)
            r1.A0H(r2)
            goto L_0x0030
        L_0x0057:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.2Kr r0 = r0.A02
            X.1TZ r2 = X.AnonymousClass1TZ.A00
            boolean r0 = X.C162457s7.A0P(r0, r2)
            if (r0 != 0) goto L_0x0019
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.2Kr r1 = r0.A02
            X.1Ta r0 = X.AnonymousClass1Ta.A00
            goto L_0x007c
        L_0x006a:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.2Kr r0 = r0.A02
            X.1TZ r2 = X.AnonymousClass1TZ.A00
            boolean r0 = X.C162457s7.A0P(r0, r2)
            if (r0 != 0) goto L_0x0019
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.2Kr r1 = r0.A02
            X.1Tb r0 = X.AnonymousClass1Tb.A00
        L_0x007c:
            boolean r0 = X.C162457s7.A0P(r1, r0)
            goto L_0x008b
        L_0x0081:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.2Kr r0 = r0.A02
            X.1TZ r2 = X.AnonymousClass1TZ.A00
            boolean r0 = X.C162457s7.A0P(r0, r2)
        L_0x008b:
            if (r0 != 0) goto L_0x0019
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            r0.A0F(r2)
            goto L_0x0019
        L_0x0093:
            X.C57682u2.A01(r9)
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r1 = r8.this$0
            int r0 = r8.$from
            r1.A00 = r0
            if (r0 != r6) goto L_0x00bc
            X.1TZ r0 = X.AnonymousClass1TZ.A00
        L_0x00a0:
            r1.A0F(r0)
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r5 = r8.this$0
            X.2md r4 = r5.A06
            int r3 = r8.$from
            r8.L$0 = r5
            r8.label = r6
            X.3gB r2 = r4.A04
            r1 = 0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2 r0 = new com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2
            r0.<init>(r4, r1, r3, r6)
            java.lang.Object r9 = X.C616131n.A00(r8, r2, r0)
            if (r9 != r7) goto L_0x0010
            return r7
        L_0x00bc:
            X.2md r0 = r1.A06
            X.2Kr r0 = r0.A00(r6)
            goto L_0x00a0
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onTabsUpdated$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ExpressionsKeyboardViewModel$onTabsUpdated$1(this.this$0, r5, this.$from);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
