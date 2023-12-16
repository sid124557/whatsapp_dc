package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaImageView;

/* renamed from: X.6eN  reason: invalid class name and case insensitive filesystem */
public class C131906eN extends WaFrameLayout {
    public final TextEmojiLabel A00 = ((TextEmojiLabel) C06560Yg.A02(this, R.id.items_count));
    public final TextEmojiLabel A01 = ((TextEmojiLabel) C06560Yg.A02(this, R.id.header_title));
    public final WaImageView A02 = ((WaImageView) C06560Yg.A02(this, R.id.thumbnail));

    public C131906eN(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
    }
}
