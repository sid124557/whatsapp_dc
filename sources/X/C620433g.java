package X;

import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.33g  reason: invalid class name and case insensitive filesystem */
public class C620433g {
    public final Handler A00 = AnonymousClass000.A0A();
    public final C55682qk A01;
    public final C56972sr A02;
    public final C42122Mw A03;
    public final C29291ia A04;
    public final C48372en A05;
    public final C53762nc A06;
    public final C56192ra A07;
    public final AnonymousClass30S A08;
    public final C60922zO A09;
    public final AnonymousClass56I A0A;
    public final C56612sH A0B;
    public final AnonymousClass33p A0C;
    public final C66543Lv A0D;
    public final AnonymousClass1VX A0E;
    public final AnonymousClass31C A0F;
    public final C40662Hg A0G;
    public final AnonymousClass4FS A0H;
    public final C53322mu A0I;
    public final C56402rv A0J;
    public final Set A0K = AnonymousClass002.A0K();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r6.A00 != 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C108985dt r6, X.C108985dt r7) {
        /*
            r5 = 0
            r4 = 1
            if (r7 == 0) goto L_0x001a
            boolean r0 = r7.A0d
            boolean r3 = X.AnonymousClass000.A1S(r0)
            int r2 = r7.A00
            if (r2 != r4) goto L_0x0015
            if (r6 == 0) goto L_0x0015
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x001b
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            return r5
        L_0x001b:
            if (r6 == 0) goto L_0x0031
            boolean r0 = r6.A0d
            if (r0 == 0) goto L_0x0031
            if (r1 != 0) goto L_0x0031
            X.C626936e.A06(r6)
            int r0 = r6.A00
            if (r0 != r4) goto L_0x001a
            X.C626936e.A06(r7)
            if (r2 == r4) goto L_0x001a
            r5 = 1
            return r5
        L_0x0031:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620433g.A00(X.5dt, X.5dt):boolean");
    }

    public AnonymousClass3TS A01(C55682qk r11, UserJid userJid, String str) {
        int A002 = this.A05.A00();
        C56972sr r2 = this.A02;
        Context context = this.A0G.A00.A00;
        AnonymousClass31C r6 = this.A0F;
        return new AnonymousClass3TS(r11, r2, this, this.A04, userJid, r6, (C105255Ue) ((C64333Db) AnonymousClass29x.A00(C64333Db.class, context)).A2Q.get(), str, A002);
    }

    public void A07(AnonymousClass4CL r8, UserJid userJid, boolean z) {
        this.A0H.BkM(new C71643cR(this, userJid, r8, 1, z));
    }

    static {
        TimeUnit.HOURS.toMillis(24);
    }

    public C108985dt A02(UserJid userJid) {
        C105875Wt A012 = this.A0A.A01(userJid);
        if (A012 == null) {
            return null;
        }
        C42122Mw r0 = this.A03;
        C52142kx r6 = new C52142kx();
        C183538qC r3 = r0.A01.A01;
        r6.A00 = C18300x5.A0B(r3).getString("smb_searchability_intent", (String) null);
        r6.A01 = C18300x5.A0B(r3).getString("smb_searchability_status", (String) null);
        ArrayList A0J2 = AnonymousClass002.A0J(C18300x5.A0B(r3).getStringSet("smb_searchability_issues", AnonymousClass002.A0K()));
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            Iterator it = A0J2.iterator();
            while (it.hasNext()) {
                JSONObject A1H = AnonymousClass0x9.A1H(AnonymousClass001.A0m(it));
                String string = A1H.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String string2 = A1H.getString("level");
                C162457s7.A0H(string);
                C162457s7.A0H(string2);
                A0s.add(new C631738f(string, string2));
            }
            r6.A02 = A0s;
        } catch (JSONException unused) {
            Log.e("BusinessAccountSettingsManager/getBusinessAccountSettings invalid issue list JSON");
        }
        A012.A01 = new C633038s(r6.A00, r6.A01, false, r6.A02);
        return A012.A01();
    }

    public String A03(UserJid userJid) {
        Cursor A0A2;
        AnonymousClass56I r1 = this.A0A;
        String str = null;
        if (userJid == null) {
            Log.w("contact-mgr-db/cannot get business description details by null jid");
            return null;
        }
        String rawString = userJid.getRawString();
        AnonymousClass4GK A032 = C18630y0.A03(r1);
        try {
            A0A2 = AnonymousClass361.A0A(A032, "SELECT _id, jid, email, business_description, address, tag, latitude, longitude, vertical, has_catalog, address_postal_code, address_city_id, address_city_name, commerce_experience, shop_url, cart_enabled, commerce_manager_url, direct_connection_enabled, is_shop_banned, default_postcode, location_name, galaxy_business_enabled, cover_photo_url, cover_photo_id, custom_url, member_since, capi_calling_enabled, is_responsive, postcode_type, price_tier_id, business_blocked_status, survey_sampling_rate, is_offerings_eligible, automated_type, welcome_message_protocol_mode FROM wa_biz_profiles WHERE jid = ?", "CONTACT_BIZ_PROFILES", C18270x1.A1b(rawString));
            if (A0A2.moveToFirst()) {
                str = AnonymousClass0x2.A0Z(A0A2, "business_description");
            }
            A0A2.close();
            A032.close();
            return str;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Map A04() {
        Cursor A092;
        AnonymousClass56I r0 = this.A0A;
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass4GK A032 = C18630y0.A03(r0);
        try {
            A092 = AnonymousClass361.A09(A032, "SELECT jid, tag FROM wa_biz_profiles", "CONTACT_BIZ_PROFILES");
            int A012 = AnonymousClass0x9.A01(A092);
            int columnIndexOrThrow = A092.getColumnIndexOrThrow("tag");
            while (A092.moveToNext()) {
                UserJid A002 = AnonymousClass32Y.A00(A092, A012);
                if (A002 != null) {
                    A0t.put(A002, A092.getString(columnIndexOrThrow));
                }
            }
            A092.close();
            A032.close();
            return A0t;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A05(AnonymousClass4CJ r2, UserJid userJid) {
        A06(new C64413Dj(r2, this), userJid);
    }

    public void A06(AnonymousClass499 r6, UserJid userJid) {
        String str;
        C18270x1.A0w(new C33381su(r6, this, userJid), this.A0H);
        this.A08.A06((AnonymousClass49B) null, userJid);
        C53762nc r4 = this.A06;
        String A082 = C56952sp.A08(r4.A06, 1763);
        if (!(userJid == null || (str = userJid.user) == null || !C175728Zm.A0S(A082, str, false))) {
            if (!r4.A01) {
                r4.A01 = true;
                Context context = r4.A03.A00;
                C162457s7.A0D(context);
                C18320x8.A0x(new C85604Gx(r4, 1), context, "android.intent.action.LOCALE_CHANGED", true);
            }
            if (r4.A02()) {
                r4.A01();
            }
        }
        C60922zO r1 = this.A09;
        if (r1.A02(userJid)) {
            r1.A01(userJid);
        }
    }

    public void A08(AnonymousClass4CM r2, UserJid userJid, String str) {
        A01(this.A01, userJid, str).A00(r2);
    }

    public void A09(C108985dt r4, UserJid userJid) {
        if ((this.A05.A00() & 128) > 0 && r4 != null && r4.A0X) {
            this.A07.A02(new C64453Do(this), r4, userJid, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r0.A0g == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C108985dt r9, com.whatsapp.jid.UserJid r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0133
            X.2sr r0 = r8.A02
            boolean r0 = r0.A0a(r10)
            if (r0 == 0) goto L_0x00c7
            X.33p r3 = r8.A0C
            X.2sH r0 = r8.A0B
            long r1 = r0.A0H()
            android.content.SharedPreferences$Editor r3 = X.C18270x1.A03(r3)
            java.lang.String r0 = "smb_last_my_business_profile_sync_time"
            X.C18270x1.A0i(r3, r0, r1)
            X.2Mw r5 = r8.A03
            X.38s r3 = r9.A01
            if (r3 == 0) goto L_0x00c7
            java.lang.String r1 = "incomplete_profile"
            java.lang.String r0 = "warning"
            X.38f r2 = new X.38f
            r2.<init>(r1, r0)
            X.2sr r1 = r5.A00
            r0 = 1
            X.C162457s7.A0J(r1, r0)
            X.5da r0 = r9.A07
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0057
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r9.A0G
            if (r0 == 0) goto L_0x0057
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0057
            X.5dQ r0 = r9.A03
            if (r0 == 0) goto L_0x0057
            X.1RR r0 = X.C56972sr.A01(r1)
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.A0g
            r1 = 1
            if (r0 != 0) goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            java.util.List r4 = r3.A02
            if (r1 == 0) goto L_0x00a3
            r4.remove(r2)
        L_0x005f:
            X.33p r5 = r5.A01
            java.lang.String r2 = r3.A00
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r5)
            java.lang.String r0 = "smb_searchability_intent"
            X.C18270x1.A0j(r1, r0, r2)
            java.lang.String r2 = r3.A01
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r5)
            java.lang.String r0 = "smb_searchability_status"
            X.C18270x1.A0j(r1, r0, r2)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r6 = r4.iterator()
        L_0x0081:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r4 = r6.next()
            X.38f r4 = (X.C631738f) r4
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "id"
            java.lang.String r0 = r4.A01
            r2.put(r1, r0)
            java.lang.String r1 = "level"
            java.lang.String r0 = r4.A00
            r2.put(r1, r0)
            X.AnonymousClass0x7.A1D(r2, r7)
            goto L_0x0081
        L_0x00a3:
            boolean r0 = r4.contains(r2)
            if (r0 != 0) goto L_0x005f
            r4.add(r2)
            goto L_0x005f
        L_0x00ad:
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r5)
            java.util.HashSet r1 = X.AnonymousClass0x9.A15(r7)
            java.lang.String r0 = "smb_searchability_issues"
            X.C18300x5.A15(r2, r0, r1)
            boolean r2 = r3.A03
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r5)
            java.lang.String r0 = "smb_is_profile_edit_disabled"
            X.C18270x1.A0l(r1, r0, r2)
        L_0x00c7:
            X.5dt r3 = r8.A02(r10)
            boolean r0 = r8.A0H(r9, r3)
            if (r0 == 0) goto L_0x00d8
            java.util.Set r0 = java.util.Collections.singleton(r10)
            r8.A0E(r0)
        L_0x00d8:
            boolean r0 = r8.A0G(r9, r3)
            if (r0 == 0) goto L_0x00fe
            java.util.Set r1 = java.util.Collections.singleton(r10)
            X.2mu r0 = r8.A0I
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00fe
            java.util.Iterator r2 = r1.iterator()
        L_0x00ee:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fe
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.3Lv r0 = r8.A0D
            r0.A0M(r1)
            goto L_0x00ee
        L_0x00fe:
            int r0 = r9.A00
            if (r0 != 0) goto L_0x010f
            if (r3 == 0) goto L_0x010f
            int r0 = r3.A00
            if (r0 == 0) goto L_0x010f
            java.util.Set r0 = java.util.Collections.singleton(r10)
            r8.A0D(r0)
        L_0x010f:
            boolean r0 = A00(r9, r3)
            if (r0 == 0) goto L_0x0124
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "business-profile-manager/resetBotWelcomeMessageSentState jid="
            X.C18260x0.A1P(r1, r0, r10)
            X.2rv r1 = r8.A0J
            r0 = 0
            r1.A02(r10, r0)
        L_0x0124:
            X.56I r1 = r8.A0A
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            r0.put(r10, r9)
            r1.A04(r0)
            r8.A09(r9, r10)
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620433g.A0A(X.5dt, com.whatsapp.jid.UserJid):void");
    }

    public void A0B(UserJid userJid) {
        if (userJid != null && A00((C108985dt) null, A02(userJid))) {
            C18260x0.A1P(AnonymousClass001.A0o(), "business-profile-manager/resetBotWelcomeMessageSentState jid=", userJid);
            this.A0J.A02(userJid, false);
        }
        this.A0A.A03(userJid);
    }

    public void A0C(UserJid userJid, boolean z) {
        this.A0H.BkM(new C117665sI(this, userJid, 4, z));
    }

    public boolean A0F() {
        return AnonymousClass001.A1W(this.A05.A00() & 128);
    }

    public final boolean A0G(C108985dt r7, C108985dt r8) {
        AnonymousClass1VX r2 = this.A0E;
        C162457s7.A0J(r2, 0);
        if (r2.A0Y(C58422vE.A02, 4873) && r7 != null && r7.A00 == 1) {
            if (this.A02.A0Y()) {
                if (r8 == null) {
                    UserJid userJid = r7.A08;
                    if (userJid == null || this.A0I.A02.A00(userJid) == -1) {
                        return true;
                    }
                    Log.d("BusinessProfileManager/isUpdatedToFirstPartyBot companion first init");
                }
            } else if (r8 == null) {
                return true;
            }
            if (r8.A00 != 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0H(C108985dt r7, C108985dt r8) {
        if (AnonymousClass75P.A00(this.A0E) && r7 != null && r7.A00 == 2) {
            if (this.A02.A0Y()) {
                if (r8 == null) {
                    UserJid userJid = r7.A08;
                    if (userJid == null || this.A0I.A02.A00(userJid) == -1) {
                        return true;
                    }
                    Log.d("BusinessProfileManager/isUpdatedToThirdPartyBot companion first init");
                }
            } else if (r8 == null) {
                return true;
            }
            if (r8.A00 != 2) {
                return true;
            }
        }
        return false;
    }

    public C620433g(C55682qk r3, C56972sr r4, C42122Mw r5, C29291ia r6, C48372en r7, C53762nc r8, C56192ra r9, AnonymousClass30S r10, C60922zO r11, C56612sH r12, AnonymousClass33p r13, C66543Lv r14, AnonymousClass1VX r15, AnonymousClass31C r16, C40662Hg r17, AnonymousClass4FS r18, C53322mu r19, C56402rv r20, AnonymousClass1RI r21) {
        this.A0B = r12;
        this.A0E = r15;
        this.A02 = r4;
        this.A0H = r18;
        this.A01 = r3;
        this.A0J = r20;
        this.A0F = r16;
        this.A0C = r13;
        this.A05 = r7;
        this.A0D = r14;
        this.A04 = r6;
        this.A0I = r19;
        this.A03 = r5;
        this.A0G = r17;
        this.A07 = r9;
        this.A09 = r11;
        this.A08 = r10;
        this.A0A = new AnonymousClass56I(r21);
        this.A06 = r8;
    }

    public final void A0D(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            C66543Lv r7 = this.A0D;
            if (!r7.A1P.A07(A0P)) {
                Log.d("CoreMessageStore/no need to add downgrade from bot system msg for empty chat");
            } else {
                C56832sd r0 = r7.A2B;
                C31271o1 r3 = new C31271o1(C56832sd.A00(A0P, r0), 69, C56612sH.A06(r7));
                r3.A00 = 2;
                r3.A01 = null;
                r7.A0c(r3, -1);
                C18260x0.A1R(AnonymousClass001.A0o(), "CoreMessageStore/downgrade from bot system msg when automatedType downgrade; jid=", A0P);
                r7.A0A(r3, -1);
            }
        }
    }

    public final void A0E(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            C66543Lv r4 = this.A0D;
            if (!r4.A1P.A07(A0P)) {
                Log.d("CoreMessageStore/no need to add 3p bot system msg for empty chat");
            } else {
                C624134x A012 = r4.A2I.A01(A0P, true);
                r4.A0c(A012, -1);
                C18260x0.A1R(AnonymousClass001.A0o(), "CoreMessageStore/3p bot system msg when automatedType updated; jid=", A0P);
                r4.A0A(A012, -1);
            }
        }
    }
}
