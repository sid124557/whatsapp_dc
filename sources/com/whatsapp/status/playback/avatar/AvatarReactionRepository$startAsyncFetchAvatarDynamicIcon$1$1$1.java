package com.whatsapp.status.playback.avatar;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass5PV;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ File $it;
    public final /* synthetic */ WeakReference $listener;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1(File file, WeakReference weakReference, C84814Du r4) {
        super(r4, 2);
        this.$listener = weakReference;
        this.$it = file;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass5PV r1 = (AnonymousClass5PV) this.$listener.get();
            if (r1 != null) {
                r1.A00(this.$it);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1(this.$it, this.$listener, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
