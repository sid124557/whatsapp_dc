package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4eq  reason: invalid class name and case insensitive filesystem */
public class C89734eq extends WaFrameLayout {
    public final TextEmojiLabel A00 = AnonymousClass0x7.A0K(this, R.id.subtitle);
    public final TextEmojiLabel A01 = AnonymousClass0x7.A0K(this, R.id.header_title);
    public final WaImageView A02 = AnonymousClass0x9.A0L(this, R.id.thumbnail);
    public final WaTextView A03 = AnonymousClass0x7.A0L(this, R.id.surface);

    public C89734eq(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
    }
}
