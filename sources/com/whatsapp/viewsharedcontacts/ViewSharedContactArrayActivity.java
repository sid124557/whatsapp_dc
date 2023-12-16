package com.whatsapp.viewsharedcontacts;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass2z0;
import X.AnonymousClass4SG;
import X.AnonymousClass55W;
import X.AnonymousClass5I7;
import X.AnonymousClass5JZ;
import X.AnonymousClass5TD;
import X.AnonymousClass5U6;
import X.AnonymousClass5ZU;
import X.AnonymousClass68W;
import X.C105055Tk;
import X.C105365Uq;
import X.C105975Xd;
import X.C106175Xx;
import X.C106405Yw;
import X.C106705a1;
import X.C107695bk;
import X.C109395eY;
import X.C114015mM;
import X.C1230066r;
import X.C18270x1;
import X.C187958y5;
import X.C54292oU;
import X.C55832qz;
import X.C620733j;
import X.C621033m;
import X.C627636p;
import X.C64333Db;
import X.C64773Ex;
import X.C66543Lv;
import X.C86604Kt;
import X.C86614Ku;
import X.C86644Kx;
import X.C86654Ky;
import X.C88324Yh;
import X.C89644eZ;
import X.C95814uZ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class ViewSharedContactArrayActivity extends C89644eZ {
    public C106175Xx A00;
    public C621033m A01;
    public C1230066r A02;
    public C64773Ex A03;
    public C105975Xd A04;
    public AnonymousClass5ZU A05;
    public C105365Uq A06;
    public C114015mM A07;
    public AnonymousClass5U6 A08;
    public C54292oU A09;
    public C620733j A0A;
    public C66543Lv A0B;
    public C95814uZ A0C;
    public C55832qz A0D;
    public C105055Tk A0E;
    public C187958y5 A0F;
    public AnonymousClass5TD A0G;
    public List A0H;
    public Pattern A0I;
    public C106705a1 A0J;
    public boolean A0K;
    public boolean A0L;
    public final ArrayList A0M;
    public final ArrayList A0N;
    public final ArrayList A0O;
    public final List A0P;

    public static /* synthetic */ void A0X(C88324Yh r4, ViewSharedContactArrayActivity viewSharedContactArrayActivity, String str, String str2, int i, int i2, boolean z) {
        TextView textView = r4.A07;
        if (i2 > 1) {
            textView.setMaxLines(i2);
            textView.setSingleLine(false);
        } else {
            textView.setSingleLine(true);
        }
        textView.setTextDirection(3);
        if (!str.equalsIgnoreCase("null")) {
            textView.setText(str);
        }
        if (str2 == null || str2.equalsIgnoreCase("null")) {
            r4.A06.setText(R.string.f11nameremoved);
        } else {
            r4.A06.setText(str2);
        }
        r4.A03.setImageResource(i);
        if (viewSharedContactArrayActivity.A0L) {
            CheckBox checkBox = r4.A02;
            checkBox.setChecked(z);
            checkBox.setClickable(false);
            checkBox.setVisibility(0);
            C109395eY.A00(r4.A00, viewSharedContactArrayActivity, 44);
        }
    }

    public final String A74(Class cls, int i) {
        try {
            Method method = cls.getMethod("getTypeLabelResource", new Class[]{Integer.TYPE});
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, i, 0);
            return this.A0A.A0C(((Integer) method.invoke((Object) null, objArr)).intValue());
        } catch (Exception e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    public static final void A0L(C88324Yh r3) {
        r3.A01.setClickable(false);
        ImageView imageView = r3.A04;
        imageView.setVisibility(8);
        imageView.setClickable(false);
        ImageView imageView2 = r3.A05;
        imageView2.setVisibility(8);
        imageView2.setClickable(false);
    }

    public void A5r() {
        if (!this.A0K) {
            this.A0K = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A09 = C64333Db.A2q(A2Y);
            this.A01 = C64333Db.A08(A2Y);
            this.A0G = (AnonymousClass5TD) A2Y.AZi.get();
            this.A02 = C86644Kx.A0Q(A2Y);
            this.A07 = C64333Db.A29(A2Y);
            this.A03 = C64333Db.A26(A2Y);
            this.A05 = C64333Db.A28(A2Y);
            this.A0A = C64333Db.A2t(A2Y);
            this.A0F = C86614Ku.A0o(A2Y);
            this.A0B = C86614Ku.A0Z(A2Y);
            this.A0D = C64333Db.A8F(A2Y);
            this.A00 = C86604Kt.A0N(A2Y);
            this.A04 = (C105975Xd) r1.AAt.get();
            this.A0E = C86614Ku.A0k(A2Y);
            this.A08 = C107695bk.A15(r1);
        }
    }

    public ViewSharedContactArrayActivity(int i) {
        this.A0K = false;
        AnonymousClass68W.A00(this, 114);
    }

    public static final AnonymousClass5I7 A0C(SparseArray sparseArray, int i) {
        AnonymousClass5I7 r0 = (AnonymousClass5I7) sparseArray.get(i);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass5I7 r02 = new AnonymousClass5I7();
        sparseArray.put(i, r02);
        return r02;
    }

    public void A6O(int i) {
        if (i == R.string.f11nameremoved) {
            finish();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1 && this.A0J != null) {
                if (intent == null || intent.getData() == null) {
                    str = null;
                } else {
                    str = intent.getData().getLastPathSegment();
                }
                this.A04.A02(this.A0J.A03(), str, this.A0O, this.A0P);
            }
            this.A0E.A00();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
        }
        setContentView((int) R.layout.f8nameremoved);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("vcard");
        AnonymousClass2z0 A0A2 = C627636p.A0A(intent.getBundleExtra("vcard_message"));
        List stringArrayListExtra = intent.getStringArrayListExtra("vcard_array");
        Uri uri = (Uri) intent.getParcelableExtra("vcard_uri");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("vcard_sender_infos");
        if (stringExtra != null) {
            stringArrayListExtra = Collections.singletonList(stringExtra);
        }
        AnonymousClass5JZ r8 = new AnonymousClass5JZ(uri, A0A2, stringArrayListExtra, parcelableArrayListExtra);
        this.A06 = this.A07.A06(this, "view-shared-contact-array");
        this.A0L = getIntent().getBooleanExtra("edit_mode", true);
        this.A0C = C106405Yw.A00(this);
        this.A0H = r8.A02;
        C18270x1.A0w(new AnonymousClass55W(this.A03, this.A08, this.A09, this.A0A, this.A0D, this.A0G, r8, this), this.A04);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.A00();
    }

    public final void toggleCheckBox(View view) {
        CompoundButton compoundButton = (CompoundButton) view.findViewById(R.id.cbx);
        C86654Ky.A1C(compoundButton);
        ((AnonymousClass5I7) view.getTag()).A01 = compoundButton.isChecked();
    }

    public ViewSharedContactArrayActivity() {
        this(0);
        this.A0M = AnonymousClass001.A0s();
        this.A0N = AnonymousClass001.A0s();
        this.A0P = AnonymousClass001.A0s();
        this.A0O = AnonymousClass001.A0s();
    }
}
