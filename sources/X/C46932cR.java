package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2cR  reason: invalid class name and case insensitive filesystem */
public final class C46932cR {
    public final C111095hX A00;
    public final C105275Ug A01;
    public final C620633i A02;
    public final C54292oU A03;
    public final AnonymousClass1VX A04;
    public final C66433Lk A05;
    public final C106625Zs A06;

    public final void A00(TextEmojiLabel textEmojiLabel, AnonymousClass2FE r8) {
        int i;
        C162457s7.A0J(textEmojiLabel, 0);
        Context A0F = C18290x4.A0F(textEmojiLabel);
        C54292oU r4 = this.A03;
        C105275Ug r3 = this.A01;
        if (!r3.A06() || !this.A04.A0Y(C58422vE.A02, 5337)) {
            boolean A062 = r3.A06();
            i = R.string.f11nameremoved;
            if (A062) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
        }
        textEmojiLabel.setText(C106625Zs.A01(A0F, new C71653cS(this, 13, r8), C54292oU.A04(r4, i), "learn-more", AnonymousClass0x2.A05(textEmojiLabel)));
        AnonymousClass0x2.A12(textEmojiLabel, this.A02);
        C18270x1.A0q(textEmojiLabel, this.A04);
    }

    public C46932cR(C111095hX r1, C105275Ug r2, C620633i r3, C54292oU r4, AnonymousClass1VX r5, C66433Lk r6, C106625Zs r7) {
        C18260x0.A0f(r5, r4, r1, r2, r7);
        C18260x0.A0U(r3, r6);
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
    }
}
