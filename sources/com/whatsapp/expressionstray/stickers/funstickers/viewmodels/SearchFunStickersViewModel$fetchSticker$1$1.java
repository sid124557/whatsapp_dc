package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass39D;
import X.AnonymousClass3Z6;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C33091sQ;
import X.C57682u2;
import X.C58422vE;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C834348j;
import X.C84814Du;
import X.C85394Gb;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$fetchSticker$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass39D $model;
    public final /* synthetic */ int $position;
    public final /* synthetic */ String $url;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$fetchSticker$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            String str;
            Set set;
            AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                SearchFunStickersViewModel searchFunStickersViewModel = SearchFunStickersViewModel.this;
                String str2 = str;
                this.label = 1;
                obj = searchFunStickersViewModel.A0D(str2, this);
                if (obj == r3) {
                    return r3;
                }
            } else if (i == 1) {
                try {
                    C57682u2.A01(obj);
                } catch (CancellationException e) {
                    Log.e("SearchFunStickersViewModel/getSticker/e", e);
                }
            } else {
                throw AnonymousClass001.A0d();
            }
            if (obj != null) {
                SearchFunStickersViewModel searchFunStickersViewModel2 = SearchFunStickersViewModel.this;
                AnonymousClass39D r7 = r5;
                int i2 = i2;
                if (searchFunStickersViewModel2.A0G.A0Y(C58422vE.A02, 5339) && (str = searchFunStickersViewModel2.A02) != null) {
                    C33091sQ r1 = searchFunStickersViewModel2.A0F;
                    C162457s7.A0J(r7, 1);
                    String str3 = r7.A08;
                    if (str3 != null) {
                        r1.A01.put(str3, r7);
                        Map map = r1.A00;
                        Object obj2 = map.get(str);
                        if (!(obj2 instanceof Set) || (((obj2 instanceof C834348j) && !(obj2 instanceof C85394Gb)) || (set = (Set) obj2) == null)) {
                            set = AnonymousClass0x9.A17();
                        }
                        set.add(str3);
                        map.put(str, set);
                    }
                }
                searchFunStickersViewModel2.A08.A0G(AnonymousClass3Z6.A01(obj, i2));
            }
            return C59022wD.A00;
        }

        public final C84814Du A0A(Object obj, C84814Du r8) {
            return new AnonymousClass1(r5, str, r8, i2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$fetchSticker$1$1(SearchFunStickersViewModel searchFunStickersViewModel, AnonymousClass39D r3, String str, C84814Du r5, int i) {
        super(r5, 2);
        this.this$0 = searchFunStickersViewModel;
        this.$url = str;
        this.$model = r3;
        this.$position = i;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final SearchFunStickersViewModel searchFunStickersViewModel = this.this$0;
            C73853gB r0 = searchFunStickersViewModel.A0U;
            final String str = this.$url;
            final AnonymousClass39D r5 = this.$model;
            final int i2 = this.$position;
            AnonymousClass1 r3 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new SearchFunStickersViewModel$fetchSticker$1$1(this.this$0, this.$model, this.$url, r8, this.$position);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
