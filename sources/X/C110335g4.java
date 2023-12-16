package X;

import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import java.util.List;

/* renamed from: X.5g4  reason: invalid class name and case insensitive filesystem */
public class C110335g4 implements C16910uE {
    public MenuItem A00;
    public final /* synthetic */ DocumentPickerActivity A01;

    public C110335g4(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
    }

    public void BQw(AnonymousClass0R2 r3) {
        DocumentPickerActivity documentPickerActivity = this.A01;
        documentPickerActivity.A0Y.clear();
        documentPickerActivity.A05 = null;
        documentPickerActivity.A0J.notifyDataSetChanged();
    }

    public boolean BYg(Menu menu, AnonymousClass0R2 r9) {
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0Y;
        if (list.isEmpty()) {
            r9.A08(R.string.f11nameremoved);
        } else {
            Resources resources = documentPickerActivity.getResources();
            int size = list.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, list.size());
            r9.A0B(resources.getQuantityString(R.plurals.f9nameremoved, size, objArr));
        }
        C86644Kx.A0u(this.A00, list);
        return true;
    }

    public boolean BLz(MenuItem menuItem, AnonymousClass0R2 r5) {
        if (menuItem.getItemId() != R.id.menuitem_share) {
            return false;
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0Y;
        if (list.isEmpty()) {
            return false;
        }
        documentPickerActivity.A7D(list);
        return false;
    }

    public boolean BQL(Menu menu, AnonymousClass0R2 r5) {
        MenuItem add = menu.add(0, R.id.menuitem_share, 0, R.string.f11nameremoved);
        this.A00 = add;
        add.setShowAsAction(2);
        return true;
    }
}
