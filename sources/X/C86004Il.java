package X;

import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.Map;

/* renamed from: X.4Il  reason: invalid class name and case insensitive filesystem */
public class C86004Il implements C85174Ff {
    public Object A00;
    public final int A01;

    public C86004Il(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BMZ(String str) {
        if (this.A01 == 0) {
            C162457s7.A0J(str, 0);
            ((AnonymousClass4FB) this.A00).BrD(new C30031lk(str));
        }
    }

    public void BN6(String str) {
        if (this.A01 != 0) {
            ((StickerStorePackPreviewActivity) this.A00).A0X = true;
            return;
        }
        C162457s7.A0J(str, 0);
        ((AnonymousClass4FB) this.A00).BrD(C30071lo.A00);
    }

    public void BN7() {
        if (this.A01 != 0) {
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) this.A00;
            if (stickerStorePackPreviewActivity.A0X) {
                if (stickerStorePackPreviewActivity.A0a) {
                    stickerStorePackPreviewActivity.A0H.A00(8);
                }
                stickerStorePackPreviewActivity.finish();
                return;
            }
            return;
        }
        ((AnonymousClass4FB) this.A00).BrD(C30081lp.A00);
    }

    public void BN8(String str) {
        if (this.A01 == 0) {
            ((AnonymousClass4FB) this.A00).BrD(new C30041ll(str));
        }
    }

    public void BN9(String str, Map map) {
        if (this.A01 == 0) {
            ((AnonymousClass4FB) this.A00).BrD(new C30051lm(str, map));
        }
    }

    public void BNA(boolean z, boolean z2) {
        if (this.A01 == 0) {
            ((AnonymousClass4FB) this.A00).BrD(new C30061ln(z, z2));
        }
    }
}
