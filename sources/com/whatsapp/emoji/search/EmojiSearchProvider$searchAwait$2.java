package com.whatsapp.emoji.search;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass46G;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C389029s;
import X.C57682u2;
import X.C57702u4;
import X.C59022wD;
import X.C75003pT;
import X.C818441h;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.emoji.search.EmojiSearchProvider$searchAwait$2", f = "EmojiSearchProvider.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiSearchProvider$searchAwait$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $query;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ EmojiSearchProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchProvider$searchAwait$2(EmojiSearchProvider emojiSearchProvider, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = emojiSearchProvider;
        this.$query = str;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            EmojiSearchProvider emojiSearchProvider = this.this$0;
            String str = this.$query;
            this.L$0 = emojiSearchProvider;
            this.L$1 = str;
            this.label = 1;
            AnonymousClass46G A04 = C57702u4.A04(this);
            C162457s7.A0J(str, 0);
            emojiSearchProvider.A00(str, true, true).A00(new C389029s(A04, 0));
            A04.BGs(new C818441h(A04));
            obj = A04.A06();
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new EmojiSearchProvider$searchAwait$2(this.this$0, this.$query, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
