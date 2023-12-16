package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8Ww  reason: invalid class name and case insensitive filesystem */
public final class C175048Ww extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ AnonymousClass64J $textEmojiLabelViewControllerFactory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175048Ww(View view, AnonymousClass64J r3) {
        super(0);
        this.$textEmojiLabelViewControllerFactory = r3;
        this.$itemView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass5YB Azt = this.$textEmojiLabelViewControllerFactory.Azt(this.$itemView.getContext(), (TextEmojiLabel) C06560Yg.A02(this.$itemView, R.id.contact_name));
        Azt.A02.setSingleLine(true);
        return Azt;
    }
}
