package com.bloks.components.bkcomponentaeparametricslider;

import X.AnonymousClass001;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass84O;
import X.AnonymousClass8P9;
import X.C152057Xj;
import X.C153427bI;
import X.C159377lj;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C835248t;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bloks.components.bkcomponentaeparametricslider.ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1", f = "ParametricSliderPreviewUnit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C153427bI $bloksContext;
    public final /* synthetic */ AnonymousClass84O $component;
    public final /* synthetic */ C835248t $expression;
    public final /* synthetic */ int $p1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1(C153427bI r2, AnonymousClass84O r3, C835248t r4, C84814Du r5, int i) {
        super(r5, 2);
        this.$expression = r4;
        this.$component = r3;
        this.$p1 = i;
        this.$bloksContext = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C835248t r5 = this.$expression;
            if (r5 != null) {
                AnonymousClass84O r4 = this.$component;
                C152057Xj r3 = new C152057Xj();
                r3.A04(new Float(((float) this.$p1) / ((float) 100)), 0);
                r3.A04(this.$bloksContext, 1);
                C159377lj.A01(this.$bloksContext, r4, r3.A03(), r5);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        C835248t r3 = this.$expression;
        return new ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1(this.$bloksContext, this.$component, r3, r8, this.$p1);
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
