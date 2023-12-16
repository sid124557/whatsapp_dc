package X;

import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5pU  reason: invalid class name and case insensitive filesystem */
public class C115945pU implements C84644Dd {
    public final /* synthetic */ AnonymousClass525 A00;
    public final /* synthetic */ List A01;

    public C115945pU(AnonymousClass525 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public void Bcd(C50612iT r5) {
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A00.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        stickerStoreFeaturedTabFragment.A0F = A0s;
        A0s.add(r5);
        A0s.addAll(1, this.A01);
        StickerStoreFeaturedTabFragment.A00(stickerStoreFeaturedTabFragment);
    }

    public void Bcf() {
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A00.A00;
        stickerStoreFeaturedTabFragment.A0F = this.A01;
        StickerStoreFeaturedTabFragment.A00(stickerStoreFeaturedTabFragment);
        Log.e("StickerStoreFeaturedTabFragment/updatePackList: The avatar config is true but the avatar sticker pack is not available!");
    }
}
