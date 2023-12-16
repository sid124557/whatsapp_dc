package X;

import com.whatsapp.avatar.init.AvatarStickerPackWorker;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2VX  reason: invalid class name */
public final class AnonymousClass2VX {
    public final C34171uL A00;

    public AnonymousClass2VX(C34171uL r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A00(int i, String str, boolean z) {
        Log.d("AvatarStickerPackWorkerStarter enqueueWork started");
        AnonymousClass0XS A07 = C18270x1.A07();
        AnonymousClass0Q9 r3 = new AnonymousClass0Q9();
        Map map = r3.A00;
        map.put("origin", str);
        r3.A01("origin_type", i);
        map.put("cancel_ongoing", Boolean.valueOf(z));
        AnonymousClass0Xq A002 = r3.A00();
        AnonymousClass0Aw r4 = new AnonymousClass0Aw(AvatarStickerPackWorker.class);
        r4.A04(A07);
        r4.A03(AnonymousClass0FN.EXPONENTIAL, TimeUnit.SECONDS, 10);
        r4.A00.A0B = A002;
        C72333dY.A01(this.A00).A03(C02320Fs.REPLACE, AnonymousClass0x9.A0I(r4), "tag.whatsapp.avatar.init.download").A02();
    }
}
