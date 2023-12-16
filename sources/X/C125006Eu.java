package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* renamed from: X.6Eu  reason: invalid class name and case insensitive filesystem */
public class C125006Eu extends ViewOutlineProvider {
    public final Rect A00 = AnonymousClass001.A0N();
    public final /* synthetic */ ShapeableImageView A01;

    public C125006Eu(ShapeableImageView shapeableImageView) {
        this.A01 = shapeableImageView;
    }

    public void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.A01;
        C161877ql r1 = shapeableImageView.A0A;
        if (r1 != null) {
            if (shapeableImageView.A09 == null) {
                shapeableImageView.A09 = new AnonymousClass6D7(r1);
            }
            RectF rectF = shapeableImageView.A0F;
            Rect rect = this.A00;
            rectF.round(rect);
            shapeableImageView.A09.setBounds(rect);
            shapeableImageView.A09.getOutline(outline);
        }
    }
}
