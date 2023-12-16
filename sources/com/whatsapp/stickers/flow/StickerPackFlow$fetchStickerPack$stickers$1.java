package com.whatsapp.stickers.flow;

import X.AnonymousClass001;
import X.AnonymousClass336;
import X.AnonymousClass3Z0;
import X.AnonymousClass3Z9;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18260x0;
import X.C50262ht;
import X.C50612iT;
import X.C57682u2;
import X.C59022wD;
import X.C72023d3;
import X.C75003pT;
import X.C84814Du;
import android.util.Pair;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$fetchStickerPack$stickers$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$fetchStickerPack$stickers$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C50612iT $stickerPack;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$fetchStickerPack$stickers$1(C50612iT r2, StickerPackFlow stickerPackFlow, C84814Du r4) {
        super(r4, 2);
        this.$stickerPack = r2;
        this.this$0 = stickerPackFlow;
    }

    public final Object A09(Object obj) {
        List list;
        Object obj2;
        if (this.label == 0) {
            C57682u2.A01(obj);
            C50612iT r3 = this.$stickerPack;
            boolean z = r3.A0T;
            StickerPackFlow stickerPackFlow = this.this$0;
            if (z) {
                try {
                    C50262ht r2 = stickerPackFlow.A09;
                    Pair A00 = AnonymousClass336.A00(r3.A0G);
                    if (A00 != null) {
                        obj2 = r2.A00((String) A00.first, (String) A00.second).A05;
                    } else {
                        obj2 = Collections.emptyList();
                    }
                } catch (Throwable th) {
                    obj2 = AnonymousClass3Z0.A01(th);
                }
                C50612iT r32 = this.$stickerPack;
                Throwable A002 = AnonymousClass3Z9.A00(obj2);
                if (A002 != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("StickerPackFlow/packFlow failed to get stickers from pack ");
                    C18260x0.A15(r32.A0G, A0o, A002);
                    obj2 = C72023d3.A00;
                }
                list = (List) obj2;
            } else {
                list = stickerPackFlow.A08.A02(r3.A0G);
                C162457s7.A0H(list);
            }
            this.this$0.A02.A05(list);
            return list;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        StickerPackFlow$fetchStickerPack$stickers$1 stickerPackFlow$fetchStickerPack$stickers$1 = new StickerPackFlow$fetchStickerPack$stickers$1(this.$stickerPack, this.this$0, r5);
        stickerPackFlow$fetchStickerPack$stickers$1.L$0 = obj;
        return stickerPackFlow$fetchStickerPack$stickers$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
