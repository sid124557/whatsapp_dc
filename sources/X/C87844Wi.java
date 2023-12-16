package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Wi  reason: invalid class name and case insensitive filesystem */
public class C87844Wi extends AnonymousClass0R6 {
    public List A00;
    public final /* synthetic */ StickerStoreTabFragment A01;

    public C87844Wi(StickerStoreTabFragment stickerStoreTabFragment, List list) {
        this.A01 = stickerStoreTabFragment;
        this.A00 = list;
    }

    public int A0G() {
        return C86614Ku.A08(this.A00);
    }

    public void BNf(C05570Ua r19, int i) {
        String str;
        C88454Yu r3 = (C88454Yu) r19;
        int i2 = i;
        C50612iT r2 = (C50612iT) this.A00.get(i2);
        r3.A0B.setText(r2.A0K);
        long j = r2.A02;
        int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        TextView textView = r3.A0C;
        if (i3 > 0) {
            C86634Kw.A1J(textView, this.A01.A06, j);
            textView.setVisibility(0);
            r3.A01.setVisibility(0);
        } else {
            textView.setVisibility(4);
            r3.A01.setVisibility(4);
        }
        r3.A0D.setText(r2.A0I);
        View view = r3.A02;
        view.setClickable(true);
        C109715f4.A00(view, this, r2, i2, 13);
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        int dimensionPixelSize = C08310eF.A09(stickerStoreTabFragment).getDimensionPixelSize(R.dimen.f6nameremoved);
        AnonymousClass121 r8 = r3.A00;
        if (r8 == null) {
            AnonymousClass1VX r9 = stickerStoreTabFragment.A07;
            C54722pB A02 = stickerStoreTabFragment.A0C.A02();
            AnonymousClass33O r11 = stickerStoreTabFragment.A0A;
            if (stickerStoreTabFragment instanceof StickerStoreMyTabFragment) {
                str = "sticker_store_my_tab";
            } else {
                str = "sticker_store_featured_tab";
            }
            r8 = new AnonymousClass121(r9, stickerStoreTabFragment.A09, r11, (StickerView) null, A02, dimensionPixelSize, 0, false, "sticker_store_my_tab".equals(str));
            r3.A00 = r8;
        }
        List<AnonymousClass39M> list = r2.A05;
        C162457s7.A0H(list);
        ArrayList arrayList = null;
        if (C18310x6.A1X(list)) {
            arrayList = C73783g4.A0c(list);
            for (AnonymousClass39M r5 : list) {
                C162457s7.A0H(r5);
                arrayList.add(new C53082mW(r5, false));
            }
        }
        C52012kk r52 = new C52012kk(r2, arrayList);
        r8.A04 = r52.A00;
        r8.A06 = r52.A01;
        AnonymousClass121 r0 = r3.A00;
        int i4 = stickerStoreTabFragment.A00;
        r0.A00 = i4;
        r3.A0E.A1o(i4);
        r3.A00.A05();
        r3.A0F.setAdapter(r3.A00);
        AnonymousClass54E.A00(r3.A0H, r2, this, 33);
        boolean z = r2.A0Q;
        ImageView imageView = r3.A05;
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        View inflate = stickerStoreTabFragment.A01.inflate(R.layout.f8nameremoved, viewGroup, false);
        RecyclerView A0w = C86664Kz.A0w(inflate, R.id.sticker_row_recycler);
        A0w.setNestedScrollingEnabled(false);
        A0w.A0o(new C188838zZ(this, C08310eF.A09(stickerStoreTabFragment).getDimensionPixelSize(R.dimen.f6nameremoved), 2));
        int dimensionPixelSize = C08310eF.A09(stickerStoreTabFragment).getDimensionPixelSize(R.dimen.f6nameremoved);
        if (stickerStoreTabFragment.A00 == 0) {
            stickerStoreTabFragment.A00 = Math.min(5, Math.max(C86664Kz.A0E(viewGroup, dimensionPixelSize), 1));
        }
        return new C88454Yu(inflate, stickerStoreTabFragment);
    }
}
