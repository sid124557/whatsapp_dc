package X;

import com.whatsapp.util.Log;

/* renamed from: X.5N5  reason: invalid class name */
public class AnonymousClass5N5 {
    public final AnonymousClass2OK A00;
    public final C186568vZ A01;

    public final void A00(String str, String str2) {
        if (!this.A00.A01.A0X(6076)) {
            Log.w("emitFailure suppressed");
            return;
        }
        C186568vZ r3 = this.A01;
        r3.markerStart(494345136);
        r3.markerAnnotate(494345136, "is_success", false);
        r3.markerAnnotate(494345136, "failure_type", str);
        if (str2 != null) {
            r3.markerAnnotate(494345136, "failure_payload", str2);
        }
        r3.markerEnd(494345136, 2);
    }

    public AnonymousClass5N5(AnonymousClass2OK r1, C186568vZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
