package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onItemsScroll$1;
import com.whatsapp.expressionstray.gifs.GifExpressionsFragment;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.4H3  reason: invalid class name */
public class AnonymousClass4H3 extends AnonymousClass0O5 {
    public Object A00;
    public final int A01;

    public AnonymousClass4H3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        ExpressionsSearchViewModel expressionsSearchViewModel;
        switch (this.A01) {
            case 0:
                C162457s7.A0J(recyclerView, 0);
                if (i2 != 0 && (expressionsSearchViewModel = ((GifExpressionsFragment) this.A00).A05) != null) {
                    C616131n.A02((C85494Gl) null, new ExpressionsSearchViewModel$onItemsScroll$1(expressionsSearchViewModel, (C84814Du) null), AnonymousClass0IV.A00(expressionsSearchViewModel), (AnonymousClass20D) null, 3);
                    return;
                }
                return;
            case 1:
                if (i == 0 && i2 == 0) {
                    AnonymousClass121 r1 = (AnonymousClass121) this.A00;
                    StickerView stickerView = r1.A0E;
                    if (stickerView != null && stickerView.getVisibility() == 0) {
                        r1.A0L();
                        return;
                    }
                    return;
                }
                ((AnonymousClass121) this.A00).A0K();
                return;
            default:
                int i3 = 0;
                boolean A1W = AnonymousClass001.A1W(recyclerView.computeVerticalScrollOffset());
                View view = ((StickerStorePackPreviewActivity) this.A00).A02;
                if (view != null) {
                    if (!A1W) {
                        i3 = 8;
                    }
                    view.setVisibility(i3);
                    return;
                }
                return;
        }
    }

    public void A05(RecyclerView recyclerView, int i) {
        if (2 - this.A01 != 0) {
            super.A05(recyclerView, i);
            return;
        }
        int i2 = 0;
        boolean A1W = AnonymousClass001.A1W(recyclerView.computeVerticalScrollOffset());
        View view = ((StickerStorePackPreviewActivity) this.A00).A02;
        if (view != null) {
            if (!A1W) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }
}
