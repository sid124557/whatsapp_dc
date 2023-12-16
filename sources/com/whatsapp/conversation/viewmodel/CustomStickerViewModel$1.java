package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C194410o;
import X.C57682u2;
import X.C59022wD;
import X.C60392yU;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CustomStickerViewModel$1", f = "CustomStickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CustomStickerViewModel$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C194410o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomStickerViewModel$1(C194410o r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        int height;
        int width;
        Bitmap createBitmap;
        C85524Gp r2;
        if (this.label == 0) {
            C57682u2.A01(obj);
            C194410o r0 = this.this$0;
            Bitmap decodeStream = BitmapFactory.decodeStream(r0.A05.A07(r0.A01, true), (Rect) null, (BitmapFactory.Options) null);
            if (decodeStream != null) {
                C194410o r7 = this.this$0;
                if (decodeStream.getWidth() == decodeStream.getHeight()) {
                    height = 0;
                } else if (decodeStream.getWidth() > decodeStream.getHeight()) {
                    width = decodeStream.getWidth() - decodeStream.getHeight();
                    height = 0;
                    createBitmap = Bitmap.createBitmap(decodeStream.getWidth() + height, decodeStream.getHeight() + width, decodeStream.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(0);
                    canvas.drawBitmap(decodeStream, ((float) height) / 2.0f, ((float) width) / 2.0f, new Paint(2));
                    C162457s7.A0D(createBitmap);
                    r2 = r7.A09;
                    do {
                    } while (!r2.AzD(r2.getValue(), new C60392yU(createBitmap)));
                    decodeStream.recycle();
                } else {
                    height = decodeStream.getHeight() - decodeStream.getWidth();
                }
                width = 0;
                createBitmap = Bitmap.createBitmap(decodeStream.getWidth() + height, decodeStream.getHeight() + width, decodeStream.getConfig());
                Canvas canvas2 = new Canvas(createBitmap);
                canvas2.drawColor(0);
                canvas2.drawBitmap(decodeStream, ((float) height) / 2.0f, ((float) width) / 2.0f, new Paint(2));
                C162457s7.A0D(createBitmap);
                r2 = r7.A09;
                do {
                } while (!r2.AzD(r2.getValue(), new C60392yU(createBitmap)));
                decodeStream.recycle();
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CustomStickerViewModel$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new CustomStickerViewModel$1(this.this$0, (C84814Du) obj2));
    }
}
