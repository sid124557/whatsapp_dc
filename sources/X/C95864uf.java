package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4uf  reason: invalid class name and case insensitive filesystem */
public class C95864uf extends AnonymousClass6J3 {
    public AnonymousClass3ZH A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final /* synthetic */ C111445i6 A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95864uf(View view, C111445i6 r4) {
        super(view, r4);
        this.A06 = r4;
        this.A04 = C86644Kx.A0M(view, R.id.name);
        this.A02 = AnonymousClass002.A09(view, R.id.status);
        this.A03 = AnonymousClass002.A09(view, R.id.time_left);
        ImageView A0F = AnonymousClass0x9.A0F(view, R.id.avatar);
        this.A01 = A0F;
        this.A05 = C86644Kx.A0M(view, R.id.push_name);
        AnonymousClass0YY.A06(A0F, 2);
    }

    public void A07(AnonymousClass3ZH r14, C54942pX r15) {
        TextView textView;
        String A0F;
        this.A00 = r14;
        C18310x6.A19(this.A0H, this, r15, 24);
        C111445i6 r7 = this.A06;
        C56612sH r10 = r7.A1A;
        long A0H = r10.A0H();
        if (this.A00.equals(C56972sr.A01(r7.A0z))) {
            this.A04.setText(R.string.f11nameremoved);
            C989653x.A00(this.A02, this, 4);
            long A042 = r7.A1J.A04(r7.A0c) - A0H;
            if (A042 >= 0) {
                String A0C = C107565bW.A0C(r7.A1C, A042);
                TextView textView2 = this.A03;
                textView2.setText(A0C);
                textView2.setVisibility(0);
            } else {
                textView = this.A03;
                textView.setVisibility(8);
            }
        } else {
            TextEmojiLabel textEmojiLabel = this.A04;
            AnonymousClass5ZU r8 = r7.A17;
            textEmojiLabel.A0K((List) null, r8.A0H(this.A00));
            long j = r15.A05;
            if (A0H - j < 60000) {
                A0F = r7.A0E.getString(R.string.f11nameremoved);
            } else {
                A0F = AnonymousClass002.A0F(r7.A0E, C107145am.A00(r7.A1C, r10.A0I(j)), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
            }
            this.A02.setText(A0F);
            boolean A0e = r8.A0e(this.A00, -1);
            TextEmojiLabel textEmojiLabel2 = this.A05;
            textView = textEmojiLabel2;
            if (A0e) {
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel2.A0K((List) null, AnonymousClass5ZU.A03(r8, this.A00));
            }
            textView.setVisibility(8);
        }
        r7.A0b.A0A(this.A01, this.A00, false);
    }
}
