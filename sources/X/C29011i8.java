package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1i8  reason: invalid class name and case insensitive filesystem */
public class C29011i8 extends C61102zi implements AnonymousClass4CD {
    public AnonymousClass5LI A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final Handler A04 = new AnonymousClass4MV(Looper.getMainLooper(), this);
    public final C55682qk A05;
    public final C29411im A06;
    public final C56612sH A07;
    public final AnonymousClass1VX A08;
    public final C54672p6 A09;
    public final AnonymousClass2LI A0A;
    public final AnonymousClass31C A0B;
    public final C60152y5 A0C;
    public final C56312rm A0D;
    public final C102145Hq A0E;
    public final AnonymousClass2M6 A0F;
    public final AnonymousClass4FS A0G;
    public final AnonymousClass7VN A0H;
    public final Object A0I = AnonymousClass002.A0D();
    public final Object A0J = AnonymousClass002.A0D();
    public final AtomicBoolean A0K = C18280x3.A0l();
    public volatile C68363Sw A0L;

    public final AnonymousClass2YO A09(String str, String str2, String str3, int i, boolean z) {
        AnonymousClass5LI A0B2 = A0B();
        C56612sH r2 = this.A07;
        AnonymousClass1VX r3 = this.A08;
        AnonymousClass7VN r8 = this.A0H;
        return new AnonymousClass2YO(AnonymousClass3UQ.A01(this.A05, this.A06, r2, r3, this.A09, this.A0D, this, A0B2, r8, str, str2, str3, i, 0, this.A03, false, z));
    }

    public final synchronized C68363Sw A0C() {
        if (this.A0L == null) {
            this.A0L = new C68363Sw(this.A07, this.A0B, this);
        }
        return this.A0L;
    }

    public void BMV() {
        this.A01 = true;
        if (this.A08.A0Y(C58422vE.A02, 149)) {
            A0H();
        }
    }

    public void onAppBackgrounded() {
        this.A01 = false;
    }

    public C29011i8(C55682qk r6, C29411im r7, C56612sH r8, AnonymousClass1VX r9, C54672p6 r10, AnonymousClass2LI r11, AnonymousClass31C r12, C60152y5 r13, C56312rm r14, AnonymousClass2M6 r15, AnonymousClass4FS r16, AnonymousClass7VN r17) {
        C102145Hq r4 = new C102145Hq();
        this.A07 = r8;
        this.A08 = r9;
        this.A0H = r17;
        this.A05 = r6;
        this.A0F = r15;
        this.A0G = r16;
        this.A0B = r12;
        this.A06 = r7;
        this.A0D = r14;
        this.A09 = r10;
        this.A0C = r13;
        this.A0A = r11;
        this.A0E = r4;
        this.A03 = 1000;
    }

    public static Set A01(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet A0K2 = AnonymousClass002.A0K();
        for (int i = 0; i < jSONArray.length(); i++) {
            A0K2.add(jSONArray.getString(i));
        }
        return A0K2;
    }

    public AnonymousClass2YO A08(C182988pJ r22, int i) {
        C185518to r4;
        C182988pJ r2 = r22;
        C626936e.A0C(true);
        if (r2 instanceof AnonymousClass3UO) {
            r4 = new AnonymousClass8JW(((AnonymousClass3UO) r2).A01, this.A03);
        } else {
            int i2 = i;
            if (r2 instanceof AnonymousClass8JU) {
                AnonymousClass8JU r23 = (AnonymousClass8JU) r2;
                AnonymousClass5LI A0B2 = A0B();
                C56612sH r5 = this.A07;
                AnonymousClass1VX r6 = this.A08;
                AnonymousClass7VN r11 = this.A0H;
                C55682qk r3 = this.A05;
                C29411im r42 = this.A06;
                C56312rm r8 = this.A0D;
                C54672p6 r7 = this.A09;
                long j = this.A03;
                r4 = new AnonymousClass8JV(AnonymousClass3UQ.A01(r3, r42, r5, r6, r7, r8, this, A0B2, r11, r23.A02, (String) null, (String) null, i2, 0, j, false, false), r23.A01, j);
            } else if (r2 instanceof C32431qO) {
                C32431qO r24 = (C32431qO) r2;
                return A09(r24.A01, r24.A02, r24.A01, i2, false);
            } else {
                throw AnonymousClass0x9.A0i(AnonymousClass000.A0P(r2, "Unknown url generator type: ", AnonymousClass001.A0o()));
            }
        }
        return new AnonymousClass2YO(r4);
    }

