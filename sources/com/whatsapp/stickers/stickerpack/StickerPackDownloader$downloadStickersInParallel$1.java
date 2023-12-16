package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass3Z9;
import X.AnonymousClass48X;
import X.AnonymousClass4C6;
import X.AnonymousClass4GP;
import X.AnonymousClass4GR;
import X.C50612iT;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.stickerpack.StickerPackDownloader$downloadStickersInParallel$1", f = "StickerPackDownloader.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackDownloader$downloadStickersInParallel$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass48X $batchStickerDownloadListener;
    public final /* synthetic */ AnonymousClass4C6 $downloadScope;
    public final /* synthetic */ AnonymousClass4GP $onStickerDownloaded;
    public final /* synthetic */ C50612iT $stickerPack;
    public int label;
    public final /* synthetic */ StickerPackDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackDownloader$downloadStickersInParallel$1(C50612iT r2, AnonymousClass48X r3, StickerPackDownloader stickerPackDownloader, C84814Du r5, AnonymousClass4GP r6, AnonymousClass4C6 r7) {
        super(r5, 2);
        this.this$0 = stickerPackDownloader;
        this.$downloadScope = r7;
        this.$stickerPack = r2;
        this.$batchStickerDownloadListener = r3;
        this.$onStickerDownloaded = r6;
    }

    public final Object A09(Object obj) {
        Object A00;
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            StickerPackDownloader stickerPackDownloader = this.this$0;
            AnonymousClass4C6 r8 = this.$downloadScope;
            C50612iT r4 = this.$stickerPack;
            AnonymousClass48X r5 = this.$batchStickerDownloadListener;
            AnonymousClass4GP r7 = this.$onStickerDownloaded;
            this.label = 1;
            A00 = stickerPackDownloader.A00(r4, r5, this, r7, r8);
            if (A00 == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
            A00 = ((AnonymousClass3Z9) obj).value;
        } else {
            throw AnonymousClass001.A0d();
        }
        return new AnonymousClass3Z9(A00);
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        return new StickerPackDownloader$downloadStickersInParallel$1(this.$stickerPack, this.$batchStickerDownloadListener, this.this$0, r9, this.$onStickerDownloaded, this.$downloadScope);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
