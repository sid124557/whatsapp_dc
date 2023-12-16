package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.WaPreferenceFragment;
import com.whatsapp.util.Log;

/* renamed from: X.4bZ  reason: invalid class name and case insensitive filesystem */
public class C89114bZ extends C89664eb implements AnonymousClass4FU {
    public int A00;
    public int A01;
    public long A02;
    public ProgressDialog A03;
    public Intent A04;
    public C69263Wi A05;
    public WaPreferenceFragment A06;
    public Integer A07;
    @Deprecated
    public String A08;
    public boolean A09 = true;
    public boolean A0A;
    public final C182358oH A0B = new AnonymousClass69N(this, 0);

    public void BjL() {
        this.A03 = null;
        C621433s.A00(this, 501);
    }

    public void onCreate(Bundle bundle) {
        this.A0A = false;
        C107555bV.A08(getWindow(), this.A00);
        getTheme().applyStyle(R.style.f12nameremoved, true);
        getLayoutInflater().setFactory2(new C109265eL(A5e()));
        A5e().A0D(bundle);
        super.onCreate(bundle);
        View findViewById = findViewById(16908298);
        if (findViewById != null) {
            int paddingLeft = findViewById.getPaddingLeft();
            int paddingLeft2 = findViewById.getPaddingLeft();
            ViewParent parent = findViewById.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                paddingLeft = C86664Kz.A0F(view, paddingLeft);
                paddingLeft2 += view.getPaddingRight();
                view.setPadding(0, 0, 0, 0);
            }
            findViewById.setPadding(paddingLeft, 0, paddingLeft2, 0);
            findViewById.setScrollBarStyle(33554432);
        }
        C620733j r0 = this.A00;
        r0.A0A.add(this.A0B);
    }

    public void Bon(DialogFragment dialogFragment, String str) {
        throw AnonymousClass001.A0e("Unsupported operation");
    }

    public void Boo(DialogFragment dialogFragment) {
        throw AnonymousClass001.A0e("Unsupported operation");
    }

    public void Bot(int i) {
        this.A00 = i;
        C621433s.A01(this, 500);
    }

    @Deprecated
    public void Bou(String str) {
        this.A08 = str;
        C621433s.A01(this, 500);
    }

    public void Bov(String str, String str2) {
        throw AnonymousClass001.A0e("Unsupported operation");
    }

    public void Box(Object[] objArr, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        C621433s.A01(this, 500);
    }

    public void BpA(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        C621433s.A01(this, 501);
    }

    public void Bru(String str) {
        ProgressDialog progressDialog = this.A03;
        if (progressDialog != null) {
            progressDialog.setMessage(str);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((this.A09 || SystemClock.elapsedRealtime() - this.A02 > 500 || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 2)) && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onBackPressed() {
        if (this.A09) {
            super.onBackPressed();
        } else {
            Log.e("dialogtoasttreferenceactivity/onbackpressed/activity no active");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.A00.A0P();
        super.onConfigurationChanged(configuration);
        A5e().A0C(configuration);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r3 = (com.whatsapp.settings.SettingsChatHistoryFragment) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r13) {
        /*
            r12 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r13 == r0) goto L_0x00dc
            r0 = 501(0x1f5, float:7.02E-43)
            if (r13 == r0) goto L_0x00c4
            com.whatsapp.WaPreferenceFragment r3 = r12.A06
            boolean r0 = r3 instanceof com.whatsapp.settings.SettingsJidNotificationFragment
            if (r0 == 0) goto L_0x0030
            com.whatsapp.settings.SettingsJidNotificationFragment r3 = (com.whatsapp.settings.SettingsJidNotificationFragment) r3
            if (r13 != 0) goto L_0x00bf
            X.4bZ r4 = r3.A00
            X.5Y0 r6 = r3.A04
            X.5hX r5 = r3.A00
            X.3Lk r7 = r3.A07
            java.lang.String r9 = "26000003"
            r1 = 2131892688(0x7f1219d0, float:1.9420131E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r3)
            java.lang.String r8 = r0.getString(r1)
            r10 = 0
            r11 = r10
            android.app.Dialog r0 = com.whatsapp.dialogs.FAQLearnMoreDialogFragment.A00(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x002d:
            if (r0 == 0) goto L_0x00bf
            return r0
        L_0x0030:
            boolean r0 = r3 instanceof com.whatsapp.settings.SettingsChatHistoryFragment
            if (r0 == 0) goto L_0x00bf
            com.whatsapp.settings.SettingsChatHistoryFragment r3 = (com.whatsapp.settings.SettingsChatHistoryFragment) r3
            X.4bZ r1 = r3.A00
            r4 = 0
            if (r1 == 0) goto L_0x00bf
            r0 = 3
            r6 = 0
            if (r13 == r0) goto L_0x00a8
            r0 = 4
            if (r13 == r0) goto L_0x008b
            r0 = 5
            if (r13 == r0) goto L_0x005c
            r0 = 10
            if (r13 != r0) goto L_0x00bf
            X.4uZ r1 = r3.A0A
            if (r1 == 0) goto L_0x00bf
            X.3Ex r0 = r3.A04
            X.3ZH r2 = r0.A0A(r1)
            X.5Su r1 = r3.A06
            X.4bZ r0 = r3.A00
            X.043 r0 = r1.A00(r0, r0, r2)
            goto L_0x002d
        L_0x005c:
            X.314 r0 = r3.A05
            int r0 = r0.A03()
            if (r0 <= 0) goto L_0x0065
            r6 = 1
        L_0x0065:
            r0 = 4
            X.69X r2 = new X.69X
            r2.<init>(r0, r3, r6)
            X.0zH r1 = X.C18320x8.A0H(r3)
            r0 = 2131894555(0x7f12211b, float:1.9423918E38)
            if (r6 == 0) goto L_0x0077
            r0 = 2131886447(0x7f12016f, float:1.9407473E38)
        L_0x0077:
            r1.A0T(r0)
            r0 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1.A0Y(r2, r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r1.A0W(r4, r0)
            X.043 r0 = r1.create()
            goto L_0x002d
        L_0x008b:
            r1 = 2
            X.69a r0 = new X.69a
            r0.<init>(r3, r1)
            X.5Qq r2 = r3.A0B
            android.content.Context r3 = r3.A1D()
            X.69e r4 = new X.69e
            r4.<init>(r0, r1)
            r5 = -1
            r8 = r6
            r7 = r6
            X.0Uj r0 = r2.A00(r3, r4, r5, r6, r7, r8)
            X.043 r0 = r0.create()
            goto L_0x002d
        L_0x00a8:
            r5 = 1
            X.69e r2 = new X.69e
            r2.<init>(r3, r5)
            X.5Qq r0 = r3.A0B
            r3 = -1
            r4 = 3
            r6 = r5
            X.0Uj r0 = r0.A00(r1, r2, r3, r4, r5, r6)
            X.043 r0 = r0.create()
            r0.show()
            return r0
        L_0x00bf:
            android.app.Dialog r0 = super.onCreateDialog(r13)
            return r0
        L_0x00c4:
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r12)
            int r0 = r12.A01
            if (r0 == 0) goto L_0x00d0
            r1.setTitle(r0)
        L_0x00d0:
            int r0 = r12.A00
            java.lang.String r0 = r12.getString(r0)
            X.C86604Kt.A0y(r1, r0)
            r12.A03 = r1
            return r1
        L_0x00dc:
            X.0zH r2 = X.AnonymousClass5V0.A00(r12)
            java.lang.String r0 = r12.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0104
            int r0 = r12.A00
            java.lang.String r0 = r12.getString(r0)
        L_0x00ee:
            r2.A0g(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 1
            X.C1235268t.A03(r2, r12, r0, r1)
            int r0 = r12.A01
            if (r0 == 0) goto L_0x00ff
            r2.A0B(r0)
        L_0x00ff:
            X.043 r1 = r2.create()
            return r1
        L_0x0104:
            java.lang.String r0 = r12.A08
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89114bZ.onCreateDialog(int):android.app.Dialog");
    }

    public void onPause() {
        this.A05.A0J(this);
        super.onPause();
        this.A09 = false;
        this.A02 = SystemClock.elapsedRealtime();
    }

    public void onPrepareDialog(int i, Dialog dialog) {
        String str;
        if (i != 500) {
            super.onPrepareDialog(i, dialog);
            return;
        }
        AnonymousClass043 r5 = (AnonymousClass043) dialog;
        if (TextUtils.isEmpty(this.A08)) {
            str = getString(this.A00);
        } else {
            str = this.A08;
        }
        C06200Wq r0 = r5.A00;
        r0.A0Q = str;
        TextView textView = r0.A0K;
        if (textView != null) {
            textView.setText(str);
        }
        C18260x0.A0q("dialogtoastpref/preparedialog/message ", str, AnonymousClass001.A0o());
    }

    public boolean BHW() {
        return C621433s.A03(this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A5e().A0F(view, layoutParams);
    }

    public void onDestroy() {
        super.onDestroy();
        A5e().A09();
        C620733j r0 = this.A00;
        r0.A0A.remove(this.A0B);
        this.A04 = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((AnonymousClass040) A5e()).A0N();
    }

    public void onPostResume() {
        super.onPostResume();
        AnonymousClass040 r0 = (AnonymousClass040) A5e();
        r0.A0P();
        AnonymousClass0R8 r1 = r0.A0B;
        if (r1 != null) {
            r1.A0R(true);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A08 = bundle.getString("dialogToastMessage");
        this.A00 = bundle.getInt("dialogToastMessageId", 0);
        this.A01 = bundle.getInt("dialogToastTitleId", 0);
    }

    public void onResume() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(AnonymousClass000.A0O(this));
        C18260x0.A1L(A0o, ".onResume");
        if (this.A0A) {
            this.A0A = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        this.A05.A0L(this);
        this.A09 = true;
        Intent intent = this.A04;
        if (intent != null) {
            Integer num = this.A07;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            this.A04 = null;
            this.A07 = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(AnonymousClass000.A0O(this));
        C18260x0.A1L(A0o, ".onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("dialogToastMessage", this.A08);
        bundle.putInt("dialogToastMessageId", this.A00);
        bundle.putInt("dialogToastTitleId", this.A01);
    }

    public void onStop() {
        super.onStop();
        A5e().A0A();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A5e().A0I(charSequence);
    }

    public void setContentView(int i) {
        Toolbar toolbar = (Toolbar) C86604Kt.A0F(getLayoutInflater(), R.layout.f8nameremoved);
        toolbar.setTitle(getTitle());
        toolbar.setElevation(AnonymousClass5CP.A00(this));
        boolean A002 = C102805Ki.A00(this.A00);
        int i2 = R.drawable.abc_ic_ab_back_material;
        if (A002) {
            i2 = R.drawable.ic_back_rtl;
        }
        toolbar.setNavigationIcon(i2);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(toolbar, -1, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        FrameLayout frameLayout = new FrameLayout(this);
        getLayoutInflater().inflate(i, frameLayout, true);
        linearLayout.addView(frameLayout, -1, -1);
        setContentView((View) linearLayout);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new C109415ea(this, 12));
    }

    public void setSupportActionBar(Toolbar toolbar) {
        Integer num;
        A5e().A0H(toolbar);
        if (toolbar != null && C1001059l.A03) {
            Window window = getWindow();
            C162457s7.A0J(window, 1);
            if ((toolbar instanceof AnonymousClass578) && (num = ((AnonymousClass578) toolbar).A08.A03) != null) {
                AnonymousClass5CQ.A00(window, num.intValue(), true);
            }
        }
    }

    public void Bow(C181548mw r1, Object[] objArr, int i, int i2, int i3) {
        Box(objArr, i, i2);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A5e().A0G(view, layoutParams);
    }

    public void setContentView(View view) {
        A5e().A0E(view);
    }
}
