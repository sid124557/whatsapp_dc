package X;

/* renamed from: X.0A2  reason: invalid class name */
public final class AnonymousClass0A2 extends AnonymousClass0NF {
    public static final AnonymousClass0A2 A00 = new AnonymousClass0A2();

    public AnonymousClass0A2() {
        super(6, 7);
    }

    public void A00(C17430vW r2) {
        C162457s7.A0J(r2, 0);
        r2.B2q("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
