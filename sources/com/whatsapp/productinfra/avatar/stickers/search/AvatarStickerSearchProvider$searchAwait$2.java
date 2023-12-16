package com.whatsapp.productinfra.avatar.stickers.search;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass46G;
import X.AnonymousClass4GR;
import X.AnonymousClass4KS;
import X.C162457s7;
import X.C27811eh;
import X.C33501tE;
import X.C389029s;
import X.C48652fF;
import X.C50432iA;
import X.C57682u2;
import X.C57702u4;
import X.C59022wD;
import X.C626936e;
import X.C75003pT;
import X.C84814Du;
import java.util.Arrays;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.stickers.search.AvatarStickerSearchProvider$searchAwait$2", f = "AvatarStickerSearchProvider.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerSearchProvider$searchAwait$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String[] $query;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C27811eh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerSearchProvider$searchAwait$2(C27811eh r2, C84814Du r3, String[] strArr) {
        super(r3, 2);
        this.$query = strArr;
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        C48652fF r9;
        AnonymousClass218 r7 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            String[] strArr = this.$query;
            C27811eh r2 = this.this$0;
            this.L$0 = strArr;
            this.L$1 = r2;
            this.label = 1;
            AnonymousClass46G A04 = C57702u4.A04(this);
            int length = strArr.length;
            if (length == 1) {
                String str = strArr[0];
                C162457s7.A0J(str, 0);
                r9 = r2.A00(str, false, false);
            } else {
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, length);
                C162457s7.A0J(strArr2, 0);
                r9 = new C48652fF();
                if (r2.A02) {
                    C50432iA r4 = r2.A03;
                    AnonymousClass4KS r1 = new AnonymousClass4KS(r9, 1);
                    C626936e.A01();
                    Set set = r4.A0A;
                    C33501tE r22 = new C33501tE(r4, r1, r4.A07, true);
                    r4.A09.BkL(r22, Arrays.copyOf(strArr2, strArr2.length));
                    set.add(r22);
                }
            }
            r9.A00(new C389029s(A04, 1));
            obj = A04.A06();
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarStickerSearchProvider$searchAwait$2(this.this$0, r5, this.$query);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
