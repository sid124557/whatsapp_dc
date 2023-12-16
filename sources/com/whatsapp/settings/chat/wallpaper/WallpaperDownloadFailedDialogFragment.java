package com.whatsapp.settings.chat.wallpaper;

import X.C18300x5;
import X.C19340zH;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class WallpaperDownloadFailedDialogFragment extends Hilt_WallpaperDownloadFailedDialogFragment {
    public Dialog A1J(Bundle bundle) {
        int i = A0H().getInt("ERROR_STATE_KEY");
        C19340zH A0L = C18300x5.A0L(this);
        A0L.A0B(R.string.f11nameremoved);
        int i2 = R.string.f11nameremoved;
        if (i == 5) {
            i2 = R.string.f11nameremoved;
        }
        A0L.A0A(i2);
        A0L.setPositiveButton(R.string.f11nameremoved, (DialogInterface.OnClickListener) null);
        A0L.A0R(false);
        return A0L.create();
    }
}
