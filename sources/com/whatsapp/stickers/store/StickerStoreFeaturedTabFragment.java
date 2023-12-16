package com.whatsapp.stickers.store;

import X.AnonymousClass001;
import X.AnonymousClass0O5;
import X.AnonymousClass4FV;
import X.AnonymousClass52A;
import X.AnonymousClass5JV;
import X.C111095hX;
import X.C188848za;
import X.C50612iT;
import X.C55862r2;
import X.C56932sn;
import X.C69263Wi;
import X.C86634Kw;
import X.C87844Wi;
import android.view.View;
import com.whatsapp.util.Log;
import java.util.List;

public class StickerStoreFeaturedTabFragment extends Hilt_StickerStoreFeaturedTabFragment {
    public View A00;
    public View A01;
    public C111095hX A02;
    public C69263Wi A03;
    public AnonymousClass4FV A04;
    public C55862r2 A05;
    public AnonymousClass5JV A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass0O5 A09 = new C188848za(this, 10);

    public static /* synthetic */ void A00(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment) {
        C87844Wi r0 = stickerStoreFeaturedTabFragment.A0E;
        List list = stickerStoreFeaturedTabFragment.A0F;
        if (r0 == null) {
            stickerStoreFeaturedTabFragment.A1Q(new AnonymousClass52A(stickerStoreFeaturedTabFragment, list));
            return;
        }
        r0.A00 = list;
        r0.A05();
    }

    public void A0a() {
        this.A05.A00(3);
        super.A0a();
    }

    public final boolean A1U() {
        if (this.A05.A0Y() || !A1T() || this.A08.A01()) {
            return false;
        }
        return true;
    }

    public void A1M() {
        super.A1M();
        View view = this.A02;
        if (view != null) {
            view.setVisibility(AnonymousClass001.A08(this.A08 ? 1 : 0));
        }
    }

    public void A1P(C50612iT r4, int i) {
        super.A1P(r4, i);
        r4.A07 = false;
        this.A0E.A06(i);
        C56932sn r2 = this.A0C;
        Log.d("StickerRepository/markStickerPackAsSeenAsync/begin");
        C86634Kw.A1Q(r2.A0Z, r2, r4, 16);
    }
}
