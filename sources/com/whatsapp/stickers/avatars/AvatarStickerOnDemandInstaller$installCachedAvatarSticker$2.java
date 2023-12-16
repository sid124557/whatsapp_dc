package com.whatsapp.stickers.avatars;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass218;
import X.AnonymousClass39M;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C49932hK;
import X.C51042jB;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.util.Log;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass39M $sticker;
    public int label;
    public final /* synthetic */ C49932hK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2(AnonymousClass39M r2, C49932hK r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$sticker = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass39M A00;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C49932hK r2 = this.this$0;
            String str = this.$sticker.A05;
            if (str != null && (A00 = r2.A03.A00(str)) != null) {
                return A00;
            }
            AnonymousClass39M r6 = this.$sticker;
            String str2 = r6.A05;
            if (str2 != null) {
                C49932hK r3 = this.this$0;
                File A002 = r3.A02.A00(new C51042jB(str2));
                String str3 = r6.A09;
                if (str3 == null || !AnonymousClass002.A0B(str3).exists() || !C162457s7.A0P(A002.getAbsolutePath(), str3)) {
                    Log.w("AvatarStickerOnDemandInstaller/cached sticker not found, downloading image");
                    this.label = 1;
                    obj = C616131n.A00(this, r3.A04, new AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2(r3, str2, (C84814Du) null));
                    if (obj == r4) {
                        return r4;
                    }
                }
            }
            Log.w("AvatarStickerOnDemandInstaller/cached sticker found, moving to permanent storage");
            this.this$0.A01(this.$sticker);
            return this.$sticker;
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2(this.$sticker, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
