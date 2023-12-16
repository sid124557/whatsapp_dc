package com.whatsapp.insufficientstoragespace;

import X.AnonymousClass002;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1YO;
import X.AnonymousClass297;
import X.AnonymousClass35V;
import X.AnonymousClass3DZ;
import X.AnonymousClass4FV;
import X.AnonymousClass4HY;
import X.AnonymousClass5Q6;
import X.C005205m;
import X.C107695bk;
import X.C109455ee;
import X.C111095hX;
import X.C18320x8;
import X.C635439q;
import X.C64333Db;
import X.C89644eZ;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Locale;

public class InsufficientStorageSpaceActivity extends C89644eZ {
    public long A00;
    public ScrollView A01;
    public AnonymousClass4FV A02;
    public AnonymousClass5Q6 A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A02 = C64333Db.A4H(A002);
        }
    }

    public InsufficientStorageSpaceActivity(int i) {
        this.A04 = false;
        AnonymousClass4HY.A00(this, 73);
    }

    public void A6s() {
    }

    public void onBackPressed() {
        C111095hX.A06(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A03.A00();
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        int i;
        int i2;
        String A0b;
        View.OnClickListener r1;
        super.onCreate(bundle);
        String A002 = AnonymousClass297.A00(this.A02, 6);
        setContentView((int) R.layout.f8nameremoved);
        Log.d("InsufficientStorageSpaceActivity/create");
        this.A01 = (ScrollView) findViewById(R.id.insufficient_storage_scroll_view);
        TextView A012 = C005205m.A01(this, R.id.btn_storage_settings);
        TextView A013 = C005205m.A01(this, R.id.insufficient_storage_title_textview);
        TextView A014 = C005205m.A01(this, R.id.insufficient_storage_description_textview);
        long longExtra = getIntent().getLongExtra("spaceNeededInBytes", -1);
        this.A00 = longExtra;
        long A032 = (longExtra - this.A07.A03()) + SearchActionVerificationClientService.MS_TO_NS;
        if (getIntent() == null || !getIntent().getBooleanExtra("allowSkipKey", false)) {
            z = false;
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
            A0b = C18320x8.A0b(getResources(), AnonymousClass35V.A03(this.A00, A032), new Object[1], 0, R.string.f11nameremoved);
        } else {
            z = true;
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
            A0b = getResources().getString(R.string.f11nameremoved);
        }
        A013.setText(i2);
        A014.setText(A0b);
        A012.setText(i);
        if (z) {
            r1 = new C109455ee(8, A002, this);
        } else {
            r1 = new C635439q((Object) this, 48);
        }
        A012.setOnClickListener(r1);
        if (z) {
            View findViewById = findViewById(R.id.btn_skip_storage_settings);
            findViewById.setVisibility(0);
            C635439q.A00(findViewById, this, 49);
        }
        AnonymousClass5Q6 r0 = new AnonymousClass5Q6(this.A01, findViewById(R.id.bottom_button_container), AnonymousClass1Ha.A1i(this));
        this.A03 = r0;
        r0.A00();
    }

    public void onResume() {
        super.onResume();
        long A032 = this.A07.A03();
        Locale locale = Locale.ENGLISH;
        Object[] A0M = AnonymousClass002.A0M();
        boolean z = false;
        A0M[0] = Long.valueOf(A032);
        A0M[1] = Long.valueOf(this.A00);
        C18320x8.A1J("insufficient-storage-activity/internal-storage available: %,d required: %,d", locale, A0M);
        if (A032 > this.A00) {
            Log.i("insufficient-storage-activity/space-available/finishing-the-activity");
            if (this.A00 > 0) {
                AnonymousClass1YO r2 = new AnonymousClass1YO();
                r2.A02 = Long.valueOf(this.A00);
                if (findViewById(R.id.btn_skip_storage_settings).getVisibility() == 0) {
                    z = true;
                }
                r2.A00 = Boolean.valueOf(z);
                r2.A01 = 1;
                this.A02.BhB(r2);
            }
            finish();
        }
    }

    public InsufficientStorageSpaceActivity() {
        this(0);
    }
}
