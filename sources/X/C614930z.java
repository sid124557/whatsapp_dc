package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.30z  reason: invalid class name and case insensitive filesystem */
public final class C614930z {
    public long A00;
    public C105275Ug A01;
    public Long A02;
    public String A03;
    public final C111095hX A04;
    public final C55682qk A05;
    public final C56972sr A06;
    public final C45752aW A07;
    public final C56612sH A08;
    public final AnonymousClass33T A09;
    public final AnonymousClass33p A0A;
    public final C54412og A0B;
    public final C620733j A0C;
    public final AnonymousClass1VX A0D;
    public final C64723Er A0E;
    public final AnonymousClass4FS A0F;
    public final C183538qC A0G;
    public final C183538qC A0H;
    public final C183538qC A0I;
    public final C183538qC A0J;

    public final String A02(String str) {
        C162457s7.A0J(str, 0);
        C620733j r1 = this.A0C;
        String A032 = AnonymousClass36P.A03(AnonymousClass32X.A00(str));
        if (A032 != null) {
            str = A032;
        }
        String A0I2 = r1.A0I(str);
        C162457s7.A0D(A0I2);
        return A0I2;
    }

    public final boolean A0A(Context context, String str, String str2, AnonymousClass4GP r21, int i, boolean z, boolean z2) {
        AnonymousClass5XC r1;
        int i2;
        C45752aW r5 = this.A07;
        int A002 = r5.A00();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountSwitcher/maybeLaunchAccountSwitchingActivity addAccount:");
        A0o.append(z);
        A0o.append(", isCall:");
        boolean z3 = z2;
        A0o.append(z3);
        A0o.append(", source:");
        int i3 = i;
        A0o.append(i3);
        C18260x0.A0y(", shouldAllowSwitchingAccounts:", A0o, A002);
        boolean z4 = true;
        Context context2 = context;
        AnonymousClass4GP r3 = r21;
        if (A002 != 0) {
            if (A002 == 1) {
                Activity A003 = C621633u.A00(context2);
                if (A003 != null && !C621433s.A03(A003)) {
                    C183538qC r4 = r5.A02;
                    long A012 = (AnonymousClass35X.A01((C61072zf) r4.get(), (AnonymousClass1VX) r5.A00.get()) - C61072zf.A00(r4)) + SearchActionVerificationClientService.MS_TO_NS;
                    C19340zH A004 = AnonymousClass5V0.A00(context2);
                    A004.A0h(context2.getString(R.string.f11nameremoved));
                    A004.A0g(AnonymousClass002.A0F(context2, AnonymousClass35V.A03(this.A0C, A012), new Object[1], 0, R.string.f11nameremoved));
                    A004.A0Y(new AnonymousClass69T(this, 1, context2), R.string.f11nameremoved);
                    A004.A0W(new C1235268t(r3, 5), R.string.f11nameremoved);
                    A004.A0i(true);
                    C18280x3.A0q(A004);
                } else if (r21 != null) {
                    r3.invoke();
                }
                r1 = (AnonymousClass5XC) this.A0I.get();
                i2 = 25;
            } else if (A002 != 2) {
                A00(context2, r3, R.string.f11nameremoved, R.string.f11nameremoved);
                r1 = (AnonymousClass5XC) this.A0I.get();
                i2 = 24;
            } else {
                A00(context2, r3, R.string.f11nameremoved, R.string.f11nameremoved);
                r1 = (AnonymousClass5XC) this.A0I.get();
                i2 = 23;
            }
            r1.A00(i3, i2);
            return false;
        }
        C105275Ug r12 = this.A01;
        if (r12.A05()) {
            r12.A03(true);
        }
        if (z) {
            C613630k r6 = (C613630k) this.A0G.get();
            boolean A0Y = this.A0D.A0Y(C58422vE.A02, 5840);
            C18260x0.A1E("AccountSwitchingDataRepo/setIsCompanionModeEnabled/", AnonymousClass001.A0o(), A0Y);
            AnonymousClass5SO A022 = r6.A02();
            r6.A09(new AnonymousClass5SO(A022.A00, A022.A01, A022.A03, A0Y));
            Log.i("AccountSwitcher/clearExistingNotifications");
            this.A09.A05(57, "clearNotificationsBeforeAccountSwitching");
            AnonymousClass2XL BBI = ((AnonymousClass3Au) this.A0J.get()).BBI();
            AnonymousClass33p r0 = this.A0A;
            String A0Y2 = r0.A0Y();
            String str3 = BBI.A01;
            long j = BBI.A00;
            int A0C2 = r0.A0C();
            String A023 = this.A0B.A02();
            C626936e.A0B(AnonymousClass001.A1U(A0C2));
            Intent A072 = C18320x8.A07();
            A072.setClassName(context2.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
            A072.putExtra("request_type", 1);
            A072.putExtra("device_id", A0Y2);
            A072.putExtra("phone_id", str3);
            A072.putExtra("phone_id_timestamp", j);
            A072.putExtra("number_of_accounts", A0C2 + 1);
            if (A023 != null) {
                A072.putExtra("account_language", A023);
            }
            A072.putExtra("source", i3);
            A072.addFlags(268468224);
            z4 = A09(context2, A072);
        } else {
            String str4 = str;
            if (str != null) {
                this.A0F.BkO(new C33531tH(context2, this, str4, str2, i3, z3), new Void[0]);
            } else {
                throw C18290x4.A0Y();
            }
        }
        if (r21 != null) {
            r3.invoke();
        }
        return z4;
    }

    public C614930z(C111095hX r18, C55682qk r19, C56972sr r20, C45752aW r21, C105275Ug r22, C56612sH r23, AnonymousClass33T r24, AnonymousClass33p r25, C54412og r26, C620733j r27, AnonymousClass1VX r28, C64723Er r29, AnonymousClass4FS r30, C183538qC r31, C183538qC r32, C183538qC r33, C183538qC r34) {
        AnonymousClass4FS r0 = r30;
        AnonymousClass1VX r7 = r28;
        C56612sH r12 = r23;
        C56972sr r14 = r20;
        C55682qk r15 = r19;
        C18260x0.A0f(r12, r7, r14, r15, r0);
        C183538qC r5 = r31;
        C620733j r8 = r27;
        AnonymousClass33p r10 = r25;
        C105275Ug r13 = r22;
        C111095hX r16 = r18;
        C18260x0.A0g(r16, r13, r8, r5, r10);
        C183538qC r4 = r32;
        C183538qC r3 = r33;
        C183538qC r2 = r34;
        C54412og r9 = r26;
        AnonymousClass33T r11 = r24;
        C18260x0.A0h(r11, r4, r9, r3, r2);
        C64723Er r6 = r29;
        C162457s7.A0J(r6, 17);
        this.A08 = r12;
        this.A0D = r7;
        this.A06 = r14;
        this.A05 = r15;
        this.A0F = r0;
        this.A04 = r16;
        this.A01 = r13;
        this.A0C = r8;
        this.A0J = r5;
        this.A0A = r10;
        this.A07 = r21;
        this.A09 = r11;
        this.A0I = r4;
        this.A0B = r9;
        this.A0G = r3;
        this.A0H = r2;
        this.A0E = r6;
    }

    public final C53892nq A01() {
        String str;
        String str2;
        boolean z;
        String str3;
        Log.i("AccountSwitcher/getCurrentAccount");
        C56972sr r2 = this.A06;
        C27981fH A0H2 = r2.A0H();
        if (A0H2 != null) {
            str = A0H2.getRawString();
        } else {
            str = null;
        }
        PhoneUserJid A042 = C56972sr.A04(r2);
        if (A042 != null) {
            str2 = A042.user;
        } else {
            str2 = null;
        }
        if (str == null || str.length() == 0) {
            Log.i("AccountSwitcher/getCurrentAccount/lid is null or empty");
            z = true;
        } else {
            z = false;
        }
        if (str2 == null || str2.length() == 0) {
            Log.i("AccountSwitcher/getCurrentAccount/phoneUserJid is null or empty");
        } else if (!z) {
            if (str != null) {
                String A032 = r2.A0D.A03();
                C162457s7.A0D(A032);
                return new C53892nq(str, str2, A032, 0, 0, this.A08.A0H(), 0, true, r2.A0Y());
            }
            throw AnonymousClass001.A0e("Required value was null.");
        }
        C183538qC r22 = this.A0A.A01;
        if (!C18280x3.A1W(C18300x5.A0B(r22), "support_ban_appeal_user_banned_from_chat_disconnect")) {
            return null;
        }
        Log.i("AccountSwitcher/getCurrentAccount/userBannedFromChatDisconnect");
        Log.i("AccountSwitcher/getBannedCurrentAccount");
        String string = C18300x5.A0B(r22).getString("account_switching_banned_account_lid", (String) null);
        String string2 = C18300x5.A0B(r22).getString("account_switching_banned_account_phone_user_jid", (String) null);
        if (string == null || string.length() == 0) {
            str3 = "AccountSwitcher/getBannedCurrentAccount/lid is null or empty";
        } else if (string2 == null || string2.length() == 0) {
            str3 = "AccountSwitcher/getBannedCurrentAccount/phoneUserJid is null or empty";
        } else {
            String A033 = this.A0B.A03();
            C162457s7.A0D(A033);
            return new C53892nq(string, string2, A033, 0, 0, this.A08.A0H(), 0, true, false);
        }
        Log.i(str3);
        return null;
    }

    public final boolean A06() {
        return AnonymousClass001.A1W(this.A0A.A0C());
    }

    public final boolean A07() {
        AnonymousClass1VX r3 = this.A0D;
        C58422vE r2 = C58422vE.A02;
        if (!r3.A0Y(r2, 5840)) {
            C56972sr r1 = this.A06;
            if ((!r1.A0Y() || !A06()) && r1.A0Y()) {
                return false;
            }
        }
        if (r3.A0Y(r2, 4377) || A06()) {
            return true;
        }
        return false;
    }

    public final boolean A08() {
        for (C53892nq r0 : C613630k.A00(this.A0G)) {
            if (r0.A00 > 0) {
                return true;
            }
        }
        return false;
    }

    public static final void A00(Context context, AnonymousClass4GP r5, int i, int i2) {
        Activity A002 = C621633u.A00(context);
        if (A002 != null && !C621433s.A03(A002)) {
            C19340zH A003 = AnonymousClass5V0.A00(context);
            C19340zH.A01(context, A003, i2);
            A003.A0h(context.getString(i));
            A003.A0Y(new C1235268t(r5, 4), R.string.f11nameremoved);
            A003.A0i(true);
            C18280x3.A0q(A003);
        } else if (r5 != null) {
            r5.invoke();
        }
    }

    public final String A03(String str, String str2) {
        String str3;
        boolean A1U = C18270x1.A1U(str, str2);
        Log.i("AccountSwitcher/getLidForPhoneNumberIfRegistered");
        String A0T = AnonymousClass000.A0T(str, str2);
        for (C53892nq r9 : C613630k.A00(this.A0G)) {
            String str4 = r9.A06;
            if (TextUtils.equals(str4, A0T) || TextUtils.equals(C107195ar.A03(AnonymousClass36P.A07(str4)), A0T)) {
                str3 = "AccountSwitcher/getLidForPhoneNumberIfRegistered/phone number matches different format";
            } else if (C175738Zn.A0Y(str4, str, A1U)) {
                String A0J2 = C175728Zm.A0J(str, str4);
                int length = A0J2.length();
                int length2 = str2.length();
                if (length == length2) {
                    Log.i("AccountSwitcher/getLidForPhoneNumberIfRegistered/closelyMatches/same length");
                    if (A0J2.equals(str2)) {
                    }
                } else {
                    int abs = Math.abs(length - length2);
                    if (abs > 2) {
                        Log.i("AccountSwitcher/getLidForPhoneNumberIfRegistered/closelyMatches/phone number length difference is greater than 2");
                    } else {
                        String str5 = str2;
                        if (length < length2) {
                            str5 = A0J2;
                        }
                        if (length < length2) {
                            A0J2 = str2;
                        }
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        while (i < str5.length() && i2 < A0J2.length()) {
                            if (A0J2.charAt(i2) != str5.charAt(i)) {
                                i3++;
                            } else {
                                i++;
                            }
                            i2++;
                        }
                        if (i3 + (A0J2.length() - i2) <= abs) {
                        }
                    }
                }
                str3 = "AccountSwitcher/getLidForPhoneNumberIfRegistered/phone number closely matches with registered account";
            }
            Log.i(str3);
            return r9.A07;
        }
        return null;
    }

    public final void A04(Activity activity, String str) {
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountSwitcher/abandonAddAccount/");
        if (str != null) {
            str2 = C57072t2.A01(str);
        } else {
            str2 = null;
        }
        C18260x0.A1L(A0o, str2);
        A09(activity, C627736r.A11(activity, str, this.A0B.A02(), this.A0A.A0C()));
    }

    public final void A05(Context context, int i) {
        C18260x0.A0y("AccountSwitcher/maybeSwitchToMostRecentAccount/source : ", AnonymousClass001.A0o(), i);
        AnonymousClass0x7.A1B(new C33371st(context, this, i), this.A0F);
    }

    public final boolean A09(Context context, Intent intent) {
        if (System.currentTimeMillis() - this.A00 < C625635p.A0L) {
            Log.i("AccountSwitcher/shouldTakeAccountSwitchingAction/ignoring as last action was recently called");
            return false;
        }
        this.A00 = System.currentTimeMillis();
        this.A04.A0A(context, intent);
        return true;
    }

    public final boolean A0B(boolean z) {
        if (!A07() || !A06() || z) {
            return false;
        }
        return true;
    }
}
