package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3v6  reason: invalid class name and case insensitive filesystem */
public final class C78493v6 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C53662nS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78493v6(C53662nS r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List list;
        Throwable th;
        String str;
        C53662nS r0 = this.this$0;
        AnonymousClass2Q7 r2 = r0.A02;
        C85424Ge r4 = r0.A04;
        synchronized (r2) {
            if (!r2.A00) {
                C186568vZ r8 = r2.A01;
                r8.markerStart(314514774);
                AnonymousClass3U8.A00.A00(r8, 314514774);
                r8.markerPoint(314514774, "get_regs");
                Iterable<C49042ft> iterable = (Iterable) r2.A03.get();
                r8.markerPoint(314514774, "config_regs");
                C162457s7.A0H(iterable);
                for (C49042ft r1 : iterable) {
                    synchronized (r1) {
                        try {
                            if (!r1.A00) {
                                r1.A00();
                                r1.A00 = true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                r8.markerPoint(314514774, "process_regs");
                LinkedHashMap A0r = C18320x8.A0r();
                loop1:
                for (Object next : iterable) {
                    C49042ft r5 = (C49042ft) next;
                    synchronized (next) {
                        if (!r5.A00) {
                            r5.A00();
                            r5.A00 = true;
                        }
                        list = r5.A02;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C26451c9 r02 = ((C26491cD) it.next()).A03;
                            if (r02 == null) {
                                th = C18270x1.A0S("integrationPointBuilder");
                                break loop1;
                            }
                            C85424Ge r6 = r02.A01;
                            if (r6 == null) {
                                th = C18270x1.A0S("integrationInterface");
                                break loop1;
                            }
                            AnonymousClass4C1 r3 = r02.A00;
                            if (r3 == null) {
                                th = C18270x1.A0S("defaultImplementation");
                                break loop1;
                            }
                            Map map = r2.A02;
                            if (map.containsKey(r6)) {
                                C85424Ge r42 = (C85424Ge) A0r.get(r6);
                                String BBo = r6.BBo();
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("Duplicate registration of subsystem interface ");
                                A0o.append(BBo);
                                A0o.append(". Originally registered by ");
                                if (r42 != null) {
                                    str = r42.BBo();
                                } else {
                                    str = null;
                                }
                                A0o.append(str);
                                th = new C73253fB(AnonymousClass000.A0X(AnonymousClass0x9.A1E(C18310x6.A0c(r5, ". Duplicate registered by ", A0o)).BBo(), A0o));
                            } else {
                                map.put(r6, r3);
                                A0r.put(r6, AnonymousClass0x9.A1E(r5.getClass()));
                            }
                        }
                    }
                    throw th;
                }
                r8.markerPoint(314514774, "init_complete");
                r2.A00 = true;
                r8.markerEnd(314514774, 2);
            }
        }
        AnonymousClass4C1 r03 = (AnonymousClass4C1) r2.A02.get(r4);
        if (r03 != null) {
            return r03.get();
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Subsystem ");
        A0o2.append(r4.BBo());
        throw new C73273fD(AnonymousClass000.A0X(" was not registered.", A0o2));
    }
}
