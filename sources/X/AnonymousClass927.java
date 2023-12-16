package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

/* renamed from: X.927  reason: invalid class name */
public class AnonymousClass927 implements C1223964f {
    public Object A00;
    public final int A01;

    public AnonymousClass927(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BHb() {
        boolean A0X;
        if (this.A01 != 0) {
            AnonymousClass4U5 r0 = (AnonymousClass4U5) this.A00;
            C157167hq r1 = r0.A0L;
            AnonymousClass5ZO r2 = r0.A0Q.A00.A01;
            AnonymousClass1VX r12 = r1.A00.A03;
            if (r12.A0X(450) && r12.A0X(1882) && r2 != null) {
                A0X = r2.A09();
            }
            return false;
        }
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = (BusinessDirectoryContextualSearchViewModel) this.A00;
        C157167hq r02 = businessDirectoryContextualSearchViewModel.A0U;
        AnonymousClass5ZO A0E = businessDirectoryContextualSearchViewModel.A0E();
        AnonymousClass1VX r13 = r02.A00.A03;
        if (r13.A0X(450) && r13.A0X(1882) && A0E != null && A0E.A09()) {
            AnonymousClass1VX r14 = businessDirectoryContextualSearchViewModel.A0c.A03;
            if (r14.A0X(450)) {
                A0X = r14.A0X(2038);
            }
        }
        return false;
        if (!A0X) {
            return false;
        }
        return true;
    }
}
