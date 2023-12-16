package com.whatsapp.xfamily.groups.ui;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass2J4;
import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C107695bk;
import X.C111145hc;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C56892sj;
import X.C64333Db;
import X.C88834as;
import X.C89634eX;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

public final class GroupMembersSelectorActivity extends C89634eX {
    public int A00;
    public C56892sj A01;
    public AnonymousClass2J4 A02;
    public C111145hc A03;
    public String A04;
    public List A05;
    public Map A06;
    public boolean A07;

    public void A5r() {
        if (!this.A07) {
            this.A07 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3T(r2, r1, this);
            AnonymousClass4SG.A3M(A2W, r2, this, r2.A6O.get());
            this.A02 = (AnonymousClass2J4) r2.Abw.get();
            this.A06 = r1.AQT();
            this.A01 = C64333Db.A3G(r2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 11) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
                return;
            } else if (i2 != -1) {
                Log.i("GroupMembersSelectorActivity/contact access permissions denied");
            } else {
                return;
            }
        } else if (i2 == -1) {
            Log.i("GroupMembersSelectorActivity/create new group result ok");
            setResult(-1, intent);
        }
        finish();
    }

    public GroupMembersSelectorActivity(int i) {
        this.A07 = false;
        AnonymousClass68W.A00(this, 117);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Map map = this.A06;
        if (map != null) {
            Object A0i = AnonymousClass001.A0i(map, 1004342578);
            if (A0i != null) {
                this.A03 = (C111145hc) A0i;
                AnonymousClass2J4 r0 = this.A02;
                if (r0 != null) {
                    if (!r0.A00.A0X(3989)) {
                        AnonymousClass0x2.A0m(this, C18320x8.A07().putExtra("is_success", false));
                    }
                    if (getIntent() != null) {
                        this.A00 = getIntent().getIntExtra("entry_point", 11);
                        this.A04 = getIntent().getStringExtra("event_name");
                    }
                    if (bundle == null && !this.A0A.A00()) {
                        RequestPermissionActivity.A0d(this, R.string.f11nameremoved, R.string.f11nameremoved, false);
                    }
                    C111145hc r1 = this.A03;
                    if (r1 == null) {
                        throw C18270x1.A0S("xFamilyUserFlowLogger");
                    }
                    r1.A05("SEE_ADD_PARTICIPANTS");
                    return;
                }
                throw C18270x1.A0S("xFamilyGating");
            }
            throw C18290x4.A0Y();
        }
        throw C18270x1.A0S("xFamilyUserFlowLoggers");
    }

    public GroupMembersSelectorActivity() {
        this(0);
    }
}
