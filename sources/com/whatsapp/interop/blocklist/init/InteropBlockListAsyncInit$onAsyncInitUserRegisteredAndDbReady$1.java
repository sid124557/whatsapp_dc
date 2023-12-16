package com.whatsapp.interop.blocklist.init;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2RM;
import X.AnonymousClass3DA;
import X.AnonymousClass4GR;
import X.C18310x6;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.interop.blocklist.InteropBlockListManager$loadBlockListFromStorage$2;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.blocklist.init.InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1", f = "InteropBlockListAsyncInit.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
public final class InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass3DA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1(AnonymousClass3DA r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        Object obj2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass2RM r3 = this.this$0.A01;
            this.label = 1;
            Set set = r3.A02;
            boolean A1X = C18310x6.A1X(set);
            Object obj3 = set;
            if (!A1X) {
                obj3 = C616131n.A00(this, r3.A03, new InteropBlockListManager$loadBlockListFromStorage$2(r3, (C84814Du) null));
            }
            if (obj3 == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new InteropBlockListAsyncInit$onAsyncInitUserRegisteredAndDbReady$1(this.this$0, (C84814Du) obj2));
    }
}
