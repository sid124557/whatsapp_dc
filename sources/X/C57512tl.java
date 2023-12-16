package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2tl  reason: invalid class name and case insensitive filesystem */
public final class C57512tl {
    public static final C41852Lv A00(UserJid userJid, UserJid userJid2, JniBridge jniBridge, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str3;
        int length;
        JniBridge jniBridge2 = jniBridge;
        C162457s7.A0J(jniBridge, 0);
        C18260x0.A0Q(str, bArr);
        C162457s7.A0J(userJid, 4);
        C162457s7.A0J(str2, 7);
        int length2 = bArr.length;
        if (length2 != 32) {
            str3 = AnonymousClass000.A0Y("MessageEncUtils/encryptEncMessage: invalid message_secret secretSize=", AnonymousClass001.A0o(), length2);
        } else {
            byte[] A01 = AnonymousClass29O.A01(12);
            byte[] A012 = C57632tx.A01(userJid, userJid2, str2, str, bArr);
            C162457s7.A0D(A012);
            byte[] WCIAPIGcmAesCreateEncryptedCiphertext = jniBridge2.WCIAPIGcmAesCreateEncryptedCiphertext(A012, A01, bArr3, bArr2, 16);
            if (WCIAPIGcmAesCreateEncryptedCiphertext != null && (length = WCIAPIGcmAesCreateEncryptedCiphertext.length) != 0) {
                return new C41852Lv(C172548Lq.A02(A01, 0, 12), C172548Lq.A02(WCIAPIGcmAesCreateEncryptedCiphertext, 0, length));
            }
            str3 = "MessageEncUtils/encryptEncMessage encryption values are invalid";
        }
        Log.e(str3);
        return null;
    }

    public static final byte[] A01(UserJid userJid, UserJid userJid2, JniBridge jniBridge, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        StringBuilder A0o;
        String str3;
        C162457s7.A0J(jniBridge, 3);
        C162457s7.A0J(str2, 8);
        int length = bArr4.length;
        if (length != 32) {
            A0o = AnonymousClass001.A0o();
            str3 = "MessageEncUtils/decryptEncMessage: invalid message_secret secretSize=";
        } else {
            byte[] bArr5 = bArr;
            length = bArr.length;
            if (length != 12) {
                A0o = AnonymousClass001.A0o();
                str3 = "MessageEncUtils/decryptEncMessage: invalid encIv ivSize=";
            } else {
                byte[] A01 = C57632tx.A01(userJid, userJid2, str2, str, bArr4);
                C162457s7.A0D(A01);
                return (byte[]) JniBridge.jvidispatchOIOOOOO(3, (long) 16, AnonymousClass0x9.A0r(jniBridge), A01, bArr5, bArr2, bArr3);
            }
        }
        C18260x0.A0x(str3, A0o, length);
        return null;
    }
}
