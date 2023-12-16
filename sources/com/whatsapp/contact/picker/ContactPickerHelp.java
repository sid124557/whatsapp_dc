package com.whatsapp.contact.picker;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C64333Db;
import X.C69973Zj;
import X.C89644eZ;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;

public class ContactPickerHelp extends C89644eZ {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public ContactPickerHelp(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 48);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        AnonymousClass1Ha.A1z(this);
        setContentView((int) R.layout.f8nameremoved);
        findViewById(R.id.scroll_view).post(new C69973Zj(this, 15));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public ContactPickerHelp() {
        this(0);
    }
}
