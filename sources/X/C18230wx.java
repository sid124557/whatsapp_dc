package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;

/* renamed from: X.0wx  reason: invalid class name and case insensitive filesystem */
public class C18230wx implements NoCopySpan, TextWatcher {
    public Object A00;
    public final int A01;

    public C18230wx(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A01 != 0) {
            ((PasswordInputFragment) this.A00).A1L();
            return;
        }
        SearchView searchView = (SearchView) this.A00;
        Editable text = searchView.A0k.getText();
        searchView.A0H = text;
        boolean z = !TextUtils.isEmpty(text);
        searchView.A0J(z);
        boolean z2 = !z;
        int i4 = 8;
        if (searchView.A0P && !searchView.A0L() && z2) {
            searchView.A0g.setVisibility(8);
            i4 = 0;
        }
        searchView.A0i.setVisibility(i4);
        searchView.A0C();
        searchView.A0E();
        if (searchView.A0B != null && !TextUtils.equals(charSequence, searchView.A0F)) {
            searchView.A0B.BZJ(charSequence.toString());
        }
        searchView.A0F = charSequence.toString();
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
