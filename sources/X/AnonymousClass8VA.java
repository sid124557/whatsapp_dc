package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoImageView;

/* renamed from: X.8VA  reason: invalid class name */
public final class AnonymousClass8VA extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AvatarProfilePhotoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8VA(AvatarProfilePhotoActivity avatarProfilePhotoActivity) {
        super(0);
        this.this$0 = avatarProfilePhotoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View view = this.this$0.A02;
        if (view != null) {
            int width = view.getWidth();
            View view2 = this.this$0.A02;
            if (view2 != null) {
                int height = view2.getHeight();
                if (width >= height) {
                    width = height;
                }
                int i = (int) (((double) width) * 0.65d);
                AvatarProfilePhotoImageView avatarProfilePhotoImageView = this.this$0.A07;
                if (avatarProfilePhotoImageView != null) {
                    ViewGroup.LayoutParams layoutParams = avatarProfilePhotoImageView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = i;
                        layoutParams.height = i;
                    } else {
                        layoutParams = null;
                    }
                    avatarProfilePhotoImageView.setLayoutParams(layoutParams);
                }
            }
        }
        return C59022wD.A00;
    }
}
