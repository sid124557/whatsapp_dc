package com.whatsapp.backup.encryptedbackup;

import X.C08310eF;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;

public class EncryptionKeyDisplayFragment extends WaFragment {
    public RelativeLayout A00;
    public EncBackupViewModel A01;

    public boolean A1A(MenuItem menuItem) {
        this.A00.setBackgroundResource(R.drawable.enc_backup_enc_key_bg);
        if (menuItem.getItemId() != 0) {
            return true;
        }
        this.A01.A0H();
        return true;
    }

    public void A1I() {
        this.A00.setBackgroundResource(R.drawable.enc_backup_enc_key_bg);
    }

    public void A0w(Bundle bundle, View view) {
        this.A01 = (EncBackupViewModel) C08310eF.A0B(this);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, R.string.f11nameremoved);
        this.A00.setBackgroundResource(R.drawable.enc_backup_enc_key_bg_pressed);
    }
}
