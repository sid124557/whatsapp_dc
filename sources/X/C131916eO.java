package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.WaImageView;

/* renamed from: X.6eO  reason: invalid class name and case insensitive filesystem */
public final class C131916eO extends WaFrameLayout {
    public final TextEmojiLabel A00 = C86614Ku.A0M(this, R.id.subtitle);
    public final TextEmojiLabel A01 = C86614Ku.A0M(this, R.id.header_title);
    public final WaImageView A02 = ((WaImageView) C18280x3.A0E(this, R.id.thumbnail));

    public C131916eO(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
    }

    public final TextEmojiLabel getSubTitle() {
        return this.A00;
    }

    public final WaImageView getThumbnail() {
        return this.A02;
    }

    public final TextEmojiLabel getTitle() {
        return this.A01;
    }
}
