package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.PeerAvatarLayout;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4Yi  reason: invalid class name and case insensitive filesystem */
public class C88334Yi extends C05570Ua {
    public final View A00;
    public final AnonymousClass5YB A01;
    public final WaTextView A02;
    public final PeerAvatarLayout A03;
    public final AnonymousClass7D5 A04;
    public final ThumbnailButton A05;
    public final C105365Uq A06;
    public final AnonymousClass5UY A07;
    public final WDSButton A08;

    public C88334Yi(View view, AnonymousClass64J r5, AnonymousClass7D5 r6, C105365Uq r7) {
        super(view);
        this.A06 = r7;
        this.A04 = r6;
        this.A00 = C06560Yg.A02(view, R.id.call_row_container);
        this.A05 = C86664Kz.A16(view, R.id.contact_photo);
        this.A02 = AnonymousClass0x7.A0L(view, R.id.ongoing_label);
        this.A08 = C86654Ky.A0f(view, R.id.join_btn);
        PeerAvatarLayout peerAvatarLayout = (PeerAvatarLayout) C06560Yg.A02(view, R.id.peer_avatar_layout);
        this.A03 = peerAvatarLayout;
        peerAvatarLayout.A04 = R.dimen.f6nameremoved;
        peerAvatarLayout.A01 = R.dimen.f6nameremoved;
        peerAvatarLayout.A00 = R.color.f5nameremoved;
        this.A01 = AnonymousClass5YB.A00(view, r5, R.id.call_title);
        this.A07 = AnonymousClass0x2.A0M(view, R.id.joinable_subtitle_stub);
    }
}
