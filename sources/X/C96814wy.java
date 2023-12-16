package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4wy  reason: invalid class name and case insensitive filesystem */
public final class C96814wy extends C96754ws {
    public TextEmojiLabel A00;
    public final C620733j A01;

    public void A0A(C96334wC r4) {
        C162457s7.A0J(r4, 0);
        super.A09(r4);
        this.A00.setText(C162307rf.A06(C620733j.A02(this.A01), String.valueOf(A01() + 1)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96814wy(View view, C620733j r3, AnonymousClass1VX r4, AnonymousClass2HH r5) {
        super(view, r4, r5);
        C18260x0.A0V(r4, r5, r3);
        this.A01 = r3;
        this.A00 = C86614Ku.A0M(view, R.id.business_rank);
    }
}
