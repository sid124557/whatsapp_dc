package X;

/* renamed from: X.09z  reason: invalid class name and case insensitive filesystem */
public final class C012809z extends AnonymousClass0NF {
    public static final C012809z A00 = new C012809z();

    public C012809z() {
        super(1, 2);
    }

    public void A00(C17430vW r2) {
        C162457s7.A0J(r2, 0);
        r2.B2q("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        r2.B2q("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        r2.B2q("DROP TABLE IF EXISTS alarmInfo");
        r2.B2q("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
