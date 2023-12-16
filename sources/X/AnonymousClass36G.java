package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.36G  reason: invalid class name */
public class AnonymousClass36G {
    public static C51502jv A01(byte[] bArr) {
        if (bArr.length >= 33) {
            byte b = bArr[0] & 255;
            if (b == 5) {
                byte[] bArr2 = new byte[32];
                System.arraycopy(bArr, 1, bArr2, 0, 32);
                return new C51502jv(bArr2, (byte) 5);
            }
            throw new AnonymousClass23X(AnonymousClass000.A0Y("Bad key type: ", AnonymousClass001.A0o(), b));
        }
        throw new AnonymousClass23X("Invalid byte array");
    }

    public static byte[] A08(C48462ew r3, C51502jv r4) {
        if (r3.A00 == 5) {
            return C158317jm.A00().A02(r4.A01, r3.A01);
        }
        throw AnonymousClass0x9.A0i("PublicKey or PrivateKey type is invalid");
    }

    public static C54562ov A02(DeviceJid deviceJid) {
        int A02;
        C626936e.A07(deviceJid, "Provided jid must not be null");
        C626936e.A07(deviceJid.user, "User part of provided jid must not be null");
        String str = deviceJid.user;
        if (deviceJid instanceof C135136kB) {
            A02 = 1;
        } else {
            A02 = C18310x6.A02(deviceJid instanceof C135126kA ? 1 : 0);
        }
        return new C54562ov(str, A02, deviceJid.getDevice());
    }

    public static DeviceJid A04(C54562ov r3) {
        UserJid A00;
        try {
            boolean A1T = AnonymousClass000.A1T(r3.A01);
            String str = r3.A02;
            if (A1T) {
                A00 = AnonymousClass32X.A00(str);
            } else {
                A00 = C383127a.A00(str);
            }
            return DeviceJid.Companion.A01(A00, r3.A00);
        } catch (AnonymousClass24P unused) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "Invalid signal protocol address: ", r3);
            return null;
        }
    }

    public static boolean A07(C51502jv r2, byte[] bArr, byte[] bArr2) {
        if (r2.A00 == 5) {
            return C158317jm.A00().A01(r2.A01, bArr, bArr2);
        }
        throw AnonymousClass0x9.A0i("PublicKey type is invalid");
    }

    public static byte[] A09(C48462ew r2, byte[] bArr) {
        if (r2.A00 == 5) {
            return C158317jm.A00().A03(r2.A01, bArr);
        }
        throw AnonymousClass0x9.A0i("PrivateKey type is invalid");
    }

    public static AnonymousClass2KI A00() {
        C185988uZ r0 = C158317jm.A00().A00;
        byte[] B3i = r0.B3i();
        return new AnonymousClass2KI(new C48462ew(B3i, (byte) 5), new C51502jv(r0.generatePublicKey(B3i), (byte) 5));
    }

    public static C54562ov A03(UserJid userJid) {
        return A02(userJid.getPrimaryDevice());
    }

    public static List A05(Collection collection) {
        ArrayList A0u = C18300x5.A0u(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid A04 = A04((C54562ov) it.next());
            if (A04 != null) {
                A0u.add(A04);
            }
        }
        return A0u;
    }

    public static List A06(Collection collection) {
        ArrayList A0u = C18300x5.A0u(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0u.add(A02(AnonymousClass0x7.A0R(it)));
        }
        return A0u;
    }
}
