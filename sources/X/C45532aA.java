package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.util.Log;

/* renamed from: X.2aA  reason: invalid class name and case insensitive filesystem */
public final class C45532aA {
    public final C55572qZ A00;
    public final AnonymousClass5JV A01;
    public final StickerPackDownloader A02;

    public final void A00(Runnable runnable) {
        C55572qZ r0 = this.A00;
        C633138t r1 = C633138t.A0b;
        C162457s7.A0F(r1);
        if (!r0.A02(r1, 0, 1048576, true, false, false, false, false)) {
            Log.i("InitialStickerPackDownloader/downloadInitialStickerPack/autodownload is not safe, going to do nothing");
            return;
        }
        Log.d("InitialStickerPackDownloader/downloadInitialStickerPack/autodownload is safe, going to get downloadable metadata");
        AnonymousClass5JV r4 = this.A01;
        r4.A03.BkM(new C71573cK(r4, 8, new C32641rN(this, runnable)));
    }

    public C45532aA(C55572qZ r1, AnonymousClass5JV r2, StickerPackDownloader stickerPackDownloader) {
        C18260x0.A0Q(r1, stickerPackDownloader);
        this.A00 = r1;
        this.A02 = stickerPackDownloader;
        this.A01 = r2;
    }
}
