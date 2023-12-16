package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass366;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass677;
import X.C005205m;
import X.C107695bk;
import X.C32511r1;
import X.C64333Db;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import com.whatsapp.R;

public class DefaultWallpaperPreview extends C32511r1 {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A01 = C64333Db.A26(A002);
            this.A02 = C64333Db.A28(A002);
        }
    }

    public DefaultWallpaperPreview(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 116);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ImageView) C005205m.A00(this, R.id.wallpaper_preview_default_view)).setImageDrawable(AnonymousClass366.A02(this, getResources()));
        ((WallpaperMockChatView) C005205m.A00(this, R.id.wallpaper_preview_default_chat_view)).setMessages(getString(R.string.f11nameremoved), A75(), (AnonymousClass677) null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }

    public DefaultWallpaperPreview() {
        this(0);
    }
}
