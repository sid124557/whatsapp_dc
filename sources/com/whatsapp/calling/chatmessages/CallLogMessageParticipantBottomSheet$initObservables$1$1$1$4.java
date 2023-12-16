package com.whatsapp.calling.chatmessages;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.widget.TextView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet$initObservables$1$1$1$4", f = "CallLogMessageParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheet$initObservables$1$1$1$4 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheet$initObservables$1$1$1$4(CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet, C84814Du r3) {
        super(r3, 2);
        this.this$0 = callLogMessageParticipantBottomSheet;
    }

    public final Object A09(Object obj) {
        TextView textView;
        if (this.label == 0) {
            C57682u2.A01(obj);
            String str = (String) this.L$0;
            if (!(str == null || (textView = this.this$0.A00) == null)) {
                textView.setText(str);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        CallLogMessageParticipantBottomSheet$initObservables$1$1$1$4 callLogMessageParticipantBottomSheet$initObservables$1$1$1$4 = new CallLogMessageParticipantBottomSheet$initObservables$1$1$1$4(this.this$0, r4);
        callLogMessageParticipantBottomSheet$initObservables$1$1$1$4.L$0 = obj;
        return callLogMessageParticipantBottomSheet$initObservables$1$1$1$4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
