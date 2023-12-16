package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4YV  reason: invalid class name */
public class AnonymousClass4YV extends C05570Ua {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;

    public AnonymousClass4YV(View view) {
        super(view);
        this.A01 = C18300x5.A0G(view, R.id.reactions_bottom_sheet_row_primary_text);
        this.A03 = AnonymousClass0x7.A0K(view, R.id.reactions_bottom_sheet_row_emoji);
        this.A02 = C18300x5.A0G(view, R.id.reactions_bottom_sheet_row_secondary_text);
        this.A00 = AnonymousClass0x9.A0E(view, R.id.reactions_bottom_sheet_row_contact_image);
    }
}
