package com.whatsapp.status.playback.avatar;

import X.AnonymousClass001;
import X.AnonymousClass10E;
import X.AnonymousClass218;
import X.AnonymousClass39M;
import X.AnonymousClass4GR;
import X.AnonymousClass5PV;
import X.C100705By;
import X.C51042jB;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73723fy;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import X.C86624Kv;
import X.C984751a;
import X.C984851b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1", f = "AvatarReactionRepository.kt", i = {1}, l = {118, 125}, m = "invokeSuspend", n = {"avatarReaction"}, s = {"L$0"})
public final class AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $index;
    public final /* synthetic */ WeakReference $listener;
    public final /* synthetic */ String $stableId;
    public Object L$0;
    public int label;
    public final /* synthetic */ AvatarReactionRepository this$0;

    @DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1$1", f = "AvatarReactionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            if (this.label == 0) {
                C57682u2.A01(obj);
                ArrayList A0d = C86624Kv.A0d(avatarReactionRepository.A01);
                A0d.set(i2, r6);
                AvatarReactionRepository avatarReactionRepository = avatarReactionRepository;
                WeakReference weakReference = weakReference;
                List A0F = C73723fy.A0F(A0d);
                AnonymousClass5PV r0 = (AnonymousClass5PV) weakReference.get();
                if (r0 != null) {
                    r0.A01(A0F);
                }
                avatarReactionRepository.A01 = A0F;
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r8) {
            return new AnonymousClass1(r6, avatarReactionRepository, weakReference, r8, i2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1(AvatarReactionRepository avatarReactionRepository, String str, WeakReference weakReference, C84814Du r5, int i) {
        super(r5, 2);
        this.this$0 = avatarReactionRepository;
        this.$stableId = str;
        this.$index = i;
        this.$listener = weakReference;
    }

    public final Object A09(Object obj) {
        C51042jB r0;
        final C100705By r6;
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass10E r62 = this.this$0.A03;
            String str = this.$stableId;
            this.label = 1;
            obj = C616131n.A00(this, r62.A02, new AvatarReactionImageLoader$loadAvatarReactionStickerImage$2(r62, str, (C84814Du) null));
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else if (i == 2) {
            Object obj2 = this.L$0;
            C57682u2.A01(obj);
            return obj2;
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass39M r12 = (AnonymousClass39M) obj;
        String str2 = this.$stableId;
        if (r12 != null) {
            r6 = new C984851b(r0, r12);
        } else {
            r0 = new C51042jB(str2);
            r6 = new C984751a(r0);
        }
        final AvatarReactionRepository avatarReactionRepository = this.this$0;
        C73853gB r02 = avatarReactionRepository.A06;
        final int i2 = this.$index;
        final WeakReference weakReference = this.$listener;
        AnonymousClass1 r5 = new AnonymousClass1((C84814Du) null);
        this.L$0 = r6;
        this.label = 2;
        if (C616131n.A00(this, r02, r5) != r3) {
            return r6;
        }
        return r3;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1(this.this$0, this.$stableId, this.$listener, r8, this.$index);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
