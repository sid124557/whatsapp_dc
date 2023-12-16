package com.whatsapp.status.audienceselector;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass0O1;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass21S;
import X.AnonymousClass223;
import X.AnonymousClass3FH;
import X.AnonymousClass49Y;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass5NK;
import X.AnonymousClass5PU;
import X.AnonymousClass5Q7;
import X.AnonymousClass5QH;
import X.AnonymousClass5TZ;
import X.AnonymousClass5YA;
import X.AnonymousClass66O;
import X.AnonymousClass68W;
import X.C003403v;
import X.C104745Se;
import X.C105585Vp;
import X.C106905aM;
import X.C107595bZ;
import X.C107695bk;
import X.C108845de;
import X.C108895dj;
import X.C110065fd;
import X.C113995mK;
import X.C116725ql;
import X.C1228966g;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C379524r;
import X.C44132Uu;
import X.C49712gy;
import X.C56042rK;
import X.C58422vE;
import X.C59622xD;
import X.C620233e;
import X.C64333Db;
import X.C71293bs;
import X.C86634Kw;
import X.C86654Ky;
import X.C88694ab;
import X.C88834as;
import X.C89644eZ;
import X.C89654ea;
import X.C989753y;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.RadioButton;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class StatusPrivacyActivity extends C89644eZ implements C1228966g, AnonymousClass49Y {
    public RadioButton A00;
    public RadioButton A01;
    public RadioButton A02;
    public AnonymousClass0O1 A03;
    public C44132Uu A04;
    public C49712gy A05;
    public WaTextView A06;
    public WaTextView A07;
    public WfalManager A08;
    public AnonymousClass3FH A09;
    public C108845de A0A;
    public C620233e A0B;
    public C110065fd A0C;
    public AnonymousClass5PU A0D;
    public AnonymousClass5TZ A0E;
    public C113995mK A0F;
    public AnonymousClass5NK A0G;
    public AnonymousClass66O A0H;
    public C56042rK A0I;
    public C105585Vp A0J;
    public AnonymousClass5YA A0K;
    public C104745Se A0L;
    public boolean A0M;

    public final void A76() {
        int i;
        RadioButton radioButton = this.A02;
        List list = null;
        if (radioButton == null) {
            throw C18270x1.A0S("myContactsButton");
        }
        if (radioButton.isChecked()) {
            i = 0;
        } else {
            C108845de r0 = this.A0A;
            if (r0 != null) {
                i = r0.A00;
                if (i == 1) {
                    list = r0.A01;
                } else {
                    list = r0.A02;
                }
            } else {
                setResult(-1, C379524r.A00(getIntent()));
                finish();
                return;
            }
        }
        boolean A0Y = this.A0D.A0Y(C58422vE.A01, 2531);
        C89654ea.A4W(this);
        int i2 = -1;
        if (A0Y) {
            i2 = 1;
        }
        AnonymousClass4FS r1 = this.A04;
        C44132Uu r2 = this.A04;
        if (r2 != null) {
            AnonymousClass0x7.A1B(r2.A00(this, list, i, i2, 300, true, true, false, true), r1);
            return;
        }
        throw C18270x1.A0S("saveStatusFactory");
    }

    public C110065fd BD8(int i, int i2, boolean z) {
        View view = this.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        C110065fd r2 = new C110065fd(this, C88694ab.A00(view, i, i2), this.A08, A0s, z);
        this.A0C = r2;
        r2.A05(new C71293bs((Object) this, 40));
        C110065fd r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C18300x5.A0X();
    }

    public void BPq(C59622xD r3) {
        C162457s7.A0J(r3, 0);
        if (r3.A01 && A75().A07()) {
            C104745Se r0 = this.A0L;
            if (r0 == null) {
                throw C18270x1.A0S("xFamilyGating");
            } else if (r0.A00()) {
                C71293bs.A00(this.A04, this, 39);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1Ha.A1m(this, R.layout.f8nameremoved).A0B(R.string.f11nameremoved);
        this.A02 = (RadioButton) C18290x4.A0N(this, R.id.my_contacts_button);
        this.A01 = (RadioButton) C18290x4.A0N(this, R.id.my_contacts_except_button);
        this.A00 = (RadioButton) C18290x4.A0N(this, R.id.only_share_with_button);
        this.A06 = (WaTextView) C18290x4.A0N(this, R.id.excluded);
        this.A07 = (WaTextView) C18290x4.A0N(this, R.id.included);
        WaTextView waTextView = this.A06;
        if (waTextView == null) {
            throw C18270x1.A0S("excludedLabel");
        }
        C106905aM.A04(waTextView);
        WaTextView waTextView2 = this.A07;
        if (waTextView2 == null) {
            throw C18270x1.A0S("includedLabel");
        }
        C106905aM.A04(waTextView2);
        A78();
        this.A03 = Bid(new C107595bZ(this, 6), new C003403v());
        this.A0H = new C116725ql(this);
        RadioButton radioButton = this.A02;
        if (radioButton == null) {
            throw C18270x1.A0S("myContactsButton");
        }
        radioButton.setText(R.string.f11nameremoved);
        RadioButton radioButton2 = this.A01;
        if (radioButton2 == null) {
            throw C18270x1.A0S("denyListButton");
        }
        radioButton2.setText(R.string.f11nameremoved);
        RadioButton radioButton3 = this.A00;
        if (radioButton3 == null) {
            throw C18270x1.A0S("allowListButton");
        }
        radioButton3.setText(R.string.f11nameremoved);
        RadioButton radioButton4 = this.A02;
        if (radioButton4 == null) {
            throw C18270x1.A0S("myContactsButton");
        }
        C989753y.A00(radioButton4, this, 3);
        RadioButton radioButton5 = this.A01;
        if (radioButton5 == null) {
            throw C18270x1.A0S("denyListButton");
        }
        C989753y.A00(radioButton5, this, 4);
        RadioButton radioButton6 = this.A00;
        if (radioButton6 == null) {
            throw C18270x1.A0S("allowListButton");
        }
        C989753y.A00(radioButton6, this, 5);
        if (!A74().A0F()) {
            C71293bs.A00(this.A04, this, 41);
        }
        AnonymousClass5PU r0 = this.A0D;
        if (r0 != null) {
            r0.A00(this);
            this.A07.A06(this);
            WfalManager wfalManager = this.A08;
            if (wfalManager == null) {
                throw C18270x1.A0S("wfalManager");
            } else if (wfalManager.A02()) {
                AnonymousClass5NK r4 = this.A0G;
                if (r4 != null) {
                    ViewStub viewStub = (ViewStub) C18290x4.A0L(this, R.id.status_privacy_stub);
                    C162457s7.A0J(viewStub, 0);
                    View A0M2 = C86634Kw.A0M(viewStub, R.layout.f8nameremoved);
                    C162457s7.A0H(A0M2);
                    r4.A00(A0M2, AnonymousClass223.FACEBOOK, R.drawable.ic_settings_fb, R.string.f11nameremoved);
                    r4.A00(A0M2, AnonymousClass223.INSTAGRAM, R.drawable.ic_settings_ig, R.string.f11nameremoved);
                    return;
                }
                throw C18270x1.A0S("crosspostingStatusPrivacySettingHandler");
            } else if (A75().A07()) {
                C104745Se r02 = this.A0L;
                if (r02 == null) {
                    throw C18270x1.A0S("xFamilyGating");
                } else if (r02.A00()) {
                    AnonymousClass5YA A75 = A75();
                    ViewStub viewStub2 = (ViewStub) C18290x4.A0L(this, R.id.status_privacy_stub);
                    AnonymousClass0O1 r42 = this.A03;
                    if (r42 == null) {
                        throw C18270x1.A0S("crosspostAccountUnlinkingActivityResultLauncher");
                    }
                    AnonymousClass66O r7 = this.A0H;
                    if (r7 == null) {
                        throw C18270x1.A0S("crosspostAccountLinkingResultListener");
                    }
                    C162457s7.A0J(viewStub2, 0);
                    View A0M3 = C86634Kw.A0M(viewStub2, R.layout.f8nameremoved);
                    C162457s7.A0H(A0M3);
                    A75.A06(A0M3, r42, this, (C108895dj) null, r7);
                    C56042rK r1 = this.A0I;
                    if (r1 == null) {
                        throw C18270x1.A0S("fbAccountManager");
                    } else if (r1.A05(AnonymousClass21S.A0S)) {
                        C71293bs.A00(this.A04, this, 42);
                    }
                }
            }
        } else {
            throw C18270x1.A0S("waSnackbarRegistry");
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C162457s7.A0J(menuItem, 0);
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A76();
        return false;
    }

    public void A5r() {
        if (!this.A0M) {
            this.A0M = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r3 = A2X.A4Z;
            AnonymousClass4SG.A3W(r3, this);
            C107695bk r2 = r3.A00;
            AnonymousClass4SG.A3Q(r3, r2, this, AnonymousClass4SG.A2t(r3, r2, this));
            this.A0B = C86634Kw.A0h(r3);
            this.A05 = (C49712gy) r3.AaZ.get();
            this.A0L = C86634Kw.A0s(r3);
            this.A0D = (AnonymousClass5PU) r3.Aal.get();
            this.A0F = C86634Kw.A0q(r3);
            this.A04 = (C44132Uu) A2X.A1U.get();
            this.A08 = C86654Ky.A0U(r3);
            this.A0K = (AnonymousClass5YA) r2.ACM.get();
            this.A0E = C107695bk.A5D(r2);
            this.A0J = new C105585Vp((AnonymousClass5QH) A2X.A4G.get());
            this.A0I = (C56042rK) r3.AEv.get();
            this.A09 = (AnonymousClass3FH) r2.ABa.get();
            this.A0G = new AnonymousClass5NK((WfalManager) r3.AbR.get(), (AnonymousClass5Q7) r3.A00.ACE.get());
        }
    }

    public final C620233e A74() {
        C620233e r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("statusStore");
    }

    public final AnonymousClass5YA A75() {
        AnonymousClass5YA r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("xFamilyCrosspostManager");
    }

    public final void A77() {
        RadioButton radioButton = this.A02;
        if (radioButton == null) {
            throw C18270x1.A0S("myContactsButton");
        }
        radioButton.setChecked(false);
        RadioButton radioButton2 = this.A00;
        if (radioButton2 == null) {
            throw C18270x1.A0S("allowListButton");
        }
        radioButton2.setChecked(false);
        RadioButton radioButton3 = this.A01;
        if (radioButton3 == null) {
            throw C18270x1.A0S("denyListButton");
        }
        radioButton3.setChecked(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A78() {
        /*
            r10 = this;
            X.5de r0 = r10.A0A
            if (r0 == 0) goto L_0x002a
            int r7 = r0.A00
        L_0x0006:
            r10.A77()
            r3 = 1
            if (r7 == 0) goto L_0x0023
            if (r7 == r3) goto L_0x001c
            r0 = 2
            if (r7 != r0) goto L_0x0033
            android.widget.RadioButton r0 = r10.A01
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "denyListButton"
        L_0x0017:
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x001c:
            android.widget.RadioButton r0 = r10.A00
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "allowListButton"
            goto L_0x0017
        L_0x0023:
            android.widget.RadioButton r0 = r10.A02
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "myContactsButton"
            goto L_0x0017
        L_0x002a:
            X.33e r0 = r10.A74()
            int r7 = r0.A02()
            goto L_0x0006
        L_0x0033:
            java.lang.String r0 = "unknown status distribution mode"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x003a:
            r0.setChecked(r3)
            X.1VX r1 = r10.A0D
            r0 = 6325(0x18b5, float:8.863E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00a2
            X.5de r4 = r10.A0A
            if (r4 != 0) goto L_0x0062
            X.33e r0 = r10.A74()
            java.util.List r5 = r0.A07()
            X.33e r0 = r10.A74()
            java.util.List r6 = r0.A08()
            r8 = 0
            X.5de r4 = new X.5de
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0062:
            java.util.List r1 = r4.A01
            java.util.List r0 = r4.A02
            int r6 = r1.size()
            int r5 = r0.size()
            com.whatsapp.WaTextView r4 = r10.A07
            if (r4 != 0) goto L_0x0079
            java.lang.String r0 = "includedLabel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0079:
            android.content.res.Resources r2 = r10.getResources()
            r1 = 2131755329(0x7f100141, float:1.9141534E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            boolean r3 = X.C18300x5.A1Y(r0, r6)
            X.C86614Ku.A16(r2, r4, r0, r1, r6)
            com.whatsapp.WaTextView r2 = r10.A06
            if (r2 != 0) goto L_0x0094
            java.lang.String r0 = "excludedLabel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0094:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131755330(0x7f100142, float:1.9141536E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r1, r5, r3, r0)
            r2.setText(r0)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.audienceselector.StatusPrivacyActivity.A78():void");
    }

    public AnonymousClass0GC B6S() {
        AnonymousClass0GC r0 = this.A06.A02;
        C162457s7.A0D(r0);
        return r0;
    }

    public String B8C() {
        return "status_privacy_activity";
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C108845de r2;
        if (i == 0) {
            if (C18280x3.A1W(AnonymousClass0x2.A0F(this.A09), "audience_selection_2") && i2 == -1 && intent != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    AnonymousClass5TZ r0 = this.A0E;
                    if (r0 != null) {
                        r2 = r0.A00(extras);
                    } else {
                        throw C18270x1.A0S("audienceRepository");
                    }
                } else {
                    r2 = null;
                }
                this.A0A = r2;
                if (r2 != null) {
                    C86634Kw.A1Q(this.A04, this, r2, 1);
                }
            }
            A78();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onDestroy() {
        Log.i("StatusPrivacyActivity/onDestroy");
        super.onDestroy();
        AnonymousClass5PU r0 = this.A0D;
        if (r0 != null) {
            r0.A01(this);
            this.A07.A07(this);
            return;
        }
        throw C18270x1.A0S("waSnackbarRegistry");
    }

    public StatusPrivacyActivity(int i) {
        this.A0M = false;
        AnonymousClass68W.A00(this, 103);
    }

    public void onBackPressed() {
        A76();
    }

    public StatusPrivacyActivity() {
        this(0);
    }
}
