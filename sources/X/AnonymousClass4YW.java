package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4YW  reason: invalid class name */
public class AnonymousClass4YW extends C05570Ua {
    public final Button A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;

    public AnonymousClass4YW(View view) {
        super(view);
        C06560Yg.A0T(view, true);
        this.A03 = C86644Kx.A0M(view, R.id.name);
        this.A02 = AnonymousClass002.A09(view, R.id.description);
        this.A01 = AnonymousClass0x9.A0F(view, R.id.image);
        this.A00 = (Button) view.findViewById(R.id.add_contact_btn);
    }
}
