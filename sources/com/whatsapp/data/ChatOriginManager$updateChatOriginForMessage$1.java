package com.whatsapp.data;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2R4;
import X.AnonymousClass31A;
import X.AnonymousClass4GR;
import X.C27981fH;
import X.C371321b;
import X.C56982ss;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.ChatOriginManager$updateChatOriginForMessage$1", f = "ChatOriginManager.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class ChatOriginManager$updateChatOriginForMessage$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C371321b $chatOrigin;
    public final /* synthetic */ C27981fH $jid;
    public int label;
    public final /* synthetic */ AnonymousClass2R4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatOriginManager$updateChatOriginForMessage$1(C371321b r2, AnonymousClass2R4 r3, C27981fH r4, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r3;
        this.$jid = r4;
        this.$chatOrigin = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass2R4 r5 = this.this$0;
            C27981fH r1 = this.$jid;
            C371321b r4 = this.$chatOrigin;
            this.label = 1;
            AnonymousClass31A A00 = C56982ss.A00(r5.A01, r1);
            if ((A00 != null && C616131n.A00(this, r5.A03, new ChatOriginManager$updateChatOrigin$2(A00, r4, r5, (C84814Du) null)) == r6) || C59022wD.A00 == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new ChatOriginManager$updateChatOriginForMessage$1(this.$chatOrigin, this.this$0, this.$jid, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
