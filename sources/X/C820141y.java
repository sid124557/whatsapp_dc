package X;

import android.content.Context;
import com.whatsapp.expressionstray.stickers.StickerExpressionsFragment;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel;
import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onShapeSelected$1;

/* renamed from: X.41y  reason: invalid class name and case insensitive filesystem */
public final class C820141y extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C820141y(StickerExpressionsFragment stickerExpressionsFragment) {
        super(1);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C51662kB r7 = (C51662kB) obj;
        C162457s7.A0J(r7, 0);
        StickerExpressionsViewModel A0N = C18300x5.A0N(this.this$0);
        Context A0G = this.this$0.A0G();
        C616131n.A02(A0N.A0c, new StickerExpressionsViewModel$onShapeSelected$1(A0G, A0N, r7, (C84814Du) null), AnonymousClass0IV.A00(A0N), (AnonymousClass20D) null, 2);
        return C59022wD.A00;
    }
}
