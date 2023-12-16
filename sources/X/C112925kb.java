package X;

import android.content.res.Resources;
import com.whatsapp.R;

/* renamed from: X.5kb  reason: invalid class name and case insensitive filesystem */
public class C112925kb implements AnonymousClass4E6 {
    public final C69263Wi A00;
    public final AnonymousClass5ZU A01;
    public final C54292oU A02;

    public void BUA(AnonymousClass3ZH r8, boolean z) {
        this.A00.A0S(new C117295rh(this, C54292oU.A00(this.A02).getString(R.string.f11nameremoved), 1, 2, z));
    }

    public void BX7(AnonymousClass3ZH r8) {
        this.A00.A0S(new C117295rh(this, C54292oU.A00(this.A02).getString(R.string.f11nameremoved), 0, 2, false));
    }

    public void BfA(AnonymousClass3ZH r10) {
        Resources A002 = C54292oU.A00(this.A02);
        Object[] objArr = new Object[1];
        C18290x4.A1K(this.A01, r10, objArr);
        this.A00.A0S(new C117295rh(this, A002.getString(R.string.f11nameremoved, objArr), 1, 2, false));
    }

    public C112925kb(C69263Wi r1, AnonymousClass5ZU r2, C54292oU r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
