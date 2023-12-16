package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2XB;
import X.AnonymousClass356;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass4K2;
import X.C06270Wx;
import X.C107695bk;
import X.C162457s7;
import X.C18270x1;
import X.C18320x8;
import X.C383026z;
import X.C64333Db;
import X.C89644eZ;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;

public final class WfacBanActivity extends C89644eZ {
    public WfacBanViewModel A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public WfacBanActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 129);
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass2XB r3;
        String str;
        String str2;
        int i;
        String str3;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A00 = (WfacBanViewModel) AnonymousClass0x9.A0H(this).A01(WfacBanViewModel.class);
        int intExtra = getIntent().getIntExtra("ban_violation_type", -1);
        String stringExtra = getIntent().getStringExtra("ban_violation_reason");
        int intExtra2 = getIntent().getIntExtra("ban_violation_source", -1);
        int i2 = 0;
        if (intExtra2 != 0) {
            i2 = 1;
            if (intExtra2 != 1) {
                i2 = 2;
                if (intExtra2 != 2) {
                    i2 = -1;
                }
            }
        }
        int A012 = C18320x8.A01(getIntent(), "launch_source");
        String stringExtra2 = getIntent().getStringExtra("appeal_decision");
        String str4 = "banned";
        String str5 = str4;
        if (!C162457s7.A0P(stringExtra2, str4)) {
            str4 = "unbanned";
            if (!C162457s7.A0P(stringExtra2, str4)) {
                str4 = "other";
            }
        }
        WfacBanViewModel wfacBanViewModel = this.A00;
        if (wfacBanViewModel == null) {
            throw C18270x1.A0S("viewModel");
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WfacBanViewModel violation [");
        A0o.append(intExtra);
        A0o.append("] with reason [");
        A0o.append(stringExtra);
        A0o.append("], violation source [");
        A0o.append(i2);
        A0o.append("]and appeal decision [");
        A0o.append(str4);
        A0o.append("] from launch source [");
        A0o.append(A012);
        AnonymousClass356.A01(AnonymousClass0x2.A0f(A0o));
        if (intExtra >= 0) {
            AnonymousClass2XB r10 = wfacBanViewModel.A05;
            AnonymousClass356.A03(AnonymousClass000.A0Y("WfacBanRepository/storeViolationType : ", AnonymousClass001.A0o(), intExtra));
            C18270x1.A0h(C18270x1.A04(r10.A00.A01), "wfac_ban_violation_type", intExtra);
        }
        if (stringExtra != null) {
            AnonymousClass2XB r9 = wfacBanViewModel.A05;
            AnonymousClass356.A03(AnonymousClass000.A0V("WfacBanRepository/storeViolationReason : ", stringExtra, AnonymousClass001.A0o()));
            C18270x1.A0j(C18270x1.A04(r9.A00.A01), "wfac_ban_violation_reason", stringExtra);
        }
        wfacBanViewModel.A00 = A012;
        if (A012 == 2 || A012 == 3) {
            AnonymousClass2XB r2 = wfacBanViewModel.A05;
            AnonymousClass356.A03(AnonymousClass000.A0Y("WfacBanRepository/storeViolationSource : ", AnonymousClass001.A0o(), i2));
            C18270x1.A0h(C18270x1.A04(r2.A00.A01), "wfac_ban_violation_source", i2);
        }
        wfacBanViewModel.A01 = str4;
        WfacBanViewModel wfacBanViewModel2 = this.A00;
        if (wfacBanViewModel2 == null) {
            throw C18270x1.A0S("viewModel");
        }
        AnonymousClass4K2.A00(this, wfacBanViewModel2.A04, new C383026z(this, 36), 205);
        WfacBanViewModel wfacBanViewModel3 = this.A00;
        if (wfacBanViewModel3 == null) {
            throw C18270x1.A0S("viewModel");
        }
        int i3 = wfacBanViewModel3.A00;
        if (i3 == 2 || i3 == 3) {
            r3 = wfacBanViewModel3.A05;
            str = "CHECKPOINTED";
            AnonymousClass356.A03(AnonymousClass000.A0V("WfacBanRepository/storeBanState : ", str, AnonymousClass001.A0o()));
            C18270x1.A0j(C18270x1.A04(r3.A00.A01), "wfac_ban_state", str);
        } else {
            if (i3 != 4) {
                str3 = "WfacBanViewModel/setBanState unknown or main default launch. Using previous state";
            } else {
                String str6 = wfacBanViewModel3.A01;
                if (C162457s7.A0P(str6, str5)) {
                    r3 = wfacBanViewModel3.A05;
                    str = "BANNED";
                } else if (C162457s7.A0P(str6, "unbanned")) {
                    r3 = wfacBanViewModel3.A05;
                    str = "UNBANNED";
                } else {
                    str3 = "WfacBanViewModel/setBanState unknown or missing appeal decision. Ignoring";
                }
                AnonymousClass356.A03(AnonymousClass000.A0V("WfacBanRepository/storeBanState : ", str, AnonymousClass001.A0o()));
                C18270x1.A0j(C18270x1.A04(r3.A00.A01), "wfac_ban_state", str);
            }
            AnonymousClass356.A03(str3);
        }
        if (bundle == null) {
            WfacBanViewModel wfacBanViewModel4 = this.A00;
            if (wfacBanViewModel4 == null) {
                throw C18270x1.A0S("viewModel");
            }
            AnonymousClass356.A03("WfacBanViewModel/updateBanState");
            String A002 = wfacBanViewModel4.A05.A00();
            switch (A002.hashCode()) {
                case -358171056:
                    str2 = "UNKNOWN_IN_CLIENT";
                    break;
                case 191367207:
                    str2 = "CHECKPOINTED";
                    break;
                case 272787191:
                    if (A002.equals("UNBANNED")) {
                        i = 2;
                        break;
                    }
                    break;
                case 1951953694:
                    if (A002.equals("BANNED")) {
                        i = 3;
                        break;
                    }
                    break;
            }
            if (A002.equals(str2)) {
                i = 1;
                C06270Wx.A03(wfacBanViewModel4.A04, i);
                return;
            }
            throw AnonymousClass002.A0G(AnonymousClass000.A0V("Invalid BanState: ", A002, AnonymousClass001.A0o()));
        }
    }

    public void onStart() {
        super.onStart();
        WfacBanViewModel wfacBanViewModel = this.A00;
        if (wfacBanViewModel == null) {
            throw C18270x1.A0S("viewModel");
        }
        wfacBanViewModel.A02.A05(76, "WfacBanActivity");
    }

    public WfacBanActivity() {
        this(0);
    }
}
