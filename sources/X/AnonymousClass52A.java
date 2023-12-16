package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import java.util.List;

/* renamed from: X.52A  reason: invalid class name */
public class AnonymousClass52A extends C87844Wi {
    public Drawable.ConstantState A00;
    public final /* synthetic */ StickerStoreFeaturedTabFragment A01;

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return super.BQR(viewGroup, i);
        }
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A01;
        return new AnonymousClass6IL(AnonymousClass001.A0R(stickerStoreFeaturedTabFragment.A01, viewGroup, R.layout.f8nameremoved), stickerStoreFeaturedTabFragment);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52A(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment, List list) {
        super(stickerStoreFeaturedTabFragment, list);
        this.A01 = stickerStoreFeaturedTabFragment;
    }

    public int A0G() {
        int A08 = C86614Ku.A08(this.A00);
        if (A08 <= 0 || !this.A01.A1U()) {
            return A08;
        }
        return A08 + 1;
    }

    public int getItemViewType(int i) {
        if (i != 0 || !this.A01.A1U()) {
            return 0;
        }
        return 1;
    }

    public void BNf(C05570Ua r9, int i) {
        Drawable.ConstantState constantState;
        View view;
        if (getItemViewType(i) == 0) {
            C88454Yu r92 = (C88454Yu) r9;
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A01;
            if (stickerStoreFeaturedTabFragment.A1U()) {
                i--;
            }
            super.BNf(r92, i);
            C50612iT r4 = (C50612iT) this.A00.get(i);
            int i2 = 8;
            C86624Kv.A11(r92.A05, r4.A0O ? 1 : 0, 0, 8);
            if (r4.A00()) {
                r92.A04.setVisibility(0);
                r92.A06.setVisibility(8);
                r92.A09.setVisibility(8);
                r92.A07.setVisibility(8);
                if (r4.A06) {
                    r92.A0H.setVisibility(4);
                    view = r92.A0A;
                } else {
                    r92.A0A.setVisibility(4);
                    view = r92.A0H;
                }
                view.setVisibility(0);
            } else if (r4.A06) {
                r92.A06.setVisibility(8);
                r92.A04.setVisibility(4);
                ProgressBar progressBar = r92.A09;
                progressBar.setVisibility(0);
                progressBar.setIndeterminate(true);
            } else if (r4.A03 != null) {
                ImageView imageView = r92.A06;
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.countrypicker_checkmark);
                imageView.setOnClickListener((View.OnClickListener) null);
                C86634Kw.A1D(imageView, stickerStoreFeaturedTabFragment, R.string.f11nameremoved);
                imageView.setClickable(false);
                imageView.setFocusable(true);
                if (this.A00 == null) {
                    this.A00 = imageView.getBackground().mutate().getConstantState();
                }
                imageView.setBackgroundResource(0);
                r92.A09.setVisibility(8);
                r92.A04.setVisibility(4);
            } else {
                r92.A04.setVisibility(4);
                ImageView imageView2 = r92.A06;
                imageView2.setVisibility(0);
                r92.A09.setVisibility(8);
                imageView2.setImageResource(R.drawable.sticker_store_download);
                if (imageView2.getBackground() == null && (constantState = this.A00) != null) {
                    AnonymousClass0YY.A04(constantState.newDrawable(C08310eF.A09(stickerStoreFeaturedTabFragment)), imageView2);
                }
                C86634Kw.A1D(imageView2, stickerStoreFeaturedTabFragment, R.string.f11nameremoved);
                AnonymousClass54E.A00(imageView2, r4, this, 31);
            }
            View view2 = r92.A03;
            if (!r4.A06 && r4.A03 == null && r4.A07) {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
    }
}
