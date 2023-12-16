package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass20D;
import X.AnonymousClass2UW;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.AnonymousClass4HP;
import X.C23561Ts;
import X.C29361ih;
import X.C50612iT;
import X.C56872sh;
import X.C57682u2;
import X.C58422vE;
import X.C59022wD;
import X.C61102zi;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.stickers.flow.StickerPackFlow;
import com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$notifyStickerPackOnScreen$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$notifyStickerPackOnScreen$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass2UW $section;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$notifyStickerPackOnScreen$1(AnonymousClass2UW r2, StickerExpressionsViewModel stickerExpressionsViewModel, C84814Du r4) {
        super(r4, 2);
        this.this$0 = stickerExpressionsViewModel;
        this.$section = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            if (this.this$0.A0L.A0Y(C58422vE.A02, 6548)) {
                AnonymousClass2UW r1 = this.$section;
                if (r1 instanceof C23561Ts) {
                    C29361ih r0 = this.this$0.A0R;
                    C50612iT r7 = ((C23561Ts) r1).A00;
                    Iterator A03 = C61102zi.A03(r0);
                    while (A03.hasNext()) {
                        C56872sh r12 = (C56872sh) A03.next();
                        if (r12 instanceof AnonymousClass4HP) {
                            AnonymousClass4HP r13 = (AnonymousClass4HP) r12;
                            if (1 - r13.A02 == 0) {
                                StickerPackFlow stickerPackFlow = (StickerPackFlow) r13.A01;
                                C616131n.A02(stickerPackFlow.A0B, new StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1(r7, stickerPackFlow, (C84814Du) null, (AnonymousClass4Gm) r13.A00), stickerPackFlow.A0D, (AnonymousClass20D) null, 2);
                            }
                        }
                    }
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new StickerExpressionsViewModel$notifyStickerPackOnScreen$1(this.$section, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
