package X;

import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.41w  reason: invalid class name and case insensitive filesystem */
public final class C819941w extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C819941w(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3Z6 r9 = (AnonymousClass3Z6) obj;
        C194711h r6 = this.this$0.A0J;
        if (r6 != null) {
            AnonymousClass39M r5 = (AnonymousClass39M) r9.first;
            int A06 = AnonymousClass0x2.A06(r9.second, r5);
            Log.d("SearchFunStickersAdapter/refreshStickerAtPosition");
            ArrayList A0s = AnonymousClass001.A0s();
            List list = r6.A01.A02;
            C162457s7.A0D(list);
            A0s.addAll(list);
            if (AnonymousClass0x7.A1S(A0s) && A0s.size() > A06 && (A0s.get(A06) instanceof AnonymousClass1UD)) {
                Object obj2 = A0s.get(A06);
                C162457s7.A0K(obj2, "null cannot be cast to non-null type com.whatsapp.expressionstray.stickers.funstickers.adapters.viewstate.FunSticker.Complete");
                AnonymousClass1UD r1 = (AnonymousClass1UD) obj2;
                A0s.set(A06, new AnonymousClass1UD(r1.A00, r5, r1.A02, r1.A03));
                r6.A0L(A0s);
            }
        }
        return C59022wD.A00;
    }
}
