package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager$6;
import com.whatsapp.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0df  reason: invalid class name and case insensitive filesystem */
public abstract class C08270df implements C15080qk {
    public int A00 = -1;
    public AnonymousClass0Ts A01;
    public AnonymousClass0O1 A02;
    public AnonymousClass0O1 A03;
    public AnonymousClass0O1 A04;
    public C08310eF A05;
    public C08310eF A06;
    public AnonymousClass07u A07;
    public AnonymousClass0O3 A08;
    public C05930Vn A09 = new C05930Vn(this);
    public AnonymousClass08T A0A;
    public C15090ql A0B = new C08280dg(this);
    public Runnable A0C = new C10980iu(this);
    public ArrayDeque A0D = new ArrayDeque();
    public ArrayList A0E;
    public ArrayList A0F;
    public ArrayList A0G;
    public ArrayList A0H;
    public ArrayList A0I;
    public ArrayList A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final AnonymousClass0N7 A0Q = new C003303r(this);
    public final C15790rw A0R = new C17950wV(this, 3);
    public final C15790rw A0S = new C17950wV(this, 5);
    public final C15790rw A0T = new C17950wV(this, 6);
    public final C15790rw A0U = new C17950wV(this, 4);
    public final C14960qY A0V = new C08110dL(this);
    public final C06910a1 A0W = new C06910a1(this);
    public final AnonymousClass0R3 A0X = new AnonymousClass0R3(this);
    public final C04760Qo A0Y = new C04760Qo();
    public final ArrayList A0Z = AnonymousClass001.A0s();
    public final Map A0a = Collections.synchronizedMap(AnonymousClass001.A0t());
    public final Map A0b = Collections.synchronizedMap(AnonymousClass001.A0t());
    public final Map A0c = Collections.synchronizedMap(AnonymousClass001.A0t());
    public final CopyOnWriteArrayList A0d = new CopyOnWriteArrayList();
    public final AtomicInteger A0e = new AtomicInteger();

