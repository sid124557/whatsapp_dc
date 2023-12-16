package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Re  reason: invalid class name and case insensitive filesystem */
public class C23071Re extends AnonymousClass31D {
    public final C56122rS A00;
    public final C56762sW A01;

    public C23071Re(C56122rS r3, C56762sW r4, AnonymousClass2U4 r5) {
        super(r5, "call_log", Integer.MIN_VALUE);
        this.A01 = r4;
        this.A00 = r3;
    }

    public boolean A0T(C44342Vr r2) {
        String str;
        if (!C72303dV.A00(this.A01.A0G)) {
            str = "CallsMessageStore/convertCallLogToV2/database is not ready";
        } else {
            str = "CallsMessageStore/convertCallLogToV2/no need to migrate, migration completed.";
        }
        Log.i(str);
        return true;
    }
}
