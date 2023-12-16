package X;

import java.util.List;

/* renamed from: X.1IM  reason: invalid class name */
public class AnonymousClass1IM extends C59242wb {
    public AnonymousClass1IM() {
        super("agent");
        List A00 = C59242wb.A00(this, "agent_chat_assignment", "jid_row_id");
        A00.add(new C58832vt("agent_devices", "rowid", "agent_id"));
        C59242wb.A02("agent_message_attribution", "message_row_id", A00);
    }
}
