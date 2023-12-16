package X;

import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;

/* renamed from: X.3ul  reason: invalid class name and case insensitive filesystem */
public final class C78283ul extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78283ul(StickerExpressionsFragment stickerExpressionsFragment) {
        super(0);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        StickerExpressionsFragment stickerExpressionsFragment = this.this$0;
        C632338l r3 = (C632338l) C154517dI.A00(AnonymousClass58H.NONE, new C80503yL(stickerExpressionsFragment)).getValue();
        C59292wg r2 = stickerExpressionsFragment.A0B;
        if (r2 != null) {
            r2.A01(stickerExpressionsFragment.A0R(), r3, 11);
            return C59022wD.A00;
        }
        throw C18270x1.A0S("funStickerBottomSheetProvider");
    }
}
