package com.whatsapp.avatar.autogen;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass3LU;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1", f = "AvatarAutogenMediaUploadManagerImpl.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GQ $callback;
    public final /* synthetic */ File $file;
    public int label;
    public final /* synthetic */ AnonymousClass3LU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1(AnonymousClass3LU r2, File file, C84814Du r4, AnonymousClass4GQ r5) {
        super(r4, 2);
        this.this$0 = r2;
        this.$file = file;
        this.$callback = r5;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass3LU r4 = this.this$0;
            File file = this.$file;
            this.label = 1;
            obj = C616131n.A00(this, r4.A03, new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$3(r4, file, (C84814Du) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.$callback.invoke(obj);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1(this.this$0, this.$file, r6, this.$callback);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
