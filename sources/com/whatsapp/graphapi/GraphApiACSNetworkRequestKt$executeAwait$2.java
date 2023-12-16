package com.whatsapp.graphapi;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass74Z;
import X.C134606jJ;
import X.C134616jK;
import X.C57682u2;
import X.C59022wD;
import X.C73153f1;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.graphapi.GraphApiACSNetworkRequestKt$executeAwait$2", f = "GraphApiACSNetworkRequestKt.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class GraphApiACSNetworkRequestKt$executeAwait$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass74Z $acsTokenResult;
    public int label;
    public final /* synthetic */ GraphApiACSNetworkRequestKt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphApiACSNetworkRequestKt$executeAwait$2(AnonymousClass74Z r2, GraphApiACSNetworkRequestKt graphApiACSNetworkRequestKt, C84814Du r4) {
        super(r4, 2);
        this.$acsTokenResult = r2;
        this.this$0 = graphApiACSNetworkRequestKt;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass74Z r2 = this.$acsTokenResult;
            if (r2 instanceof C134606jJ) {
                GraphApiACSNetworkRequestKt graphApiACSNetworkRequestKt = this.this$0;
                graphApiACSNetworkRequestKt.A01 = (String) ((C134606jJ) r2).A00;
                this.label = 1;
                if (graphApiACSNetworkRequestKt.A0D() != 0) {
                    throw AnonymousClass002.A0G("Please use GraphApiACSNetworkRequest for cronet requests");
                }
                obj = graphApiACSNetworkRequestKt.A0M(this);
                if (obj == r4) {
                    return r4;
                }
            } else if (r2 instanceof C134616jK) {
                C134616jK r22 = (C134616jK) r2;
                return new C134616jK(r22.A01, r22.A00);
            } else {
                throw C73153f1.A00();
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new GraphApiACSNetworkRequestKt$executeAwait$2(this.$acsTokenResult, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
