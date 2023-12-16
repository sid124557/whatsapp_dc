package X;

import android.view.View;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.3Ue  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68703Ue implements C183108pV {
    public final /* synthetic */ AnonymousClass1U0 A00;
    public final /* synthetic */ AnonymousClass39M A01;

    public final void Bcc(boolean z) {
        AnonymousClass1U0 r1 = this.A00;
        AnonymousClass39M r3 = this.A01;
        if (z) {
            boolean z2 = true;
            if (r1.A01 && r1.A00) {
                StickerView stickerView = r1.A06;
                stickerView.A04 = true;
                stickerView.A07();
            }
            r1.A06.requestLayout();
            View view = r1.A0H;
            if (r3.A0D == null) {
                z2 = false;
            }
            view.setEnabled(z2);
        }
    }

    public /* synthetic */ C68703Ue(AnonymousClass1U0 r1, AnonymousClass39M r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
