package X;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7ik  reason: invalid class name and case insensitive filesystem */
public final class C157707ik {
    public Account A00;
    public String A01;
    public String A02;
    public String A03;
    public Map A04 = AnonymousClass001.A0t();
    public Set A05 = AnonymousClass002.A0K();
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public GoogleSignInOptions A00() {
        Set set = this.A05;
        if (set.contains(GoogleSignInOptions.A0H)) {
            Scope scope = GoogleSignInOptions.A0G;
            if (set.contains(scope)) {
                set.remove(scope);
            }
        }
        boolean z = this.A08;
        if (z && (this.A00 == null || !set.isEmpty())) {
            set.add(GoogleSignInOptions.A0F);
        }
        ArrayList A0J = AnonymousClass002.A0J(set);
        Account account = this.A00;
        boolean z2 = this.A06;
        boolean z3 = this.A07;
        return new GoogleSignInOptions(account, this.A01, this.A02, this.A03, A0J, this.A04, 3, z, z2, z3);
    }

    public C157707ik(GoogleSignInOptions googleSignInOptions) {
        this.A05 = AnonymousClass0x9.A15(googleSignInOptions.A08);
        this.A06 = googleSignInOptions.A09;
        this.A07 = googleSignInOptions.A0A;
        this.A08 = googleSignInOptions.A06;
        this.A01 = googleSignInOptions.A01;
        this.A00 = googleSignInOptions.A00;
        this.A02 = googleSignInOptions.A02;
        ArrayList arrayList = googleSignInOptions.A04;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass6SC r1 = (AnonymousClass6SC) it.next();
            AnonymousClass0x2.A1H(r1, A0t, r1.A00);
        }
        this.A04 = A0t;
        this.A03 = googleSignInOptions.A03;
    }

    public C157707ik() {
    }
}
