package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.avatar.home.AvatarHomeActivity;

/* renamed from: X.413  reason: invalid class name */
public final class AnonymousClass413 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AvatarHomeActivity this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C162457s7.A0J(obj, 0);
        if (obj.equals(C132036ea.A00)) {
            AvatarHomeActivity avatarHomeActivity = this.this$0;
            Intent A07 = C18320x8.A07();
            A07.setClassName(avatarHomeActivity.getPackageName(), "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity");
            avatarHomeActivity.startActivity(A07);
        } else if (obj.equals(C132026eZ.A00)) {
            AvatarHomeActivity avatarHomeActivity2 = this.this$0;
            AnonymousClass5ZD r2 = avatarHomeActivity2.A0I;
            if (r2 != null) {
                r2.A04("avatar_home", AnonymousClass0x9.A14(avatarHomeActivity2));
            } else {
                throw C18270x1.A0S("avatarEditorLauncher");
            }
        } else if (obj.equals(C132046eb.A00)) {
            AvatarHomeActivity avatarHomeActivity3 = this.this$0;
            Intent A072 = C18320x8.A07();
            A072.setClassName(avatarHomeActivity3.getPackageName(), "com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity");
            A072.putExtra("sticker_pack_id", "meta-avatar");
            avatarHomeActivity3.startActivity(A072);
        } else if (obj.equals(C132056ec.A00)) {
            AvatarHomeActivity avatarHomeActivity4 = this.this$0;
            avatarHomeActivity4.A6b(new C85884Hz(avatarHomeActivity4, 0), new AnonymousClass4IA(0), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
        }
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass413(AvatarHomeActivity avatarHomeActivity) {
        super(1);
        this.this$0 = avatarHomeActivity;
    }
}
