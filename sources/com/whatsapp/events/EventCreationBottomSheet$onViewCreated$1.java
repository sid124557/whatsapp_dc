package com.whatsapp.events;

import X.AnonymousClass001;
import X.AnonymousClass08A;
import X.AnonymousClass0GC;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C05100Ry;
import X.C162457s7;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreationBottomSheet$onViewCreated$1", f = "EventCreationBottomSheet.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreationBottomSheet$onViewCreated$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ EventCreationBottomSheet this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventCreationBottomSheet$onViewCreated$1$1", f = "EventCreationBottomSheet.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventCreationBottomSheet$onViewCreated$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A09(java.lang.Object r9) {
            /*
                r8 = this;
                X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
                int r0 = r8.label
                r7 = 1
                if (r0 == 0) goto L_0x000f
                if (r0 != r7) goto L_0x005e
                X.C57682u2.A01(r9)
            L_0x000c:
                X.2wD r0 = X.C59022wD.A00
                return r0
            L_0x000f:
                X.C57682u2.A01(r9)
                com.whatsapp.events.EventCreationBottomSheet r0 = com.whatsapp.events.EventCreationBottomSheet.this
                X.30V r2 = r0.A04
                if (r2 == 0) goto L_0x0063
                X.66R r0 = r0.A05
                java.lang.Object r1 = r0.getValue()
                X.4uZ r1 = (X.C95814uZ) r1
                r0 = 55
                r2.A02(r1, r0)
                com.whatsapp.events.EventCreationBottomSheet r5 = com.whatsapp.events.EventCreationBottomSheet.this
                X.11J r0 = r5.A03
                if (r0 != 0) goto L_0x0032
                java.lang.String r0 = "eventCreationViewModel"
                java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
                throw r0
            L_0x0032:
                X.4Gt r4 = r0.A0D
                X.44s r3 = X.C827344s.A00
                X.4GR r2 = X.C58072uf.A01
                boolean r0 = r4 instanceof X.C72783eH
                if (r0 == 0) goto L_0x0057
                r1 = r4
                X.3eH r1 = (X.C72783eH) r1
                X.4GQ r0 = r1.A00
                if (r0 != r3) goto L_0x0057
                X.4GR r0 = r1.A01
                if (r0 != r2) goto L_0x0057
            L_0x0047:
                r1 = 11
                X.4Iq r0 = new X.4Iq
                r0.<init>(r5, r1)
                r8.label = r7
                java.lang.Object r0 = r4.Az8(r8, r0)
                if (r0 != r6) goto L_0x000c
                return r6
            L_0x0057:
                X.3eH r0 = new X.3eH
                r0.<init>(r3, r2, r4)
                r4 = r0
                goto L_0x0047
            L_0x005e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
                throw r0
            L_0x0063:
                java.lang.String r0 = "navigationTimeSpentManager"
                java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.EventCreationBottomSheet$onViewCreated$1.AnonymousClass1.A09(java.lang.Object):java.lang.Object");
        }

        public final C84814Du A0A(Object obj, C84814Du r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A01(new AnonymousClass1((C84814Du) obj2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreationBottomSheet$onViewCreated$1(EventCreationBottomSheet eventCreationBottomSheet, C84814Du r3) {
        super(r3, 2);
        this.this$0 = eventCreationBottomSheet;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass08A r4 = this.this$0.A0L;
            C162457s7.A0D(r4);
            AnonymousClass0GC r3 = AnonymousClass0GC.CREATED;
            final EventCreationBottomSheet eventCreationBottomSheet = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C05100Ry.A00(r3, r4, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new EventCreationBottomSheet$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new EventCreationBottomSheet$onViewCreated$1(this.this$0, (C84814Du) obj2));
    }
}
