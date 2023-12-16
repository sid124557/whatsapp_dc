package X;

import android.text.Editable;
import com.whatsapp.components.PhoneNumberEntry;

/* renamed from: X.68G  reason: invalid class name */
public class AnonymousClass68G extends C109145e9 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68G(int i, String str, Object obj) {
        super(str);
        this.A01 = i;
        this.A00 = obj;
    }

    public synchronized void afterTextChanged(Editable editable) {
        if (this.A01 != 0) {
            super.afterTextChanged(editable);
            return;
        }
        synchronized (this) {
            super.afterTextChanged(editable);
            C151457Uw r0 = ((PhoneNumberEntry) this.A00).A04;
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (1 - this.A01 != 0) {
            super.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        super.onTextChanged(charSequence, i, i2, i3);
        C105245Ud r3 = (C105245Ud) this.A00;
        r3.A04.setVisibility(8);
        r3.A05.setError((CharSequence) null);
        C112815kQ r4 = r3.A09;
        r4.A00();
        r3.A0A.A00();
        if (!r3.A07(charSequence) && C107195ar.A00(r3.A06, r3.A00(), r3.A03()) == 1) {
            String A012 = r3.A01();
            r4.A02 = A012;
            r4.A07.A00();
            C992454z r1 = new C992454z(r4.A04, r4.A06, r4, A012);
            r4.A00 = r1;
            C18270x1.A0w(r1, r4.A0A);
        }
    }
}
