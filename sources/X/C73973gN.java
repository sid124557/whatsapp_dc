package X;

import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory", f = "AvatarOnDemandStickerCategory.kt", i = {}, l = {30}, m = "fetch-IoAF18A", n = {}, s = {})
/* renamed from: X.3gN  reason: invalid class name and case insensitive filesystem */
public final class C73973gN extends C75013pU {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarOnDemandStickerCategory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73973gN(AvatarOnDemandStickerCategory avatarOnDemandStickerCategory, C84814Du r2) {
        super(r2);
        this.this$0 = avatarOnDemandStickerCategory;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A00 = this.this$0.A00(this);
        if (A00 != AnonymousClass218.COROUTINE_SUSPENDED) {
            return new AnonymousClass3Z9(A00);
        }
        return A00;
    }
}
