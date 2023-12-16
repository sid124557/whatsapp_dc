package com.whatsapp.group;

import X.AnonymousClass11M;
import X.AnonymousClass11N;
import X.AnonymousClass1Ha;
import X.AnonymousClass1XO;
import X.AnonymousClass2CL;
import X.AnonymousClass31C;
import X.AnonymousClass34R;
import X.AnonymousClass4FV;
import X.AnonymousClass4J4;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass5ZU;
import X.AnonymousClass61T;
import X.AnonymousClass61U;
import X.AnonymousClass61V;
import X.AnonymousClass61W;
import X.AnonymousClass61X;
import X.AnonymousClass61Y;
import X.AnonymousClass61Z;
import X.AnonymousClass8YB;
import X.AnonymousClass93G;
import X.C005205m;
import X.C06270Wx;
import X.C1001359q;
import X.C107695bk;
import X.C1215661a;
import X.C1215761b;
import X.C1215861c;
import X.C1215961d;
import X.C1216061e;
import X.C1216161f;
import X.C1216261g;
import X.C1230566x;
import X.C162457s7;
import X.C179378j3;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C27991fJ;
import X.C28891hw;
import X.C48252eb;
import X.C50932j0;
import X.C54442oj;
import X.C56072rN;
import X.C56892sj;
import X.C56982ss;
import X.C626936e;
import X.C64333Db;
import X.C64773Ex;
import X.C66493Lq;
import X.C66503Lr;
import X.C86144Iz;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86664Kz;
import X.C88834as;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.grouphistory.xmpp.EnableGroupHistoryProtocolHelper;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import java.util.List;

public final class GroupPermissionsActivity extends C89644eZ implements C179378j3 {
    public AnonymousClass2CL A00;
    public C64773Ex A01;
    public AnonymousClass5ZU A02;
    public C56982ss A03;
    public C28891hw A04;
    public C54442oj A05;
    public C56892sj A06;
    public AnonymousClass4FV A07;
    public C66493Lq A08;
    public C50932j0 A09;
    public GroupPermissionsLayout A0A;
    public C1230566x A0B;
    public C66503Lr A0C;
    public EnableGroupHistoryProtocolHelper A0D;
    public C27991fJ A0E;
    public AnonymousClass31C A0F;
    public C48252eb A0G;
    public RtaXmppClient A0H;
    public C56072rN A0I;
    public boolean A0J;

    public static final void A0C(Bundle bundle, GroupPermissionsActivity groupPermissionsActivity) {
        C162457s7.A0J(bundle, 2);
        boolean z = bundle.getBoolean("is_approve_all_pending_requests");
        C1230566x r0 = groupPermissionsActivity.A0B;
        if (z) {
            if (r0 == null) {
                throw C18270x1.A0S("viewModel");
            }
            r0.BPd();
        } else if (r0 == null) {
            throw C18270x1.A0S("viewModel");
        } else {
            r0.BZi();
        }
    }

    public static final void A0L(Bundle bundle, GroupPermissionsActivity groupPermissionsActivity) {
        C162457s7.A0J(bundle, 2);
        boolean z = bundle.getBoolean("is_approve_all_pending_requests");
        C1230566x r0 = groupPermissionsActivity.A0B;
        if (z) {
            if (r0 == null) {
                throw C18270x1.A0S("viewModel");
            }
            r0.BPg();
        } else if (r0 == null) {
            throw C18270x1.A0S("viewModel");
        } else {
            r0.BZk();
        }
    }

    public static final void A0X(Bundle bundle, GroupPermissionsActivity groupPermissionsActivity) {
        C162457s7.A0J(bundle, 2);
        boolean z = bundle.getBoolean("clear_all_admin_reviews");
        C1230566x r0 = groupPermissionsActivity.A0B;
        if (r0 == null) {
            throw C86604Kt.A0j();
        }
        r0.Ba2(z);
    }

    public void A5r() {
        if (!this.A0J) {
            this.A0J = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r3 = A2X.A4Z;
            AnonymousClass4SG.A3W(r3, this);
            C107695bk r1 = r3.A00;
            AnonymousClass4SG.A3Q(r3, r1, this, AnonymousClass4SG.A2t(r3, r1, this));
            this.A03 = C64333Db.A39(r3);
            this.A07 = C64333Db.A4H(r3);
            this.A0H = A2X.AD6();
            this.A0F = C64333Db.A5u(r3);
            this.A01 = C64333Db.A26(r3);
            this.A02 = C64333Db.A28(r3);
            this.A0I = C64333Db.A8w(r3);
            this.A08 = C64333Db.A5A(r3);
            this.A0C = (C66503Lr) r3.AGs.get();
            this.A0G = r3.Aqe();
            this.A04 = C86614Ku.A0Y(r3);
            this.A09 = C86664Kz.A1A(r3);
            this.A06 = C64333Db.A3G(r3);
            this.A0D = new EnableGroupHistoryProtocolHelper(C86614Ku.A0c(r3));
            this.A05 = (C54442oj) r3.AGZ.get();
            this.A00 = (AnonymousClass2CL) A2X.A0b.get();
        }
    }

