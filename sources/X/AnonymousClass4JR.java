package X;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.4JR  reason: invalid class name */
public class AnonymousClass4JR implements C183108pV {
    public Object A00;
    public final int A01;

    public AnonymousClass4JR(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final void A00(AnonymousClass4JR r5, boolean z) {
        C196712c r52 = (C196712c) r5.A00;
        if (z) {
            ShimmerFrameLayout shimmerFrameLayout = r52.A02;
            shimmerFrameLayout.A03();
            shimmerFrameLayout.animate().cancel();
            StickerView stickerView = r52.A03;
            stickerView.animate().cancel();
            shimmerFrameLayout.animate().alpha(0.0f).withEndAction(new C69993Zl(r52, 18));
            stickerView.setAlpha(0.0f);
            stickerView.setVisibility(0);
            stickerView.animate().alpha(1.0f);
            stickerView.A07();
        }
    }

    public final void Bcc(boolean z) {
        if (this.A01 != 0) {
            ((AnonymousClass121) this.A00).A0E.A07();
        } else {
            A00(this, z);
        }
    }
}
