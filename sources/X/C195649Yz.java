package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9Yz  reason: invalid class name and case insensitive filesystem */
public class C195649Yz implements C203449ni, C184828sc {
    public int A00 = 0;
    public final Context A01;
    public final C194719Uf A02;
    public final C194439Sw A03 = new C194439Sw();
    public final Map A04 = AnonymousClass001.A0t();
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();

    public void A02(C187548xO r5, AnonymousClass71V r6) {
        this.A05.put(r5, r5);
        Map map = this.A04;
        synchronized (map) {
            Map map2 = (Map) map.get(r6);
            if (map2 == null) {
                map2 = AnonymousClass001.A0t();
                map.put(r6, map2);
            }
            map2.put(0, r5);
        }
    }

    public C187548xO B5j(AnonymousClass71V r5) {
        C187548xO r0;
        synchronized (this) {
            A01();
            Map map = this.A04;
            synchronized (map) {
                try {
                    Map map2 = (Map) map.get(r5);
                    if (map2 != null) {
                        r0 = (C187548xO) AnonymousClass001.A0i(map2, 0);
                    } else {
                        r0 = null;
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            if (r0 == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Requested component is null for index: ");
                A0o.append(0);
                th = AnonymousClass000.A0H(r5, " and componentClass: ", A0o);
                throw th;
            }
        }
        return r0;
    }

    public synchronized void Bk9() {
        C203689o9 r2;
        A01();
        int i = this.A00;
        if (i == 0) {
            throw AnonymousClass001.A0e("LiteCameraController must be initialized before invoking resume()");
        } else if (i == 1) {
            AnonymousClass9LH r1 = C203689o9.A00;
            if (BHH(r1)) {
                r2 = (C203689o9) B5k(r1);
                if (r2 != null) {
                    A00(r2, this, "connect_controllers_started");
                }
            } else {
                r2 = null;
            }
            this.A00 = 2;
            Iterator A10 = C18290x4.A10(this.A05);
            while (A10.hasNext()) {
                ((C187548xO) A10.next()).connect();
            }
            if (r2 != null) {
                A00(r2, this, "connect_controllers_finished");
            }
        }
    }

    public synchronized void destroy() {
        if (this.A00 != 0) {
            pause();
            Iterator A10 = C18290x4.A10(this.A05);
            while (A10.hasNext()) {
                ((C187548xO) A10.next()).release();
            }
            this.A00 = 0;
        }
    }

    public synchronized void pause() {
        int i = this.A00;
        if (i == 0) {
            throw AnonymousClass001.A0e("LiteCameraController must be initialized before invoking pause()");
        } else if (i == 2) {
            this.A00 = 1;
            Iterator A10 = C18290x4.A10(this.A05);
            while (A10.hasNext()) {
                ((C187548xO) A10.next()).B1l();
            }
        }
    }

    public static void A00(C203689o9 r6, Object obj, String str) {
        r6.BK4(str, "ComponentManager", (Map) null, (long) obj.hashCode());
    }

    public void A01() {
        C203689o9 r5;
        if (this.A00 == 0) {
            AnonymousClass9LH r1 = C203689o9.A00;
            if (BHH(r1)) {
                r5 = (C203689o9) B5k(r1);
                if (r5 != null) {
                    A00(r5, this, "init_controllers_started");
                }
            } else {
                r5 = null;
            }
            this.A00 = 1;
            List list = this.A03.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass9ZP r12 = (AnonymousClass9ZP) ((C202319lp) list.get(i));
                if (!r12.A01) {
                    r12.A01 = true;
                }
            }
            ConcurrentHashMap concurrentHashMap = this.A05;
            Iterator A10 = C18290x4.A10(concurrentHashMap);
            while (A10.hasNext()) {
                ((C185578tu) A10.next()).BFn();
            }
            Iterator A102 = C18290x4.A10(concurrentHashMap);
            while (A102.hasNext()) {
                ((C185578tu) A102.next()).BFy();
            }
            if (r5 != null) {
                A00(r5, this, "init_controllers_finished");
            }
        }
    }

    public void A03(C202319lp r3) {
        C194439Sw r1 = this.A03;
        if (!r1.A00.contains(r3)) {
            r1.A01(r3);
            AnonymousClass9ZP r32 = (AnonymousClass9ZP) r3;
            if (!r32.A01) {
                r32.A01 = true;
            }
        }
    }

    public C202319lp B5k(AnonymousClass9LH r6) {
        List list = this.A03.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C202319lp r1 = (C202319lp) list.get(i);
            if (r1.B8v() == r6) {
                return r1;
            }
        }
        throw AnonymousClass000.A0E(r6, "Requested core component is null for key ", AnonymousClass001.A0o());
    }

    public Object B5l(AnonymousClass9LE r2) {
        return this.A02.A00.get(r2);
    }

    public boolean BHG(AnonymousClass71V r3) {
        boolean containsKey;
        Map map = this.A04;
        synchronized (map) {
            containsKey = map.containsKey(r3);
        }
        return containsKey;
    }

    public boolean BHH(AnonymousClass9LH r6) {
        List list = this.A03.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C202319lp) list.get(i)).B8v() == r6) {
                return true;
            }
        }
        return false;
    }

    public C195649Yz(Context context, C194719Uf r3) {
        this.A01 = context.getApplicationContext();
        this.A02 = r3;
    }

    public Context getContext() {
        return this.A01;
    }
}
