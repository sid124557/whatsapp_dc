package com.whatsapp.status.playback.avatar;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass5PV;
import X.C57682u2;
import X.C59022wD;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $finalAvatarReactionList;
    public final /* synthetic */ WeakReference $listener;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2(AvatarReactionRepository avatarReactionRepository, WeakReference weakReference, List list, C84814Du r5) {
        super(r5, 2);
        this.this$0 = avatarReactionRepository;
        this.$finalAvatarReactionList = list;
        this.$listener = weakReference;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AvatarReactionRepository avatarReactionRepository = this.this$0;
            List list = this.$finalAvatarReactionList;
            WeakReference weakReference = this.$listener;
            List A0F = C73723fy.A0F(list);
            AnonymousClass5PV r0 = (AnonymousClass5PV) weakReference.get();
            if (r0 != null) {
                r0.A01(A0F);
            }
            avatarReactionRepository.A01 = A0F;
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2(this.this$0, this.$listener, this.$finalAvatarReactionList, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
