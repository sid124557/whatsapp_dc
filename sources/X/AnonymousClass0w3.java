package X;

import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.0w3  reason: invalid class name */
public class AnonymousClass0w3 extends C04710Qi {
    public Object A00;
    public final int A01;

    public AnonymousClass0w3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static boolean A00(AnonymousClass0w3 r1) {
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) r1.A00;
        if (!restoreFromBackupActivity.A0v.get()) {
            return restoreFromBackupActivity.A0H.A0L.A06();
        }
        Log.i("restore>RestoreFromBackupActivity/one-time-setup-task/cancelled");
        return false;
    }

    public boolean A06() {
        switch (this.A01) {
            case 0:
                return ((C10240hc) this.A00).A0q();
            case 1:
                C06260Ww r1 = (C06260Ww) this.A00;
                C10240hc A002 = r1.A08;
                if (!A002.A0g()) {
                    return false;
                }
                AnonymousClass0Y7 A03 = r1.A03();
                AnonymousClass0QJ r12 = r1.A0A;
                long j = r12.A06.get();
                long j2 = r12.A07.get();
                if (!C10240hc.A04(A002, A03, r12.A04.get(), r12.A05.get(), j, j2) || !A002.A0g()) {
                    return false;
                }
                return true;
            case 2:
                C06260Ww r0 = (C06260Ww) this.A00;
                C10240hc A003 = r0.A08;
                AnonymousClass0Y7 A032 = r0.A03();
                AnonymousClass0QJ r13 = r0.A0A;
                long j3 = r13.A06.get();
                long j4 = r13.A07.get();
                return C10240hc.A04(A003, A032, r13.A04.get(), r13.A05.get(), j3, j4);
            default:
                return A00(this);
        }
    }

    public String toString() {
        switch (this.A01) {
            case 0:
                return "network-condition";
            case 1:
                return "media-restore-condition";
            case 2:
                return "suitable-condition";
            default:
                return "one-time-setup-condition";
        }
    }
}
