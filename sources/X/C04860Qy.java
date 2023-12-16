package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: X.0Qy  reason: invalid class name and case insensitive filesystem */
public class C04860Qy {
    public final C54292oU A00;

    public void A08(byte[] bArr) {
        C626936e.A0B(AnonymousClass000.A1U(bArr.length, 32));
        C627236i.A0B(A04(), bArr);
    }

    public File A01() {
        return AnonymousClass002.A0A(this.A00.A06().getFilesDir(), "password_data.key");
    }

    public File A02() {
        return AnonymousClass002.A0A(this.A00.A06().getFilesDir(), "password_hash.key");
    }

    public File A03() {
        return AnonymousClass002.A0A(this.A00.A06().getFilesDir(), "password_hash_salt.key");
    }

    public File A04() {
        return AnonymousClass002.A0A(this.A00.A06().getFilesDir(), "encrypted_backup.key");
    }

    public void A07(C03880Lx r7) {
        ObjectOutputStream objectOutputStream;
        byte[] bArr = r7.A01;
        boolean z = false;
        C626936e.A0B(AnonymousClass000.A1U(bArr.length, 64));
        byte[] bArr2 = r7.A02;
        if (bArr2.length == 64) {
            z = true;
        }
        C626936e.A0B(z);
        FileOutputStream fileOutputStream = new FileOutputStream(A01());
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeInt(1);
            objectOutputStream.writeObject(bArr);
            objectOutputStream.writeObject(bArr2);
            objectOutputStream.writeInt(r7.A00);
            objectOutputStream.close();
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C04860Qy(C54292oU r1) {
        this.A00 = r1;
    }

    public C03880Lx A00() {
        ObjectInputStream objectInputStream;
        byte[] bArr;
        byte[] bArr2;
        File A01 = A01();
        if (!A01.exists()) {
            byte[] A0A = A0A();
            byte[] A0B = A0B();
            if (A0A == null || A0B == null) {
                return null;
            }
            return new C03880Lx(A0A, A0B, 100000);
        }
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(A01));
            if (1 == objectInputStream.readInt() && (bArr = (byte[]) objectInputStream.readObject()) != null && 64 == bArr.length && (bArr2 = (byte[]) objectInputStream.readObject()) != null && 64 == bArr2.length) {
                C03880Lx r0 = new C03880Lx(bArr, bArr2, objectInputStream.readInt());
                objectInputStream.close();
                return r0;
            }
            objectInputStream.close();
            return null;
        } catch (IOException | ClassNotFoundException e) {
            Log.e("encb/EncBackupLocalStorage/failed to load password data", e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A05() {
        C627536m.A0O(A02());
        C627536m.A0O(A03());
        C627536m.A0O(A01());
    }

    public void A06() {
        C627536m.A0O(A04());
    }

    public byte[] A09() {
        byte[] A0K = C627236i.A0K(A04());
        if (A0K == null) {
            return null;
        }
        C626936e.A0B(AnonymousClass000.A1U(A0K.length, 32));
        return A0K;
    }

    public final byte[] A0A() {
        byte[] A0K = C627236i.A0K(A02());
        if (A0K == null) {
            return null;
        }
        C626936e.A0B(AnonymousClass000.A1U(A0K.length, 64));
        return A0K;
    }

    public final byte[] A0B() {
        byte[] A0K = C627236i.A0K(A03());
        if (A0K == null) {
            return null;
        }
        C626936e.A0B(AnonymousClass000.A1U(A0K.length, 64));
        return A0K;
    }
}
