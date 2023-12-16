package X;

import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.picker.search.StickerSearchTabFragment;

/* renamed from: X.6Gl  reason: invalid class name */
public final class AnonymousClass6Gl extends AnonymousClass0AZ {
    public StickerSearchTabFragment A00;

    public AnonymousClass6Gl(C08270df r2) {
        super(r2, 1);
    }

    public int A0C() {
        return 7;
    }

    public void A0B(ViewGroup viewGroup, Object obj, int i) {
        C18260x0.A0P(viewGroup, obj);
        super.A0B(viewGroup, obj, i);
        if (this.A00 != obj) {
            this.A00 = (StickerSearchTabFragment) obj;
        }
    }

    public /* bridge */ /* synthetic */ C08310eF A0H(int i) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("sticker_category_tab", i);
        StickerSearchTabFragment stickerSearchTabFragment = new StickerSearchTabFragment();
        stickerSearchTabFragment.A0u(A08);
        return stickerSearchTabFragment;
    }
}
