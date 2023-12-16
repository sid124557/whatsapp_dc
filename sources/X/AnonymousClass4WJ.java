package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel;
import java.util.List;

/* renamed from: X.4WJ  reason: invalid class name */
public final class AnonymousClass4WJ extends AnonymousClass0R6 {
    public final BonsaiPromptsViewModel A00;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        View inflate = C86604Kt.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0K(inflate, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
        return new AnonymousClass6IQ((TextEmojiLabel) inflate, this);
    }

    public int A0G() {
        return C86614Ku.A06(this.A00.A05);
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        String A0b;
        AnonymousClass6IQ r82 = (AnonymousClass6IQ) r8;
        C162457s7.A0J(r82, 0);
        C51142jL r5 = (C51142jL) C86634Kw.A0w(this.A00.A05, i);
        String str = r5.A00;
        if (str.length() == 0) {
            A0b = r5.A01;
        } else {
            A0b = C18320x8.A0b(r82.A0H.getResources(), r5.A01, C18310x6.A1b(str, 0), 1, R.string.f11nameremoved);
            C162457s7.A0H(A0b);
        }
        C109695f2 r2 = new C109695f2(this, i, 1);
        C162457s7.A0J(A0b, 0);
        TextEmojiLabel textEmojiLabel = r82.A00;
        textEmojiLabel.A0K((List) null, A0b);
        textEmojiLabel.setOnClickListener(r2);
    }

    public AnonymousClass4WJ(C15910sA r4, BonsaiPromptsViewModel bonsaiPromptsViewModel) {
        this.A00 = bonsaiPromptsViewModel;
        C86604Kt.A1N(r4, bonsaiPromptsViewModel.A05, new C121265zw(this), 64);
    }
}
