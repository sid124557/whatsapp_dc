package X;

import android.graphics.Path;
import android.view.ViewTreeObserver;
import com.whatsapp.WaRoundCornerImageView;

/* renamed from: X.5fR  reason: invalid class name and case insensitive filesystem */
public class C109945fR implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ WaRoundCornerImageView A00;

    public C109945fR(WaRoundCornerImageView waRoundCornerImageView) {
        this.A00 = waRoundCornerImageView;
    }

    public void onGlobalLayout() {
        WaRoundCornerImageView waRoundCornerImageView = this.A00;
        Path A06 = AnonymousClass002.A06();
        waRoundCornerImageView.A01 = A06;
        float f = waRoundCornerImageView.A00;
        A06.addRoundRect((float) C86664Kz.A0F(waRoundCornerImageView, waRoundCornerImageView.getLeft()), (float) (waRoundCornerImageView.getTop() + waRoundCornerImageView.getPaddingTop()), (float) AnonymousClass4L0.A03(waRoundCornerImageView, waRoundCornerImageView.getRight()), (float) (waRoundCornerImageView.getBottom() - waRoundCornerImageView.getPaddingBottom()), f, f, Path.Direction.CCW);
    }
}
