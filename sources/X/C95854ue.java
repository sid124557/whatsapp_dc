package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4ue  reason: invalid class name and case insensitive filesystem */
public class C95854ue extends AnonymousClass6J3 {
    public AnonymousClass3ZH A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final /* synthetic */ C111445i6 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95854ue(View view, C111445i6 r4) {
        super(view, r4);
        this.A04 = r4;
        this.A02 = C86644Kx.A0M(view, R.id.name);
        ImageView A0F = AnonymousClass0x9.A0F(view, R.id.avatar);
        this.A01 = A0F;
        this.A03 = C86644Kx.A0M(view, R.id.push_name);
        AnonymousClass0YY.A06(A0F, 2);
    }

    public void A07(AnonymousClass3ZH r9, C54942pX r10) {
        this.A00 = r9;
        C18310x6.A19(this.A0H, this, r10, 25);
        AnonymousClass3ZH r1 = this.A00;
        C111445i6 r5 = this.A04;
        boolean equals = r1.equals(C56972sr.A01(r5.A0z));
        TextEmojiLabel textEmojiLabel = this.A02;
        if (equals) {
            textEmojiLabel.setText(R.string.f11nameremoved);
            String A0C = C107565bW.A0C(r5.A1C, r5.A1J.A04(r5.A0c) - r5.A1A.A0H());
            TextEmojiLabel textEmojiLabel2 = this.A03;
            textEmojiLabel2.setText(A0C);
            textEmojiLabel2.setVisibility(0);
        } else {
            AnonymousClass5ZU r3 = r5.A17;
            textEmojiLabel.A0K((List) null, r3.A0H(this.A00));
            boolean A0e = r3.A0e(this.A00, -1);
            TextEmojiLabel textEmojiLabel3 = this.A03;
            if (A0e) {
                textEmojiLabel3.setVisibility(0);
                textEmojiLabel3.A0K((List) null, AnonymousClass5ZU.A03(r3, this.A00));
            } else {
                textEmojiLabel3.setVisibility(8);
            }
        }
        r5.A0b.A0A(this.A01, this.A00, false);
    }
}
