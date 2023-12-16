package X;

import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2Yt  reason: invalid class name and case insensitive filesystem */
public final class C45122Yt {
    public final AnonymousClass2DR A00;
    public final AnonymousClass2DS A01;

    public final C153367bC A00(File file, String str) {
        File file2 = file;
        if (file == null) {
            return null;
        }
        if (C162457s7.A0P(str, "application/was")) {
            C64333Db r1 = this.A00.A00.A01;
            return new C32721rV(C64333Db.A4B(r1), C64333Db.A4H(r1), (C33121sT) r1.AJI.get(), r1.Aqy(), file2);
        }
        if (!C162457s7.A0P(str, "image/webp")) {
            if (str == null) {
                Log.w("StickerHandlerFactory/getHandler null mimetype, defaulting to webp handler");
            } else {
                C18260x0.A0t("StickerHandlerFactory/getHandler Unable to create handler for ", str, AnonymousClass001.A0o());
                return null;
            }
        }
        C64333Db r2 = this.A01.A00.A01;
        return new C32731rW((AnonymousClass33Q) r2.AbK.get(), (WebpUtils) r2.AbM.get(), file);
    }

    public C45122Yt(AnonymousClass2DR r1, AnonymousClass2DS r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
