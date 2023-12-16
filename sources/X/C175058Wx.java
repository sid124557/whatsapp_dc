package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8Wx  reason: invalid class name and case insensitive filesystem */
public final class C175058Wx extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ AnonymousClass64J $textEmojiLabelViewControllerFactory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175058Wx(View view, AnonymousClass64J r3) {
        super(0);
        this.$textEmojiLabelViewControllerFactory = r3;
        this.$itemView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass5YB A00 = AnonymousClass5YB.A00(this.$itemView, this.$textEmojiLabelViewControllerFactory, R.id.contact_name);
        TextEmojiLabel textEmojiLabel = A00.A02;
        C106905aM.A04(textEmojiLabel);
        textEmojiLabel.setSingleLine(true);
        return A00;
    }
}
