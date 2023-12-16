package X;

/* renamed from: X.3IC  reason: invalid class name */
public class AnonymousClass3IC implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_media_interactive_annotation_vertex_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_media_interactive_annotation_vertex_index ON message_media_interactive_annotation_vertex (message_media_interactive_annotation_row_id, sort_order)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0t = C54912pU.A0t(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A00, r2, "message_media_interactive_annotation_row_id", A0t, C54912pU.A0m(A00, r2, A0t) ? 1 : 0);
        A00.A02 = "x";
        AnonymousClass220 r1 = AnonymousClass220.REAL;
        C54912pU.A0Y(A00, r1, A0t);
        C54912pU.A0B(A00, r1, "y", A0t);
        C54912pU.A0C(A00, r2, "sort_order", A0t);
        r7.A0E("message_media_interactive_annotation_vertex", A0t);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "message_media_interactive_annotation", "message_media_interactive_annotation_vertex", "message_media_interactive_annotation_row_id=old._id");
    }
}
