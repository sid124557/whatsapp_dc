package X;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.12c  reason: invalid class name and case insensitive filesystem */
public final class C196712c extends C05570Ua {
    public final ColorMatrix A00;
    public final ColorMatrixColorFilter A01;
    public final ShimmerFrameLayout A02;
    public final StickerView A03;
    public final /* synthetic */ C194711h A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C196712c(View view, C194711h r4) {
        super(view);
        C162457s7.A0J(view, 2);
        this.A04 = r4;
        this.A02 = (ShimmerFrameLayout) C18280x3.A0E(view, R.id.shimmer_row_view);
        this.A03 = (StickerView) C18280x3.A0E(view, R.id.fun_sticker_image_view);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.A00 = colorMatrix;
        this.A01 = new ColorMatrixColorFilter(colorMatrix);
    }
}
