package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.0SE  reason: invalid class name */
public class AnonymousClass0SE {
    public static final boolean A00;

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 28) {
            z = false;
        }
        A00 = z;
    }

    public static View A00(View view, View view2, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        int i;
        Matrix A05 = AnonymousClass002.A05();
        A05.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        C04720Qj r0 = AnonymousClass0VZ.A02;
        View view3 = view;
        r0.A02(A05, view);
        ViewGroup viewGroup3 = viewGroup;
        r0.A03(A05, viewGroup3);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        A05.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean z = !view.isAttachedToWindow();
        boolean isAttachedToWindow = viewGroup3.isAttachedToWindow();
        Bitmap bitmap = null;
        if (z) {
            if (isAttachedToWindow) {
                viewGroup2 = (ViewGroup) view.getParent();
                i = viewGroup2.indexOfChild(view);
                viewGroup3.getOverlay().add(view);
            }
            AnonymousClass001.A19(imageView, round4 - round2, 1073741824, View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824));
            imageView.layout(round, round2, round3, round4);
            return imageView;
        }
        viewGroup2 = null;
        i = 0;
        int round5 = Math.round(rectF.width());
        int round6 = Math.round(rectF.height());
        if (round5 > 0 && round6 > 0) {
            float min = Math.min(1.0f, 1048576.0f / ((float) (round5 * round6)));
            int A07 = AnonymousClass001.A07((float) round5, min);
            int A072 = AnonymousClass001.A07((float) round6, min);
            A05.postTranslate(-rectF.left, -rectF.top);
            A05.postScale(min, min);
            if (A00) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(A07, A072);
                beginRecording.concat(A05);
                view3.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(A07, A072, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(A05);
                view3.draw(canvas);
            }
        }
        if (z) {
            viewGroup3.getOverlay().remove(view3);
            viewGroup2.addView(view3, i);
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
        AnonymousClass001.A19(imageView, round4 - round2, 1073741824, View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }
}
