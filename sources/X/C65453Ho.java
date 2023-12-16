package X;

/* renamed from: X.3Ho  reason: invalid class name and case insensitive filesystem */
public class C65453Ho implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("labels_index", "CREATE UNIQUE INDEX IF NOT EXISTS labels_index ON labels (label_name)");
        r5.A0B("sort_id", "CREATE INDEX IF NOT EXISTS labels_index ON labels (sort_id)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0t = C54912pU.A0t(A00);
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        A00.A00 = r3;
        boolean A0q = C54912pU.A0q(A00, A0t);
        A00.A02 = "label_name";
        C54912pU.A0b(A00, AnonymousClass220.TEXT, A0t, 1);
        C54912pU.A0A(A00, r3, "predefined_id", A0t);
        C54912pU.A0B(A00, r3, "color_id", A0t);
        A0t[4] = C54912pU.A05(A00, r3, "sort_id", A0q ? 1 : 0, true);
        r8.A0E("labels", A0t);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
