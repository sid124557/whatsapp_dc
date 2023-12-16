package com.whatsapp.expressionstray.stickers.mediacomposer;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2SD;
import X.AnonymousClass4GR;
import X.C105425Uw;
import X.C162457s7;
import X.C50892iw;
import X.C52442lU;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C69903Yy;
import X.C75003pT;
import X.C84814Du;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.mediacomposer.ShapeImageViewLoader$loadShape$job$1", f = "ShapeImageViewLoader.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class ShapeImageViewLoader$loadShape$job$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C52442lU $task;
    public int label;
    public final /* synthetic */ AnonymousClass2SD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShapeImageViewLoader$loadShape$job$1(C52442lU r2, AnonymousClass2SD r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$task = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass2SD r6 = this.this$0;
            C52442lU r5 = this.$task;
            this.label = 1;
            C50892iw r7 = r5.A01;
            ImageView imageView = r5.A00;
            if (C162457s7.A0P(r7, imageView.getTag())) {
                C105425Uw r9 = r5.A02;
                C69903Yy r4 = new C69903Yy();
                r4.element = r9.A09();
                Context context = r6.A01;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                if (r4.element == null) {
                    float f = (float) dimensionPixelSize;
                    r9.A0M(new RectF(), 0.0f, 0.0f, f, f);
                    Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    C162457s7.A0D(createBitmap);
                    r9.A0K(new Canvas(createBitmap));
                    r4.element = new BitmapDrawable(context.getResources(), createBitmap);
                }
                if (C162457s7.A0P(r7, imageView.getTag()) && C616131n.A00(this, r6.A05, new ShapeImageViewLoader$loadShapeIntoView$2(r5, (C84814Du) null, r4)) == r3) {
                    return r3;
                }
            }
            if (C59022wD.A00 == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ShapeImageViewLoader$loadShape$job$1(this.$task, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
