package com.whatsapp.calling.chatmessages;

import X.AnonymousClass3ZF;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1", f = "CallLogMessageParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass3ZF $callLog;
    public final /* synthetic */ List $contactList;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass3ZH $it;
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1(Context context, CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel, AnonymousClass3ZH r4, AnonymousClass3ZF r5, List list, C84814Du r7) {
        super(r7, 2);
        this.this$0 = callLogMessageParticipantBottomSheetViewModel;
        this.$contactList = list;
        this.$context = context;
        this.$callLog = r5;
        this.$it = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r2.A00 != 7) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r1.A00 != 7) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            if (r0 != 0) goto L_0x0073
            X.C57682u2.A01(r12)
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r2 = r11.this$0
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0045
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0045
            X.66r r3 = r2.A06
            java.util.List r6 = r11.$contactList
            android.content.Context r4 = r11.$context
            X.3ZF r2 = r11.$callLog
            boolean r0 = r2.A0M()
            if (r0 == 0) goto L_0x0035
            r7 = 45
        L_0x0021:
            com.whatsapp.jid.GroupJid r5 = r2.A05
            r9 = 1
            X.5jl r3 = (X.C112455jl) r3
            r8 = 0
            r10 = r8
            r3.BL0(r4, r5, r6, r7, r8, r9, r10)
        L_0x002b:
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r0 = r11.this$0
            X.4Gp r1 = r0.A0M
            X.2wD r0 = X.C59022wD.A00
            r1.setValue(r0)
            return r0
        L_0x0035:
            X.39J r0 = r2.A0E
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0042
            int r1 = r2.A00
            r0 = 7
            r7 = 47
            if (r1 == r0) goto L_0x0021
        L_0x0042:
            r7 = 46
            goto L_0x0021
        L_0x0045:
            X.66r r3 = r2.A06
            java.util.List r6 = r11.$contactList
            android.content.Context r4 = r11.$context
            X.3ZF r1 = r11.$callLog
            boolean r0 = r1.A0M()
            if (r0 == 0) goto L_0x0063
            r7 = 45
        L_0x0055:
            boolean r8 = r2.A03
            X.3ZH r0 = r11.$it
            com.whatsapp.jid.Jid r5 = X.AnonymousClass3ZH.A04(r0)
            com.whatsapp.jid.GroupJid r5 = (com.whatsapp.jid.GroupJid) r5
            r3.Bpm(r4, r5, r6, r7, r8)
            goto L_0x002b
        L_0x0063:
            X.39J r0 = r1.A0E
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0070
            int r1 = r1.A00
            r0 = 7
            r7 = 47
            if (r1 == r0) goto L_0x0055
        L_0x0070:
            r7 = 46
            goto L_0x0055
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel = this.this$0;
        List list = this.$contactList;
        return new CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1(this.$context, callLogMessageParticipantBottomSheetViewModel, this.$it, this.$callLog, list, r9);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
