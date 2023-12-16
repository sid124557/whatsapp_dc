package com.whatsapp.stickers.flow;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.C162457s7;
import X.C18280x3;
import X.C32671rQ;
import X.C32691rS;
import X.C48272ed;
import X.C50612iT;
import X.C54972pa;
import X.C57682u2;
import X.C59022wD;
import X.C626936e;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4Gm $$this$callbackFlow;
    public final /* synthetic */ String $authority;
    public final /* synthetic */ String $identifier;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1(StickerPackFlow stickerPackFlow, String str, String str2, C84814Du r5, AnonymousClass4Gm r6) {
        super(r5, 2);
        this.this$0 = stickerPackFlow;
        this.$authority = str;
        this.$identifier = str2;
        this.$$this$callbackFlow = r6;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C50612iT A00 = this.this$0.A09.A00(this.$authority, this.$identifier);
            C54972pa r0 = this.this$0.A07;
            String str = A00.A0G;
            C626936e.A00();
            int A01 = r0.A03.A01(str);
            A00.A07 = true;
            A00.A00 = A01;
            List list = this.this$0.A00.A00;
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : list) {
                C18280x3.A18(((C48272ed) next).A01(), str, next, A0s);
            }
            C162457s7.A0D(str);
            StickerPackFlow.A00(new C32671rQ(C73723fy.A0M(new C32691rS(A00, str), A0s)), this.this$0, this.$$this$callbackFlow);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new StickerPackFlow$packFlow$1$observer$1$onThirdPartyPackAdded$1(this.this$0, this.$authority, this.$identifier, r8, this.$$this$callbackFlow);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
