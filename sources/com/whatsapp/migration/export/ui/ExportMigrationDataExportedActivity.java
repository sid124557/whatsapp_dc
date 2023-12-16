package com.whatsapp.migration.export.ui;

import X.AnonymousClass0AQ;
import X.AnonymousClass0Uj;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C005205m;
import X.C18290x4;
import X.C19340zH;
import X.C56582sE;
import X.C626936e;
import X.C64333Db;
import X.C85804Hr;
import X.C89654ea;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public class ExportMigrationDataExportedActivity extends C89654ea {
    public C56582sE A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            AnonymousClass1Hf.A2F(A002, this);
            this.A00 = (C56582sE) A002.A9S.get();
        }
    }

    public ExportMigrationDataExportedActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 79);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(getString(R.string.f11nameremoved));
        AnonymousClass1Hf.A2E(this);
        TextView A012 = C005205m.A01(this, R.id.export_migrate_title);
        TextView A013 = C005205m.A01(this, R.id.export_migrate_sub_title);
        TextView A014 = C005205m.A01(this, R.id.export_migrate_main_action);
        View A002 = C005205m.A00(this, R.id.export_migrate_sub_action);
        A014.setVisibility(0);
        A014.setText(R.string.f11nameremoved);
        A002.setVisibility(8);
        AnonymousClass0AQ A03 = AnonymousClass0AQ.A03((Resources.Theme) null, getResources(), R.drawable.vec_android_to_ios_in_progress);
        C626936e.A07(A03, "ExportMigrationDataExportedActivity/getVectorDrawable/drawableId is invalid");
        ((ImageView) C005205m.A00(this, R.id.export_migrate_image_view)).setImageDrawable(A03);
        C18290x4.A1F(A014, this, 49);
        A012.setText(R.string.f11nameremoved);
        A013.setText(R.string.f11nameremoved);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19340zH A002 = C19340zH.A00(this, getString(R.string.f11nameremoved));
        String string = getString(R.string.f11nameremoved);
        AnonymousClass0Uj r3 = A002.A00;
        r3.A0I((DialogInterface.OnClickListener) null, string);
        r3.A0G(new C85804Hr(this, 70), getString(R.string.f11nameremoved));
        A002.A0S();
        return true;
    }

    public ExportMigrationDataExportedActivity() {
        this(0);
    }
}
