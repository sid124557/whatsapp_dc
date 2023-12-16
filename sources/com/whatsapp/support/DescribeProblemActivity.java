package com.whatsapp.support;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1XA;
import X.AnonymousClass2BI;
import X.AnonymousClass4BX;
import X.AnonymousClass4FV;
import X.AnonymousClass4L0;
import X.AnonymousClass5Q6;
import X.AnonymousClass5WY;
import X.AnonymousClass5ZR;
import X.AnonymousClass67S;
import X.AnonymousClass68I;
import X.AnonymousClass9U4;
import X.C1000259c;
import X.C102925Ku;
import X.C106675Zy;
import X.C107395bF;
import X.C109495ei;
import X.C109695f2;
import X.C134246ig;
import X.C156447gd;
import X.C166587yw;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C184418rl;
import X.C185468tj;
import X.C203499no;
import X.C27991fJ;
import X.C33921tu;
import X.C33931tv;
import X.C46012aw;
import X.C47362d8;
import X.C53202mi;
import X.C54322oX;
import X.C56492s4;
import X.C56512s6;
import X.C622734j;
import X.C631938h;
import X.C66433Lk;
import X.C66663Mh;
import X.C71573cK;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C89514d7;
import X.C989053r;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.LabeledIntent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.inappsupport.ui.AddScreenshotImageView;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DescribeProblemActivity extends C89514d7 implements C184418rl, AnonymousClass4BX {
    public int A00;
    public Uri A01;
    public EditText A02;
    public AppCompatCheckBox A03;
    public AnonymousClass5WY A04;
    public C56492s4 A05;
    public C56512s6 A06;
    public AnonymousClass5ZR A07;
    public AnonymousClass4FV A08;
    public C53202mi A09;
    public C54322oX A0A;
    public C46012aw A0B;
    public C33931tv A0C;
    public WhatsAppLibLoader A0D;
    public C185468tj A0E;
    public AnonymousClass9U4 A0F;
    public C47362d8 A0G;
    public AnonymousClass5Q6 A0H;
    public C66433Lk A0I;
    public C622734j A0J;
    public C106675Zy A0K;
    public C989053r A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;
    public final Uri[] A0Q = new Uri[3];

    public static final boolean A0L(String str, boolean z) {
        int length;
        int i;
        if (!z) {
            length = str.getBytes().length;
            i = 10;
        } else if (!str.contains("\n\n")) {
            return false;
        } else {
            length = str.substring(str.indexOf("\n\n", 0) + "\n\n".getBytes().length).getBytes().length;
            i = 45;
        }
        return length < i;
    }

    public final void A76() {
        List list;
        boolean z;
        AppCompatCheckBox appCompatCheckBox;
        A78(3);
        C47362d8 r4 = this.A0G;
        String str = this.A0N;
        String str2 = this.A0M;
        String str3 = this.A0O;
        String A74 = A74();
        Uri[] uriArr = this.A0Q;
        C185468tj r0 = this.A0E;
        if (r0 != null) {
            list = r0.BAg();
        } else {
            list = null;
        }
        if (!A7B() || ((appCompatCheckBox = this.A03) != null && appCompatCheckBox.isChecked())) {
            z = true;
        } else {
            z = false;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Uri uri : uriArr) {
            if (uri != null) {
                A0s.add(uri);
            }
        }
        r4.A00(this, (C631938h) null, (C27991fJ) null, str, A74, str2, str3, A0s, list, z);
    }

    public void BRr() {
        this.A0C = null;
        A75();
    }

    public void onBackPressed() {
        A78(1);
        super.onBackPressed();
    }

    public Dialog onCreateDialog(int i) {
        if (i != 2) {
            return super.onCreateDialog(i);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        C86604Kt.A0y(progressDialog, getString(R.string.f11nameremoved));
        return progressDialog;
    }

    public final void A77(int i) {
        if (this.A0F.A0G() != null && this.A0F.A0G().B7b() != null) {
            C203499no B7b = this.A0F.A0G().B7b();
            C134246ig B0d = B7b.B0d();
            B0d.A08 = Integer.valueOf(i);
            B0d.A0b = "payments_in_app_support_view";
            B7b.BKA(B0d);
        }
    }

    public final void A78(int i) {
        AnonymousClass1XA r1 = new AnonymousClass1XA();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = this.A00.A07();
        this.A08.BhB(r1);
    }

    public final void A79(int i) {
        Intent labeledIntent;
        if (this.A07.A0E()) {
            ArrayList A0I2 = AnonymousClass002.A0I(2);
            A0I2.add(new C156447gd(new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI).setType("image/*")));
            if (this.A0Q[i] != null) {
                Intent A072 = C18320x8.A07();
                A072.setClassName(getPackageName(), "com.whatsapp.support.Remove");
                A0I2.add(new C156447gd(A072, getString(R.string.f11nameremoved)));
            }
            int size = A0I2.size();
            ArrayList A0I3 = AnonymousClass002.A0I(size);
            Intent intent = ((C156447gd) AnonymousClass0x9.A0t(A0I2)).A01;
            A0C(intent);
            A0I3.add(intent);
            for (int i2 = 1; i2 < size; i2++) {
                C156447gd r9 = (C156447gd) A0I2.get(i2);
                String str = r9.A02;
                if (str == null) {
                    labeledIntent = r9.A01;
                } else {
                    Intent intent2 = r9.A01;
                    labeledIntent = new LabeledIntent(C18320x8.A07().setComponent(intent2.resolveActivity(getPackageManager())).setData(intent2.getData()).putExtras(intent2), getPackageName(), str, r9.A00);
                }
                A0C(labeledIntent);
                A0I3.add(labeledIntent);
            }
            startActivityForResult(C107395bF.A01((IntentSender) null, (CharSequence) null, A0I3), i | 16);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = R.string.f11nameremoved;
        if (i3 < 30) {
            i4 = R.string.f11nameremoved;
        }
        RequestPermissionActivity.A0c(this, R.string.f11nameremoved, i4, i | 48);
    }

    public final void A7A(Uri uri, int i) {
        int i2;
        Uri uri2 = uri;
        this.A0Q[i] = uri;
        AddScreenshotImageView addScreenshotImageView = (AddScreenshotImageView) C86664Kz.A0k(this, R.id.screenshots).getChildAt(i);
        if (uri != null) {
            Point A072 = AnonymousClass4L0.A07();
            C86604Kt.A0x(this, A072);
            int i3 = A072.x / 3;
            try {
                addScreenshotImageView.setScreenshot(this.A0L.A0C(uri2, i3 / 2, i3, this.A0D.A03(), false));
                C18300x5.A13(this, addScreenshotImageView, R.string.f11nameremoved);
            } catch (IOException e) {
                C18260x0.A0k(uri, "descprob/screenshot/io-exception ", AnonymousClass001.A0o(), e);
                i2 = R.string.f11nameremoved;
                Bot(i2);
                C18300x5.A13(this, addScreenshotImageView, R.string.f11nameremoved);
            } catch (C1000259c e2) {
                C18260x0.A0k(uri, "descprob/screenshot/not-an-image ", AnonymousClass001.A0o(), e2);
                i2 = R.string.f11nameremoved;
                Bot(i2);
                C18300x5.A13(this, addScreenshotImageView, R.string.f11nameremoved);
            }
        } else {
            Bitmap bitmap = addScreenshotImageView.A07;
            if (bitmap != null) {
                bitmap.recycle();
                addScreenshotImageView.A07 = null;
            }
            addScreenshotImageView.A07();
            C18300x5.A13(this, addScreenshotImageView, R.string.f11nameremoved);
        }
    }

    public final boolean A7B() {
        if (!AnonymousClass2BI.A00(this.A0N) || !this.A0D.A0X(2237) || !this.A0F.A0G().getName().equals("UPI")) {
            return false;
        }
        return true;
    }

    public void Baz(C102925Ku r14) {
        String str = this.A0N;
        String str2 = r14.A02;
        ArrayList arrayList = r14.A05;
        String str3 = this.A0O;
        int i = r14.A00;
        ArrayList arrayList2 = r14.A06;
        ArrayList arrayList3 = r14.A03;
        ArrayList arrayList4 = r14.A07;
        ArrayList arrayList5 = r14.A04;
        List list = r14.A08;
        Intent A072 = C18320x8.A07();
        A072.setClassName(getPackageName(), "com.whatsapp.support.faq.SearchFAQ");
        A072.putExtra("com.whatsapp.support.faq.SearchFAQ.from", str);
        A072.putExtra("com.whatsapp.support.faq.SearchFAQ.problem", str2);
        A072.putExtra("com.whatsapp.support.faq.SearchFAQ.status", str3);
        A072.putExtra("com.whatsapp.support.faq.SearchFAQ.count", i);
        A072.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.titles", arrayList2);
        A072.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.descriptions", arrayList3);
        A072.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.urls", arrayList4);
        A072.putStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.ids", arrayList5);
        A072.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        if (list != null) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                Pair pair = (Pair) list.get(i2);
                StringBuilder A0o = AnonymousClass001.A0o();
                C18290x4.A1R(A0o, (String) pair.first);
                strArr[i2] = AnonymousClass000.A0X((String) pair.second, A0o);
            }
            A072.putExtra("com.whatsapp.support.faq.SearchFAQ.additionalDetails", strArr);
        }
        BpY(A072, 32);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        int i3;
        if ((i & 16) == 16) {
            if (i2 == -1 && intent != null) {
                if (AnonymousClass0x9.A1N(intent, "is_removed")) {
                    i3 = i - 16;
                    data = null;
                } else {
                    data = intent.getData();
                    if (data != null) {
                        try {
                            grantUriPermission("com.whatsapp", data, 1);
                        } catch (SecurityException e) {
                            Log.w("descprob/permission", e);
                        }
                        i3 = i - 16;
                    } else {
                        Bot(R.string.f11nameremoved);
                        return;
                    }
                }
                A7A(data, i3);
            }
        } else if (i == 32) {
            if (i2 == -1) {
                finish();
            }
        } else if ((i & 48) != 48) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A79(i - 48);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        setTitle(R.string.f11nameremoved);
        AnonymousClass0R8 A0R = C86634Kw.A0R(this);
        A0R.A0N(true);
        A0R.A0O(true);
        setContentView((int) R.layout.f8nameremoved);
        View findViewById = findViewById(R.id.scroll_view);
        this.A02 = (EditText) findViewById(R.id.describe_problem_description_et);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.send_device_info_checkbox);
        this.A03 = appCompatCheckBox;
        appCompatCheckBox.setChecked(true);
        C18280x3.A0o(findViewById(R.id.send_info_row), this, 22);
        View findViewById2 = findViewById(R.id.describe_problem_error);
        View findViewById3 = findViewById(R.id.next_btn);
        findViewById3.setEnabled(C18280x3.A1U(C18290x4.A0m(this.A02).length(), 1));
        this.A02.addTextChangedListener(new AnonymousClass68I(findViewById3, 4, this));
        if (A7B()) {
            A77(0);
            View findViewById4 = findViewById(R.id.send_info_row);
            if (findViewById4 != null) {
                findViewById4.setVisibility(0);
            }
        }
        C109495ei.A00(findViewById3, this, findViewById2, 13);
        Intent intent = getIntent();
        this.A0N = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.from");
        this.A0O = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.serverstatus");
        this.A0M = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.emailAddress");
        this.A01 = this.A0I.A02(this.A0A.A00(), "general", (String) null, (String) null);
        if (AnonymousClass2BI.A00(this.A0N)) {
            String A062 = this.A06.A06(C66663Mh.A25);
            if (!TextUtils.isEmpty(A062)) {
                this.A0M = A062;
            }
            String A063 = this.A06.A06(C66663Mh.A26);
            if (!TextUtils.isEmpty(A063)) {
                this.A01 = Uri.parse(A063);
            }
        }
        ViewGroup A0k = C86664Kz.A0k(this, R.id.screenshots);
        A0k.removeAllViews();
        if (AnonymousClass2BI.A00(this.A0N)) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicIDs");
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles");
            this.A0E = this.A0F.A0G().BAs();
            String stringExtra = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.paymentBankPhone");
            C166587yw r3 = (C166587yw) intent.getParcelableExtra("com.whatsapp.support.DescribeProblemActivity.paymentMethod");
            String stringExtra2 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId");
            String stringExtra3 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.paymentBankTxnId");
            String stringExtra4 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.paymentErrorCode");
            String stringExtra5 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.paymentStatus");
            ViewGroup A0m = C86664Kz.A0m(this, R.id.payment_information_container);
            C185468tj r13 = this.A0E;
            if (r13 != null && !"payments:account-details".equals(this.A0N)) {
                r13.Bms(stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringArrayListExtra);
                A0m.addView(r13.buildPaymentHelpSupportSection(this, r3, stringExtra));
                A0m.setVisibility(0);
            }
            TextView A0L2 = C18310x6.A0L(this, R.id.optional_title);
            if (stringArrayListExtra2 == null || stringArrayListExtra2.isEmpty()) {
                A0L2.setVisibility(8);
            } else {
                StringBuilder A0A2 = C18330xA.A0A((String) AnonymousClass0x9.A0t(stringArrayListExtra2));
                for (int i = 1; i < stringArrayListExtra2.size(); i++) {
                    if (i == 1) {
                        A0A2.append(" (");
                    }
                    A0A2.append(C86664Kz.A1M(stringArrayListExtra2, i));
                    if (i == AnonymousClass0x9.A03(stringArrayListExtra2, 1)) {
                        str = ")";
                    } else {
                        str = ", ";
                    }
                    A0A2.append(str);
                }
                A0L2.setText(A0A2.toString());
                A0L2.setVisibility(0);
            }
            View findViewById5 = findViewById(R.id.add_screenshots);
            C185468tj r0 = this.A0E;
            if (r0 != null && !r0.BFU()) {
                findViewById5.setVisibility(8);
                A0k.setVisibility(8);
            }
        }
        int A012 = C18320x8.A01(intent, "com.whatsapp.support.DescribeProblemActivity.type");
        this.A00 = A012;
        if (A012 == 1 || A012 == 2 || A012 == 3) {
            A0R.A0B(R.string.f11nameremoved);
        } else {
            A0R.A0B(R.string.f11nameremoved);
        }
        String stringExtra6 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.description");
        if (stringExtra6 != null && stringExtra6.length() > 0) {
            this.A02.setText(stringExtra6);
            this.A0P = true;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int i2 = 0;
        do {
            AddScreenshotImageView addScreenshotImageView = new AddScreenshotImageView(this);
            C109695f2.A00(addScreenshotImageView, this, i2, 19);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.bottomMargin = dimensionPixelSize;
            layoutParams.rightMargin = dimensionPixelSize;
            layoutParams.topMargin = dimensionPixelSize;
            layoutParams.leftMargin = dimensionPixelSize;
            A0k.addView(addScreenshotImageView, layoutParams);
            String stringExtra7 = intent.getStringExtra("com.whatsapp.support.DescribeProblemActivity.uri");
            if (i2 == 0 && stringExtra7 != null) {
                Uri parse = Uri.parse(stringExtra7);
                this.A0Q[0] = parse;
                C86644Kx.A1A(addScreenshotImageView);
                addScreenshotImageView.setImageURI(parse);
            }
            i2++;
        } while (i2 < 3);
        if (bundle != null) {
            Parcelable[] parcelableArray = bundle2.getParcelableArray("screenshots");
            for (int i3 = 0; i3 < parcelableArray.length; i3++) {
                Parcelable parcelable = parcelableArray[i3];
                if (parcelable != null) {
                    A7A((Uri) parcelable, i3);
                }
            }
        }
        if (this.A00 == 2) {
            A75();
        }
        AnonymousClass5Q6 r02 = new AnonymousClass5Q6(findViewById, findViewById(R.id.bottom_button_container), AnonymousClass1Ha.A1i(this));
        this.A0H = r02;
        r02.A00();
        if (A7B()) {
            AnonymousClass002.A09(this.A00, R.id.describe_problem_help).setText(R.string.f11nameremoved);
            return;
        }
        this.A0H.A01(this, new AnonymousClass67S(this, 3), C18310x6.A0L(this, R.id.describe_problem_help), getString(R.string.f11nameremoved), R.style.f12nameremoved);
    }

    public static void A0C(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("com.whatsapp");
            if (action.startsWith(AnonymousClass000.A0X(".intent.action.", A0o)) && !"gigaset".equalsIgnoreCase(Build.MANUFACTURER)) {
                intent.setPackage("com.whatsapp");
            }
        }
    }

    public final String A74() {
        ArrayList<String> stringArrayListExtra;
        if (!getIntent().hasExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles") || (stringArrayListExtra = getIntent().getStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles")) == null || stringArrayListExtra.isEmpty()) {
            return C86604Kt.A0o(this.A02);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0x2.A1N(A0o, getString(R.string.f11nameremoved));
        StringBuilder A0A2 = C18330xA.A0A(A0o.toString());
        for (int i = 0; i < stringArrayListExtra.size(); i++) {
            A0A2.append(C86664Kz.A1M(stringArrayListExtra, i));
            if (i < C86664Kz.A0M(stringArrayListExtra)) {
                AnonymousClass001.A1M(A0A2);
            }
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("\n\n");
        C18270x1.A1C(C86604Kt.A0o(this.A02), A0o2, A0A2);
        return A0A2.toString();
    }

    public final void A75() {
        if (A7B()) {
            A77(1);
            BpA(0, R.string.f11nameremoved);
            this.A04.BkM(new C71573cK(this, 34, this));
            return;
        }
        A76();
    }

    public void Ba0(boolean z) {
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0H.A00();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!A7B()) {
            return false;
        }
        menu.add(0, R.id.menuitem_contact_us_email, 0, getString(R.string.f11nameremoved)).setShowAsAction(0);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        C33931tv r1 = this.A0C;
        if (r1 != null) {
            r1.A0D(false);
        }
        C33921tu r12 = this.A0G.A01;
        if (r12 != null) {
            r12.A0D(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            A78(1);
            finish();
            return true;
        } else if (itemId != R.id.menuitem_contact_us_email) {
            return false;
        } else {
            TextView A0L2 = C18310x6.A0L(this, R.id.describe_problem_error);
            String A74 = A74();
            int length = A74.getBytes().length;
            boolean A002 = AnonymousClass2BI.A00(this.A0N);
            if (this.A0P || !A0L(A74, A002)) {
                C86614Ku.A11(this, this.A02, R.drawable.description_field_background_state_list);
                A0L2.setVisibility(8);
                A76();
                return true;
            }
            C86614Ku.A11(this, this.A02, R.drawable.describe_problem_edittext_bg_error);
            int i = R.string.f11nameremoved;
            if (length == 0) {
                i = R.string.f11nameremoved;
            }
            A0L2.setText(i);
            A0L2.setVisibility(0);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A02.clearFocus();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray("screenshots", this.A0Q);
    }
}
