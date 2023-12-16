package com.whatsapp.expressionstray;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onTabsUpdated$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onTabsUpdated$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $from;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onTabsUpdated$1(ExpressionsSearchViewModel expressionsSearchViewModel, C84814Du r3, int i) {
        super(r3, 2);
        this.this$0 = expressionsSearchViewModel;
        this.$from = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r4.A00 != 8) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r11) {
        /*
            r10 = this;
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r10.label
            r0 = 1
            if (r1 == 0) goto L_0x0061
            if (r1 != r0) goto L_0x0080
            java.lang.Object r6 = r10.L$0
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r6 = (com.whatsapp.expressionstray.ExpressionsSearchViewModel) r6
            X.C57682u2.A01(r11)
        L_0x0010:
            java.util.List r11 = (java.util.List) r11
            r6.A04 = r11
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r0 = r10.this$0
            java.util.List r1 = r0.A04
            X.2Kr r0 = r0.A03
            int r8 = r1.indexOf(r0)
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r4 = r10.this$0
            if (r8 >= 0) goto L_0x002e
            java.lang.String r1 = "expression_search_tabs_update_failed"
        L_0x0024:
            java.lang.Integer r0 = X.AnonymousClass0x9.A0k(r8)
            r4.A0F(r1, r0)
        L_0x002b:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x002e:
            java.util.List r0 = r4.A04
            boolean r0 = r0.isEmpty()
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r4 = r10.this$0
            if (r0 == 0) goto L_0x003b
            java.lang.String r1 = "expression_search_tabs_update_failed_expression_tabs_is_empty"
            goto L_0x0024
        L_0x003b:
            X.08M r3 = r4.A07
            X.2Kr r6 = r4.A03
            r5 = 0
            java.util.List r7 = r4.A04
            X.1VX r2 = r4.A0B
            r1 = 3403(0xd4b, float:4.769E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0055
            int r2 = r4.A00
            r1 = 8
            r0 = 1
            if (r2 == r1) goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            r9 = r0 ^ 1
            X.1TQ r4 = new X.1TQ
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A0H(r4)
            goto L_0x002b
        L_0x0061:
            X.C57682u2.A01(r11)
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r6 = r10.this$0
            int r5 = r10.$from
            r6.A00 = r5
            X.2md r4 = r6.A09
            r10.L$0 = r6
            r10.label = r0
            r3 = 0
            X.3gB r2 = r4.A04
            r1 = 0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2 r0 = new com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2
            r0.<init>(r4, r1, r5, r3)
            java.lang.Object r11 = X.C616131n.A00(r10, r2, r0)
            if (r11 != r7) goto L_0x0010
            return r7
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.ExpressionsSearchViewModel$onTabsUpdated$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ExpressionsSearchViewModel$onTabsUpdated$1(this.this$0, r5, this.$from);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
