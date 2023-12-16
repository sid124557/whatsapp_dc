package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;

/* renamed from: X.4er  reason: invalid class name and case insensitive filesystem */
public final class C89744er extends WaFrameLayout {
    public final TextEmojiLabel A00 = C86614Ku.A0M(this, R.id.subtitle);
    public final TextEmojiLabel A01 = C86614Ku.A0M(this, R.id.header_title);

    public C89744er(Context context) {
        super(context, (AttributeSet) null, 0);
        C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
    }

    public final TextEmojiLabel getSubTitle() {
        return this.A00;
    }

    public final TextEmojiLabel getTitle() {
        return this.A01;
    }
}
