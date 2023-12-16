package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Vi  reason: invalid class name and case insensitive filesystem */
public class C194969Vi {
    public static final Object A0G = AnonymousClass002.A0D();
    public int A00 = 0;
    public C194839Ur A01;
    public final C69263Wi A02;
    public final C64773Ex A03;
    public final C64223Cq A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final C620733j A07;
    public final C617332a A08;
    public final AnonymousClass1VX A09;
    public final C40602Ha A0A;
    public final C620933l A0B;
    public final AnonymousClass9U5 A0C;
    public final AnonymousClass9U4 A0D;
    public final AnonymousClass9TT A0E;
    public final AnonymousClass4FS A0F;

    public void A06(AnonymousClass9RJ r19, boolean z) {
        C194869Uu r7;
        AnonymousClass9RJ r1 = r19;
        try {
            C59942xk A012 = A01();
            if (A012 != null) {
                long j = A012.A01;
                if (j > 0) {
                    AnonymousClass9TT r4 = this.A0E;
                    ConcurrentHashMap concurrentHashMap = r4.A02;
                    concurrentHashMap.clear();
                    r4.A01();
                    if (z || (r7 = (C194869Uu) concurrentHashMap.get(Long.valueOf(j))) == null || !A012.equals(r7.A08) || !this.A07.A0O().toString().equals(r7.A0D)) {
                        AnonymousClass9PK r9 = new AnonymousClass9PK(this.A02, this.A06, this.A0A, this.A0C);
                        String obj = this.A07.A0O().toString();
                        AnonymousClass9RY r8 = new AnonymousClass9RY(r1, this, A012, obj);
                        AnonymousClass9U5 r12 = r9.A03;
                        String A032 = r12.A07.A03();
                        AnonymousClass9IW r10 = new AnonymousClass9IW(new AnonymousClass9IN(A032), Long.valueOf(j), obj);
                        r12.A0F(new C203909oV(r9.A01.A00, r9.A02, r9.A00, r8, r9, r10, 3), r10.A00, A032, C625635p.A0L);
                        return;
                    } else if (r19 != null) {
                        r1.A00(A02());
                        return;
                    } else {
                        return;
                    }
                }
            }
            this.A0E.A00();
            if (r19 != null) {
                r1.A00((C194869Uu) null);
            }
        } catch (JSONException e) {
            Log.e("PAY: PaymentIncentiveManager/getIncentiveOfferInfo : ", e);
            this.A0E.A00();
            if (r19 != null) {
                Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed");
                r1.A00.BRy();
            }
        }
    }

    public synchronized void A09(boolean z) {
        if (this.A00 == 1) {
            Log.i("PAY: PaymentIncentiveManager/syncIncentiveData iq requests have yet to be fulfilled, aborting this iq call");
        } else {
            this.A00 = 1;
            A06(new AnonymousClass9RJ(new C196739bf(this), this, z), false);
        }
    }

    public boolean A0A() {
        C194869Uu r1;
        C194839Ur r0;
        try {
            C59942xk A012 = A01();
            if (A012 == null) {
                return false;
            }
            long j = A012.A01;
            if (j == 0 || (r1 = (C194869Uu) this.A0E.A02.get(Long.valueOf(j))) == null || r1.A03 != 0 || (r0 = this.A01) == null || !r0.A04) {
                return false;
            }
            return r1.A0A.A01;
        } catch (JSONException e) {
            Log.e("PAY: PaymentIncentiveManager/shouldSeedNewOffer : Error while fetching offer ID from ABProps ", e);
            e.printStackTrace();
            return false;
        }
    }

    public final C59942xk A01() {
        String A0Q = this.A09.A0Q(782);
        if (A0Q == null) {
            return null;
        }
        JSONObject A1H = AnonymousClass0x9.A1H(A0Q);
        return new C59942xk(A1H.getInt("update_count"), A1H.getLong("offer_id"));
    }

    public C194839Ur A03() {
        C194839Ur r0;
        synchronized (A0G) {
            r0 = this.A01;
        }
        return r0;
    }

    public void A04() {
        synchronized (A0G) {
            this.A01 = null;
            C620933l r2 = this.A0B;
            if (!TextUtils.isEmpty(r2.A03().getString("payment_incentive_user_claim_info", (String) null))) {
                C18270x1.A0j(C620933l.A00(r2), "payment_incentive_user_claim_info", (String) null);
            }
        }
    }

