package X;

/* renamed from: X.4HF  reason: invalid class name */
public class AnonymousClass4HF extends C49872hE {
    public Object A00;
    public Object A01;
    public final int A02 = 0;

    public AnonymousClass4HF(C26701cd r2, CharSequence charSequence) {
        this.A00 = r2;
        this.A01 = charSequence;
        A02((String) null);
    }

    public boolean A01(String str) {
        if (this.A02 != 0) {
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
        A0o.append("gif/search/giphy/loading next search page \"");
        A0o.append(str);
        C18270x1.A1E(A0o, '\"');
        C26701cd r3 = (C26701cd) this.A00;
        AnonymousClass0x7.A1B(new AnonymousClass4HE(this, r3, (CharSequence) this.A01, str), r3.A0A);
    }

    public final void A03(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gif/search/tenor/loading next search page \"");
        A0o.append(str);
        C18270x1.A1E(A0o, '\"');
        C26711ce r3 = (C26711ce) this.A00;
        AnonymousClass0x7.A1B(new AnonymousClass4HE(this, r3, (CharSequence) this.A01, str), r3.A0A);
    }

    public AnonymousClass4HF(C26711ce r2, CharSequence charSequence) {
        this.A00 = r2;
        this.A01 = charSequence;
        A03((String) null);
    }
}
