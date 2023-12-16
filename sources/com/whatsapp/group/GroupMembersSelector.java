package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass0IT;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass3ZH;
import X.AnonymousClass4SG;
import X.AnonymousClass5QN;
import X.AnonymousClass68W;
import X.AnonymousClass7HU;
import X.C08240dc;
import X.C107395bF;
import X.C107695bk;
import X.C116985rC;
import X.C117865sc;
import X.C13770ni;
import X.C140046t4;
import X.C162457s7;
import X.C18260x0;
import X.C18300x5;
import X.C18320x8;
import X.C27991fJ;
import X.C33311sn;
import X.C380725l;
import X.C56892sj;
import X.C56982ss;
import X.C59002wA;
import X.C59972xn;
import X.C620533h;
import X.C626936e;
import X.C627336j;
import X.C627736r;
import X.C64333Db;
import X.C64623Eg;
import X.C72063d7;
import X.C84384Cd;
import X.C84814Du;
import X.C86614Ku;
import X.C86634Kw;
import X.C88744aj;
import X.C88834as;
import X.C89634eX;
import X.C91974lt;
import X.C998258i;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

public class GroupMembersSelector extends C89634eX {
    public int A00;
    public C116985rC A01;
    public C84384Cd A02;
    public C56982ss A03;
    public C56892sj A04;
    public C620533h A05;
    public C59972xn A06;
    public C33311sn A07;
    public C27991fJ A08;
    public List A09;
    public List A0A;
    public List A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public void A7N(AnonymousClass5QN r9, AnonymousClass3ZH r10) {
        AnonymousClass3ZH r4 = r10;
        super.A7N(r9, r10);
        if (AnonymousClass4SG.A42(this)) {
            AnonymousClass7HU A0B2 = this.A0D.A0B(r10, 7);
            if (A0B2.A00 == C998258i.PUSH_NAME) {
                r9.A02.A0K((List) null, this.A0D.A0F(r10, true).A01);
            }
            r9.A03.A07(A0B2, r4, this.A0T, 7, r10.A0W());
        }
    }

