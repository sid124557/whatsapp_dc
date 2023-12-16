package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4Ye  reason: invalid class name and case insensitive filesystem */
public class C88294Ye extends C05570Ua {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextEmojiLabel A03;
    public TextEmojiLabel A04;
    public AnonymousClass5YB A05;

    public C88294Ye(View view, AnonymousClass64J r4) {
        super(view);
        this.A05 = AnonymousClass5YB.A00(view, r4, R.id.name);
        this.A04 = C86644Kx.A0M(view, R.id.status);
        this.A01 = AnonymousClass0x9.A0F(view, R.id.avatar);
        this.A00 = view.findViewById(R.id.divider);
        this.A02 = AnonymousClass002.A09(view, R.id.invite);
        this.A03 = C86644Kx.A0M(view, R.id.push_name);
        AnonymousClass0YY.A06(this.A01, 2);
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setFocusable(true);
        view.setClickable(true);
    }
}
