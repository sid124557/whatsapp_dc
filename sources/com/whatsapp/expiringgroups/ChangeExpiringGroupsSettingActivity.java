package com.whatsapp.expiringgroups;

import X.AnonymousClass0YH;
import X.AnonymousClass31A;
import X.AnonymousClass31C;
import X.AnonymousClass34K;
import X.AnonymousClass36K;
import X.AnonymousClass39V;
import X.AnonymousClass3DZ;
import X.AnonymousClass9NA;
import X.C005205m;
import X.C1001059l;
import X.C106405Yw;
import X.C107695bk;
import X.C162457s7;
import X.C18290x4;
import X.C1899593h;
import X.C197719dl;
import X.C204019og;
import X.C204249p3;
import X.C204369pF;
import X.C56982ss;
import X.C627336j;
import X.C64333Db;
import X.C86604Kt;
import X.C89644eZ;
import X.C95814uZ;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;

public class ChangeExpiringGroupsSettingActivity extends C89644eZ {
    public static final int[][] A08 = {new int[]{-1, R.string.f11nameremoved}, new int[]{0, R.string.f11nameremoved}, new int[]{1, R.string.f11nameremoved}, new int[]{7, R.string.f11nameremoved}, new int[]{30, R.string.f11nameremoved}};
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass31A A03;
    public C56982ss A04;
    public C197719dl A05;
    public AnonymousClass31C A06;
    public boolean A07;

    public void A5r() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            this.A04 = (C56982ss) A002.A5B.get();
            this.A06 = C64333Db.A5u(A002);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        long j;
        MenuItem menuItem2 = menuItem;
        if (!(menuItem2.getItemId() != 16908332 || this.A02 == -1 || this.A00 == (i = this.A01))) {
            long A0B = C18290x4.A0B(System.currentTimeMillis());
            if (i != 0) {
                if (i == 1) {
                    j = 86400;
                } else if (i == 7) {
                    j = 604800;
                } else if (i != 30) {
                    A0B = -10;
                } else {
                    j = 2592000;
                }
                A0B += j;
            }
            C197719dl r11 = this.A05;
            C95814uZ A052 = this.A03.A05();
            C162457s7.A0J(A052, 0);
            AnonymousClass31C r10 = r11.A01;
            String A032 = r10.A03();
            AnonymousClass36K A0I = AnonymousClass36K.A0I("expire", A0B > 0 ? new AnonymousClass39V[]{new AnonymousClass39V("timestamp", A0B)} : null);
            AnonymousClass39V[] r6 = new AnonymousClass39V[4];
            AnonymousClass39V.A0B("xmlns", "w:g2", r6, 0);
            AnonymousClass39V.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r6);
            r10.A0K(r11, AnonymousClass36K.A0E(A0I, "to", A052.getRawString(), r6), A032, 380, 20000);
            if (A0B == -10) {
                this.A09.A1J(this.A03.A05());
            } else {
                this.A09.A1K(this.A03.A05(), A0B);
            }
        }
        return super.onOptionsItemSelected(menuItem2);
    }

    public ChangeExpiringGroupsSettingActivity(int i) {
        this.A07 = false;
        C204019og.A00(this, 4);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        View A002 = C005205m.A00(this, R.id.ephemeral_image);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C005205m.A00(this, R.id.ephemeral_lottie_animation);
        if (C1001059l.A04) {
            C005205m.A00(this, R.id.ephemeral_illustration).setVisibility(0);
        }
        lottieAnimationView.setAnimation("ephemeral_settings_lottie_animation.lottie");
        lottieAnimationView.setVisibility(0);
        A002.setVisibility(8);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        setTitle(getString(R.string.f11nameremoved));
        Toolbar toolbar = (Toolbar) C005205m.A00(this, R.id.toolbar);
        C86604Kt.A11(this, toolbar, this.A00, R.drawable.ic_back);
        toolbar.setTitle((CharSequence) getString(R.string.f11nameremoved));
        toolbar.setBackgroundResource(AnonymousClass34K.A00(this));
        toolbar.A0J(this, R.style.f12nameremoved);
        toolbar.setNavigationOnClickListener(C204249p3.A00(this, 6));
        setSupportActionBar(toolbar);
        C95814uZ A003 = C106405Yw.A00(this);
        AnonymousClass31A A0A = this.A04.A0A(A003, false);
        this.A03 = A0A;
        if (A0A == null || !C627336j.A0K(A003)) {
            finish();
            return;
        }
        long A0O = this.A09.A0O(A003);
        this.A02 = A0O;
        if (A0O == -1) {
            ((TextView) C005205m.A00(this, R.id.expiring_setting_title)).setText(R.string.f11nameremoved);
            radioGroup.setVisibility(8);
            return;
        }
        this.A00 = -2;
        this.A01 = -2;
        if (bundle != null) {
            this.A01 = bundle.getInt("selected_setting", -2);
        }
        radioGroup.setOnCheckedChangeListener(new C204369pF(this, 2));
        int i = 0;
        while (true) {
            int[][] iArr = A08;
            if (i < iArr.length) {
                int[] iArr2 = iArr[i];
                AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(new ContextThemeWrapper(this, R.style.f12nameremoved));
                appCompatRadioButton.setId(AnonymousClass0YH.A00());
                appCompatRadioButton.setTag(Integer.valueOf(iArr2[0]));
                appCompatRadioButton.setText(iArr2[1]);
                appCompatRadioButton.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
                radioGroup.addView(appCompatRadioButton);
                i++;
            } else {
                this.A05 = new C197719dl(new AnonymousClass9NA(this), this.A06);
                return;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_setting", this.A01);
    }

    public ChangeExpiringGroupsSettingActivity() {
        this(0);
    }
}
