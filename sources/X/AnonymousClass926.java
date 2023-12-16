package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

/* renamed from: X.926  reason: invalid class name */
public class AnonymousClass926 implements C181998nh {
    public Object A00;
    public final int A01;

    public AnonymousClass926(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BII() {
        AnonymousClass5ZO A0E;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            A0E = ((AnonymousClass4U5) obj).A0Q.A00.A01;
        } else {
            A0E = ((BusinessDirectoryContextualSearchViewModel) obj).A0E();
        }
        return C157167hq.A00(A0E);
    }
}
