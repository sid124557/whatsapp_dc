package X;

import java.util.List;

/* renamed from: X.1IO  reason: invalid class name */
public class AnonymousClass1IO extends C59242wb {
    public AnonymousClass1IO() {
        super("call_log");
        List A00 = C59242wb.A00(this, "call_log", "_id");
        C59242wb.A02("call_link", "_id", A00);
        C59242wb.A02("call_log_participant_v2", "_id", A00);
        C59242wb.A02("joinable_call_log", "call_log_row_id", A00);
    }
}
