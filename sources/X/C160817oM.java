package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7oM  reason: invalid class name and case insensitive filesystem */
public class C160817oM {
    public static final Handler A0L = AnonymousClass000.A0A();
    public int A00;
    public AnonymousClass7TS A01;
    public AnonymousClass7r0 A02;
    public C181408mi A03;
    public C158847ke A04 = new C158847ke();
    public AnonymousClass7P6 A05;
    public AnonymousClass84O A06;
    public Object A07 = AnonymousClass002.A0D();
    public WeakReference A08 = AnonymousClass0x9.A14((Object) null);
    public Map A09 = Collections.emptyMap();
    public boolean A0A;
    public boolean A0B = false;
    public boolean A0C = false;
    public final C155007e8 A0D;
    public final C184958sp A0E;
    public final Runnable A0F = new C172668Mf(this, 49);
    public final List A0G = AnonymousClass001.A0s();
    public final List A0H = AnonymousClass001.A0s();
    public final List A0I = AnonymousClass001.A0s();
    public final List A0J = AnonymousClass001.A0s();
    public final Map A0K = AnonymousClass001.A0t();

    public static C131266dJ A00(C153427bI r15, C158847ke r16, List list) {
        C835348u A042 = C162377rs.A04(r15);
        C155007e8 r7 = new C155007e8();
        SparseArray sparseArray = r15.A01;
        C154707dc r2 = C154707dc.A00;
        C141446va r8 = C141446va.DataManifest;
        return new C131266dJ(r2, r15, (C153427bI) null, r16, (C154997e7) sparseArray.get(R.id.bk_context_key_performance_logger), r7, r8, (C156077fz) null, A042, (String) sparseArray.get(R.id.bk_context_key_logging_id), (String) null, list, (Map) null, (Set) null);
    }

