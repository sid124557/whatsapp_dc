package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;
import java.util.Collection;

/* renamed from: X.2pL  reason: invalid class name and case insensitive filesystem */
public final class C54822pL {
    public final C55682qk A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass3LS A02;
    public final C183538qC A03;
    public final AnonymousClass66R A04;

    public final boolean A02(C624134x r4) {
        C162457s7.A0J(r4, 0);
        Iterable<C84624Db> iterable = (Iterable) C18300x5.A0b(this.A03);
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (C84624Db BIi : iterable) {
                if (!BIi.BIi(r4)) {
                    return false;
                }
            }
        }
        if (A01(r4)) {
            return true;
        }
        return false;
    }

    public final boolean A03(C624134x r4) {
        C162457s7.A0J(r4, 0);
        if (!this.A01.A0Y(C58422vE.A02, 4072) || !((C53662nS) this.A04.getValue()).A04(r4.A1I)) {
            return false;
        }
        return true;
    }

    public final boolean A01(C624134x r4) {
        AnonymousClass66R r2 = this.A04;
        byte b = r4.A1I;
        if (((C53662nS) r2.getValue()).A04(b)) {
            ((C53662nS) r2.getValue()).A02(b);
            return false;
        } else if (b == 0) {
            return !C57932uR.A00(r4);
        } else {
            return true;
        }
    }

    public C54822pL(C55682qk r2, AnonymousClass1VX r3, C46422bb r4, AnonymousClass3LS r5, C183538qC r6) {
        C18260x0.A0f(r4, r3, r2, r6, r5);
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = C154517dI.A01(new C79503wj(r4));
    }

    public final void A00(View view, C624134x r7) {
        C18260x0.A0O(r7, view);
        if (!A03(r7)) {
            this.A00.A0A("reply-subsytem-render-not-supported", false, String.valueOf(r7.A1I));
            return;
        }
        byte b = r7.A1I;
        new TextEmojiLabel(view.getContext());
        ((AnonymousClass3N2) ((C53662nS) this.A04.getValue()).A02(b)).A00.A0A("reply-not-supported-rendering", false, String.valueOf(b));
    }
}
