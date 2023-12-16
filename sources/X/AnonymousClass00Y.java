package X;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* renamed from: X.00Y  reason: invalid class name */
public class AnonymousClass00Y extends SharedElementCallback {
    public final AnonymousClass0P4 A00;

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        Bitmap createBitmap;
        AnonymousClass0P4 r11 = this.A00;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
                    if (!(drawable instanceof BitmapDrawable) || min != 1.0f) {
                        int i = (int) (((float) intrinsicWidth) * min);
                        int i2 = (int) (((float) intrinsicHeight) * min);
                        createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Rect bounds = drawable.getBounds();
                        int i3 = bounds.left;
                        int i4 = bounds.top;
                        int i5 = bounds.right;
                        int i6 = bounds.bottom;
                        drawable.setBounds(0, 0, i, i2);
                        drawable.draw(canvas);
                        drawable.setBounds(i3, i4, i5, i6);
                    } else {
                        createBitmap = ((BitmapDrawable) drawable).getBitmap();
                    }
                    if (createBitmap != null) {
                        Bundle A08 = AnonymousClass002.A08();
                        A08.putParcelable("sharedElement:snapshot:bitmap", createBitmap);
                        A08.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                            float[] fArr = new float[9];
                            imageView.getImageMatrix().getValues(fArr);
                            A08.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                        }
                        return A08;
                    }
                }
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min2 = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
        int i7 = (int) (((float) round) * min2);
        int i8 = (int) (((float) round2) * min2);
        Matrix matrix2 = r11.A00;
        if (matrix2 == null) {
            matrix2 = AnonymousClass002.A05();
            r11.A00 = matrix2;
        }
        matrix2.set(matrix);
        r11.A00.postTranslate(-rectF.left, -rectF.top);
        r11.A00.postScale(min2, min2);
        Bitmap createBitmap2 = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        canvas2.concat(r11.A00);
        view.draw(canvas2);
        return createBitmap2;
    }

    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        ImageView imageView = null;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap != null) {
                imageView = new ImageView(context);
                imageView.setImageBitmap(bitmap);
                imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                    Matrix A05 = AnonymousClass002.A05();
                    A05.setValues(floatArray);
                    imageView.setImageMatrix(A05);
                }
            }
        } else if (parcelable instanceof Bitmap) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap((Bitmap) parcelable);
            return imageView2;
        }
        return imageView;
    }

    public void onMapSharedElements(List list, Map map) {
        this.A00.A03(list, map);
    }

    public void onSharedElementEnd(List list, List list2, List list3) {
        this.A00.A02(list, list2, list3);
    }

    public void onSharedElementStart(List list, List list2, List list3) {
        this.A00.A01(list, list2, list3);
    }

    public void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        new AnonymousClass0N0(onSharedElementsReadyListener).A00();
    }

    public AnonymousClass00Y(AnonymousClass0P4 r1) {
        this.A00 = r1;
    }

    public void onRejectSharedElements(List list) {
    }
}
