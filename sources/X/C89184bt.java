package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

/* renamed from: X.4bt  reason: invalid class name and case insensitive filesystem */
public class C89184bt extends C88964bF {
    public C105275Ug A00;
    public AnonymousClass310 A01;
    public C620633i A02;
    public C51072jE A03;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00.A01(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onResume() {
        super.onResume();
        if (!this.A03.A02() && this.A03.A00() != 2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("settings/resume/wrong-state ");
            C18260x0.A1G(A0o, this.A03.A00());
            AnonymousClass4SG.A36(this);
        }
        if (Build.VERSION.SDK_INT < 23 || !this.A00.A07()) {
            this.A00.A03(false);
            return;
        }
        Intent className = C18320x8.A07().setClassName(getPackageName(), "com.whatsapp.authentication.AppAuthenticationActivity");
        className.setFlags(AnonymousClass35S.A0F);
        if (!this.A09) {
            this.A04 = className;
            this.A07 = 202;
        } else {
            startActivityForResult(className, 202);
        }
        overridePendingTransition(0, 0);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }
}
