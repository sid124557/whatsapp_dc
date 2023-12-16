package X;

import java.util.Map;

/* renamed from: X.1Qq  reason: invalid class name and case insensitive filesystem */
public class C22931Qq extends C55692ql {
    public final Map A00;

    public C22931Qq(Map map) {
        this.A00 = map;
        if (!map.containsKey(C18290x4.A0Z())) {
            throw AnonymousClass001.A0c("Logging entry-point controller map must contain controller for NULL LoggingEntryPoint type");
        } else if (!map.containsKey(AnonymousClass001.A0f())) {
            throw AnonymousClass001.A0c("Logging entry-point controller map must contain controller for CTWA_ADS LoggingEntryPoint type");
        } else if (!map.containsKey(C18280x3.A0S())) {
            throw AnonymousClass001.A0c("Logging entry-point controller map must contain controller for ORGANIC LoggingEntryPoint type");
        }
    }
}
