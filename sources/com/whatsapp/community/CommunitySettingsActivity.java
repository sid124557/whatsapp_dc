package com.whatsapp.community;

import X.AnonymousClass0x2;
import X.AnonymousClass11N;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass29F;
import X.AnonymousClass2CL;
import X.AnonymousClass31C;
import X.AnonymousClass34R;
import X.AnonymousClass41V;
import X.AnonymousClass47z;
import X.AnonymousClass4FV;
import X.AnonymousClass4HY;
import X.AnonymousClass4K2;
import X.AnonymousClass58H;
import X.AnonymousClass5UY;
import X.AnonymousClass5ZU;
import X.AnonymousClass66R;
import X.C107695bk;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C27991fJ;
import X.C28891hw;
import X.C383026z;
import X.C44272Vj;
import X.C48252eb;
import X.C50932j0;
import X.C52882mC;
import X.C54442oj;
import X.C56072rN;
import X.C56892sj;
import X.C56942so;
import X.C56982ss;
import X.C620733j;
import X.C64333Db;
import X.C64773Ex;
import X.C66493Lq;
import X.C66503Lr;
import X.C70193a6;
import X.C77313tC;
import X.C77323tD;
import X.C80213xs;
import X.C88834as;
import X.C89644eZ;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import com.whatsapp.settings.SettingsRowIconText;

public final class CommunitySettingsActivity extends C89644eZ implements AnonymousClass47z {
    public AnonymousClass2CL A00;
    public C44272Vj A01;
    public C56942so A02;
    public C64773Ex A03;
    public AnonymousClass5ZU A04;
    public C56982ss A05;
    public C28891hw A06;
    public C54442oj A07;
    public C56892sj A08;
    public AnonymousClass4FV A09;
    public C66493Lq A0A;
    public C50932j0 A0B;
    public C66503Lr A0C;
    public C27991fJ A0D;
    public AnonymousClass31C A0E;
    public C48252eb A0F;
    public RtaXmppClient A0G;
    public SettingsRowIconText A0H;
    public C56072rN A0I;
    public AnonymousClass5UY A0J;
    public boolean A0K;
    public final AnonymousClass66R A0L;
    public final AnonymousClass66R A0M;
    public final AnonymousClass66R A0N;

    public void A5r() {
        if (!this.A0K) {
            this.A0K = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r1 = A0I2.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A05 = C64333Db.A39(r1);
            this.A09 = C64333Db.A4H(r1);
            this.A0G = A0I2.AD6();
            this.A0E = C64333Db.A5u(r1);
            this.A03 = C64333Db.A26(r1);
            this.A04 = C64333Db.A28(r1);
            this.A0A = C64333Db.A5A(r1);
            this.A0I = C64333Db.A8w(r1);
            this.A0C = (C66503Lr) r1.AGs.get();
            this.A0F = r1.Aqe();
            this.A06 = C64333Db.A3C(r1);
            this.A0B = (C50932j0) r1.AGP.get();
            this.A08 = C64333Db.A3G(r1);
            this.A07 = (C54442oj) r1.AGZ.get();
            this.A00 = (AnonymousClass2CL) A0I2.A0b.get();
            this.A02 = C64333Db.A1k(r1);
            this.A01 = (C44272Vj) r1.A5U.get();
        }
    }

    public CommunitySettingsActivity(int i) {
        this.A0K = false;
        AnonymousClass4HY.A00(this, 35);
    }

    public void onCreate(Bundle bundle) {
        GroupJid groupJid;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C620733j r1 = this.A00;
        C162457s7.A0C(r1);
        AnonymousClass29F.A00(this, (Toolbar) C18290x4.A0L(this, R.id.toolbar), r1, C18290x4.A0l(this, R.string.f11nameremoved));
        this.A0J = AnonymousClass1Ha.A1p(this, R.id.community_settings_permissions_add_members);
        C56942so r0 = this.A02;
        if (r0 != null) {
            AnonymousClass66R r2 = this.A0M;
            C52882mC A002 = r0.A0H.A00((C27991fJ) r2.getValue());
            if (A002 != null) {
                groupJid = A002.A02;
            } else {
                groupJid = null;
            }
            this.A0D = AnonymousClass34R.A01(groupJid);
            if (bundle == null) {
                CommunitySettingsViewModel communitySettingsViewModel = (CommunitySettingsViewModel) this.A0N.getValue();
                C27991fJ r4 = (C27991fJ) r2.getValue();
                C27991fJ r3 = this.A0D;
                AnonymousClass11N r22 = (AnonymousClass11N) this.A0L.getValue();
                C18270x1.A10(r4, 0, r22);
                communitySettingsViewModel.A03 = r4;
                communitySettingsViewModel.A02 = r3;
                C70193a6.A01(communitySettingsViewModel.A0H, communitySettingsViewModel, r4, 11);
                if (r3 != null) {
                    communitySettingsViewModel.A01 = r22;
                    AnonymousClass4K2.A01(r22.A0C, communitySettingsViewModel.A04, new AnonymousClass41V(communitySettingsViewModel), 48);
                }
            }
            SettingsRowIconText settingsRowIconText = (SettingsRowIconText) C18290x4.A0N(this, R.id.community_settings_permissions_add_groups);
            this.A0H = settingsRowIconText;
            if (settingsRowIconText == null) {
                throw C18270x1.A0S("allowNonAdminSubgroupCreation");
            }
            settingsRowIconText.setIcon((Drawable) null);
            SettingsRowIconText settingsRowIconText2 = this.A0H;
            if (settingsRowIconText2 == null) {
                throw C18270x1.A0S("allowNonAdminSubgroupCreation");
            }
            AnonymousClass0x2.A0z(settingsRowIconText2, this, 30);
            AnonymousClass66R r42 = this.A0N;
            AnonymousClass4K2.A00(this, ((CommunitySettingsViewModel) r42.getValue()).A0F, new C383026z(this, 6), 30);
            if (this.A0D != null) {
                AnonymousClass5UY r02 = this.A0J;
                if (r02 == null) {
                    throw C18270x1.A0S("membersAddSettingRow");
                }
                r02.A06(0);
                AnonymousClass5UY r03 = this.A0J;
                if (r03 == null) {
                    throw C18270x1.A0S("membersAddSettingRow");
                }
                ((SettingsRowIconText) r03.A04()).setIcon((Drawable) null);
                AnonymousClass5UY r04 = this.A0J;
                if (r04 == null) {
                    throw C18270x1.A0S("membersAddSettingRow");
                }
                AnonymousClass0x2.A0z(r04.A04(), this, 31);
                AnonymousClass4K2.A00(this, ((CommunitySettingsViewModel) r42.getValue()).A04, new C383026z(this, 7), 31);
            }
            AnonymousClass4K2.A00(this, ((CommunitySettingsViewModel) r42.getValue()).A0G, new C383026z(this, 8), 29);
            return;
        }
        throw C18270x1.A0S("communityChatManager");
    }

    public CommunitySettingsActivity() {
        this(0);
        this.A0M = C154517dI.A00(AnonymousClass58H.NONE, new C80213xs(this));
        this.A0N = C154517dI.A01(new C77323tD(this));
        this.A0L = C154517dI.A01(new C77313tC(this));
    }
}
