package X;

import android.content.Context;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel;
import java.util.Map;

/* renamed from: X.90d  reason: invalid class name and case insensitive filesystem */
public class C1891390d implements C182768ox {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1891390d(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void Bag(Context context) {
        if (this.A02 != 0) {
            BusinessDirectoryPopularApiBusinessesViewModel businessDirectoryPopularApiBusinessesViewModel = (BusinessDirectoryPopularApiBusinessesViewModel) this.A00;
            C109065e1 r1 = (C109065e1) this.A01;
            C162457s7.A0J(r1, 1);
            businessDirectoryPopularApiBusinessesViewModel.A01.A09((Integer) null, C18290x4.A0c(), (Map) null, 13, 90, 1);
            businessDirectoryPopularApiBusinessesViewModel.A03.A00(context, r1);
            return;
        }
        AnonymousClass7KR r3 = (AnonymousClass7KR) this.A00;
        C109065e1 r2 = (C109065e1) this.A01;
        C162457s7.A0J(r2, 1);
        r3.A01.A00(C111095hX.A02(context), r2);
        r3.A02.A0G(r2);
    }
}
