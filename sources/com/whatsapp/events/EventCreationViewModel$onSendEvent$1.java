package com.whatsapp.events;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass11J;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C60402yV;
import X.C75003pT;
import X.C84814Du;
import X.C85504Gn;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreationViewModel$onSendEvent$1", f = "EventCreationViewModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreationViewModel$onSendEvent$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass11J this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreationViewModel$onSendEvent$1(AnonymousClass11J r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85504Gn r2 = this.this$0.A08;
            C60402yV r0 = new C60402yV(AnonymousClass0x9.A0k(R.string.f11nameremoved));
            this.label = 1;
            if (r2.BlD(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new EventCreationViewModel$onSendEvent$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new EventCreationViewModel$onSendEvent$1(this.this$0, (C84814Du) obj2));
    }
}
