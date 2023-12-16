package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.4Hg  reason: invalid class name and case insensitive filesystem */
public class C85694Hg implements C84124Bc {
    public Object A00;
    public final int A01;

    public C85694Hg(C89654ea r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void AwC(Object obj, Object obj2) {
        int i = this.A01;
        C89654ea r1 = (C89654ea) this.A00;
        DialogFragment dialogFragment = (DialogFragment) obj;
        if (i != 0) {
            r1.A6V(dialogFragment, (String) null);
        } else {
            r1.Bon(dialogFragment, (String) null);
        }
    }
}
