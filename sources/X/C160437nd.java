package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.7nd  reason: invalid class name and case insensitive filesystem */
public class C160437nd {
    public static final Charset A05 = Charset.forName(DefaultCrypto.UTF_8);
    public final String A00;
    public final ByteBuffer A01;
    public final AtomicReferenceArray A02;
    public final AtomicReferenceArray A03;
    public final AnonymousClass7K9[] A04;

    public AnonymousClass7TT A00(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A02;
        AnonymousClass7TT r4 = (AnonymousClass7TT) atomicReferenceArray.get(i);
        if (r4 == null) {
            int i2 = this.A04[0].A02 + (i * 16);
            ByteBuffer byteBuffer = this.A01;
            int i3 = byteBuffer.getInt(i2);
            int i4 = byteBuffer.getInt(i2 + 4);
            short s = byteBuffer.getShort(i2 + 8);
            byteBuffer.getShort(i2 + 10);
            r4 = new AnonymousClass7TT(this, i3, i4, s);
            if (!AnonymousClass71W.A00((Object) null, r4, atomicReferenceArray, i)) {
                return (AnonymousClass7TT) atomicReferenceArray.get(i);
            }
        }
        return r4;
    }

    public Object A01(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A03;
        Object obj = atomicReferenceArray.get(i);
        if (obj == null) {
            int i2 = this.A04[1].A02 + (i * 16);
            ByteBuffer byteBuffer = this.A01;
            int i3 = byteBuffer.getInt(i2);
            int i4 = byteBuffer.getInt(i2 + 4);
            byteBuffer.getInt(i2 + 8);
            byteBuffer.getInt();
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.position(i3);
            duplicate.limit(i3 + i4);
            byte[] bArr = new byte[duplicate.remaining()];
            duplicate.get(bArr);
            obj = new String(bArr, A05);
            if (!AnonymousClass71W.A00((Object) null, obj, atomicReferenceArray, i)) {
                return atomicReferenceArray.get(i);
            }
        }
        return obj;
    }

    public C160437nd(String str, ByteBuffer byteBuffer, AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2, AnonymousClass7K9[] r5) {
        this.A01 = byteBuffer;
        this.A04 = r5;
        this.A00 = str;
        this.A02 = atomicReferenceArray;
        this.A03 = atomicReferenceArray2;
    }
}
