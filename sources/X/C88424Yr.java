package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.views.MultiContactThumbnail;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4Yr  reason: invalid class name and case insensitive filesystem */
public class C88424Yr extends C05570Ua {
    public C112445jk A00 = null;
    public final View A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass5YB A03;
    public final WaImageView A04;
    public final WaTextView A05;
    public final AnonymousClass7D5 A06;
    public final MultiContactThumbnail A07;
    public final ThumbnailButton A08;
    public final C105365Uq A09;
    public final C105365Uq A0A;
    public final AnonymousClass5UY A0B;

    public C88424Yr(View view, AnonymousClass64J r4, AnonymousClass7D5 r5, C105365Uq r6, C105365Uq r7) {
        super(view);
        this.A09 = r7;
        this.A0A = r6;
        this.A06 = r5;
        this.A01 = C06560Yg.A02(view, R.id.call_row_container);
        this.A08 = C86664Kz.A16(view, R.id.contact_photo);
        this.A07 = (MultiContactThumbnail) C06560Yg.A02(view, R.id.multi_contact_photo);
        this.A02 = AnonymousClass0x7.A0K(view, R.id.joinable_title);
        this.A05 = AnonymousClass0x7.A0L(view, R.id.ongoing_label);
        this.A04 = AnonymousClass0x9.A0L(view, R.id.call_type_icon);
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, r4, R.id.joinable_title);
        this.A03 = A002;
        C106905aM.A04(A002.A02);
        this.A0B = AnonymousClass0x2.A0M(view, R.id.joinable_subtitle_stub);
    }
}
