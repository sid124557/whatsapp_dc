package X;

import androidx.viewpager.widget.ViewPager;
import com.whatsapp.WaEditText;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;

/* renamed from: X.92h  reason: invalid class name and case insensitive filesystem */
public class C1896992h implements C183978qy, C187908y0 {
    public Object A00;
    public final int A01;

    public C1896992h(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bdu(AnonymousClass5T2 r2) {
        if (this.A01 != 0) {
            ReactionsBottomSheetDialogFragment.A00(r2, (ReactionsBottomSheetDialogFragment) this.A00);
        }
    }

    public void Bdv(AnonymousClass5T2 r3) {
        if (this.A01 != 0) {
            ReactionsBottomSheetDialogFragment.A00(r3, (ReactionsBottomSheetDialogFragment) this.A00);
            return;
        }
        C162457s7.A0J(r3, 0);
        StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) this.A00;
        WaEditText waEditText = stickerSearchDialogFragment.A05;
        if (waEditText != null) {
            waEditText.A05();
        }
        ViewPager viewPager = stickerSearchDialogFragment.A03;
        if (viewPager != null) {
            viewPager.setCurrentItem(r3.A00);
        }
    }
}
