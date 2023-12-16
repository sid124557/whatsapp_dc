package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;

/* renamed from: X.4es  reason: invalid class name and case insensitive filesystem */
public class C89754es extends WaFrameLayout {
    public AnonymousClass1VX A00;
    public boolean A01;
    public final TextEmojiLabel A02;

    public C89754es(Context context) {
        super(context, (AttributeSet) null);
        A03();
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(this, R.id.im_header_title);
        this.A02 = A0K;
        C86964Mo.A00(this.A00, A0K);
    }
}
