package X;

import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.widget.SearchView;
import androidx.preference.SeekBarPreference;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;

/* renamed from: X.0wp  reason: invalid class name and case insensitive filesystem */
public class C18150wp implements View.OnKeyListener {
    public Object A00;
    public final int A01;

    public C18150wp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        switch (this.A01) {
            case 0:
                SearchView searchView = (SearchView) this.A00;
                if (searchView.A02 == null) {
                    return false;
                }
                SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
                if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                    if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                        return false;
                    }
                    view.cancelLongPress();
                    searchView.A0I(searchAutoComplete.getText().toString());
                    return true;
                } else if (searchView.A02 == null || searchView.A0E == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                } else {
                    if (i == 66 || i == 84 || i == 61) {
                        return searchView.A0M(searchAutoComplete.getListSelection());
                    }
                    int i2 = 0;
                    if (i != 21) {
                        if (i == 22) {
                            i2 = searchAutoComplete.length();
                        } else if (i != 19) {
                            return false;
                        } else {
                            searchAutoComplete.getListSelection();
                            return false;
                        }
                    }
                    searchAutoComplete.setSelection(i2);
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.A00();
                    return true;
                }
            case 1:
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.A00;
                if ((!seekBarPreference.A08 && (i == 21 || i == 22)) || i == 23 || i == 66) {
                    return false;
                }
                SeekBar seekBar = seekBarPreference.A06;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            default:
                return ((EncryptionKeyFragment) this.A00).A05(i, keyEvent);
        }
    }
}
