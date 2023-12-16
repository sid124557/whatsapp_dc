package X;

/* renamed from: X.220  reason: invalid class name */
public enum AnonymousClass220 {
    BOOLEAN("BOOLEAN"),
    BLOB("BLOB"),
    DATE("DATE"),
    DATETIME("DATETIME"),
    DOUBLE("DOUBLE"),
    INTEGER("INTEGER"),
    REAL("REAL"),
    STRING("STRING"),
    TEXT("TEXT"),
    LONG("LONG"),
    UNSPECIFIED("");
    
    public final String value;

    public static C59422wt[] A03(C54912pU r2) {
        C59422wt[] r1 = new C59422wt[1];
        r2.A02 = "jid";
        r2.A00 = TEXT;
        return r1;
    }

    public static C59422wt A00(C54912pU r1, String str) {
        r1.A02 = str;
        r1.A00 = BLOB;
        return r1.A0x();
    }

    public static AnonymousClass220 A01(C54912pU r1) {
        r1.A02 = "_id";
        return INTEGER;
    }

    /* access modifiers changed from: public */
    AnonymousClass220(String str) {
        this.value = str;
    }

    public static AnonymousClass220 A02(C54912pU r1) {
        r1.A02 = "message_row_id";
        return INTEGER;
    }
}
