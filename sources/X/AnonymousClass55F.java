package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.55F  reason: invalid class name */
public class AnonymousClass55F extends AnonymousClass5ZM {
    public int A00;
    public int A01;
    public final int A02;
    public final C69263Wi A03;
    public final C147357Du A04;
    public final C182468oS A05;
    public final AnonymousClass7U5 A06;
    public final List A07;
    public final boolean A08;

    public AnonymousClass55F(C15910sA r2, C69263Wi r3, C147357Du r4, C182468oS r5, AnonymousClass7U5 r6, List list, int i, boolean z) {
        super(r2, true);
        this.A04 = r4;
        this.A03 = r3;
        this.A08 = z;
        this.A07 = list;
        this.A05 = r5;
        this.A06 = r6;
        this.A02 = i;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C186058ug B9S;
        C186308v5 B0p = this.A05.B0p(!this.A08);
        this.A01 = B0p.getCount();
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList A0s = AnonymousClass001.A0s();
        C118305tK r5 = null;
        int i = 0;
        while (i < this.A01 && !C18320x8.A1T(this) && (B9S = B0p.B9S(i)) != null) {
            if (i == this.A02 - 1 && r5 != null) {
                ArrayList A0J = AnonymousClass002.A0J(A0s);
                C179328iy A002 = r5.A00();
                ((C118305tK) A002).count = this.A01;
                A0J.add(A002);
                uptimeMillis = SystemClock.uptimeMillis();
                C117665sI.A00(this.A03, this, A0J, 29, true);
            }
            C118305tK A003 = this.A06.A00(B9S.B6l());
            if (r5 != null) {
                if (!r5.equals(A003)) {
                    A0s.add(r5);
                }
                r5.count++;
                if (!A0s.isEmpty() && 1000 + uptimeMillis < SystemClock.uptimeMillis()) {
                    uptimeMillis = SystemClock.uptimeMillis();
                    ArrayList A0J2 = AnonymousClass002.A0J(A0s);
                    A0s.clear();
                    C117665sI.A00(this.A03, this, A0J2, 29, false);
                }
                i++;
            }
            A003.count = 0;
            r5 = A003;
            r5.count++;
            uptimeMillis = SystemClock.uptimeMillis();
            ArrayList A0J22 = AnonymousClass002.A0J(A0s);
            A0s.clear();
            C117665sI.A00(this.A03, this, A0J22, 29, false);
            i++;
        }
        if (r5 != null && !C18320x8.A1T(this)) {
            A0s.add(r5);
        }
        if (!A0s.isEmpty()) {
            C117665sI.A00(this.A03, this, A0s, 29, false);
        }
        this.A01 = B0p.getCount();
        B0p.close();
        Log.d("LoadSectionsTask/all buckets assigned");
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Log.d("LoadSectionsTask/load sections task finished");
        this.A04.A00.A1U(false);
    }
}
