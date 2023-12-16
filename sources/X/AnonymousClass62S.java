package X;

import android.content.Context;
import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.62S  reason: invalid class name */
public final class AnonymousClass62S extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ UpdatesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass62S(UpdatesFragment updatesFragment) {
        super(1);
        this.this$0 = updatesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C103685Ny r14 = (C103685Ny) obj;
        C162457s7.A0J(r14, 0);
        UpdatesFragment updatesFragment = this.this$0;
        C103675Nx r7 = r14.A02;
        Set set = r7.A00;
        if (!C18310x6.A1X(set)) {
            List list = r14.A03;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C57692u3.A01(list));
            for (Object next : list) {
                AnonymousClass2z0 r0 = ((C624134x) next).A1J;
                C162457s7.A0C(r0);
                linkedHashMap.put(r0, next);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1H("Message state changed: total no of messages: ", A0o, list);
            C18260x0.A1P(A0o, " / message state: ", r7);
            Set<Object> set2 = r7.A02;
            for (Object obj2 : set2) {
                C624134x r2 = (C624134x) linkedHashMap.get(obj2);
                if (r2 != null) {
                    C613930n r1 = updatesFragment.A0m;
                    if (r1 != null) {
                        r1.A04(updatesFragment.A0G(), r2);
                    } else {
                        throw C18270x1.A0S("statusUndoHandler");
                    }
                }
            }
            if (set2.isEmpty() && set.isEmpty()) {
                for (Object obj3 : r7.A03) {
                    C624134x r8 = (C624134x) linkedHashMap.get(obj3);
                    if (r8 != null) {
                        C613930n r4 = updatesFragment.A0m;
                        if (r4 != null) {
                            Context A0G = updatesFragment.A0G();
                            if (C613930n.A00(r8)) {
                                String str = r8.A1J.A01;
                                Map map = r4.A06;
                                if (map.containsKey(str)) {
                                    map.put(str, r8);
                                    Iterator A0v = AnonymousClass001.A0v(map);
                                    while (true) {
                                        if (A0v.hasNext()) {
                                            if (C18300x5.A0T(A0v).A0J <= 0) {
                                                break;
                                            }
                                        } else if (r4.A08()) {
                                            r4.A06(A0G, updatesFragment);
                                        } else if (!C626736a.A09(map.values()) || !r4.A01.A02()) {
                                            r4.A03(A0G, new C109525el(r4, AnonymousClass0x9.A15(map.values()), updatesFragment, 12), (C88674aZ) null, updatesFragment);
                                        } else {
                                            r4.A05(A0G, r8, updatesFragment);
                                        }
                                    }
                                }
                            }
                        } else {
                            throw C18270x1.A0S("statusUndoHandler");
                        }
                    }
                }
            }
        }
        return C59022wD.A00;
    }
}
