package com.whatsapp.bridge.wfs.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0PJ;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass2PZ;
import X.AnonymousClass2VJ;
import X.AnonymousClass33p;
import X.AnonymousClass36l;
import X.AnonymousClass4CV;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass5J0;
import X.C005205m;
import X.C103365Mp;
import X.C107635bd;
import X.C107695bk;
import X.C111145hc;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C39492Ce;
import X.C43842Tr;
import X.C47432dF;
import X.C48422es;
import X.C50672ia;
import X.C53652nR;
import X.C56142rU;
import X.C56492s4;
import X.C56502s5;
import X.C56612sH;
import X.C56912sl;
import X.C58752vl;
import X.C621133n;
import X.C626936e;
import X.C627736r;
import X.C635239o;
import X.C64333Db;
import X.C69263Wi;
import X.C71483cB;
import X.C86604Kt;
import X.C86614Ku;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.registration.RegisterPhone;
import java.util.HashMap;
import java.util.Map;

public final class LinkedUsersActivity extends RegisterPhone implements AnonymousClass4CV {
    public C56492s4 A00;
    public C103365Mp A01;
    public C43842Tr A02;
    public Map A03;
    public boolean A04;

    public void Bfm(AnonymousClass0PJ r20, Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        AnonymousClass0PJ r11 = r20;
        C162457s7.A0J(r11, 3);
        Map map = this.A03;
        if (map != null) {
            Object A0i = AnonymousClass001.A0i(map, 551495536);
            if (A0i != null) {
                C111145hc r2 = (C111145hc) A0i;
                if (this.A0C.A0X(4972)) {
                    AnonymousClass33p r0 = this.A09;
                    String str7 = (String) r11.A00;
                    String str8 = (String) r11.A01;
                    r0.A1j(str7, str8);
                    r2.A05("PRECHAT_TEST");
                    C56502s5 r1 = this.A0P;
                    int i2 = i;
                    if (i2 == 2) {
                        str6 = "wfs_ig";
                    } else {
                        str6 = "wfs_fb";
                    }
                    r1.A03("wfs", str6);
                    getIntent().putExtra("should_show_notif", true);
                    super.A7E();
                    getIntent().removeExtra("should_show_notif");
                    BjL();
                    C005205m.A00(this, R.id.container).setVisibility(0);
                    AnonymousClass33p r22 = this.A09;
                    C18270x1.A0i(C18270x1.A03(r22), "eula_accepted_time", System.currentTimeMillis());
                    String str9 = str4;
                    if (!(str4 == null || str9.length() == 0)) {
                        ImageView A0u = C86664Kz.A0u(this, R.id.linked_user_logo);
                        C69263Wi r10 = this.A05;
                        C56492s4 r3 = this.A00;
                        if (r3 != null) {
                            new C47432dF(r10, r3, this.A0I, AnonymousClass002.A0A(A0u.getContext().getCacheDir(), "linked_user_cache"), "linked_user_image").A01().A03(A0u, str9);
                        } else {
                            throw C18270x1.A0S("statistics");
                        }
                    }
                    C005205m.A01(this, R.id.number_view).setText(AnonymousClass36l.A0C(str7, str8));
                    View A002 = C005205m.A00(this, R.id.linked_user_login);
                    A002.setEnabled(true);
                    A002.setOnClickListener(new C635239o(r11, this, num, str, str2, str3, str5, i2));
                    return;
                }
                r2.A05("PRECHAT_CONTROL");
                r2.A01();
                A7L();
                return;
            }
            throw C18290x4.A0Y();
        }
        throw C18270x1.A0S("xFamilyUserFlowLoggers");
    }

    public void Bfn(C58752vl r5, String str, String str2) {
        boolean A1Y = AnonymousClass0x2.A1Y(str, str2);
        C162457s7.A0J(r5, 2);
        A7M(r5, str, str2);
        this.A0M.A0B(2, A1Y);
        this.A0J.A08(false);
        this.A0M.A04();
        super.A79(str, str2, r5.A02);
    }

