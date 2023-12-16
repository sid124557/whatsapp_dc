package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Map;

/* renamed from: X.4fc  reason: invalid class name and case insensitive filesystem */
public final class C89994fc extends AnonymousClass5UI {
    public long A00;
    public final AnonymousClass59x A01;
    public final Map A02;

    public C89994fc(AnonymousClass59x r2, C32251pv r3, Map map) {
        super((UserFlowLogger) null, r3);
        this.A01 = r2;
        this.A02 = map;
    }

    public final long A06(AnonymousClass32L r5) {
        int hashCode = r5.A01.hashCode();
        if (this.A01 != null) {
            return ((long) 22421767) | (((long) hashCode) << 32);
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            return userFlowLogger.generateFlowId(22421767, hashCode);
        }
        throw C18290x4.A0Y();
    }
}
