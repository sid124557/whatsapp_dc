package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.expressionstray.emoji.handler.EmojiHandlerImageView;

/* renamed from: X.4Mb  reason: invalid class name and case insensitive filesystem */
public final class C86844Mb extends Handler {
    public final Context A00;
    public final AnonymousClass5Y0 A01;
    public final AnonymousClass4MZ A02;
    public final C104185Pz A03;

    public void handleMessage(Message message) {
        long j;
        EmojiHandlerImageView emojiHandlerImageView;
        C157857j0 r5;
        Message obtain;
        AnonymousClass5SW r2;
        Message message2 = message;
        C162457s7.A0J(message2, 0);
        super.handleMessage(message2);
        Object obj = message2.obj;
        Integer num = null;
        if (!(obj instanceof AnonymousClass5SW) || (r2 = (AnonymousClass5SW) obj) == null) {
            j = -1;
            emojiHandlerImageView = null;
            r5 = null;
        } else {
            emojiHandlerImageView = r2.A02;
            r5 = r2.A01;
            j = r2.A00;
            num = r2.A03;
            if (num != null) {
                this.A03.A00(num.intValue(), "emoji_image_loading_handler_start", (String) null);
            }
        }
        AnonymousClass5Y0 r3 = this.A01;
        Resources resources = this.A00.getResources();
        C162457s7.A0H(r5);
        Drawable A04 = r3.A04(resources, r5, 0.6f, j);
        if (emojiHandlerImageView != null) {
            emojiHandlerImageView.setTag(A04);
            obtain = Message.obtain(this.A02, 0, 0, 0, new AnonymousClass5SV((Drawable) null, emojiHandlerImageView, num, j));
        } else {
            obtain = Message.obtain(this.A02, 1, 0, 0, new AnonymousClass5SV(A04, (EmojiHandlerImageView) null, num, j));
        }
        obtain.sendToTarget();
        if (num != null) {
            this.A03.A00(num.intValue(), "emoji_image_loading_handler_end", (String) null);
        }
    }

    public C86844Mb(Context context, Looper looper, AnonymousClass5Y0 r3, AnonymousClass4MZ r4, C104185Pz r5) {
        super(looper);
        this.A01 = r3;
        this.A00 = context;
        this.A02 = r4;
        this.A03 = r5;
    }
}
