package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4YS  reason: invalid class name */
public class AnonymousClass4YS extends C05570Ua {
    public final ImageView A00;
    public final TextView A01;
    public final TextEmojiLabel A02;

    public AnonymousClass4YS(View view) {
        super(view);
        ImageView A0F = AnonymousClass0x9.A0F(view, R.id.contact_photo);
        this.A00 = A0F;
        A0F.setEnabled(false);
        TextEmojiLabel A0M = C86644Kx.A0M(view, R.id.contact_name);
        this.A02 = A0M;
        C106905aM.A04(A0M);
        this.A01 = AnonymousClass002.A09(view, R.id.date_time);
    }
}
