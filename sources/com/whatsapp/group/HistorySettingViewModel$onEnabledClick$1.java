package com.whatsapp.group;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1", f = "HistorySettingViewModel.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {96, 101, 108, 111, 115}, m = "invokeSuspend", n = {"groupJid", "contact", "groupJid", "contact", "groupJid", "contact", "groupJid", "contact"}, s = {"L$1", "L$2", "L$1", "L$2", "L$1", "L$2", "L$1", "L$2"})
public final class HistorySettingViewModel$onEnabledClick$1 extends C75003pT implements AnonymousClass4GR {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ HistorySettingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistorySettingViewModel$onEnabledClick$1(HistorySettingViewModel historySettingViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = historySettingViewModel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r13) {
        /*
            r12 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r12.label
            r4 = 5
            r9 = 4
            r10 = 3
            r2 = 2
            r8 = 1
            if (r0 == 0) goto L_0x001b
            if (r0 == r8) goto L_0x00a9
            if (r0 == r2) goto L_0x00a9
            if (r0 == r10) goto L_0x0085
            if (r0 == r9) goto L_0x00a9
            if (r0 != r4) goto L_0x00ef
            X.C57682u2.A01(r13)
        L_0x0018:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x001b:
            X.C57682u2.A01(r13)
            com.whatsapp.group.HistorySettingViewModel r5 = r12.this$0
            X.1fJ r6 = r5.A01
            if (r6 == 0) goto L_0x0018
            X.3ZH r7 = r5.A00
            if (r7 == 0) goto L_0x0018
            X.1ip r0 = r5.A02
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0043
            X.4Gn r1 = r5.A0A
            X.1e5 r0 = X.C27541e5.A00
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r8
        L_0x003c:
            java.lang.Object r0 = r1.BlD(r0, r12)
            if (r0 != r3) goto L_0x00b8
            return r3
        L_0x0043:
            X.2sj r0 = r5.A04
            boolean r0 = r0.A0D(r6)
            if (r0 != 0) goto L_0x0058
            X.4Gn r1 = r5.A0A
            X.1e6 r0 = X.C27551e6.A00
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r2
            goto L_0x003c
        L_0x0058:
            X.4Gp r11 = r5.A0C
            java.lang.Object r0 = r11.getValue()
            X.2kG r0 = (X.C51712kG) r0
            boolean r0 = r0.A00
            r8 = r0 ^ 1
        L_0x0064:
            java.lang.Object r2 = r11.getValue()
            r1 = 0
            X.2kG r0 = new X.2kG
            r0.<init>(r8, r1)
            boolean r0 = r11.AzD(r2, r0)
            if (r0 == 0) goto L_0x0064
            com.whatsapp.grouphistory.xmpp.EnableGroupHistoryProtocolHelper r0 = r5.A09
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r10
            java.lang.Object r13 = r0.A00(r6, r12, r8)
            if (r13 != r3) goto L_0x0094
            return r3
        L_0x0085:
            java.lang.Object r7 = r12.L$2
            X.3ZH r7 = (X.AnonymousClass3ZH) r7
            java.lang.Object r6 = r12.L$1
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
            java.lang.Object r5 = r12.L$0
            com.whatsapp.group.HistorySettingViewModel r5 = (com.whatsapp.group.HistorySettingViewModel) r5
            X.C57682u2.A01(r13)
        L_0x0094:
            X.1eK r0 = X.C27661eK.A00
            boolean r0 = X.C162457s7.A0P(r13, r0)
            if (r0 == 0) goto L_0x00d3
            X.4Gn r1 = r5.A0A
            X.1e7 r0 = X.C27561e7.A00
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r9
            goto L_0x003c
        L_0x00a9:
            java.lang.Object r7 = r12.L$2
            X.3ZH r7 = (X.AnonymousClass3ZH) r7
            java.lang.Object r6 = r12.L$1
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
            java.lang.Object r5 = r12.L$0
            com.whatsapp.group.HistorySettingViewModel r5 = (com.whatsapp.group.HistorySettingViewModel) r5
            X.C57682u2.A01(r13)
        L_0x00b8:
            X.4Gp r4 = r5.A0C
        L_0x00ba:
            java.lang.Object r3 = r4.getValue()
            boolean r2 = r7.A0i
            X.2sj r0 = r5.A04
            boolean r1 = r0.A0D(r6)
            X.2kG r0 = new X.2kG
            r0.<init>(r2, r1)
            boolean r0 = r4.AzD(r3, r0)
            if (r0 == 0) goto L_0x00ba
            goto L_0x0018
        L_0x00d3:
            X.1eL r0 = X.C27671eL.A00
            boolean r0 = X.C162457s7.A0P(r13, r0)
            if (r0 == 0) goto L_0x0018
            X.4Gn r2 = r5.A0A
            X.1e8 r1 = X.C27571e8.A00
            r0 = 0
            r12.L$0 = r0
            r12.L$1 = r0
            r12.L$2 = r0
            r12.label = r4
            java.lang.Object r0 = r2.BlD(r1, r12)
            if (r0 != r3) goto L_0x0018
            return r3
        L_0x00ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new HistorySettingViewModel$onEnabledClick$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new HistorySettingViewModel$onEnabledClick$1(this.this$0, (C84814Du) obj2));
    }
}
