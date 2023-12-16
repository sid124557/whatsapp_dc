package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass294;
import X.AnonymousClass349;
import X.AnonymousClass39M;
import X.AnonymousClass3Z0;
import X.AnonymousClass3Z9;
import X.AnonymousClass48X;
import X.AnonymousClass4C6;
import X.AnonymousClass4GP;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18320x8;
import X.C32831rh;
import X.C32841ri;
import X.C45552aC;
import X.C57682u2;
import X.C59022wD;
import X.C68783Um;
import X.C73153f1;
import X.C75003pT;
import X.C84814Du;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.stickerpack.StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1", f = "StickerPackDownloader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass48X $batchStickerDownloadListener;
    public final /* synthetic */ AnonymousClass4C6 $coroutineScope;
    public final /* synthetic */ AnonymousClass4GP $onStickerDownloaded;
    public final /* synthetic */ AnonymousClass39M $sticker;
    public int label;
    public final /* synthetic */ StickerPackDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1(AnonymousClass39M r2, AnonymousClass48X r3, StickerPackDownloader stickerPackDownloader, C84814Du r5, AnonymousClass4GP r6, AnonymousClass4C6 r7) {
        super(r5, 2);
        this.$batchStickerDownloadListener = r3;
        this.$coroutineScope = r7;
        this.this$0 = stickerPackDownloader;
        this.$sticker = r2;
        this.$onStickerDownloaded = r6;
    }

    public final Object A09(Object obj) {
        Object obj2;
        if (this.label == 0) {
            C57682u2.A01(obj);
            if (C18320x8.A1T(((C68783Um) this.$batchStickerDownloadListener).A00)) {
                AnonymousClass349.A03(new CancellationException("cancelled"), this.$coroutineScope);
                obj2 = AnonymousClass3Z0.A01(AnonymousClass001.A0e("cancelled"));
            } else {
                C45552aC r1 = this.this$0.A0C;
                AnonymousClass39M r0 = this.$sticker;
                C162457s7.A0C(r0);
                AnonymousClass294 A00 = r1.A00(r0);
                if (A00 instanceof C32831rh) {
                    AnonymousClass4C6 r4 = this.$coroutineScope;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("error: ");
                    String str = ((C32831rh) A00).A00;
                    AnonymousClass349.A03(new CancellationException(AnonymousClass000.A0X(str, A0o)), r4);
                    obj2 = AnonymousClass3Z0.A01(AnonymousClass001.A0e(AnonymousClass000.A0T("error: ", str)));
                } else if (A00 instanceof C32841ri) {
                    this.$onStickerDownloaded.invoke();
                    obj2 = ((C32841ri) A00).A00;
                } else {
                    throw C73153f1.A00();
                }
            }
            return new AnonymousClass3Z9(obj2);
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        AnonymousClass48X r2 = this.$batchStickerDownloadListener;
        AnonymousClass4C6 r6 = this.$coroutineScope;
        return new StickerPackDownloader$executeStickerDownloadInParallel$deferredDownloads$1$1(this.$sticker, r2, this.this$0, r9, this.$onStickerDownloaded, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
