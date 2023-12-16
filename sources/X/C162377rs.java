package X;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import com.whatsapp.R;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.7rs  reason: invalid class name and case insensitive filesystem */
public class C162377rs {
    public static final C181398mh A00 = new C170288Cp();

    public static C835348u A04(C153427bI r2) {
        C835348u r0;
        if (r2 != null && (r0 = (C835348u) r2.A01.get(R.id.bk_context_key_interpreter_extensions)) != null) {
            return r0;
        }
        C835348u r02 = C158977kt.A00().A0A;
        r02.getClass();
        return r02;
    }

    public static Animator A00(C153427bI r1, String str) {
        return (Animator) ((AbstractMap) r1.A02(R.id.bk_context_key_animations)).get(str);
    }

    public static C153427bI A01(Context context, SparseArray sparseArray, C160817oM r7, C47382dA r8, String str) {
        SparseArray clone = r8.A00().clone();
        for (int i = 0; i < sparseArray.size(); i++) {
            clone.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        clone.put(R.id.bk_context_key_states, AnonymousClass001.A0t());
        if (r7 == null) {
            r7 = new C160817oM(AnonymousClass7r0.A01(new AnonymousClass84O(-1)), C155007e8.A00, AnonymousClass8DC.A00);
        }
        clone.put(R.id.bk_context_key_tree, r7);
        clone.put(R.id.bk_context_key_scoped_client_id_mapper, new AnonymousClass7SC());
        clone.put(R.id.bk_context_key_animations, AnonymousClass001.A0t());
        clone.put(R.id.bk_context_key_timers, AnonymousClass001.A0t());
        clone.put(R.id.bk_context_key_logging_id, str);
        if (clone.get(R.id.bk_context_key_performance_logger) == null) {
            clone.put(R.id.bk_context_key_performance_logger, C154997e7.A00);
        }
        clone.put(R.id.bk_context_key_controller_by_server_id, AnonymousClass0x7.A0y());
        return new C153427bI(context, clone, r8);
    }

    public static C160817oM A02(C153427bI r1) {
        return (C160817oM) r1.A02(R.id.bk_context_key_tree);
    }

    public static AnonymousClass8r1 A03(C153427bI r1, String str) {
        Map map = (Map) r1.A02(R.id.bk_context_key_data_modules);
        if (map == null) {
            return null;
        }
        return (AnonymousClass8r1) map.get(str);
    }

    public static Object A05(C153427bI r3, AnonymousClass84O r4) {
        Object A03 = r3.A03(A00, r4, R.id.bk_context_key_controller_associated_object);
        String A0N = r4.A0N();
        if (A0N != null) {
            ((Map) r3.A02(R.id.bk_context_key_controller_by_server_id)).put(A0N, A03);
        }
        return A03;
    }

    public static Object A06(C153427bI r0, AnonymousClass84O r1) {
        Object A05 = A05(r0, r1);
        A05.getClass();
        return A05;
    }

    public static void A07(Animator animator, C153427bI r2) {
        ((AbstractMap) r2.A02(R.id.bk_context_key_animations)).values().remove(animator);
    }

    public static void A08(Animator animator, C153427bI r2, String str) {
        Animator animator2 = (Animator) ((AbstractMap) r2.A02(R.id.bk_context_key_animations)).put(str, animator);
        if (animator2 != null) {
            animator2.cancel();
            C159737mN.A01("BloksAnimation", String.format("Found previously started animator with key %s. Canceling it.", AnonymousClass000.A1b(str)));
        }
    }

    public static void A09(C153427bI r1) {
        C160817oM A02 = A02(r1);
        if (A02 != null && C161827qc.A04()) {
            int i = A02.A00;
            if (i > 0) {
                int i2 = i - 1;
                A02.A00 = i2;
                if (i2 == 0 && A02.A0I.size() > 0) {
                    A02.A06();
                    return;
                }
                return;
            }
            throw AnonymousClass001.A0e("Negative recursion level.");
        }
    }

    public static void A0A(C153427bI r1, String str) {
        ((AbstractMap) r1.A02(R.id.bk_context_key_animations)).remove(str);
    }

    public static boolean A0B(C153427bI r2) {
        Boolean bool = (Boolean) r2.A01.get(R.id.bk_context_key_clip_children_bool);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static boolean A0C(C153427bI r2) {
        Boolean bool = (Boolean) r2.A01.get(R.id.bk_context_key_is_resolve_enabled_override);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
