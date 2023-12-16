package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.9EL  reason: invalid class name */
public final class AnonymousClass9EL extends AnonymousClass95T {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02;
    public final WaImageView A03;

    public AnonymousClass9EL(View view) {
        super(view);
        this.A03 = (WaImageView) C18280x3.A0E(view, R.id.banner_icon);
        this.A02 = (TextEmojiLabel) C18280x3.A0E(view, R.id.banner_title);
        this.A01 = (TextEmojiLabel) C18280x3.A0E(view, R.id.banner_subtitle);
        this.A00 = (ImageView) C18280x3.A0E(view, R.id.button_close);
    }
}
