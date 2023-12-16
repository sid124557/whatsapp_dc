package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.37K  reason: invalid class name */
public class AnonymousClass37K implements SharedPreferences {
    public int A00;
    public long A01;
    public long A02;
    public Throwable A03;
    public Map A04 = AnonymousClass001.A0t();
    public boolean A05;
    public final int A06;
    public final Handler A07 = AnonymousClass000.A0A();
    public final AnonymousClass7LF A08;
    public final C43162Ra A09;
    public final Object A0A = AnonymousClass002.A0D();
    public final Object A0B = AnonymousClass002.A0D();
    public final String A0C = C18280x3.A0Y();
    public final Map A0D = AnonymousClass001.A0t();
    public final boolean A0E;

    public final void A00() {
        while (!this.A05) {
            try {
                this.A0A.wait();
            } catch (InterruptedException unused) {
            }
        }
        Throwable th = this.A03;
        if (th != null) {
            throw new IllegalStateException(th);
        }
    }

    public final void A01(Runnable runnable, boolean z) {
        C72173dI r4;
        C43162Ra r5 = this.A09;
        int i = this.A06;
        if (r5.A04) {
            Log.d("LightPreferencesDiskIoHandler/execute/task rejected as it is executed after shutdown");
            return;
        }
        synchronized (r5) {
            SparseArray sparseArray = r5.A02;
            r4 = (C72173dI) sparseArray.get(i);
            if (r4 == null) {
                r4 = new C72173dI(r5.A03, true);
                sparseArray.put(i, r4);
            }
        }
        if (z) {
            r5.A00.postDelayed(new C70123Zz(r4, 41, runnable), 100);
        } else {
            r4.execute(runnable);
        }
    }

    public boolean contains(String str) {
        boolean containsKey;
        synchronized (this.A0A) {
            A00();
            containsKey = this.A04.containsKey(str);
        }
        return containsKey;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        synchronized (this.A0A) {
            A00();
        }
        return new AnonymousClass37J(this);
    }

    public Map getAll() {
        HashMap hashMap;
        synchronized (this.A0A) {
            A00();
            hashMap = new HashMap(this.A04);
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        synchronized (this.A0A) {
            A00();
            Boolean bool = (Boolean) this.A04.get(str);
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    public float getFloat(String str, float f) {
        synchronized (this.A0A) {
            A00();
            Float f2 = (Float) this.A04.get(str);
            if (f2 != null) {
                f = f2.floatValue();
            }
        }
        return f;
    }

    public int getInt(String str, int i) {
        synchronized (this.A0A) {
            A00();
            Integer num = (Integer) this.A04.get(str);
            if (num != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    public long getLong(String str, long j) {
        synchronized (this.A0A) {
            A00();
            Long l = (Long) this.A04.get(str);
            if (l != null) {
                j = l.longValue();
            }
        }
        return j;
    }

    public String getString(String str, String str2) {
        synchronized (this.A0A) {
            A00();
            String A0o = C18310x6.A0o(str, this.A04);
            if (A0o != null) {
                str2 = A0o;
            }
        }
        return str2;
    }

    public Set getStringSet(String str, Set set) {
        synchronized (this.A0A) {
            A00();
            Set set2 = (Set) this.A04.get(str);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0C;
        Handler handler = this.A07;
        synchronized (this.A0A) {
            Map map = this.A0D;
            C626936e.A06(str);
            WeakHashMap weakHashMap = (WeakHashMap) map.get(str);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                map.put(str, weakHashMap);
            }
            C626936e.A06(onSharedPreferenceChangeListener);
            C626936e.A06(handler);
            weakHashMap.put(onSharedPreferenceChangeListener, handler);
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        String str = this.A0C;
        synchronized (this.A0A) {
            Map map = this.A0D;
            C626936e.A06(str);
            Map A1B = AnonymousClass0x9.A1B(str, map);
            if (A1B != null) {
                C626936e.A06(onSharedPreferenceChangeListener);
                A1B.remove(onSharedPreferenceChangeListener);
            }
        }
    }

    public AnonymousClass37K(AnonymousClass7LF r4, C43162Ra r5, int i, boolean z) {
        this.A08 = r4;
        this.A0E = z;
        this.A09 = r5;
        this.A06 = i;
        synchronized (this.A0A) {
            this.A05 = false;
        }
        A01(C71263bp.A00(this, 27), false);
    }
}
