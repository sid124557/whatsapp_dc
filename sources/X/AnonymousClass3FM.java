package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3FM  reason: invalid class name */
public class AnonymousClass3FM implements AnonymousClass4E8 {
    public final AnonymousClass30D A00;

    public void BQX() {
        Map map;
        long j;
        AnonymousClass30D r7 = this.A00;
        C56972sr r6 = r7.A01;
        if (C56972sr.A00(r6) != null) {
            C26011bR r5 = new C26011bR();
            C172878Nf A002 = C48602fA.A00(r7);
            while (A002.hasNext()) {
                AnonymousClass31D r1 = (AnonymousClass31D) A002.next();
                if (r1 instanceof C23161Rn) {
                    r5.A0R = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof AnonymousClass1RY) {
                    r5.A0Q = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23251Rw) {
                    r5.A0A = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23031Ra) {
                    r5.A0B = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23041Rb) {
                    r5.A04 = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23061Rd) {
                    r5.A03 = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23221Rt) {
                    r5.A01 = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23181Rp) {
                    r5.A00 = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23121Rj) {
                    r5.A0W = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23211Rs) {
                    r5.A0U = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23171Ro) {
                    r5.A0T = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23111Ri) {
                    r5.A0S = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23271Ry) {
                    r5.A0P = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23261Rx) {
                    r5.A0O = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof AnonymousClass1RX) {
                    r5.A0N = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23101Rh) {
                    r5.A0M = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23081Rf) {
                    r5.A0L = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23191Rq) {
                    r5.A0K = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23151Rm) {
                    r5.A0H = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23281Rz) {
                    r5.A0I = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23241Rv) {
                    r5.A0G = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23141Rl) {
                    r5.A0F = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23201Rr) {
                    r5.A0E = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23131Rk) {
                    r5.A0C = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23051Rc) {
                    r5.A09 = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23231Ru) {
                    r5.A08 = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23091Rg) {
                    r5.A07 = AnonymousClass31D.A05(r1);
                } else if (r1 instanceof C23071Re) {
                    r5.A02 = AnonymousClass31D.A05(r1);
                }
            }
            Integer A0f = AnonymousClass001.A0f();
            r5.A05 = A0f;
            r5.A06 = A0f;
            r5.A0D = A0f;
            r5.A0J = A0f;
            r5.A0V = A0f;
            long A0A = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(r7.A05), "db_last_all_migrations_attempt_timestamp");
            if (A0A >= 0) {
                j = C56612sH.A03(r7.A04, A0A);
            } else {
                j = -1;
            }
            r5.A0X = Long.valueOf(j);
            r7.A0D.BhA(r5);
        }
        if (C56972sr.A00(r6) != null) {
            AnonymousClass1VX r2 = r7.A0C;
            C58422vE r12 = C58422vE.A02;
            if (r2.A0Y(r12, 2803)) {
                Log.i("DatabaseMigrationManager/analyzeStuckMigrations/expedited app upgrade disabled");
                return;
            }
            String A0R = r2.A0R(r12, 2804);
            if (C107575bX.A0F(A0R)) {
                map = Collections.emptyMap();
            } else {
                HashMap A0t = AnonymousClass001.A0t();
                try {
                    JSONObject A1H = AnonymousClass0x9.A1H(A0R);
                    Iterator<String> keys = A1H.keys();
                    while (keys.hasNext()) {
                        String A0m = AnonymousClass001.A0m(keys);
                        AnonymousClass0x2.A1I(A0m, A0t, A1H.getInt(A0m));
                    }
                    map = A0t;
                } catch (JSONException e) {
                    C18260x0.A0u("DatabaseMigrationManager/parseKnownVersions/malformed json ", A0R, AnonymousClass001.A0o(), e);
                    r7.A00.A0A("db-migration-parse-known-versions/malformed", false, e.getMessage());
                    map = A0t;
                }
            }
            if (!map.isEmpty()) {
                C172878Nf A003 = C48602fA.A00(r7);
                while (A003.hasNext()) {
                    AnonymousClass31D r22 = (AnonymousClass31D) A003.next();
                    if (r22.A0Q()) {
                        int i = r22.A00;
                        String str = r22.A0C;
                        Number A0q = AnonymousClass0x9.A0q(str, map);
                        if (A0q != null && A0q.intValue() > i) {
                            C18260x0.A0s("DatabaseMigrationManager/analyzeStuckMigrations/need to upgrade app because of ", str, AnonymousClass001.A0o());
                            r7.A02.A02(r7.A04.A0H() + 1209600000);
                            return;
                        }
                    }
                }
            }
        }
    }

    public AnonymousClass3FM(AnonymousClass30D r1) {
        this.A00 = r1;
    }

    public String BDW() {
        return "DataMigrationDailyCron";
    }

    public /* synthetic */ void BQW() {
    }
}
