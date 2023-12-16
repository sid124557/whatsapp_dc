package X;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0hP  reason: invalid class name and case insensitive filesystem */
public class C10110hP implements C181448mm {
    public RootHostView A00 = null;
    public C159037kz A01 = null;
    public final Context A02;
    public final SparseArray A03;
    public final AnonymousClass020 A04 = new AnonymousClass020(Looper.getMainLooper(), new AnonymousClass0ZF(this));
    public final AnonymousClass7RT A05;
    public final C47382dA A06;
    public final Map A07;
    public final Map A08;
    public final Set A09 = AnonymousClass002.A0K();
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final AtomicReference A0B = new AtomicReference();
    public volatile boolean A0C = false;

    public static /* synthetic */ void A03(C10110hP r1, int i) {
        if (i != -1) {
            r1.A09(i);
        }
    }

    public Pair A05(Context context) {
        boolean z;
        RootHostView rootHostView = new RootHostView(context);
        this.A00 = rootHostView;
        C159037kz r1 = this.A01;
        if (r1 != null) {
            z = true;
            r1.A07(rootHostView);
        } else {
            z = false;
            A08();
        }
        return Pair.create(this.A00, Boolean.valueOf(z));
    }

    public final C159037kz A06(C131186dB r6, Runnable runnable) {
        AnonymousClass8DC r4 = AnonymousClass8DC.A00;
        r4.A01("BloksSurface_create_bloks_hosting_component");
        try {
            Map map = this.A08;
            map.putAll(r6.A03());
            C54852pO A002 = C159037kz.A00(this.A02, r6.A01(), this.A06);
            A002.A02(map);
            A002.A03(this.A07);
            SparseArray clone = this.A03.clone();
            clone.put(R.id.bloks_surface_on_data_rendered_runnable, runnable);
            A002.A01(clone);
            return A002.A00();
        } finally {
            r4.A00();
        }
    }

    public void A07() {
        C159037kz r0 = this.A01;
        if (r0 != null) {
            r0.A03();
        }
        this.A01 = null;
        this.A0B.set((Object) null);
    }

    public void A08() {
        if (this.A0A.compareAndSet(false, true)) {
            AnonymousClass7RT r2 = this.A05;
            if (r2 == null) {
                A09(0);
                return;
            }
            A09(1);
            A0D((C131186dB) r2, 2, 3);
        }
    }

    public final void A09(int i) {
        C16300sn r3 = (C16300sn) this.A0B.get();
        if (r3 != null) {
            AnonymousClass8DC r2 = AnonymousClass8DC.A00;
            r2.A01(AnonymousClass000.A0Y("BloksSurface_notify_on_render_surface_", AnonymousClass001.A0o(), i));
            try {
                r3.BZr(i);
            } finally {
                r2.A00();
            }
        }
    }

    public final void A0A(AnonymousClass0C0 r11) {
        C159037kz r2 = this.A01;
        if (r2 != null) {
            Map map = this.A08;
            map.putAll(r11.A01);
            HashMap hashMap = new HashMap(map);
            Set set = this.A09;
            HashSet hashSet = new HashSet(set);
            try {
                C153427bI A022 = r2.A02();
                List<C150917Ss> list = r11.A00;
                for (C150917Ss r3 : list) {
                    if (!hashSet.contains(r3)) {
                        Map A042 = AnonymousClass7r0.A04(r3.A00(), hashMap);
                        C152057Xj r1 = new C152057Xj();
                        r1.A05(A022, 0);
                        A04(r3, A022, r1.A03(), A042);
                        hashSet.add(r3);
                    }
                }
                set.addAll(list);
                A09(13);
            } catch (Throwable th) {
                set.addAll(r11.A00);
                A09(13);
                throw th;
            }
        }
    }

    public final void A0B(AnonymousClass0C1 r3) {
        try {
            C159037kz r0 = this.A01;
            if (r0 != null) {
                r0.A04();
            }
            RootHostView rootHostView = this.A00;
            if (rootHostView == null) {
                A09(8);
            } else {
                r3.A00().A07(rootHostView);
            }
        } finally {
            this.A01 = r3.A00();
            A09(r3.A00);
        }
    }

    public void A0C(C16300sn r2) {
        this.A0B.set(r2);
    }

    public final void A0D(C131186dB r4, int i, int i2) {
        A09(10);
        AnonymousClass0C1 r2 = new AnonymousClass0C1(A06(r4, new C12150l5(this, i2)), i);
        AnonymousClass020 r1 = this.A04;
        r1.A00(r1.obtainMessage(1, r2));
    }

    public C10110hP(Context context, SparseArray sparseArray, AnonymousClass7r0 r7, C47382dA r8, Map map, Map map2) {
        C131186dB r2 = null;
        this.A06 = r8;
        this.A02 = context;
        this.A03 = sparseArray;
        this.A05 = r7 != null ? new C131186dB(r7, C160367nW.A02) : r2;
        this.A08 = map;
        this.A07 = map2;
    }

    public static void A04(C150917Ss r0, C153427bI r1, C157967jD r2, Map map) {
        C157157hp.A00(C159377lj.A00(r0, r1, map), r2, r0.A01);
    }

    public void Ba8(AnonymousClass7RT r7) {
        C160367nW A002 = r7.A00();
        int i = A002.A00;
        int i2 = 4;
        if (i != 4) {
            boolean z = false;
            if (i == 3) {
                z = true;
                i2 = 5;
            }
            A09(i2);
            if (!z) {
                A09(6);
                int i3 = -1;
                if (A002.A00()) {
                    i3 = 9;
                }
                if (r7 instanceof C131186dB) {
                    C131186dB r72 = (C131186dB) r7;
                    if (this.A0C) {
                        List A022 = r72.A02();
                        Map A032 = r72.A03();
                        if (!A022.isEmpty()) {
                            A09(12);
                            AnonymousClass020 r2 = this.A04;
                            r2.A00(r2.obtainMessage(2, new AnonymousClass0C0(A022, A032)));
                            return;
                        }
                        return;
                    }
                    A0D(r72, 7, i3);
                    List A023 = r72.A02();
                    Map A033 = r72.A03();
                    if (!A023.isEmpty()) {
                        A09(12);
                        AnonymousClass020 r22 = this.A04;
                        r22.A00(r22.obtainMessage(2, new AnonymousClass0C0(A023, A033)));
                    }
                    this.A0C = true;
                }
            }
        }
    }
}