    public static boolean A04() {
        return A05(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r0 != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I() {
        /*
            r6 = this;
            r0 = 1
            r6.A0K = r0
            r6.A0r(r0)
            java.util.Set r0 = r6.A0H()
            java.util.Iterator r1 = r0.iterator()
        L_0x000e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r1.next()
            X.0UN r0 = (X.AnonymousClass0UN) r0
            r0.A03()
            goto L_0x000e
        L_0x001e:
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C15940sD
            if (r0 == 0) goto L_0x006c
            X.0Qo r0 = r6.A0Y
            X.08T r0 = r0.A00
            boolean r0 = r0.A00
        L_0x002a:
            if (r0 == 0) goto L_0x007b
        L_0x002c:
            java.util.Map r0 = r6.A0a
            java.util.Iterator r5 = X.AnonymousClass001.A0v(r0)
        L_0x0032:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r5.next()
            X.0ZP r0 = (X.AnonymousClass0ZP) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x0044:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.String r3 = X.AnonymousClass001.A0m(r4)
            X.0Qo r0 = r6.A0Y
            X.08T r2 = r0.A00
            r0 = 3
            boolean r0 = A05(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Clearing non-config state for saved state of Fragment "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r1)
        L_0x0068:
            r2.A0E(r3)
            goto L_0x0044
        L_0x006c:
            android.content.Context r1 = r1.A01
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x002c
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChangingConfigurations()
            r0 = r0 ^ 1
            goto L_0x002a
        L_0x007b:
            r0 = -1
            r6.A0S(r0)
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C16580td
            if (r0 == 0) goto L_0x008a
            X.0rw r0 = r6.A0U
            r1.BjK(r0)
        L_0x008a:
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C16570tc
            if (r0 == 0) goto L_0x0095
            X.0rw r0 = r6.A0R
            r1.BjF(r0)
        L_0x0095:
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C16550ta
            if (r0 == 0) goto L_0x00a0
            X.0rw r0 = r6.A0S
            r1.BjG(r0)
        L_0x00a0:
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C16560tb
            if (r0 == 0) goto L_0x00ab
            X.0rw r0 = r6.A0T
            r1.BjH(r0)
        L_0x00ab:
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C16610tg
            if (r0 == 0) goto L_0x00ba
            X.0eF r0 = r6.A05
            if (r0 != 0) goto L_0x00ba
            X.0qY r0 = r6.A0V
            r1.BjE(r0)
        L_0x00ba:
            r2 = 0
            r6.A07 = r2
            r6.A08 = r2
            r6.A05 = r2
            X.0Ts r0 = r6.A01
            if (r0 == 0) goto L_0x00df
            X.0N7 r0 = r6.A0Q
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x00cd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r1.next()
            X.0rU r0 = (X.C15510rU) r0
            r0.cancel()
            goto L_0x00cd
        L_0x00dd:
            r6.A01 = r2
        L_0x00df:
            X.0O1 r0 = r6.A03
            if (r0 == 0) goto L_0x0108
            X.0vi r0 = (X.C17520vi) r0
            java.lang.Object r1 = r0.A00
            X.0US r1 = (X.AnonymousClass0US) r1
            java.lang.String r0 = r0.A02
            r1.A05(r0)
            X.0O1 r0 = r6.A04
            X.0vi r0 = (X.C17520vi) r0
            java.lang.Object r1 = r0.A00
            X.0US r1 = (X.AnonymousClass0US) r1
            java.lang.String r0 = r0.A02
            r1.A05(r0)
            X.0O1 r0 = r6.A02
            X.0vi r0 = (X.C17520vi) r0
            java.lang.Object r1 = r0.A00
            X.0US r1 = (X.AnonymousClass0US) r1
            java.lang.String r0 = r0.A02
            r1.A05(r0)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08270df.A0I():void");
    }

    public void A0K() {
        A0r(true);
        A0P();
    }

    public void A0M() {
        A0h(new C08230db(this, (String) null, -1, 0), false);
    }

    public void A0N() {
        A0z((String) null);
    }

    public final void A0O() {
        this.A0L = false;
        this.A0I.clear();
        this.A0J.clear();
    }

    /* JADX INFO: finally extract failed */
    public final void A0S(int i) {
        try {
            this.A0L = true;
            Iterator A012 = C04760Qo.A01(this.A0Y);
            while (A012.hasNext()) {
                AnonymousClass0WE r0 = (AnonymousClass0WE) A012.next();
                if (r0 != null) {
                    r0.A00 = i;
                }
            }
            A0T(i, false);
            for (AnonymousClass0UN A032 : A0H()) {
                A032.A03();
            }
            this.A0L = false;
            A0r(true);
        } catch (Throwable th) {
            this.A0L = false;
            throw th;
        }
    }

    public void A0X(C08310eF r5) {
        if (A05(2)) {
            AnonymousClass000.A18(r5, "attach: ", "FragmentManager", AnonymousClass001.A0o());
        }
        if (r5.A0Z) {
            r5.A0Z = false;
            if (!r5.A0W) {
                this.A0Y.A06(r5);
                if (A05(2)) {
                    AnonymousClass000.A18(r5, "add from attach: ", "FragmentManager", AnonymousClass001.A0o());
                }
                if (A06(r5)) {
                    this.A0N = true;
                }
            }
        }
    }

    public void A0Y(C08310eF r6) {
        if (A05(2)) {
            AnonymousClass000.A18(r6, "detach: ", "FragmentManager", AnonymousClass001.A0o());
        }
        if (!r6.A0Z) {
            r6.A0Z = true;
            if (r6.A0W) {
                if (A05(2)) {
                    AnonymousClass000.A18(r6, "remove from detach: ", "FragmentManager", AnonymousClass001.A0o());
                }
                ArrayList arrayList = this.A0Y.A01;
                synchronized (arrayList) {
                    arrayList.remove(r6);
                }
                r6.A0W = false;
                if (A06(r6)) {
                    this.A0N = true;
                }
                A0d(r6);
            }
        }
    }

    public void A0m(String str, int i) {
        A0h(new C08230db(this, str, -1, i), false);
    }

    public boolean A0y(C08310eF r4) {
        if (r4 != null) {
            C08270df r1 = r4.A0I;
            if (!r4.equals(r1.A06) || !A0y(r1.A05)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0z(String str) {
        A0r(false);
        A0s(true);
        C08310eF r0 = this.A06;
        String str2 = str;
        if (r0 != null && str == null && r0.A0T().A0z((String) null)) {
            return true;
        }
        ArrayList arrayList = this.A0J;
        ArrayList arrayList2 = this.A0I;
        boolean A10 = A10(str2, arrayList, arrayList2, -1, 0);
        if (A10) {
            this.A0L = true;
            try {
                A0p(arrayList, arrayList2);
            } finally {
                A0O();
            }
        }
        A0R();
        if (this.A0M) {
            this.A0M = false;
            A0Q();
        }
        A02(this);
        return A10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A10(java.lang.String r8, java.util.ArrayList r9, java.util.ArrayList r10, int r11, int r12) {
        /*
            r7 = this;
            r6 = 1
            r0 = r12 & 1
            r5 = 0
            boolean r2 = X.AnonymousClass000.A1S(r0)
            java.util.ArrayList r4 = r7.A0E
            if (r4 == 0) goto L_0x0083
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0083
            if (r8 != 0) goto L_0x0031
            if (r11 >= 0) goto L_0x0031
            if (r2 == 0) goto L_0x0079
            r3 = 0
        L_0x0019:
            java.util.ArrayList r2 = r7.A0E
            int r1 = r2.size()
            int r1 = r1 - r6
        L_0x0020:
            if (r1 < r3) goto L_0x0082
            java.lang.Object r0 = r2.remove(r1)
            r9.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.add(r0)
            int r1 = r1 + -1
            goto L_0x0020
        L_0x0031:
            int r3 = r4.size()
        L_0x0035:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0083
            java.lang.Object r1 = r4.get(r3)
            X.0dc r1 = (X.C08240dc) r1
            if (r8 == 0) goto L_0x0056
            java.lang.String r0 = r1.A0A
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0056
        L_0x0049:
            if (r2 != 0) goto L_0x005d
            int r0 = r4.size()
            int r0 = r0 + -1
            if (r3 == r0) goto L_0x0083
            int r3 = r3 + 1
            goto L_0x007f
        L_0x0056:
            if (r11 < 0) goto L_0x0035
            int r0 = r1.A04
            if (r11 != r0) goto L_0x0035
            goto L_0x0049
        L_0x005d:
            if (r3 <= 0) goto L_0x007f
            int r2 = r3 + -1
            java.lang.Object r1 = r4.get(r2)
            X.0dc r1 = (X.C08240dc) r1
            if (r8 == 0) goto L_0x0071
            java.lang.String r0 = r1.A0A
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0077
        L_0x0071:
            if (r11 < 0) goto L_0x0019
            int r0 = r1.A04
            if (r11 != r0) goto L_0x0019
        L_0x0077:
            r3 = r2
            goto L_0x005d
        L_0x0079:
            int r0 = r4.size()
            int r3 = r0 + -1
        L_0x007f:
            if (r3 >= 0) goto L_0x0019
            return r5
        L_0x0082:
            return r6
        L_0x0083:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08270df.A10(java.lang.String, java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    public static void A01(C08310eF r5, C06170Wn r6) {
        int i = r6.A01;
        int i2 = r6.A02;
        int i3 = r6.A03;
        int i4 = r6.A04;
        if (r5.A0D != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            r5.A0M().A01 = i;
            r5.A0M().A02 = i2;
            r5.A0M().A04 = i3;
            r5.A0M().A05 = i4;
        }
    }

    public static void A02(C08270df r1) {
        r1.A0Y.A02.values().removeAll(Collections.singleton((Object) null));
    }

    public static boolean A05(int i) {
        return AnonymousClass000.A1S(Log.isLoggable("FragmentManager", i) ? 1 : 0);
    }

    public static final boolean A06(C08310eF r2) {
        C08310eF r0;
        if (r2.A0b && r2.A0g) {
            return true;
        }
        C04760Qo r02 = r2.A0H.A0Y;
        ArrayList<C08310eF> A0s = AnonymousClass001.A0s();
        Iterator A012 = C04760Qo.A01(r02);
        while (A012.hasNext()) {
            AnonymousClass0WE r03 = (AnonymousClass0WE) A012.next();
            if (r03 != null) {
                r0 = r03.A02;
            } else {
                r0 = null;
            }
            A0s.add(r0);
        }
        for (C08310eF r04 : A0s) {
            if (r04 != null && A06(r04)) {
                return true;
            }
        }
        return false;
    }

    public int A07() {
        ArrayList arrayList = this.A0E;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final ViewGroup A09(C08310eF r4) {
        ViewGroup viewGroup = r4.A0C;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (r4.A01 > 0 && this.A08.A01()) {
            View A002 = this.A08.A00(r4.A01);
            if (A002 instanceof ViewGroup) {
                return (ViewGroup) A002;
            }
        }
        return null;
    }

    public AnonymousClass0ZZ A0A(C08310eF r5) {
        Bundle A012;
        C04760Qo r0 = this.A0Y;
        AnonymousClass0WE r3 = (AnonymousClass0WE) r0.A02.get(r5.A0V);
        if (r3 != null) {
            C08310eF r1 = r3.A02;
            if (r1.equals(r5)) {
                if (r1.A04 <= -1 || (A012 = r3.A01()) == null) {
                    return null;
                }
                return new AnonymousClass0ZZ(A012);
            }
        }
        A0k(AnonymousClass000.A0I(" is not currently in the FragmentManager", AnonymousClass000.A0j(r5)));
        throw AnonymousClass000.A0L();
    }

    public C08310eF A0B(int i) {
        C04760Qo r4 = this.A0Y;
        ArrayList arrayList = r4.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C08310eF r2 = (C08310eF) arrayList.get(size);
                if (r2 != null && r2.A03 == i) {
                    return r2;
                }
            } else {
                Iterator A012 = C04760Qo.A01(r4);
                while (A012.hasNext()) {
                    AnonymousClass0WE r0 = (AnonymousClass0WE) A012.next();
                    if (r0 != null) {
                        C08310eF r22 = r0.A02;
                        if (r22.A03 == i) {
                            return r22;
                        }
                    }
                }
                return null;
            }
        }
    }

    public C08310eF A0D(String str) {
        C04760Qo r4 = this.A0Y;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = r4.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C08310eF r2 = (C08310eF) arrayList.get(size);
                if (r2 != null && str.equals(r2.A0T)) {
                    return r2;
                }
            } else {
                Iterator A012 = C04760Qo.A01(r4);
                while (A012.hasNext()) {
                    AnonymousClass0WE r0 = (AnonymousClass0WE) A012.next();
                    if (r0 != null) {
                        C08310eF r22 = r0.A02;
                        if (str.equals(r22.A0T)) {
                            return r22;
                        }
                    }
                }
                return null;
            }
        }
    }

    public C05930Vn A0E() {
        C08310eF r0 = this.A05;
        if (r0 != null) {
            return r0.A0I.A0E();
        }
        return this.A09;
    }

    public AnonymousClass0WE A0F(C08310eF r4) {
        String str = r4.A0S;
        if (str != null) {
            AnonymousClass0Y2.A02(r4, str);
        }
        if (A04()) {
            AnonymousClass000.A1K(AnonymousClass001.A0o(), "add: ", r4);
        }
        AnonymousClass0WE A0G2 = A0G(r4);
        r4.A0I = this;
        C04760Qo r1 = this.A0Y;
        r1.A07(A0G2);
        if (!r4.A0Z) {
            r1.A06(r4);
            r4.A0i = false;
            if (r4.A0B == null) {
                r4.A0d = false;
            }
            if (A06(r4)) {
                this.A0N = true;
            }
        }
        return A0G2;
    }

    public AnonymousClass0WE A0G(C08310eF r4) {
        C04760Qo r2 = this.A0Y;
        AnonymousClass0WE r1 = (AnonymousClass0WE) r2.A02.get(r4.A0V);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass0WE r12 = new AnonymousClass0WE(r4, this.A0X, r2);
        r12.A06(this.A07.A01.getClassLoader());
        r12.A00 = this.A00;
        return r12;
    }

    public void A0J() {
        C08310eF r0;
        C04760Qo r02 = this.A0Y;
        ArrayList<C08310eF> A0s = AnonymousClass001.A0s();
        Iterator A012 = C04760Qo.A01(r02);
        while (A012.hasNext()) {
            AnonymousClass0WE r03 = (AnonymousClass0WE) A012.next();
            if (r03 != null) {
                r0 = r03.A02;
            } else {
                r0 = null;
            }
            A0s.add(r0);
        }
        for (C08310eF r1 : A0s) {
            if (r1 != null) {
                r1.A12(r1.A17());
                r1.A0H.A0J();
            }
        }
    }

    public void A0L() {
        if (this.A07 != null) {
            AnonymousClass08T.A00(this);
            Iterator A002 = C04760Qo.A00(this);
            while (A002.hasNext()) {
                C08310eF r0 = (C08310eF) A002.next();
                if (r0 != null) {
                    r0.A0H.A0L();
                }
            }
        }
    }

    public final void A0Q() {
        for (AnonymousClass0WE r2 : this.A0Y.A04()) {
            C08310eF r1 = r2.A02;
            if (r1.A0Y) {
                if (this.A0L) {
                    this.A0M = true;
                } else {
                    r1.A0Y = false;
                    r2.A04();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (A07() <= 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (A0y(r3.A05) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r1.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r1 = r3.A0Q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R() {
        /*
            r3 = this;
            java.util.ArrayList r1 = r3.A0Z
            monitor-enter(r1)
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0026 }
            r2 = 1
            if (r0 != 0) goto L_0x0010
            X.0N7 r0 = r3.A0Q     // Catch:{ all -> 0x0026 }
            r0.A01 = r2     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            return
        L_0x0010:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            X.0N7 r1 = r3.A0Q
            int r0 = r3.A07()
            if (r0 <= 0) goto L_0x0024
            X.0eF r0 = r3.A05
            boolean r0 = r3.A0y(r0)
            if (r0 == 0) goto L_0x0024
        L_0x0021:
            r1.A01 = r2
            return
        L_0x0024:
            r2 = 0
            goto L_0x0021
        L_0x0026:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08270df.A0R():void");
    }

    public void A0T(int i, boolean z) {
        AnonymousClass07u r2;
        if (this.A07 == null && i != -1) {
            throw AnonymousClass001.A0e("No activity");
        } else if (z || i != this.A00) {
            this.A00 = i;
            C04760Qo r4 = this.A0Y;
            Iterator it = r4.A01.iterator();
            while (it.hasNext()) {
                AnonymousClass0WE r0 = (AnonymousClass0WE) r4.A02.get(((C08310eF) it.next()).A0V);
                if (r0 != null) {
                    r0.A04();
                }
            }
            Iterator A012 = C04760Qo.A01(r4);
            while (A012.hasNext()) {
                AnonymousClass0WE r22 = (AnonymousClass0WE) A012.next();
                if (r22 != null) {
                    r22.A04();
                    C08310eF r1 = r22.A02;
                    if (r1.A0i && r1.A00 <= 0) {
                        r4.A08(r22);
                    }
                }
            }
            A0Q();
            if (this.A0N && (r2 = this.A07) != null && this.A00 == 7) {
                r2.A04.invalidateOptionsMenu();
                this.A0N = false;
            }
        }
    }

    public void A0U(Bundle bundle, C08310eF r4, String str) {
        if (r4.A0I != this) {
            A0k(AnonymousClass000.A0I(" is not currently in the FragmentManager", AnonymousClass000.A0j(r4)));
            throw AnonymousClass000.A0L();
        } else {
            bundle.putString(str, r4.A0V);
        }
    }

    public void A0V(Parcelable parcelable) {
        AnonymousClass0WE r18;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        Iterator<String> it = bundle3.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String A0m = AnonymousClass001.A0m(it);
            if (A0m.startsWith("result_") && (bundle2 = bundle3.getBundle(A0m)) != null) {
                bundle2.setClassLoader(this.A07.A01.getClassLoader());
                this.A0c.put(A0m.substring(7), bundle2);
            }
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator<String> it2 = bundle3.keySet().iterator();
        while (it2.hasNext()) {
            String A0m2 = AnonymousClass001.A0m(it2);
            if (A0m2.startsWith("fragment_") && (bundle = bundle3.getBundle(A0m2)) != null) {
                bundle.setClassLoader(this.A07.A01.getClassLoader());
                A0s.add(bundle.getParcelable("state"));
            }
        }
        C04760Qo r2 = this.A0Y;
        HashMap hashMap = r2.A03;
        hashMap.clear();
        Iterator it3 = A0s.iterator();
        while (it3.hasNext()) {
            C06820Zi r1 = (C06820Zi) it3.next();
            hashMap.put(r1.A07, r1);
        }
        C06770Zd r5 = (C06770Zd) bundle3.getParcelable("state");
        if (r5 != null) {
            HashMap hashMap2 = r2.A02;
            hashMap2.clear();
            Iterator it4 = r5.A02.iterator();
            while (it4.hasNext()) {
                C06820Zi r10 = (C06820Zi) hashMap.remove(it4.next());
                if (r10 != null) {
                    AnonymousClass08T r0 = this.A0A;
                    C08310eF r11 = (C08310eF) r0.A03.get(r10.A07);
                    if (r11 != null) {
                        if (A05(2)) {
                            AnonymousClass000.A18(r11, "restoreSaveState: re-attaching retained ", "FragmentManager", AnonymousClass001.A0o());
                        }
                        r18 = new AnonymousClass0WE(r11, this.A0X, r10, r2);
                    } else {
                        AnonymousClass0R3 r12 = this.A0X;
                        AnonymousClass0R3 r19 = r12;
                        r18 = new AnonymousClass0WE(r19, A0E(), r10, r2, this.A07.A01.getClassLoader());
                    }
                    C08310eF r102 = r18.A02;
                    r102.A0I = this;
                    if (A05(2)) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("restoreSaveState: active (");
                        A0o.append(r102.A0V);
                        AnonymousClass000.A18(r102, "): ", "FragmentManager", A0o);
                    }
                    r18.A06(this.A07.A01.getClassLoader());
                    r2.A07(r18);
                    r18.A00 = this.A00;
                }
            }
            Iterator it5 = AnonymousClass002.A0J(this.A0A.A03.values()).iterator();
            while (it5.hasNext()) {
                C08310eF r8 = (C08310eF) it5.next();
                if (hashMap2.get(r8.A0V) == null) {
                    if (A05(2)) {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("Discarding retained Fragment ");
                        A0o2.append(r8);
                        A0o2.append(" that was not found in the set of active Fragments ");
                        Log.v("FragmentManager", AnonymousClass000.A0R(r5.A02, A0o2));
                    }
                    this.A0A.A0D(r8);
                    r8.A0I = this;
                    AnonymousClass0WE r13 = new AnonymousClass0WE(r8, this.A0X, r2);
                    r13.A00 = 1;
                    r13.A04();
                    r8.A0i = true;
                    r13.A04();
                }
            }
            ArrayList arrayList = r5.A03;
            r2.A01.clear();
            if (arrayList != null) {
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    String A0m3 = AnonymousClass001.A0m(it6);
                    C08310eF A022 = r2.A02(A0m3);
                    if (A022 != null) {
                        if (A05(2)) {
                            StringBuilder A0o3 = AnonymousClass001.A0o();
                            A0o3.append("restoreSaveState: added (");
                            A0o3.append(A0m3);
                            AnonymousClass000.A18(A022, "): ", "FragmentManager", A0o3);
                        }
                        r2.A06(A022);
                    } else {
                        StringBuilder A0o4 = AnonymousClass001.A0o();
                        A0o4.append("No instantiated fragment for (");
                        A0o4.append(A0m3);
                        throw AnonymousClass000.A0I(")", A0o4);
                    }
                }
            }
            C06780Ze[] r02 = r5.A07;
            if (r02 != null) {
                this.A0E = AnonymousClass002.A0I(r02.length);
                int i = 0;
                while (true) {
                    C06780Ze[] r14 = r5.A07;
                    if (i >= r14.length) {
                        break;
                    }
                    C06780Ze r122 = r14[i];
                    C08240dc r82 = new C08240dc(this);
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        int[] iArr = r122.A0D;
                        boolean z = true;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        C06170Wn r132 = new C06170Wn();
                        int i4 = i2 + 1;
                        r132.A00 = iArr[i2];
                        if (A05(2)) {
                            StringBuilder A0o5 = AnonymousClass001.A0o();
                            A0o5.append("Instantiate ");
                            A0o5.append(r82);
                            A0o5.append(" op #");
                            A0o5.append(i3);
                            A0o5.append(" base fragment #");
                            Log.v("FragmentManager", AnonymousClass000.A0h(A0o5, iArr[i4]));
                        }
                        r132.A07 = AnonymousClass0GC.values()[r122.A0C[i3]];
                        r132.A06 = AnonymousClass0GC.values()[r122.A0B[i3]];
                        int i5 = i4 + 1;
                        if (iArr[i4] == 0) {
                            z = false;
                        }
                        r132.A08 = z;
                        int i6 = i5 + 1;
                        int i7 = iArr[i5];
                        r132.A01 = i7;
                        int i8 = i6 + 1;
                        int i9 = iArr[i6];
                        r132.A02 = i9;
                        int i10 = i8 + 1;
                        int i11 = iArr[i8];
                        r132.A03 = i11;
                        i2 = i10 + 1;
                        int i12 = iArr[i10];
                        r132.A04 = i12;
                        r82.A02 = i7;
                        r82.A03 = i9;
                        r82.A05 = i11;
                        r82.A06 = i12;
                        r82.A0G(r132);
                        i3++;
                    }
                    r82.A07 = r122.A03;
                    r82.A0A = r122.A06;
                    r82.A0E = true;
                    r82.A01 = r122.A01;
                    r82.A09 = r122.A05;
                    r82.A00 = r122.A00;
                    r82.A08 = r122.A04;
                    r82.A0C = r122.A08;
                    r82.A0D = r122.A09;
                    r82.A0H = r122.A0A;
                    r82.A04 = r122.A02;
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = r122.A07;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        String str = (String) arrayList2.get(i13);
                        if (str != null) {
                            ((C06170Wn) r82.A0B.get(i13)).A05 = r2.A02(str);
                        }
                        i13++;
                    }
                    r82.A05(1);
                    if (A05(2)) {
                        StringBuilder A0o6 = AnonymousClass001.A0o();
                        A0o6.append("restoreAllState: back stack #");
                        A0o6.append(i);
                        A0o6.append(" (index ");
                        A0o6.append(r82.A04);
                        AnonymousClass000.A18(r82, "): ", "FragmentManager", A0o6);
                        PrintWriter printWriter = new PrintWriter(new AnonymousClass0FF());
                        r82.A0H(printWriter, "  ", false);
                        printWriter.close();
                    }
                    this.A0E.add(r82);
                    i++;
                }
            } else {
                this.A0E = null;
            }
            this.A0e.set(r5.A00);
            String str2 = r5.A01;
            if (str2 != null) {
                C08310eF A023 = r2.A02(str2);
                this.A06 = A023;
                A0c(A023);
            }
            ArrayList arrayList3 = r5.A04;
            if (arrayList3 != null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    this.A0a.put(arrayList3.get(i14), r5.A05.get(i14));
                }
            }
            this.A0D = new ArrayDeque(r5.A06);
        }
    }

    public void A0W(Menu menu) {
        if (this.A00 >= 1) {
            Iterator A002 = C04760Qo.A00(this);
            while (A002.hasNext()) {
                C08310eF r1 = (C08310eF) A002.next();
                if (r1 != null && !r1.A0c) {
                    r1.A0H.A0W(menu);
                }
            }
        }
    }

    public void A0b(C08310eF r3) {
        if (r3 != null) {
            if (!r3.equals(this.A0Y.A02(r3.A0V)) || !(r3.A0G == null || r3.A0I == this)) {
                throw AnonymousClass000.A0E(this, " is not an active fragment of FragmentManager ", AnonymousClass000.A0j(r3));
            }
        }
        C08310eF r0 = this.A06;
        this.A06 = r3;
        A0c(r0);
        A0c(this.A06);
    }

    public final void A0c(C08310eF r3) {
        if (r3 != null) {
            if (r3.equals(this.A0Y.A02(r3.A0V))) {
                boolean A0y = r3.A0I.A0y(r3);
                Boolean bool = r3.A0P;
                if (bool == null || bool.booleanValue() != A0y) {
                    r3.A0P = Boolean.valueOf(A0y);
                    C08270df r1 = r3.A0H;
                    r1.A0R();
                    r1.A0c(r1.A06);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.0vI, X.07u, X.0sD] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0e(X.C08310eF r7, X.AnonymousClass07u r8, X.AnonymousClass0O3 r9) {
        /*
            r6 = this;
            X.07u r0 = r6.A07
            if (r0 != 0) goto L_0x0156
            r6.A07 = r8
            r6.A08 = r9
            r6.A05 = r7
            if (r7 == 0) goto L_0x014f
            X.0dd r1 = new X.0dd
            r1.<init>(r7, r6)
        L_0x0011:
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A0d
            r0.add(r1)
        L_0x0016:
            X.0eF r0 = r6.A05
            if (r0 == 0) goto L_0x001d
            r6.A0R()
        L_0x001d:
            boolean r0 = r8 instanceof X.C17300vI
            if (r0 == 0) goto L_0x0030
            r2 = r8
            X.0Ts r1 = r8.BA8()
            r6.A01 = r1
            if (r7 == 0) goto L_0x002b
            r2 = r7
        L_0x002b:
            X.0N7 r0 = r6.A0Q
            r1.A01(r0, r2)
        L_0x0030:
            if (r7 == 0) goto L_0x012e
            X.0df r0 = r7.A0I
            X.08T r3 = r0.A0A
            java.util.HashMap r2 = r3.A02
            java.lang.String r0 = r7.A0V
            java.lang.Object r1 = r2.get(r0)
            X.08T r1 = (X.AnonymousClass08T) r1
            if (r1 != 0) goto L_0x004e
            boolean r0 = r3.A05
            X.08T r1 = new X.08T
            r1.<init>(r0)
            java.lang.String r0 = r7.A0V
            r2.put(r0, r1)
        L_0x004e:
            r6.A0A = r1
            boolean r0 = r6.A0t()
            r1.A01 = r0
            X.0Qo r0 = r6.A0Y
            r0.A00 = r1
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C17310vJ
            if (r0 == 0) goto L_0x007a
            if (r7 != 0) goto L_0x007a
            X.0UG r2 = r1.BCR()
            r0 = 3
            X.0Gj r1 = new X.0Gj
            r1.<init>(r6, r0)
            java.lang.String r0 = "android:support:fragments"
            r2.A04(r1, r0)
            android.os.Bundle r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x007a
            r6.A0V(r0)
        L_0x007a:
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C15550rY
            if (r0 == 0) goto L_0x00f0
            X.0US r4 = r1.B49()
            if (r7 == 0) goto L_0x012a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r7.A0V
            r1.append(r0)
            java.lang.String r0 = ":"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0095:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FragmentManager:"
            java.lang.String r5 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)
            X.03v r2 = new X.03v
            r2.<init>()
            r1 = 1
            X.0gY r0 = new X.0gY
            r0.<init>(r6, r1)
            X.0O1 r0 = r4.A01(r0, r2, r3)
            r6.A03 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)
            X.03u r2 = new X.03u
            r2.<init>()
            r1 = 2
            X.0gY r0 = new X.0gY
            r0.<init>(r6, r1)
            X.0O1 r0 = r4.A01(r0, r2, r3)
            r6.A04 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = "RequestPermissions"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)
            X.03x r2 = new X.03x
            r2.<init>()
            r1 = 0
            X.0gY r0 = new X.0gY
            r0.<init>(r6, r1)
            X.0O1 r0 = r4.A01(r0, r2, r3)
            r6.A02 = r0
        L_0x00f0:
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C16570tc
            if (r0 == 0) goto L_0x00fb
            X.0rw r0 = r6.A0R
            r1.Awa(r0)
        L_0x00fb:
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C16580td
            if (r0 == 0) goto L_0x0106
            X.0rw r0 = r6.A0U
            r1.Awg(r0)
        L_0x0106:
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C16550ta
            if (r0 == 0) goto L_0x0111
            X.0rw r0 = r6.A0S
            r1.Awc(r0)
        L_0x0111:
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C16560tb
            if (r0 == 0) goto L_0x011c
            X.0rw r0 = r6.A0T
            r1.Awd(r0)
        L_0x011c:
            X.07u r1 = r6.A07
            boolean r0 = r1 instanceof X.C16610tg
            if (r0 == 0) goto L_0x0129
            if (r7 != 0) goto L_0x0129
            X.0qY r0 = r6.A0V
            r1.AwY(r0)
        L_0x0129:
            return
        L_0x012a:
            java.lang.String r2 = ""
            goto L_0x0095
        L_0x012e:
            boolean r0 = r8 instanceof X.C15940sD
            if (r0 == 0) goto L_0x0147
            X.0N2 r2 = r8.BEL()
            X.0ui r0 = X.AnonymousClass08T.A06
            X.0XL r1 = new X.0XL
            r1.<init>((X.C17190ui) r0, (X.AnonymousClass0N2) r2)
            java.lang.Class<X.08T> r0 = X.AnonymousClass08T.class
            X.0Ty r1 = r1.A01(r0)
            X.08T r1 = (X.AnonymousClass08T) r1
            goto L_0x004e
        L_0x0147:
            r0 = 0
            X.08T r1 = new X.08T
            r1.<init>(r0)
            goto L_0x004e
        L_0x014f:
            boolean r0 = r8 instanceof X.C15890s8
            if (r0 == 0) goto L_0x0016
            r1 = r8
            goto L_0x0011
        L_0x0156:
            java.lang.String r0 = "Already attached"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08270df.A0e(X.0eF, X.07u, X.0O3):void");
    }

    public void A0f(C08310eF r3, AnonymousClass0GC r4) {
        if (!r3.equals(this.A0Y.A02(r3.A0V)) || !(r3.A0G == null || r3.A0I == this)) {
            throw AnonymousClass000.A0E(this, " is not an active fragment of FragmentManager ", AnonymousClass000.A0j(r3));
        }
        r3.A0K = r4;
    }

    public void A0h(C15880s7 r4, boolean z) {
        if (!z) {
            if (this.A07 == null) {
                if (this.A0K) {
                    throw AnonymousClass001.A0e("FragmentManager has been destroyed");
                }
                throw AnonymousClass001.A0e("FragmentManager has not been attached to a host.");
            } else if (A0t()) {
                throw AnonymousClass001.A0e("Can not perform this action after onSaveInstanceState");
            }
        }
        ArrayList arrayList = this.A0Z;
        synchronized (arrayList) {
            if (this.A07 != null) {
                arrayList.add(r4);
                try {
                    if (arrayList.size() == 1) {
                        Handler handler = this.A07.A02;
                        Runnable runnable = this.A0C;
                        handler.removeCallbacks(runnable);
                        this.A07.A02.post(runnable);
                        A0R();
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } else if (!z) {
                th = AnonymousClass001.A0e("Activity has been destroyed");
                throw th;
            }
        }
    }

    public void A0i(C15880s7 r3, boolean z) {
        if (!z || (this.A07 != null && !this.A0K)) {
            A0s(z);
            if (r3.B3h(this.A0J, this.A0I)) {
                this.A0L = true;
                try {
                    A0p(this.A0J, this.A0I);
                } finally {
                    A0O();
                }
            }
            A0R();
            if (this.A0M) {
                this.A0M = false;
                A0Q();
            }
            A02(this);
        }
    }

    public final void A0l(String str) {
        C08260de r0 = (C08260de) this.A0b.remove(str);
        if (r0 != null) {
            r0.A01.A01(r0.A02);
        }
        if (A04()) {
            Log.v("FragmentManager", AnonymousClass000.A0V("Clearing FragmentResultListener for key ", str, AnonymousClass001.A0o()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0n(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.util.Map r0 = r3.A0b
            java.lang.Object r2 = r0.get(r4)
            X.0de r2 = (X.C08260de) r2
            if (r2 == 0) goto L_0x0037
            X.0GC r1 = X.AnonymousClass0GC.STARTED
            X.0O9 r0 = r2.A01
            X.08A r0 = (X.AnonymousClass08A) r0
            X.0GC r0 = r0.A02
            int r0 = r0.compareTo(r1)
            boolean r0 = X.AnonymousClass001.A1U(r0)
            if (r0 == 0) goto L_0x0037
            r2.BTp(r4, r5)
        L_0x001f:
            boolean r0 = A04()
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Setting fragment result with key "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " and result "
            X.AnonymousClass000.A1K(r1, r0, r5)
        L_0x0036:
            return
        L_0x0037:
            java.util.Map r0 = r3.A0c
            r0.put(r4, r5)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08270df.A0n(java.lang.String, android.os.Bundle):void");
    }

    public final void A0q(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        C08270df r0;
        C08270df r02;
        ArrayList arrayList3 = arrayList;
        int i3 = i;
        boolean z = ((C08240dc) arrayList3.get(i3)).A0H;
        ArrayList arrayList4 = this.A0H;
        if (arrayList4 == null) {
            arrayList4 = AnonymousClass001.A0s();
            this.A0H = arrayList4;
        } else {
            arrayList4.clear();
        }
        C04760Qo r21 = this.A0Y;
        arrayList4.addAll(r21.A05());
        C08310eF r8 = this.A06;
        int i4 = i3;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList5 = arrayList2;
            int i5 = i2;
            if (i4 < i5) {
                C08240dc r9 = (C08240dc) arrayList3.get(i4);
                boolean A1Z = AnonymousClass001.A1Z(arrayList5.get(i4));
                ArrayList arrayList6 = this.A0H;
                if (!A1Z) {
                    int i6 = 0;
                    while (true) {
                        ArrayList arrayList7 = r9.A0B;
                        if (i6 < arrayList7.size()) {
                            C06170Wn r11 = (C06170Wn) arrayList7.get(i6);
                            int i7 = r11.A00;
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    C08310eF r6 = r11.A05;
                                    int i8 = r6.A01;
                                    boolean z3 = false;
                                    for (int size = arrayList6.size() - 1; size >= 0; size--) {
                                        C08310eF r5 = (C08310eF) arrayList6.get(size);
                                        if (r5.A01 == i8) {
                                            if (r5 == r6) {
                                                z3 = true;
                                            } else {
                                                if (r5 == r8) {
                                                    arrayList7.add(i6, new C06170Wn(r5, 9, true));
                                                    i6++;
                                                    r8 = null;
                                                }
                                                C06170Wn r15 = new C06170Wn(r5, 3, true);
                                                r15.A01 = r11.A01;
                                                r15.A03 = r11.A03;
                                                r15.A02 = r11.A02;
                                                r15.A04 = r11.A04;
                                                arrayList7.add(i6, r15);
                                                arrayList6.remove(r5);
                                                i6++;
                                            }
                                        }
                                    }
                                    if (z3) {
                                        arrayList7.remove(i6);
                                        i6--;
                                    } else {
                                        r11.A00 = 1;
                                        r11.A08 = true;
                                        arrayList6.add(r6);
                                    }
                                } else if (i7 == 3 || i7 == 6) {
                                    arrayList6.remove(r11.A05);
                                    C08310eF r62 = r11.A05;
                                    if (r62 == r8) {
                                        arrayList7.add(i6, new C06170Wn(r62, 9));
                                        i6++;
                                        r8 = null;
                                    }
                                } else if (i7 != 7) {
                                    if (i7 == 8) {
                                        arrayList7.add(i6, new C06170Wn(r8, 9, true));
                                        r11.A08 = true;
                                        i6++;
                                        r8 = r11.A05;
                                    }
                                }
                                i6++;
                            }
                            arrayList6.add(r11.A05);
                            i6++;
                        }
                    }
                } else {
                    ArrayList arrayList8 = r9.A0B;
                    for (int size2 = arrayList8.size() - 1; size2 >= 0; size2--) {
                        C06170Wn r63 = (C06170Wn) arrayList8.get(size2);
                        int i9 = r63.A00;
                        if (i9 != 1) {
                            if (i9 != 3) {
                                switch (i9) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        r8 = null;
                                        break;
                                    case 9:
                                        r8 = r63.A05;
                                        break;
                                    case 10:
                                        r63.A06 = r63.A07;
                                        break;
                                }
                            }
                            arrayList6.add(r63.A05);
                        }
                        arrayList6.remove(r63.A05);
                    }
                }
                if (!z2) {
                    z2 = false;
                    if (!r9.A0E) {
                        i4++;
                    }
                }
                z2 = true;
                i4++;
            } else {
                this.A0H.clear();
                if (!z && this.A00 >= 1) {
                    for (int i10 = i3; i10 < i5; i10++) {
                        Iterator it = ((C08240dc) arrayList3.get(i10)).A0B.iterator();
                        while (it.hasNext()) {
                            C08310eF r7 = ((C06170Wn) it.next()).A05;
                            if (!(r7 == null || r7.A0I == null)) {
                                r21.A07(A0G(r7));
                            }
                        }
                    }
                }
                for (int i11 = i3; i11 < i5; i11++) {
                    C08240dc r92 = (C08240dc) arrayList3.get(i11);
                    if (AnonymousClass001.A1Z(arrayList5.get(i11))) {
                        r92.A05(-1);
                        ArrayList arrayList9 = r92.A0B;
                        for (int size3 = arrayList9.size() - 1; size3 >= 0; size3--) {
                            C06170Wn r13 = (C06170Wn) arrayList9.get(size3);
                            C08310eF r72 = r13.A05;
                            if (r72 != null) {
                                if (r72.A0D != null) {
                                    r72.A0M().A0F = true;
                                }
                                int i12 = r92.A07;
                                int i13 = 8194;
                                if (i12 != 4097) {
                                    i13 = 4097;
                                    if (i12 != 8194) {
                                        i13 = 4100;
                                        if (i12 != 8197) {
                                            if (i12 != 4099) {
                                                i13 = 8197;
                                                if (i12 != 4100) {
                                                    i13 = 0;
                                                }
                                            } else {
                                                i13 = 4099;
                                            }
                                        }
                                    }
                                }
                                if (!(r72.A0D == null && i13 == 0)) {
                                    r72.A0M();
                                    r72.A0D.A03 = i13;
                                }
                                ArrayList arrayList10 = r92.A0D;
                                ArrayList arrayList11 = r92.A0C;
                                r72.A0M();
                                C04050Mp r03 = r72.A0D;
                                r03.A0C = arrayList10;
                                r03.A0D = arrayList11;
                            }
                            int i14 = r13.A00;
                            switch (i14) {
                                case 1:
                                    A01(r72, r13);
                                    C08270df r04 = r92.A0J;
                                    r04.A0g(r72, true);
                                    r04.A0a(r72);
                                    break;
                                case 3:
                                    A01(r72, r13);
                                    r92.A0J.A0F(r72);
                                    break;
                                case 4:
                                    A01(r72, r13);
                                    A00(r72);
                                    break;
                                case 5:
                                    A01(r72, r13);
                                    C08270df r05 = r92.A0J;
                                    r05.A0g(r72, true);
                                    r05.A0Z(r72);
                                    break;
                                case 6:
                                    A01(r72, r13);
                                    r92.A0J.A0X(r72);
                                    break;
                                case 7:
                                    A01(r72, r13);
                                    C08270df r06 = r92.A0J;
                                    r06.A0g(r72, true);
                                    r06.A0Y(r72);
                                    break;
                                case 8:
                                    r02 = r92.A0J;
                                    r72 = null;
                                    break;
                                case 9:
                                    r02 = r92.A0J;
                                    break;
                                case 10:
                                    r92.A0J.A0f(r72, r13.A07);
                                    break;
                                default:
                                    throw AnonymousClass000.A0G("Unknown cmd: ", AnonymousClass001.A0o(), i14);
                            }
                            r02.A0b(r72);
                        }
                        continue;
                    } else {
                        r92.A05(1);
                        ArrayList arrayList12 = r92.A0B;
                        int size4 = arrayList12.size();
                        for (int i15 = 0; i15 < size4; i15++) {
                            C06170Wn r14 = (C06170Wn) arrayList12.get(i15);
                            C08310eF r12 = r14.A05;
                            if (r12 != null) {
                                if (r12.A0D != null) {
                                    r12.A0M().A0F = false;
                                }
                                int i16 = r92.A07;
                                if (!(r12.A0D == null && i16 == 0)) {
                                    r12.A0M();
                                    r12.A0D.A03 = i16;
                                }
                                ArrayList arrayList13 = r92.A0C;
                                ArrayList arrayList14 = r92.A0D;
                                r12.A0M();
                                C04050Mp r07 = r12.A0D;
                                r07.A0C = arrayList13;
                                r07.A0D = arrayList14;
                            }
                            int i17 = r14.A00;
                            switch (i17) {
                                case 1:
                                    A01(r12, r14);
                                    C08270df r08 = r92.A0J;
                                    r08.A0g(r12, false);
                                    r08.A0F(r12);
                                    break;
                                case 3:
                                    A01(r12, r14);
                                    r92.A0J.A0a(r12);
                                    break;
                                case 4:
                                    A01(r12, r14);
                                    r92.A0J.A0Z(r12);
                                    break;
                                case 5:
                                    A01(r12, r14);
                                    r92.A0J.A0g(r12, false);
                                    A00(r12);
                                    break;
                                case 6:
                                    A01(r12, r14);
                                    r92.A0J.A0Y(r12);
                                    break;
                                case 7:
                                    A01(r12, r14);
                                    C08270df r09 = r92.A0J;
                                    r09.A0g(r12, false);
                                    r09.A0X(r12);
                                    break;
                                case 8:
                                    r0 = r92.A0J;
                                    break;
                                case 9:
                                    r0 = r92.A0J;
                                    r12 = null;
                                    break;
                                case 10:
                                    r92.A0J.A0f(r12, r14.A06);
                                    break;
                                default:
                                    throw AnonymousClass000.A0G("Unknown cmd: ", AnonymousClass001.A0o(), i17);
                            }
                            r0.A0b(r12);
                        }
                        continue;
                    }
                }
                boolean A1Z2 = AnonymousClass001.A1Z(arrayList5.get(i2 - 1));
                for (int i18 = i3; i18 < i5; i18++) {
                    C08240dc r10 = (C08240dc) arrayList3.get(i18);
                    ArrayList arrayList15 = r10.A0B;
                    if (A1Z2) {
                        for (int size5 = arrayList15.size() - 1; size5 >= 0; size5--) {
                            C08310eF r010 = ((C06170Wn) r10.A0B.get(size5)).A05;
                            if (r010 != null) {
                                A0G(r010).A04();
                            }
                        }
                    } else {
                        Iterator it2 = arrayList15.iterator();
                        while (it2.hasNext()) {
                            C08310eF r011 = ((C06170Wn) it2.next()).A05;
                            if (r011 != null) {
                                A0G(r011).A04();
                            }
                        }
                    }
                }
                A0T(this.A00, true);
                HashSet A0K2 = AnonymousClass002.A0K();
                for (int i19 = i3; i19 < i5; i19++) {
                    Iterator it3 = ((C08240dc) arrayList3.get(i19)).A0B.iterator();
                    while (it3.hasNext()) {
                        C08310eF r012 = ((C06170Wn) it3.next()).A05;
                        if (!(r012 == null || (viewGroup = r012.A0C) == null)) {
                            A0K2.add(AnonymousClass0UN.A01(viewGroup));
                        }
                    }
                }
                Iterator it4 = A0K2.iterator();
                while (it4.hasNext()) {
                    AnonymousClass0UN r013 = (AnonymousClass0UN) it4.next();
                    r013.A01 = A1Z2;
                    r013.A04();
                    r013.A02();
                }
                while (i3 < i5) {
                    C08240dc r1 = (C08240dc) arrayList3.get(i3);
                    if (AnonymousClass001.A1Z(arrayList5.get(i3)) && r1.A04 >= 0) {
                        r1.A04 = -1;
                    }
                    i3++;
                }
                if (z2 && this.A0F != null) {
                    int i20 = 0;
                    while (true) {
                        ArrayList arrayList16 = this.A0F;
                        if (i20 < arrayList16.size()) {
                            C009707r r3 = (C009707r) ((C15070qj) arrayList16.get(i20));
                            AnonymousClass0R8 supportActionBar = r3.getSupportActionBar();
                            if (supportActionBar != null) {
                                int A072 = AnonymousClass00M.A01(r3).A07();
                                int i21 = R.string.f11nameremoved;
                                if (A072 == 0) {
                                    i21 = R.string.f11nameremoved;
                                }
                                supportActionBar.A0J(r3.getString(i21));
                                supportActionBar.A0N(true);
                            }
                            i20++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void A0s(boolean z) {
        if (this.A0L) {
            throw AnonymousClass001.A0e("FragmentManager is already executing transactions");
        } else if (this.A07 == null) {
            if (this.A0K) {
                throw AnonymousClass001.A0e("FragmentManager has been destroyed");
            }
            throw AnonymousClass001.A0e("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.A07.A02.getLooper()) {
            throw AnonymousClass001.A0e("Must be called from main thread of fragment host");
        } else if (!z && A0t()) {
            throw AnonymousClass001.A0e("Can not perform this action after onSaveInstanceState");
        } else if (this.A0J == null) {
            this.A0J = AnonymousClass001.A0s();
            this.A0I = AnonymousClass001.A0s();
        }
    }

    public boolean A0t() {
        if (this.A0O || this.A0P) {
            return true;
        }
        return false;
    }

    public final boolean A0u() {
        C08310eF r2 = this.A05;
        if (r2 == null || (r2.A16() && r2.A0U().A0u())) {
            return true;
        }
        return false;
    }

    public boolean A0v(Menu menu) {
        boolean z = false;
        if (this.A00 >= 1) {
            Iterator A002 = C04760Qo.A00(this);
            while (A002.hasNext()) {
                C08310eF r2 = (C08310eF) A002.next();
                if (r2 != null && r2.A18()) {
                    boolean z2 = false;
                    if (!r2.A0c) {
                        if (r2.A0b && r2.A0g) {
                            r2.A0x(menu);
                            z2 = true;
                        }
                        if (z2 || r2.A0H.A0v(menu)) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    public boolean A0w(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.A00 < 1) {
            return false;
        }
        Iterator A002 = C04760Qo.A00(this);
        ArrayList arrayList = null;
        boolean z = false;
        while (A002.hasNext()) {
            C08310eF r4 = (C08310eF) A002.next();
            if (r4 != null && r4.A18()) {
                boolean z2 = false;
                if (!r4.A0c) {
                    if (r4.A0b && r4.A0g) {
                        r4.A0y(menu, menuInflater);
                        z2 = true;
                    }
                    if (z2 || r4.A0H.A0w(menu, menuInflater)) {
                        if (arrayList == null) {
                            arrayList = AnonymousClass001.A0s();
                        }
                        arrayList.add(r4);
                        z = true;
                    }
                }
            }
        }
        if (this.A0G != null) {
            while (true) {
                ArrayList arrayList2 = this.A0G;
                if (i >= arrayList2.size()) {
                    break;
                }
                C08310eF r1 = (C08310eF) arrayList2.get(i);
                if (arrayList == null || !arrayList.contains(r1)) {
                    r1.A0b();
                }
                i++;
            }
        }
        this.A0G = arrayList;
        return z;
    }

    public boolean A0x(MenuItem menuItem) {
        if (this.A00 >= 1) {
            Iterator A002 = C04760Qo.A00(this);
            while (A002.hasNext()) {
                C08310eF r1 = (C08310eF) A002.next();
                if (r1 != null && !r1.A0c) {
                    if ((r1.A0b && r1.A0g && r1.A1B(menuItem)) || r1.A0H.A0x(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        AnonymousClass000.A1J(sb, "FragmentManager{", this);
        sb.append(" in ");
        Object obj = this.A05;
        if (obj == null && (obj = this.A07) == null) {
            sb.append("null");
        } else {
            AnonymousClass000.A1A(obj, sb);
            AnonymousClass000.A1J(sb, "{", obj);
            sb.append("}");
        }
        return AnonymousClass000.A0X("}}", sb);
    }

    public static void A00(C08310eF r2) {
        if (A04()) {
            AnonymousClass000.A1K(AnonymousClass001.A0o(), "show: ", r2);
        }
        if (r2.A0c) {
            r2.A0c = false;
            r2.A0d = !r2.A0d;
        }
    }

    public static void A03(PrintWriter printWriter, String str, int i) {
        printWriter.print(str);
        printWriter.print("  #");
        printWriter.print(i);
        printWriter.print(": ");
    }

    public Bundle A08() {
        ArrayList arrayList;
        C06780Ze[] r4;
        int size;
        Bundle A082 = AnonymousClass002.A08();
        A0P();
        for (AnonymousClass0UN A032 : A0H()) {
            A032.A03();
        }
        A0r(true);
        this.A0O = true;
        this.A0A.A01 = true;
        C04760Qo r2 = this.A0Y;
        HashMap hashMap = r2.A02;
        ArrayList A0I2 = AnonymousClass002.A0I(hashMap.size());
        for (AnonymousClass0WE r8 : hashMap.values()) {
            if (r8 != null) {
                C08310eF r3 = r8.A02;
                C06820Zi r5 = new C06820Zi(r3);
                if (r3.A04 <= -1 || r5.A00 != null) {
                    r5.A00 = r3.A07;
                } else {
                    Bundle A012 = r8.A01();
                    r5.A00 = A012;
                    if (r3.A0U != null) {
                        if (A012 == null) {
                            A012 = AnonymousClass002.A08();
                            r5.A00 = A012;
                        }
                        A012.putString("android:target_state", r3.A0U);
                        int i = r3.A05;
                        if (i != 0) {
                            r5.A00.putInt("android:target_req_state", i);
                        }
                    }
                }
                C04760Qo r0 = r8.A04;
                r0.A03.put(r3.A0V, r5);
                A0I2.add(r3.A0V);
                if (A04()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Saved state of ");
                    A0o.append(r3);
                    A0o.append(": ");
                    Log.v("FragmentManager", AnonymousClass000.A0R(r3.A07, A0o));
                }
            }
        }
        ArrayList A0J2 = AnonymousClass002.A0J(r2.A03.values());
        if (!A0J2.isEmpty()) {
            ArrayList arrayList2 = r2.A01;
            synchronized (arrayList2) {
                if (arrayList2.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = AnonymousClass002.A0I(arrayList2.size());
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C08310eF r22 = (C08310eF) it.next();
                        arrayList.add(r22.A0V);
                        if (A05(2)) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("saveAllState: adding fragment (");
                            A0o2.append(r22.A0V);
                            AnonymousClass000.A18(r22, "): ", "FragmentManager", A0o2);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.A0E;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                r4 = null;
            } else {
                r4 = new C06780Ze[size];
                int i2 = 0;
                do {
                    r4[i2] = new C06780Ze((C08240dc) this.A0E.get(i2));
                    if (A05(2)) {
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        A0o3.append("saveAllState: adding back stack #");
                        A0o3.append(i2);
                        A0o3.append(": ");
                        Log.v("FragmentManager", AnonymousClass000.A0R(this.A0E.get(i2), A0o3));
                    }
                    i2++;
                } while (i2 < size);
            }
            C06770Zd r32 = new C06770Zd();
            r32.A02 = A0I2;
            r32.A03 = arrayList;
            r32.A07 = r4;
            r32.A00 = this.A0e.get();
            C08310eF r02 = this.A06;
            if (r02 != null) {
                r32.A01 = r02.A0V;
            }
            ArrayList arrayList4 = r32.A04;
            Map map = this.A0a;
            arrayList4.addAll(map.keySet());
            r32.A05.addAll(map.values());
            r32.A06 = AnonymousClass002.A0J(this.A0D);
            A082.putParcelable("state", r32);
            Map map2 = this.A0c;
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                String A0m = AnonymousClass001.A0m(it2);
                A082.putBundle(AnonymousClass000.A0V("result_", A0m, AnonymousClass001.A0o()), (Bundle) map2.get(A0m));
            }
            Iterator it3 = A0J2.iterator();
            while (it3.hasNext()) {
                C06820Zi r33 = (C06820Zi) it3.next();
                Bundle A083 = AnonymousClass002.A08();
                A083.putParcelable("state", r33);
                StringBuilder A0o4 = AnonymousClass001.A0o();
                A0o4.append("fragment_");
                A082.putBundle(AnonymousClass000.A0X(r33.A07, A0o4), A083);
            }
        } else if (A05(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return A082;
    }

    public C08310eF A0C(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        C08310eF A022 = this.A0Y.A02(string);
        if (A022 != null) {
            return A022;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Fragment no longer exists for key ");
        A0o.append(str);
        A0o.append(": unique id ");
        A0k(AnonymousClass000.A0I(string, A0o));
        throw AnonymousClass000.A0L();
    }

    public final Set A0H() {
        HashSet A0K2 = AnonymousClass002.A0K();
        for (AnonymousClass0WE r0 : this.A0Y.A04()) {
            ViewGroup viewGroup = r0.A02.A0C;
            if (viewGroup != null) {
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (!(tag instanceof AnonymousClass0UN)) {
                    tag = new C010107z(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, tag);
                }
                A0K2.add(tag);
            }
        }
        return A0K2;
    }

    public final void A0P() {
        for (AnonymousClass0UN r2 : A0H()) {
            if (r2.A00) {
                if (A04()) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                r2.A00 = false;
                r2.A02();
            }
        }
    }

    public void A0Z(C08310eF r3) {
        if (A04()) {
            AnonymousClass000.A1K(AnonymousClass001.A0o(), "hide: ", r3);
        }
        if (!r3.A0c) {
            r3.A0c = true;
            r3.A0d = true ^ r3.A0d;
            A0d(r3);
        }
    }

    public void A0a(C08310eF r4) {
        if (A04()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("remove: ");
            A0o.append(r4);
            A0o.append(" nesting=");
            Log.v("FragmentManager", AnonymousClass000.A0h(A0o, r4.A00));
        }
        boolean z = !AnonymousClass001.A1W(r4.A00);
        if (!r4.A0Z || z) {
            ArrayList arrayList = this.A0Y.A01;
            synchronized (arrayList) {
                arrayList.remove(r4);
            }
            r4.A0W = false;
            if (A06(r4)) {
                this.A0N = true;
            }
            r4.A0i = true;
            A0d(r4);
        }
    }

    public final void A0d(C08310eF r5) {
        C04050Mp r2;
        boolean z;
        ViewGroup A092 = A09(r5);
        if (A092 != null && (r2 = r5.A0D) != null && r2.A01 + r2.A02 + r2.A04 + r2.A05 > 0) {
            if (A092.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                A092.setTag(R.id.visible_removing_fragment_view_tag, r5);
            }
            C08310eF r22 = (C08310eF) A092.getTag(R.id.visible_removing_fragment_view_tag);
            C04050Mp r0 = r5.A0D;
            if (r0 == null) {
                z = false;
            } else {
                z = r0.A0F;
            }
            if (r22.A0D != null) {
                r22.A0M().A0F = z;
            }
        }
    }

    public void A0g(C08310eF r3, boolean z) {
        ViewGroup A092 = A09(r3);
        if (A092 != null && (A092 instanceof FragmentContainerView)) {
            ((FragmentContainerView) A092).A01 = !z;
        }
    }

    public final void A0j(C15900s9 r5, C15910sA r6, String str) {
        AnonymousClass0O9 lifecycle = r6.getLifecycle();
        if (((AnonymousClass08A) lifecycle).A02 != AnonymousClass0GC.DESTROYED) {
            FragmentManager$6 fragmentManager$6 = new FragmentManager$6(this, r5, lifecycle, str);
            C08260de r0 = (C08260de) this.A0b.put(str, new C08260de(r5, lifecycle, fragmentManager$6));
            if (r0 != null) {
                r0.A01.A01(r0.A02);
            }
            if (A04()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Setting FragmentResultListener with key ");
                A0o.append(str);
                A0o.append(" lifecycleOwner ");
                A0o.append(lifecycle);
                AnonymousClass000.A1K(A0o, " and listener ", r5);
            }
            lifecycle.A00(fragmentManager$6);
        }
    }

    public final void A0k(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new AnonymousClass0FF());
        AnonymousClass07u r5 = this.A07;
        if (r5 != null) {
            try {
                r5.A04.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        } else {
            A0o("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A0o(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = "    "
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)
            X.0Qo r3 = r6.A0Y
            java.lang.String r2 = X.AnonymousClass000.A0T(r7, r0)
            java.util.HashMap r1 = r3.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0048
            r9.print(r7)
            java.lang.String r0 = "Active Fragments:"
            r9.println(r0)
            java.util.Collection r0 = r1.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0028:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r1.next()
            X.0WE r0 = (X.AnonymousClass0WE) r0
            r9.print(r7)
            if (r0 == 0) goto L_0x0042
            X.0eF r0 = r0.A02
            r9.println(r0)
            r0.A11(r2, r8, r9, r10)
            goto L_0x0028
        L_0x0042:
            java.lang.String r0 = "null"
            r9.println(r0)
            goto L_0x0028
        L_0x0048:
            java.util.ArrayList r3 = r3.A01
            int r2 = r3.size()
            if (r2 <= 0) goto L_0x006c
            r9.print(r7)
            java.lang.String r0 = "Added Fragments:"
            r9.println(r0)
            r1 = 0
        L_0x0059:
            java.lang.Object r0 = r3.get(r1)
            A03(r9, r7, r1)
            java.lang.String r0 = r0.toString()
            r9.println(r0)
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x006c
            goto L_0x0059
        L_0x006c:
            java.util.ArrayList r0 = r6.A0G
            r3 = 0
            if (r0 == 0) goto L_0x0095
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0095
            r9.print(r7)
            java.lang.String r0 = "Fragments Created Menus:"
            r9.println(r0)
            r1 = 0
        L_0x0080:
            java.util.ArrayList r0 = r6.A0G
            java.lang.Object r0 = r0.get(r1)
            A03(r9, r7, r1)
            java.lang.String r0 = r0.toString()
            r9.println(r0)
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0095
            goto L_0x0080
        L_0x0095:
            java.util.ArrayList r0 = r6.A0E
            if (r0 == 0) goto L_0x00c3
            int r4 = r0.size()
            if (r4 <= 0) goto L_0x00c3
            r9.print(r7)
            java.lang.String r0 = "Back Stack:"
            r9.println(r0)
            r2 = 0
        L_0x00a8:
            java.util.ArrayList r0 = r6.A0E
            java.lang.Object r1 = r0.get(r2)
            X.0dc r1 = (X.C08240dc) r1
            A03(r9, r7, r2)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            r0 = 1
            r1.A0H(r9, r5, r0)
            int r2 = r2 + 1
            if (r2 >= r4) goto L_0x00c3
            goto L_0x00a8
        L_0x00c3:
            r9.print(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Back Stack Index: "
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0e
            int r0 = r0.get()
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            r9.println(r0)
            java.util.ArrayList r2 = r6.A0Z
            monitor-enter(r2)
            int r1 = r2.size()     // Catch:{ all -> 0x016f }
            if (r1 <= 0) goto L_0x00fe
            r9.print(r7)     // Catch:{ all -> 0x016f }
            java.lang.String r0 = "Pending Actions:"
            r9.println(r0)     // Catch:{ all -> 0x016f }
        L_0x00ed:
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x016f }
            X.0s7 r0 = (X.C15880s7) r0     // Catch:{ all -> 0x016f }
            A03(r9, r7, r3)     // Catch:{ all -> 0x016f }
            r9.println(r0)     // Catch:{ all -> 0x016f }
            int r3 = r3 + 1
            if (r3 >= r1) goto L_0x00fe
            goto L_0x00ed
        L_0x00fe:
            monitor-exit(r2)     // Catch:{ all -> 0x016f }
            r9.print(r7)
            java.lang.String r0 = "FragmentManager misc state:"
            r9.println(r0)
            r9.print(r7)
            java.lang.String r0 = "  mHost="
            r9.print(r0)
            X.07u r0 = r6.A07
            r9.println(r0)
            r9.print(r7)
            java.lang.String r0 = "  mContainer="
            r9.print(r0)
            X.0O3 r0 = r6.A08
            r9.println(r0)
            X.0eF r0 = r6.A05
            if (r0 == 0) goto L_0x0132
            r9.print(r7)
            java.lang.String r0 = "  mParent="
            r9.print(r0)
            X.0eF r0 = r6.A05
            r9.println(r0)
        L_0x0132:
            r9.print(r7)
            java.lang.String r0 = "  mCurState="
            r9.print(r0)
            int r0 = r6.A00
            r9.print(r0)
            java.lang.String r0 = " mStateSaved="
            r9.print(r0)
            boolean r0 = r6.A0O
            r9.print(r0)
            java.lang.String r0 = " mStopped="
            r9.print(r0)
            boolean r0 = r6.A0P
            r9.print(r0)
            java.lang.String r0 = " mDestroyed="
            r9.print(r0)
            boolean r0 = r6.A0K
            r9.println(r0)
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x016e
            r9.print(r7)
            java.lang.String r0 = "  mNeedMenuInvalidate="
            r9.print(r0)
            boolean r0 = r6.A0N
            r9.println(r0)
        L_0x016e:
            return
        L_0x016f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x016f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08270df.A0o(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final void A0p(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C08240dc) arrayList.get(i)).A0H) {
                    if (i2 != i) {
                        A0q(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (AnonymousClass001.A1Z(arrayList2.get(i))) {
                        while (i2 < size && AnonymousClass001.A1Z(arrayList2.get(i2)) && !((C08240dc) arrayList.get(i2)).A0H) {
                            i2++;
                        }
                    }
                    A0q(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                A0q(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw AnonymousClass001.A0e("Internal error with the back stack records");
    }

    public void A0r(boolean z) {
        A0s(z);
        while (true) {
            ArrayList arrayList = this.A0J;
            ArrayList arrayList2 = this.A0I;
            ArrayList arrayList3 = this.A0Z;
            synchronized (arrayList3) {
                if (arrayList3.isEmpty()) {
                    break;
                }
                try {
                    int size = arrayList3.size();
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= ((C15880s7) arrayList3.get(i)).B3h(arrayList, arrayList2);
                    }
                    if (!z2) {
                        break;
                    }
                    this.A0L = true;
                    try {
                        A0p(this.A0J, this.A0I);
                    } finally {
                        A0O();
                    }
                } finally {
                    arrayList3.clear();
                    this.A07.A02.removeCallbacks(this.A0C);
                }
            }
        }
        A0R();
        if (this.A0M) {
            this.A0M = false;
            A0Q();
        }
        A02(this);
    }
}
