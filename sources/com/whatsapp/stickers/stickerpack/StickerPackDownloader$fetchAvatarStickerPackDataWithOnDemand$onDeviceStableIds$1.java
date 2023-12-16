package com.whatsapp.stickers.stickerpack;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2TT;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.stickerpack.StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1", f = "StickerPackDownloader.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ StickerPackDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1(StickerPackDownloader stickerPackDownloader, C84814Du r3) {
        super(r3, 2);
        this.this$0 = stickerPackDownloader;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass2TT r3 = this.this$0.A0A;
            this.label = 1;
            obj = C616131n.A00(this, r3.A07, new AvatarStickerLocatorImpl$locateOnDeviceAvatarStickerStableIDs$2(r3, (C84814Du) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new StickerPackDownloader$fetchAvatarStickerPackDataWithOnDemand$onDeviceStableIds$1(this.this$0, (C84814Du) obj2));
    }
}
