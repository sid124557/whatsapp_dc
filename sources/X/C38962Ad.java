package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Ad  reason: invalid class name and case insensitive filesystem */
public class C38962Ad {
    public static final Map A00;

    static {
        HashMap A0t = AnonymousClass001.A0t();
        Integer A0f = AnonymousClass001.A0f();
        Integer A0E = C18270x1.A0E("jid_ready", A0f, A0t);
        A0t.put("chat_ready", A0E);
        A0t.put("labeled_jids_ready", A0f);
        A0t.put("links_ready", A0E);
        A0t.put("text_ready", A0f);
        A0t.put("new_vcards_ready", A0f);
        A0t.put("future_ready", A0f);
        A0t.put("call_log_ready", A0f);
        A0t.put("missed_calls_ready", A0f);
        A0t.put("quoted_message_ready", A0E);
        A0t.put("system_message_ready", A0E);
        A0t.put("mention_message_ready", A0f);
        A0t.put("revoked_ready", A0f);
        A0t.put("frequent_ready", A0f);
        A0t.put("location_ready", A0E);
        A0t.put("media_message_fixer_ready", C18270x1.A0F("media_message_ready", A0E, A0t));
        A0t.put("send_count_ready", A0f);
        A0t.put("new_pay_transaction_ready", A0f);
        A0t.put("main_message_ready", A0f);
        A00 = Collections.unmodifiableMap(A0t);
    }
}
