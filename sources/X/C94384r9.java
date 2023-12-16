package X;

import android.graphics.Paint;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.expressionstray.emoji.handler.EmojiHandlerImageView;

/* renamed from: X.4r9  reason: invalid class name and case insensitive filesystem */
public final class C94384r9 extends AnonymousClass4Xn {
    public final EmojiHandlerImageView A00;
    public final AnonymousClass4GR A01;
    public final AnonymousClass4GR A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94384r9(Paint paint, View view, AnonymousClass4GR r5, AnonymousClass4GR r6) {
        super(view);
        C18260x0.A0c(view, paint, r5, r6);
        this.A02 = r5;
        this.A01 = r6;
        View findViewById = view.findViewById(R.id.emoji_handler);
        EmojiHandlerImageView emojiHandlerImageView = (EmojiHandlerImageView) findViewById;
        emojiHandlerImageView.A01 = paint;
        C162457s7.A0D(findViewById);
        this.A00 = emojiHandlerImageView;
    }
}
