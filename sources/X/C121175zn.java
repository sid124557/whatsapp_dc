package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;

/* renamed from: X.5zn  reason: invalid class name and case insensitive filesystem */
public final class C121175zn extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AvatarProfilePhotoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121175zn(AvatarProfilePhotoActivity avatarProfilePhotoActivity) {
        super(1);
        this.this$0 = avatarProfilePhotoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C141506vg r4 = (C141506vg) obj;
        if (r4 != null) {
            int ordinal = r4.ordinal();
            if (ordinal == 0) {
                AvatarProfilePhotoActivity avatarProfilePhotoActivity = this.this$0;
                AnonymousClass5ZD r2 = avatarProfilePhotoActivity.A08;
                if (r2 != null) {
                    r2.A04("avatar_profile_photo_tool", AnonymousClass0x9.A14(avatarProfilePhotoActivity));
                } else {
                    throw C18270x1.A0S("avatarEditorLauncher");
                }
            } else if (ordinal == 1) {
                this.this$0.finish();
            }
        }
        return C59022wD.A00;
    }
}
