package X;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

/* renamed from: X.9La  reason: invalid class name and case insensitive filesystem */
public final class C192649La {
    public static String A00(C193559Pc r10, String str) {
        if (TextUtils.isEmpty(str) || r10 == null) {
            return null;
        }
        byte[] bArr = new byte[24];
        new SecureRandom().nextBytes(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(1);
        byte[] array = allocate.array();
        byte[] bytes = "cd7962b7".getBytes();
        ByteBuffer allocate2 = ByteBuffer.allocate(4);
        allocate2.putInt(r10.A02);
        byte[] array2 = allocate2.array();
        ByteBuffer allocate3 = ByteBuffer.allocate(8);
        allocate3.putLong(r10.A03);
        return Base64.encodeToString(AnonymousClass36A.A06(AnonymousClass36A.A06(bytes, allocate3.array(), array2, array, r10.A01, bArr), C159457lr.A02(C161227pF.A00(r10.A04, r10.A00), bArr, str.getBytes())), 0);
    }
}
