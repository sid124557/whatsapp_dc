package X;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.2dN  reason: invalid class name and case insensitive filesystem */
public class C47512dN {
    public final SharedPreferences A00;
    public final AnonymousClass2DD A01;
    public final AnonymousClass2DE A02;
    public final C56612sH A03;
    public final AnonymousClass4FV A04;
    public final AnonymousClass31C A05;
    public final C387829f A06 = new C387829f();
    public final C387929g A07 = new C387929g();
    public final C388029h A08 = new C388029h();
    public final C388129i A09 = new C388129i();
    public final C388229j A0A = new C388229j();
    public final C388329k A0B = new C388329k();
    public final C388429l A0C = new C388429l();

    public AnonymousClass2U3 A00(C833648c r33, Integer num, Integer num2, Set set) {
        AnonymousClass2DE r4 = this.A02;
        C61182zq r11 = new C61182zq(this.A00, C64333Db.A2p(r4.A00.A01), Integer.toString(num.intValue()));
        C129526aS copyOf = C129526aS.copyOf((Collection) set);
        C387929g r14 = this.A07;
        C388129i r13 = this.A09;
        C64333Db r5 = this.A01.A00.A01;
        C56612sH A2p = C64333Db.A2p(r5);
        C160667o6 builderWithExpectedSize = AnonymousClass8OQ.builderWithExpectedSize(10);
        AnonymousClass3YK r2 = (AnonymousClass3YK) r5.AXf.get();
        C162457s7.A0J(r2, 0);
        builderWithExpectedSize.put("whatsapp_biz_integrity_survey_eligibility", r2);
        AnonymousClass3Y8 r1 = new AnonymousClass3Y8((C56982ss) r5.A5B.get());
        C615931l.A00(r1);
        builderWithExpectedSize.put("whatsapp_user_contact_with_no_chat", r1);
        AnonymousClass3YD r12 = new AnonymousClass3YD((C56612sH) r5.ASO.get(), (AnonymousClass33p) r5.Aaj.get());
        C615931l.A00(r12);
        builderWithExpectedSize.put("whatsapp_user_rendered_inorganic_notification", r12);
        AnonymousClass3YJ r17 = new AnonymousClass3YJ((C56962sq) r5.A2b.get(), (C56612sH) r5.ASO.get(), (C55152pt) r5.AWi.get(), (C620233e) r5.AWq.get(), (AnonymousClass1R1) r5.A56.get());
        C615931l.A00(r17);
        builderWithExpectedSize.put("whatsapp_user_unread_story", r17);
        AnonymousClass3YA r15 = (AnonymousClass3YA) r5.AGx.get();
        C162457s7.A0J(r15, 0);
        builderWithExpectedSize.put("whatsapp_active_status_setting", r15);
        AnonymousClass3Y9 r16 = (AnonymousClass3Y9) r5.A3g.get();
        C162457s7.A0J(r16, 0);
        builderWithExpectedSize.put("whatsapp_smb_user_has_profile_picture", r16);
        AnonymousClass3YB r18 = (AnonymousClass3YB) r5.AH0.get();
        C162457s7.A0J(r18, 0);
        builderWithExpectedSize.put("whatsapp_smb_is_fb_app_installed", r18);
        AnonymousClass3YH r19 = (AnonymousClass3YH) r5.AGz.get();
        C162457s7.A0J(r19, 0);
        builderWithExpectedSize.put("whatsapp_user_has_exited_group", r19);
        AnonymousClass3YI r110 = (AnonymousClass3YI) r5.AH1.get();
        C162457s7.A0J(r110, 0);
        builderWithExpectedSize.put("whatsapp_user_has_removed_profile_photo_first_time", r110);
        AnonymousClass3YE r111 = (AnonymousClass3YE) r5.AGy.get();
        C162457s7.A0J(r111, 0);
        builderWithExpectedSize.put("whatsapp_smb_user_eligible_for_business_search", r111);
        C42972Qg r10 = new C42972Qg(A2p, r11, (AnonymousClass3YC) r5.AOQ.get(), builderWithExpectedSize.build());
        C388029h r9 = this.A08;
        C388329k r8 = this.A0B;
        C387829f r7 = this.A06;
        C388429l r6 = this.A0C;
        C388229j r52 = this.A0A;
        C56612sH r122 = this.A03;
        long currentTimeMillis = System.currentTimeMillis();
        return new AnonymousClass2U3(copyOf, r10, r7, r14, r9, r13, r52, r8, r6, new C45692aQ(r122, this.A04, this.A05), r11, r33, currentTimeMillis, (long) (num2.intValue() * 1000));
    }

    public C47512dN(AnonymousClass2DD r2, AnonymousClass2DE r3, C56612sH r4, AnonymousClass4FV r5, AnonymousClass31C r6, C60152y5 r7) {
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r7.A03("com.whatsapp.psa.qp_surface");
        this.A01 = r2;
        this.A02 = r3;
    }
}
