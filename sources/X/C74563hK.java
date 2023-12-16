package X;

import com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel", f = "StickerExpressionsViewModel.kt", i = {0, 0, 0}, l = {326, 342}, m = "runStickerSearch", n = {"this", "allStickers", "searchText"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.3hK  reason: invalid class name and case insensitive filesystem */
public final class C74563hK extends C75013pU {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74563hK(StickerExpressionsViewModel stickerExpressionsViewModel, C84814Du r2) {
        super(r2);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0H((String) null, (List) null, this);
    }
}
