package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.util.List;
import java.util.Objects;

/* renamed from: X.0Zs  reason: invalid class name */
public class AnonymousClass0Zs implements TextWatcher {
    public boolean A00 = false;
    public final C04080Ms A01;
    public final AnonymousClass7S1 A02;
    public final C153427bI A03;
    public final AnonymousClass84O A04;
    public final List A05;

    public void afterTextChanged(Editable editable) {
        C04080Ms r3 = this.A01;
        r3.A0E = editable;
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher afterTextChanged : this.A05) {
                afterTextChanged.afterTextChanged(r3.A0E);
            }
            AnonymousClass84O r4 = this.A04;
            if (r4.A0W(63, false)) {
                C153427bI r2 = this.A03;
                int lineCount = ((TextView) r4.A0G(r2)).getLineCount();
                if (r3.A04 != lineCount) {
                    r3.A04 = lineCount;
                    String obj = r3.A0E.toString();
                    if (C162377rs.A0C(r2)) {
                        AnonymousClass7S1 r0 = this.A02;
                        Objects.requireNonNull(r0);
                        r0.A00().A01(new C147917Gf(new C07670bP(obj), r4.A0C()));
                    } else {
                        C162377rs.A02(r2).A09(r4, new AnonymousClass0D6(this, obj));
                    }
                }
            }
            C835248t A0L = r4.A0L(48);
            if (A0L != null) {
                C152057Xj r02 = new C152057Xj();
                r02.A05(r4, 0);
                C153427bI r1 = this.A03;
                r02.A05(r1, 1);
                C159377lj.A01(r1, r4, r02.A03(), A0L);
            }
            this.A00 = false;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher beforeTextChanged : this.A05) {
                beforeTextChanged.beforeTextChanged(charSequence, i, i2, i3);
            }
            this.A00 = false;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher onTextChanged : this.A05) {
                onTextChanged.onTextChanged(charSequence, i, i2, i3);
            }
            this.A00 = false;
        }
    }

    public AnonymousClass0Zs(AnonymousClass7S1 r2, C153427bI r3, AnonymousClass84O r4) {
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = (C04080Ms) C162377rs.A06(r3, r4);
        this.A05 = AnonymousClass001.A0s();
    }
}
