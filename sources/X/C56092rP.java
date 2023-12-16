package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2rP  reason: invalid class name and case insensitive filesystem */
public class C56092rP {
    public SharedPreferences A00;
    public SharedPreferences A01;
    public AnonymousClass4FV A02 = null;
    public HashMap A03 = null;
    public final C56612sH A04;
    public final C60152y5 A05;

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A05.A03("ps_mini_buffer_sequence_number_store");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A01;
        if (sharedPreferences == null) {
            sharedPreferences = this.A05.A03("psid_store");
            this.A01 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public synchronized String A02(int i) {
        String str;
        IllegalArgumentException illegalArgumentException;
        if (i == 0) {
            str = "00000000-0000-0000-0000-000000000000";
        } else {
            HashMap hashMap = this.A03;
            if (hashMap == null) {
                hashMap = A03();
                this.A03 = hashMap;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashMap.containsKey(valueOf)) {
                AnonymousClass2RC r7 = (AnonymousClass2RC) this.A03.get(valueOf);
                if (r7 != null) {
                    int i2 = r7.A04;
                    if (i2 == -1) {
                        str = r7.A03;
                    } else {
                        long A0H = this.A04.A0H() / 86400000;
                        if (A0H - r7.A02 >= ((long) i2)) {
                            String str2 = r7.A03;
                            r7.A03 = C18280x3.A0Y();
                            r7.A02 = A0H;
                            r7.A00 = 0;
                            r7.A01 = A0H;
                            this.A03.put(valueOf, r7);
                            A05(r7, valueOf);
                            C18270x1.A0n(A00(), str2);
                            A04(2, i, i2);
                        }
                        str = r7.A03;
                    }
                } else {
                    illegalArgumentException = AnonymousClass001.A0c("Invalid psIdKey");
                }
            } else {
                illegalArgumentException = AnonymousClass001.A0c("Invalid psIdKey");
            }
            throw illegalArgumentException;
        }
        return str;
    }

    public synchronized HashMap A03() {
        Map<String, ?> all = A01().getAll();
        this.A03 = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(all);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            try {
                Integer valueOf = Integer.valueOf(C18310x6.A0q(A0w));
                try {
                    JSONObject A1H = AnonymousClass0x9.A1H(AnonymousClass0x9.A12(A0w));
                    this.A03.put(valueOf, new AnonymousClass2RC(A1H.getString("psIdValue"), A1H.getInt("rotationInDays"), A1H.getInt("beaconEvtNumber"), A1H.getLong("lastRotationTimeUtcDay"), C18320x8.A06("beaconUpdateDay", A1H)));
                } catch (JSONException e) {
                    C18260x0.A1O(AnonymousClass001.A0o(), "psidstore/loadFromFile bad json ", e);
                    C18270x1.A0g(A01().edit(), C18310x6.A0q(A0w));
                }
            } catch (NumberFormatException unused) {
                Log.e("psidstore/loadfromfile ps-id key is corrupted");
            }
        }
        return this.A03;
    }

    public synchronized void A05(AnonymousClass2RC r5, Integer num) {
        HashMap hashMap = this.A03;
        if (hashMap == null) {
            hashMap = A03();
            this.A03 = hashMap;
        }
        if (!hashMap.containsKey(num)) {
            throw AnonymousClass001.A0c("Invalid PS-ID key");
        } else if (r5 == null) {
            this.A03.remove(num);
            C18270x1.A0g(A01().edit(), num.toString());
        } else {
            this.A03.put(num, r5);
            try {
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("psIdValue", r5.A03);
                A1G.put("rotationInDays", r5.A04);
                A1G.put("lastRotationTimeUtcDay", r5.A02);
                A1G.put("beaconEvtNumber", r5.A00);
                A1G.put("beaconUpdateDay", r5.A01);
                C18270x1.A0e(A01().edit(), A1G, num.toString());
            } catch (JSONException e) {
                C18260x0.A1O(AnonymousClass001.A0o(), "psidstore/updatePsIdRecord JEX ", e);
            }
        }
        return;
    }

    public final void A04(int i, int i2, int i3) {
        if (this.A02 != null) {
            AnonymousClass1YW r1 = new AnonymousClass1YW();
            r1.A00 = Integer.valueOf(i);
            r1.A01 = AnonymousClass0x9.A0m(i2);
            r1.A02 = AnonymousClass0x9.A0m(i3);
            this.A02.BhA(r1);
        }
    }

    public synchronized void A06(String str, ArrayList arrayList) {
        int i;
        ArrayList arrayList2;
        String str2;
        int i2;
        synchronized (this) {
            HashMap hashMap = this.A03;
            if (hashMap == null) {
                hashMap = A03();
                this.A03 = hashMap;
            }
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator A11 = C18290x4.A11(hashMap);
            while (true) {
                arrayList2 = arrayList;
                if (!A11.hasNext()) {
                    break;
                }
                Integer num = (Integer) A11.next();
                int i3 = 0;
                while (true) {
                    if (i3 < arrayList2.size()) {
                        if (num.intValue() == ((AnonymousClass2O3) arrayList2.get(i3)).A00) {
                            break;
                        }
                        i3++;
                    } else {
                        A0s.add(num);
                        break;
                    }
                }
            }
            for (int i4 = 0; i4 < A0s.size(); i4++) {
                Integer num2 = (Integer) A0s.get(i4);
                AnonymousClass2RC r0 = (AnonymousClass2RC) this.A03.get(num2);
                if (r0 != null) {
                    i2 = r0.A04;
                    C18270x1.A0n(A00(), r0.A03);
                } else {
                    i2 = 0;
                }
                A05((AnonymousClass2RC) null, num2);
                A04(3, num2.intValue(), i2);
            }
            long A0H = this.A04.A0H();
            long currentTimeMillis = System.currentTimeMillis() / 86400000;
            for (i = 0; i < arrayList2.size(); i++) {
                AnonymousClass2O3 r6 = (AnonymousClass2O3) arrayList2.get(i);
                if (!this.A03.containsKey(Integer.valueOf(r6.A00))) {
                    if (str == null || r6.A00 != 113760892) {
                        str2 = C18280x3.A0Y();
                        A04(1, r6.A00, r6.A01);
                    } else {
                        str2 = str;
                    }
                    AnonymousClass2RC r11 = new AnonymousClass2RC(str2, r6.A01, 0, A0H / 86400000, currentTimeMillis);
                    AnonymousClass0x2.A1H(r11, this.A03, r6.A00);
                    A05(r11, Integer.valueOf(r6.A00));
                }
            }
        }
    }

    public C56092rP(C56612sH r2, C60152y5 r3) {
        this.A04 = r2;
        this.A05 = r3;
    }
}
