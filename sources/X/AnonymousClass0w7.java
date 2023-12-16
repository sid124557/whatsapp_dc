package X;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;
import com.whatsapp.backup.encryptedbackup.PasswordInputFragment;

/* renamed from: X.0w7  reason: invalid class name */
public class AnonymousClass0w7 implements TextView.OnEditorActionListener {
    public Object A00;
    public final int A01;

    public AnonymousClass0w7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                ((SearchView) obj).A0A();
                return true;
            case 1:
                return EncryptionKeyFragment.A07((EncryptionKeyFragment) obj, i);
            default:
                return PasswordInputFragment.A07((PasswordInputFragment) obj, i);
        }
    }
}
