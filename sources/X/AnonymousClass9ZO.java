package X;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9ZO  reason: invalid class name */
public class AnonymousClass9ZO implements C185298tP {
    public final Handler A00;
    public final C157207hv A01;
    public final C203689o9 A02;
    public final C185568tt A03;
    public final C193799Qc A04;
    public final AnonymousClass9RD A05;
    public final Map A06 = AnonymousClass001.A0t();

    public void AwS(C186198uu r6, int i) {
        AnonymousClass9RD r0 = this.A05;
        C185568tt r3 = this.A03;
        SparseArray sparseArray = r0.A00;
        AnonymousClass9ZF r1 = (AnonymousClass9ZF) sparseArray.get(0);
        if (r1 == null) {
            synchronized (sparseArray) {
                r1 = (AnonymousClass9ZF) sparseArray.get(0);
                if (r1 == null) {
                    r1 = new AnonymousClass9ZF(r0.A02);
                    sparseArray.put(0, r1);
                }
            }
        }
        if (!((AnonymousClass9ZJ) r3).A09.A00.contains(r1)) {
            r3.AxO(r1);
        }
        r1.A00(r3, r6);
        C203689o9 r32 = this.A02;
        if (r32 != null) {
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("output_index", String.valueOf(0));
            A0t.put("output_class", r6.getClass().getSimpleName());
            C1899693i.A0m(r32, this, "media_pipeline_add_output", "MediaGraphIOImpl", A0t);
        }
    }

    public void BjB(int i, Object obj) {
        AnonymousClass9ZF r0 = (AnonymousClass9ZF) this.A05.A00.get(0);
        if (r0 != null) {
            r0.A02(obj);
        }
        C203689o9 r3 = this.A02;
        if (r3 != null) {
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("output_index", String.valueOf(0));
            C1899693i.A0m(r3, this, "media_pipeline_remove_output", "MediaGraphIOImpl", A0t);
        }
    }

    public void BmR(C1680083t r7, int i) {
        C193799Qc r4 = this.A04;
        C185568tt r3 = this.A03;
        Handler handler = this.A00;
        if (r4.A00.get(0) != r7) {
            if (handler.getLooper() == Looper.myLooper()) {
                r4.A00(r3, r7);
            } else {
                handler.post(new AnonymousClass9j1(r3, r4, r7));
            }
        }
        C203689o9 r32 = this.A02;
        if (r32 != null) {
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("input_index", String.valueOf(0));
            C1899693i.A0m(r32, this, "media_pipeline_add_input", "MediaGraphIOImpl", A0t);
        }
    }

    public AnonymousClass9ZO(C157207hv r4, C203689o9 r5, C185568tt r6) {
        C193799Qc r2 = new C193799Qc();
        AnonymousClass9RD r1 = new AnonymousClass9RD(r4);
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = ((AnonymousClass9ZJ) r6).A00;
        this.A04 = r2;
        this.A05 = r1;
        this.A02 = r5;
    }

    public void Awk(C202029lG r4, int i) {
        ConcurrentHashMap concurrentHashMap;
        Map map = this.A06;
        synchronized (map) {
            Integer valueOf = Integer.valueOf(i);
            concurrentHashMap = (ConcurrentHashMap) map.get(valueOf);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
                map.put(valueOf, concurrentHashMap);
            }
        }
        concurrentHashMap.put(r4, r4);
    }
}
