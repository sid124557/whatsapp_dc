package com.whatsapp.accountswitching.routing;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass33p;
import X.AnonymousClass36l;
import X.AnonymousClass4GJ;
import X.AnonymousClass4HY;
import X.AnonymousClass5V0;
import X.AnonymousClass5VY;
import X.AnonymousClass5XC;
import X.C009707r;
import X.C116865qz;
import X.C118805vx;
import X.C1235268t;
import X.C162457s7;
import X.C17190ui;
import X.C175738Zn;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C19340zH;
import X.C34171uL;
import X.C51072jE;
import X.C53892nq;
import X.C53962nx;
import X.C54412og;
import X.C614930z;
import X.C627736r;
import X.C70043Zq;
import X.C72333dY;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class AccountSwitchingRoutingActivity extends C009707r implements AnonymousClass4GJ {
    public C53962nx A00;
    public C614930z A01;
    public AnonymousClass5XC A02;
    public AnonymousClass33p A03;
    public C54412og A04;
    public C51072jE A05;
    public C34171uL A06;
    public boolean A07;
    public final Object A08;
    public volatile C116865qz A09;

    public void onCreate(Bundle bundle) {
        String str;
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        super.onCreate(bundle);
        Intent intent = getIntent();
        C162457s7.A0D(intent);
        int intExtra = intent.getIntExtra("inactiveAccountNotificationId", -1);
        String stringExtra = intent.getStringExtra("inactiveAccountNotificationTag");
        if (!(intExtra == -1 || stringExtra == null || C175738Zn.A0V(stringExtra))) {
            Object systemService = getSystemService("notification");
            C162457s7.A0K(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(stringExtra, intExtra);
            intent.removeExtra("inactiveAccountNotificationId");
            intent.removeExtra("inactiveAccountNotificationTag");
            C34171uL r0 = this.A06;
            if (r0 != null) {
                C72333dY.A01(r0).A0A(stringExtra);
            } else {
                throw C18270x1.A0S("workManagerLazy");
            }
        }
        String stringExtra2 = getIntent().getStringExtra("switch_to_account_lid");
        int intExtra2 = getIntent().getIntExtra("source", 0);
        C18260x0.A0s("AccountSwitchingRoutingActivity/switch to account lid/", stringExtra2, AnonymousClass001.A0o());
        AnonymousClass5XC r1 = this.A02;
        if (r1 != null) {
            r1.A00(intExtra2, 16);
            C53962nx r02 = this.A00;
            if (r02 == null) {
                throw C18270x1.A0S("changeNumberManager");
            } else if (r02.A01()) {
                Log.i("AccountSwitchingRoutingActivity/change number in progress");
                C19340zH A002 = AnonymousClass5V0.A00(this);
                A002.A0i(false);
                A002.A0U(R.string.f11nameremoved);
                A002.A0T(R.string.f11nameremoved);
                A002.A0Y(new C1235268t(this, 6), R.string.f11nameremoved);
                A002.A0S();
            } else {
                AnonymousClass33p r03 = this.A03;
                if (r03 != null) {
                    String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(r03), "account_switching_logged_out_phone_number");
                    if (A0Z == null || A0Z.length() == 0) {
                        C51072jE r04 = this.A05;
                        if (r04 == null) {
                            throw C18270x1.A0S("registrationStateManager");
                        } else if (!r04.A02()) {
                            C51072jE r05 = this.A05;
                            if (r05 == null) {
                                throw C18270x1.A0S("registrationStateManager");
                            } else if (r05.A00() == 2) {
                                Log.i("AccountSwitchingRoutingActivity/register name/account backup dialog");
                                AnonymousClass33p r06 = this.A03;
                                if (r06 != null) {
                                    int A0C = r06.A0C();
                                    C54412og r07 = this.A04;
                                    if (r07 != null) {
                                        AnonymousClass36l.A0G(this, new C70043Zq(this, 29), stringExtra2, r07.A02(), A0C);
                                        return;
                                    }
                                    throw C18270x1.A0S("waStartupSharedPreferences");
                                }
                                throw C18270x1.A0S("waSharedPreferences");
                            } else {
                                Log.i("AccountSwitchingRoutingActivity/abandon add new account");
                                C614930z r08 = this.A01;
                                if (r08 != null) {
                                    r08.A04(this, stringExtra2);
                                    finish();
                                    return;
                                }
                                throw C18270x1.A0S("accountSwitcher");
                            }
                        } else {
                            if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                                C614930z r09 = this.A01;
                                if (r09 != null) {
                                    C53892nq A012 = r09.A01();
                                    if (A012 != null) {
                                        str = A012.A07;
                                    } else {
                                        str = null;
                                    }
                                    if (C162457s7.A0P(str, stringExtra2)) {
                                        Log.e("AccountSwitchingRoutingActivity/switch account lid same as current account lid, opening home activity");
                                        startActivity(C627736r.A02(this));
                                        return;
                                    }
                                } else {
                                    throw C18270x1.A0S("accountSwitcher");
                                }
                            }
                            Log.i("AccountSwitchingRoutingActivity/switch account");
                            C614930z r6 = this.A01;
                            if (r6 == null) {
                                throw C18270x1.A0S("accountSwitcher");
                            } else if (stringExtra2 != null) {
                                r6.A0A(this, stringExtra2, getIntent().getStringExtra("account_switching_sender_jid"), new C118805vx(this), intExtra2, false, getIntent().getBooleanExtra("is_missed_call_notification", false));
                            } else {
                                throw C18290x4.A0Y();
                            }
                        }
                    } else {
                        Log.i("AccountSwitchingRoutingActivity/login failed dialog");
                        AnonymousClass33p r3 = this.A03;
                        if (r3 != null) {
                            C54412og r2 = this.A04;
                            if (r2 != null) {
                                AnonymousClass36l.A0F(this, r3, r2, new C70043Zq(this, 28), stringExtra2);
                                return;
                            }
                            throw C18270x1.A0S("waStartupSharedPreferences");
                        }
                        throw C18270x1.A0S("waSharedPreferences");
                    }
                } else {
                    throw C18270x1.A0S("waSharedPreferences");
                }
            }
        } else {
            throw C18270x1.A0S("accountSwitchingLogger");
        }
    }

    public final Object generatedComponent() {
        if (this.A09 == null) {
            synchronized (this.A08) {
                if (this.A09 == null) {
                    this.A09 = new C116865qz(this);
                }
            }
        }
        return this.A09.generatedComponent();
    }

    public AccountSwitchingRoutingActivity(int i) {
        this.A08 = AnonymousClass002.A0D();
        this.A07 = false;
        AnonymousClass4HY.A00(this, 11);
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A00(this, super.B6u());
    }

    public AccountSwitchingRoutingActivity() {
        this(0);
    }
}
