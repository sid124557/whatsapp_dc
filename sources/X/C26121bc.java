package X;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.1bc  reason: invalid class name and case insensitive filesystem */
public class C26121bc extends C56392ru {
    public final C59612xC A00 = new C59612xC();
    public final List A01 = AnonymousClass001.A0s();

    public C26121bc(C380625j r9, AnonymousClass2SH r10, C26071bX r11, RandomAccessFile randomAccessFile, int i) {
        super(r9, r10, r11, randomAccessFile, i, 2);
    }

    public void A04(List list) {
        List<Number> list2;
        List list3 = list;
        int size = list3.size();
        C59612xC r7 = this.A00;
        LinkedHashSet linkedHashSet = r7.A03;
        if (size == linkedHashSet.size()) {
            list2 = this.A01;
            super.A04(list2);
        } else {
            HashSet A0p = C18320x8.A0p(list3);
            Iterator it = linkedHashSet.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (AnonymousClass0x7.A1U(list3, i)) {
                    A0p.add(next);
                }
                i++;
            }
            list2 = this.A01;
            for (Number number : list2) {
                int intValue = number.intValue();
                if (intValue != this.A04.A01) {
                    C56132rT A012 = A01(intValue);
                    C613230f r12 = A012.A05;
                    ByteBuffer byteBuffer = r12.A05;
                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    asReadOnlyBuffer.flip();
                    int limit = asReadOnlyBuffer.limit();
                    asReadOnlyBuffer.position(C59672xI.A06.length);
                    try {
                        String str = null;
                        long j = 0;
                        for (int position = asReadOnlyBuffer.position(); position < limit; position = asReadOnlyBuffer.position()) {
                            AnonymousClass2O5 A03 = C625335l.A03(asReadOnlyBuffer);
                            int i2 = A03.A01;
                            if (i2 == 0) {
                                int i3 = A03.A00;
                                if (i3 == 6005) {
                                    str = (String) A03.A02;
                                } else if (i3 == 47) {
                                    long A05 = (long) AnonymousClass0x7.A05(A03.A02);
                                    if (A05 > j) {
                                        j = A05;
                                    }
                                }
                            } else if (i2 == 1 && A0p.contains(str)) {
                                r12.A01 = Math.min(r12.A01, position);
                                int position2 = byteBuffer.position();
                                byteBuffer.position(position);
                                byteBuffer.put((byte) 4);
                                byteBuffer.position(position2);
                            }
                        }
                        A012.A02();
                        if (C18280x3.A07() - j > 604800) {
                            super.A04(Collections.singletonList(number));
                        }
                    } catch (Throwable th) {
                        C18260x0.A1O(AnonymousClass001.A0o(), "privateStatseventbuffermanager/cleanbuffer unexpected errors ", th);
                        super.A04(Collections.singletonList(number));
                    }
                } else {
                    throw AnonymousClass001.A0e("Trying to compact the current buffer");
                }
            }
        }
        r7.A01 = new byte[0];
        r7.A00 = 0;
        linkedHashSet.clear();
        r7.A02.clear();
        list2.clear();
    }
}
