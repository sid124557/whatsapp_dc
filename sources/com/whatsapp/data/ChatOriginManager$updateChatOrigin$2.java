package com.whatsapp.data;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass2R4;
import X.AnonymousClass31A;
import X.AnonymousClass4GR;
import X.C371321b;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.ChatOriginManager$updateChatOrigin$2", f = "ChatOriginManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatOriginManager$updateChatOrigin$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass31A $chatInfo;
    public final /* synthetic */ C371321b $chatOrigin;
    public int label;
    public final /* synthetic */ AnonymousClass2R4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatOriginManager$updateChatOrigin$2(AnonymousClass31A r2, C371321b r3, AnonymousClass2R4 r4, C84814Du r5) {
        super(r5, 2);
        this.$chatInfo = r2;
        this.$chatOrigin = r3;
        this.this$0 = r4;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass31A r2 = this.$chatInfo;
            C371321b r1 = this.$chatOrigin;
            if (r2.A0Z == null) {
                r2.A0Z = r1;
            }
            return AnonymousClass0x9.A0k(this.this$0.A00.A05(r2));
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new ChatOriginManager$updateChatOrigin$2(this.$chatInfo, this.$chatOrigin, this.this$0, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
