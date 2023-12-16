package com.whatsapp.calling.chatmessages;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C18270x1;
import X.C195011k;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1$1$1", f = "AdhocParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheet$initObservables$1$1$1$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheet$initObservables$1$1$1$1(AdhocParticipantBottomSheet adhocParticipantBottomSheet, C84814Du r3) {
        super(r3, 2);
        this.this$0 = adhocParticipantBottomSheet;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            List list = (List) this.L$0;
            C195011k r0 = this.this$0.A06;
            if (r0 == null) {
                throw C18270x1.A0S("adapter");
            }
            r0.A0L(list);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AdhocParticipantBottomSheet$initObservables$1$1$1$1 adhocParticipantBottomSheet$initObservables$1$1$1$1 = new AdhocParticipantBottomSheet$initObservables$1$1$1$1(this.this$0, r4);
        adhocParticipantBottomSheet$initObservables$1$1$1$1.L$0 = obj;
        return adhocParticipantBottomSheet$initObservables$1$1$1$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
