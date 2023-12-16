package X;

import com.whatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.3Ui  reason: invalid class name and case insensitive filesystem */
public class C68743Ui implements C84644Dd {
    public final /* synthetic */ StickerStorePackPreviewActivity A00;

    public C68743Ui(StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        this.A00 = stickerStorePackPreviewActivity;
    }

    public void Bcd(C50612iT r2) {
        StickerStorePackPreviewActivity.A0C(r2, this.A00);
    }

    public void Bcf() {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A00;
        if (stickerStorePackPreviewActivity.A77() && !stickerStorePackPreviewActivity.A0E.A01()) {
            if (!stickerStorePackPreviewActivity.A0X) {
                stickerStorePackPreviewActivity.A0F.A04("sticker_store_pack_preview", AnonymousClass0x9.A14(stickerStorePackPreviewActivity));
            }
            stickerStorePackPreviewActivity.A0X = true;
        } else if (stickerStorePackPreviewActivity.A0a && !stickerStorePackPreviewActivity.isFinishing() && !stickerStorePackPreviewActivity.isDestroyed()) {
            C19340zH A002 = AnonymousClass5V0.A00(stickerStorePackPreviewActivity);
            A002.A0A(R.string.f11nameremoved);
            C85804Hr.A01(A002, this, 102, R.string.f11nameremoved);
            A002.A0L(new AnonymousClass4IY(this, 3));
            AnonymousClass043 create = A002.create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        }
    }
}
