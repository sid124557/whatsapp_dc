package com.whatsapp.contextualhelp;

import X.AnonymousClass1Fp;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107335b8;
import X.C107695bk;
import X.C64333Db;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;

public class ContextualHelpActivity extends WaInAppBrowsingActivity {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            AnonymousClass1Fp.A0C(A002, r0, this);
        }
    }

    public ContextualHelpActivity(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 49);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f10nameremoved, menu);
        MenuItem findItem = menu.findItem(R.id.menu_more);
        findItem.setIcon(C107335b8.A0B(findItem.getIcon(), getResources().getColor(R.color.f5nameremoved)));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_open_in_browser) {
            return false;
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getIntent().getStringExtra("webview_url"))));
        return true;
    }

    public ContextualHelpActivity() {
        this(0);
    }
}
