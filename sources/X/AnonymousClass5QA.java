package X;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* renamed from: X.5QA  reason: invalid class name */
public final class AnonymousClass5QA {
    public C04840Qw A00;
    public HashMap A01 = AnonymousClass001.A0t();
    public TreeSet A02 = new TreeSet();
    public final Bitmap.Config A03 = Bitmap.Config.ARGB_8888;

    public final void A01(int i, int i2, String str) {
        C162457s7.A0J(str, 2);
        synchronized (this.A00) {
            int A012 = C107245ax.A01(this.A03, i, i2);
            HashMap hashMap = this.A01;
            Integer valueOf = Integer.valueOf(A012);
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(valueOf);
            if (linkedHashSet != null) {
                linkedHashSet.remove(str);
                if (linkedHashSet.isEmpty()) {
                    this.A02.remove(valueOf);
                }
            }
        }
    }

    public final void A00(int i, int i2, String str) {
        synchronized (this.A00) {
            int A012 = C107245ax.A01(this.A03, i, i2);
            HashMap hashMap = this.A01;
            Integer valueOf = Integer.valueOf(A012);
            if (hashMap.get(valueOf) == null) {
                hashMap.put(valueOf, AnonymousClass0x9.A17());
            }
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(valueOf);
            if (linkedHashSet != null) {
                linkedHashSet.add(str);
            }
            C86614Ku.A1T(valueOf, this.A02);
        }
    }

    public AnonymousClass5QA(C04840Qw r2) {
        this.A00 = r2;
    }
}
