package X;

import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.info.StickerInfoDialogFragment;

/* renamed from: X.6BM  reason: invalid class name */
public class AnonymousClass6BM implements C183108pV {
    public Object A00;
    public final int A01;

    public AnonymousClass6BM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bcc(boolean z) {
        if (this.A01 != 0) {
            ((StickerInfoDialogFragment) this.A00).A0L.A07();
            return;
        }
        StickerView stickerView = (StickerView) this.A00;
        if (z) {
            stickerView.A03 = true;
            stickerView.A07();
        }
    }
}
