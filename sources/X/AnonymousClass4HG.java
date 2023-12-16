package X;

/* renamed from: X.4HG  reason: invalid class name */
public class AnonymousClass4HG extends C49872hE {
    public Object A00;
    public final int A01 = 0;

    public AnonymousClass4HG(C26701cd r2) {
        this.A00 = r2;
        A02((String) null);
    }

    public boolean A01(String str) {
        if (this.A01 != 0) {
            if (str == null) {
                return false;
            }
            A03(str);
            return true;
        } else if (str == null) {
            return false;
        } else {
            A02(str);
            return true;
        }
    }

    public final void A02(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gif/search/giphy/loading next trending page \"");
        A0o.append(str);
        C18270x1.A1E(A0o, '\"');
        C55922r8 r2 = (C55922r8) this.A00;
        AnonymousClass0x7.A1B(new AnonymousClass4HT(this, r2, str, 0), r2.A0A);
    }

    public final void A03(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gif/search/tenor/loading next trending page \"");
        A0o.append(str);
        C18270x1.A1E(A0o, '\"');
        C55922r8 r2 = (C55922r8) this.A00;
        C18270x1.A0w(new AnonymousClass4HT(this, r2, str, 1), r2.A0A);
    }

    public AnonymousClass4HG(C26711ce r2) {
        this.A00 = r2;
        A03((String) null);
    }
}
