package com.whatsapp.businessdirectory.view.activity;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1Gt;
import X.AnonymousClass1VX;
import X.AnonymousClass33T;
import X.AnonymousClass4U5;
import X.AnonymousClass5O3;
import X.AnonymousClass5QM;
import X.C08240dc;
import X.C08270df;
import X.C08310eF;
import X.C105355Up;
import X.C105375Ur;
import X.C142686xb;
import X.C166447yh;
import X.C174308Tt;
import X.C18290x4;
import X.C18310x6;
import X.C28861ht;
import X.C47812dr;
import X.C48862fb;
import X.C614930z;
import X.C621533t;
import X.C64373Df;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C88074Xf;
import X.C97904zS;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Menu;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel;
import com.whatsapp.util.Log;
import java.util.Timer;
import java.util.TimerTask;

public class BusinessDirectoryActivity extends AnonymousClass1Gt {
    public Menu A00;
    public C47812dr A01;
    public C614930z A02;
    public AnonymousClass5O3 A03;
    public AnonymousClass5QM A04;
    public C97904zS A05;
    public BusinessDirectoryContextualSearchFragment A06;
    public BusinessDirectoryActivityViewModel A07;
    public AnonymousClass33T A08;
    public C105355Up A09;
    public C28861ht A0A;
    public C64373Df A0B;
    public TimerTask A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Timer A0G = new Timer();

