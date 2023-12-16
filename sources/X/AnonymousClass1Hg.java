package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaImageView;

/* renamed from: X.1Hg  reason: invalid class name */
public class AnonymousClass1Hg extends WaFrameLayout {
    public final View A00 = C06560Yg.A02(this, R.id.title_quantity_container);
    public final TextEmojiLabel A01 = AnonymousClass0x7.A0K(this, R.id.additional_note);
    public final TextEmojiLabel A02 = AnonymousClass0x7.A0K(this, R.id.paid_amount);
    public final TextEmojiLabel A03 = AnonymousClass0x7.A0K(this, R.id.total_price);
    public final TextEmojiLabel A04 = AnonymousClass0x7.A0K(this, R.id.quantity);
    public final TextEmojiLabel A05 = AnonymousClass0x7.A0K(this, R.id.reference_id);
    public final TextEmojiLabel A06 = AnonymousClass0x7.A0K(this, R.id.header_title);
    public final WaImageView A07 = AnonymousClass0x9.A0L(this, R.id.thumbnail);
    public final AnonymousClass5UY A08 = AnonymousClass0x2.A0M(this, R.id.status_container);
    public final AnonymousClass5UY A09 = AnonymousClass0x2.A0M(this, R.id.hidden_pay_info_view);

    public AnonymousClass1Hg(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
    }
}
