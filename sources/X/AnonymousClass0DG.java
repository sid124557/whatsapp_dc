package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: X.0DG  reason: invalid class name */
public class AnonymousClass0DG extends AnonymousClass0DI {
    public C56292rk A0F(Context context) {
        byte[] A0L;
        AnonymousClass0WN r1 = this.A02;
        if (!r1.A0G() || (A0L = r1.A0L()) == null) {
            return null;
        }
        return new C132106eh(A0M(), A0L, C06550Ye.A0Q());
    }

    public AnonymousClass22O A0H() {
        return AnonymousClass22O.CRYPT15;
    }

    public C56292rk A0G(InputStream inputStream, boolean z) {
        String str;
        C130756cU A00 = C130756cU.A00(inputStream);
        C130766cV r3 = null;
        if (A00.A0N() == C143046yF.HSM_CONTROLLED) {
            byte[] A07 = A00.A0O().A0M().A07();
            if (A07.length == 0) {
                str = "backup-file-crypt15/read-prefix/failed to read prefix";
            } else {
                byte[] A0L = this.A02.A0L();
                Arrays.toString(A0L);
                if (!z || A0L != null) {
                    if (A00.A0Q()) {
                        r3 = A00.A0M();
                    }
                    return new C132106eh(r3, A0L, A07);
                }
                str = "backup-file-crypt15/read-prefix/no key found";
            }
            Log.e(str);
        }
        return null;
    }

    public AnonymousClass0DG(C56972sr r1, C06430Xr r2, AnonymousClass0WN r3, C56512s6 r4, C48502f0 r5, C48092eK r6, C48772fR r7, C622634i r8, File file, Boolean bool) {
        super(r1, r2, r3, r4, r5, r6, r7, r8, file, bool);
    }
}
