package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass1U8;
import X.AnonymousClass4GR;
import X.C18270x1;
import X.C23451Th;
import X.C381826a;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onClickCloseStickersUpsell$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onClickCloseStickersUpsell$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onClickCloseStickersUpsell$1(StickerExpressionsViewModel stickerExpressionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C18270x1.A0f(C18270x1.A03(this.this$0.A0A), "fun_stickers_upsell_dismissed");
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C381826a r4 = (C381826a) stickerExpressionsViewModel.A0g.getValue();
            if (r4 instanceof AnonymousClass1U8) {
                AnonymousClass1U8 r42 = (AnonymousClass1U8) r4;
                List list = r42.A01;
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next() instanceof C23451Th) {
                        C75003pT.A04(stickerExpressionsViewModel, r42, list, i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new StickerExpressionsViewModel$onClickCloseStickersUpsell$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new StickerExpressionsViewModel$onClickCloseStickersUpsell$1(this.this$0, (C84814Du) obj2));
    }
}
