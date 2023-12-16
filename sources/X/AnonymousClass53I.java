package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.status.ContactStatusThumbnail;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.53I  reason: invalid class name */
public final class AnonymousClass53I extends C987553c {
    public ImageView A00;
    public final View A01;
    public final ViewStub A02;
    public final TextEmojiLabel A03;
    public final ContactStatusThumbnail A04;
    public final C103295Mi A05;
    public final UpdatesFragment A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass53I(View view, AnonymousClass5UX r13, C105365Uq r14, C103295Mi r15, UpdatesFragment updatesFragment, C112765kG r17) {
        super(view, r13, r14, (AnonymousClass5C9) null, r17, (C102705Jy) null, (AnonymousClass5JX) null);
        C18260x0.A0d(view, r14, r13, r15);
        this.A05 = r15;
        this.A06 = updatesFragment;
        ContactStatusThumbnail contactStatusThumbnail = (ContactStatusThumbnail) view.findViewById(R.id.contact_thumbnail);
        this.A04 = contactStatusThumbnail;
        this.A02 = C86664Kz.A0n(view, R.id.status_badge_stub);
        this.A03 = C86644Kx.A0M(view, R.id.contact_name);
        this.A07 = r15.A00.A0X(6512);
        C109395eY.A00(contactStatusThumbnail, this, 12);
        this.A01 = C18290x4.A0M(view, R.id.badge_click_surface);
    }
}
