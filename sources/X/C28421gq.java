package X;

import android.net.Uri;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1gq  reason: invalid class name and case insensitive filesystem */
public final class C28421gq extends AnonymousClass6mM {
    public final C111095hX A00;
    public final C69263Wi A01;
    public final TextEmojiLabel A02;
    public final C620633i A03;
    public final AnonymousClass1VX A04;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        Uri parse = Uri.parse("https://faq.whatsapp.com/591394022726343");
        C162457s7.A0D(parse);
        AnonymousClass1VX r7 = this.A04;
        C69263Wi r4 = this.A01;
        String A0l = C18290x4.A0l(this.A0H.getContext(), R.string.f11nameremoved);
        TextEmojiLabel textEmojiLabel = this.A02;
        C111095hX r3 = this.A00;
        C620633i r6 = this.A03;
        C162457s7.A0J(textEmojiLabel, 5);
        C107635bd.A0E(textEmojiLabel.getContext(), parse, r3, r4, textEmojiLabel, r6, r7, A0l, "learn-more");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28421gq(View view, C111095hX r3, C69263Wi r4, C620633i r5, AnonymousClass1VX r6) {
        super(view);
        C18260x0.A0c(r6, r4, r3, r5);
        this.A04 = r6;
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r5;
        this.A02 = (TextEmojiLabel) C18280x3.A0E(view, R.id.privacy_description);
    }
}
