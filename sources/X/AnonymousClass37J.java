package X;

import android.content.SharedPreferences;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.37J  reason: invalid class name */
public final class AnonymousClass37J implements SharedPreferences.Editor {
    public boolean A00 = false;
    public final Object A01 = AnonymousClass002.A0D();
    public final Map A02 = AnonymousClass001.A0t();
    public final /* synthetic */ AnonymousClass37K A03;

    public AnonymousClass37J(AnonymousClass37K r2) {
        this.A03 = r2;
    }

    public final AnonymousClass7O1 A00() {
        Map map;
        ArrayList arrayList;
        long j;
        Object obj;
        boolean z;
        AnonymousClass37K r8 = this.A03;
        synchronized (r8.A0A) {
            if (r8.A00 > 0) {
                r8.A04 = new HashMap(r8.A04);
            }
            map = r8.A04;
            r8.A00++;
            boolean z2 = !r8.A0D.isEmpty();
            if (z2) {
                arrayList = AnonymousClass001.A0s();
            } else {
                arrayList = null;
            }
            synchronized (this.A01) {
                boolean z3 = false;
                if (this.A00) {
                    if (!map.isEmpty()) {
                        map.clear();
                        z = true;
                    } else {
                        z = false;
                    }
                    this.A00 = false;
                    z3 = z;
                }
                Map map2 = this.A02;
                Iterator A0q = AnonymousClass000.A0q(map2);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    String A0q2 = C18310x6.A0q(A0w);
                    Object value = A0w.getValue();
                    if (value == this || value == null) {
                        if (map.containsKey(A0q2)) {
                            map.remove(A0q2);
                        }
                    } else if (!map.containsKey(A0q2) || (obj = map.get(A0q2)) == null || !obj.equals(value)) {
                        map.put(A0q2, value);
                    }
                    if (z2) {
                        arrayList.add(A0q2);
                    }
                    z3 = true;
                }
                map2.clear();
                if (z3) {
                    r8.A01 = 1 + r8.A01;
                }
                j = r8.A01;
            }
        }
        return new AnonymousClass7O1(arrayList, map, j);
    }

    public final void A01(AnonymousClass7O1 r8) {
        List list = r8.A01;
        if (list != null && list.size() != 0) {
            AnonymousClass37K r5 = this.A03;
            synchronized (r5.A0A) {
                Map map = r5.A0D;
                if (!map.isEmpty()) {
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        String A0n = AnonymousClass001.A0n(list, size);
                        Map A1B = AnonymousClass0x9.A1B(A0n, map);
                        if (A1B != null) {
                            A02(A0n, A1B);
                        }
                        Map A1B2 = AnonymousClass0x9.A1B(r5.A0C, map);
                        if (A1B2 != null) {
                            A02(A0n, A1B2);
                        }
                    }
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        synchronized (this.A01) {
            this.A00 = true;
        }
        return this;
    }

    public boolean commit() {
        boolean A1U;
        AnonymousClass37K r6 = this.A03;
        if (r6.A09.A04) {
            Log.d("LightSharedPreferencesImpl/commit rejected as it is executed after shutdown");
            return false;
        }
        AnonymousClass7O1 A002 = A00();
        C117665sI r2 = new C117665sI(r6, A002, 38, true);
        synchronized (r6.A0A) {
            A1U = AnonymousClass000.A1U(r6.A00, 1);
        }
        if (A1U) {
            r2.run();
        } else {
            r6.A01(r2, false);
        }
        try {
            A002.A03.await();
            A01(A002);
            return A002.A04;
        } catch (InterruptedException e) {
            Log.e("LightSharedPreferencesImpl/Commit: Got exception:", e);
            return false;
        }
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.A01) {
            this.A02.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.A01) {
            this.A02.put(str, Float.valueOf(f));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.A01) {
            C18280x3.A1D(str, this.A02, i);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.A01) {
            AnonymousClass0x2.A1K(str, this.A02, j);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.A01) {
            this.A02.put(str, str2);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        HashSet hashSet;
        synchronized (this.A01) {
            Map map = this.A02;
            if (set == null) {
                hashSet = null;
            } else {
                hashSet = AnonymousClass0x9.A15(set);
            }
            map.put(str, hashSet);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        synchronized (this.A01) {
            this.A02.put(str, this);
        }
        return this;
    }

    public final void A02(String str, Map map) {
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            ((Handler) A0w.getValue()).post(new C71403c3(this, A0w.getKey(), str, 6));
        }
    }

    public void apply() {
        AnonymousClass7O1 A002 = A00();
        AnonymousClass37K r3 = this.A03;
        r3.A01(new C117665sI(r3, A002, 38, false), true);
        A01(A002);
    }
}
