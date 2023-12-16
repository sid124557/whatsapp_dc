package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.5fO  reason: invalid class name and case insensitive filesystem */
public abstract class C109915fO implements View.OnTouchListener {
    public final Matrix A00 = AnonymousClass002.A05();
    public final AnonymousClass1VX A01;
    public final PhotoView A02;
    public final C30471mV A03;

    public C109915fO(AnonymousClass1VX r2, PhotoView photoView, C30471mV r4) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = photoView;
    }

    public abstract void A00(MotionEvent motionEvent);

    public abstract void A01(InteractiveAnnotation interactiveAnnotation);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C162457s7.A0J(motionEvent, 1);
        if (motionEvent.getActionMasked() == 1) {
            PhotoView photoView = this.A02;
            Bitmap photo = photoView.getPhoto();
            if (photo != null) {
                Matrix imageMatrix = photoView.getImageMatrix();
                Matrix matrix = this.A00;
                imageMatrix.invert(matrix);
                float[] fArr = {motionEvent.getRawX() - ((float) photoView.getLeft()), motionEvent.getRawY() - ((float) photoView.getTop())};
                float[] fArr2 = {(float) photo.getWidth(), (float) photo.getHeight()};
                matrix.mapPoints(fArr);
                InteractiveAnnotation A012 = C105445Uy.A01(this.A01, this.A03, fArr, fArr2, false);
                if (A012 != null) {
                    A01(A012);
                }
            }
            A00(motionEvent);
            return true;
        }
        return true;
    }
}
