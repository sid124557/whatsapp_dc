package com.whatsapp.calling.chatmessages;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass218;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.C05100Ry;
import X.C15910sA;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1", f = "AdhocParticipantBottomSheet.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheet$initObservables$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheet this$0;

    @DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1", f = "AdhocParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public /* synthetic */ Object L$0;
        public int label;

        public final Object A09(Object obj) {
            if (this.label == 0) {
                C57682u2.A01(obj);
                AnonymousClass4C6 r5 = (AnonymousClass4C6) this.L$0;
                AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel = (AdhocParticipantBottomSheetViewModel) AdhocParticipantBottomSheet.this.A0A.getValue();
                AdhocParticipantBottomSheet adhocParticipantBottomSheet = AdhocParticipantBottomSheet.this;
                C75003pT.A05(new AdhocParticipantBottomSheet$initObservables$1$1$1$1(adhocParticipantBottomSheet, (C84814Du) null), r5, adhocParticipantBottomSheetViewModel.A0I);
                C75003pT.A05(new AdhocParticipantBottomSheet$initObservables$1$1$1$2(adhocParticipantBottomSheet, (C84814Du) null), r5, adhocParticipantBottomSheetViewModel.A0G);
                C75003pT.A05(new AdhocParticipantBottomSheet$initObservables$1$1$1$3(adhocParticipantBottomSheet, (C84814Du) null), r5, adhocParticipantBottomSheetViewModel.A0F);
                C75003pT.A05(new AdhocParticipantBottomSheet$initObservables$1$1$1$4(adhocParticipantBottomSheet, (C84814Du) null), r5, adhocParticipantBottomSheetViewModel.A0E);
                C75003pT.A05(new AdhocParticipantBottomSheet$initObservables$1$1$1$5(adhocParticipantBottomSheet, (C84814Du) null), r5, adhocParticipantBottomSheetViewModel.A0H);
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheet$initObservables$1(AdhocParticipantBottomSheet adhocParticipantBottomSheet, C84814Du r3) {
        super(r3, 2);
        this.this$0 = adhocParticipantBottomSheet;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final AdhocParticipantBottomSheet adhocParticipantBottomSheet = this.this$0;
            C15910sA A0V = adhocParticipantBottomSheet.A0V();
            AnonymousClass0GC r2 = AnonymousClass0GC.STARTED;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C05100Ry.A01(r2, A0V, this, r0) == r6) {
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
        return new AdhocParticipantBottomSheet$initObservables$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AdhocParticipantBottomSheet$initObservables$1(this.this$0, (C84814Du) obj2));
    }
}
