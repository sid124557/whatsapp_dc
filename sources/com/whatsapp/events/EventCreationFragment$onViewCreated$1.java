package com.whatsapp.events;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass11J;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C05100Ry;
import X.C57682u2;
import X.C59022wD;
import X.C73143f0;
import X.C75003pT;
import X.C84814Du;
import X.C85564Gt;
import X.C86054Iq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreationFragment$onViewCreated$1", f = "EventCreationFragment.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreationFragment$onViewCreated$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ EventCreationFragment this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventCreationFragment$onViewCreated$1$1", f = "EventCreationFragment.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventCreationFragment$onViewCreated$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                C85564Gt r3 = ((AnonymousClass11J) EventCreationFragment.this.A0T.getValue()).A0D;
                C86054Iq r0 = new C86054Iq(EventCreationFragment.this, 12);
                this.label = 1;
                if (r3.Az8(this, r0) == r5) {
                    return r5;
                }
            } else if (i != 1) {
                throw AnonymousClass001.A0d();
            } else {
                C57682u2.A01(obj);
            }
            throw new C73143f0();
        }

        public final C84814Du A0A(Object obj, C84814Du r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A01(new AnonymousClass1((C84814Du) obj2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreationFragment$onViewCreated$1(EventCreationFragment eventCreationFragment, C84814Du r3) {
        super(r3, 2);
        this.this$0 = eventCreationFragment;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final EventCreationFragment eventCreationFragment = this.this$0;
            AnonymousClass0GC r2 = AnonymousClass0GC.STARTED;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C05100Ry.A01(r2, eventCreationFragment, this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new EventCreationFragment$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new EventCreationFragment$onViewCreated$1(this.this$0, (C84814Du) obj2));
    }
}
