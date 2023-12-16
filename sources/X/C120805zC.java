package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController;

/* renamed from: X.5zC  reason: invalid class name and case insensitive filesystem */
public final class C120805zC extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AvatarStickerUpsellView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120805zC(Context context, AvatarStickerUpsellView avatarStickerUpsellView) {
        super(0);
        this.$context = context;
        this.this$0 = avatarStickerUpsellView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Activity A02 = C111095hX.A02(this.$context);
        C51932kc avatarSharedPreferences = this.this$0.getAvatarSharedPreferences();
        AnonymousClass5ZD avatarEditorLauncher = this.this$0.getAvatarEditorLauncher();
        C55862r2 avatarLogger = this.this$0.getAvatarLogger();
        return new AvatarStickerUpsellViewController(A02, this.this$0, this.this$0.getAvatarConfigRepository(), avatarSharedPreferences, avatarEditorLauncher, avatarLogger, this.this$0.getMainDispatcher());
    }
}
