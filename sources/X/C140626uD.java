package X;

import java.io.IOException;

/* renamed from: X.6uD  reason: invalid class name and case insensitive filesystem */
public class C140626uD extends IOException {
    public boolean contentIsMalformed;
    public int dataType;

    public C140626uD(String str, Throwable th, boolean z) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = 1;
    }

    public static C140626uD A00(String str) {
        return new C140626uD(str);
    }

    @Deprecated
    public C140626uD() {
    }

    @Deprecated
    public C140626uD(String str) {
        super(str);
    }

    @Deprecated
    public C140626uD(String str, Throwable th) {
        super(str, th);
    }

    @Deprecated
    public C140626uD(Throwable th) {
        super(th);
    }
}
