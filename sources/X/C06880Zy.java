package X;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.backup.encryptedbackup.EncryptionKeyFragment;

/* renamed from: X.0Zy  reason: invalid class name and case insensitive filesystem */
public class C06880Zy implements ActionMode.Callback {
    public final /* synthetic */ EncryptionKeyFragment A00;

    public C06880Zy(EncryptionKeyFragment encryptionKeyFragment) {
        this.A00 = encryptionKeyFragment;
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        menu.removeItem(16908355);
        return false;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 16908322 && itemId != 16908337) {
            return false;
        }
        EncryptionKeyFragment encryptionKeyFragment = this.A00;
        encryptionKeyFragment.A01.A0K();
        encryptionKeyFragment.A1L((String) encryptionKeyFragment.A01.A02.A07());
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
    }
}
