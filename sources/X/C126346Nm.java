package X;

import android.os.Handler;
import com.facebook.debug.tracer.Tracer;
import com.facebook.systrace.Systrace;
import java.io.File;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.6Nm  reason: invalid class name and case insensitive filesystem */
public class C126346Nm extends C1676481x implements C187478xH {
    public synchronized void AwN(C187468xG r3) {
        synchronized (this) {
            this.A0H.add(r3);
        }
    }

    public synchronized long BDo(String str) {
        long j;
        synchronized (this) {
            Long l = (Long) this.A0J.get(str);
            if (l == null) {
                j = -1;
            } else {
                j = l.longValue();
            }
        }
        return j;
    }

    public synchronized void BjP(C172488Li r12, String str) {
        HashMap hashMap = this.A0I;
        String str2 = r12.A07;
        TreeSet treeSet = (TreeSet) hashMap.get(str2);
        long j = this.A03;
        long j2 = r12.A04;
        this.A03 = j - j2;
        if (treeSet == null || !treeSet.remove(r12)) {
            this.A0F.BSI("removeSpan failed", str2, (int) r12.A05, (int) j2);
        }
        r12.A06.delete();
        if (treeSet != null && treeSet.isEmpty()) {
            hashMap.remove(str2);
            Set set = this.A0N;
            if (set != null) {
                set.remove(str2);
            }
        }
        A0A(r12, str);
    }

    public synchronized void Bnd(String str, long j) {
        synchronized (this) {
            this.A0J.put(str, Long.valueOf(j));
        }
    }

    public synchronized C172488Li Bpu(C140846uc r9, String str, long j) {
        C172488Li Bpt;
        synchronized (this) {
            Bpt = Bpt(r9, str, j, 0);
        }
        return Bpt;
    }

    public synchronized C172488Li Bpv(C140846uc r3, String str, long j) {
        C172488Li A02;
        synchronized (this) {
            A02 = A02(r3, C162087rC.A02(str, j));
        }
        return A02;
    }

    public void A0A(C172488Li r28, String str) {
        HashMap hashMap = this.A0K;
        C172488Li r5 = r28;
        String str2 = r5.A07;
        AbstractList abstractList = (AbstractList) hashMap.get(str2);
        if (abstractList != null) {
            int size = abstractList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C184778sV) abstractList.get(size)).Bbs(this, r5);
            }
        }
        C187468xG r0 = this.A0F;
        if (r0 != null) {
            r0.Bbs(this, r5);
        }
        Iterator it = this.A0H.iterator();
        while (it.hasNext()) {
            C187468xG r1 = (C187468xG) it.next();
            if (r1 instanceof C09870gt) {
                C09870gt r12 = (C09870gt) r1;
                Tracer.A01("CacheInstrumentationListener.onSpanRemoved");
                try {
                    AnonymousClass0MX r6 = r12.A01;
                    if (r6 != null) {
                        r6.A04.add(new AnonymousClass8LJ(C142146wi.SPAN_REMOVED, r12.A02, (String) null, (String) null, str2, (String) null, str, "unknown", "unknown", r5.A05, r5.A04, 0, 0, false));
                    }
                } finally {
                    Systrace.A00();
                }
            } else {
                r1.Bbs(this, r5);
            }
        }
    }

    public byte[] BiN(C172488Li r2) {
        return null;
    }

    public void AzB(C172488Li r1, byte[] bArr) {
    }

    public C126346Nm(Handler handler, C187468xG r2, File file, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(handler, r2, file, i, j, j2, z, z2, z3, z4, z5, z6, z7, z8);
    }
}
