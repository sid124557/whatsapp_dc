package com.whatsapp.calling.chatmessages;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.widget.TextView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1$1$5", f = "AdhocParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheet$initObservables$1$1$1$5 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheet$initObservables$1$1$1$5(AdhocParticipantBottomSheet adhocParticipantBottomSheet, C84814Du r3) {
        super(r3, 2);
        this.this$0 = adhocParticipantBottomSheet;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            int i = this.I$0;
            TextView textView = this.this$0.A02;
            boolean z = true;
            if (textView != null) {
                textView.setEnabled(AnonymousClass001.A1W(i));
            }
            TextView textView2 = this.this$0.A03;
            if (textView2 != null) {
                if (i <= 0) {
                    z = false;
                }
                textView2.setEnabled(z);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AdhocParticipantBottomSheet$initObservables$1$1$1$5 adhocParticipantBottomSheet$initObservables$1$1$1$5 = new AdhocParticipantBottomSheet$initObservables$1$1$1$5(this.this$0, r4);
        adhocParticipantBottomSheet$initObservables$1$1$1$5.I$0 = AnonymousClass001.A0K(obj);
        return adhocParticipantBottomSheet$initObservables$1$1$1$5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01((AnonymousClass8P9) A0A(Integer.valueOf(AnonymousClass001.A0K(obj)), (C84814Du) obj2));
    }
}
