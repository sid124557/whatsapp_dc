package X;

/* renamed from: X.09y  reason: invalid class name and case insensitive filesystem */
public final class C012709y extends AnonymousClass0NF {
    public static final C012709y A00 = new C012709y();

    public void A00(C17430vW r2) {
        C162457s7.A0J(r2, 0);
        r2.B2q("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        r2.B2q("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        r2.B2q("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.B2q("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        r2.B2q("DROP TABLE `SystemIdInfo`");
        r2.B2q("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }

    public C012709y() {
        super(15, 16);
    }
}
