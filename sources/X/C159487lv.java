package X;

import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import com.whatsapp.profile.WebImagePicker;
import java.util.ArrayList;

/* renamed from: X.7lv  reason: invalid class name and case insensitive filesystem */
public class C159487lv implements C16510tW {
    public Object A00;
    public final int A01;

    public C159487lv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean BZJ(String str) {
        switch (this.A01) {
            case 0:
                C89104bW r1 = (C89104bW) this.A00;
                r1.A0I = str;
                ArrayList A03 = C107155an.A03(r1.A00, str);
                r1.A0J = A03;
                if (A03.isEmpty()) {
                    r1.A0J = null;
                }
                C89104bW.A0C(r1);
                return false;
            case 1:
                C162457s7.A0J(str, 0);
                CatalogSearchFragment catalogSearchFragment = (CatalogSearchFragment) this.A00;
                ((CatalogSearchViewModel) catalogSearchFragment.A0Q.getValue()).A0F(catalogSearchFragment.A0F, str);
                return true;
            case 2:
                ((GroupAdminPickerActivity) this.A00).A77(str);
                return false;
            case 3:
                ((GroupChangedParticipantsBottomSheet) this.A00).A1Z(str);
                return false;
            default:
                return false;
        }
    }

    public boolean BZK(String str) {
        switch (this.A01) {
            case 1:
                C162457s7.A0J(str, 0);
                ((CatalogSearchFragment) this.A00).A1L(str);
                return true;
            case 4:
                ((WebImagePicker) this.A00).A76();
                return true;
            default:
                return false;
        }
    }
}
