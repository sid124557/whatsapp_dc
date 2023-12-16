package X;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.95S  reason: invalid class name */
public class AnonymousClass95S extends C05570Ua {
    public final View A00;
    public final View A01;
    public final RadioButton A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final WaImageView A06;
    public final AnonymousClass5UY A07;

    public AnonymousClass95S(View view, C620633i r6, AnonymousClass1VX r7) {
        super(view);
        this.A04 = AnonymousClass0x7.A0K(view, R.id.payment_title);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view, R.id.payment_subtitle);
        this.A03 = A0K;
        AnonymousClass0x2.A12(A0K, r6);
        AnonymousClass0x2.A14(r7, A0K);
        this.A06 = AnonymousClass0x9.A0L(view, R.id.payment_option_icon);
        this.A02 = (RadioButton) C06560Yg.A02(view, R.id.payment_radio_button);
        this.A01 = C06560Yg.A02(view, R.id.payment_secure_badge);
        TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(view, R.id.secure_text_content);
        this.A05 = A0K2;
        AnonymousClass0x2.A12(A0K2, r6);
        AnonymousClass0x2.A14(r7, A0K2);
        AnonymousClass5UY A0M = AnonymousClass0x2.A0M(view, R.id.hidden_installment_content);
        this.A07 = A0M;
        ((TextEmojiLabel) A0M.A04()).setAccessibilityHelper(new AnonymousClass4TJ((TextView) A0M.A04(), r6));
        AnonymousClass0x2.A14(r7, (TextEmojiLabel) A0M.A04());
        this.A00 = C06560Yg.A02(view, R.id.payment_option_icon_wrapper);
    }
}
