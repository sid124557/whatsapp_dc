package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass36T;
import X.AnonymousClass3ZF;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import android.content.Context;
import com.whatsapp.jid.GroupJid;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1", f = "CallLogMessageParticipantBottomSheetViewModel.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass3ZF $callLog;
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1(Context context, CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel, AnonymousClass3ZF r4, C84814Du r5) {
        super(r5, 2);
        this.$callLog = r4;
        this.this$0 = callLogMessageParticipantBottomSheetViewModel;
        this.$context = context;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            boolean A1U = AnonymousClass000.A1U(this.$callLog.A0H, 2);
            GroupJid groupJid = this.$callLog.A05;
            CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel = this.this$0;
            AnonymousClass3ZH A01 = AnonymousClass36T.A01(callLogMessageParticipantBottomSheetViewModel.A09, callLogMessageParticipantBottomSheetViewModel.A0G, groupJid, callLogMessageParticipantBottomSheetViewModel.A0H, A1U);
            if (A01 != null) {
                CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel2 = this.this$0;
                Context context = this.$context;
                AnonymousClass3ZF r9 = this.$callLog;
                List A03 = AnonymousClass36T.A03(callLogMessageParticipantBottomSheetViewModel2.A05, callLogMessageParticipantBottomSheetViewModel2.A09, callLogMessageParticipantBottomSheetViewModel2.A0E, A01);
                C73853gB r0 = callLogMessageParticipantBottomSheetViewModel2.A0K;
                CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1 callLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1 = new CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1(context, callLogMessageParticipantBottomSheetViewModel2, A01, r9, A03, (C84814Du) null);
                this.label = 1;
                if (C616131n.A00(this, r0, callLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1) == r3) {
                    return r3;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        AnonymousClass3ZF r3 = this.$callLog;
        return new CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1(this.$context, this.this$0, r3, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
