package com.whatsapp.events;

import X.AnonymousClass001;
import X.AnonymousClass11L;
import X.AnonymousClass4GR;
import X.C30461mU;
import X.C383026z;
import X.C57682u2;
import X.C59022wD;
import X.C60572ym;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoViewModel$1", f = "EventInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoViewModel$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass11L this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoViewModel$1(AnonymousClass11L r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass11L r0 = this.this$0;
            C30461mU r4 = (C30461mU) r0.A06.A05(r0.A05);
            if (r4 == null) {
                Log.d("EventInfoViewModel/init/message not found in DB");
            } else {
                C85524Gp r3 = this.this$0.A08;
                do {
                } while (!r3.AzD(r3.getValue(), new C60572ym(r4, AnonymousClass001.A0s())));
                AnonymousClass11L r32 = this.this$0;
                r32.A04.A00(r4, "EventInfoViewModel", new C383026z(r32, 16));
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new EventInfoViewModel$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new EventInfoViewModel$1(this.this$0, (C84814Du) obj2));
    }
}
