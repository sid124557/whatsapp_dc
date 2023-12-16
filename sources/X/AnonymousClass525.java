package X;

import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.525  reason: invalid class name */
public class AnonymousClass525 extends C43972Ue {
    public final /* synthetic */ StickerStoreFeaturedTabFragment A00;

    public AnonymousClass525(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment) {
        this.A00 = stickerStoreFeaturedTabFragment;
    }

    public void A00(List list) {
        Collections.sort(list, new C71843cl());
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A00;
        stickerStoreFeaturedTabFragment.A08 = false;
        if (!stickerStoreFeaturedTabFragment.A1T() || !stickerStoreFeaturedTabFragment.A08.A01()) {
            stickerStoreFeaturedTabFragment.A0F = list;
            StickerStoreFeaturedTabFragment.A00(stickerStoreFeaturedTabFragment);
        } else {
            stickerStoreFeaturedTabFragment.A0C.A0C(new C115945pU(this, list), "meta-avatar", false);
        }
        stickerStoreFeaturedTabFragment.A1M();
    }
}
