package com.whatsapp.graphql;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass469;
import X.AnonymousClass46G;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C57702u4;
import X.C59022wD;
import X.C75003pT;
import X.C84594Cy;
import X.C84814Du;
import X.C86424Kb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.graphql.GraphqlRequest$postAwait$2", f = "GraphqlRequest.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
public final class GraphqlRequest$postAwait$2 extends C75003pT implements AnonymousClass4GR {
    public Object L$0;
    public int label;
    public final /* synthetic */ C84594Cy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphqlRequest$postAwait$2(C84594Cy r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C84594Cy r3 = this.this$0;
            this.L$0 = r3;
            this.label = 1;
            AnonymousClass46G A04 = C57702u4.A04(this);
            C86424Kb r1 = new C86424Kb(A04, 1);
            if (!(AnonymousClass46G.A04.get(A04) instanceof AnonymousClass469)) {
                r3.Bh4(r1);
            }
            obj = A04.A06();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new GraphqlRequest$postAwait$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new GraphqlRequest$postAwait$2(this.this$0, (C84814Du) obj2));
    }
}
