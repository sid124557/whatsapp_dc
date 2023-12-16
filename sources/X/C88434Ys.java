package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.4Ys  reason: invalid class name and case insensitive filesystem */
public class C88434Ys extends C05570Ua {
    public final ViewGroup A00;
    public final ImageView A01;
    public final C56972sr A02;
    public final C54042o5 A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final AnonymousClass5YB A06;
    public final WaTextView A07;
    public final AnonymousClass5UX A08;
    public final AnonymousClass5ZU A09;
    public final C105365Uq A0A;
    public final C27991fJ A0B;

    public C88434Ys(View view, C56972sr r4, C54042o5 r5, AnonymousClass64J r6, AnonymousClass5UX r7, AnonymousClass5ZU r8, C105365Uq r9, C27991fJ r10) {
        super(view);
        this.A03 = r5;
        this.A02 = r4;
        this.A08 = r7;
        this.A09 = r8;
        this.A0A = r9;
        this.A0B = r10;
        this.A00 = C86644Kx.A0I(view, R.id.group_chat_info_row_container);
        C06560Yg.A02(view, R.id.group_chat_info_layout).setBackground((Drawable) null);
        this.A01 = AnonymousClass0x9.A0E(view, R.id.avatar);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view, R.id.name);
        this.A07 = AnonymousClass0x7.A0L(view, R.id.owner);
        this.A05 = AnonymousClass0x7.A0K(view, R.id.status);
        this.A04 = AnonymousClass0x7.A0K(view, R.id.secondary_name_view);
        this.A06 = r6.Azt(view.getContext(), A0K);
    }
}
