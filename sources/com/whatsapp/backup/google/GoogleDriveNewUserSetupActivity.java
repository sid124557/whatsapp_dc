package com.whatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass00M;
import X.AnonymousClass0Dk;
import X.AnonymousClass0MU;
import X.AnonymousClass0YV;
import X.AnonymousClass33S;
import X.AnonymousClass34K;
import X.C07030aD;
import X.C111095hX;
import X.C11500jk;
import X.C116985rC;
import X.C131666dx;
import X.C17760wC;
import X.C18180ws;
import X.C61072zf;
import X.C620633i;
import X.C626936e;
import android.content.ActivityNotFoundException;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.whatsapp.R;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.util.Log;
import java.util.List;

public final class GoogleDriveNewUserSetupActivity extends AnonymousClass0Dk {
    public int A00 = -1;
    public View A01;
    public Button A02;
    public RadioGroup A03;
    public AppCompatSpinner A04;
    public C116985rC A05;
    public AnonymousClass33S A06;
    public List A07;
    public RadioButton[] A08;
    public final ViewTreeObserver.OnGlobalLayoutListener A09 = new C18180ws(this, 5);

    public final void A7K(RadioButton radioButton, String str) {
        int i = 2;
        String.format("gdrive-new-user-setup/freq-option-changed item:%s radioBtn:%s", new Object[]{str, radioButton});
        if (getString(R.string.f11nameremoved).equals(str)) {
            i = 1;
        } else if (!getString(R.string.f11nameremoved).equals(str)) {
            if (getString(R.string.f11nameremoved).equals(str)) {
                i = 3;
            } else if (getString(R.string.f11nameremoved).equals(str)) {
                i = 0;
            } else {
                Log.i(AnonymousClass000.A0V("gdrive-new-user-setup/create/unexpected-backup-frequency/", str, AnonymousClass001.A0o()));
                i = -1;
            }
        }
        int i2 = this.A00;
        this.A00 = i;
        if (radioButton != null) {
            A7J();
            radioButton.toggle();
            radioButton.getText();
            this.A04.setSelection(this.A07.indexOf(radioButton.getText().toString()));
        }
        A7L(true);
        if ((i2 == -1 || i2 == 0 || this.A09.A0X() == null) && i != 0 && i != -1) {
            this.A01.performClick();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A0X() {
        String A0X = this.A09.A0X();
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0YV.A0E("gdrive-new-user-setup/done-clicked account is ", A0X, A0o);
        A0o.append(" and backup frequency is ");
        Log.i(AnonymousClass000.A0h(A0o, this.A00));
        int i = this.A00;
        if (i == -1) {
            Log.i(String.format("gdrive-new-user-setup/done-clicked/show-toast \"%s\"", new Object[]{getString(R.string.f11nameremoved)}));
            this.A05.A0H(R.string.f11nameremoved, 1);
        } else if (i == 0 || A0X != null) {
            Log.i("gdrive-new-user-setup/done-clicked/setup-finished");
            this.A09.A2L(this.A00);
            this.A04.BkM(new C11500jk(this));
            setResult(-1);
            finish();
        } else {
            Log.i("gdrive-new-user-setup/done-clicked/show-account-selector");
            A76();
        }
    }

    public final void A7I() {
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        int dimensionPixelSize = point.x - getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        for (RadioButton width : this.A08) {
            width.setWidth(dimensionPixelSize);
        }
    }

    public final void A7J() {
        this.A03.clearCheck();
        this.A04.setSelection(this.A07.size() - 1, true);
    }

    public final void A7L(boolean z) {
        int i;
        if (this.A02 == null) {
            Log.e("gdrive-new-user-setup/update-setup-btn/setup-btn-is-null");
            return;
        }
        C131666dx r3 = new C131666dx(getResources().getDrawable(R.drawable.chevron), this.A00);
        if (z) {
            this.A02.setTextColor(getResources().getColor(AnonymousClass34K.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved)));
            r3.setColorFilter(getResources().getColor(AnonymousClass34K.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved)), PorterDuff.Mode.SRC_ATOP);
            i = 255;
        } else {
            int color = getResources().getColor(R.color.f5nameremoved);
            this.A02.setTextColor(color);
            r3.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
            i = color >>> 24;
        }
        r3.setAlpha(i);
        boolean A0T = this.A00.A0T();
        Button button = this.A02;
        if (A0T) {
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, r3, (Drawable) null);
        } else {
            button.setCompoundDrawablesWithIntrinsicBounds(r3, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void BRA(int i) {
        if (i == 14) {
            this.A00 = 0;
            this.A02.performClick();
            return;
        }
        super.BRA(i);
    }

    public int A74() {
        if (C61072zf.A01()) {
            return R.string.f11nameremoved;
        }
        return R.string.f11nameremoved;
    }

    public void A75() {
        super.A75();
        if (this.A00 != 0) {
            A7L(false);
            A7J();
            this.A00 = -1;
        }
    }

    public void onBackPressed() {
        try {
            C111095hX.A06(this);
        } catch (ActivityNotFoundException e) {
            Log.e("gdrive-new-user-setup/back-pressed", e);
            this.A05.A0H(R.string.f11nameremoved, 1);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        List list;
        int i;
        super.onConfigurationChanged(configuration);
        A7I();
        int i2 = this.A00;
        if (i2 == 0) {
            list = this.A07;
            i = R.string.f11nameremoved;
        } else if (i2 == 1) {
            list = this.A07;
            i = R.string.f11nameremoved;
        } else if (i2 != 2) {
            if (i2 == 3) {
                list = this.A07;
                i = R.string.f11nameremoved;
            }
            A7J();
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A09);
        } else {
            list = this.A07;
            i = R.string.f11nameremoved;
        }
        int indexOf = list.indexOf(getString(i));
        if (indexOf >= 0) {
            RadioButton radioButton = this.A08[indexOf];
            radioButton.toggle();
            radioButton.getText();
            this.A04.setSelection(this.A07.indexOf(radioButton.getText().toString()));
            this.A04.setSelection(indexOf);
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A09);
        }
        A7J();
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A09);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A0F.A0o()) {
            Log.i("gdrive-new-user-setup/create no need to display GoogleDriveNewUserSetupActivity, exiting.");
            setResult(-1);
            finish();
            return;
        }
        setTitle(R.string.f11nameremoved);
        getSupportActionBar().A0N(false);
        findViewById(R.id.settings_gdrive_backup_info_box).setVisibility(8);
        findViewById(R.id.settings_gdrive_gdrive_category_title).setVisibility(8);
        findViewById(R.id.settings_gdrive_change_frequency_view).setVisibility(8);
        findViewById(R.id.settings_gdrive_network_settings_view).setVisibility(8);
        findViewById(R.id.include_video_settings_summary).setVisibility(8);
        findViewById(R.id.gdrive_new_user_setup_message).setVisibility(0);
        findViewById(R.id.gdrive_new_user_setup_select_frequency_message).setVisibility(0);
        TextView textView = (TextView) findViewById(R.id.gdrive_new_user_setup_footer_info);
        Object[] objArr = new Object[3];
        AnonymousClass00M.A04(this, R.string.f11nameremoved, 0, objArr);
        objArr[1] = getString(R.string.f11nameremoved);
        objArr[2] = getString(R.string.f11nameremoved);
        AnonymousClass001.A0y(this, textView, objArr, R.string.f11nameremoved);
        textView.setVisibility(0);
        findViewById(R.id.backup_settings_icon).setVisibility(0);
        TextView textView2 = (TextView) findViewById(R.id.settings_gdrive_backup_now_category_title);
        textView2.setVisibility(0);
        textView2.setText(R.string.f11nameremoved);
        ((TextView) findViewById(R.id.settings_gdrive_change_account_title)).setText(R.string.f11nameremoved);
        this.A01 = findViewById(R.id.settings_gdrive_change_account_view);
        this.A03 = (RadioGroup) findViewById(R.id.gdrive_new_user_setup_freq_options);
        this.A07 = AnonymousClass001.A0s();
        for (int i : SettingsGoogleDriveViewModel.A0a) {
            if (!(i == R.string.f11nameremoved || i == R.string.f11nameremoved)) {
                this.A07.add(getString(i));
            }
        }
        this.A07.add(getString(R.string.f11nameremoved));
        this.A07.add(getString(R.string.f11nameremoved));
        this.A03.setVisibility(0);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, this.A07);
        arrayAdapter.setDropDownViewResource(17367049);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) findViewById(R.id.gdrive_new_user_setup_freq_options_spinner);
        this.A04 = appCompatSpinner;
        appCompatSpinner.setAdapter(arrayAdapter);
        this.A04.setSelection(AnonymousClass002.A04(this.A07, 1));
        this.A04.setOnItemSelectedListener(new AnonymousClass0MU(this, 3));
        LayoutInflater A002 = C620633i.A00(this);
        C626936e.A06(A002);
        this.A08 = new RadioButton[AnonymousClass002.A04(this.A07, 1)];
        this.A03.addView(A002.inflate(R.layout.f8nameremoved, (ViewGroup) null));
        for (int i2 = 0; i2 < this.A08.length; i2++) {
            String A0n = AnonymousClass001.A0n(this.A07, i2);
            RadioButton radioButton = (RadioButton) A002.inflate(R.layout.f8nameremoved, (ViewGroup) null);
            radioButton.setText(A0n);
            this.A03.addView(radioButton);
            this.A03.addView(A002.inflate(R.layout.f8nameremoved, (ViewGroup) null));
            this.A08[i2] = radioButton;
            radioButton.setOnClickListener(new C07030aD(radioButton, this, A0n));
        }
        A7I();
        Button button = (Button) findViewById(R.id.gdrive_new_user_setup_btn);
        this.A02 = button;
        button.setVisibility(0);
        A7L(false);
        C17760wC.A00(this.A02, this, 11);
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A09);
    }
}
