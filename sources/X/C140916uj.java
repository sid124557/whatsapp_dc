package X;

/* renamed from: X.6uj  reason: invalid class name and case insensitive filesystem */
public enum C140916uj {
    X86("x86"),
    ARM("armeabi-v7a"),
    X86_64("x86_64"),
    AARCH64("arm64-v8a");
    
    public final String value;

    /* access modifiers changed from: public */
    static {
        new C140916uj("NOT_SO", 0, "not_so");
        X86 = new C140916uj("X86", 1, "x86");
        ARM = new C140916uj("ARM", 2, "armeabi-v7a");
        X86_64 = new C140916uj("X86_64", 3, "x86_64");
        AARCH64 = new C140916uj("AARCH64", 4, "arm64-v8a");
        new C140916uj("OTHERS", 5, "others");
    }

    public String toString() {
        return this.value;
    }

    /* access modifiers changed from: public */
    C140916uj(String str) {
        this.value = str;
    }
}
