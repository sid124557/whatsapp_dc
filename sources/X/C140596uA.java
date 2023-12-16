package X;

import java.io.IOException;

/* renamed from: X.6uA  reason: invalid class name and case insensitive filesystem */
public class C140596uA extends IOException {
    public final C157677ih dataSpec;
    public final int type;

    public C140596uA(C157677ih r2, IOException iOException, String str) {
        super(str, iOException);
        this.dataSpec = r2;
        this.type = 1;
    }

    public C140596uA(C157677ih r1, IOException iOException, int i) {
        super(iOException);
        this.dataSpec = r1;
        this.type = i;
    }

    public C140596uA(C157677ih r2, String str) {
        super(str);
        this.dataSpec = r2;
        this.type = 1;
    }
}
