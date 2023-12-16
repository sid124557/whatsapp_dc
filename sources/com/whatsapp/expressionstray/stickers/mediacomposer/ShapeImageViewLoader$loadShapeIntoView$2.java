package com.whatsapp.expressionstray.stickers.mediacomposer;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C52442lU;
import X.C57682u2;
import X.C59022wD;
import X.C69903Yy;
import X.C75003pT;
import X.C84814Du;
import android.graphics.drawable.Drawable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.mediacomposer.ShapeImageViewLoader$loadShapeIntoView$2", f = "ShapeImageViewLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ShapeImageViewLoader$loadShapeIntoView$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C69903Yy $cachedDrawable;
    public final /* synthetic */ C52442lU $task;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShapeImageViewLoader$loadShapeIntoView$2(C52442lU r2, C84814Du r3, C69903Yy r4) {
        super(r3, 2);
        this.$task = r2;
        this.$cachedDrawable = r4;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            this.$task.A00.setImageDrawable((Drawable) this.$cachedDrawable.element);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ShapeImageViewLoader$loadShapeIntoView$2(this.$task, r5, this.$cachedDrawable);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