    public void A7G(boolean z) {
        A7C(new BusinessDirectoryConsumerHomeFragment(), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r7 = r12
            super.onCreate(r13)
            r0 = 2131624013(0x7f0e004d, float:1.8875194E38)
            r12.setContentView((int) r0)
            if (r13 == 0) goto L_0x0025
            java.lang.String r0 = "arg_show_search_menu"
            r1 = 0
            boolean r0 = r13.getBoolean(r0, r1)
            r12.A0E = r0
            java.lang.String r0 = "arg_show_search_view"
            boolean r0 = r13.getBoolean(r0, r1)
            r12.A0F = r0
            java.lang.String r0 = "arg_go_back_to_utilities"
            boolean r0 = r13.getBoolean(r0, r1)
            r12.A0D = r0
        L_0x0025:
            androidx.appcompat.widget.Toolbar r10 = X.AnonymousClass1Hf.A28(r12)
            X.0R8 r1 = X.AnonymousClass4SG.A2S(r12, r10)
            r0 = 1
            r1.A0O(r0)
            r1.A0N(r0)
            android.view.View r8 = X.AnonymousClass4SG.A2R(r12)
            X.33j r11 = r12.A00
            r0 = 3
            X.5CM r9 = new X.5CM
            r9.<init>(r12, r0)
            X.4zS r6 = new X.4zS
            r6.<init>(r7, r8, r9, r10, r11)
            r12.A05 = r6
            boolean r0 = r12.A0F
            if (r0 == 0) goto L_0x004e
            r12.A76()
        L_0x004e:
            r0 = 2131886738(0x7f120292, float:1.9408063E38)
            r12.setTitle(r0)
            X.0XL r1 = X.AnonymousClass0x9.A0H(r12)
            java.lang.Class<com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel> r0 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel.class
            X.0Ty r0 = r1.A01(r0)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel r0 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel) r0
            r12.A07 = r0
            X.4UC r1 = r0.A01
            r0 = 12
            X.C86654Ky.A1G(r12, r1, r0)
            if (r13 != 0) goto L_0x00c8
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r3 = "INITIAL_CATEGORY"
            android.os.Parcelable r2 = r0.getParcelableExtra(r3)
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "ARG_DIRECTORY_SHOULD_GO_BACK_TO_UTILITIES"
            r6 = 0
            boolean r0 = r1.getBooleanExtra(r0, r6)
            r12.A0D = r0
            if (r2 != 0) goto L_0x0103
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r5 = "directory_biz_chaining_jid"
            android.os.Parcelable r4 = r0.getParcelableExtra(r5)
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r3 = "directory_biz_chaining_name"
            java.lang.String r2 = r0.getStringExtra(r3)
            if (r4 == 0) goto L_0x00ff
            if (r2 == 0) goto L_0x00ff
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r1 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass002.A08()
            r0.putParcelable(r5, r4)
            r0.putString(r3, r2)
        L_0x00ab:
            r1.A0u(r0)
            r12.A7C(r1, r6)
        L_0x00b1:
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel r2 = r12.A07
            X.4w0 r0 = r2.A00
            X.5NA r0 = r0.A04
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "is_nux"
            boolean r0 = X.C86654Ky.A1T(r1, r0)
            if (r0 == 0) goto L_0x00c8
            X.4UC r0 = r2.A01
            X.C06270Wx.A04(r0, r6)
        L_0x00c8:
            X.5Up r0 = r12.A09
            X.1VX r1 = r0.A03
            boolean r0 = X.C86634Kw.A1a(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 1883(0x75b, float:2.639E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00fe
            X.5O3 r0 = r12.A03
            boolean r2 = r0.A02
            X.1VX r1 = r0.A04
            r0 = 2010(0x7da, float:2.817E-42)
            if (r2 == 0) goto L_0x00e6
            r0 = 2011(0x7db, float:2.818E-42)
        L_0x00e6:
            java.lang.String r0 = r1.A0Q(r0)
            if (r0 == 0) goto L_0x00fe
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00fe
            android.view.View r0 = X.AnonymousClass4SG.A2R(r12)
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 0
            X.AnonymousClass6AE.A00(r1, r12, r0)
        L_0x00fe:
            return
        L_0x00ff:
            r12.A7G(r6)
            goto L_0x00b1
        L_0x0103:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r1 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass002.A08()
            r0.putParcelable(r3, r2)
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 4, 1, getString(R.string.f11nameremoved));
        this.A00 = menu;
        if (this.A0E) {
            A77();
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void A75() {
        Menu menu = this.A00;
        if (!(menu == null || menu.findItem(1) == null)) {
            this.A00.removeItem(1);
        }
        this.A0E = false;
    }

    public void A76() {
        C97904zS r0 = this.A05;
        if (r0 != null && !C86604Kt.A1Y(r0.A04)) {
            this.A05.A02(false);
            A7A();
            this.A05.A02.requestFocus();
            C18290x4.A1H(this.A05.A04.findViewById(R.id.search_back), this, 25);
        }
    }

    public void A77() {
        Menu menu = this.A00;
        if (menu != null && menu.findItem(1) == null) {
            C86624Kv.A0q(this.A00.add(0, 1, 0, getString(R.string.f11nameremoved)), R.drawable.ic_action_search);
        }
        this.A0E = true;
    }

    public final void A79() {
        C97904zS r1 = this.A05;
        if (r1 != null) {
            r1.A01(true);
        }
        if (!isDestroyed() && !isFinishing()) {
            getSupportFragmentManager().A0N();
        }
    }

    public final void A7A() {
        AnonymousClass1VX r1 = this.A09.A03;
        if (C86634Kw.A1a(r1) && r1.A0X(1883)) {
            AnonymousClass5O3 r0 = this.A03;
            boolean z = r0.A02;
            AnonymousClass1VX r12 = r0.A04;
            int i = 2010;
            if (z) {
                i = 2011;
            }
            String A0Q = r12.A0Q(i);
            if (!(A0Q == null || A0Q.length() == 0)) {
                TimerTask timerTask = this.A0C;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                C174308Tt r13 = new C174308Tt(this);
                this.A0C = r13;
                this.A0G.schedule(r13, 0, 7000);
                return;
            }
        }
        C97904zS r2 = this.A05;
        if (r2 != null) {
            String string = getString(R.string.f11nameremoved);
            SearchView searchView = r2.A02;
            if (searchView != null) {
                searchView.setQueryHint(string);
            }
        }
    }

    public void A7E(String str) {
        C97904zS r0 = this.A05;
        if (r0 != null) {
            Editable text = r0.A02.A0k.getText();
            if (text == null || !str.equals(text.toString())) {
                this.A05.A02.A0H(str);
            } else {
                A7F(str);
            }
        }
    }

    public final void A7F(String str) {
        BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment = this.A06;
        if (businessDirectoryContextualSearchFragment != null) {
            C88074Xf r1 = businessDirectoryContextualSearchFragment.A0C;
            r1.A00 = 0;
            r1.A01.clear();
            businessDirectoryContextualSearchFragment.A09.A0V(str);
        }
        if (TextUtils.isEmpty(str)) {
            A7A();
        } else if (this.A0C != null) {
            C97904zS r12 = this.A05;
            if (r12 != null) {
                ObjectAnimator objectAnimator = r12.A02;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator objectAnimator2 = r12.A03;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                ObjectAnimator objectAnimator3 = r12.A01;
                if (objectAnimator3 != null) {
                    objectAnimator3.cancel();
                }
                ObjectAnimator objectAnimator4 = r12.A00;
                if (objectAnimator4 != null) {
                    objectAnimator4.cancel();
                }
                r12.A04.clearAnimation();
                r12.A05.clearAnimation();
            }
            this.A0C.cancel();
        }
    }

    public void onBackPressed() {
        C97904zS r0 = this.A05;
        if (r0 != null && C86604Kt.A1Y(r0.A04)) {
            this.A05.A01(true);
        }
        this.A05.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        if (r1 == 2) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r16) {
        /*
            r15 = this;
            r2 = r16
            int r1 = r2.getItemId()
            r7 = 1
            if (r1 == r7) goto L_0x00ab
            r0 = 2
            if (r1 == r0) goto L_0x0090
            r0 = 4
            if (r1 == r0) goto L_0x0072
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r1 == r0) goto L_0x0019
            boolean r0 = super.onOptionsItemSelected(r2)
            return r0
        L_0x0019:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r2 = r15.A74()
            X.0df r1 = r15.getSupportFragmentManager()
            java.lang.Class<com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment> r0 = com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment.class
            java.lang.String r0 = r0.getSimpleName()
            X.0eF r1 = r1.A0D(r0)
            boolean r0 = r1 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment
            if (r0 == 0) goto L_0x003f
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment r1 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment) r1
        L_0x0031:
            if (r2 == 0) goto L_0x0041
            boolean r0 = r2.A19()
            if (r0 == 0) goto L_0x0041
            X.4U5 r0 = r2.A0D
            r0.A0H()
            return r7
        L_0x003f:
            r1 = 0
            goto L_0x0031
        L_0x0041:
            if (r1 == 0) goto L_0x006c
            boolean r0 = r1.A19()
            if (r0 == 0) goto L_0x006c
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel r0 = r1.A01
            if (r0 == 0) goto L_0x0067
            X.5iG r1 = r0.A01
            r5 = 13
            r6 = 91
            r2 = 0
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = r2
            r1.A09(r2, r3, r4, r5, r6, r7)
            r15.A7G(r0)
            r0 = 2131886738(0x7f120292, float:1.9408063E38)
            r15.setTitle(r0)
            return r7
        L_0x0067:
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x006c:
            X.0Ts r0 = r15.A05
            r0.A00()
            return r7
        L_0x0072:
            java.lang.String r4 = "biz-directory-browsing"
            r3 = 0
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r15.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.from"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus"
            r2.putExtra(r0, r3)
            r15.startActivity(r2)
            return r7
        L_0x0090:
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel r0 = r15.A07
            X.4w0 r0 = r0.A00
            X.5NA r0 = r0.A04
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass5NA.A00(r0)
            java.lang.String r0 = "is_nux"
            X.C18270x1.A0l(r1, r0, r7)
            r1 = 2131895692(0x7f12258c, float:1.9426224E38)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r15, r1, r0)
            r0.show()
            return r7
        L_0x00ab:
            X.0df r0 = r15.getSupportFragmentManager()
            X.0Qo r2 = r0.A0Y
            java.util.List r0 = r2.A05()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00fc
            r3 = 0
        L_0x00bc:
            boolean r0 = r3 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            if (r0 == 0) goto L_0x00df
            r0 = r3
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r0
            X.4U5 r2 = r0.A0D
            X.5iG r8 = r2.A0G
            int r1 = r2.A02
            if (r1 == 0) goto L_0x00cf
            r0 = 2
            r12 = 2
            if (r1 != r0) goto L_0x00d0
        L_0x00cf:
            r12 = 3
        L_0x00d0:
            r13 = 62
            java.lang.Integer r9 = X.AnonymousClass4U5.A00(r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r11 = 0
            r14 = r7
            r8.A09(r9, r10, r11, r12, r13, r14)
        L_0x00df:
            boolean r0 = r3 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment
            if (r0 == 0) goto L_0x00f8
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment r3 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment) r3
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel r0 = r3.A01
            if (r0 == 0) goto L_0x010f
            X.5iG r1 = r0.A01
            r5 = 13
            r6 = 62
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r4 = r2
            r1.A09(r2, r3, r4, r5, r6, r7)
        L_0x00f8:
            r15.A78()
            return r7
        L_0x00fc:
            java.util.List r1 = r2.A05()
            java.util.List r0 = r2.A05()
            int r0 = X.AnonymousClass002.A03(r0)
            java.lang.Object r3 = r1.get(r0)
            X.0eF r3 = (X.C08310eF) r3
            goto L_0x00bc
        L_0x010f:
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public void onResume() {
        if (this.A0A.A00) {
            Log.i("BusinessDirectoryActivity/onResume WhatsApp login failed");
            this.A08.A05(20, "DirectoryLoginFailed");
            C621533t.A01(this, this.A02, this.A0D);
        } else if (this.A01.A00() != null && this.A0D.A0X(2466)) {
            Log.i("home/show-account-logout-request");
            C48862fb A002 = this.A01.A00();
            this.A01.A01((C48862fb) null);
            this.A08.A05(52, "HomeActivityShowingDialog");
            C621533t.A00(this, A002);
        }
        super.onResume();
    }

    public final BusinessDirectorySearchFragment A74() {
        C08310eF A0D2 = getSupportFragmentManager().A0D(BusinessDirectorySearchFragment.class.getSimpleName());
        if (A0D2 instanceof BusinessDirectorySearchFragment) {
            return (BusinessDirectorySearchFragment) A0D2;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 == 2) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A78() {
        /*
            r5 = this;
            X.0df r0 = r5.getSupportFragmentManager()
            X.0Qo r2 = r0.A0Y
            java.util.List r0 = r2.A05()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x008b
            r2 = 0
        L_0x0011:
            boolean r0 = r2 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            if (r0 == 0) goto L_0x0053
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r2 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r2
            X.4U5 r2 = r2.A0D
            int r1 = r2.A02
            if (r1 == 0) goto L_0x0021
            r0 = 2
            r4 = 2
            if (r1 != r0) goto L_0x0022
        L_0x0021:
            r4 = 3
        L_0x0022:
            r0 = 2
            if (r1 != r0) goto L_0x004b
            X.4UC r0 = r2.A0V
        L_0x0027:
            java.lang.Object r3 = r0.A07()
            X.7yh r3 = (X.C166447yh) r3
        L_0x002d:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r2 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "SEARCH_CONTEXT_CATEGORY"
            r1.putParcelable(r0, r3)
            java.lang.String r0 = "ARG_PREVIOUS_SCREEN"
            r1.putInt(r0, r4)
            r2.A0u(r1)
            r0 = 1
            r5.A7C(r2, r0)
        L_0x0047:
            r5.A76()
            return
        L_0x004b:
            r0 = 1
            if (r1 != r0) goto L_0x0051
            X.4UC r0 = r2.A0W
            goto L_0x0027
        L_0x0051:
            r3 = 0
            goto L_0x002d
        L_0x0053:
            boolean r0 = r2 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment
            if (r0 == 0) goto L_0x006d
            r3 = 0
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r2 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "ARG_PREVIOUS_SCREEN"
            r1.putInt(r0, r3)
            r2.A0u(r1)
        L_0x0069:
            r5.A7B(r2)
            goto L_0x0047
        L_0x006d:
            boolean r0 = r2 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment
            if (r0 == 0) goto L_0x0077
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r2 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment
            r2.<init>()
            goto L_0x0069
        L_0x0077:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BusinessDirectoryActivity/startSearchInConsumerSearchHome foreground fragment is "
            r1.append(r0)
            if (r2 != 0) goto L_0x0088
            java.lang.String r0 = "null"
        L_0x0084:
            X.C18260x0.A1K(r1, r0)
            goto L_0x0047
        L_0x0088:
            java.lang.String r0 = r2.A0T
            goto L_0x0084
        L_0x008b:
            java.util.List r1 = r2.A05()
            java.util.List r0 = r2.A05()
            int r0 = X.AnonymousClass002.A03(r0)
            java.lang.Object r2 = r1.get(r0)
            X.0eF r2 = (X.C08310eF) r2
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.A78():void");
    }

    public void A7B(C08310eF r4) {
        String A0n = C18310x6.A0n(r4);
        if (!isDestroyed() && !isFinishing()) {
            getSupportFragmentManager().A0N();
        }
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        A0J.A0E(r4, A0n, R.id.business_search_container_view);
        A0J.A0I(A0n);
        A0J.A01();
    }

    public void A7C(C08310eF r5, boolean z) {
        String A0n = C18310x6.A0n(r5);
        C08270df supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.A0D(A0n) == null) {
            C08240dc r1 = new C08240dc(supportFragmentManager);
            r1.A0E(r5, A0n, R.id.business_search_container_view);
            if (z) {
                r1.A0I(A0n);
            }
            r1.A01();
        }
    }

    public void A7D(C166447yh r5, int i) {
        BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment;
        C08310eF A0D2 = getSupportFragmentManager().A0D(BusinessDirectoryConsumerHomeFragment.class.getSimpleName());
        if (A0D2 instanceof BusinessDirectoryConsumerHomeFragment) {
            businessDirectoryConsumerHomeFragment = (BusinessDirectoryConsumerHomeFragment) A0D2;
        } else {
            businessDirectoryConsumerHomeFragment = null;
        }
        if (businessDirectoryConsumerHomeFragment != null) {
            businessDirectoryConsumerHomeFragment.A0G = false;
        }
        A79();
        if (businessDirectoryConsumerHomeFragment != null) {
            businessDirectoryConsumerHomeFragment.A0G = true;
        }
        BusinessDirectorySearchFragment A74 = A74();
        if (A74 != null) {
            AnonymousClass4U5 r2 = A74.A0D;
            r2.A00 = i;
            C105375Ur r1 = r2.A0N;
            r1.A07();
            r1.A00 = null;
            r2.A0V.A0H(r5);
            if (C142686xb.A00(r5.A00)) {
                r2.A0K();
                return;
            }
            r2.A0W.A0H(r5);
            r2.A0X(false);
            if (r2.A0c()) {
                r2.A05.pop();
                return;
            }
            return;
        }
        BusinessDirectorySearchFragment businessDirectorySearchFragment = new BusinessDirectorySearchFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putParcelable("INITIAL_CATEGORY", r5);
        businessDirectorySearchFragment.A0u(A082);
        A7C(businessDirectorySearchFragment, false);
    }

    public void onDestroy() {
        super.onDestroy();
        TimerTask timerTask = this.A0C;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        if (intent.getBooleanExtra("from_api_biz_search", false)) {
            A7B(new BusinessDirectoryContextualSearchFragment());
        } else if (intent.getBooleanExtra("arg_launch_consumer_home", false)) {
            A78();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        CharSequence charSequence;
        super.onRestoreInstanceState(bundle);
        C97904zS r2 = this.A05;
        if (r2 != null && bundle != null && (charSequence = bundle.getCharSequence("search_text")) != null) {
            r2.A02(false);
            r2.A00 = bundle.getInt("search_button_x_pos");
            r2.A02.A0H(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSaveInstanceState(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onSaveInstanceState(r4)
            X.4zS r0 = r3.A05
            if (r0 == 0) goto L_0x000a
            r0.A00(r4)
        L_0x000a:
            android.view.Menu r1 = r3.A00
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0017
            android.view.MenuItem r0 = r1.findItem(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            java.lang.String r0 = "arg_show_search_menu"
            r4.putBoolean(r0, r1)
            X.4zS r0 = r3.A05
            if (r0 == 0) goto L_0x002a
            android.view.View r0 = r0.A04
            boolean r0 = X.C86604Kt.A1Y(r0)
            if (r0 == 0) goto L_0x002a
            r2 = 1
        L_0x002a:
            java.lang.String r0 = "arg_show_search_view"
            r4.putBoolean(r0, r2)
            java.lang.String r1 = "arg_go_back_to_utilities"
            boolean r0 = r3.A0D
            r4.putBoolean(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.onSaveInstanceState(android.os.Bundle):void");
    }
}