    public C185518to A0A(String str, String str2, String str3, int i, int i2) {
        Log.d("RouteSelector/newRouteFromHostSwitching");
        AnonymousClass5LI A0B2 = A0B();
        C56612sH r2 = this.A07;
        AnonymousClass1VX r3 = this.A08;
        AnonymousClass7VN r8 = this.A0H;
        return AnonymousClass3UQ.A01(this.A05, this.A06, r2, r3, this.A09, this.A0D, this, A0B2, r8, str, str2, str3, i, i2, this.A03, false, false);
    }

    public AnonymousClass5LI A0B() {
        AnonymousClass5LI r0;
        synchronized (this.A0I) {
            r0 = this.A00;
        }
        return r0;
    }

    public final void A0E() {
        boolean A1P;
        String str;
        AnonymousClass39V[] r1;
        AnonymousClass2LI r5 = this.A0A;
        synchronized (r5) {
            A1P = AnonymousClass0x7.A1P((r5.A01.A0H() > r5.A00 ? 1 : (r5.A01.A0H() == r5.A00 ? 0 : -1)));
        }
        if (A1P) {
            Log.i("routeselector/requestupdatedroutinginfo throttled");
            return;
        }
        C68363Sw A0C2 = A0C();
        AnonymousClass5LI A0B2 = A0B();
        if (A0B2 == null) {
            str = null;
        } else {
            str = A0B2.A09;
        }
        synchronized (A0C2) {
            Log.i("routeselector/requestupdatedroutinginfo");
            if (A0C2.A00 == 0) {
                AnonymousClass31C r7 = A0C2.A02;
                String A032 = r7.A03();
                if (str != null) {
                    r1 = new AnonymousClass39V[1];
                    AnonymousClass39V.A0B("last_id", str, r1, 0);
                } else {
                    r1 = null;
                }
                AnonymousClass36K A0I2 = AnonymousClass36K.A0I("media_conn", r1);
                AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
                AnonymousClass39V.A0E(A1W, 0);
                AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W, 1);
                AnonymousClass39V.A06("xmlns", "w:m", A1W);
                if (r7.A0K(A0C2, AnonymousClass36K.A0E(A0I2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W), A032, 124, 32000)) {
                    A0C2.A00 = SystemClock.elapsedRealtime();
                } else {
                    Log.i("app/sendgetmediaroutinginfo not sent");
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("routeselector/requestupdatedroutinginfo/not sending request; inFlightMediaRoutingRequestTime=");
            A0o.append(A0C2.A00);
            AnonymousClass0x2.A19(A0o);
        }
    }

    public final void A0G() {
        if (this.A08.A0Y(C58422vE.A02, 149) && this.A0K.compareAndSet(false, true)) {
            AnonymousClass5LI r4 = null;
            String string = this.A0C.A03("route_selector_prefs").getString("media_conn", (String) null);
            C56612sH r9 = this.A07;
            if (string != null) {
                try {
                    JSONObject A1H = AnonymousClass0x9.A1H(string);
                    String string2 = A1H.getString("auth_token");
                    long j = A1H.getLong("conn_ttl");
                    long j2 = A1H.getLong("auth_ttl");
                    long j3 = A1H.getLong("max_buckets");
                    JSONArray jSONArray = A1H.getJSONArray("hosts");
                    int length = jSONArray.length();
                    ArrayList A0I2 = AnonymousClass002.A0I(length);
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        A0I2.add(new C47502dM(jSONObject.getString("hostname"), A00("ip4", jSONObject), A00("ip6", jSONObject), A00("class", jSONObject), A00("fallback_hostname", jSONObject), A00("fallback_ip4", jSONObject), A00("fallback_ip6", jSONObject), A00("fallback_class", jSONObject), A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject), A01(jSONObject.optJSONArray("upload")), A01(jSONObject.optJSONArray("download")), A01(jSONObject.optJSONArray("download_buckets")), jSONObject.optBoolean("force_ip")));
                    }
                    String A002 = A00("last_id", A1H);
                    boolean z = A1H.getBoolean("is_new");
                    r4 = new AnonymousClass5LI(string2, A002, A0I2, A1H.getInt("max_autodownload_retry"), A1H.getInt("max_manual_retry"), j, j2, j3, (A1H.getLong("send_time_abs_ms") - r9.A0H()) + SystemClock.elapsedRealtime(), z);
                } catch (JSONException e) {
                    Log.e("routingresponse/can't parse json", e);
                }
            }
            synchronized (this.A0I) {
                if (this.A00 == null && r4 != null && r4.A02 > SystemClock.elapsedRealtime()) {
                    Log.d("routeselector/loaded cached response");
                    A0I(r4);
                }
            }
        }
    }

    public final void A0H() {
        if ((!this.A08.A0Y(C58422vE.A02, 149) || this.A01) && this.A02) {
            this.A0G.BkM(new C71283br((Object) this, 17));
        }
    }

    public final void A0J(String str, String str2, String str3, int i) {
        if (this.A08.A0Y(C58422vE.A02, 15)) {
            Log.d("routeselector/prewarm/skipped; disabled");
        } else {
            this.A0G.BkM(new C70593ak(this, str, str2, str3, i));
        }
    }

    public static String A00(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public void A0D() {
        boolean A1W;
        Log.i("routeselector/requestroutesandwaitforauth");
        if (A0K()) {
            AnonymousClass5LI r0 = this.A00;
            if (r0 == null || r0.A02 <= SystemClock.elapsedRealtime()) {
                Log.i("routeselector/requestroutesandwaitforauth/waiting for response");
                Log.d("routeselector/waitforroutingresponse");
                C626936e.A00();
                long uptimeMillis = SystemClock.uptimeMillis();
                while (true) {
                    AnonymousClass5LI r02 = this.A00;
                    if (r02 == null || r02.A02 <= SystemClock.elapsedRealtime()) {
                        C68363Sw A0C2 = A0C();
                        synchronized (A0C2) {
                            A1W = AnonymousClass001.A1W((A0C2.A00 > 0 ? 1 : (A0C2.A00 == 0 ? 0 : -1)));
                        }
                        if (!A1W) {
                            Log.w("routeselector/waitforroutingresponse/giving up because no request in flight");
                            return;
                        }
                        Object obj = this.A0J;
                        synchronized (obj) {
                            try {
                                obj.wait(1000);
                            } catch (InterruptedException e) {
                                Log.w("routeselector/waitforroutingresponse/interrupted while waiting on route selection", e);
                            }
                            AnonymousClass5LI r03 = this.A00;
                            if (r03 == null || r03.A02 <= SystemClock.elapsedRealtime()) {
                                Log.w("routeselector/waitforroutingresponse/routing response still not available");
                            }
                            if (20000 + uptimeMillis < SystemClock.uptimeMillis()) {
                                Log.w("routeselector/waitforroutingresponse/waited too long for routing response! Give up");
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                while (true) {
                }
            }
        }
    }

    public final void A0F() {
        Log.i("routeselector/setuprouterequesttimer");
        AnonymousClass5LI A0B2 = A0B();
        if (A0B2 != null) {
            Handler handler = this.A04;
            handler.removeMessages(0);
            long elapsedRealtime = (A0B2.A02 - SystemClock.elapsedRealtime()) - 60000;
            C18260x0.A12("routeselector/settimerorupdateroutes/creating timer task with delay ", AnonymousClass001.A0o(), elapsedRealtime);
            handler.sendEmptyMessageDelayed(0, elapsedRealtime);
        }
    }

    public final void A0I(AnonymousClass5LI r19) {
        AtomicBoolean atomicBoolean;
        C47502dM r5;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("routeselector/setroutinginfo/got a RoutingResponse with ");
        AnonymousClass5LI r3 = r19;
        List list = r3.A0A;
        A0o.append(list.size());
        C18260x0.A1L(A0o, " route classes");
        this.A0E.A00.A02();
        synchronized (this.A0I) {
            AnonymousClass5LI r4 = this.A00;
            if (r4 == null || r3.A0B) {
                this.A00 = r3;
                Iterator A042 = C61102zi.A04(this, "RouteSelector/notifyConnectionBlockChanged");
                while (A042.hasNext()) {
                    C86514Kk r42 = (C86514Kk) ((AnonymousClass65W) A042.next());
                    if (r42.A01 != 0) {
                        AnonymousClass1I5 r10 = (AnonymousClass1I5) r42.A00;
                        Log.d("MediaUpload/newRoutingResponseReceivedObserved/start");
                        if (r10.A01 != null) {
                            AnonymousClass2UD r6 = r10.A0V.A02;
                            String str = r6.A06.A02;
                            C47502dM A002 = AnonymousClass3UQ.A00("fallback", str, (String) null, list, true);
                            C47502dM A003 = AnonymousClass3UQ.A00("primary", str, (String) null, list, true);
                            if (A003 == null) {
                                A003 = A002;
                            }
                            AnonymousClass7US B6Y = r10.A01.A00.B6Y();
                            C614230q r9 = (C614230q) r10.A05.get();
                            if (!(B6Y == null || A003 == null || B6Y.A06.equals(A003.A04) || r9 == null || r6.A03 - r10.A0i <= 52428800)) {
                                Log.d("MediaUpload/newRoutingResponseReceivedObserved/primary host name has changed");
                                atomicBoolean = r9.A0G;
                            }
                        }
                    } else {
                        AnonymousClass1I7 r62 = (AnonymousClass1I7) r42.A00;
                        Log.d("MediaDownload/newRoutingResponseReceivedObserved/start");
                        if (r62.A00 != null) {
                            AnonymousClass1VX r14 = r62.A0T;
                            C56612sH r15 = r62.A0N;
                            C55682qk r13 = r62.A0A;
                            C47662dc r43 = r62.A0e;
                            String str2 = r43.A0A.A02;
                            String str3 = r43.A0G;
                            String str4 = r43.A0F;
                            boolean A1U = AnonymousClass000.A1U(2, r43.A03);
                            C47502dM A004 = AnonymousClass3UQ.A00("fallback", str2, (String) null, list, false);
                            String A032 = AnonymousClass3UQ.A03(r15, r14, str4, str2, A1U);
                            if (((A032 == null && (str3 == null || (A032 = AnonymousClass3UQ.A02(r13, r14, r3, str3)) == null)) || (r5 = AnonymousClass3UQ.A00("primary", str2, A032, list, false)) == null) && (r5 = AnonymousClass3UQ.A00("primary", str2, "0", list, false)) == null && (r5 = AnonymousClass3UQ.A00("primary", str2, (String) null, list, false)) == null) {
                                r5 = A004;
                            }
                            AnonymousClass7US B6Y2 = r62.A00.A00.B6Y();
                            if (!(B6Y2 == null || r5 == null || B6Y2.A06.equals(r5.A04))) {
                                Log.d("MediaDownload/newRoutingResponseReceivedObserved/primary host name has changed");
                                atomicBoolean = r62.A10;
                            }
                        } else {
                            continue;
                        }
                    }
                    atomicBoolean.set(true);
                }
            } else {
                List list2 = r4.A0A;
                this.A00 = new AnonymousClass5LI(r3.A08, r3.A09, list2, r3.A00, r3.A01, r3.A05, r3.A03, r3.A06, r3.A07, false);
                Log.i("routeselector/setroutinginfo/previous hosts retained");
            }
        }
        Object obj = this.A0J;
        synchronized (obj) {
            obj.notifyAll();
        }
        A0F();
    }

    public final boolean A0K() {
        Log.i("routeselector/requestroutinginfoifnulloralmostexpired");
        A0G();
        AnonymousClass5LI A0B2 = A0B();
        if (A0B2 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("routeselector/isroutinginfonulloralmostexpired/expiring at ");
            long j = A0B2.A04;
            A0o.append(j);
            A0o.append(" (");
            A0o.append(j - SystemClock.elapsedRealtime());
            C18260x0.A1L(A0o, "ms from now)");
            if (j > SystemClock.elapsedRealtime() + 120000) {
                if (this.A04.hasMessages(0)) {
                    return false;
                }
                A0F();
                return false;
            }
        }
        A0E();
        return true;
    }
}
