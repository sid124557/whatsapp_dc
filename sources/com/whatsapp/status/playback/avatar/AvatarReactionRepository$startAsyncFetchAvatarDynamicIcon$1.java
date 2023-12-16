package com.whatsapp.status.playback.avatar;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1", f = "AvatarReactionRepository.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ WeakReference $listener;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, C84814Du r4) {
        super(r4, 2);
        this.this$0 = avatarReactionRepository;
        this.$listener = weakReference;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            File A01 = this.this$0.A04.A01("meta-avatar-tab-icon");
            if (A01 != null) {
                AvatarReactionRepository avatarReactionRepository = this.this$0;
                WeakReference weakReference = this.$listener;
                avatarReactionRepository.A00 = A01;
                C73853gB r2 = avatarReactionRepository.A06;
                AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1 avatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1 = new AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1(A01, weakReference, (C84814Du) null);
                this.label = 1;
                if (C616131n.A00(this, r2, avatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1$1$1) == r6) {
                    return r6;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1(this.this$0, this.$listener, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
