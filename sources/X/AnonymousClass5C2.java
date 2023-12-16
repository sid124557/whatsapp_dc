package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.whatsapp.R;

/* renamed from: X.5C2  reason: invalid class name */
public final class AnonymousClass5C2 {
    public static final Drawable A00(Context context, int i) {
        C162457s7.A0J(context, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        ShapeDrawable A0H = C86634Kw.A0H();
        A0H.setIntrinsicHeight(dimensionPixelSize);
        A0H.setIntrinsicWidth(dimensionPixelSize);
        A0H.getPaint().setColor(i);
        Drawable A00 = AnonymousClass0RP.A00(context, R.drawable.vec_ic_voice_status);
        int A04 = AnonymousClass5YI.A04(context, 14.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A0H, A00});
        layerDrawable.setLayerInset(1, A04, A04, A04, A04);
        return layerDrawable;
    }
}
