package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.expressionstray.emoji.handler.EmojiHandlerImageView;
import java.lang.ref.SoftReference;

/* renamed from: X.4MZ  reason: invalid class name */
public final class AnonymousClass4MZ extends Handler {
    public final AnonymousClass5MY A00;
    public final C104185Pz A01;

    public void handleMessage(Message message) {
        AnonymousClass5SV r5;
        C162457s7.A0J(message, 0);
        super.handleMessage(message);
        Object obj = message.obj;
        if ((obj instanceof AnonymousClass5SV) && (r5 = (AnonymousClass5SV) obj) != null) {
            Integer num = r5.A03;
            if (num != null) {
                this.A01.A00(num.intValue(), "emoji_image_loaded_handler_start", (String) null);
            }
            long j = r5.A00;
            EmojiHandlerImageView emojiHandlerImageView = r5.A02;
            Drawable drawable = r5.A01;
            if (drawable != null) {
                AnonymousClass5MY r0 = this.A00;
                r0.A00.put(Long.valueOf(j), new SoftReference(drawable));
            }
            if (emojiHandlerImageView != null) {
                Object tag = emojiHandlerImageView.getTag();
                C162457s7.A0K(tag, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                Drawable drawable2 = (Drawable) tag;
                AnonymousClass5MY r1 = this.A00;
                C162457s7.A0J(drawable2, 1);
                r1.A00.put(Long.valueOf(j), new SoftReference(drawable2));
                if (emojiHandlerImageView.A00 == j) {
                    emojiHandlerImageView.A03 = drawable2;
                    emojiHandlerImageView.invalidate();
                }
            }
            if (num != null) {
                C104185Pz r3 = this.A01;
                int intValue = num.intValue();
                r3.A00(intValue, "emoji_image_loaded_handler_end", (String) null);
                r3.A01(C999858y.SUCCESS, intValue);
            }
        }
    }

    public AnonymousClass4MZ(Looper looper, AnonymousClass5MY r2, C104185Pz r3) {
        super(looper);
        this.A00 = r2;
        this.A01 = r3;
    }
}