    public GroupPermissionsActivity(int i) {
        this.A0J = false;
        C86604Kt.A1K(this, 45);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 17 && intent != null && i2 == -1) {
            List A12 = C86634Kw.A12(intent, UserJid.class, "jids");
            C1230566x r0 = this.A0B;
            if (r0 == null) {
                throw C86604Kt.A0j();
            }
            r0.B2H(this, A12);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass1Ha.A1z(this);
        this.A0A = (GroupPermissionsLayout) C18290x4.A0L(this, R.id.group_settings_root);
        this.A0E = C27991fJ.A01.A07(getIntent().getStringExtra("gid"));
        if (this.A0D.A0X(6356)) {
            int intExtra = getIntent().getIntExtra("entry_point", 6);
            AnonymousClass1XO r2 = new AnonymousClass1XO();
            r2.A00 = Integer.valueOf(intExtra);
            C27991fJ r1 = this.A0E;
            if (r1 != null && AnonymousClass34R.A06(r1.user)) {
                r2.A01 = r1.getRawString();
            }
            AnonymousClass4FV r0 = this.A07;
            if (r0 != null) {
                r0.BhD(r2);
            } else {
                throw C18270x1.A0S("wamRuntime");
            }
        }
        C27991fJ r22 = this.A0E;
        setTitle(R.string.f11nameremoved);
        if (r22 != null) {
            this.A0B = (C1230566x) AnonymousClass4L0.A0F(new AnonymousClass4J4(this, 4, r22), this).A01(AnonymousClass11N.class);
        } else {
            Bundle bundleExtra = getIntent().getBundleExtra("setting_values");
            C626936e.A06(bundleExtra);
            this.A0B = (C1230566x) AnonymousClass4L0.A0F(new C86144Iz(bundleExtra, 4), this).A01(AnonymousClass11M.class);
            setResult(-1, C18320x8.A07().putExtra("setting_values", bundleExtra));
        }
        C1230566x r02 = this.A0B;
        if (r02 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r02.BC9(), new C1215761b(this), 234);
        C1230566x r03 = this.A0B;
        if (r03 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r03.BD0(), new AnonymousClass8YB(this), 235);
        C1230566x r04 = this.A0B;
        if (r04 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r04.B8a(), new C1215861c(this), 236);
        C1230566x r05 = this.A0B;
        if (r05 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r05.B8b(), new C1215961d(this), 237);
        C1230566x r06 = this.A0B;
        if (r06 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r06.B8f(), new C1216061e(this), 238);
        C1230566x r07 = this.A0B;
        if (r07 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r07.B8V(), new C1216161f(this), 239);
        C1230566x r08 = this.A0B;
        if (r08 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r08.B8U(), new C1216261g(this), 240);
        C1230566x r09 = this.A0B;
        if (r09 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r09.B4I(), new AnonymousClass61T(this), 241);
        C1230566x r010 = this.A0B;
        if (r010 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r010.BCz(), new AnonymousClass61U(this), 242);
        C1230566x r011 = this.A0B;
        if (r011 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r011.BD1(), new AnonymousClass61V(this), 243);
        C1230566x r012 = this.A0B;
        if (r012 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r012.B8W(), new AnonymousClass61W(this), 244);
        C1230566x r013 = this.A0B;
        if (r013 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r013.B8g(), new AnonymousClass61X(this), 245);
        C1230566x r014 = this.A0B;
        if (r014 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r014.B8Z(), new AnonymousClass61Y(this), 246);
        C1230566x r015 = this.A0B;
        if (r015 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r015.B8e(), new AnonymousClass61Z(this), 247);
        C1230566x r016 = this.A0B;
        if (r016 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C86604Kt.A1N(this, r016.B8d(), new C1215661a(this), 248);
        C1230566x r017 = this.A0B;
        if (r017 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C06270Wx B8Y = r017.B8Y();
        GroupPermissionsLayout groupPermissionsLayout = this.A0A;
        if (groupPermissionsLayout == null) {
            throw C18270x1.A0S("groupPermissionsLayout");
        }
        C86604Kt.A1N(this, B8Y, C1001359q.A00(groupPermissionsLayout, 28), 249);
        C1230566x r018 = this.A0B;
        if (r018 == null) {
            throw C18270x1.A0S("viewModel");
        }
        C06270Wx B8X = r018.B8X();
        GroupPermissionsLayout groupPermissionsLayout2 = this.A0A;
        if (groupPermissionsLayout2 == null) {
            throw C18270x1.A0S("groupPermissionsLayout");
        }
        C86604Kt.A1N(this, B8X, C1001359q.A00(groupPermissionsLayout2, 29), 250);
        GroupPermissionsLayout groupPermissionsLayout3 = this.A0A;
        if (groupPermissionsLayout3 == null) {
            throw C18270x1.A0S("groupPermissionsLayout");
        }
        groupPermissionsLayout3.setClickEventListener(this);
        C18310x6.A18(C005205m.A00(this, R.id.manage_admins), this, 40);
        getSupportFragmentManager().A0j(new AnonymousClass93G(this, 3), this, "group_join_request_approve_all_pending_requests");
        getSupportFragmentManager().A0j(new AnonymousClass93G(this, 4), this, "group_join_request_group_too_full");
        getSupportFragmentManager().A0j(new AnonymousClass93G(this, 2), this, "confirm_clear_admin_reviews_dialog_result");
    }

    public GroupPermissionsActivity() {
        this(0);
    }
}