    public void A07(C203119n9 r15, long j) {
        AnonymousClass9PK r5 = new AnonymousClass9PK(this.A02, this.A06, this.A0A, this.A0C);
        long j2 = j;
        AnonymousClass9P1 r6 = new AnonymousClass9P1(r15, this, j2);
        AnonymousClass9U5 r8 = r5.A03;
        AnonymousClass39V[] r4 = new AnonymousClass39V[2];
        AnonymousClass39V.A04("action", "get-offer-eligibility", r4);
        r4[1] = new AnonymousClass39V("offer_id", j2);
        r8.A0G(new C203899oU(r5.A01.A00, r5.A02, r5.A00, r5, r6, 20), C1899693i.A0U(r4), "get", C625635p.A0L);
    }

    public void A08(C203119n9 r15, AnonymousClass36K r16, long j) {
        try {
            long j2 = j;
            C194839Ur r8 = new C194839Ur(r16, j2, this.A05.A0H());
            synchronized (A0G) {
                C194869Uu r6 = (C194869Uu) this.A0E.A02.get(Long.valueOf(j2));
                if (r6 != null && r6.A01 > 0) {
                    int i = 0;
                    if (((long) (r8.A00 + r8.A01)) >= r6.A05) {
                        i = 1;
                    }
                    r6.A01 = i;
                }
                this.A01 = r8;
                C620933l r3 = this.A0B;
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("offer_id", r8.A03);
                A1G.put("is_eligible", r8.A04);
                A1G.put("pending_count", r8.A00);
                A1G.put("redeemed_count", r8.A01);
                A1G.put("last_sync_time_ms", r8.A02);
                C18270x1.A0j(C620933l.A00(r3), "payment_incentive_user_claim_info", A1G.toString());
            }
            if (r15 != null) {
                r15.Bd6(r8);
            }
        } catch (Exception e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "processSuccessfulGetClaimStatus: Error while parsing: ", e);
            A04();
            if (r15 != null) {
                r15.BRy();
            }
        }
    }

    public C194969Vi(C69263Wi r4, C64773Ex r5, C64223Cq r6, C56612sH r7, C54292oU r8, C620733j r9, C617332a r10, AnonymousClass1VX r11, C40602Ha r12, C620933l r13, AnonymousClass9U5 r14, AnonymousClass9U4 r15, AnonymousClass4FS r16) {
        this.A05 = r7;
        this.A09 = r11;
        this.A02 = r4;
        this.A06 = r8;
        this.A0F = r16;
        this.A07 = r9;
        this.A03 = r5;
        this.A0D = r15;
        this.A04 = r6;
        this.A0B = r13;
        this.A0C = r14;
        this.A08 = r10;
        this.A0A = r12;
        AnonymousClass9TT r0 = new AnonymousClass9TT(r7, r13);
        this.A0E = r0;
        r0.A01();
        String A0Z = C18280x3.A0Z(this.A0B.A03(), "payment_incentive_user_claim_info");
        if (!TextUtils.isEmpty(A0Z)) {
            try {
                synchronized (A0G) {
                    this.A01 = new C194839Ur(A0Z);
                }
            } catch (JSONException unused) {
                A04();
            }
        }
    }

    public AnonymousClass9VG A00() {
        C194869Uu A022 = A02();
        C194839Ur A032 = A03();
        if (A022 == null || !(A032 == null || A032.A03 == A022.A08.A01)) {
            A04();
        }
        return new AnonymousClass9VG(A022, A03());
    }

    public C194869Uu A02() {
        try {
            C59942xk A012 = A01();
            if (A012 == null || A012.A00 <= 0) {
                return null;
            }
            AnonymousClass9TT r3 = this.A0E;
            long j = A012.A01;
            ConcurrentHashMap concurrentHashMap = r3.A02;
            Long valueOf = Long.valueOf(j);
            C194869Uu r0 = (C194869Uu) concurrentHashMap.get(valueOf);
            if (r0 != null) {
                return r0;
            }
            concurrentHashMap.clear();
            r3.A01();
            return (C194869Uu) concurrentHashMap.get(valueOf);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void A05(int i, int i2) {
        try {
            C194869Uu A022 = A02();
            C59942xk A012 = A01();
            if (A022 != null && A012 != null) {
                if (i >= 0) {
                    A022.A00 = 1;
                }
                if (i2 >= 0) {
                    A022.A01 = i2;
                }
                this.A0E.A03(A022, A012.A01);
            }
        } catch (Exception e) {
            Log.e("PAY: PaymentIncentiveManager/processUiOfferDetails : Error while parsing ", e);
        }
    }
}
