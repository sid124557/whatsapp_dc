package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.9k8  reason: invalid class name and case insensitive filesystem */
public class C201439k8 implements Runnable {
    public final /* synthetic */ AnonymousClass9MI A00;
    public final /* synthetic */ C203689o9 A01;
    public final /* synthetic */ List A02;

    public C201439k8(AnonymousClass9MI r1, C203689o9 r2, List list) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = list;
    }

    public void run() {
        Object obj;
        Object obj2;
        String str;
        C203689o9 r15 = this.A01;
        long hashCode = (long) hashCode();
        List list = this.A02;
        LinkedList A18 = AnonymousClass0x9.A18();
        LinkedList A182 = AnonymousClass0x9.A18();
        LinkedList A183 = AnonymousClass0x9.A18();
        LinkedList A184 = AnonymousClass0x9.A18();
        LinkedList A185 = AnonymousClass0x9.A18();
        Iterator it = list.iterator();
        while (true) {
            Object obj3 = "0";
            if (!it.hasNext()) {
                break;
            }
            Map map = ((AnonymousClass9MW) it.next()).A00;
            String str2 = "none";
            if (map != null) {
                if (map.containsKey("effect_id")) {
                    str = C18310x6.A0o("effect_id", map);
                } else {
                    str = obj3;
                }
                if (map.containsKey("filter_type")) {
                    str2 = C18310x6.A0o("filter_type", map);
                }
                if (map.containsKey("effect_instance_id")) {
                    obj = map.get("effect_instance_id");
                } else {
                    obj = obj3;
                }
                if (map.containsKey("effect_session_id")) {
                    obj2 = map.get("effect_session_id");
                } else {
                    obj2 = obj3;
                }
                if (str2.equals("msqrd") && !str.equals(obj3)) {
                    A182.add(str);
                }
                obj3 = str;
            } else {
                obj = obj3;
                obj2 = obj3;
            }
            A18.add(obj3);
            A183.add(str2);
            A184.add(obj);
            A185.add(obj2);
        }
        C202889mm B5E = r15.B5E();
        List B4V = B5E.B4V(A18, A184, A185);
        List B4W = B5E.B4W(A183);
        if (!A18.equals(B4V)) {
            C192939Mi r3 = null;
            if (!A182.isEmpty()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                Iterator it2 = A182.iterator();
                while (it2.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it2);
                    if (!B4V.contains(A0m)) {
                        A0o.append(A0m);
                        A0o.append(";");
                    }
                }
                if (A0o.length() > 0) {
                    r3 = r15.BBG().B2J(A0o.substring(0, A0o.length() - 1));
                }
            } else if (B4W.contains("msqrd")) {
                r3 = r15.BBG().B2I();
            }
            HashMap A0t = AnonymousClass001.A0t();
            if (B4V.size() < A18.size()) {
                ArrayList A0J = AnonymousClass002.A0J(A18);
                A0J.removeAll(B4V);
                A0t.put("effects_added", A00(A0J));
            } else {
                if (B4V.size() <= A18.size()) {
                    ArrayList A0J2 = AnonymousClass002.A0J(A18);
                    A0J2.removeAll(B4V);
                    A0t.put("effects_added", A00(A0J2));
                }
                ArrayList A0J3 = AnonymousClass002.A0J(B4V);
                A0J3.removeAll(A18);
                A0t.put("effects_removed", A00(A0J3));
            }
            r15.BKJ("media_pipeline_update_effects_list", "ArEngineControllerImpl", r15.BGU(r3, A0t), hashCode);
        }
    }

    public static String A00(List list) {
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0o.append(AnonymousClass001.A0m(it));
            A0o.append(";");
        }
        return A0o.toString();
    }
}
