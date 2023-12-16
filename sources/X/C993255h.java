package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.55h  reason: invalid class name and case insensitive filesystem */
public class C993255h extends AnonymousClass5ZM {
    public long A00;
    public final long A01;
    public final C56612sH A02;
    public final C54292oU A03;
    public final AnonymousClass33p A04;
    public final AnonymousClass1VW A05;
    public final C56142rU A06;
    public final C53652nR A07;
    public final C56912sl A08;
    public final C153017aX A09;
    public final C105265Uf A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final WeakReference A0E;
    public final JSONObject A0F;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Set<String> stringSet;
        JSONObject jSONObject;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.A01;
            if (elapsedRealtime < j) {
                this.A00 = C18280x3.A08(j, elapsedRealtime);
                return A00((Object) null, 11);
            }
            C56612sH r11 = this.A02;
            long A0H = r11.A0H();
            AnonymousClass1VW r4 = this.A05;
            boolean z = true;
            if (A0H <= AnonymousClass0x2.A0B(r4.A0Z(), "pref_pre_chatd_ab_next_fetch_time")) {
                z = false;
            }
            if (z) {
                Log.i("CheckIfReinstalledTask/shouldFetchPreChatdABProps");
                String str = null;
                try {
                    C156777hB A022 = this.A08.A02(this.A0B, this.A0D);
                    if (A022 == null) {
                        Log.e("CheckIfReinstalledTask/fetchPreChatdABProps/null abPropCheckResult");
                    } else {
                        int i = A022.A01;
                        if (i != 1) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("CheckIfReinstalledTask/fetchPreChatdABProps/status/");
                            A0o.append(i);
                            A0o.append("/reason/");
                            int i2 = A022.A00;
                            String str2 = "temporarily_unavailable";
                            if (i2 != 0 && i2 == 1) {
                                str2 = "ab_server_error";
                            }
                            C18260x0.A1K(A0o, str2);
                            if (i2 == 2) {
                                str = "wamsys initialization fails";
                            } else if (i2 == 0) {
                                C18270x1.A0i(r4.A0Z().edit(), "pref_pre_chatd_ab_next_fetch_time", r11.A0H() + A022.A02);
                            }
                        } else {
                            String str3 = A022.A03;
                            if (str3 == null) {
                                Log.i("CheckIfReinstalledTask/fetchPreChatdABProps/no abHash returned, no need to update PreChatdABProps storage");
                            } else {
                                Log.i("CheckIfReinstalledTask/fetchPreChatdABProps/success");
                                C18270x1.A0j(C18270x1.A03(this.A04), "pref_pre_chatd_ab_hash", str3);
                                str = A022.A04;
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.e("CheckIfReinstalledTask/fetchPreChatdABProps/entrypoint call error: ", e);
                }
                if (str != null) {
                    if (str.equals("wamsys initialization fails")) {
                        return A00((Object) null, 22);
                    }
                    this.A06.A05(str);
                    C18270x1.A0h(C18270x1.A03(this.A04), "reg_skip_storage_perm", r4.A0N(2736));
                    C105265Uf r0 = this.A0A;
                    AnonymousClass33p r7 = r0.A02;
                    AnonymousClass1VW r6 = r0.A03;
                    C18270x1.A0l(C18270x1.A03(r7), "reg_abprop_passkey_create", r6.A0X(4732));
                    C18270x1.A0l(C18270x1.A03(r7), "reg_abprop_passkey_create_delay_keyboard", r6.A0X(5298));
                    C18270x1.A0l(C18270x1.A03(r7), "reg_abprop_passkey_create_education_screen", r6.A0X(5967));
                }
            }
            byte[] A012 = this.A09.A01();
            C53652nR r72 = this.A07;
            synchronized (r72) {
                r72.A01();
                SharedPreferences sharedPreferences = r72.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = r72.A06.A03(C58152un.A0A);
                    r72.A00 = sharedPreferences;
                }
                stringSet = sharedPreferences.getStringSet("ab_offline_props:offline_exposure_strings", new HashSet(1));
            }
            JSONArray A1F = AnonymousClass0x9.A1F();
            for (String put : stringSet) {
                A1F.put(put);
            }
            try {
                jSONObject = AnonymousClass0x9.A1G();
                jSONObject.put("exposure", A1F);
                JSONObject jSONObject2 = this.A0F;
                if (jSONObject2 != null) {
                    jSONObject.put("metrics", jSONObject2);
                }
            } catch (JSONException e2) {
                Log.e("CheckIfReinstalledTask/enterphone/getOfflineAbParams exception: ", e2);
                jSONObject = null;
            }
            AnonymousClass33p r42 = this.A04;
            int A082 = C86664Kz.A08(AnonymousClass0x2.A0F(r42), "reg_attempts_check_exist", 0);
            C18260x0.A0L(r42, "reg_attempts_check_exist", A082);
            C150607Rl r73 = new C150607Rl(A082);
            if (((C185128t8) this.A0E.get()) == null) {
                return A00((Object) null, 4);
            }
            Context context = this.A03.A00;
            String str4 = this.A0D;
            String A002 = C57922uQ.A00(context, str4);
            C56912sl r62 = this.A08;
            String str5 = this.A0B;
            String str6 = this.A0C;
            if (str6 == null) {
                str6 = "-1";
            }
            AnonymousClass5WM A013 = r62.A01(r73, str5, str4, A002, str6, jSONObject, A012, false);
            if (A013 == null) {
                Log.e("CheckIfReinstalledTask/doInBackground/null ExistResult");
                return A00((Object) null, 4);
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("CheckIfReinstalledTask/exist entrypoint response/autoconfType=");
            A0o2.append(A013.A01);
            A0o2.append("/autoconfCfType=");
            A0o2.append(A013.A00);
            A0o2.append("/non-null serverStartMessage=");
            A0o2.append(AnonymousClass000.A1W(A013.A0I));
            A0o2.append("/waOldEligible=");
            A0o2.append(A013.A07);
            A0o2.append("/emailOtpEligible=");
            A0o2.append(A013.A02);
            A0o2.append("/flashType=");
            A0o2.append(A013.A03);
            A0o2.append("/resetMethod=");
            A0o2.append(A013.A0G);
            A0o2.append("/wipeWait=");
            A0o2.append(A013.A0A);
            A0o2.append("/smsWait=");
            A0o2.append(A013.A0J);
            A0o2.append(";voiceWait=");
            A0o2.append(A013.A0K);
            A0o2.append(";waOldWait=");
            A0o2.append(A013.A0L);
            A0o2.append(";emailOtpWait=");
            A0o2.append(A013.A0F);
            A0o2.append(";silentAuthEligible=");
            C18260x0.A1G(A0o2, A013.A04);
            C18270x1.A0h(C18270x1.A03(r42), "autoconf_type", A013.A01);
            int i3 = A013.A01;
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                C18270x1.A0j(C18270x1.A03(r42), "pref_autoconf_status", "autoconf_server_enabled");
            }
            int i4 = A013.A0R;
            if (i4 == 1) {
                return A00(A013, 1);
            }
            if (i4 == 0) {
                C998758n r1 = A013.A0S;
                if (r1 == null) {
                    return A00((Object) null, 4);
                }
                if (r1 == C998758n.FAIL_TO_INITIALIZE_WAMSYS) {
                    return A00((Object) null, 22);
                }
                if (r1 == C998758n.BLOCKED) {
                    return A00(A013, 5);
                }
                if (r1 == C998758n.LENGTH_LONG) {
                    return A00((Object) null, 6);
                }
                if (r1 == C998758n.LENGTH_SHORT) {
                    return A00((Object) null, 7);
                }
                if (r1 == C998758n.FORMAT_WRONG) {
                    return A00((Object) null, 8);
                }
                if (r1 == C998758n.TEMPORARILY_UNAVAILABLE) {
                    return A00(A013, 9);
                }
                if (r1 == C998758n.OLD_VERSION) {
                    return A00(A013, 12);
                }
                if (r1 == C998758n.ERROR_BAD_TOKEN) {
                    return A00((Object) null, 14);
                }
                if (r1 == C998758n.INVALID_SKEY_SIGNATURE) {
                    return A00((Object) null, 15);
                }
                if (r1 == C998758n.SECURITY_CODE) {
                    return A00(A013, 16);
                }
                if (r1 == C998758n.DEVICE_CONFIRM_OR_SECOND_CODE) {
                    return A00(A013, 20);
                }
                if (r1 == C998758n.SECOND_CODE) {
                    return A00(A013, 19);
                }
                if (r1 == C998758n.CODE_CHECKPOINT) {
                    return A00(A013, 21);
                }
                if (r1 == C998758n.PROFILE_CHECKPOINT) {
                    return A00(A013, 23);
                }
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("CheckIfReinstalledTask/possible-migration/");
                C18260x0.A1V(A0o3, A013.A0O);
                return A00(A013, 2);
            }
            return A00((Object) null, 4);
        } catch (Exception e3) {
            Log.e("CheckIfReinstalledTask/error", e3);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass0PJ r9 = (AnonymousClass0PJ) obj;
        C185128t8 r1 = (C185128t8) this.A0E.get();
        if (r1 != null) {
            r1.BFd();
            Object obj2 = r9.A00;
            C626936e.A06(obj2);
            r1.BSY((AnonymousClass5WM) r9.A01, this.A0B, this.A0D, AnonymousClass001.A0K(obj2), this.A00);
        }
    }

    public C993255h(C56612sH r3, C54292oU r4, AnonymousClass33p r5, AnonymousClass1VW r6, C56142rU r7, C53652nR r8, C56912sl r9, C153017aX r10, C105265Uf r11, C185128t8 r12, String str, String str2, String str3, JSONObject jSONObject, long j) {
        this.A02 = r3;
        this.A03 = r4;
        this.A0B = str;
        this.A0D = str2;
        this.A01 = j;
        this.A0C = str3;
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
        this.A09 = r10;
        this.A0F = jSONObject;
        this.A0A = r11;
        this.A04 = r5;
        this.A08 = r9;
        this.A0E = AnonymousClass0x9.A14(r12);
    }

    public static AnonymousClass0PJ A00(Object obj, int i) {
        return new AnonymousClass0PJ(Integer.valueOf(i), obj);
    }
}
