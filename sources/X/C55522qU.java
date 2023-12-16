package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2qU  reason: invalid class name and case insensitive filesystem */
public class C55522qU {
    public SharedPreferences A00;
    public C72173dI A01;
    public ConcurrentHashMap A02 = new ConcurrentHashMap(4);
    public final C56612sH A03;
    public final AnonymousClass1VX A04;
    public final C60152y5 A05;
    public final AnonymousClass2Wr A06;
    public final AnonymousClass3S8 A07;
    public final AnonymousClass4FS A08;
    public volatile boolean A09;

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A05.A03("notice_store");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public boolean A04() {
        if (!this.A04.A0Y(C58422vE.A01, 1799)) {
            return false;
        }
        AnonymousClass3S8 r3 = this.A07;
        List<C60222yC> A022 = r3.A07.A02();
        A022.size();
        for (C60222yC A032 : A022) {
            if (r3.A03(A032, false)) {
                return true;
            }
        }
        return false;
    }

    public final void A02(int i) {
        ConcurrentHashMap concurrentHashMap = this.A02;
        Integer valueOf = Integer.valueOf(i);
        if (concurrentHashMap.get(valueOf) != null) {
            concurrentHashMap.remove(valueOf);
            C18270x1.A0g(A00().edit(), String.valueOf(i));
            C18260x0.A0w("noticebadgemanager/removenotice Notices have been removed! Removed notice id: ", AnonymousClass001.A0o(), i);
        }
    }

    public final void A03(int i, int i2) {
        ConcurrentHashMap concurrentHashMap = this.A02;
        if (concurrentHashMap.size() == 0) {
            A01();
        }
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass7NB r4 = (AnonymousClass7NB) concurrentHashMap.get(valueOf);
        if (r4 != null) {
            int i3 = r4.A00;
            if (i2 > i3 && i3 != -1) {
                r4.A00 = i2;
                if (i3 < 4 && i2 == 4) {
                    r4.A03 = C56612sH.A00(this.A03);
                }
                concurrentHashMap.put(valueOf, r4);
                try {
                    JSONObject A1G = AnonymousClass0x9.A1G();
                    A1G.put("viewId", r4.A01);
                    A1G.put("badgeStage", r4.A00);
                    A1G.put("enabledTimeInSeconds", r4.A02);
                    A1G.put("selectedTimeInSeconds", r4.A03);
                    C18270x1.A0e(A00().edit(), A1G, String.valueOf(i));
                } catch (JSONException e) {
                    C18260x0.A1O(AnonymousClass001.A0o(), "noticebadgemanager/savenotice JEX ", e);
                }
            }
        } else {
            throw AnonymousClass001.A0c("Invalid noticeId");
        }
    }

    public C55522qU(C56612sH r3, AnonymousClass1VX r4, C60152y5 r5, AnonymousClass2Wr r6, AnonymousClass3S8 r7, AnonymousClass4FS r8) {
        this.A03 = r3;
        this.A04 = r4;
        this.A08 = r8;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = r5;
    }

    public final void A01() {
        Map.Entry A0w;
        StringBuilder sb;
        String str;
        Iterator A0q = AnonymousClass000.A0q(A00().getAll());
        while (A0q.hasNext()) {
            A0w = AnonymousClass001.A0w(A0q);
            try {
                Integer valueOf = Integer.valueOf(C18310x6.A0q(A0w));
                try {
                    JSONObject A1H = AnonymousClass0x9.A1H(AnonymousClass0x9.A12(A0w));
                    this.A02.put(valueOf, new AnonymousClass7NB(A1H.getInt("viewId"), A1H.getInt("badgeStage"), A1H.getLong("enabledTimeInSeconds"), A1H.getLong("selectedTimeInSeconds")));
                } catch (JSONException e) {
                    e = e;
                    sb = AnonymousClass001.A0o();
                    str = "noticebadgemanager/loadFromFile bad json ";
                } catch (NumberFormatException e2) {
                    e = e2;
                    sb = AnonymousClass001.A0o();
                    str = "noticebadgemanager/loadFromFile corrupted number ";
                }
            } catch (NumberFormatException unused) {
                Log.e("noticebadgemanager/loadfromfile notice id key is corrupted");
            }
        }
        return;
        C18260x0.A1O(sb, str, e);
        C18270x1.A0g(A00().edit(), C18310x6.A0q(A0w));
    }
}
