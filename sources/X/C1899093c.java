package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.93c  reason: invalid class name and case insensitive filesystem */
public class C1899093c implements C182448oQ {
    public Object A00;
    public final int A01;

    public C1899093c(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BpD(DialogFragment dialogFragment) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            ((C89654ea) obj).Boo(dialogFragment);
            return;
        }
        C003203q r1 = ((C114825nf) obj).A04;
        if (!C621433s.A03(r1)) {
            AnonymousClass344.A00(dialogFragment, r1.getSupportFragmentManager());
        }
    }
}
