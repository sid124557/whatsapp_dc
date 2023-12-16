package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.30u  reason: invalid class name and case insensitive filesystem */
public final class C614430u {
    public static final String A07;
    public SharedPreferences A00;
    public Boolean A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;
    public final C60152y5 A04;
    public final AnonymousClass4FS A05;
    public final C43312Rq A06;

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A04.A03(A07);
            this.A00 = sharedPreferences;
        }
        if (sharedPreferences == null) {
            throw C18290x4.A0Y();
        }
        return sharedPreferences;
    }

    public Boolean A02() {
        if (!A08() || A07()) {
            return null;
        }
        return Boolean.valueOf(A00().getBoolean("is_paused", false));
    }

    public final synchronized void A04() {
        C18270x1.A0i(A00().edit(), "last_cache_update_time", this.A02.A0H());
    }

    public final synchronized void A06(String str, Boolean bool) {
        synchronized (this) {
            if (bool == null) {
                C18270x1.A0n(A00(), str);
            } else {
                C18270x1.A0l(A00().edit(), str, bool.booleanValue());
            }
            A04();
        }
    }

    public void A03() {
        C43312Rq r4 = this.A06;
        AnonymousClass2X8 r3 = new AnonymousClass2X8(this);
        AnonymousClass2Z5 r2 = r4.A03;
        if (r2 != null) {
            r2.A00(new C86324Jr(r3, 0, r4));
            return;
        }
        throw C18270x1.A0S("accountLinkingPingHelper");
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C58152un.A0A);
        A07 = AnonymousClass000.A0X("_waffle_client_cache", A0o);
    }

    public C614430u(C56612sH r1, AnonymousClass1VX r2, C60152y5 r3, AnonymousClass4FS r4, C43312Rq r5) {
        C18260x0.A0c(r1, r2, r4, r3);
        this.A02 = r1;
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = r5;
    }

    public C60492ye A01() {
        boolean z;
        boolean z2;
        if (!A08()) {
            return new C60492ye(false, false);
        }
        if (!A08() || A07()) {
            z = false;
        } else {
            z = A00().getBoolean("fb_auto_crossposting", false);
        }
        if (!A08() || A07()) {
            z2 = false;
        } else {
            z2 = A00().getBoolean("ig_auto_crossposting", false);
        }
        return new C60492ye(z, z2);
    }

    public void A05(Boolean bool) {
        if (A08()) {
            A06("is_paused", bool);
        }
    }

    public final boolean A07() {
        long j = A00().getLong("last_cache_update_time", 0);
        long A062 = C56952sp.A06(this.A03, 1101);
        if (j == 0 || C56612sH.A03(this.A02, j) <= TimeUnit.HOURS.toMillis(A062)) {
            return false;
        }
        C18270x1.A0m(A00());
        this.A05.BkM(new C117105rO(this, 39));
        return true;
    }

    public final boolean A08() {
        Boolean bool = this.A01;
        if (bool == null) {
            bool = false;
            this.A01 = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        if ("wa_android_waffle".length() != 0) {
            String A08 = C56952sp.A08(this.A03, 1010);
            if (A08.length() != 0) {
                try {
                    JSONArray jSONArray = AnonymousClass0x9.A1H(A08).getJSONArray("client_cache");
                    C162457s7.A0H(jSONArray);
                    int length = jSONArray.length();
                    int i = 0;
                    while (i < length) {
                        try {
                            if ("wa_android_waffle".equalsIgnoreCase(jSONArray.getString(i))) {
                                return true;
                            }
                            i++;
                        } catch (JSONException e) {
                            C626936e.A0A(e);
                        }
                    }
                } catch (JSONException unused) {
                }
                return false;
            }
        }
        return false;
    }
}
