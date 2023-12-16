package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Ue  reason: invalid class name and case insensitive filesystem */
public abstract class C43972Ue {
    public void A00(List list) {
        Object obj;
        List list2 = list;
        if (this instanceof C32641rN) {
            C32641rN r3 = (C32641rN) this;
            C162457s7.A0J(list2, 0);
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C162457s7.A0P(((C50612iT) obj).A0G, "whatsappcuppy")) {
                    break;
                }
            }
            C50612iT r14 = (C50612iT) obj;
            if (r14 != null) {
                C45532aA r1 = r3.A00;
                C55572qZ r4 = r1.A00;
                C633138t r5 = C633138t.A0b;
                C162457s7.A0F(r5);
                if (!r4.A02(r5, 0, r14.A02, true, false, false, false, false)) {
                    Log.i("InitialStickerPackDownloader/downloadInitialStickerPack/autodownload is not safe, going to do nothing");
                    return;
                }
                Log.d("InitialStickerPackDownloader/downloadInitialStickerPack/autodownload is safe, going to get downloadable sticker packs");
                r1.A02.A01(r14, new C68723Ug(r3.A01), (Integer) null, (Integer) null, 4, false);
                return;
            }
            return;
        }
        C32631rM r32 = (C32631rM) this;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("EmojiAndGifPopupWindow/getInstalledStickerPacksAsync/onStickerPackReady/got sticker pack: ", A0o, list2);
        AnonymousClass0x2.A18(A0o);
        boolean z = false;
        if (list2.size() == 1 && ((C50612iT) list2.get(0)).A0S) {
            z = true;
        }
        if (list2.size() == 0 || z) {
            r32.A00.A08.A00(new C71703cX(32, (Object) r32, r32.A01));
            return;
        }
        Log.d("EmojiAndGifPopupWindow/there are sticker packs already/setPref to true and showing sticker tab");
        AnonymousClass5RA r2 = r32.A00;
        C18270x1.A0l(C18270x1.A03(r2.A06.A05), "sticker_picker_initial_download", true);
        r2.A00(r32.A01);
    }
}
