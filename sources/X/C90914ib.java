package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4ib  reason: invalid class name and case insensitive filesystem */
public final class C90914ib extends C134576jG {
    public final C111095hX A00;
    public final TextEmojiLabel A01;
    public final C620633i A02;
    public final AnonymousClass1VX A03;
    public final C66433Lk A04;
    public final C106625Zs A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90914ib(View view, C111095hX r3, C620633i r4, AnonymousClass1VX r5, C66433Lk r6, C106625Zs r7) {
        super(view);
        C162457s7.A0J(view, 1);
        this.A03 = r5;
        this.A00 = r3;
        this.A02 = r4;
        this.A05 = r7;
        this.A04 = r6;
        this.A01 = C86614Ku.A0M(view, R.id.business_search_hint);
    }

    public /* bridge */ /* synthetic */ void A0D(Object obj, List list) {
        C156137g5 r8 = (C156137g5) obj;
        C162457s7.A0J(r8, 0);
        Context A0T = C86664Kz.A0T(this);
        String A0l = C18290x4.A0l(A0T, R.string.f11nameremoved);
        Object obj2 = r8.A01;
        C162457s7.A0D(obj2);
        if (AnonymousClass001.A1Z(obj2)) {
            A0l = AnonymousClass000.A0V("[Internal] ", A0l, AnonymousClass001.A0o());
        }
        TextEmojiLabel textEmojiLabel = this.A01;
        textEmojiLabel.setText(C106625Zs.A01(A0T, new C117175rV(this, 48, A0T), A0l, "learn-more", C18290x4.A00(A0T)));
        AnonymousClass0x2.A12(textEmojiLabel, this.A02);
        C18270x1.A0q(textEmojiLabel, this.A03);
    }
}
