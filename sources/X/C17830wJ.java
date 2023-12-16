package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0wJ  reason: invalid class name and case insensitive filesystem */
public class C17830wJ implements AdapterView.OnItemClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C17830wJ(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.A02;
        Object obj = this.A00;
        if (i2 != 0) {
            C003704e r3 = (C003704e) obj;
            AppCompatSpinner appCompatSpinner = r3.A04;
            appCompatSpinner.setSelection(i);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(view, i, r3.A01.getItemId(i));
            }
            r3.dismiss();
            return;
        }
        C04070Mr r32 = (C04070Mr) obj;
        DialogInterface.OnClickListener onClickListener = r32.A05;
        AnonymousClass00Q r1 = ((C06200Wq) this.A01).A0W;
        onClickListener.onClick(r1, i);
        if (!r32.A0L) {
            r1.dismiss();
        }
    }
}
