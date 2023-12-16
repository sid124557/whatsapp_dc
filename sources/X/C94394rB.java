package X;

import android.graphics.Paint;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.expressionstray.emoji.view.EmojiImageView;

/* renamed from: X.4rB  reason: invalid class name and case insensitive filesystem */
public final class C94394rB extends AnonymousClass4Xn {
    public final EmojiImageView A00;
    public final AnonymousClass5OY A01;
    public final AnonymousClass4GR A02;
    public final AnonymousClass4GR A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94394rB(Paint paint, View view, AnonymousClass5OY r5, AnonymousClass4GR r6, AnonymousClass4GR r7) {
        super(view);
        C18260x0.A0f(view, paint, r5, r6, r7);
        this.A01 = r5;
        this.A03 = r6;
        this.A02 = r7;
        View findViewById = view.findViewById(R.id.emoji);
        EmojiImageView emojiImageView = (EmojiImageView) findViewById;
        emojiImageView.A01 = paint;
        C162457s7.A0D(findViewById);
        this.A00 = emojiImageView;
    }
}
