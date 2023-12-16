package com.whatsapp.updates.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616231o;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.SearchUsecase$fetchRemoteNewsletterResults$2$1", f = "SearchUsecase.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
public final class SearchUsecase$fetchRemoteNewsletterResults$2$1 extends C75003pT implements AnonymousClass4GR {
    public int label;

    public SearchUsecase$fetchRemoteNewsletterResults$2$1(C84814Du r2) {
        super(r2, 2);
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.label = 1;
            if (C616231o.A00(this, 300) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r3) {
        return new SearchUsecase$fetchRemoteNewsletterResults$2$1(r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new SearchUsecase$fetchRemoteNewsletterResults$2$1((C84814Du) obj2));
    }
}
