package X;

/* renamed from: X.2xb  reason: invalid class name and case insensitive filesystem */
public class C59852xb {
    public final int A00;

    public static C59852xb A00(int i) {
        if (i <= 7) {
            return new C59852xb(i);
        }
        throw AnonymousClass000.A0G("Initialization state is not recognized. State = ", AnonymousClass001.A0o(), i);
    }

    public String toString() {
        int i = this.A00;
        switch (i) {
            case 0:
                return "failed";
            case 1:
                return "success-restored";
            case 2:
                return "success-created";
            case 3:
                return "failed-jid-mismatch";
            case 4:
                return "failed-on-file-integrity-check";
            case 5:
                return "failed-out-of-space";
            case 6:
                return "failed-msgstore-already-exists";
            case 7:
                return "canceled";
            case 8:
                return "provider-server-prop-not-enabled";
            case 9:
                return "app-signature-mismatch";
            case 10:
                return "incorrect-caller-package-name";
            case 11:
                return "requester-app-version-incorrect";
            case 12:
                return "incorrect-file-mode";
            case 13:
                return "phone-number-mismatch";
            case 14:
                return "msgstore-db-does-not-exist";
            case 15:
                return "failed-to-get-backup-file";
            case 16:
                return "backup-failed-with-generic-error";
            case 17:
                return "backup-failed-out-of-space";
            case 18:
                return "backup-failed-invalid-backup";
            case 19:
                return "success-transfer-db-file";
            case 20:
                return "failed-decryption-key-missing";
            default:
                C18260x0.A0z("unspecified initialization status: ", AnonymousClass001.A0o(), i);
                return String.valueOf(i);
        }
    }

    public C59852xb(int i) {
        this.A00 = i;
    }

    public int A01() {
        return this.A00;
    }
}
