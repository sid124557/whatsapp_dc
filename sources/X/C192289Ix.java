package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.9Ix  reason: invalid class name and case insensitive filesystem */
public final class C192289Ix extends C34771vn {
    public static final ArrayList A0F = C18260x0.A0C("0", "1");
    public static final ArrayList A0G = C1899593h.A0e("ACTIVE", "ARCHIVED", "INACTIVE");
    public final AnonymousClass36K A00;
    public final AnonymousClass36K A01;
    public final C192019Hu A02;
    public final AnonymousClass9Hv A03;
    public final C192029Hw A04;
    public final Long A05;
    public final Long A06;
    public final Long A07;
    public final Long A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public C192289Ix(AnonymousClass36K r25, AnonymousClass9IW r26) {
        AnonymousClass36K r14 = r25;
        AnonymousClass36K A022 = C41032Ir.A02(r14, r26);
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        Class<String> cls2 = cls;
        Long l = A0R;
        Long l2 = A0S;
        C626836d.A06(r14, cls2, l, l2, C626836d.A06(A022, cls, A0R, A0S, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
        String[] strArr = {"account", "offer", PublicKeyCredentialControllerUtility.JSON_KEY_ID};
        Class<Long> cls3 = Long.class;
        Long A0U = AnonymousClass0x2.A0U();
        C626836d.A06(r14, cls3, A0U, l2, (Object) null, strArr, false);
        AnonymousClass36K r17 = r14;
        Class<String> cls4 = cls;
        Long l3 = A0U;
        Long l4 = A0S;
        this.A0E = (String) C626836d.A06(r17, cls4, l3, l4, (Object) null, new String[]{"account", "offer", "title"}, false);
        this.A09 = (String) C626836d.A06(r17, cls4, l3, l4, (Object) null, new String[]{"account", "offer", "description"}, false);
        this.A0B = (String) C626836d.A06(r17, cls4, l3, l4, (Object) null, new String[]{"account", "offer", "fine_print_url"}, false);
        this.A0D = (String) C626836d.A06(r17, cls4, l3, l4, (Object) null, new String[]{"account", "offer", "terms_url"}, false);
        Long l5 = A0S;
        this.A07 = (Long) C626836d.A06(r14, cls3, A0U, l5, (Object) null, new String[]{"account", "offer", "redeem_limit"}, false);
        this.A08 = (Long) C626836d.A06(r14, cls3, A0U, l5, (Object) null, new String[]{"account", "offer", "start_ts"}, false);
        this.A06 = (Long) C626836d.A06(r14, cls3, A0U, l5, (Object) null, new String[]{"account", "offer", "end_ts"}, false);
        C626836d.A06(r14, cls3, A0U, l5, (Object) null, new String[]{"account", "offer", "version"}, false);
        this.A05 = (Long) C626836d.A05(r14, cls3, AnonymousClass0x2.A0T(), l5, (Object) null, new String[]{"account", "offer", "eligibility", "receiver", "max_from_sender"}, false);
        this.A0C = C626836d.A0A(r14, A0G, new String[]{"account", "offer", "state"});
        this.A0A = C626836d.A09(r14, A0F, new String[]{"account", "offer", "eligibility", "receiver", "usync_pay_eligible_offers_includes_current_offer_id"});
        this.A04 = (C192029Hw) C626836d.A04(r14, new C205029qJ(38), new String[]{"account", "offer", "offer_amount"});
        this.A03 = (AnonymousClass9Hv) C626836d.A04(r14, new C205019qI(A022, 7), new String[0]);
        this.A02 = (C192019Hu) C626836d.A03(r14, new C205029qJ(39), new String[]{"account", "offer", "eligibility", "payment", "min_amount"});
        this.A00 = r14;
        this.A01 = (AnonymousClass36K) C626836d.A0B(r14, new C205029qJ(40), new String[]{"account", "offer"}, 1, 1).get(0);
        this.A00 = (AnonymousClass36K) C626836d.A0B(r14, new C205029qJ(41), new String[]{"account", "offer", "eligibility", "receiver"}, 1, 1).get(0);
    }
}
