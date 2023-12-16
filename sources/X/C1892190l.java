package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.90l  reason: invalid class name and case insensitive filesystem */
public class C1892190l implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        long j2 = j;
        int i2 = i;
        View view2 = view;
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) obj;
            View findViewById = view.findViewById(R.id.selection_check);
            if (findViewById != null) {
                phoneContactsSelector.A78((C104215Qc) findViewById.getTag());
                return;
            }
            return;
        }
        C125156Fx r1 = (C125156Fx) obj;
        if (i < 0) {
            C07540bC r2 = r1.A06;
            if (!r2.A0B.isShowing()) {
                item = null;
            } else {
                item = r2.A0C.getSelectedItem();
            }
        } else {
            item = r1.getAdapter().getItem(i);
        }
        r1.setText(r1.convertSelectionToString(item), false);
        AdapterView.OnItemClickListener onItemClickListener = r1.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                C07540bC r3 = r1.A06;
                PopupWindow popupWindow = r3.A0B;
                if (!popupWindow.isShowing()) {
                    view2 = null;
                } else {
                    view2 = r3.A0C.getSelectedView();
                }
                if (!popupWindow.isShowing()) {
                    i2 = -1;
                } else {
                    i2 = r3.A0C.getSelectedItemPosition();
                }
                if (!popupWindow.isShowing()) {
                    j2 = Long.MIN_VALUE;
                } else {
                    j2 = r3.A0C.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(r1.A06.A0C, view2, i2, j2);
        }
        r1.A06.dismiss();
    }

    public C1892190l(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
