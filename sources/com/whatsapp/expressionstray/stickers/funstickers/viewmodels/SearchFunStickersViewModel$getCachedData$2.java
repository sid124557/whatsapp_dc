package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass1UD;
import X.AnonymousClass39D;
import X.AnonymousClass39M;
import X.AnonymousClass4GR;
import X.C18300x5;
import X.C33091sQ;
import X.C57682u2;
import X.C59022wD;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getCachedData$2", f = "SearchFunStickersViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$getCachedData$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $chatJid;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$getCachedData$2(SearchFunStickersViewModel searchFunStickersViewModel, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = searchFunStickersViewModel;
        this.$chatJid = str;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C33091sQ r4 = this.this$0.A0F;
            String str = this.$chatJid;
            ArrayList A0r = C18300x5.A0r(str);
            Iterable<Object> iterable = (Iterable) r4.A00.get(str);
            if (iterable != null) {
                for (Object obj2 : iterable) {
                    Object obj3 = r4.A01.get(obj2);
                    if (obj3 != null) {
                        A0r.add(obj3);
                    }
                }
            }
            ArrayList A0c = C73783g4.A0c(A0r);
            Iterator it = A0r.iterator();
            while (it.hasNext()) {
                AnonymousClass39D r42 = (AnonymousClass39D) it.next();
                A0c.add(new AnonymousClass1UD(r42, (AnonymousClass39M) null, r42.A05, false));
            }
            return A0c;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new SearchFunStickersViewModel$getCachedData$2(this.this$0, this.$chatJid, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
