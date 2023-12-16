package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;

/* renamed from: X.45O  reason: invalid class name */
public final class AnonymousClass45O extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass45O(StickerExpressionsFragment stickerExpressionsFragment) {
        super(2);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        DialogFragment A00;
        C89654ea r1;
        AnonymousClass39M r4 = (AnonymousClass39M) obj;
        AnonymousClass2UW r5 = (AnonymousClass2UW) obj2;
        C18270x1.A14(r4, r5);
        if (!(r5 instanceof C23571Tt)) {
            A00 = StarStickerFromPickerDialogFragment.A00(r4);
        } else if (C162457s7.A0P(r5.A00(), "recent")) {
            A00 = StarOrRemoveFromRecentsStickerDialogFragment.A00(r4, false);
        } else {
            A00 = RemoveStickerFromFavoritesDialogFragment.A00(r4);
        }
        C162457s7.A0H(A00);
        C003203q A0R = this.this$0.A0R();
        if (!(A0R instanceof C89654ea) || (r1 = (C89654ea) A0R) == null) {
            throw AnonymousClass001.A0e("Activity is not DialogActivity");
        }
        r1.Boo(A00);
        return C59022wD.A00;
    }
}
