package X;

import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.account.delete.DeleteAccountFeedback;

/* renamed from: X.4Hp  reason: invalid class name and case insensitive filesystem */
public class C85784Hp implements C15590rc {
    public Object A00;
    public Object A01;
    public final int A02;

    public C85784Hp(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (this.A02 != 0) {
            C19390zT r1 = (C19390zT) this.A00;
            r1.getActivity().startActivity(new C627736r().A1L(r1.getActivity(), ((C53402n2) this.A01).A03));
            return true;
        }
        DeleteAccountFeedback deleteAccountFeedback = (DeleteAccountFeedback) this.A00;
        deleteAccountFeedback.A01 = menuItem.getItemId();
        ((TextView) this.A01).setText(menuItem.getTitle());
        EditText editText = deleteAccountFeedback.A03;
        int i = deleteAccountFeedback.A01;
        int i2 = R.string.f11nameremoved;
        if (i == 2) {
            i2 = R.string.f11nameremoved;
        }
        editText.setHint(i2);
        return false;
    }
}
