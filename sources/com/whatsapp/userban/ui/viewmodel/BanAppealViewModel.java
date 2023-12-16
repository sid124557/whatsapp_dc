package com.whatsapp.userban.ui.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass317;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.AnonymousClass4KV;
import X.AnonymousClass4UC;
import X.AnonymousClass5WY;
import X.AnonymousClass5X8;
import X.C009707r;
import X.C05550Ty;
import X.C05680Um;
import X.C06270Wx;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C27211dS;
import X.C51072jE;
import X.C53742na;
import X.C626936e;
import X.C627736r;
import X.C64333Db;
import X.C66433Lk;
import X.C70363aN;
import android.app.Activity;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class BanAppealViewModel extends C05550Ty {
    public int A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass5WY A03;
    public final AnonymousClass5X8 A04;
    public final AnonymousClass33T A05;
    public final AnonymousClass317 A06;
    public final C51072jE A07;
    public final C66433Lk A08;
    public final C53742na A09;
    public final AnonymousClass4UC A0A = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0B = AnonymousClass0x9.A0b();

    public void A0E() {
        Log.i("BanAppealViewModel/fetchBanAppealStatus");
        C53742na r4 = this.A09;
        C06270Wx.A03(this.A0B, A0D(r4.A00(), false));
        int A002 = this.A07.A00();
        C18260x0.A0y("BanAppealViewModel/verifyIfPhoneNumberIsVerified reg_state: ", AnonymousClass001.A0o(), A002);
        if (A002 == 10) {
            Log.i("BanAppealViewModel/fetchBanAppealStatus trying to fetch ban appeal status");
            AnonymousClass4KV r3 = new AnonymousClass4KV(this, 0);
            String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(r4.A04), "support_ban_appeal_token");
            if (A0Z == null) {
                r3.BSq(C18290x4.A0a());
                return;
            }
            C64333Db r0 = r4.A01.A00.A01;
            AnonymousClass1VX A4B = C64333Db.A4B(r0);
            r4.A06.BkM(new C70363aN(r4, new C27211dS(C64333Db.A07(r0), C64333Db.A2s(r0), A4B, C64333Db.A7R(r0), C64333Db.A9V(r0), A0Z, r0.AFR, r0.A1y), r3, 24));
            return;
        }
        Log.i("BanAppealViewModel/fetchBanAppealStatus returning since phone number not verified yet");
    }

    public void A0F() {
        if (this.A00 != 2 || !C18280x3.A1W(AnonymousClass0x2.A0F(this.A09.A04), "support_ban_appeal_user_banned_from_chat_disconnect")) {
            this.A0A.A0H(Boolean.TRUE);
        } else {
            C06270Wx.A03(this.A0B, 1);
        }
    }

    public void A0G(Activity activity, boolean z) {
        this.A05.A05(42, "BanAppealActivity");
        this.A06.A01();
        AnonymousClass33p r2 = this.A09.A04;
        C18270x1.A0g(C18270x1.A03(r2), "support_ban_appeal_state");
        C18270x1.A0g(C18270x1.A03(r2), "support_ban_appeal_token");
        C18270x1.A0g(C18270x1.A03(r2), "support_ban_appeal_violation_type");
        C18270x1.A0g(C18270x1.A03(r2), "support_ban_appeal_unban_reason");
        C18270x1.A0g(C18270x1.A03(r2), "support_ban_appeal_unban_reason_url");
        if (!z) {
            C18270x1.A0g(C18270x1.A03(r2), "support_ban_appeal_user_banned_from_chat_disconnect");
        }
        Log.i("BanAppealRepository/clearFormReviewDraft");
        C18270x1.A0g(C18270x1.A03(r2), "support_ban_appeal_form_review_draft");
        activity.startActivity(C627736r.A01(activity));
        C05680Um.A00(activity);
    }

    public BanAppealViewModel(AnonymousClass5WY r2, AnonymousClass5X8 r3, AnonymousClass33T r4, AnonymousClass317 r5, C51072jE r6, C66433Lk r7, C53742na r8) {
        this.A03 = r2;
        this.A04 = r3;
        this.A08 = r7;
        this.A09 = r8;
        this.A06 = r5;
        this.A05 = r4;
        this.A07 = r6;
    }

    public static void A00(Activity activity, boolean z) {
        C626936e.A06(activity);
        AnonymousClass0R8 supportActionBar = ((C009707r) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(z);
            int i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
            supportActionBar.A0B(i);
        }
    }

    public final int A0D(String str, boolean z) {
        String str2;
        switch (str.hashCode()) {
            case -358171056:
                str2 = "UNKNOWN_IN_CLIENT";
                break;
            case 272787191:
                if (str.equals("UNBANNED")) {
                    return 4;
                }
                break;
            case 527514546:
                if (str.equals("IN_REVIEW")) {
                    if (!z) {
                        return 1;
                    }
                    return 3;
                }
                break;
            case 1166090011:
                str2 = "NO_APPEAL_OPENED";
                break;
            case 1951953694:
                if (str.equals("BANNED")) {
                    return 5;
                }
                break;
        }
        if (str.equals(str2)) {
            if (this.A00 != 2 || !C18280x3.A1W(AnonymousClass0x2.A0F(this.A09.A04), "support_ban_appeal_user_banned_from_chat_disconnect")) {
                return 1;
            }
            return 2;
        }
        throw AnonymousClass002.A0G(AnonymousClass000.A0V("Invalid BanAppealState: ", str, AnonymousClass001.A0o()));
    }
}
