package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.Writer;
import java.util.Set;

/* renamed from: X.3Tn  reason: invalid class name and case insensitive filesystem */
public final class C68533Tn implements C84864Ea {
    public static final Set A01 = C18280x3.A0h(new String[]{"fbid", "accept_pay", "account", "bank", "card", "mandate", "mandate-update", "merchant", "money", "order", "pay", "transaction", "upi", "wallet"});
    public static final Set A02 = C18280x3.A0h(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "short", "notify", "vpa", "alias", "user-name", "receiver-alias", "receiver-name", "sender-alias", "receiver-vpa", "sender-vpa", "vpa-name", "account-name", "payee-name", "amount", "total-amount", "upi-bank-info", "ifsc-code", "account-ref-id", "balance", "usable-balance", "debit-last-6", "debit-exp-month", "debit-exp-year", "otp", "otp-length", "mpin", "mpin-length", "old-mpin", "new-mpin", "atm-pin", "atm-pin-length", "bank-transaction-id", "currency", "mcc", "ref-url", "qr-code", "signed-qr-code", "seq-no", "verification-data", "jws-token", "token-id", "trusted-device-info", "mandate-no", "original-amount", "mandate-info", "expiry-ts", "value", "offset", "account-number", "token", "order-id", "ref-id", "purpose-code", "is-mpin-set", "pin-format-version", "account-type", "start-ts", "end-ts", "amount-rule", "is-revocable", "mandate-update-info", "mandate-name", "frequency-rule", "sufficient-balance", "note", "hash", "token-type", "keys", "mode", "mmid", "blocked", "valid", "merchant", "verified-merchant", "event-info", "event-dl-info", "note", "parameters"});
    public static final Set A03 = C18280x3.A0h(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_USER, "chat", "message", "transaction", "account", "pay", "bank", "upi", "mandate", "mandate-update", "money", "order", "fds", "screen_data"});
    public static final Set A04 = C18280x3.A0h(new String[]{"body", "message", "enc", "picture", "contact", "pin", "media"});
    public final Writer A00;

    public synchronized void BqF() {
        Writer writer = this.A00;
        writer.write("</stream:stream>");
        writer.flush();
    }

    public synchronized void Bsa(AnonymousClass36K r2) {
        Bsb(r2, 1);
    }

    public synchronized void Bsb(AnonymousClass36K r3, int i) {
        if (r3 == null) {
            this.A00.write(32);
        } else {
            A00(r3);
        }
        if ((i & 1) != 0) {
            this.A00.flush();
        }
    }

    public void A00(AnonymousClass36K r10) {
        String valueOf;
        Set set = A01;
        String str = r10.A00;
        if (set.contains(str)) {
            Writer writer = this.A00;
            writer.write(60);
            writer.write(str);
            writer.write(" DEBUG-ONLY />");
            return;
        }
        Writer writer2 = this.A00;
        writer2.write(60);
        writer2.write(str);
        AnonymousClass39V[] A0u = r10.A0u();
        int i = 0;
        if (A0u != null) {
            for (int i2 = 0; i2 < A0u.length; i2++) {
                writer2.write(32);
                writer2.write(A0u[i2].A02);
                writer2.write("='");
                String str2 = A0u[i2].A02;
                if (!A03.contains(str) || !A02.contains(str2)) {
                    byte b = A0u[i2].A00;
                    AnonymousClass39V r0 = A0u[i2];
                    if (b == 1) {
                        valueOf = String.valueOf(r0.A01);
                    } else {
                        A01(r0.A03.getBytes());
                        writer2.write(39);
                    }
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(A0u[i2].A03.getBytes().length);
                    valueOf = AnonymousClass000.A0X(" bytes", A0o);
                }
                writer2.write(valueOf);
                writer2.write(39);
            }
        }
        byte[] bArr = r10.A01;
        if (bArr == null && r10.A03 == null) {
            writer2.write("/>");
            return;
        }
        if (bArr == null) {
            writer2.write(62);
            while (true) {
                AnonymousClass36K[] r1 = r10.A03;
                if (i >= r1.length) {
                    break;
                }
                A00(r1[i]);
                i++;
            }
        } else {
            writer2.write(62);
            if (A04.contains(str)) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(bArr.length);
                writer2.write(AnonymousClass000.A0X(" bytes", A0o2));
            } else {
                A01(bArr);
            }
        }
        writer2.write("</");
        writer2.write(str);
        writer2.write(62);
    }

    public C68533Tn(Writer writer) {
        this.A00 = writer;
    }

    public final void A01(byte[] bArr) {
        StringBuilder A0o = AnonymousClass001.A0o();
        for (byte b : bArr) {
            if (b < 33 || b == 37 || b > 126) {
                A0o.append('%');
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    A0o.append('0');
                }
                A0o.append(hexString);
            } else {
                A0o.append((char) b);
            }
        }
        this.A00.write(A0o.toString());
    }
}
