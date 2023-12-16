package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.stickerpack.StickerPackDownloader", f = "StickerPackDownloader.kt", i = {}, l = {296}, m = "executeStickerDownloadInParallel-yxL6bBk", n = {}, s = {})
/* renamed from: X.3gP  reason: invalid class name and case insensitive filesystem */
public final class C73993gP extends C75013pU {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StickerPackDownloader this$0;

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A00 = this.this$0.A00((C50612iT) null, (AnonymousClass48X) null, this, (AnonymousClass4GP) null, (AnonymousClass4C6) null);
        if (A00 != AnonymousClass218.COROUTINE_SUSPENDED) {
            return new AnonymousClass3Z9(A00);
        }
        return A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73993gP(StickerPackDownloader stickerPackDownloader, C84814Du r2) {
        super(r2);
        this.this$0 = stickerPackDownloader;
    }
}
