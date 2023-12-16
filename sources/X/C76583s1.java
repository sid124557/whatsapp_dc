package X;

import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$shareSticker$1;

/* renamed from: X.3s1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C76583s1 extends AnonymousClass8V2 implements AnonymousClass4GS {
    public C76583s1(Object obj) {
        super(3, obj, SearchFunStickersBottomSheet.class, "onStickerSelection", "onStickerSelection(Lcom/whatsapp/funstickers/data/model/FunStickerModel;ILcom/whatsapp/stickers/Sticker;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        AnonymousClass39D r7 = (AnonymousClass39D) obj;
        int A0K = AnonymousClass001.A0K(obj2);
        AnonymousClass39M r9 = (AnonymousClass39M) obj3;
        C18260x0.A0P(r7, r9);
        SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.receiver;
        WaEditText waEditText = searchFunStickersBottomSheet.A08;
        if (waEditText != null) {
            waEditText.A05();
        }
        SearchFunStickersViewModel A0O = C18300x5.A0O(searchFunStickersBottomSheet);
        C003203q A0R = searchFunStickersBottomSheet.A0R();
        C162457s7.A0H(A0R);
        if (C162457s7.A0P(A0O.A0A.A07(), C133906i8.A00)) {
            A0O.A0H(A0R, r7);
        } else {
            C616131n.A02((C85494Gl) null, new SearchFunStickersViewModel$shareSticker$1(A0O, r9, (C84814Du) null, A0K), AnonymousClass0IV.A00(A0O), (AnonymousClass20D) null, 3);
        }
        return C59022wD.A00;
    }
}
