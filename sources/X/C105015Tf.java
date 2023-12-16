package X;

import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.5Tf  reason: invalid class name and case insensitive filesystem */
public class C105015Tf {
    public final int A00;
    public final SparseIntArray A01 = new SparseIntArray();
    public final SparseIntArray A02 = new SparseIntArray();
    public final MappedByteBuffer A03;
    public final Charset A04;

    public final int A00(int i) {
        MappedByteBuffer mappedByteBuffer = this.A03;
        return ((mappedByteBuffer.get(i + 1) & 255) << 8) | (mappedByteBuffer.get(i) & 255);
    }

    public final int A01(int i) {
        MappedByteBuffer mappedByteBuffer = this.A03;
        return ((mappedByteBuffer.get(i + 3) & 255) << 24) | (mappedByteBuffer.get(i) & 255) | ((mappedByteBuffer.get(i + 1) & 255) << 8) | ((mappedByteBuffer.get(i + 2) & 255) << 16);
    }

    public C105015Tf(MappedByteBuffer mappedByteBuffer, List list) {
        int i;
        int i2;
        this.A03 = mappedByteBuffer;
        int A002 = A00(0);
        int A012 = A01(2);
        byte b = mappedByteBuffer.get(6);
        Charset[] charsetArr = AnonymousClass799.A02;
        if (b >= charsetArr.length && C1459477x.A00.get() != null) {
            Log.e("MMappedStringPack: unrecognized encoding");
        }
        this.A04 = charsetArr[b];
        this.A00 = A01(7);
        if (!list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            int i3 = 11;
            int i4 = 0;
            for (int i5 = 0; i5 < A002; i5++) {
                MappedByteBuffer mappedByteBuffer2 = this.A03;
                mappedByteBuffer2.position(i3);
                int position = mappedByteBuffer2.position();
                if (mappedByteBuffer2.get(position + 2) == 0) {
                    i2 = 2;
                } else {
                    i2 = 7;
                    if (mappedByteBuffer2.get(position + 5) == 0) {
                        i2 = 5;
                    }
                }
                byte[] bArr = new byte[i2];
                mappedByteBuffer2.get(bArr, 0, i2);
                int indexOf = list.indexOf(new String(bArr, 0, i2, AnonymousClass799.A01));
                if (indexOf != -1) {
                    i4++;
                    iArr[indexOf] = i3;
                    if (i4 >= list.size()) {
                        break;
                    }
                }
                i3 += 11;
            }
            for (int i6 = 0; i6 < size; i6++) {
                int i7 = iArr[i6];
                if (i7 != 0) {
                    this.A03.position(i7 + 7);
                    int A013 = A01(this.A03.position()) + A012;
                    int A003 = A00(A013);
                    int i8 = A013 + 2;
                    int A004 = A00(i8);
                    int i9 = i8 + 2;
                    for (int i10 = 0; i10 < A003; i10++) {
                        int i11 = i + 2;
                        this.A02.append(A00(i), i11);
                        i9 = i11 + 6;
                    }
                    for (int i12 = 0; i12 < A004; i12++) {
                        int i13 = i + 2;
                        this.A01.append(A00(i), i13);
                        i = i13 + 1;
                        for (int i14 = 0; i14 < this.A03.get(i13); i14++) {
                            i += 7;
                        }
                    }
                }
            }
        } else if (C1459477x.A00.get() != null) {
            Log.e("MMappedStringPack: parentLocales is empty");
        }
    }
}
