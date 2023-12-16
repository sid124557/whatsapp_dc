package com.whatsapp.events;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C18280x3;
import X.C19340zH;
import X.C57682u2;
import X.C59022wD;
import X.C60402yV;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreationFragment$onViewCreated$3", f = "EventCreationFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreationFragment$onViewCreated$3 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ EventCreationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreationFragment$onViewCreated$3(EventCreationFragment eventCreationFragment, C84814Du r3) {
        super(r3, 2);
        this.this$0 = eventCreationFragment;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            EventCreationFragment eventCreationFragment = this.this$0;
            Integer num = ((C60402yV) this.L$0).A00;
            if (num != null) {
                int intValue = num.intValue();
                C19340zH A0K = C18280x3.A0K(eventCreationFragment);
                A0K.A0T(intValue);
                C19340zH.A02(eventCreationFragment, A0K);
                A0K.A0S();
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        EventCreationFragment$onViewCreated$3 eventCreationFragment$onViewCreated$3 = new EventCreationFragment$onViewCreated$3(this.this$0, r4);
        eventCreationFragment$onViewCreated$3.L$0 = obj;
        return eventCreationFragment$onViewCreated$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
