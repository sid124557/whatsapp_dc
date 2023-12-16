package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.1U0  reason: invalid class name */
public final class AnonymousClass1U0 extends AnonymousClass12I {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final C56352rq A03;
    public final AnonymousClass33O A04;
    public final AnonymousClass4BP A05;
    public final StickerView A06;
    public final AnonymousClass4GR A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1U0(View view, C56352rq r3, AnonymousClass33O r4, AnonymousClass4BP r5, AnonymousClass4GR r6, int i) {
        super(view);
        C18260x0.A0a(view, r4, r5, 1);
        C18260x0.A0T(r6, r3);
        this.A02 = i;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A03 = r3;
        this.A06 = (StickerView) C18290x4.A0M(view, R.id.sticker);
    }

    public final void A07(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            StickerView stickerView = this.A06;
            if (z) {
                stickerView.A04 = true;
                stickerView.A07();
                return;
            }
            stickerView.A04 = false;
            stickerView.A08();
        }
    }
}
