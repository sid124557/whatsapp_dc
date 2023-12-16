package com.facebook.avatar.autogen.facetracker;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass7H4;
import X.AnonymousClass82E;
import X.C142476xG;
import X.C154237cq;
import X.C162457s7;
import X.C180338ks;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$getModels$modelFetching$1", f = "AEFaceTrackerManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AEFaceTrackerManager$getModels$modelFetching$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AEFaceTrackerManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AEFaceTrackerManager$getModels$modelFetching$1(AEFaceTrackerManager aEFaceTrackerManager, C84814Du r3) {
        super(r3, 2);
        this.this$0 = aEFaceTrackerManager;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C180338ks r0 = this.this$0.A01;
            C142476xG r2 = C142476xG.MODEL_FETCH;
            AnonymousClass7H4 r02 = ((AnonymousClass82E) r0).A04.A08;
            String str = r2.key;
            C162457s7.A0J(str, 0);
            C154237cq.A00(r02.A00, r02.A01, str, 36);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AEFaceTrackerManager$getModels$modelFetching$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AEFaceTrackerManager$getModels$modelFetching$1(this.this$0, (C84814Du) obj2).A09(C59022wD.A00);
    }
}
