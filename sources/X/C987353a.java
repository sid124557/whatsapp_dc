package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.53a  reason: invalid class name and case insensitive filesystem */
public final class C987353a extends C88504Yz {
    public AnonymousClass534 A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass5YB A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final C105365Uq A05;
    public final AnonymousClass5QQ A06;
    public final UpdatesFragment A07;
    public final AnonymousClass5UY A08;
    public final WDSProfilePhoto A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C987353a(View view, AnonymousClass64J r6, C105365Uq r7, AnonymousClass5QQ r8, UpdatesFragment updatesFragment) {
        super(view);
        C18260x0.A0b(r7, r8, r6, 3);
        this.A07 = updatesFragment;
        this.A05 = r7;
        this.A06 = r8;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0M(view, R.id.newsletter_name);
        this.A01 = textEmojiLabel;
        this.A04 = (WaTextView) C18290x4.A0M(view, R.id.newsletter_follow_count);
        WaImageView waImageView = (WaImageView) C18290x4.A0M(view, R.id.quick_follow_icon);
        this.A03 = waImageView;
        this.A09 = (WDSProfilePhoto) C18290x4.A0M(view, R.id.newsletter_directory_photo);
        this.A08 = C18290x4.A0X(view, R.id.quick_follow_progressBar_container);
        this.A02 = AnonymousClass5YB.A00(view, r6, R.id.newsletter_name);
        C109395eY.A00(view, this, 6);
        C109395eY.A00(waImageView, this, 7);
        C106905aM.A04(textEmojiLabel);
    }
}
