package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoImageView;

/* renamed from: X.4fl  reason: invalid class name and case insensitive filesystem */
public final class C90054fl extends C125616Is {
    public final float A00;
    public final AvatarProfilePhotoImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90054fl(View view) {
        super(view);
        C162457s7.A0J(view, 1);
        this.A01 = (AvatarProfilePhotoImageView) view;
        this.A00 = view.getResources().getDimension(R.dimen.f6nameremoved);
    }

    public void A07(AnonymousClass73X r6, AnonymousClass4GQ r7) {
        String A0X;
        C162457s7.A0J(r6, 0);
        C132086ef r62 = (C132086ef) r6;
        if (r62 instanceof C132066ed) {
            C132066ed r63 = (C132066ed) r62;
            A08(r63.A03, r63.A00);
            View view = this.A0H;
            int A04 = AnonymousClass0Y8.A04(view.getContext(), R.color.f5nameremoved);
            AvatarProfilePhotoImageView avatarProfilePhotoImageView = this.A01;
            avatarProfilePhotoImageView.setAvatarPoseBackgroundColor(A04);
            avatarProfilePhotoImageView.setImageBitmap(r63.A01);
            C109705f3.A00(view, r7, r63, 12);
            String str = r63.A02;
            if (str != null) {
                Context context = view.getContext();
                if (TextUtils.isEmpty(str)) {
                    A0X = context.getString(R.string.f11nameremoved);
                } else {
                    A0X = AnonymousClass0x2.A0X(context, str, 1, R.string.f11nameremoved);
                }
                avatarProfilePhotoImageView.setContentDescription(A0X);
            }
        } else if (r62 instanceof C132076ee) {
            C132076ee r64 = (C132076ee) r62;
            View view2 = this.A0H;
            int A042 = AnonymousClass0Y8.A04(view2.getContext(), R.color.f5nameremoved);
            AvatarProfilePhotoImageView avatarProfilePhotoImageView2 = this.A01;
            avatarProfilePhotoImageView2.setAvatarPoseBackgroundColor(A042);
            Integer num = r64.A00;
            if (num != null) {
                A08(r64.A01, num.intValue());
            } else {
                avatarProfilePhotoImageView2.A09();
            }
            view2.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void A08(boolean z, int i) {
        C141496vf r2;
        if (z) {
            r2 = C141496vf.SELECTED;
        } else if (!z) {
            r2 = C141496vf.IDLE;
        } else {
            throw C73153f1.A00();
        }
        AvatarProfilePhotoImageView avatarProfilePhotoImageView = this.A01;
        avatarProfilePhotoImageView.setSelected(z);
        avatarProfilePhotoImageView.A0B(r2, this.A00, i);
    }
}
