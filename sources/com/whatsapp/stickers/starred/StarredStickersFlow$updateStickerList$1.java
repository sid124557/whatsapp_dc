package com.whatsapp.stickers.starred;

import X.AnonymousClass001;
import X.AnonymousClass295;
import X.AnonymousClass2AK;
import X.AnonymousClass2UB;
import X.AnonymousClass39M;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.C162457s7;
import X.C32781rc;
import X.C32791rd;
import X.C54962pZ;
import X.C57682u2;
import X.C58912w1;
import X.C59022wD;
import X.C626936e;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.starred.StarredStickersFlow$updateStickerList$1", f = "StarredStickersFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StarredStickersFlow$updateStickerList$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4Gm $this_updateStickerList;
    public final /* synthetic */ int $type;
    public int label;
    public final /* synthetic */ C58912w1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredStickersFlow$updateStickerList$1(C58912w1 r2, C84814Du r3, AnonymousClass4Gm r4, int i) {
        super(r3, 2);
        this.this$0 = r2;
        this.$type = i;
        this.$this_updateStickerList = r4;
    }

    public final Object A09(Object obj) {
        Object r0;
        if (this.label == 0) {
            C57682u2.A01(obj);
            C54962pZ r02 = this.this$0.A03;
            int i = this.$type;
            C626936e.A00();
            List<AnonymousClass2UB> A01 = r02.A05.A01(Integer.MAX_VALUE, i);
            C58912w1 r5 = this.this$0;
            ArrayList A0s = AnonymousClass001.A0s();
            for (AnonymousClass2UB r2 : A01) {
                C162457s7.A0H(r2);
                AnonymousClass39M A00 = AnonymousClass295.A00(r5.A01, r5.A02, r2);
                if (A00 != null) {
                    A0s.add(A00);
                }
            }
            boolean isEmpty = A0s.isEmpty();
            AnonymousClass4Gm r1 = this.$this_updateStickerList;
            if (isEmpty) {
                r0 = C32791rd.A00;
            } else {
                r0 = new C32781rc(A0s);
            }
            AnonymousClass2AK.A00(r0, r1);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new StarredStickersFlow$updateStickerList$1(this.this$0, r6, this.$this_updateStickerList, this.$type);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
