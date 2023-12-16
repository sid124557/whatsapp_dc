package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import androidx.appcompat.widget.SearchView;
import androidx.preference.ListPreference;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;

/* renamed from: X.0MU  reason: invalid class name */
public class AnonymousClass0MU implements AdapterView.OnItemSelectedListener {
    public Object A00;
    public final int A01;

    public AnonymousClass0MU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C002803e r1;
        switch (this.A01) {
            case 0:
                if (i != -1 && (r1 = ((C07540bC) this.A00).A0C) != null) {
                    r1.A0B = false;
                    return;
                }
                return;
            case 1:
                ((SearchView) this.A00).A0F(i);
                return;
            case 2:
                if (i >= 0) {
                    ListPreference listPreference = (ListPreference) this.A00;
                    String charSequence = listPreference.A04[i].toString();
                    if (!charSequence.equals(listPreference.A01)) {
                        C15970sG r0 = listPreference.A0A;
                        if (r0 != null) {
                            r0.BYd(listPreference, charSequence);
                        }
                        listPreference.A0W(charSequence);
                        return;
                    }
                    return;
                }
                return;
            default:
                GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = (GoogleDriveNewUserSetupActivity) this.A00;
                if (googleDriveNewUserSetupActivity.A04.getVisibility() == 0) {
                    googleDriveNewUserSetupActivity.A7K((RadioButton) null, String.valueOf(adapterView.getItemAtPosition(i)));
                    return;
                }
                return;
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
