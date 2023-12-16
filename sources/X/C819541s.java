package X;

import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import java.util.Iterator;

/* renamed from: X.41s  reason: invalid class name and case insensitive filesystem */
public final class C819541s extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C819541s(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        AnonymousClass3Z6 r7 = (AnonymousClass3Z6) obj;
        String str = C18300x5.A0O(this.this$0).A02;
        if (str != null) {
            SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.this$0;
            C29361ih r1 = searchFunStickersBottomSheet.A0N;
            if (r1 != null) {
                AnonymousClass39M r4 = (AnonymousClass39M) r7.first;
                Integer num = searchFunStickersBottomSheet.A0Q;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 10;
                }
                Integer valueOf = Integer.valueOf(i);
                int A0K = AnonymousClass001.A0K(r7.second);
                Iterator A03 = C61102zi.A03(r1);
                while (A03.hasNext()) {
                    ((C56872sh) A03.next()).A03(r4, valueOf, str, A0K);
                }
            } else {
                throw C18270x1.A0S("stickerObservers");
            }
        }
        this.this$0.A1K();
        return C59022wD.A00;
    }
}
