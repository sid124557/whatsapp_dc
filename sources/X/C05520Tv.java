package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0Tv  reason: invalid class name and case insensitive filesystem */
public class C05520Tv {
    public static final int[] A02 = {16843067, 16843068};
    public Bitmap A00;
    public final ProgressBar A01;

    public final Drawable A00(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof C15750rs) {
            C15750rs r1 = (C15750rs) drawable;
            Drawable drawable2 = ((AnonymousClass01J) r1).A02;
            if (drawable2 != null) {
                r1.Bns(A00(drawable2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable3 = layerDrawable.getDrawable(i);
                if (id != 16908301) {
                    z2 = false;
                    if (id != 16908303) {
                        drawableArr[i] = A00(drawable3, z2);
                    }
                }
                z2 = true;
                drawableArr[i] = A00(drawable3, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.A00 == null) {
                this.A00 = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public void A01(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = this.A01;
        AnonymousClass0UD A002 = AnonymousClass0UD.A00(progressBar.getContext(), attributeSet, A02, i, 0);
        Drawable A03 = A002.A03(0);
        if (A03 != null) {
            if (A03 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) A03;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable A003 = A00(animationDrawable.getFrame(i2), true);
                    A003.setLevel(SearchActionVerificationClientService.NOTIFICATION_ID);
                    animationDrawable2.addFrame(A003, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(SearchActionVerificationClientService.NOTIFICATION_ID);
                A03 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(A03);
        }
        Drawable A032 = A002.A03(1);
        if (A032 != null) {
            progressBar.setProgressDrawable(A00(A032, false));
        }
        A002.A02.recycle();
    }

    public C05520Tv(ProgressBar progressBar) {
        this.A01 = progressBar;
    }
}
