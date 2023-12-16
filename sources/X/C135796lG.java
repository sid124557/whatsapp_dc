package X;

import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

/* renamed from: X.6lG  reason: invalid class name and case insensitive filesystem */
public class C135796lG extends C88074Xf {
    public final /* synthetic */ BusinessDirectoryContextualSearchFragment A00;

    public C135796lG(BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        this.A00 = businessDirectoryContextualSearchFragment;
    }

    public int A06() {
        if (this.A00.A09.A0W.A05 == 0) {
            return 14;
        }
        return 5;
    }

    public void A07() {
        this.A00.A09.A0K();
    }

    public boolean A08() {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A00.A09;
        if (businessDirectoryContextualSearchViewModel.A04 != 1 || !businessDirectoryContextualSearchViewModel.A0a.A0A()) {
            return false;
        }
        return true;
    }
}
