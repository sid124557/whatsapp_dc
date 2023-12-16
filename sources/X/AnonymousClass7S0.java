package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.7S0  reason: invalid class name */
public class AnonymousClass7S0 {
    public final C177748gO A00;
    public final C183718qV A01;

    public AnonymousClass7S0(C177748gO r1, C183718qV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public long A00(AnonymousClass7V7 r10) {
        long currentTimeMillis = System.currentTimeMillis();
        long now = this.A01.now();
        long elapsedRealtimeNanos = r10.A00.getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos != 0 && Long.valueOf(elapsedRealtimeNanos) != null) {
            return (((now * SearchActionVerificationClientService.MS_TO_NS) - elapsedRealtimeNanos) + 500000) / SearchActionVerificationClientService.MS_TO_NS;
        }
        if (r10.A00() != null) {
            return currentTimeMillis - r10.A00().longValue();
        }
        return Long.MIN_VALUE;
    }
}
