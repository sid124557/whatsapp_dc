package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;

/* renamed from: X.45N  reason: invalid class name */
public final class AnonymousClass45N extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ AvatarExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass45N(AvatarExpressionsFragment avatarExpressionsFragment) {
        super(2);
        this.this$0 = avatarExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        DialogFragment A00;
        C89654ea r1;
        AnonymousClass39M r4 = (AnonymousClass39M) obj;
        AnonymousClass2UW r5 = (AnonymousClass2UW) obj2;
        boolean A1U = C18270x1.A1U(r4, r5);
        if (r5 instanceof C23551Tr) {
            C43952Uc r12 = ((C23551Tr) r5).A00;
            if (r12 instanceof C29901lX) {
                A00 = StarOrRemoveFromRecentsStickerDialogFragment.A00(r4, A1U);
            } else {
                if (r12 instanceof C29921lZ) {
                    A00 = RemoveStickerFromFavoritesDialogFragment.A00(r4);
                }
                A00 = StarStickerFromPickerDialogFragment.A00(r4);
            }
        } else {
            if (!(r5 instanceof C23531Tp)) {
                throw AnonymousClass001.A0e("Requires AvatarStickerCategory or SearchResult sections.");
            }
            A00 = StarStickerFromPickerDialogFragment.A00(r4);
        }
        C003203q A0R = this.this$0.A0R();
        if (!(A0R instanceof C89654ea) || (r1 = (C89654ea) A0R) == null) {
            throw AnonymousClass001.A0e("Activity is not DialogActivity");
        }
        r1.Boo(A00);
        return C59022wD.A00;
    }
}
