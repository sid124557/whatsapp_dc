package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0bE  reason: invalid class name and case insensitive filesystem */
public class C07560bE implements C17080uX, DialogInterface.OnClickListener {
    public ListAdapter A00;
    public AnonymousClass043 A01;
    public CharSequence A02;
    public final /* synthetic */ AppCompatSpinner A03;

    public C07560bE(AppCompatSpinner appCompatSpinner) {
        this.A03 = appCompatSpinner;
    }

    public Drawable B4b() {
        return null;
    }

    public CharSequence B87() {
        return this.A02;
    }

    public int B8A() {
        return 0;
    }

    public int BEF() {
        return 0;
    }

    public boolean BIy() {
        AnonymousClass043 r0 = this.A01;
        if (r0 != null) {
            return r0.isShowing();
        }
        return false;
    }

    public void Bln(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public void BmN(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public void BmO(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public void Bnk(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public void Boe(int i, int i2) {
        if (this.A00 != null) {
            AppCompatSpinner appCompatSpinner = this.A03;
            AnonymousClass0Uj r2 = new AnonymousClass0Uj(appCompatSpinner.A04);
            CharSequence charSequence = this.A02;
            if (charSequence != null) {
                r2.setTitle(charSequence);
            }
            r2.A0F(this, this.A00, appCompatSpinner.getSelectedItemPosition());
            AnonymousClass043 create = r2.create();
            this.A01 = create;
            ListView listView = create.A00.A0J;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.A01.show();
        }
    }

    public void dismiss() {
        AnonymousClass043 r0 = this.A01;
        if (r0 != null) {
            r0.dismiss();
            this.A01 = null;
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.A03;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick((View) null, i, this.A00.getItemId(i));
        }
        dismiss();
    }

    public void Ble(ListAdapter listAdapter) {
        this.A00 = listAdapter;
    }

    public void Bn7(CharSequence charSequence) {
        this.A02 = charSequence;
    }
}