    public void onCreate(Bundle bundle) {
        getIntent().putExtra("should_show_notif", false);
        super.onCreate(bundle);
        getIntent().removeExtra("should_show_notif");
        setContentView((int) R.layout.f8nameremoved);
        C005205m.A00(this, R.id.linked_user_login).setEnabled(false);
        C18290x4.A1H(C005205m.A00(this, R.id.linked_user_different), this, 15);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0L(this, R.id.tos_view);
        HashMap A0t = AnonymousClass001.A0t();
        Uri A012 = this.A03.A01("https://www.whatsapp.com/legal/privacy-policy", false);
        C162457s7.A0D(A012);
        A0t.put("privacy-policy", A012);
        Uri A013 = this.A03.A01("https://www.whatsapp.com/legal/terms-of-service", false);
        C162457s7.A0D(A013);
        A0t.put("terms-and-privacy-policy", A013);
        AnonymousClass1VX r9 = this.A0D;
        C107635bd.A0G(this, this.A00, this.A05, textEmojiLabel, this.A08, r9, getString(R.string.f11nameremoved), A0t);
        textEmojiLabel.setHighlightColor(0);
        BpA(0, R.string.f11nameremoved);
        C43842Tr r3 = this.A02;
        if (r3 != null) {
            C53652nR r2 = this.A0F;
            C162457s7.A0C(r2);
            r3.A0A.BkP(new C71483cB(this, this, r3, r2));
            return;
        }
        throw C18270x1.A0S("wfsManager");
    }

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r3 = A2X.A4Z;
            AnonymousClass4SG.A3W(r3, this);
            C107695bk r2 = r3.A00;
            AnonymousClass4SG.A3Q(r3, r2, this, AnonymousClass4SG.A2t(r3, r2, this));
            AnonymousClass4SG.A3U(r3, r2, this);
            AnonymousClass4SG.A3V(r3, r2, this);
            this.A0A = C64333Db.A2r(r3);
            AnonymousClass4SG.A3J(A2X, r3, C86614Ku.A0O(r3), this);
            AnonymousClass4SG.A3H(A2X, r3, r2, C86654Ky.A0Y(r3), this);
            AnonymousClass4SG.A3I(A2X, r3, r2, C64333Db.A74(r3), this);
            AnonymousClass4FS A0g = C86604Kt.A0g(r3);
            C69263Wi A0K = C86614Ku.A0K(r3);
            C39492Ce r5 = (C39492Ce) A2X.A2D.get();
            C50672ia r13 = (C50672ia) r3.A8z.get();
            C621133n r12 = (C621133n) r3.AW5.get();
            C56612sH A0V = C86604Kt.A0V(r3);
            C56142rU r14 = (C56142rU) r3.A05.get();
            AnonymousClass33p A0W = C86614Ku.A0W(r3);
            this.A02 = new C43842Tr(A0K, C86614Ku.A0O(r3), new AnonymousClass2PZ(r5, (AnonymousClass2VJ) r3.ADu.get(), (C48422es) r3.A00.ACG.get(), r3.A00.AQT()), A0V, A0W, r12, r13, r14, (C56912sl) r3.ATe.get(), (C56502s5) r3.A00.A5N.get(), A0g, r3.A00.AQT());
            this.A00 = C64333Db.A07(r3);
            this.A01 = (C103365Mp) r2.ACF.get();
            this.A03 = r2.AQT();
        }
    }

    public final void A7L() {
        C103365Mp r0 = this.A01;
        if (r0 != null) {
            AnonymousClass5J0 A012 = r0.A01();
            C626936e.A06(A012);
            A012.A01 = false;
            this.A0M.A0B(0, true);
            startActivity(C627736r.A01(this));
            finish();
            return;
        }
        throw C18270x1.A0S("wfsBridgeFactory");
    }

    public final void A7M(C58752vl r4, String str, String str2) {
        this.A09.A1j(str, str2);
        this.A09.A1t(r4.A03);
        this.A09.A1s(false);
        C18270x1.A0l(C18270x1.A03(this.A09), "first_party_migration_initiated", false);
        this.A0M.A0D(str, str2, r4.A02);
    }

    public LinkedUsersActivity(int i) {
        this.A04 = false;
        C86604Kt.A1K(this, 20);
    }

    public LinkedUsersActivity() {
        this(0);
    }
}
