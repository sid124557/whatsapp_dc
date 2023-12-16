package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.95O  reason: invalid class name */
public class AnonymousClass95O extends C05570Ua {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final C54722pB A03;

    public AnonymousClass95O(View view, C54722pB r3) {
        super(view);
        this.A01 = AnonymousClass0x9.A0F(view, R.id.provider_icon);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.bank_name);
        this.A00 = view.findViewById(R.id.divider);
        this.A03 = r3;
    }
}