    public final void A7d(boolean z) {
        List A042;
        String rawString;
        this.A07 = null;
        boolean z2 = z;
        if (this.A0E) {
            Intent A072 = C18320x8.A07();
            Intent putExtra = A072.putExtra("duplicate_ug_exists", z).putExtra("selected", C627336j.A0A(this.A0C)).putExtra("entry_point", getIntent().getIntExtra("entry_point", -1));
            C27991fJ r0 = this.A08;
            if (r0 == null) {
                rawString = null;
            } else {
                rawString = r0.getRawString();
            }
            putExtra.putExtra("parent_group_jid_to_link", rawString);
            AnonymousClass0x2.A0m(this, A072);
            return;
        }
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        C59002wA r4 = NewGroupRouter.A0A;
        List A7F = A7F();
        int i = this.A00;
        C27991fJ r5 = this.A08;
        Bundle bundleExtra = getIntent().getBundleExtra("fMessageKeyBundle");
        if (bundleExtra == null) {
            A042 = null;
        } else {
            A042 = C107395bF.A04(bundleExtra);
        }
        A0J.A0C(r4.A01(r5, C86614Ku.A0D(this).getString("appended_message"), A7F, A042, i, z2, C86614Ku.A0D(this).getBoolean("include_captions")), (String) null);
        A0J.A04();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent A0O;
        if (i != 1) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
                return;
            } else if (i2 != -1) {
                Log.i("groupmembersselector/permissions denied");
            } else {
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                C27991fJ A0k = C86634Kw.A0k(intent, "group_jid");
                C626936e.A06(A0k);
                Bundle bundleExtra = intent.getBundleExtra("new_group_result_bundle");
                C18260x0.A1R(AnonymousClass001.A0o(), "groupmembersselector/group created ", A0k);
                if (this.A03.A0L(A0k) && !BHW()) {
                    C18260x0.A1R(AnonymousClass001.A0o(), "groupmembersselector/opening conversation", A0k);
                    if (this.A08 == null || this.A00 == 10) {
                        A0O = C627736r.A0O(this, A0k);
                    } else {
                        new C627736r();
                        A0O = C627336j.A01(this, A0k, 0);
                    }
                    if (bundleExtra != null) {
                        A0O.putExtra("new_group_result_bundle", bundleExtra);
                    }
                    this.A00.A0B(this, A0O);
                }
            }
            startActivity(C627736r.A02(this));
        } else {
            return;
        }
        finish();
    }

    public void A5r() {
        if (!this.A0D) {
            this.A0D = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3T(r2, r1, this);
            AnonymousClass4SG.A3M(A2X, r2, this, r2.A6O.get());
            this.A03 = C64333Db.A39(r2);
            this.A01 = C88744aj.A00;
            this.A02 = r2.AiI();
            this.A05 = (C620533h) r2.APC.get();
            this.A04 = C64333Db.A3G(r2);
            this.A06 = (C59972xn) r2.ATY.get();
        }
    }

    public void A7K(int i) {
        if (i <= 0) {
            getSupportActionBar().A0A(R.string.f11nameremoved);
        } else {
            super.A7K(i);
        }
    }

    public void A7Z(List list) {
        if (!TextUtils.isEmpty(this.A0S) && !list.isEmpty()) {
            list.add(new C91974lt(getString(R.string.f11nameremoved)));
        }
        super.A7Z(list);
        A7V(list);
    }

    public final List A7c() {
        Collection collection;
        if (this.A09 == null) {
            this.A09 = AnonymousClass001.A0s();
            C84384Cd r4 = this.A02;
            C27991fJ r3 = this.A08;
            C13770ni A002 = AnonymousClass0IT.A00(this);
            C64623Eg r42 = (C64623Eg) r4;
            C162457s7.A0J(r3, 0);
            try {
                collection = (Collection) C380725l.A00(A002.B61(), new CommunityMembersDirectory$getCommunityContacts$1(r42, r3, (C84814Du) null));
            } catch (CancellationException e) {
                Log.e((Throwable) e);
                collection = C72063d7.A00;
            }
            this.A09.addAll(collection);
        }
        return this.A09;
    }

    public GroupMembersSelector(int i) {
        this.A0D = false;
        AnonymousClass68W.A00(this, 61);
    }

    public void A7U(ArrayList arrayList) {
        super.A7U(arrayList);
        if (this.A0D.A0X(3689)) {
            Iterator it = this.A06.A00().iterator();
            while (it.hasNext()) {
                AnonymousClass3ZH A072 = this.A0B.A07(C18300x5.A0P(it));
                if (A072 != null && A072.A10) {
                    C86614Ku.A1T(A072, arrayList);
                }
            }
        }
        if (this.A0D.A0X(4136)) {
            if (this.A0A == null) {
                ArrayList A0s = AnonymousClass001.A0s();
                this.A0A = A0s;
                this.A0B.A0i(A0s);
                Collections.sort(this.A0A, new C117865sc(this.A0D, this.A0N));
            }
            arrayList.addAll(this.A0A);
        }
        if (this.A03.A06(this.A08) == 1 && this.A0D.A0X(3795)) {
            arrayList.addAll(A7c());
        }
    }

    public void A7X(List list) {
        if (list.isEmpty() && !TextUtils.isEmpty(this.A0S) && AnonymousClass4SG.A42(this)) {
            A7W(list);
        }
        super.A7X(list);
    }

    public void Ayk(AnonymousClass3ZH r2) {
        super.Ayk(r2);
        this.A0F = true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.A08 = C86634Kw.A0k(getIntent(), "parent_group_jid_to_link");
            this.A00 = getIntent().getIntExtra("entry_point", 3);
            this.A0E = AnonymousClass0x9.A1N(getIntent(), "return_result");
        }
        if (bundle == null && !AnonymousClass4SG.A44(this) && !this.A0A.A00()) {
            RequestPermissionActivity.A0d(this, R.string.f11nameremoved, R.string.f11nameremoved, false);
        }
        if (this.A0R != null && AnonymousClass4SG.A42(this)) {
            this.A0R.A07.setTrailingButtonIcon(C140046t4.A00);
            this.A0R.A07.setHint((int) R.string.f11nameremoved);
        }
    }

    public GroupMembersSelector() {
        this(0);
        this.A0F = false;
        this.A0E = false;
    }
}
