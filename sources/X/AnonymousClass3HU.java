package X;

/* renamed from: X.3HU  reason: invalid class name */
public class AnonymousClass3HU implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("deleted_chat_job_index", "CREATE INDEX IF NOT EXISTS deleted_chat_job_index ON deleted_chat_job (chat_row_id, _id)");
    }

    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[12];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        C54912pU.A0V(A00, A01, "chat_row_id", r4, C54912pU.A0m(A00, A01, r4));
        C54912pU.A0A(A00, A01, "block_size", r4);
        A00.A02 = "singular_message_delete_rows_id";
        AnonymousClass220 r3 = AnonymousClass220.TEXT;
        C54912pU.A0Z(A00, r3, r4);
        C54912pU.A0C(A00, A01, "deleted_message_row_id", r4);
        C54912pU.A0D(A00, A01, "deleted_starred_message_row_id", r4);
        A00.A02 = "deleted_messages_remove_files";
        AnonymousClass220 r2 = AnonymousClass220.BOOLEAN;
        r4[6] = C54912pU.A02(A00, r2);
        C54912pU.A0F(A00, A01, "deleted_categories_message_row_id", r4);
        C54912pU.A0G(A00, A01, "deleted_categories_starred_message_row_id", r4);
        C54912pU.A0H(A00, r2, "deleted_categories_remove_files", r4);
        C54912pU.A0I(A00, r3, "deleted_message_categories", r4);
        C54912pU.A0J(A00, r2, "delete_files_singular_delete", r4);
        r9.A0E("deleted_chat_job", r4);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
