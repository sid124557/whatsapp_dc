package X;

import android.view.View;
import android.widget.RadioButton;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6In  reason: invalid class name and case insensitive filesystem */
public final class C125566In extends C05570Ua {
    public final RadioButton A00;
    public final TextEmojiLabel A01;
    public final C54292oU A02;
    public final C620733j A03;

    public C125566In(View view, C54292oU r3, C620733j r4) {
        super(view);
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = C86614Ku.A0M(view, R.id.installment_amount);
        this.A00 = (RadioButton) C18280x3.A0E(view, R.id.installment_radio_button);
    }
}
