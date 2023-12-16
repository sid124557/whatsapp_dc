package X;

/* renamed from: X.6ul  reason: invalid class name and case insensitive filesystem */
public enum C140936ul {
    A00("KEY_CODE_EMPTY", "Your organization key is empty. Please provide a organization key."),
    A01("KEY_CODE_INVALID", "Your organization key is invalid. Please contact your system administrator or UPI support team."),
    A02("PARSER_MISCONFIG", "XML Parser configuration error.Keys.xml may not be formatted correctly."),
    A03("KEYS_NOT_VALID", "Keys are not valid. Please contact your system administrator UPI support team"),
    A04("UNKNOWN_ERROR", "Unknown error occurred."),
    A05("TRUST_NOT_VALID", "Trust is not valid");
    
    public final int i;
    public final String j;

    /* access modifiers changed from: public */
    static {
        A00 = new C140936ul(0, 1001, "KEY_CODE_EMPTY", "Your organization key is empty. Please provide a organization key.");
        A01 = new C140936ul(1, 1002, "KEY_CODE_INVALID", "Your organization key is invalid. Please contact your system administrator or UPI support team.");
        new C140936ul(2, 1003, "PUBLICKEY_NOT_FOUND", "Public key file not found please contact your system administrator UPI support team");
        A02 = new C140936ul(3, 1004, "PARSER_MISCONFIG", "XML Parser configuration error.Keys.xml may not be formatted correctly.");
        new C140936ul(4, 1005, "XML_PATH_ERROR", "XML File is not found or cannot be read.");
        A03 = new C140936ul(5, 1006, "KEYS_NOT_VALID", "Keys are not valid. Please contact your system administrator UPI support team");
        A04 = new C140936ul(6, 1007, "UNKNOWN_ERROR", "Unknown error occurred.");
        A05 = new C140936ul(7, 1008, "TRUST_NOT_VALID", "Trust is not valid");
    }

    /* access modifiers changed from: public */
    C140936ul(String str, String str2) {
        this.i = r2;
        this.j = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.i);
        A0o.append(": ");
        return AnonymousClass000.A0X(this.j, A0o);
    }
}
