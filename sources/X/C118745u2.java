package X;

import com.whatsapp.status.playback.avatar.AvatarReactionRepository;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionRepository", f = "AvatarReactionRepository.kt", i = {0, 0, 0}, l = {134, 150}, m = "fetchAvatarReactionStickersInParallel", n = {"this", "listener", "isAnimatedAvatarsEnabled"}, s = {"L$0", "L$1", "Z$0"})
/* renamed from: X.5u2  reason: invalid class name and case insensitive filesystem */
public final class C118745u2 extends C75013pU {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarReactionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118745u2(AvatarReactionRepository avatarReactionRepository, C84814Du r2) {
        super(r2);
        this.this$0 = avatarReactionRepository;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((WeakReference) null, this, (AnonymousClass4C6) null, false);
    }
}
