package X;

import java.util.List;

/* renamed from: X.1Id  reason: invalid class name */
public class AnonymousClass1Id extends C59242wb {
    public AnonymousClass1Id() {
        super("receipt");
        List A00 = C59242wb.A00(this, "receipt_user", "_id");
        C59242wb.A02("receipt_device", "_id", A00);
        C59242wb.A02("message_add_on_receipt_device", "receipt_device_id", A00);
        C59242wb.A02("receipt_orphaned", "_id", A00);
        C59242wb.A02("played_self_receipt", "message_row_id", A00);
    }
}
