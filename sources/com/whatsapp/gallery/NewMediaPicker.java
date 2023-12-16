package com.whatsapp.gallery;

import X.AnonymousClass0R2;
import X.AnonymousClass5Yj;
import X.C107405bG;
import X.C162457s7;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.gallerypicker.MediaPicker;

public final class NewMediaPicker extends MediaPicker {
    public void Bdi(AnonymousClass0R2 r3) {
        C162457s7.A0J(r3, 0);
        super.Bdi(r3);
        C107405bG.A07(this, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && (i == 1 || i == 36)) {
            setResult(-1, intent);
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }
}
