package com.whatsapp.status.playback.avatar;

import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncAvatarReactionFetch$2", f = "AvatarReactionRepository.kt", i = {}, l = {73, 76}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$startAsyncAvatarReactionFetch$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4C6 $avatarReactionScope;
    public final /* synthetic */ boolean $isAnimatedAvatars;
    public final /* synthetic */ WeakReference $listener;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$startAsyncAvatarReactionFetch$2(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, C84814Du r4, AnonymousClass4C6 r5, boolean z) {
        super(r4, 2);
        this.this$0 = avatarReactionRepository;
        this.$avatarReactionScope = r5;
        this.$isAnimatedAvatars = z;
        this.$listener = weakReference;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r8) {
        /*
            r7 = this;
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r4) goto L_0x0026
            if (r0 != r5) goto L_0x0043
            X.C57682u2.A01(r8)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r8)
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r3 = r7.this$0
            X.4C6 r2 = r7.$avatarReactionScope
            boolean r1 = r7.$isAnimatedAvatars
            java.lang.ref.WeakReference r0 = r7.$listener
            r7.label = r4
            java.lang.Object r8 = r3.A00(r0, r7, r2, r1)
            if (r8 != r6) goto L_0x0029
            return r6
        L_0x0026:
            X.C57682u2.A01(r8)
        L_0x0029:
            boolean r0 = X.AnonymousClass001.A1Z(r8)
            if (r0 != 0) goto L_0x000f
            boolean r0 = r7.$isAnimatedAvatars
            if (r0 == 0) goto L_0x000f
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r3 = r7.this$0
            X.4C6 r2 = r7.$avatarReactionScope
            java.lang.ref.WeakReference r1 = r7.$listener
            r7.label = r5
            r0 = 0
            java.lang.Object r0 = r3.A00(r1, r7, r2, r0)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0043:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncAvatarReactionFetch$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new AvatarReactionRepository$startAsyncAvatarReactionFetch$2(this.this$0, this.$listener, r8, this.$avatarReactionScope, this.$isAnimatedAvatars);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
