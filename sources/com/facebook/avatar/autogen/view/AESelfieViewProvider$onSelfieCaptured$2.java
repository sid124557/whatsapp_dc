package com.facebook.avatar.autogen.view;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass4NO;
import X.AnonymousClass7FG;
import X.AnonymousClass90J;
import X.C100295Aj;
import X.C159147lC;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import android.animation.ValueAnimator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.view.AESelfieViewProvider$onSelfieCaptured$2", f = "AESelfieViewProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AESelfieViewProvider$onSelfieCaptured$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Map $urisMap;
    public int label;
    public final /* synthetic */ C159147lC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AESelfieViewProvider$onSelfieCaptured$2(C159147lC r2, Map map, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$urisMap = map;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C159147lC r1 = this.this$0;
            AnonymousClass4NO r4 = r1.A02;
            if (r4 != null) {
                AnonymousClass7FG r3 = new AnonymousClass7FG(r1, this.$urisMap);
                ValueAnimator valueAnimator = r4.A01;
                valueAnimator.start();
                valueAnimator.addUpdateListener(new C100295Aj(r4, 0));
                valueAnimator.addListener(new AnonymousClass90J(r3, 0));
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AESelfieViewProvider$onSelfieCaptured$2(this.this$0, this.$urisMap, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
