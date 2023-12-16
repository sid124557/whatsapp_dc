package X;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.54t  reason: invalid class name and case insensitive filesystem */
public final class C991854t extends AnonymousClass5ZM {
    public final Matrix A00;
    public final Rect A01;
    public final Rect A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Bitmap[] bitmapArr = (Bitmap[]) objArr;
        C626936e.A06(bitmapArr);
        C626936e.A0B(AnonymousClass001.A1T(bitmapArr.length));
        Bitmap bitmap = bitmapArr[0];
        try {
            Rect rect = this.A02;
            Bitmap A0Y = C86664Kz.A0Y(rect.width(), rect.height());
            Canvas A06 = AnonymousClass4L0.A06(A0Y);
            A06.drawColor(-16777216);
            A06.setMatrix(this.A00);
            A06.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), this.A01, (Paint) null);
            FilterUtils.blurNative(A0Y, 75, 2);
            return A0Y;
        } catch (OutOfMemoryError e) {
            Log.e("BlurBitmapAsyncTask/doInBackground creating output bitmap", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C179478jD r3 = (C179478jD) this.A03.get();
        if (r3 != null && bitmap != null) {
            ShapePickerView shapePickerView = (ShapePickerView) r3;
            shapePickerView.A01 = bitmap;
            ValueAnimator valueAnimator = shapePickerView.A00;
            if (valueAnimator == null) {
                int[] A1Z = C86664Kz.A1Z();
                // fill-array-data instruction
                A1Z[0] = 0;
                A1Z[1] = 255;
                ValueAnimator ofInt = ValueAnimator.ofInt(A1Z);
                shapePickerView.A00 = ofInt;
                C86644Kx.A0i(ofInt);
                shapePickerView.A00.setDuration(300);
                C86604Kt.A0w(shapePickerView.A00, shapePickerView, 21);
            } else {
                valueAnimator.cancel();
            }
            shapePickerView.A00.start();
        }
    }

    public C991854t(Matrix matrix, Rect rect, Rect rect2, C179478jD r5) {
        this.A02 = rect;
        this.A01 = rect2;
        this.A00 = matrix;
        this.A03 = AnonymousClass0x9.A14(r5);
    }
}
