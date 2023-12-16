package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;
import java.util.Collection;

/* renamed from: X.4HO  reason: invalid class name */
public class AnonymousClass4HO extends C56872sh {
    public Object A00;
    public final int A01;

    public AnonymousClass4HO(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A08(C50612iT r6) {
        if (this.A01 == 0) {
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) this.A00;
            C50612iT r0 = stickerStorePackPreviewActivity.A0L;
            if (r0 == null) {
                if (r6.A0S) {
                    stickerStorePackPreviewActivity.A0M.A0C(new C68743Ui(stickerStorePackPreviewActivity), stickerStorePackPreviewActivity.A0V, true);
                }
            } else if (r0.A0G.equals(r6.A0G)) {
                StickerStorePackPreviewActivity.A0C(r6, stickerStorePackPreviewActivity);
                stickerStorePackPreviewActivity.setResult(1);
                if (!stickerStorePackPreviewActivity.A0a && !r6.A0S) {
                    stickerStorePackPreviewActivity.A05.A0H(R.string.f11nameremoved, 1);
                    stickerStorePackPreviewActivity.finish();
                }
            }
        }
    }

    public void A09(C50612iT r3) {
        if (this.A01 == 0 && r3.A0S) {
            ((StickerStorePackPreviewActivity) this.A00).A76(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r7 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r8.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.String r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            if (r0 != 0) goto L_0x002b
            java.lang.Object r7 = r8.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r7 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r7
            X.2iT r6 = r7.A0L
            if (r6 == 0) goto L_0x002b
            java.lang.String r0 = r6.A0G
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x002b
            r5 = 0
            r6.A06 = r5
            r7.A74()
            X.3Wi r4 = r7.A05
            r3 = 2131894065(0x7f121f31, float:1.9422924E38)
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = r6.A0I
            java.lang.String r0 = X.AnonymousClass002.A0F(r7, r0, r1, r5, r3)
            r4.A0P(r0, r2)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4HO.A0B(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            if (r0 != 0) goto L_0x0021
            java.lang.Object r4 = r5.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r4 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r4
            X.2iT r0 = r4.A0L
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r0.A0G
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0021
            X.2sn r3 = r4.A0M
            java.lang.String r2 = r4.A0V
            X.3Ui r1 = new X.3Ui
            r1.<init>(r4)
            r0 = 1
            r3.A0C(r1, r2, r0)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4HO.A0C(java.lang.String):void");
    }

    public void A0E(String str, String str2) {
        if (1 - this.A01 == 0) {
            AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = (AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) this.A00;
            if (str.equals(addStickerPackDialogFragment.A02) && str2.equals(addStickerPackDialogFragment.A03)) {
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = addStickerPackDialogFragment.A04;
                addStickerPackDialogFragment.A00.A0W(AnonymousClass0x7.A0n(addStickerPackDialogFragment, C08310eF.A09(addStickerPackDialogFragment).getString(R.string.f11nameremoved), A0M, 1, R.string.f11nameremoved), 1);
                C003203q A0Q = addStickerPackDialogFragment.A0Q();
                if (A0Q != null) {
                    Intent A07 = C18320x8.A07();
                    A07.putExtra("add_successful", true);
                    A0Q.setResult(-1, A07);
                    addStickerPackDialogFragment.A1L();
                }
            }
        }
    }

    public void A0F(Collection collection, boolean z) {
        if (this.A01 == 0) {
            ((C89654ea) this.A00).A05.A0H(R.string.f11nameremoved, 1);
        }
    }

    public void A0G(Collection collection, boolean z) {
        if (this.A01 == 0) {
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) this.A00;
            stickerStorePackPreviewActivity.A05.A0H(R.string.f11nameremoved, 1);
            for (Object next : collection) {
                for (C53082mW r1 : AnonymousClass121.A00(stickerStorePackPreviewActivity.A0Q)) {
                    if (next.equals(r1.A03)) {
                        r1.A02 = false;
                    }
                }
            }
        }
    }
}
