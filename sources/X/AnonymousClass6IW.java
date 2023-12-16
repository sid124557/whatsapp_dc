package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6IW  reason: invalid class name */
public final class AnonymousClass6IW extends C05570Ua {
    public final TextEmojiLabel A00;
    public final /* synthetic */ AnonymousClass4u4 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6IW(View view, AnonymousClass4u4 r4) {
        super(view);
        this.A01 = r4;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0M(view, R.id.disclaimer_text_view);
        this.A00 = textEmojiLabel;
        textEmojiLabel.setText(R.string.f11nameremoved);
    }
}
