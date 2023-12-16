package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass28P;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$handleAvatarEvent$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {380}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$handleAvatarEvent$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass28P $event;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$handleAvatarEvent$1(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, AnonymousClass28P r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = expressionsKeyboardViewModel;
        this.$event = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r8.this$0.A08.A0Y(X.C58422vE.A02, 4890) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r0.contains(r3) != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 != r6) goto L_0x007d
            java.lang.Object r5 = r8.L$0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r5 = (com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel) r5
            X.C57682u2.A01(r9)
        L_0x0010:
            java.util.List r9 = (java.util.List) r9
            r5.A03 = r9
            X.28P r1 = r8.$event
            boolean r0 = r1 instanceof X.C30071lo
            if (r0 == 0) goto L_0x0050
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r1 = r8.this$0
            r0 = 0
            r1.A01 = r0
            X.2Kr r1 = r1.A02
            X.1TY r0 = X.AnonymousClass1TY.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x004b
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            java.util.List r0 = r0.A03
            X.1Tb r3 = X.AnonymousClass1Tb.A00
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x004b
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.1VX r2 = r0.A08
            r1 = 4890(0x131a, float:6.852E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x004b
        L_0x0043:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
        L_0x0045:
            r0.A0E(r3)
        L_0x0048:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x004b:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            X.2Kr r3 = r0.A02
            goto L_0x0045
        L_0x0050:
            boolean r0 = r1 instanceof X.C30061ln
            if (r0 == 0) goto L_0x0048
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r8.this$0
            java.util.List r0 = r0.A03
            X.1TY r3 = X.AnonymousClass1TY.A00
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0048
            goto L_0x0043
        L_0x0061:
            X.C57682u2.A01(r9)
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r5 = r8.this$0
            X.2md r4 = r5.A06
            int r3 = r5.A00
            r8.L$0 = r5
            r8.label = r6
            X.3gB r2 = r4.A04
            r1 = 0
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2 r0 = new com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2
            r0.<init>(r4, r1, r3, r6)
            java.lang.Object r9 = X.C616131n.A00(r8, r2, r0)
            if (r9 != r7) goto L_0x0010
            return r7
        L_0x007d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$handleAvatarEvent$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ExpressionsKeyboardViewModel$handleAvatarEvent$1(this.this$0, this.$event, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
