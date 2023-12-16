package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3vG  reason: invalid class name and case insensitive filesystem */
public final class C78593vG extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass2O9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78593vG(AnonymousClass2O9 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List list;
        String str;
        AnonymousClass2O9 r0 = this.this$0;
        C186568vZ r7 = r0.A00;
        AnonymousClass4C1 r1 = r0.A01;
        r7.markerPoint(314510313, "get_regs");
        Iterable<C45572aE> iterable = (Iterable) r1.get();
        r7.markerPoint(314510313, "config_regs");
        C162457s7.A0H(iterable);
        for (C45572aE A00 : iterable) {
            A00.A00();
        }
        r7.markerPoint(314510313, "process_regs");
        LinkedHashMap A0r = C18320x8.A0r();
        LinkedHashMap A0r2 = C18320x8.A0r();
        for (C45572aE r4 : iterable) {
            synchronized (r4) {
                r4.A00();
                list = r4.A02;
            }
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    C26471cB r02 = ((C26481cC) it.next()).A03;
                    if (r02 != null) {
                        C85424Ge r2 = r02.A01;
                        if (r2 != null) {
                            AnonymousClass4C1 r12 = r02.A00;
                            if (r12 == null) {
                                throw C18270x1.A0S("defaultImplementation");
                            } else if (A0r2.containsKey(r2)) {
                                C85424Ge r3 = (C85424Ge) A0r.get(r2);
                                String BBo = r2.BBo();
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("Duplicate registration of subsystem interface ");
                                A0o.append(BBo);
                                A0o.append(". Originally registered by ");
                                if (r3 != null) {
                                    str = r3.BBo();
                                } else {
                                    str = null;
                                }
                                A0o.append(str);
                                throw new C73253fB(AnonymousClass000.A0X(AnonymousClass0x9.A1E(C18310x6.A0c(r4, ". Duplicate registered by ", A0o)).BBo(), A0o));
                            } else {
                                A0r2.put(r2, r12);
                                A0r.put(r2, AnonymousClass0x9.A1E(r4.getClass()));
                            }
                        } else {
                            throw C18270x1.A0S("integrationInterface");
                        }
                    } else {
                        throw C18270x1.A0S("integrationPointBuilder");
                    }
                }
            }
        }
        r7.markerPoint(314510313, "init_complete");
        return A0r2;
    }
}