    public void A0B(String str, Object obj) {
        C117715sN r2 = new C117715sN(this, obj, str, 4);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            r2.run();
        } else {
            A0L.post(r2);
        }
    }

    /* JADX INFO: finally extract failed */
    public final Pair A01(List list) {
        Pair pair;
        C156947hT r1;
        List list2;
        Throwable th;
        Map map;
        Map map2;
        List list3;
        C159567m6.A01("Bloks ProcessResources");
        try {
            LinkedList linkedList = new LinkedList(list);
            ArrayList A0s = AnonymousClass001.A0s();
            C153427bI r2 = (C153427bI) this.A08.get();
            if (r2 == null) {
                pair = AnonymousClass0x9.A0C(Boolean.FALSE, AnonymousClass001.A0s());
            } else {
                C158847ke r4 = this.A04;
                loop0:
                while (!linkedList.isEmpty()) {
                    AnonymousClass7r0 r3 = (AnonymousClass7r0) linkedList.poll();
                    if (!(r3 == null || (r1 = r3.A00) == null)) {
                        AnonymousClass84O r32 = r3.A01;
                        C158847ke r11 = this.A04;
                        Map map3 = r1.A06;
                        if (!map3.isEmpty()) {
                            HashMap hashMap = new HashMap(r11.A03);
                            hashMap.putAll(map3);
                            Map map4 = r11.A06;
                            Map map5 = r11.A07;
                            Map map6 = r11.A02;
                            Map map7 = r11.A01;
                            r11 = new C158847ke(r11.A00, map4, hashMap, map5, map6, map7, r11.A04, r11.A05);
                        }
                        this.A04 = r11;
                        C152047Xi r7 = r1.A00;
                        if (r7 != null) {
                            Map map8 = r7.A00;
                            if (!map8.isEmpty()) {
                                C152047Xi r8 = r11.A00;
                                C162457s7.A0J(r8, 0);
                                LinkedHashMap linkedHashMap = new LinkedHashMap(r8.A00);
                                linkedHashMap.putAll(map8);
                                C152047Xi r12 = new C152047Xi(linkedHashMap);
                                Map map9 = r11.A06;
                                Map map10 = r11.A03;
                                Map map11 = r11.A07;
                                Map map12 = r11.A02;
                                Map map13 = r11.A01;
                                r11 = new C158847ke(r12, map9, map10, map11, map12, map13, r11.A04, r11.A05);
                            }
                        }
                        this.A04 = r11;
                        List<C147947Gi> list4 = r1.A03;
                        if (!list4.isEmpty()) {
                            HashMap hashMap2 = new HashMap(r11.A01);
                            for (C147947Gi r82 : list4) {
                                hashMap2.put(r82.A01, r82);
                            }
                            Map map14 = r11.A06;
                            Map map15 = r11.A03;
                            Map map16 = r11.A07;
                            Map map17 = r11.A02;
                            r11 = new C158847ke(r11.A00, map14, map15, map16, map17, hashMap2, r11.A04, r11.A05);
                        }
                        this.A04 = r11;
                        Map map18 = r1.A07;
                        if (map18 != null && !map18.isEmpty()) {
                            HashMap hashMap3 = new HashMap(r11.A04);
                            hashMap3.putAll(map18);
                            Map map19 = r11.A06;
                            Map map20 = r11.A03;
                            Map map21 = r11.A07;
                            Map map22 = r11.A02;
                            r11 = new C158847ke(r11.A00, map19, map20, map21, map22, r11.A01, hashMap3, r11.A05);
                        }
                        this.A04 = r11;
                        List<C147957Gj> list5 = r1.A04;
                        if (list5 != null && !list5.isEmpty()) {
                            HashMap hashMap4 = new HashMap(r11.A05);
                            for (C147957Gj r83 : list5) {
                                hashMap4.put(r83.A01, r83);
                            }
                            Map map23 = r11.A06;
                            Map map24 = r11.A03;
                            Map map25 = r11.A07;
                            Map map26 = r11.A02;
                            Map map27 = r11.A01;
                            r11 = new C158847ke(r11.A00, map23, map24, map25, map26, map27, r11.A04, hashMap4);
                        }
                        this.A04 = r11;
                        HashMap hashMap5 = null;
                        HashMap hashMap6 = null;
                        for (C156387gX r122 : r1.A05) {
                            String str = r122.A00;
                            if (hashMap5 != null) {
                                map = hashMap5;
                            } else {
                                map = this.A04.A06;
                            }
                            if (!map.containsKey(str)) {
                                if (hashMap5 == null) {
                                    hashMap5 = new HashMap(this.A04.A06);
                                }
                                hashMap5.put(str, r122);
                            }
                            if (hashMap6 != null) {
                                map2 = hashMap6;
                            } else {
                                map2 = this.A04.A07;
                            }
                            if (!map2.containsKey(str)) {
                                String str2 = r122.A01;
                                AnonymousClass8r1 A032 = C162377rs.A03(r2, str2);
                                if (A032 == null) {
                                    th = AnonymousClass002.A0E(AnonymousClass000.A0V("Missing variable module with type: ", str2, AnonymousClass001.A0o()));
                                    break loop0;
                                }
                                if (r32 != null) {
                                    list3 = r32.A07;
                                } else {
                                    list3 = null;
                                }
                                C147927Gg Bnh = A032.Bnh(r2, this, this.A0D, r122, A00(r2, this.A04, list3));
                                AnonymousClass7TS r72 = this.A01;
                                Runnable runnable = Bnh.A01;
                                if (runnable != null) {
                                    List list6 = r72.A02;
                                    synchronized (list6) {
                                        try {
                                            if (r72.A03) {
                                                C159737mN.A01("BloksContextBindManager", "Subsctiption added after destroy");
                                            } else {
                                                list6.add(runnable);
                                                runnable = null;
                                            }
                                        } catch (Throwable th2) {
                                            while (true) {
                                                th = th2;
                                                break;
                                            }
                                        }
                                    }
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                                if (hashMap6 == null) {
                                    hashMap6 = new HashMap(this.A04.A07);
                                }
                                hashMap6.put(str, Bnh.A00);
                            }
                        }
                        C158847ke A012 = this.A04.A01(hashMap5, hashMap6);
                        this.A04 = A012;
                        if (r32 != null) {
                            list2 = r32.A07;
                        } else {
                            list2 = null;
                        }
                        A00(r2, A012, list2);
                        List list7 = r1.A01;
                        if (list7 == null || list7.isEmpty()) {
                            Iterator it = AnonymousClass001.A0s().iterator();
                            if (it.hasNext()) {
                                it.next();
                                th = AnonymousClass001.A0g("getTreeModification");
                                throw th;
                            }
                        } else {
                            C159567m6.A01("Initialize BloksComponentQueryManager");
                            r2.A02(R.id.bk_context_key_async_component_store);
                            throw AnonymousClass002.A0E("Attempting to process async components but missing component query store");
                        }
                    }
                }
                pair = AnonymousClass0x9.A0C(Boolean.valueOf(C18300x5.A1W(this.A04, r4)), A0s);
            }
            C159567m6.A00();
            return pair;
        } catch (Throwable th3) {
            C159567m6.A00();
            throw th3;
        }
    }

    public C151617Vm A02(C153427bI r11, C181408mi r12, Map map) {
        C158847ke r1 = this.A04;
        Map map2 = map;
        if (!map.isEmpty() || !r1.A02.isEmpty()) {
            r1 = new C158847ke(r1.A00, r1.A06, r1.A03, r1.A07, map2, r1.A01, r1.A04, r1.A05);
        }
        this.A04 = r1;
        this.A01 = new AnonymousClass7TS(r11.A00);
        this.A08 = AnonymousClass0x9.A14(r11);
        this.A03 = r12;
        Pair A012 = A01(Collections.singletonList(this.A02));
        this.A02 = null;
        if (!((List) A012.second).isEmpty()) {
            this.A06 = A05((List) A012.second);
        }
        synchronized (this.A07) {
            this.A0C = true;
            if (this.A0B) {
                Handler handler = A0L;
                Runnable runnable = this.A0F;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
        }
        return new C151617Vm(this.A04, this.A06);
    }

    public AnonymousClass84O A03() {
        AnonymousClass7P6 r0 = this.A05;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public AnonymousClass84O A04() {
        if (this.A0A) {
            C159737mN.A01("BloksTreeManager", "Trying to access a tree on a destroyed BloksTreeManager");
        }
        C161827qc.A03("Tree operations are only supported from the UI Thread");
        return A05(this.A0I);
    }

    public final AnonymousClass84O A05(List list) {
        C159567m6.A01("Bloks SnapshotComponent");
        AnonymousClass84O r1 = this.A06;
        try {
            if (!list.isEmpty()) {
                r1 = AnonymousClass73D.A00(new C170358Cw(list), r1);
            }
            return r1;
        } finally {
            C159567m6.A00();
        }
    }

    public void A06() {
        boolean z;
        if (!this.A0A) {
            C161827qc.A03("Tree operations are only supported from the UI Thread");
            Map map = this.A0K;
            boolean z2 = true;
            if (!map.isEmpty()) {
                this.A04 = this.A04.A00(map);
                map.clear();
                z = true;
            } else {
                z = false;
            }
            List list = this.A0J;
            if (!list.isEmpty()) {
                ArrayList A0J2 = AnonymousClass002.A0J(list);
                list.clear();
                Pair A012 = A01(A0J2);
                z |= AnonymousClass001.A1Z(A012.first);
                this.A0I.addAll((Collection) A012.second);
            }
            C159567m6.A01("Bloks ModelMutation");
            List list2 = this.A0I;
            AnonymousClass84O A052 = A05(list2);
            if (this.A06 == A052) {
                z2 = false;
            }
            boolean z3 = z | z2;
            this.A06 = A052;
            list2.clear();
            C159567m6.A00();
            C181408mi r3 = this.A03;
            if (r3 != null && z3) {
                r3.BX2(new C151617Vm(this.A04, this.A06));
            }
        }
    }

    public void A07(AnonymousClass7r0 r3, Map map) {
        C161827qc.A03("Tree operations are only supported from the UI Thread");
        this.A0I.addAll((Collection) A01(Collections.singletonList(r3)).second);
        HashMap A0t = AnonymousClass001.A0t();
        A0t.putAll(this.A04.A07);
        if (map != null) {
            A0t.putAll(map);
        }
        if (!A0t.isEmpty()) {
            this.A04 = this.A04.A00(A0t);
            A0t.putAll(this.A09);
            this.A09 = A0t;
        }
    }

    public void A08(C152207Xz r4) {
        if (!this.A0A) {
            C161827qc.A03("Tree operations are only supported from the UI Thread");
            AnonymousClass79U.A05.incrementAndGet();
            this.A0K.put(r4.A01, r4.A00);
            synchronized (this.A07) {
                if (!this.A0C) {
                    this.A0B = true;
                    return;
                }
                Handler handler = A0L;
                Runnable runnable = this.A0F;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
        }
    }

    public void A0A(C181458mn r3, AnonymousClass7Uu r4) {
        if (!this.A0A) {
            C161827qc.A03("Tree operations are only supported from the UI Thread");
            this.A0I.add(AnonymousClass0x9.A0C(r3, r4));
        }
    }

    public C160817oM(AnonymousClass7r0 r3, C155007e8 r4, C184958sp r5) {
        this.A06 = r3.A01;
        this.A02 = r3;
        this.A0D = r4;
        this.A0E = r5;
    }

    public void A09(AnonymousClass84O r3, AnonymousClass7Uu r4) {
        A0A(new AnonymousClass8DB(A04(), r3), r4);
        A06();
    }
}
