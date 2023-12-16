package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.5Jm  reason: invalid class name and case insensitive filesystem */
public class C102605Jm {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final SelectionCheckView A04;

    public C102605Jm(View view) {
        this.A00 = view;
        this.A01 = AnonymousClass0x9.A0F(view, R.id.contactpicker_row_photo);
        TextEmojiLabel A0M = C86644Kx.A0M(view, R.id.name);
        this.A02 = A0M;
        AnonymousClass0YY.A06(A0M, 2);
        C106905aM.A04(A0M);
        this.A04 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A03 = C86644Kx.A0M(view, R.id.phone_number);
    }
}
