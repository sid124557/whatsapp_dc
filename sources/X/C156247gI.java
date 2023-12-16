package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.ArrayList;

/* renamed from: X.7gI  reason: invalid class name and case insensitive filesystem */
public class C156247gI {
    public static final int A02 = TriggerRegistry.A00.A02("WhatsApp");
    public final ArrayList A00;
    public final boolean A01;

    public C156247gI() {
        ArrayList A0i = AnonymousClass0x2.A0i(new String[]{"stack_trace", "qpl", "system_counters", "high_freq_main_thread_counters"});
        this.A00 = A0i;
        if (!"x86_64".equals(AnonymousClass321.A02())) {
            A0i.add("atrace");
        }
        boolean A1V = AnonymousClass001.A1V((Math.random() > 0.5d ? 1 : (Math.random() == 0.5d ? 0 : -1)));
        this.A01 = A1V;
        if (A1V) {
            A0i.add("wall_time_stack_trace");
        }
    }
}
