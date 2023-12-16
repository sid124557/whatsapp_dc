package com.whatsapp.calling.psa.data;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2S2;
import X.AnonymousClass367;
import X.AnonymousClass4GR;
import X.AnonymousClass4IS;
import X.AnonymousClass4KD;
import X.C162457s7;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C69903Yy;
import X.C72023d3;
import X.C73753g1;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2", f = "GroupCallPsaDatasourceImpl.kt", i = {0}, l = {33}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
public final class GroupCallPsaDatasourceImpl$loadSuggestions$2 extends C75003pT implements AnonymousClass4GR {
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass2S2 this$0;

    @DebugMetadata(c = "com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2$1", f = "GroupCallPsaDatasourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            if (this.label == 0) {
                C57682u2.A01(obj);
                ArrayList A0G = AnonymousClass2S2.this.A01.A0G();
                AnonymousClass367.A01(new AnonymousClass4KD(AnonymousClass2S2.this, 0), A0G);
                C162457s7.A0H(A0G);
                if (!A0G.isEmpty()) {
                    AnonymousClass2S2 r2 = AnonymousClass2S2.this;
                    if (A0G.size() > 1) {
                        C73753g1.A0a(A0G, new AnonymousClass4IS((Object) r2, 3));
                    }
                    C69903Yy r22 = r4;
                    List subList = A0G.subList(0, Math.min(A0G.size(), 20));
                    C162457s7.A0D(subList);
                    r22.element = subList;
                }
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r5) {
            return new AnonymousClass1(r5, r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCallPsaDatasourceImpl$loadSuggestions$2(AnonymousClass2S2 r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        final C69903Yy r4;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            r4 = new C69903Yy();
            r4.element = C72023d3.A00;
            final AnonymousClass2S2 r3 = this.this$0;
            C73853gB r2 = r3.A05;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.L$0 = r4;
            this.label = 1;
            if (C616131n.A00(this, r2, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            r4 = (C69903Yy) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return r4.element;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new GroupCallPsaDatasourceImpl$loadSuggestions$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new GroupCallPsaDatasourceImpl$loadSuggestions$2(this.this$0, (C84814Du) obj2));
    }
}
