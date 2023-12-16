package X;

import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.1ty  reason: invalid class name and case insensitive filesystem */
public class C33961ty extends AnonymousClass5ZM {
    public final int A00;
    public final C50612iT A01;
    public final /* synthetic */ StickerStorePackPreviewActivity A02;

    public C33961ty(C50612iT r1, StickerStorePackPreviewActivity stickerStorePackPreviewActivity, int i) {
        this.A02 = stickerStorePackPreviewActivity;
        this.A00 = i;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006c, code lost:
        if (r1 != null) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.39M[] r8 = (X.AnonymousClass39M[]) r8
            int r0 = r8.length
            r1 = 0
            r5 = 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)
            X.C626936e.A0C(r0)
            r4 = r8[r1]
            X.C626936e.A06(r4)
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r6 = r7.A02
            java.util.Map r1 = r6.A0W
            java.lang.String r0 = r4.A0D
            java.lang.String r1 = X.C18310x6.A0o(r0, r1)
            if (r1 != 0) goto L_0x006e
            X.2s6 r0 = r6.A0C
            java.io.File r1 = r0.A01()
            java.lang.String r0 = "sticker"
            java.io.File r2 = X.AnonymousClass002.A0A(r1, r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0036
            boolean r0 = r2.mkdirs()
            if (r0 == 0) goto L_0x0073
        L_0x0036:
            java.lang.String r0 = r4.A0D
            java.lang.StringBuilder r1 = X.C18290x4.A0u(r0)
            java.lang.String r0 = r4.A0D
            X.AnonymousClass0x2.A1M(r1, r0)
            java.lang.String r0 = ".webp"
            java.io.File r3 = X.C18270x1.A0A(r2, r0, r1)
            java.util.Map r2 = r6.A0W
            java.lang.String r1 = r4.A0D
            java.lang.String r0 = r3.getAbsolutePath()
            r2.put(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerStorePackPreviewActivity/LoadFullSizeStickerAsyncTask/fetching sticker for: "
            r1.append(r0)
            java.lang.String r0 = r4.A0D
            X.C18260x0.A1J(r1, r0)
            X.2X1 r0 = r6.A0O
            java.io.File r0 = r0.A00(r4, r3, r5)
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = r0.getAbsolutePath()
            if (r1 == 0) goto L_0x0073
        L_0x006e:
            r0 = 2
            r4.A09 = r1
            r4.A01 = r0
        L_0x0073:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33961ty.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A09() {
        AnonymousClass121 r2 = this.A02.A0Q;
        if (r2 != null) {
            r2.A0M(this.A00, false);
        }
    }

    public void A0A() {
        this.A02.A0Q.A0M(this.A00, true);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A02;
        AnonymousClass121 r1 = stickerStorePackPreviewActivity.A0Q;
        int i = this.A00;
        r1.A0M(i, false);
        stickerStorePackPreviewActivity.A0Q.A0N((AnonymousClass39M) obj, this.A01, i);
    }
}
