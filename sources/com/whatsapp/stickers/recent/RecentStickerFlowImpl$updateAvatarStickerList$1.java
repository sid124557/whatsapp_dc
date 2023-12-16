package com.whatsapp.stickers.recent;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass2AK;
import X.AnonymousClass32R;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.C32751rZ;
import X.C32761ra;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateAvatarStickerList$1", f = "RecentStickerFlowImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecentStickerFlowImpl$updateAvatarStickerList$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4Gm $this_updateAvatarStickerList;
    public int label;
    public final /* synthetic */ AnonymousClass32R this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentStickerFlowImpl$updateAvatarStickerList$1(AnonymousClass32R r2, C84814Du r3, AnonymousClass4Gm r4) {
        super(r3, 2);
        this.this$0 = r2;
        this.$this_updateAvatarStickerList = r4;
    }

    public final Object A09(Object obj) {
        Object r0;
        if (this.label == 0) {
            C57682u2.A01(obj);
            List A0D = AnonymousClass0x9.A0a(this.this$0.A00).A0D();
            boolean isEmpty = A0D.isEmpty();
            AnonymousClass4Gm r1 = this.$this_updateAvatarStickerList;
            if (isEmpty) {
                r0 = C32761ra.A00;
            } else {
                r0 = new C32751rZ(A0D);
            }
            AnonymousClass2AK.A00(r0, r1);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new RecentStickerFlowImpl$updateAvatarStickerList$1(this.this$0, r5, this.$this_updateAvatarStickerList);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
