package X;

/* renamed from: X.3Jl  reason: invalid class name and case insensitive filesystem */
public class C65943Jl implements AnonymousClass4ED {
    public void B3j(C41492Kl r4, C56622sI r5) {
        C54912pU A00 = C54912pU.A00();
        A00.A00 = AnonymousClass220.A02(A00);
        A00.A05 = true;
        r5.A0E("suggest_as_you_type", A00.A0x());
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        r6.A0C("suggest_as_you_type_delete_oldest_trigger", "CREATE TRIGGER IF NOT EXISTS suggest_as_you_type_delete_oldest_trigger BEFORE INSERT ON suggest_as_you_type FOR EACH ROW WHEN (SELECT COUNT(*) FROM suggest_as_you_type ) > 2000 BEGIN DELETE FROM suggest_as_you_type WHERE message_row_id = (SELECT MIN(message_row_id) FROM suggest_as_you_type); END;");
        C56622sI.A03(r6, "message", "suggest_as_you_type", "message_row_id=old._id");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
