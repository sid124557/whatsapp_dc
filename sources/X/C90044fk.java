package X;

import android.view.View;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoColorView;

/* renamed from: X.4fk  reason: invalid class name and case insensitive filesystem */
public final class C90044fk extends C125616Is {
    public final AvatarProfilePhotoColorView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90044fk(View view) {
        super(view);
        C162457s7.A0J(view, 1);
        this.A00 = (AvatarProfilePhotoColorView) view;
    }

    public void A07(AnonymousClass73X r8, AnonymousClass4GQ r9) {
        C141496vf r0;
        C162457s7.A0J(r8, 0);
        C132096eg r5 = (C132096eg) r8;
        boolean z = r5.A03;
        if (z) {
            r0 = C141496vf.SELECTED;
        } else {
            r0 = C141496vf.IDLE;
        }
        AvatarProfilePhotoColorView avatarProfilePhotoColorView = this.A00;
        int i = r5.A00;
        int i2 = r5.A01;
        C162457s7.A0J(r0, 0);
        avatarProfilePhotoColorView.A00 = r0;
        avatarProfilePhotoColorView.A01.setColor(i);
        avatarProfilePhotoColorView.A02.setColor(i2);
        avatarProfilePhotoColorView.invalidate();
        avatarProfilePhotoColorView.setSelected(z);
        avatarProfilePhotoColorView.setContentDescription(r5.A02);
        C109705f3.A00(this.A0H, r9, r8, 11);
    }
}
