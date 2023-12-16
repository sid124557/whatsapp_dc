package X;

import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.5O3  reason: invalid class name */
public final class AnonymousClass5O3 {
    public int A00;
    public List A01 = A00();
    public boolean A02 = Locale.getDefault().getLanguage().equals("pt");
    public final C54292oU A03;
    public final AnonymousClass1VX A04;

    public final List A00() {
        boolean z = this.A02;
        AnonymousClass1VX r1 = this.A04;
        int i = 2010;
        if (z) {
            i = 2011;
        }
        List A0O = C175728Zm.A0O(r1.A0Q(i), new char[]{':'});
        ArrayList A0c = C73783g4.A0c(A0O);
        Iterator it = A0O.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(C54292oU.A00(this.A03).getString(R.string.f11nameremoved));
            A0o.append(" \"");
            A0o.append(AnonymousClass0x9.A0B(A0m));
            A0o.append('\"');
            AnonymousClass0x7.A1D(A0o, A0c);
        }
        return A0c;
    }

    public AnonymousClass5O3(C54292oU r3, AnonymousClass1VX r4) {
        C18260x0.A0Q(r3, r4);
        this.A03 = r3;
        this.A04 = r4;
    }
}
