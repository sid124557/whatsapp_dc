package X;

import java.io.IOException;

/* renamed from: X.6u5  reason: invalid class name */
public class AnonymousClass6u5 extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;
    public C187928y2 unfinishedMessage = null;
    public boolean wasThrownFromInputStream;

    public static AnonymousClass6u5 A00() {
        return new AnonymousClass6u5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static AnonymousClass6u5 A01() {
        return new AnonymousClass6u5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static AnonymousClass6u5 A02(String str) {
        return new AnonymousClass6u5(str);
    }

    public AnonymousClass6u5(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public AnonymousClass6u5(String str) {
        super(str);
    }
}
