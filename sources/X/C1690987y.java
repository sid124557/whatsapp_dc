package X;

import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory;

/* renamed from: X.87y  reason: invalid class name and case insensitive filesystem */
public final class C1690987y implements C178138h2 {
    public final SparseArray A00;
    public final C180778lc A01;
    public final int[] A02;

    public C1690987y(C180658lQ r8, C180778lc r9) {
        this.A01 = r9;
        Class<C180778lc> cls = C180778lc.class;
        Class<C178138h2> cls2 = C178138h2.class;
        SparseArray A0I = AnonymousClass6CA.A0I();
        int i = 0;
        try {
            A0I.put(0, (C178138h2) AnonymousClass6C9.A0b(DashMediaSource$Factory.class.asSubclass(cls2), r9, new Class[]{cls}));
        } catch (Exception unused) {
        }
        try {
            A0I.put(1, (C178138h2) AnonymousClass6C9.A0b(SsMediaSource$Factory.class.asSubclass(cls2), r9, new Class[]{cls}));
        } catch (Exception unused2) {
        }
        try {
            A0I.put(2, (C178138h2) AnonymousClass6C9.A0b(HlsMediaSource$Factory.class.asSubclass(cls2), r9, new Class[]{cls}));
        } catch (Exception unused3) {
        }
        A0I.put(3, new C1690887x(r8, r9));
        this.A00 = A0I;
        this.A02 = new int[A0I.size()];
        while (true) {
            SparseArray sparseArray = this.A00;
            if (i < sparseArray.size()) {
                this.A02[i] = sparseArray.keyAt(i);
                i++;
            } else {
                return;
            }
        }
    }
}
