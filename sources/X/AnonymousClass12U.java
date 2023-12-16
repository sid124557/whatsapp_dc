package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.12U  reason: invalid class name */
public final class AnonymousClass12U extends C05570Ua {
    public final TextEmojiLabel A00;
    public final /* synthetic */ AnonymousClass4X7 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass12U(View view, C111095hX r12, C620633i r13, AnonymousClass4X7 r14, C106715a2 r15) {
        super(view);
        this.A01 = r14;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0M(view, R.id.disclaimer_text_view);
        this.A00 = textEmojiLabel;
        AnonymousClass0x2.A14(textEmojiLabel.getAbProps(), textEmojiLabel);
        AnonymousClass0x2.A12(textEmojiLabel, r13);
        C106715a2 r4 = r15;
        textEmojiLabel.setText(r4.A06(textEmojiLabel.getContext(), new C70343aL(r12, textEmojiLabel, r14, 33), textEmojiLabel.getContext().getString(R.string.f11nameremoved), "", AnonymousClass5Yj.A02(textEmojiLabel.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
    }
}
