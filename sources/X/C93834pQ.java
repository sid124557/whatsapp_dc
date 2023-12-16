package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;

/* renamed from: X.4pQ  reason: invalid class name and case insensitive filesystem */
public final class C93834pQ extends C113155ky {
    public final C56982ss A00;
    public final C29041iB A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass5U1 A03;

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.ic_spam_report);
    }

    public String BDk(AnonymousClass66W r5) {
        C624134x r0;
        String string;
        AnonymousClass2z0 r02;
        C162457s7.A0J(r5, 0);
        String B77 = r5.B77();
        Collection BCf = r5.BCf();
        C95814uZ r1 = null;
        if (BCf != null) {
            r0 = C86654Ky.A0b(BCf);
        } else {
            r0 = null;
        }
        if (B77 != null) {
            if (!(r0 == null || (r02 = r0.A1J) == null)) {
                r1 = r02.A00;
            }
            if (C627336j.A0K(r1)) {
                string = AnonymousClass0x2.A0X(r5.getContext(), B77, 1, R.string.f11nameremoved);
                C162457s7.A0D(string);
                return string;
            }
        }
        string = r5.getContext().getString(R.string.f11nameremoved);
        C162457s7.A0D(string);
        return string;
    }

    public boolean B7f() {
        return true;
    }

    public int getId() {
        return 15;
    }

    public C93834pQ(C56982ss r1, C29041iB r2, AnonymousClass1VX r3, AnonymousClass5U1 r4) {
        C18260x0.A0c(r3, r1, r2, r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }
}
