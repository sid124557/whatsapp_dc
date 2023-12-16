package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* renamed from: X.2fN  reason: invalid class name and case insensitive filesystem */
public class C48732fN {
    public final MultiBufferLogger A00;
    public final Random A01 = AnonymousClass0x9.A1C();

    public Long A00(int i) {
        C158957kr r0;
        if (C159837mX.A00 != 2 || (r0 = C158957kr.A0A) == null || r0.A06.get() == 0) {
            return null;
        }
        long nextInt = (((long) this.A01.nextInt(Integer.MAX_VALUE)) << 16) & 281474976645120L;
        this.A00.writeStandardEntry(7, 46, 0, 0, i, 0, nextInt | 562949953421312L);
        return Long.valueOf(nextInt);
    }

    public void A01(Long l, Map map, int i) {
        C158957kr r0;
        if (C159837mX.A00 == 2 && (r0 = C158957kr.A0A) != null && r0.A06.get() != 0) {
            long longValue = l.longValue() | ((long) 2);
            int i2 = i;
            if (!map.isEmpty()) {
                Iterator A0q = AnonymousClass000.A0q(map);
                int i3 = 0;
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    if (A0w.getKey() != null && !C18310x6.A0q(A0w).isEmpty() && A0w.getValue() != null && !AnonymousClass0x9.A12(A0w).isEmpty()) {
                        i3 += C18310x6.A0q(A0w).length() + C18310x6.A0q(A0w).length();
                        if (((long) i3) > 2048) {
                            Locale locale = Locale.US;
                            Object[] A0M = AnonymousClass002.A0M();
                            AnonymousClass000.A1Q(A0M, 0, 2048);
                            AnonymousClass000.A1P(A0M, i3, 1);
                            throw AnonymousClass001.A0c(String.format(locale, "Maximum Length(%d) of Profilo annotations exceeded %d", A0M));
                        } else if ((C126216Mx.A00 & TraceEvents.sProviders) != 0) {
                            String A0q2 = C18310x6.A0q(A0w);
                            MultiBufferLogger multiBufferLogger = this.A00;
                            int writeStandardEntry = multiBufferLogger.writeStandardEntry(7, 59, 0, 0, i2, 0, longValue);
                            if (A0q2 != null) {
                                writeStandardEntry = multiBufferLogger.writeBytesEntry(1, 56, writeStandardEntry, A0q2);
                            }
                            multiBufferLogger.writeBytesEntry(1, 57, writeStandardEntry, AnonymousClass0x9.A12(A0w));
                        }
                    }
                }
            }
            this.A00.writeStandardEntry(7, 47, 0, 0, i2, 0, longValue);
        }
    }

    public C48732fN(MultiBufferLogger multiBufferLogger) {
        this.A00 = multiBufferLogger;
    }
}
