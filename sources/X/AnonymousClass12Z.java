package X;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.12Z  reason: invalid class name */
public final class AnonymousClass12Z extends C05570Ua {
    public final View A00;
    public final View A01;
    public final ShapeableImageView A02;
    public final WaImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass12Z(View view) {
        super(view);
        C162457s7.A0J(view, 1);
        ShapeableImageView shapeableImageView = (ShapeableImageView) C18280x3.A0E(view, R.id.icon);
        float dimension = view.getResources().getDimension(R.dimen.f6nameremoved);
        C158227jd r1 = new C158227jd(shapeableImageView.A0A);
        r1.A02(dimension);
        shapeableImageView.setShapeAppearanceModel(new C161877ql(r1));
        this.A02 = shapeableImageView;
        this.A03 = C18280x3.A0J(view, R.id.selector);
        this.A00 = C18280x3.A0E(view, R.id.badge);
        this.A01 = C18280x3.A0E(view, R.id.tap_area);
    }
}
