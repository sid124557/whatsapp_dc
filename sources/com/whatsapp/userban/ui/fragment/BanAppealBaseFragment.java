package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.AnonymousClass4I1;
import X.C003203q;
import X.C02890Hz;
import X.C111095hX;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C19340zH;
import X.C379924v;
import X.C53892nq;
import X.C54412og;
import X.C56612sH;
import X.C614930z;
import X.C627736r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;

public abstract class BanAppealBaseFragment extends WaFragment {
    public C111095hX A00;
    public C614930z A01;
    public C56612sH A02;
    public AnonymousClass33p A03;
    public C54412og A04;
    public AnonymousClass1VX A05;
    public BanAppealViewModel A06;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        this.A06 = C18280x3.A0P(this);
    }

    public final C614930z A1I() {
        C614930z r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("accountSwitcher");
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (!A1I().A07()) {
            return null;
        }
        A13(true);
        return null;
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        int i;
        int i2;
        C18270x1.A14(menu, menuInflater);
        if (A1I().A07()) {
            if (A1I().A01() == null) {
                Log.i("BanAppealBaseFragment/onCreateOptionsMenu/getCurrentAccount is null");
                if (A1I().A06()) {
                    Log.i("BanAppealBaseFragment/onCreateOptionsMenu/userRegisteredBannedAccount/inactiveAccountsPresent");
                    i = 103;
                } else {
                    Log.i("BanAppealBaseFragment/onCreateOptionsMenu/userRegisteredBannedAccount/no inactiveAccountsPresent");
                    i = 104;
                    i2 = R.string.f11nameremoved;
                    C18290x4.A1E(menu, i, i2);
                }
            } else if (A1I().A06()) {
                Log.i("BanAppealBaseFragment/onCreateOptionsMenu/inactiveAccountsPresent");
                C18290x4.A1E(menu, 101, R.string.f11nameremoved);
                i = 102;
            } else {
                return;
            }
            i2 = R.string.f11nameremoved;
            C18290x4.A1E(menu, i, i2);
        }
    }

    public boolean A1B(MenuItem menuItem) {
        StringBuilder A0X = C18270x1.A0X(menuItem);
        A0X.append("BanAppealBaseFragment/onOptionsItemSelected/option item : ");
        C18260x0.A1G(A0X, menuItem.getItemId());
        switch (menuItem.getItemId()) {
            case 101:
                if (A1I().A0A.A0C() + 1 > 2) {
                    C379924v.A00(16).A1O(A0U(), "BanAppealBaseFragment");
                    return true;
                }
                A1I().A05(A0G(), 16);
                return true;
            case 102:
                C614930z A1I = A1I();
                C53892nq A012 = A1I().A01();
                if (A012 != null) {
                    String A022 = A1I.A02(A012.A06);
                    C19340zH A0K = C18280x3.A0K(this);
                    A0K.A0U(R.string.f11nameremoved);
                    A0K.A0g(C02890Hz.A00(AnonymousClass0x7.A0m(this, A022, new Object[1], R.string.f11nameremoved)));
                    C19340zH.A08(A0K, this, 109, R.string.f11nameremoved);
                    A0K.A0W(new AnonymousClass4I1(18), R.string.f11nameremoved);
                    C18300x5.A0H(A0K).show();
                    return true;
                }
                throw C18290x4.A0Y();
            case 103:
                C111095hX r6 = this.A00;
                if (r6 != null) {
                    C003203q A0R = A0R();
                    C003203q A0R2 = A0R();
                    AnonymousClass33p r0 = this.A03;
                    if (r0 != null) {
                        int A0C = r0.A0C();
                        C54412og r02 = this.A04;
                        if (r02 != null) {
                            r6.A0A(A0R, C627736r.A11(A0R2, (String) null, r02.A02(), A0C));
                            return true;
                        }
                        throw C18270x1.A0S("waStartupSharedPreferences");
                    }
                    throw C18270x1.A0S("waSharedPreferences");
                }
                throw C18270x1.A0S("activityUtils");
            case 104:
                BanAppealViewModel banAppealViewModel = this.A06;
                if (banAppealViewModel != null) {
                    banAppealViewModel.A0G(A0R(), false);
                }
                return true;
            default:
                return false;
        }
    }
}
